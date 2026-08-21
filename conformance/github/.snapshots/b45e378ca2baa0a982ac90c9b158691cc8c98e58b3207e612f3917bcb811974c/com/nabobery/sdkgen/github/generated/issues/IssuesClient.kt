package com.nabobery.sdkgen.github.generated.issues

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.InlineReposIssuesCommentsGetParameterX399682d1
import com.nabobery.sdkgen.github.generated.InlineReposIssuesCommentsPatchRequestJsonX7f04be98
import com.nabobery.sdkgen.github.generated.InlineReposIssuesCommentsPostRequestJsonX796b40f6
import com.nabobery.sdkgen.github.generated.InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d
import com.nabobery.sdkgen.github.generated.InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc
import com.nabobery.sdkgen.github.generated.InlineReposIssuesLabelsPostRequestJsonX91f10aa5
import com.nabobery.sdkgen.github.generated.InlineReposIssuesLabelsPostRequestJsonX91f10aa5Serializer
import com.nabobery.sdkgen.github.generated.InlineReposIssuesLabelsPutRequestJsonX7d91fbad
import com.nabobery.sdkgen.github.generated.InlineReposIssuesLabelsPutRequestJsonX7d91fbadSerializer
import com.nabobery.sdkgen.github.generated.InlineReposIssuesLockPutRequestJsonXbf8f79bc
import com.nabobery.sdkgen.github.generated.InlineReposLabelsPatchRequestJsonXb7f85b4a
import com.nabobery.sdkgen.github.generated.InlineReposLabelsPostRequestJsonX51d6254d
import com.nabobery.sdkgen.github.generated.InlineReposMilestonesGetParameterX8cb0fde4
import com.nabobery.sdkgen.github.generated.InlineReposMilestonesGetParameterX9f0c461a
import com.nabobery.sdkgen.github.generated.InlineReposMilestonesGetParameterXa5cf1c3b
import com.nabobery.sdkgen.github.generated.InlineReposMilestonesPatchRequestJsonXd61f2cae
import com.nabobery.sdkgen.github.generated.InlineReposMilestonesPostRequestJsonXb3363c6d
import com.nabobery.sdkgen.github.generated.InlineServiceUnavailableResponseJsonX4cf316d5
import com.nabobery.sdkgen.github.generated.InlineSortParameterX37db756f
import com.nabobery.sdkgen.github.generated.IssueComment
import com.nabobery.sdkgen.github.generated.IssueEventForIssue
import com.nabobery.sdkgen.github.generated.IssueFieldValue
import com.nabobery.sdkgen.github.generated.Label
import com.nabobery.sdkgen.github.generated.Milestone
import com.nabobery.sdkgen.github.generated.ScimError
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.SimpleUser
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
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.nullable

internal object IssuesCodecs {
  internal const val ISSUESADDISSUEFIELDVALUES_REQUEST_CODEC_ID: String =
      "issues/add-issue-field-values.request"

  private val issuesAddIssueFieldValuesRequestCodec:
      MediaTypeCodec<InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d> =
      KotlinxSerializationCodec(ISSUESADDISSUEFIELDVALUES_REQUEST_CODEC_ID, InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d.Serializer, SdkJson)

  internal const val ISSUESADDISSUEFIELDVALUES_RESPONSE_CODEC_ID: String =
      "issues/add-issue-field-values.response"

  private val issuesAddIssueFieldValuesResponseCodec: MediaTypeCodec<List<IssueFieldValue>> =
      KotlinxSerializationCodec(ISSUESADDISSUEFIELDVALUES_RESPONSE_CODEC_ID, ListSerializer(IssueFieldValue.Serializer), SdkJson)

  private val issuesAddIssueFieldValuesResponseCodecAlternative0Codec:
      MediaTypeCodec<List<IssueFieldValue>> =
      KotlinxSerializationCodec("issues/add-issue-field-values.response.alternative0", ListSerializer(IssueFieldValue.Serializer), SdkJson)

  internal val issuesAddIssueFieldValuesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<IssueFieldValue>> =
      MediaTypeCodecRegistry.of(issuesAddIssueFieldValuesResponseCodecAlternative0Codec)

  private val issuesAddIssueFieldValuesResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/add-issue-field-values.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesAddIssueFieldValuesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesAddIssueFieldValuesResponseCodecAlternative1Codec)

  private val issuesAddIssueFieldValuesResponseCodecAlternative2Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("issues/add-issue-field-values.response.alternative2", ScimError.Serializer, SdkJson)

  internal val issuesAddIssueFieldValuesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(issuesAddIssueFieldValuesResponseCodecAlternative2Codec)

  private val issuesAddIssueFieldValuesResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/add-issue-field-values.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesAddIssueFieldValuesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesAddIssueFieldValuesResponseCodecAlternative3Codec)

  private val issuesAddIssueFieldValuesResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/add-issue-field-values.response.alternative4", BasicError.Serializer, SdkJson)

  internal val issuesAddIssueFieldValuesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesAddIssueFieldValuesResponseCodecAlternative4Codec)

  private val issuesAddIssueFieldValuesResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/add-issue-field-values.response.alternative5", ValidationError.Serializer, SdkJson)

  internal val issuesAddIssueFieldValuesResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(issuesAddIssueFieldValuesResponseCodecAlternative5Codec)

  private val issuesAddIssueFieldValuesResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("issues/add-issue-field-values.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val issuesAddIssueFieldValuesResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(issuesAddIssueFieldValuesResponseCodecAlternative6Codec)

  internal val issuesAddIssueFieldValuesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d> =
      MediaTypeCodecRegistry.of(issuesAddIssueFieldValuesRequestCodec)

  internal val issuesAddIssueFieldValuesResponseCodecRegistry:
      MediaTypeCodecRegistry<List<IssueFieldValue>> =
      MediaTypeCodecRegistry.of(issuesAddIssueFieldValuesResponseCodec)

  internal const val ISSUESADDLABELS_REQUEST_CODEC_ID: String = "issues/add-labels.request"

  private val issuesAddLabelsRequestCodec:
      MediaTypeCodec<InlineReposIssuesLabelsPostRequestJsonX91f10aa5?> =
      KotlinxSerializationCodec(ISSUESADDLABELS_REQUEST_CODEC_ID, InlineReposIssuesLabelsPostRequestJsonX91f10aa5Serializer.nullable, SdkJson)

  internal const val ISSUESADDLABELS_RESPONSE_CODEC_ID: String = "issues/add-labels.response"

  private val issuesAddLabelsResponseCodec: MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec(ISSUESADDLABELS_RESPONSE_CODEC_ID, ListSerializer(Label.Serializer), SdkJson)

  private val issuesAddLabelsResponseCodecAlternative0Codec: MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec("issues/add-labels.response.alternative0", ListSerializer(Label.Serializer), SdkJson)

  internal val issuesAddLabelsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<List<Label>>
      = MediaTypeCodecRegistry.of(issuesAddLabelsResponseCodecAlternative0Codec)

  private val issuesAddLabelsResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/add-labels.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesAddLabelsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesAddLabelsResponseCodecAlternative1Codec)

  private val issuesAddLabelsResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/add-labels.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesAddLabelsResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesAddLabelsResponseCodecAlternative2Codec)

  private val issuesAddLabelsResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/add-labels.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesAddLabelsResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesAddLabelsResponseCodecAlternative3Codec)

  private val issuesAddLabelsResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/add-labels.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val issuesAddLabelsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(issuesAddLabelsResponseCodecAlternative4Codec)

  internal val issuesAddLabelsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposIssuesLabelsPostRequestJsonX91f10aa5?> =
      MediaTypeCodecRegistry.of(issuesAddLabelsRequestCodec)

  internal val issuesAddLabelsResponseCodecRegistry: MediaTypeCodecRegistry<List<Label>> =
      MediaTypeCodecRegistry.of(issuesAddLabelsResponseCodec)

  private val issuesCheckUserCanBeAssignedResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("issues/check-user-can-be-assigned.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesCheckUserCanBeAssignedResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesCheckUserCanBeAssignedResponseCodecAlternative1Codec)

  internal val issuesCheckUserCanBeAssignedRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesCheckUserCanBeAssignedResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val issuesCheckUserCanBeAssignedToIssueResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/check-user-can-be-assigned-to-issue.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesCheckUserCanBeAssignedToIssueResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesCheckUserCanBeAssignedToIssueResponseCodecAlternative1Codec)

  internal val issuesCheckUserCanBeAssignedToIssueRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal val issuesCheckUserCanBeAssignedToIssueResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val ISSUESCREATECOMMENT_REQUEST_CODEC_ID: String = "issues/create-comment.request"

  private val issuesCreateCommentRequestCodec:
      MediaTypeCodec<InlineReposIssuesCommentsPostRequestJsonX796b40f6> =
      KotlinxSerializationCodec(ISSUESCREATECOMMENT_REQUEST_CODEC_ID, InlineReposIssuesCommentsPostRequestJsonX796b40f6.Serializer, SdkJson)

  internal const val ISSUESCREATECOMMENT_RESPONSE_CODEC_ID: String =
      "issues/create-comment.response"

  private val issuesCreateCommentResponseCodec: MediaTypeCodec<IssueComment> =
      KotlinxSerializationCodec(ISSUESCREATECOMMENT_RESPONSE_CODEC_ID, IssueComment.Serializer, SdkJson)

  private val issuesCreateCommentResponseCodecAlternative0Codec: MediaTypeCodec<IssueComment> =
      KotlinxSerializationCodec("issues/create-comment.response.alternative0", IssueComment.Serializer, SdkJson)

  internal val issuesCreateCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssueComment> =
      MediaTypeCodecRegistry.of(issuesCreateCommentResponseCodecAlternative0Codec)

  private val issuesCreateCommentResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/create-comment.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesCreateCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesCreateCommentResponseCodecAlternative1Codec)

  private val issuesCreateCommentResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/create-comment.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesCreateCommentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesCreateCommentResponseCodecAlternative2Codec)

  private val issuesCreateCommentResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/create-comment.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesCreateCommentResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesCreateCommentResponseCodecAlternative3Codec)

  private val issuesCreateCommentResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/create-comment.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val issuesCreateCommentResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(issuesCreateCommentResponseCodecAlternative4Codec)

  internal val issuesCreateCommentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposIssuesCommentsPostRequestJsonX796b40f6> =
      MediaTypeCodecRegistry.of(issuesCreateCommentRequestCodec)

  internal val issuesCreateCommentResponseCodecRegistry: MediaTypeCodecRegistry<IssueComment> =
      MediaTypeCodecRegistry.of(issuesCreateCommentResponseCodec)

  internal const val ISSUESCREATELABEL_REQUEST_CODEC_ID: String = "issues/create-label.request"

  private val issuesCreateLabelRequestCodec:
      MediaTypeCodec<InlineReposLabelsPostRequestJsonX51d6254d> =
      KotlinxSerializationCodec(ISSUESCREATELABEL_REQUEST_CODEC_ID, InlineReposLabelsPostRequestJsonX51d6254d.Serializer, SdkJson)

  internal const val ISSUESCREATELABEL_RESPONSE_CODEC_ID: String = "issues/create-label.response"

  private val issuesCreateLabelResponseCodec: MediaTypeCodec<Label> =
      KotlinxSerializationCodec(ISSUESCREATELABEL_RESPONSE_CODEC_ID, Label.Serializer, SdkJson)

  private val issuesCreateLabelResponseCodecAlternative0Codec: MediaTypeCodec<Label> =
      KotlinxSerializationCodec("issues/create-label.response.alternative0", Label.Serializer, SdkJson)

  internal val issuesCreateLabelResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Label> =
      MediaTypeCodecRegistry.of(issuesCreateLabelResponseCodecAlternative0Codec)

  private val issuesCreateLabelResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/create-label.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesCreateLabelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesCreateLabelResponseCodecAlternative1Codec)

  private val issuesCreateLabelResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/create-label.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val issuesCreateLabelResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(issuesCreateLabelResponseCodecAlternative2Codec)

  internal val issuesCreateLabelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposLabelsPostRequestJsonX51d6254d> =
      MediaTypeCodecRegistry.of(issuesCreateLabelRequestCodec)

  internal val issuesCreateLabelResponseCodecRegistry: MediaTypeCodecRegistry<Label> =
      MediaTypeCodecRegistry.of(issuesCreateLabelResponseCodec)

  internal const val ISSUESCREATEMILESTONE_REQUEST_CODEC_ID: String =
      "issues/create-milestone.request"

  private val issuesCreateMilestoneRequestCodec:
      MediaTypeCodec<InlineReposMilestonesPostRequestJsonXb3363c6d> =
      KotlinxSerializationCodec(ISSUESCREATEMILESTONE_REQUEST_CODEC_ID, InlineReposMilestonesPostRequestJsonXb3363c6d.Serializer, SdkJson)

  internal const val ISSUESCREATEMILESTONE_RESPONSE_CODEC_ID: String =
      "issues/create-milestone.response"

  private val issuesCreateMilestoneResponseCodec: MediaTypeCodec<Milestone> =
      KotlinxSerializationCodec(ISSUESCREATEMILESTONE_RESPONSE_CODEC_ID, Milestone.Serializer, SdkJson)

  private val issuesCreateMilestoneResponseCodecAlternative0Codec: MediaTypeCodec<Milestone> =
      KotlinxSerializationCodec("issues/create-milestone.response.alternative0", Milestone.Serializer, SdkJson)

  internal val issuesCreateMilestoneResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Milestone> =
      MediaTypeCodecRegistry.of(issuesCreateMilestoneResponseCodecAlternative0Codec)

  private val issuesCreateMilestoneResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/create-milestone.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesCreateMilestoneResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesCreateMilestoneResponseCodecAlternative1Codec)

  private val issuesCreateMilestoneResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/create-milestone.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val issuesCreateMilestoneResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(issuesCreateMilestoneResponseCodecAlternative2Codec)

  internal val issuesCreateMilestoneRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposMilestonesPostRequestJsonXb3363c6d> =
      MediaTypeCodecRegistry.of(issuesCreateMilestoneRequestCodec)

  internal val issuesCreateMilestoneResponseCodecRegistry: MediaTypeCodecRegistry<Milestone> =
      MediaTypeCodecRegistry.of(issuesCreateMilestoneResponseCodec)

  internal val issuesDeleteCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesDeleteCommentResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val issuesDeleteIssueFieldValueResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("issues/delete-issue-field-value.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesDeleteIssueFieldValueResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesDeleteIssueFieldValueResponseCodecAlternative1Codec)

  private val issuesDeleteIssueFieldValueResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("issues/delete-issue-field-value.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesDeleteIssueFieldValueResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesDeleteIssueFieldValueResponseCodecAlternative2Codec)

  private val issuesDeleteIssueFieldValueResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/delete-issue-field-value.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val issuesDeleteIssueFieldValueResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(issuesDeleteIssueFieldValueResponseCodecAlternative3Codec)

  private val issuesDeleteIssueFieldValueResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("issues/delete-issue-field-value.response.alternative4", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val issuesDeleteIssueFieldValueResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(issuesDeleteIssueFieldValueResponseCodecAlternative4Codec)

  internal val issuesDeleteIssueFieldValueRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesDeleteIssueFieldValueResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesDeleteLabelRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesDeleteLabelResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val issuesDeleteMilestoneResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/delete-milestone.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesDeleteMilestoneResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesDeleteMilestoneResponseCodecAlternative1Codec)

  internal val issuesDeleteMilestoneRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesDeleteMilestoneResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val ISSUESGETCOMMENT_RESPONSE_CODEC_ID: String = "issues/get-comment.response"

  private val issuesGetCommentResponseCodec: MediaTypeCodec<IssueComment> =
      KotlinxSerializationCodec(ISSUESGETCOMMENT_RESPONSE_CODEC_ID, IssueComment.Serializer, SdkJson)

  private val issuesGetCommentResponseCodecAlternative0Codec: MediaTypeCodec<IssueComment> =
      KotlinxSerializationCodec("issues/get-comment.response.alternative0", IssueComment.Serializer, SdkJson)

  internal val issuesGetCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssueComment> =
      MediaTypeCodecRegistry.of(issuesGetCommentResponseCodecAlternative0Codec)

  private val issuesGetCommentResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/get-comment.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesGetCommentResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesGetCommentResponseCodecAlternative1Codec)

  internal val issuesGetCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesGetCommentResponseCodecRegistry: MediaTypeCodecRegistry<IssueComment> =
      MediaTypeCodecRegistry.of(issuesGetCommentResponseCodec)

  internal const val ISSUESGETLABEL_RESPONSE_CODEC_ID: String = "issues/get-label.response"

  private val issuesGetLabelResponseCodec: MediaTypeCodec<Label> =
      KotlinxSerializationCodec(ISSUESGETLABEL_RESPONSE_CODEC_ID, Label.Serializer, SdkJson)

  private val issuesGetLabelResponseCodecAlternative0Codec: MediaTypeCodec<Label> =
      KotlinxSerializationCodec("issues/get-label.response.alternative0", Label.Serializer, SdkJson)

  internal val issuesGetLabelResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Label> =
      MediaTypeCodecRegistry.of(issuesGetLabelResponseCodecAlternative0Codec)

  private val issuesGetLabelResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/get-label.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesGetLabelResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesGetLabelResponseCodecAlternative1Codec)

  internal val issuesGetLabelRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesGetLabelResponseCodecRegistry: MediaTypeCodecRegistry<Label> =
      MediaTypeCodecRegistry.of(issuesGetLabelResponseCodec)

  internal const val ISSUESGETMILESTONE_RESPONSE_CODEC_ID: String = "issues/get-milestone.response"

  private val issuesGetMilestoneResponseCodec: MediaTypeCodec<Milestone> =
      KotlinxSerializationCodec(ISSUESGETMILESTONE_RESPONSE_CODEC_ID, Milestone.Serializer, SdkJson)

  private val issuesGetMilestoneResponseCodecAlternative0Codec: MediaTypeCodec<Milestone> =
      KotlinxSerializationCodec("issues/get-milestone.response.alternative0", Milestone.Serializer, SdkJson)

  internal val issuesGetMilestoneResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Milestone> =
      MediaTypeCodecRegistry.of(issuesGetMilestoneResponseCodecAlternative0Codec)

  private val issuesGetMilestoneResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/get-milestone.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesGetMilestoneResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesGetMilestoneResponseCodecAlternative1Codec)

  internal val issuesGetMilestoneRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesGetMilestoneResponseCodecRegistry: MediaTypeCodecRegistry<Milestone> =
      MediaTypeCodecRegistry.of(issuesGetMilestoneResponseCodec)

  internal const val ISSUESLISTASSIGNEES_RESPONSE_CODEC_ID: String =
      "issues/list-assignees.response"

  private val issuesListAssigneesResponseCodec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec(ISSUESLISTASSIGNEES_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val issuesListAssigneesResponseCodecAlternative0Codec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("issues/list-assignees.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  internal val issuesListAssigneesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(issuesListAssigneesResponseCodecAlternative0Codec)

  private val issuesListAssigneesResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-assignees.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesListAssigneesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListAssigneesResponseCodecAlternative1Codec)

  internal val issuesListAssigneesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesListAssigneesResponseCodecRegistry: MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(issuesListAssigneesResponseCodec)

  internal const val ISSUESLISTCOMMENTS_RESPONSE_CODEC_ID: String = "issues/list-comments.response"

  private val issuesListCommentsResponseCodec: MediaTypeCodec<List<IssueComment>> =
      KotlinxSerializationCodec(ISSUESLISTCOMMENTS_RESPONSE_CODEC_ID, ListSerializer(IssueComment.Serializer), SdkJson)

  private val issuesListCommentsResponseCodecAlternative0Codec: MediaTypeCodec<List<IssueComment>> =
      KotlinxSerializationCodec("issues/list-comments.response.alternative0", ListSerializer(IssueComment.Serializer), SdkJson)

  internal val issuesListCommentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<IssueComment>> =
      MediaTypeCodecRegistry.of(issuesListCommentsResponseCodecAlternative0Codec)

  private val issuesListCommentsResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-comments.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesListCommentsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListCommentsResponseCodecAlternative1Codec)

  private val issuesListCommentsResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-comments.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesListCommentsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListCommentsResponseCodecAlternative2Codec)

  internal val issuesListCommentsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesListCommentsResponseCodecRegistry: MediaTypeCodecRegistry<List<IssueComment>> =
      MediaTypeCodecRegistry.of(issuesListCommentsResponseCodec)

  internal const val ISSUESLISTCOMMENTSFORREPO_RESPONSE_CODEC_ID: String =
      "issues/list-comments-for-repo.response"

  private val issuesListCommentsForRepoResponseCodec: MediaTypeCodec<List<IssueComment>> =
      KotlinxSerializationCodec(ISSUESLISTCOMMENTSFORREPO_RESPONSE_CODEC_ID, ListSerializer(IssueComment.Serializer), SdkJson)

  private val issuesListCommentsForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<List<IssueComment>> =
      KotlinxSerializationCodec("issues/list-comments-for-repo.response.alternative0", ListSerializer(IssueComment.Serializer), SdkJson)

  internal val issuesListCommentsForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<IssueComment>> =
      MediaTypeCodecRegistry.of(issuesListCommentsForRepoResponseCodecAlternative0Codec)

  private val issuesListCommentsForRepoResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-comments-for-repo.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesListCommentsForRepoResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListCommentsForRepoResponseCodecAlternative1Codec)

  private val issuesListCommentsForRepoResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/list-comments-for-repo.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val issuesListCommentsForRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(issuesListCommentsForRepoResponseCodecAlternative2Codec)

  internal val issuesListCommentsForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesListCommentsForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<List<IssueComment>> =
      MediaTypeCodecRegistry.of(issuesListCommentsForRepoResponseCodec)

  internal const val ISSUESLISTEVENTS_RESPONSE_CODEC_ID: String = "issues/list-events.response"

  private val issuesListEventsResponseCodec: MediaTypeCodec<List<IssueEventForIssue>> =
      KotlinxSerializationCodec(ISSUESLISTEVENTS_RESPONSE_CODEC_ID, ListSerializer(IssueEventForIssue.Serializer), SdkJson)

  private val issuesListEventsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<IssueEventForIssue>> =
      KotlinxSerializationCodec("issues/list-events.response.alternative0", ListSerializer(IssueEventForIssue.Serializer), SdkJson)

  internal val issuesListEventsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<IssueEventForIssue>> =
      MediaTypeCodecRegistry.of(issuesListEventsResponseCodecAlternative0Codec)

  private val issuesListEventsResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-events.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesListEventsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesListEventsResponseCodecAlternative1Codec)

  internal val issuesListEventsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesListEventsResponseCodecRegistry:
      MediaTypeCodecRegistry<List<IssueEventForIssue>> =
      MediaTypeCodecRegistry.of(issuesListEventsResponseCodec)

  internal const val ISSUESLISTISSUEFIELDVALUESFORISSUE_RESPONSE_CODEC_ID: String =
      "issues/list-issue-field-values-for-issue.response"

  private val issuesListIssueFieldValuesForIssueResponseCodec: MediaTypeCodec<List<IssueFieldValue>>
      =
      KotlinxSerializationCodec(ISSUESLISTISSUEFIELDVALUESFORISSUE_RESPONSE_CODEC_ID, ListSerializer(IssueFieldValue.Serializer), SdkJson)

  private val issuesListIssueFieldValuesForIssueResponseCodecAlternative0Codec:
      MediaTypeCodec<List<IssueFieldValue>> =
      KotlinxSerializationCodec("issues/list-issue-field-values-for-issue.response.alternative0", ListSerializer(IssueFieldValue.Serializer), SdkJson)

  internal val issuesListIssueFieldValuesForIssueResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<IssueFieldValue>> =
      MediaTypeCodecRegistry.of(issuesListIssueFieldValuesForIssueResponseCodecAlternative0Codec)

  private val issuesListIssueFieldValuesForIssueResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-issue-field-values-for-issue.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesListIssueFieldValuesForIssueResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListIssueFieldValuesForIssueResponseCodecAlternative1Codec)

  private val issuesListIssueFieldValuesForIssueResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-issue-field-values-for-issue.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesListIssueFieldValuesForIssueResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListIssueFieldValuesForIssueResponseCodecAlternative2Codec)

  private val issuesListIssueFieldValuesForIssueResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-issue-field-values-for-issue.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesListIssueFieldValuesForIssueResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListIssueFieldValuesForIssueResponseCodecAlternative3Codec)

  internal val issuesListIssueFieldValuesForIssueRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal val issuesListIssueFieldValuesForIssueResponseCodecRegistry:
      MediaTypeCodecRegistry<List<IssueFieldValue>> =
      MediaTypeCodecRegistry.of(issuesListIssueFieldValuesForIssueResponseCodec)

  internal const val ISSUESLISTLABELSFORMILESTONE_RESPONSE_CODEC_ID: String =
      "issues/list-labels-for-milestone.response"

  private val issuesListLabelsForMilestoneResponseCodec: MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec(ISSUESLISTLABELSFORMILESTONE_RESPONSE_CODEC_ID, ListSerializer(Label.Serializer), SdkJson)

  private val issuesListLabelsForMilestoneResponseCodecAlternative0Codec:
      MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec("issues/list-labels-for-milestone.response.alternative0", ListSerializer(Label.Serializer), SdkJson)

  internal val issuesListLabelsForMilestoneResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Label>> =
      MediaTypeCodecRegistry.of(issuesListLabelsForMilestoneResponseCodecAlternative0Codec)

  internal val issuesListLabelsForMilestoneRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesListLabelsForMilestoneResponseCodecRegistry:
      MediaTypeCodecRegistry<List<Label>> =
      MediaTypeCodecRegistry.of(issuesListLabelsForMilestoneResponseCodec)

  internal const val ISSUESLISTLABELSFORREPO_RESPONSE_CODEC_ID: String =
      "issues/list-labels-for-repo.response"

  private val issuesListLabelsForRepoResponseCodec: MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec(ISSUESLISTLABELSFORREPO_RESPONSE_CODEC_ID, ListSerializer(Label.Serializer), SdkJson)

  private val issuesListLabelsForRepoResponseCodecAlternative0Codec: MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec("issues/list-labels-for-repo.response.alternative0", ListSerializer(Label.Serializer), SdkJson)

  internal val issuesListLabelsForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Label>> =
      MediaTypeCodecRegistry.of(issuesListLabelsForRepoResponseCodecAlternative0Codec)

  private val issuesListLabelsForRepoResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-labels-for-repo.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesListLabelsForRepoResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListLabelsForRepoResponseCodecAlternative1Codec)

  internal val issuesListLabelsForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesListLabelsForRepoResponseCodecRegistry: MediaTypeCodecRegistry<List<Label>> =
      MediaTypeCodecRegistry.of(issuesListLabelsForRepoResponseCodec)

  internal const val ISSUESLISTLABELSONISSUE_RESPONSE_CODEC_ID: String =
      "issues/list-labels-on-issue.response"

  private val issuesListLabelsOnIssueResponseCodec: MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec(ISSUESLISTLABELSONISSUE_RESPONSE_CODEC_ID, ListSerializer(Label.Serializer), SdkJson)

  private val issuesListLabelsOnIssueResponseCodecAlternative0Codec: MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec("issues/list-labels-on-issue.response.alternative0", ListSerializer(Label.Serializer), SdkJson)

  internal val issuesListLabelsOnIssueResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Label>> =
      MediaTypeCodecRegistry.of(issuesListLabelsOnIssueResponseCodecAlternative0Codec)

  private val issuesListLabelsOnIssueResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-labels-on-issue.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesListLabelsOnIssueResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListLabelsOnIssueResponseCodecAlternative1Codec)

  private val issuesListLabelsOnIssueResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-labels-on-issue.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesListLabelsOnIssueResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListLabelsOnIssueResponseCodecAlternative2Codec)

  private val issuesListLabelsOnIssueResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-labels-on-issue.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesListLabelsOnIssueResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListLabelsOnIssueResponseCodecAlternative3Codec)

  internal val issuesListLabelsOnIssueRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesListLabelsOnIssueResponseCodecRegistry: MediaTypeCodecRegistry<List<Label>> =
      MediaTypeCodecRegistry.of(issuesListLabelsOnIssueResponseCodec)

  internal const val ISSUESLISTMILESTONES_RESPONSE_CODEC_ID: String =
      "issues/list-milestones.response"

  private val issuesListMilestonesResponseCodec: MediaTypeCodec<List<Milestone>> =
      KotlinxSerializationCodec(ISSUESLISTMILESTONES_RESPONSE_CODEC_ID, ListSerializer(Milestone.Serializer), SdkJson)

  private val issuesListMilestonesResponseCodecAlternative0Codec: MediaTypeCodec<List<Milestone>> =
      KotlinxSerializationCodec("issues/list-milestones.response.alternative0", ListSerializer(Milestone.Serializer), SdkJson)

  internal val issuesListMilestonesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Milestone>> =
      MediaTypeCodecRegistry.of(issuesListMilestonesResponseCodecAlternative0Codec)

  private val issuesListMilestonesResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/list-milestones.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesListMilestonesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesListMilestonesResponseCodecAlternative1Codec)

  internal val issuesListMilestonesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesListMilestonesResponseCodecRegistry: MediaTypeCodecRegistry<List<Milestone>> =
      MediaTypeCodecRegistry.of(issuesListMilestonesResponseCodec)

  internal const val ISSUESLOCK_REQUEST_CODEC_ID: String = "issues/lock.request"

  private val issuesLockRequestCodec: MediaTypeCodec<InlineReposIssuesLockPutRequestJsonXbf8f79bc?>
      =
      KotlinxSerializationCodec(ISSUESLOCK_REQUEST_CODEC_ID, InlineReposIssuesLockPutRequestJsonXbf8f79bc.Serializer.nullable, SdkJson)

  private val issuesLockResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/lock.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesLockResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesLockResponseCodecAlternative1Codec)

  private val issuesLockResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/lock.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesLockResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesLockResponseCodecAlternative2Codec)

  private val issuesLockResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/lock.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesLockResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesLockResponseCodecAlternative3Codec)

  private val issuesLockResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/lock.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val issuesLockResponseCodecAlternative4Registry: MediaTypeCodecRegistry<ValidationError>
      = MediaTypeCodecRegistry.of(issuesLockResponseCodecAlternative4Codec)

  internal val issuesLockRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposIssuesLockPutRequestJsonXbf8f79bc?> =
      MediaTypeCodecRegistry.of(issuesLockRequestCodec)

  internal val issuesLockResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val ISSUESPINCOMMENT_RESPONSE_CODEC_ID: String = "issues/pin-comment.response"

  private val issuesPinCommentResponseCodec: MediaTypeCodec<IssueComment> =
      KotlinxSerializationCodec(ISSUESPINCOMMENT_RESPONSE_CODEC_ID, IssueComment.Serializer, SdkJson)

  private val issuesPinCommentResponseCodecAlternative0Codec: MediaTypeCodec<IssueComment> =
      KotlinxSerializationCodec("issues/pin-comment.response.alternative0", IssueComment.Serializer, SdkJson)

  internal val issuesPinCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssueComment> =
      MediaTypeCodecRegistry.of(issuesPinCommentResponseCodecAlternative0Codec)

  private val issuesPinCommentResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/pin-comment.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesPinCommentResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesPinCommentResponseCodecAlternative1Codec)

  private val issuesPinCommentResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/pin-comment.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesPinCommentResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesPinCommentResponseCodecAlternative2Codec)

  private val issuesPinCommentResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/pin-comment.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesPinCommentResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesPinCommentResponseCodecAlternative3Codec)

  private val issuesPinCommentResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/pin-comment.response.alternative4", BasicError.Serializer, SdkJson)

  internal val issuesPinCommentResponseCodecAlternative4Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesPinCommentResponseCodecAlternative4Codec)

  private val issuesPinCommentResponseCodecAlternative5Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/pin-comment.response.alternative5", ValidationError.Serializer, SdkJson)

  internal val issuesPinCommentResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(issuesPinCommentResponseCodecAlternative5Codec)

  internal val issuesPinCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesPinCommentResponseCodecRegistry: MediaTypeCodecRegistry<IssueComment> =
      MediaTypeCodecRegistry.of(issuesPinCommentResponseCodec)

  private val issuesRemoveAllLabelsResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/remove-all-labels.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesRemoveAllLabelsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesRemoveAllLabelsResponseCodecAlternative1Codec)

  private val issuesRemoveAllLabelsResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/remove-all-labels.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesRemoveAllLabelsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesRemoveAllLabelsResponseCodecAlternative2Codec)

  private val issuesRemoveAllLabelsResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/remove-all-labels.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesRemoveAllLabelsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesRemoveAllLabelsResponseCodecAlternative3Codec)

  internal val issuesRemoveAllLabelsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesRemoveAllLabelsResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val ISSUESREMOVELABEL_RESPONSE_CODEC_ID: String = "issues/remove-label.response"

  private val issuesRemoveLabelResponseCodec: MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec(ISSUESREMOVELABEL_RESPONSE_CODEC_ID, ListSerializer(Label.Serializer), SdkJson)

  private val issuesRemoveLabelResponseCodecAlternative0Codec: MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec("issues/remove-label.response.alternative0", ListSerializer(Label.Serializer), SdkJson)

  internal val issuesRemoveLabelResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Label>> =
      MediaTypeCodecRegistry.of(issuesRemoveLabelResponseCodecAlternative0Codec)

  private val issuesRemoveLabelResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/remove-label.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesRemoveLabelResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesRemoveLabelResponseCodecAlternative1Codec)

  private val issuesRemoveLabelResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/remove-label.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesRemoveLabelResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesRemoveLabelResponseCodecAlternative2Codec)

  private val issuesRemoveLabelResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/remove-label.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesRemoveLabelResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesRemoveLabelResponseCodecAlternative3Codec)

  internal val issuesRemoveLabelRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesRemoveLabelResponseCodecRegistry: MediaTypeCodecRegistry<List<Label>> =
      MediaTypeCodecRegistry.of(issuesRemoveLabelResponseCodec)

  internal const val ISSUESSETISSUEFIELDVALUES_REQUEST_CODEC_ID: String =
      "issues/set-issue-field-values.request"

  private val issuesSetIssueFieldValuesRequestCodec:
      MediaTypeCodec<InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc> =
      KotlinxSerializationCodec(ISSUESSETISSUEFIELDVALUES_REQUEST_CODEC_ID, InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc.Serializer, SdkJson)

  internal const val ISSUESSETISSUEFIELDVALUES_RESPONSE_CODEC_ID: String =
      "issues/set-issue-field-values.response"

  private val issuesSetIssueFieldValuesResponseCodec: MediaTypeCodec<List<IssueFieldValue>> =
      KotlinxSerializationCodec(ISSUESSETISSUEFIELDVALUES_RESPONSE_CODEC_ID, ListSerializer(IssueFieldValue.Serializer), SdkJson)

  private val issuesSetIssueFieldValuesResponseCodecAlternative0Codec:
      MediaTypeCodec<List<IssueFieldValue>> =
      KotlinxSerializationCodec("issues/set-issue-field-values.response.alternative0", ListSerializer(IssueFieldValue.Serializer), SdkJson)

  internal val issuesSetIssueFieldValuesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<IssueFieldValue>> =
      MediaTypeCodecRegistry.of(issuesSetIssueFieldValuesResponseCodecAlternative0Codec)

  private val issuesSetIssueFieldValuesResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/set-issue-field-values.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesSetIssueFieldValuesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesSetIssueFieldValuesResponseCodecAlternative1Codec)

  private val issuesSetIssueFieldValuesResponseCodecAlternative2Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("issues/set-issue-field-values.response.alternative2", ScimError.Serializer, SdkJson)

  internal val issuesSetIssueFieldValuesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(issuesSetIssueFieldValuesResponseCodecAlternative2Codec)

  private val issuesSetIssueFieldValuesResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/set-issue-field-values.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesSetIssueFieldValuesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesSetIssueFieldValuesResponseCodecAlternative3Codec)

  private val issuesSetIssueFieldValuesResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/set-issue-field-values.response.alternative4", BasicError.Serializer, SdkJson)

  internal val issuesSetIssueFieldValuesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesSetIssueFieldValuesResponseCodecAlternative4Codec)

  private val issuesSetIssueFieldValuesResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/set-issue-field-values.response.alternative5", ValidationError.Serializer, SdkJson)

  internal val issuesSetIssueFieldValuesResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(issuesSetIssueFieldValuesResponseCodecAlternative5Codec)

  private val issuesSetIssueFieldValuesResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("issues/set-issue-field-values.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val issuesSetIssueFieldValuesResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(issuesSetIssueFieldValuesResponseCodecAlternative6Codec)

  internal val issuesSetIssueFieldValuesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc> =
      MediaTypeCodecRegistry.of(issuesSetIssueFieldValuesRequestCodec)

  internal val issuesSetIssueFieldValuesResponseCodecRegistry:
      MediaTypeCodecRegistry<List<IssueFieldValue>> =
      MediaTypeCodecRegistry.of(issuesSetIssueFieldValuesResponseCodec)

  internal const val ISSUESSETLABELS_REQUEST_CODEC_ID: String = "issues/set-labels.request"

  private val issuesSetLabelsRequestCodec:
      MediaTypeCodec<InlineReposIssuesLabelsPutRequestJsonX7d91fbad?> =
      KotlinxSerializationCodec(ISSUESSETLABELS_REQUEST_CODEC_ID, InlineReposIssuesLabelsPutRequestJsonX7d91fbadSerializer.nullable, SdkJson)

  internal const val ISSUESSETLABELS_RESPONSE_CODEC_ID: String = "issues/set-labels.response"

  private val issuesSetLabelsResponseCodec: MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec(ISSUESSETLABELS_RESPONSE_CODEC_ID, ListSerializer(Label.Serializer), SdkJson)

  private val issuesSetLabelsResponseCodecAlternative0Codec: MediaTypeCodec<List<Label>> =
      KotlinxSerializationCodec("issues/set-labels.response.alternative0", ListSerializer(Label.Serializer), SdkJson)

  internal val issuesSetLabelsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<List<Label>>
      = MediaTypeCodecRegistry.of(issuesSetLabelsResponseCodecAlternative0Codec)

  private val issuesSetLabelsResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/set-labels.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesSetLabelsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesSetLabelsResponseCodecAlternative1Codec)

  private val issuesSetLabelsResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/set-labels.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesSetLabelsResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesSetLabelsResponseCodecAlternative2Codec)

  private val issuesSetLabelsResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/set-labels.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesSetLabelsResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(issuesSetLabelsResponseCodecAlternative3Codec)

  private val issuesSetLabelsResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/set-labels.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val issuesSetLabelsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(issuesSetLabelsResponseCodecAlternative4Codec)

  internal val issuesSetLabelsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposIssuesLabelsPutRequestJsonX7d91fbad?> =
      MediaTypeCodecRegistry.of(issuesSetLabelsRequestCodec)

  internal val issuesSetLabelsResponseCodecRegistry: MediaTypeCodecRegistry<List<Label>> =
      MediaTypeCodecRegistry.of(issuesSetLabelsResponseCodec)

  private val issuesUnlockResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/unlock.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesUnlockResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesUnlockResponseCodecAlternative1Codec)

  private val issuesUnlockResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/unlock.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesUnlockResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesUnlockResponseCodecAlternative2Codec)

  internal val issuesUnlockRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesUnlockResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val issuesUnpinCommentResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/unpin-comment.response.alternative1", BasicError.Serializer, SdkJson)

  internal val issuesUnpinCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesUnpinCommentResponseCodecAlternative1Codec)

  private val issuesUnpinCommentResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/unpin-comment.response.alternative2", BasicError.Serializer, SdkJson)

  internal val issuesUnpinCommentResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesUnpinCommentResponseCodecAlternative2Codec)

  private val issuesUnpinCommentResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/unpin-comment.response.alternative3", BasicError.Serializer, SdkJson)

  internal val issuesUnpinCommentResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesUnpinCommentResponseCodecAlternative3Codec)

  private val issuesUnpinCommentResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("issues/unpin-comment.response.alternative4", BasicError.Serializer, SdkJson)

  internal val issuesUnpinCommentResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(issuesUnpinCommentResponseCodecAlternative4Codec)

  private val issuesUnpinCommentResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("issues/unpin-comment.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val issuesUnpinCommentResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(issuesUnpinCommentResponseCodecAlternative5Codec)

  internal val issuesUnpinCommentRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val issuesUnpinCommentResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val ISSUESUPDATECOMMENT_REQUEST_CODEC_ID: String = "issues/update-comment.request"

  private val issuesUpdateCommentRequestCodec:
      MediaTypeCodec<InlineReposIssuesCommentsPatchRequestJsonX7f04be98> =
      KotlinxSerializationCodec(ISSUESUPDATECOMMENT_REQUEST_CODEC_ID, InlineReposIssuesCommentsPatchRequestJsonX7f04be98.Serializer, SdkJson)

  internal const val ISSUESUPDATECOMMENT_RESPONSE_CODEC_ID: String =
      "issues/update-comment.response"

  private val issuesUpdateCommentResponseCodec: MediaTypeCodec<IssueComment> =
      KotlinxSerializationCodec(ISSUESUPDATECOMMENT_RESPONSE_CODEC_ID, IssueComment.Serializer, SdkJson)

  private val issuesUpdateCommentResponseCodecAlternative0Codec: MediaTypeCodec<IssueComment> =
      KotlinxSerializationCodec("issues/update-comment.response.alternative0", IssueComment.Serializer, SdkJson)

  internal val issuesUpdateCommentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssueComment> =
      MediaTypeCodecRegistry.of(issuesUpdateCommentResponseCodecAlternative0Codec)

  private val issuesUpdateCommentResponseCodecAlternative1Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("issues/update-comment.response.alternative1", ValidationError.Serializer, SdkJson)

  internal val issuesUpdateCommentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(issuesUpdateCommentResponseCodecAlternative1Codec)

  internal val issuesUpdateCommentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposIssuesCommentsPatchRequestJsonX7f04be98> =
      MediaTypeCodecRegistry.of(issuesUpdateCommentRequestCodec)

  internal val issuesUpdateCommentResponseCodecRegistry: MediaTypeCodecRegistry<IssueComment> =
      MediaTypeCodecRegistry.of(issuesUpdateCommentResponseCodec)

  internal const val ISSUESUPDATELABEL_REQUEST_CODEC_ID: String = "issues/update-label.request"

  private val issuesUpdateLabelRequestCodec:
      MediaTypeCodec<InlineReposLabelsPatchRequestJsonXb7f85b4a?> =
      KotlinxSerializationCodec(ISSUESUPDATELABEL_REQUEST_CODEC_ID, InlineReposLabelsPatchRequestJsonXb7f85b4a.Serializer.nullable, SdkJson)

  internal const val ISSUESUPDATELABEL_RESPONSE_CODEC_ID: String = "issues/update-label.response"

  private val issuesUpdateLabelResponseCodec: MediaTypeCodec<Label> =
      KotlinxSerializationCodec(ISSUESUPDATELABEL_RESPONSE_CODEC_ID, Label.Serializer, SdkJson)

  private val issuesUpdateLabelResponseCodecAlternative0Codec: MediaTypeCodec<Label> =
      KotlinxSerializationCodec("issues/update-label.response.alternative0", Label.Serializer, SdkJson)

  internal val issuesUpdateLabelResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Label> =
      MediaTypeCodecRegistry.of(issuesUpdateLabelResponseCodecAlternative0Codec)

  internal val issuesUpdateLabelRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposLabelsPatchRequestJsonXb7f85b4a?> =
      MediaTypeCodecRegistry.of(issuesUpdateLabelRequestCodec)

  internal val issuesUpdateLabelResponseCodecRegistry: MediaTypeCodecRegistry<Label> =
      MediaTypeCodecRegistry.of(issuesUpdateLabelResponseCodec)

  internal const val ISSUESUPDATEMILESTONE_REQUEST_CODEC_ID: String =
      "issues/update-milestone.request"

  private val issuesUpdateMilestoneRequestCodec:
      MediaTypeCodec<InlineReposMilestonesPatchRequestJsonXd61f2cae?> =
      KotlinxSerializationCodec(ISSUESUPDATEMILESTONE_REQUEST_CODEC_ID, InlineReposMilestonesPatchRequestJsonXd61f2cae.Serializer.nullable, SdkJson)

  internal const val ISSUESUPDATEMILESTONE_RESPONSE_CODEC_ID: String =
      "issues/update-milestone.response"

  private val issuesUpdateMilestoneResponseCodec: MediaTypeCodec<Milestone> =
      KotlinxSerializationCodec(ISSUESUPDATEMILESTONE_RESPONSE_CODEC_ID, Milestone.Serializer, SdkJson)

  private val issuesUpdateMilestoneResponseCodecAlternative0Codec: MediaTypeCodec<Milestone> =
      KotlinxSerializationCodec("issues/update-milestone.response.alternative0", Milestone.Serializer, SdkJson)

  internal val issuesUpdateMilestoneResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Milestone> =
      MediaTypeCodecRegistry.of(issuesUpdateMilestoneResponseCodecAlternative0Codec)

  internal val issuesUpdateMilestoneRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposMilestonesPatchRequestJsonXd61f2cae?> =
      MediaTypeCodecRegistry.of(issuesUpdateMilestoneRequestCodec)

  internal val issuesUpdateMilestoneResponseCodecRegistry: MediaTypeCodecRegistry<Milestone> =
      MediaTypeCodecRegistry.of(issuesUpdateMilestoneResponseCodec)
}

/**
 * Client for the 'issues' group of GitHub v3 REST API.
 */
public class IssuesClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@IssuesClient.authentication)

  /**
   * Add custom field values to an issue. You can set values for organization-level issue fields that have been defined
   * for the repository's organization.
   * Adding an empty array will clear all existing field values for the issue.
   *
   * This endpoint supports the following field data types:
   * - **`text`**: String values for text fields
   * - **`single_select`**: Option names for single-select fields (must match an existing option name)
   * - **`number`**: Numeric values for number fields
   * - **`date`**: ISO 8601 date strings for date fields
   *
   * Only users with push access to the repository can add issue field values. If you don't have the proper permissions,
   * you'll receive a `403 Forbidden` response.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesAddIssueFieldValuesApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesAddIssueFieldValuesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesAddIssueFieldValues(
    request: InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): List<IssueFieldValue> = executor.executeWithTypedErrors<InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d, IssuesAddIssueFieldValuesResponse, List<IssueFieldValue>>(
    request = SdkExecutionRequest(issuesAddIssueFieldValuesMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESADDISSUEFIELDVALUES_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesAddIssueFieldValuesRequestCodecRegistry,
    responseDecoder = IssuesAddIssueFieldValuesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesAddIssueFieldValuesResponse.SuccessJson -> response.json
        is IssuesAddIssueFieldValuesResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesAddIssueFieldValuesResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is IssuesAddIssueFieldValuesResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesAddIssueFieldValuesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesAddIssueFieldValuesResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesAddIssueFieldValuesResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesAddIssueFieldValuesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesAddIssueFieldValuesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesAddIssueFieldValuesResponse.Http400Json -> IssuesAddIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesAddIssueFieldValuesResponse.Http400ScimJson -> IssuesAddIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesAddIssueFieldValuesResponse.Http403Json -> IssuesAddIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesAddIssueFieldValuesResponse.Http404Json -> IssuesAddIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesAddIssueFieldValuesResponse.Http422Json -> IssuesAddIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesAddIssueFieldValuesResponse.Http503Json -> IssuesAddIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesAddIssueFieldValuesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Add custom field values to an issue. You can set values for organization-level issue fields that have been defined
   * for the repository's organization.
   * Adding an empty array will clear all existing field values for the issue.
   *
   * This endpoint supports the following field data types:
   * - **`text`**: String values for text fields
   * - **`single_select`**: Option names for single-select fields (must match an existing option name)
   * - **`number`**: Numeric values for number fields
   * - **`date`**: ISO 8601 date strings for date fields
   *
   * Only users with push access to the repository can add issue field values. If you don't have the proper permissions,
   * you'll receive a `403 Forbidden` response.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesAddIssueFieldValuesWithResponse(
    request: InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesAddIssueFieldValuesResponse> = executor.executeWithResponse<InlineReposIssuesIssueFieldValuesPostRequestJsonX7c597d4d, IssuesAddIssueFieldValuesResponse>(SdkExecutionRequest(issuesAddIssueFieldValuesMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESADDISSUEFIELDVALUES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesAddIssueFieldValuesRequestCodecRegistry, IssuesAddIssueFieldValuesResponseDecoder, options)

  /**
   * Adds labels to an issue.
   *
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesAddLabelsApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded IssuesAddLabelsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesAddLabels(
    request: InlineReposIssuesLabelsPostRequestJsonX91f10aa5? = null,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): List<Label> = executor.executeWithTypedErrors<InlineReposIssuesLabelsPostRequestJsonX91f10aa5?, IssuesAddLabelsResponse, List<Label>>(
    request = SdkExecutionRequest(issuesAddLabelsMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESADDLABELS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesAddLabelsRequestCodecRegistry,
    responseDecoder = IssuesAddLabelsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesAddLabelsResponse.SuccessJson -> response.json
        is IssuesAddLabelsResponse.Http301Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesAddLabelsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesAddLabelsResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesAddLabelsResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesAddLabelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesAddLabelsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesAddLabelsResponse.Http301Json -> IssuesAddLabelsApiException(response, statusCode, headers)
        is IssuesAddLabelsResponse.Http404Json -> IssuesAddLabelsApiException(response, statusCode, headers)
        is IssuesAddLabelsResponse.Http410Json -> IssuesAddLabelsApiException(response, statusCode, headers)
        is IssuesAddLabelsResponse.Http422Json -> IssuesAddLabelsApiException(response, statusCode, headers)
        is IssuesAddLabelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds labels to an issue.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesAddLabelsWithResponse(
    request: InlineReposIssuesLabelsPostRequestJsonX91f10aa5? = null,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesAddLabelsResponse> = executor.executeWithResponse<InlineReposIssuesLabelsPostRequestJsonX91f10aa5?, IssuesAddLabelsResponse>(SdkExecutionRequest(issuesAddLabelsMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESADDLABELS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesAddLabelsRequestCodecRegistry, IssuesAddLabelsResponseDecoder, options)

  /**
   * Checks if a user has permission to be assigned to an issue in this repository.
   *
   * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
   *
   * Otherwise a `404` status code is returned.
   *
   * @param assignee Wire parameter `assignee`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws IssuesCheckUserCanBeAssignedApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded IssuesCheckUserCanBeAssignedError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesCheckUserCanBeAssigned(
    assignee: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, IssuesCheckUserCanBeAssignedResponse, Unit>(
    request = SdkExecutionRequest(issuesCheckUserCanBeAssignedMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "assignee", values = listOf(assignee.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesCheckUserCanBeAssignedRequestCodecRegistry,
    responseDecoder = IssuesCheckUserCanBeAssignedResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesCheckUserCanBeAssignedResponse.SuccessNoContent -> response.unit
        is IssuesCheckUserCanBeAssignedResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesCheckUserCanBeAssignedResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesCheckUserCanBeAssignedResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is IssuesCheckUserCanBeAssignedResponse.Http404Json -> IssuesCheckUserCanBeAssignedApiException(response, statusCode, headers)
        is IssuesCheckUserCanBeAssignedResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Checks if a user has permission to be assigned to an issue in this repository.
   *
   * If the `assignee` can be assigned to issues in the repository, a `204` header with no content is returned.
   *
   * Otherwise a `404` status code is returned.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param assignee Wire parameter `assignee`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesCheckUserCanBeAssignedWithResponse(
    assignee: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesCheckUserCanBeAssignedResponse> = executor.executeWithResponse<Unit, IssuesCheckUserCanBeAssignedResponse>(SdkExecutionRequest(issuesCheckUserCanBeAssignedMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "assignee", values = listOf(assignee.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesCheckUserCanBeAssignedRequestCodecRegistry, IssuesCheckUserCanBeAssignedResponseDecoder, options)

  /**
   * Checks if a user has permission to be assigned to a specific issue.
   *
   * If the `assignee` can be assigned to this issue, a `204` status code with no content is returned.
   *
   * Otherwise a `404` status code is returned.
   *
   * @param assignee Wire parameter `assignee`.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws IssuesCheckUserCanBeAssignedToIssueApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded IssuesCheckUserCanBeAssignedToIssueError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesCheckUserCanBeAssignedToIssue(
    assignee: String,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, IssuesCheckUserCanBeAssignedToIssueResponse, Unit>(
    request = SdkExecutionRequest(issuesCheckUserCanBeAssignedToIssueMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "assignee", values = listOf(assignee.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesCheckUserCanBeAssignedToIssueRequestCodecRegistry,
    responseDecoder = IssuesCheckUserCanBeAssignedToIssueResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesCheckUserCanBeAssignedToIssueResponse.SuccessNoContent -> response.unit
        is IssuesCheckUserCanBeAssignedToIssueResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesCheckUserCanBeAssignedToIssueResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesCheckUserCanBeAssignedToIssueResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is IssuesCheckUserCanBeAssignedToIssueResponse.Http404Json -> IssuesCheckUserCanBeAssignedToIssueApiException(response, statusCode, headers)
        is IssuesCheckUserCanBeAssignedToIssueResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Checks if a user has permission to be assigned to a specific issue.
   *
   * If the `assignee` can be assigned to this issue, a `204` status code with no content is returned.
   *
   * Otherwise a `404` status code is returned.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param assignee Wire parameter `assignee`.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesCheckUserCanBeAssignedToIssueWithResponse(
    assignee: String,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesCheckUserCanBeAssignedToIssueResponse> = executor.executeWithResponse<Unit, IssuesCheckUserCanBeAssignedToIssueResponse>(SdkExecutionRequest(issuesCheckUserCanBeAssignedToIssueMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "assignee", values = listOf(assignee.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesCheckUserCanBeAssignedToIssueRequestCodecRegistry, IssuesCheckUserCanBeAssignedToIssueResponseDecoder, options)

  /**
   * You can use the REST API to create comments on issues and pull requests. Every pull request is an issue, but not
   * every issue is a pull request.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns).
   * Creating content too quickly using this endpoint may result in secondary rate limiting.
   * For more information, see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
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
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesCreateCommentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesCreateCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesCreateComment(
    request: InlineReposIssuesCommentsPostRequestJsonX796b40f6,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): IssueComment = executor.executeWithTypedErrors<InlineReposIssuesCommentsPostRequestJsonX796b40f6, IssuesCreateCommentResponse, IssueComment>(
    request = SdkExecutionRequest(issuesCreateCommentMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESCREATECOMMENT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesCreateCommentRequestCodecRegistry,
    responseDecoder = IssuesCreateCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesCreateCommentResponse.SuccessJson -> response.json
        is IssuesCreateCommentResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesCreateCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesCreateCommentResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesCreateCommentResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesCreateCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesCreateCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesCreateCommentResponse.Http403Json -> IssuesCreateCommentApiException(response, statusCode, headers)
        is IssuesCreateCommentResponse.Http404Json -> IssuesCreateCommentApiException(response, statusCode, headers)
        is IssuesCreateCommentResponse.Http410Json -> IssuesCreateCommentApiException(response, statusCode, headers)
        is IssuesCreateCommentResponse.Http422Json -> IssuesCreateCommentApiException(response, statusCode, headers)
        is IssuesCreateCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * You can use the REST API to create comments on issues and pull requests. Every pull request is an issue, but not
   * every issue is a pull request.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns).
   * Creating content too quickly using this endpoint may result in secondary rate limiting.
   * For more information, see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
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
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesCreateCommentWithResponse(
    request: InlineReposIssuesCommentsPostRequestJsonX796b40f6,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesCreateCommentResponse> = executor.executeWithResponse<InlineReposIssuesCommentsPostRequestJsonX796b40f6, IssuesCreateCommentResponse>(SdkExecutionRequest(issuesCreateCommentMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESCREATECOMMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesCreateCommentRequestCodecRegistry, IssuesCreateCommentResponseDecoder, options)

  /**
   * Creates a label for the specified repository with the given name and color. The name and color parameters are
   * required. The color must be a valid [hexadecimal color code](http://www.color-hex.com/).
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesCreateLabelApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesCreateLabelError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesCreateLabel(
    request: InlineReposLabelsPostRequestJsonX51d6254d,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Label = executor.executeWithTypedErrors<InlineReposLabelsPostRequestJsonX51d6254d, IssuesCreateLabelResponse, Label>(
    request = SdkExecutionRequest(issuesCreateLabelMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESCREATELABEL_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesCreateLabelRequestCodecRegistry,
    responseDecoder = IssuesCreateLabelResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesCreateLabelResponse.SuccessJson -> response.json
        is IssuesCreateLabelResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesCreateLabelResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesCreateLabelResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesCreateLabelResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesCreateLabelResponse.Http404Json -> IssuesCreateLabelApiException(response, statusCode, headers)
        is IssuesCreateLabelResponse.Http422Json -> IssuesCreateLabelApiException(response, statusCode, headers)
        is IssuesCreateLabelResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a label for the specified repository with the given name and color. The name and color parameters are
   * required. The color must be a valid [hexadecimal color code](http://www.color-hex.com/).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesCreateLabelWithResponse(
    request: InlineReposLabelsPostRequestJsonX51d6254d,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesCreateLabelResponse> = executor.executeWithResponse<InlineReposLabelsPostRequestJsonX51d6254d, IssuesCreateLabelResponse>(SdkExecutionRequest(issuesCreateLabelMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESCREATELABEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesCreateLabelRequestCodecRegistry, IssuesCreateLabelResponseDecoder, options)

  /**
   * Creates a milestone.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesCreateMilestoneApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesCreateMilestoneError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesCreateMilestone(
    request: InlineReposMilestonesPostRequestJsonXb3363c6d,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Milestone = executor.executeWithTypedErrors<InlineReposMilestonesPostRequestJsonXb3363c6d, IssuesCreateMilestoneResponse, Milestone>(
    request = SdkExecutionRequest(issuesCreateMilestoneMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESCREATEMILESTONE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesCreateMilestoneRequestCodecRegistry,
    responseDecoder = IssuesCreateMilestoneResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesCreateMilestoneResponse.SuccessJson -> response.json
        is IssuesCreateMilestoneResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesCreateMilestoneResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesCreateMilestoneResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesCreateMilestoneResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesCreateMilestoneResponse.Http404Json -> IssuesCreateMilestoneApiException(response, statusCode, headers)
        is IssuesCreateMilestoneResponse.Http422Json -> IssuesCreateMilestoneApiException(response, statusCode, headers)
        is IssuesCreateMilestoneResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a milestone.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesCreateMilestoneWithResponse(
    request: InlineReposMilestonesPostRequestJsonXb3363c6d,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesCreateMilestoneResponse> = executor.executeWithResponse<InlineReposMilestonesPostRequestJsonXb3363c6d, IssuesCreateMilestoneResponse>(SdkExecutionRequest(issuesCreateMilestoneMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESCREATEMILESTONE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesCreateMilestoneRequestCodecRegistry, IssuesCreateMilestoneResponseDecoder, options)

  /**
   * You can use the REST API to delete comments on issues and pull requests. Every pull request is an issue, but not
   * every issue is a pull request.
   *
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesDeleteComment(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(issuesDeleteCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesDeleteCommentRequestCodecRegistry, options)

  /**
   * You can use the REST API to delete comments on issues and pull requests. Every pull request is an issue, but not
   * every issue is a pull request.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesDeleteCommentWithResponse(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesDeleteCommentResponse> = executor.executeWithResponse<Unit, IssuesDeleteCommentResponse>(SdkExecutionRequest(issuesDeleteCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesDeleteCommentRequestCodecRegistry, IssuesDeleteCommentResponseDecoder, options)

  /**
   * Remove a specific custom field value from an issue.
   *
   * Only users with push access to the repository can delete issue field values. If you don't have the proper
   * permissions, you'll receive a `403 Forbidden` response.
   *
   * If the specified field does not have a value set on the issue, this operation will return a `404` error.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * @param issueFieldId The unique identifier of the issue field.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws IssuesDeleteIssueFieldValueApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded IssuesDeleteIssueFieldValueError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesDeleteIssueFieldValue(
    issueFieldId: Int,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, IssuesDeleteIssueFieldValueResponse, Unit>(
    request = SdkExecutionRequest(issuesDeleteIssueFieldValueMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_field_id", values = listOf(issueFieldId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesDeleteIssueFieldValueRequestCodecRegistry,
    responseDecoder = IssuesDeleteIssueFieldValueResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesDeleteIssueFieldValueResponse.SuccessNoContent -> response.unit
        is IssuesDeleteIssueFieldValueResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesDeleteIssueFieldValueResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesDeleteIssueFieldValueResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesDeleteIssueFieldValueResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesDeleteIssueFieldValueResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesDeleteIssueFieldValueResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is IssuesDeleteIssueFieldValueResponse.Http403Json -> IssuesDeleteIssueFieldValueApiException(response, statusCode, headers)
        is IssuesDeleteIssueFieldValueResponse.Http404Json -> IssuesDeleteIssueFieldValueApiException(response, statusCode, headers)
        is IssuesDeleteIssueFieldValueResponse.Http422Json -> IssuesDeleteIssueFieldValueApiException(response, statusCode, headers)
        is IssuesDeleteIssueFieldValueResponse.Http503Json -> IssuesDeleteIssueFieldValueApiException(response, statusCode, headers)
        is IssuesDeleteIssueFieldValueResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Remove a specific custom field value from an issue.
   *
   * Only users with push access to the repository can delete issue field values. If you don't have the proper
   * permissions, you'll receive a `403 Forbidden` response.
   *
   * If the specified field does not have a value set on the issue, this operation will return a `404` error.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param issueFieldId The unique identifier of the issue field.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesDeleteIssueFieldValueWithResponse(
    issueFieldId: Int,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesDeleteIssueFieldValueResponse> = executor.executeWithResponse<Unit, IssuesDeleteIssueFieldValueResponse>(SdkExecutionRequest(issuesDeleteIssueFieldValueMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_field_id", values = listOf(issueFieldId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesDeleteIssueFieldValueRequestCodecRegistry, IssuesDeleteIssueFieldValueResponseDecoder, options)

  /**
   * Deletes a label using the given label name.
   *
   * @param name Wire parameter `name`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesDeleteLabel(
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(issuesDeleteLabelMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesDeleteLabelRequestCodecRegistry, options)

  /**
   * Deletes a label using the given label name.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param name Wire parameter `name`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesDeleteLabelWithResponse(
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesDeleteLabelResponse> = executor.executeWithResponse<Unit, IssuesDeleteLabelResponse>(SdkExecutionRequest(issuesDeleteLabelMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesDeleteLabelRequestCodecRegistry, IssuesDeleteLabelResponseDecoder, options)

  /**
   * Deletes a milestone using the given milestone number.
   *
   * @param milestoneNumber The number that identifies the milestone.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws IssuesDeleteMilestoneApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesDeleteMilestoneError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesDeleteMilestone(
    milestoneNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, IssuesDeleteMilestoneResponse, Unit>(
    request = SdkExecutionRequest(issuesDeleteMilestoneMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "milestone_number", values = listOf(milestoneNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesDeleteMilestoneRequestCodecRegistry,
    responseDecoder = IssuesDeleteMilestoneResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesDeleteMilestoneResponse.SuccessNoContent -> response.unit
        is IssuesDeleteMilestoneResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesDeleteMilestoneResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesDeleteMilestoneResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is IssuesDeleteMilestoneResponse.Http404Json -> IssuesDeleteMilestoneApiException(response, statusCode, headers)
        is IssuesDeleteMilestoneResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a milestone using the given milestone number.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param milestoneNumber The number that identifies the milestone.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesDeleteMilestoneWithResponse(
    milestoneNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesDeleteMilestoneResponse> = executor.executeWithResponse<Unit, IssuesDeleteMilestoneResponse>(SdkExecutionRequest(issuesDeleteMilestoneMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "milestone_number", values = listOf(milestoneNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesDeleteMilestoneRequestCodecRegistry, IssuesDeleteMilestoneResponseDecoder, options)

  /**
   * You can use the REST API to get comments on issues and pull requests. Every pull request is an issue, but not every
   * issue is a pull request.
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
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesGetCommentApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded IssuesGetCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesGetComment(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): IssueComment = executor.executeWithTypedErrors<Unit, IssuesGetCommentResponse, IssueComment>(
    request = SdkExecutionRequest(issuesGetCommentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesGetCommentRequestCodecRegistry,
    responseDecoder = IssuesGetCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesGetCommentResponse.SuccessJson -> response.json
        is IssuesGetCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesGetCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesGetCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesGetCommentResponse.Http404Json -> IssuesGetCommentApiException(response, statusCode, headers)
        is IssuesGetCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * You can use the REST API to get comments on issues and pull requests. Every pull request is an issue, but not every
   * issue is a pull request.
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
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesGetCommentWithResponse(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesGetCommentResponse> = executor.executeWithResponse<Unit, IssuesGetCommentResponse>(SdkExecutionRequest(issuesGetCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesGetCommentRequestCodecRegistry, IssuesGetCommentResponseDecoder, options)

  /**
   * Gets a label using the given name.
   *
   * @param name Wire parameter `name`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesGetLabelApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded IssuesGetLabelError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesGetLabel(
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Label = executor.executeWithTypedErrors<Unit, IssuesGetLabelResponse, Label>(
    request = SdkExecutionRequest(issuesGetLabelMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesGetLabelRequestCodecRegistry,
    responseDecoder = IssuesGetLabelResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesGetLabelResponse.SuccessJson -> response.json
        is IssuesGetLabelResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesGetLabelResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesGetLabelResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesGetLabelResponse.Http404Json -> IssuesGetLabelApiException(response, statusCode, headers)
        is IssuesGetLabelResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a label using the given name.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param name Wire parameter `name`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesGetLabelWithResponse(
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesGetLabelResponse> = executor.executeWithResponse<Unit, IssuesGetLabelResponse>(SdkExecutionRequest(issuesGetLabelMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesGetLabelRequestCodecRegistry, IssuesGetLabelResponseDecoder, options)

  /**
   * Gets a milestone using the given milestone number.
   *
   * @param milestoneNumber The number that identifies the milestone.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesGetMilestoneApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesGetMilestoneError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesGetMilestone(
    milestoneNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Milestone = executor.executeWithTypedErrors<Unit, IssuesGetMilestoneResponse, Milestone>(
    request = SdkExecutionRequest(issuesGetMilestoneMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "milestone_number", values = listOf(milestoneNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesGetMilestoneRequestCodecRegistry,
    responseDecoder = IssuesGetMilestoneResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesGetMilestoneResponse.SuccessJson -> response.json
        is IssuesGetMilestoneResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesGetMilestoneResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesGetMilestoneResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesGetMilestoneResponse.Http404Json -> IssuesGetMilestoneApiException(response, statusCode, headers)
        is IssuesGetMilestoneResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a milestone using the given milestone number.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param milestoneNumber The number that identifies the milestone.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesGetMilestoneWithResponse(
    milestoneNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesGetMilestoneResponse> = executor.executeWithResponse<Unit, IssuesGetMilestoneResponse>(SdkExecutionRequest(issuesGetMilestoneMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "milestone_number", values = listOf(milestoneNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesGetMilestoneRequestCodecRegistry, IssuesGetMilestoneResponseDecoder, options)

  /**
   * Lists the [available
   * assignees](https://docs.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues
   * in a repository.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesListAssigneesApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesListAssigneesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesListAssignees(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.executeWithTypedErrors<Unit, IssuesListAssigneesResponse, List<SimpleUser>>(
    request = SdkExecutionRequest(issuesListAssigneesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = IssuesCodecs.issuesListAssigneesRequestCodecRegistry,
    responseDecoder = IssuesListAssigneesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesListAssigneesResponse.SuccessJson -> response.json
        is IssuesListAssigneesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListAssigneesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesListAssigneesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesListAssigneesResponse.Http404Json -> IssuesListAssigneesApiException(response, statusCode, headers)
        is IssuesListAssigneesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the [available
   * assignees](https://docs.github.com/articles/assigning-issues-and-pull-requests-to-other-github-users/) for issues
   * in a repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun issuesListAssigneesWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesListAssigneesResponse> = executor.executeWithResponse<Unit, IssuesListAssigneesResponse>(SdkExecutionRequest(issuesListAssigneesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuesCodecs.issuesListAssigneesRequestCodecRegistry, IssuesListAssigneesResponseDecoder, options)

  /**
   * You can use the REST API to list comments on issues and pull requests. Every pull request is an issue, but not
   * every issue is a pull request.
   *
   * Issue comments are ordered by ascending ID.
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
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesListCommentsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesListCommentsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesListComments(
    issueNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): List<IssueComment> = executor.executeWithTypedErrors<Unit, IssuesListCommentsResponse, List<IssueComment>>(
    request = SdkExecutionRequest(issuesListCommentsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = IssuesCodecs.issuesListCommentsRequestCodecRegistry,
    responseDecoder = IssuesListCommentsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesListCommentsResponse.SuccessJson -> response.json
        is IssuesListCommentsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListCommentsResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListCommentsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesListCommentsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesListCommentsResponse.Http404Json -> IssuesListCommentsApiException(response, statusCode, headers)
        is IssuesListCommentsResponse.Http410Json -> IssuesListCommentsApiException(response, statusCode, headers)
        is IssuesListCommentsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * You can use the REST API to list comments on issues and pull requests. Every pull request is an issue, but not
   * every issue is a pull request.
   *
   * Issue comments are ordered by ascending ID.
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
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param since Only show results that were last updated after the given time. This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param options Execution options.
   */
  public suspend fun issuesListCommentsWithResponse(
    issueNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesListCommentsResponse> = executor.executeWithResponse<Unit, IssuesListCommentsResponse>(SdkExecutionRequest(issuesListCommentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuesCodecs.issuesListCommentsRequestCodecRegistry, IssuesListCommentsResponseDecoder, options)

  /**
   * You can use the REST API to list comments on issues and pull requests for a repository. Every pull request is an
   * issue, but not every issue is a pull request.
   *
   * By default, issue comments are ordered by ascending ID.
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
   * @param direction Either `asc` or `desc`. Ignored without the `sort` parameter.
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
   * @throws IssuesListCommentsForRepoApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesListCommentsForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesListCommentsForRepo(
    owner: String,
    repo: String,
    direction: InlineReposIssuesCommentsGetParameterX399682d1? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    sort: InlineSortParameterX37db756f? = null,
    options: CallOptions = CallOptions(),
  ): List<IssueComment> = executor.executeWithTypedErrors<Unit, IssuesListCommentsForRepoResponse, List<IssueComment>>(
    request = SdkExecutionRequest(issuesListCommentsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = IssuesCodecs.issuesListCommentsForRepoRequestCodecRegistry,
    responseDecoder = IssuesListCommentsForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesListCommentsForRepoResponse.SuccessJson -> response.json
        is IssuesListCommentsForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListCommentsForRepoResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListCommentsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesListCommentsForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesListCommentsForRepoResponse.Http404Json -> IssuesListCommentsForRepoApiException(response, statusCode, headers)
        is IssuesListCommentsForRepoResponse.Http422Json -> IssuesListCommentsForRepoApiException(response, statusCode, headers)
        is IssuesListCommentsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * You can use the REST API to list comments on issues and pull requests for a repository. Every pull request is an
   * issue, but not every issue is a pull request.
   *
   * By default, issue comments are ordered by ascending ID.
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
   * @param direction Either `asc` or `desc`. Ignored without the `sort` parameter.
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
  public suspend fun issuesListCommentsForRepoWithResponse(
    owner: String,
    repo: String,
    direction: InlineReposIssuesCommentsGetParameterX399682d1? = null,
    page: Int? = null,
    perPage: Int? = null,
    since: String? = null,
    sort: InlineSortParameterX37db756f? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesListCommentsForRepoResponse> = executor.executeWithResponse<Unit, IssuesListCommentsForRepoResponse>(SdkExecutionRequest(issuesListCommentsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "since", values = since?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuesCodecs.issuesListCommentsForRepoRequestCodecRegistry, IssuesListCommentsForRepoResponseDecoder, options)

  /**
   * Lists all events for an issue.
   *
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesListEventsApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded IssuesListEventsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesListEvents(
    issueNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<IssueEventForIssue> = executor.executeWithTypedErrors<Unit, IssuesListEventsResponse, List<IssueEventForIssue>>(
    request = SdkExecutionRequest(issuesListEventsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = IssuesCodecs.issuesListEventsRequestCodecRegistry,
    responseDecoder = IssuesListEventsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesListEventsResponse.SuccessJson -> response.json
        is IssuesListEventsResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListEventsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesListEventsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesListEventsResponse.Http410Json -> IssuesListEventsApiException(response, statusCode, headers)
        is IssuesListEventsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all events for an issue.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun issuesListEventsWithResponse(
    issueNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesListEventsResponse> = executor.executeWithResponse<Unit, IssuesListEventsResponse>(SdkExecutionRequest(issuesListEventsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuesCodecs.issuesListEventsRequestCodecRegistry, IssuesListEventsResponseDecoder, options)

  /**
   * Lists all issue field values for an issue.
   *
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesListIssueFieldValuesForIssueApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded IssuesListIssueFieldValuesForIssueError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesListIssueFieldValuesForIssue(
    issueNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<IssueFieldValue> = executor.executeWithTypedErrors<Unit, IssuesListIssueFieldValuesForIssueResponse, List<IssueFieldValue>>(
    request = SdkExecutionRequest(issuesListIssueFieldValuesForIssueMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = IssuesCodecs.issuesListIssueFieldValuesForIssueRequestCodecRegistry,
    responseDecoder = IssuesListIssueFieldValuesForIssueResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesListIssueFieldValuesForIssueResponse.SuccessJson -> response.json
        is IssuesListIssueFieldValuesForIssueResponse.Http301Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListIssueFieldValuesForIssueResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListIssueFieldValuesForIssueResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListIssueFieldValuesForIssueResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesListIssueFieldValuesForIssueResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesListIssueFieldValuesForIssueResponse.Http301Json -> IssuesListIssueFieldValuesForIssueApiException(response, statusCode, headers)
        is IssuesListIssueFieldValuesForIssueResponse.Http404Json -> IssuesListIssueFieldValuesForIssueApiException(response, statusCode, headers)
        is IssuesListIssueFieldValuesForIssueResponse.Http410Json -> IssuesListIssueFieldValuesForIssueApiException(response, statusCode, headers)
        is IssuesListIssueFieldValuesForIssueResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all issue field values for an issue.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun issuesListIssueFieldValuesForIssueWithResponse(
    issueNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesListIssueFieldValuesForIssueResponse> = executor.executeWithResponse<Unit, IssuesListIssueFieldValuesForIssueResponse>(SdkExecutionRequest(issuesListIssueFieldValuesForIssueMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuesCodecs.issuesListIssueFieldValuesForIssueRequestCodecRegistry, IssuesListIssueFieldValuesForIssueResponseDecoder, options)

  /**
   * Lists labels for issues in a milestone.
   *
   * @param milestoneNumber The number that identifies the milestone.
   * @param owner The account owner of the repository. The name is not case sensitive.
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
  public suspend fun issuesListLabelsForMilestone(
    milestoneNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Label> = executor.execute<Unit, List<Label>>(SdkExecutionRequest(issuesListLabelsForMilestoneMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "milestone_number", values = listOf(milestoneNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(IssuesCodecs.ISSUESLISTLABELSFORMILESTONE_RESPONSE_CODEC_ID), IssuesCodecs.issuesListLabelsForMilestoneRequestCodecRegistry, IssuesCodecs.issuesListLabelsForMilestoneResponseCodecRegistry, options)

  /**
   * Lists labels for issues in a milestone.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param milestoneNumber The number that identifies the milestone.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun issuesListLabelsForMilestoneWithResponse(
    milestoneNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesListLabelsForMilestoneResponse> = executor.executeWithResponse<Unit, IssuesListLabelsForMilestoneResponse>(SdkExecutionRequest(issuesListLabelsForMilestoneMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "milestone_number", values = listOf(milestoneNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuesCodecs.issuesListLabelsForMilestoneRequestCodecRegistry, IssuesListLabelsForMilestoneResponseDecoder, options)

  /**
   * Lists all labels for a repository.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesListLabelsForRepoApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesListLabelsForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesListLabelsForRepo(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Label> = executor.executeWithTypedErrors<Unit, IssuesListLabelsForRepoResponse, List<Label>>(
    request = SdkExecutionRequest(issuesListLabelsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = IssuesCodecs.issuesListLabelsForRepoRequestCodecRegistry,
    responseDecoder = IssuesListLabelsForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesListLabelsForRepoResponse.SuccessJson -> response.json
        is IssuesListLabelsForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListLabelsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesListLabelsForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesListLabelsForRepoResponse.Http404Json -> IssuesListLabelsForRepoApiException(response, statusCode, headers)
        is IssuesListLabelsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all labels for a repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun issuesListLabelsForRepoWithResponse(
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesListLabelsForRepoResponse> = executor.executeWithResponse<Unit, IssuesListLabelsForRepoResponse>(SdkExecutionRequest(issuesListLabelsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuesCodecs.issuesListLabelsForRepoRequestCodecRegistry, IssuesListLabelsForRepoResponseDecoder, options)

  /**
   * Lists all labels for an issue.
   *
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesListLabelsOnIssueApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesListLabelsOnIssueError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesListLabelsOnIssue(
    issueNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Label> = executor.executeWithTypedErrors<Unit, IssuesListLabelsOnIssueResponse, List<Label>>(
    request = SdkExecutionRequest(issuesListLabelsOnIssueMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = IssuesCodecs.issuesListLabelsOnIssueRequestCodecRegistry,
    responseDecoder = IssuesListLabelsOnIssueResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesListLabelsOnIssueResponse.SuccessJson -> response.json
        is IssuesListLabelsOnIssueResponse.Http301Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListLabelsOnIssueResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListLabelsOnIssueResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListLabelsOnIssueResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesListLabelsOnIssueResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesListLabelsOnIssueResponse.Http301Json -> IssuesListLabelsOnIssueApiException(response, statusCode, headers)
        is IssuesListLabelsOnIssueResponse.Http404Json -> IssuesListLabelsOnIssueApiException(response, statusCode, headers)
        is IssuesListLabelsOnIssueResponse.Http410Json -> IssuesListLabelsOnIssueApiException(response, statusCode, headers)
        is IssuesListLabelsOnIssueResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all labels for an issue.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun issuesListLabelsOnIssueWithResponse(
    issueNumber: Int,
    owner: String,
    repo: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesListLabelsOnIssueResponse> = executor.executeWithResponse<Unit, IssuesListLabelsOnIssueResponse>(SdkExecutionRequest(issuesListLabelsOnIssueMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuesCodecs.issuesListLabelsOnIssueRequestCodecRegistry, IssuesListLabelsOnIssueResponseDecoder, options)

  /**
   * Lists milestones for a repository.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param direction The direction of the sort. Either `asc` or `desc`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort What to sort results by. Either `due_on` or `completeness`.
   * @param state The state of the milestone. Either `open`, `closed`, or `all`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesListMilestonesApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesListMilestonesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesListMilestones(
    owner: String,
    repo: String,
    direction: InlineReposMilestonesGetParameterX9f0c461a? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineReposMilestonesGetParameterX8cb0fde4? = null,
    state: InlineReposMilestonesGetParameterXa5cf1c3b? = null,
    options: CallOptions = CallOptions(),
  ): List<Milestone> = executor.executeWithTypedErrors<Unit, IssuesListMilestonesResponse, List<Milestone>>(
    request = SdkExecutionRequest(issuesListMilestonesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = IssuesCodecs.issuesListMilestonesRequestCodecRegistry,
    responseDecoder = IssuesListMilestonesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesListMilestonesResponse.SuccessJson -> response.json
        is IssuesListMilestonesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesListMilestonesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesListMilestonesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesListMilestonesResponse.Http404Json -> IssuesListMilestonesApiException(response, statusCode, headers)
        is IssuesListMilestonesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists milestones for a repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param direction The direction of the sort. Either `asc` or `desc`.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param sort What to sort results by. Either `due_on` or `completeness`.
   * @param state The state of the milestone. Either `open`, `closed`, or `all`.
   * @param options Execution options.
   */
  public suspend fun issuesListMilestonesWithResponse(
    owner: String,
    repo: String,
    direction: InlineReposMilestonesGetParameterX9f0c461a? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineReposMilestonesGetParameterX8cb0fde4? = null,
    state: InlineReposMilestonesGetParameterXa5cf1c3b? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesListMilestonesResponse> = executor.executeWithResponse<Unit, IssuesListMilestonesResponse>(SdkExecutionRequest(issuesListMilestonesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuesCodecs.issuesListMilestonesRequestCodecRegistry, IssuesListMilestonesResponseDecoder, options)

  /**
   * Users with push access can lock an issue or pull request's conversation.
   *
   * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out
   * to this endpoint. For more information, see "[HTTP
   * method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws IssuesLockApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded IssuesLockError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesLock(
    request: InlineReposIssuesLockPutRequestJsonXbf8f79bc? = null,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineReposIssuesLockPutRequestJsonXbf8f79bc?, IssuesLockResponse, Unit>(
    request = SdkExecutionRequest(issuesLockMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESLOCK_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesLockRequestCodecRegistry,
    responseDecoder = IssuesLockResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesLockResponse.SuccessNoContent -> response.unit
        is IssuesLockResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesLockResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesLockResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesLockResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesLockResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesLockResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is IssuesLockResponse.Http403Json -> IssuesLockApiException(response, statusCode, headers)
        is IssuesLockResponse.Http404Json -> IssuesLockApiException(response, statusCode, headers)
        is IssuesLockResponse.Http410Json -> IssuesLockApiException(response, statusCode, headers)
        is IssuesLockResponse.Http422Json -> IssuesLockApiException(response, statusCode, headers)
        is IssuesLockResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Users with push access can lock an issue or pull request's conversation.
   *
   * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out
   * to this endpoint. For more information, see "[HTTP
   * method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesLockWithResponse(
    request: InlineReposIssuesLockPutRequestJsonXbf8f79bc? = null,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesLockResponse> = executor.executeWithResponse<InlineReposIssuesLockPutRequestJsonXbf8f79bc?, IssuesLockResponse>(SdkExecutionRequest(issuesLockMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESLOCK_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesLockRequestCodecRegistry, IssuesLockResponseDecoder, options)

  /**
   * You can use the REST API to pin comments on issues.
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
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesPinCommentApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded IssuesPinCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesPinComment(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): IssueComment = executor.executeWithTypedErrors<Unit, IssuesPinCommentResponse, IssueComment>(
    request = SdkExecutionRequest(issuesPinCommentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesPinCommentRequestCodecRegistry,
    responseDecoder = IssuesPinCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesPinCommentResponse.SuccessJson -> response.json
        is IssuesPinCommentResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesPinCommentResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesPinCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesPinCommentResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesPinCommentResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesPinCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesPinCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesPinCommentResponse.Http401Json -> IssuesPinCommentApiException(response, statusCode, headers)
        is IssuesPinCommentResponse.Http403Json -> IssuesPinCommentApiException(response, statusCode, headers)
        is IssuesPinCommentResponse.Http404Json -> IssuesPinCommentApiException(response, statusCode, headers)
        is IssuesPinCommentResponse.Http410Json -> IssuesPinCommentApiException(response, statusCode, headers)
        is IssuesPinCommentResponse.Http422Json -> IssuesPinCommentApiException(response, statusCode, headers)
        is IssuesPinCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * You can use the REST API to pin comments on issues.
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
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesPinCommentWithResponse(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesPinCommentResponse> = executor.executeWithResponse<Unit, IssuesPinCommentResponse>(SdkExecutionRequest(issuesPinCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesPinCommentRequestCodecRegistry, IssuesPinCommentResponseDecoder, options)

  /**
   * Removes all labels from an issue.
   *
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws IssuesRemoveAllLabelsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesRemoveAllLabelsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesRemoveAllLabels(
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, IssuesRemoveAllLabelsResponse, Unit>(
    request = SdkExecutionRequest(issuesRemoveAllLabelsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesRemoveAllLabelsRequestCodecRegistry,
    responseDecoder = IssuesRemoveAllLabelsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesRemoveAllLabelsResponse.SuccessNoContent -> response.unit
        is IssuesRemoveAllLabelsResponse.Http301Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesRemoveAllLabelsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesRemoveAllLabelsResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesRemoveAllLabelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesRemoveAllLabelsResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is IssuesRemoveAllLabelsResponse.Http301Json -> IssuesRemoveAllLabelsApiException(response, statusCode, headers)
        is IssuesRemoveAllLabelsResponse.Http404Json -> IssuesRemoveAllLabelsApiException(response, statusCode, headers)
        is IssuesRemoveAllLabelsResponse.Http410Json -> IssuesRemoveAllLabelsApiException(response, statusCode, headers)
        is IssuesRemoveAllLabelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes all labels from an issue.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesRemoveAllLabelsWithResponse(
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesRemoveAllLabelsResponse> = executor.executeWithResponse<Unit, IssuesRemoveAllLabelsResponse>(SdkExecutionRequest(issuesRemoveAllLabelsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesRemoveAllLabelsRequestCodecRegistry, IssuesRemoveAllLabelsResponseDecoder, options)

  /**
   * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a
   * `404 Not Found` status if the label does not exist.
   *
   * @param issueNumber The number that identifies the issue.
   * @param name Wire parameter `name`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesRemoveLabelApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesRemoveLabelError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesRemoveLabel(
    issueNumber: Int,
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): List<Label> = executor.executeWithTypedErrors<Unit, IssuesRemoveLabelResponse, List<Label>>(
    request = SdkExecutionRequest(issuesRemoveLabelMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesRemoveLabelRequestCodecRegistry,
    responseDecoder = IssuesRemoveLabelResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesRemoveLabelResponse.SuccessJson -> response.json
        is IssuesRemoveLabelResponse.Http301Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesRemoveLabelResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesRemoveLabelResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesRemoveLabelResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesRemoveLabelResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesRemoveLabelResponse.Http301Json -> IssuesRemoveLabelApiException(response, statusCode, headers)
        is IssuesRemoveLabelResponse.Http404Json -> IssuesRemoveLabelApiException(response, statusCode, headers)
        is IssuesRemoveLabelResponse.Http410Json -> IssuesRemoveLabelApiException(response, statusCode, headers)
        is IssuesRemoveLabelResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes the specified label from the issue, and returns the remaining labels on the issue. This endpoint returns a
   * `404 Not Found` status if the label does not exist.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param issueNumber The number that identifies the issue.
   * @param name Wire parameter `name`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesRemoveLabelWithResponse(
    issueNumber: Int,
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesRemoveLabelResponse> = executor.executeWithResponse<Unit, IssuesRemoveLabelResponse>(SdkExecutionRequest(issuesRemoveLabelMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesRemoveLabelRequestCodecRegistry, IssuesRemoveLabelResponseDecoder, options)

  /**
   * Set custom field values for an issue, replacing any existing values. You can set values for organization-level
   * issue fields that have been defined for the repository's organization.
   *
   * This endpoint supports the following field data types:
   * - **`text`**: String values for text fields
   * - **`single_select`**: Option names for single-select fields (must match an existing option name)
   * - **`number`**: Numeric values for number fields
   * - **`date`**: ISO 8601 date strings for date fields
   *
   * This operation will replace all existing field values with the provided ones. If you want to add field values
   * without replacing existing ones, use the `POST` endpoint instead.
   *
   * Only users with push access to the repository can set issue field values. If you don't have the proper permissions,
   * you'll receive a `403 Forbidden` response.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesSetIssueFieldValuesApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesSetIssueFieldValuesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesSetIssueFieldValues(
    request: InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): List<IssueFieldValue> = executor.executeWithTypedErrors<InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc, IssuesSetIssueFieldValuesResponse, List<IssueFieldValue>>(
    request = SdkExecutionRequest(issuesSetIssueFieldValuesMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESSETISSUEFIELDVALUES_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesSetIssueFieldValuesRequestCodecRegistry,
    responseDecoder = IssuesSetIssueFieldValuesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesSetIssueFieldValuesResponse.SuccessJson -> response.json
        is IssuesSetIssueFieldValuesResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesSetIssueFieldValuesResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is IssuesSetIssueFieldValuesResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesSetIssueFieldValuesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesSetIssueFieldValuesResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesSetIssueFieldValuesResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesSetIssueFieldValuesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesSetIssueFieldValuesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesSetIssueFieldValuesResponse.Http400Json -> IssuesSetIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesSetIssueFieldValuesResponse.Http400ScimJson -> IssuesSetIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesSetIssueFieldValuesResponse.Http403Json -> IssuesSetIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesSetIssueFieldValuesResponse.Http404Json -> IssuesSetIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesSetIssueFieldValuesResponse.Http422Json -> IssuesSetIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesSetIssueFieldValuesResponse.Http503Json -> IssuesSetIssueFieldValuesApiException(response, statusCode, headers)
        is IssuesSetIssueFieldValuesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Set custom field values for an issue, replacing any existing values. You can set values for organization-level
   * issue fields that have been defined for the repository's organization.
   *
   * This endpoint supports the following field data types:
   * - **`text`**: String values for text fields
   * - **`single_select`**: Option names for single-select fields (must match an existing option name)
   * - **`number`**: Numeric values for number fields
   * - **`date`**: ISO 8601 date strings for date fields
   *
   * This operation will replace all existing field values with the provided ones. If you want to add field values
   * without replacing existing ones, use the `POST` endpoint instead.
   *
   * Only users with push access to the repository can set issue field values. If you don't have the proper permissions,
   * you'll receive a `403 Forbidden` response.
   *
   * This endpoint triggers
   * [notifications](https://docs.github.com/github/managing-subscriptions-and-notifications-on-github/about-notificatio
   * ns). Creating content too quickly using this endpoint may result in secondary rate limiting. For more information,
   * see "[Rate limits for the
   * API](https://docs.github.com/rest/using-the-rest-api/rate-limits-for-the-rest-api#about-secondary-rate-limits)"
   * and "[Best practices for using the REST
   * API](https://docs.github.com/rest/guides/best-practices-for-using-the-rest-api)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesSetIssueFieldValuesWithResponse(
    request: InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesSetIssueFieldValuesResponse> = executor.executeWithResponse<InlineReposIssuesIssueFieldValuesPutRequestJsonXb4ea8cdc, IssuesSetIssueFieldValuesResponse>(SdkExecutionRequest(issuesSetIssueFieldValuesMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESSETISSUEFIELDVALUES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesSetIssueFieldValuesRequestCodecRegistry, IssuesSetIssueFieldValuesResponseDecoder, options)

  /**
   * Removes any previous labels and sets the new labels for an issue.
   *
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesSetLabelsApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded IssuesSetLabelsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesSetLabels(
    request: InlineReposIssuesLabelsPutRequestJsonX7d91fbad? = null,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): List<Label> = executor.executeWithTypedErrors<InlineReposIssuesLabelsPutRequestJsonX7d91fbad?, IssuesSetLabelsResponse, List<Label>>(
    request = SdkExecutionRequest(issuesSetLabelsMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESSETLABELS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesSetLabelsRequestCodecRegistry,
    responseDecoder = IssuesSetLabelsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesSetLabelsResponse.SuccessJson -> response.json
        is IssuesSetLabelsResponse.Http301Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesSetLabelsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesSetLabelsResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesSetLabelsResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesSetLabelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesSetLabelsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesSetLabelsResponse.Http301Json -> IssuesSetLabelsApiException(response, statusCode, headers)
        is IssuesSetLabelsResponse.Http404Json -> IssuesSetLabelsApiException(response, statusCode, headers)
        is IssuesSetLabelsResponse.Http410Json -> IssuesSetLabelsApiException(response, statusCode, headers)
        is IssuesSetLabelsResponse.Http422Json -> IssuesSetLabelsApiException(response, statusCode, headers)
        is IssuesSetLabelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes any previous labels and sets the new labels for an issue.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesSetLabelsWithResponse(
    request: InlineReposIssuesLabelsPutRequestJsonX7d91fbad? = null,
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesSetLabelsResponse> = executor.executeWithResponse<InlineReposIssuesLabelsPutRequestJsonX7d91fbad?, IssuesSetLabelsResponse>(SdkExecutionRequest(issuesSetLabelsMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESSETLABELS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesSetLabelsRequestCodecRegistry, IssuesSetLabelsResponseDecoder, options)

  /**
   * Users with push access can unlock an issue's conversation.
   *
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws IssuesUnlockApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded IssuesUnlockError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesUnlock(
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, IssuesUnlockResponse, Unit>(
    request = SdkExecutionRequest(issuesUnlockMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesUnlockRequestCodecRegistry,
    responseDecoder = IssuesUnlockResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesUnlockResponse.SuccessNoContent -> response.unit
        is IssuesUnlockResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesUnlockResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesUnlockResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesUnlockResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is IssuesUnlockResponse.Http403Json -> IssuesUnlockApiException(response, statusCode, headers)
        is IssuesUnlockResponse.Http404Json -> IssuesUnlockApiException(response, statusCode, headers)
        is IssuesUnlockResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Users with push access can unlock an issue's conversation.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param issueNumber The number that identifies the issue.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesUnlockWithResponse(
    issueNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesUnlockResponse> = executor.executeWithResponse<Unit, IssuesUnlockResponse>(SdkExecutionRequest(issuesUnlockMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "issue_number", values = listOf(issueNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesUnlockRequestCodecRegistry, IssuesUnlockResponseDecoder, options)

  /**
   * You can use the REST API to unpin comments on issues.
   *
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws IssuesUnpinCommentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesUnpinCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesUnpinComment(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, IssuesUnpinCommentResponse, Unit>(
    request = SdkExecutionRequest(issuesUnpinCommentMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesUnpinCommentRequestCodecRegistry,
    responseDecoder = IssuesUnpinCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesUnpinCommentResponse.SuccessNoContent -> response.unit
        is IssuesUnpinCommentResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesUnpinCommentResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesUnpinCommentResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesUnpinCommentResponse.Http410Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesUnpinCommentResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesUnpinCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesUnpinCommentResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is IssuesUnpinCommentResponse.Http401Json -> IssuesUnpinCommentApiException(response, statusCode, headers)
        is IssuesUnpinCommentResponse.Http403Json -> IssuesUnpinCommentApiException(response, statusCode, headers)
        is IssuesUnpinCommentResponse.Http404Json -> IssuesUnpinCommentApiException(response, statusCode, headers)
        is IssuesUnpinCommentResponse.Http410Json -> IssuesUnpinCommentApiException(response, statusCode, headers)
        is IssuesUnpinCommentResponse.Http503Json -> IssuesUnpinCommentApiException(response, statusCode, headers)
        is IssuesUnpinCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * You can use the REST API to unpin comments on issues.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesUnpinCommentWithResponse(
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesUnpinCommentResponse> = executor.executeWithResponse<Unit, IssuesUnpinCommentResponse>(SdkExecutionRequest(issuesUnpinCommentMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesUnpinCommentRequestCodecRegistry, IssuesUnpinCommentResponseDecoder, options)

  /**
   * You can use the REST API to update comments on issues and pull requests. Every pull request is an issue, but not
   * every issue is a pull request.
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
   * @param request Request body sent to the operation.
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws IssuesUpdateCommentApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded IssuesUpdateCommentError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesUpdateComment(
    request: InlineReposIssuesCommentsPatchRequestJsonX7f04be98,
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): IssueComment = executor.executeWithTypedErrors<InlineReposIssuesCommentsPatchRequestJsonX7f04be98, IssuesUpdateCommentResponse, IssueComment>(
    request = SdkExecutionRequest(issuesUpdateCommentMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESUPDATECOMMENT_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = IssuesCodecs.issuesUpdateCommentRequestCodecRegistry,
    responseDecoder = IssuesUpdateCommentResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is IssuesUpdateCommentResponse.SuccessJson -> response.json
        is IssuesUpdateCommentResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is IssuesUpdateCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is IssuesUpdateCommentResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is IssuesUpdateCommentResponse.Http422Json -> IssuesUpdateCommentApiException(response, statusCode, headers)
        is IssuesUpdateCommentResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * You can use the REST API to update comments on issues and pull requests. Every pull request is an issue, but not
   * every issue is a pull request.
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
   * @param request Request body sent to the operation.
   * @param commentId The unique identifier of the comment.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesUpdateCommentWithResponse(
    request: InlineReposIssuesCommentsPatchRequestJsonX7f04be98,
    commentId: Long,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesUpdateCommentResponse> = executor.executeWithResponse<InlineReposIssuesCommentsPatchRequestJsonX7f04be98, IssuesUpdateCommentResponse>(SdkExecutionRequest(issuesUpdateCommentMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESUPDATECOMMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "comment_id", values = listOf(commentId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesUpdateCommentRequestCodecRegistry, IssuesUpdateCommentResponseDecoder, options)

  /**
   * Updates a label using the given label name.
   *
   * @param request Request body sent to the operation.
   * @param name Wire parameter `name`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesUpdateLabel(
    request: InlineReposLabelsPatchRequestJsonXb7f85b4a? = null,
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Label = executor.execute<InlineReposLabelsPatchRequestJsonXb7f85b4a?, Label>(SdkExecutionRequest(issuesUpdateLabelMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESUPDATELABEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(IssuesCodecs.ISSUESUPDATELABEL_RESPONSE_CODEC_ID), IssuesCodecs.issuesUpdateLabelRequestCodecRegistry, IssuesCodecs.issuesUpdateLabelResponseCodecRegistry, options)

  /**
   * Updates a label using the given label name.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param name Wire parameter `name`.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesUpdateLabelWithResponse(
    request: InlineReposLabelsPatchRequestJsonXb7f85b4a? = null,
    name: String,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesUpdateLabelResponse> = executor.executeWithResponse<InlineReposLabelsPatchRequestJsonXb7f85b4a?, IssuesUpdateLabelResponse>(SdkExecutionRequest(issuesUpdateLabelMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESUPDATELABEL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesUpdateLabelRequestCodecRegistry, IssuesUpdateLabelResponseDecoder, options)

  /**
   *
   *
   * @param request Request body sent to the operation.
   * @param milestoneNumber The number that identifies the milestone.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun issuesUpdateMilestone(
    request: InlineReposMilestonesPatchRequestJsonXd61f2cae? = null,
    milestoneNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Milestone = executor.execute<InlineReposMilestonesPatchRequestJsonXd61f2cae?, Milestone>(SdkExecutionRequest(issuesUpdateMilestoneMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESUPDATEMILESTONE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "milestone_number", values = listOf(milestoneNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(IssuesCodecs.ISSUESUPDATEMILESTONE_RESPONSE_CODEC_ID), IssuesCodecs.issuesUpdateMilestoneRequestCodecRegistry, IssuesCodecs.issuesUpdateMilestoneResponseCodecRegistry, options)

  /**
   *
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param milestoneNumber The number that identifies the milestone.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun issuesUpdateMilestoneWithResponse(
    request: InlineReposMilestonesPatchRequestJsonXd61f2cae? = null,
    milestoneNumber: Int,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<IssuesUpdateMilestoneResponse> = executor.executeWithResponse<InlineReposMilestonesPatchRequestJsonXd61f2cae?, IssuesUpdateMilestoneResponse>(SdkExecutionRequest(issuesUpdateMilestoneMetadata, baseUri, request, listOf(IssuesCodecs.ISSUESUPDATEMILESTONE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "milestone_number", values = listOf(milestoneNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), IssuesCodecs.issuesUpdateMilestoneRequestCodecRegistry, IssuesUpdateMilestoneResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `issues/add-issue-field-values` may expose through its typed API
   * exception.
   */
  public sealed interface IssuesAddIssueFieldValuesError

  /**
   * Typed response alternatives for `issues/add-issue-field-values`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface IssuesAddIssueFieldValuesResponse {
    public class SuccessJson(
      public val json: List<IssueFieldValue>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddIssueFieldValuesResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddIssueFieldValuesResponse,
        IssuesAddIssueFieldValuesError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddIssueFieldValuesResponse,
        IssuesAddIssueFieldValuesError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddIssueFieldValuesResponse,
        IssuesAddIssueFieldValuesError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddIssueFieldValuesResponse,
        IssuesAddIssueFieldValuesError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddIssueFieldValuesResponse,
        IssuesAddIssueFieldValuesError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddIssueFieldValuesResponse,
        IssuesAddIssueFieldValuesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddIssueFieldValuesResponse
  }

  /**
   * Raised by `issues/add-issue-field-values` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class IssuesAddIssueFieldValuesApiException(
    public val error: IssuesAddIssueFieldValuesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/add-issue-field-values")

  private object IssuesAddIssueFieldValuesResponseDecoder : SdkResponseAlternativeDecoder<IssuesAddIssueFieldValuesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesAddIssueFieldValuesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesAddIssueFieldValuesResponse> = when {
      alternative.id == "issues/add-issue-field-values.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesAddIssueFieldValuesResponse.SuccessJson(
          json = IssuesCodecs.issuesAddIssueFieldValuesResponseCodecAlternative0Registry.select(listOf("issues/add-issue-field-values.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/add-issue-field-values.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesAddIssueFieldValuesResponse.Http400Json(
          json = IssuesCodecs.issuesAddIssueFieldValuesResponseCodecAlternative1Registry.select(listOf("issues/add-issue-field-values.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/add-issue-field-values.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesAddIssueFieldValuesResponse.Http400ScimJson(
          json = IssuesCodecs.issuesAddIssueFieldValuesResponseCodecAlternative2Registry.select(listOf("issues/add-issue-field-values.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/add-issue-field-values.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesAddIssueFieldValuesResponse.Http403Json(
          json = IssuesCodecs.issuesAddIssueFieldValuesResponseCodecAlternative3Registry.select(listOf("issues/add-issue-field-values.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/add-issue-field-values.response.alternative4" -> SdkResponseDecodeResult(
        value = IssuesAddIssueFieldValuesResponse.Http404Json(
          json = IssuesCodecs.issuesAddIssueFieldValuesResponseCodecAlternative4Registry.select(listOf("issues/add-issue-field-values.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/add-issue-field-values.response.alternative5" -> SdkResponseDecodeResult(
        value = IssuesAddIssueFieldValuesResponse.Http422Json(
          json = IssuesCodecs.issuesAddIssueFieldValuesResponseCodecAlternative5Registry.select(listOf("issues/add-issue-field-values.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/add-issue-field-values.response.alternative6" -> SdkResponseDecodeResult(
        value = IssuesAddIssueFieldValuesResponse.Http503Json(
          json = IssuesCodecs.issuesAddIssueFieldValuesResponseCodecAlternative6Registry.select(listOf("issues/add-issue-field-values.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesAddIssueFieldValuesResponse = IssuesAddIssueFieldValuesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/add-labels` may expose through its typed API exception.
   */
  public sealed interface IssuesAddLabelsError

  /**
   * Typed response alternatives for `issues/add-labels`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesAddLabelsResponse {
    public class SuccessJson(
      public val json: List<Label>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddLabelsResponse

    public class Http301Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddLabelsResponse,
        IssuesAddLabelsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddLabelsResponse,
        IssuesAddLabelsError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddLabelsResponse,
        IssuesAddLabelsError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddLabelsResponse,
        IssuesAddLabelsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesAddLabelsResponse
  }

  /**
   * Raised by `issues/add-labels` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class IssuesAddLabelsApiException(
    public val error: IssuesAddLabelsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/add-labels")

  private object IssuesAddLabelsResponseDecoder : SdkResponseAlternativeDecoder<IssuesAddLabelsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesAddLabelsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesAddLabelsResponse> = when {
      alternative.id == "issues/add-labels.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesAddLabelsResponse.SuccessJson(
          json = IssuesCodecs.issuesAddLabelsResponseCodecAlternative0Registry.select(listOf("issues/add-labels.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/add-labels.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesAddLabelsResponse.Http301Json(
          json = IssuesCodecs.issuesAddLabelsResponseCodecAlternative1Registry.select(listOf("issues/add-labels.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/add-labels.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesAddLabelsResponse.Http404Json(
          json = IssuesCodecs.issuesAddLabelsResponseCodecAlternative2Registry.select(listOf("issues/add-labels.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/add-labels.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesAddLabelsResponse.Http410Json(
          json = IssuesCodecs.issuesAddLabelsResponseCodecAlternative3Registry.select(listOf("issues/add-labels.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/add-labels.response.alternative4" -> SdkResponseDecodeResult(
        value = IssuesAddLabelsResponse.Http422Json(
          json = IssuesCodecs.issuesAddLabelsResponseCodecAlternative4Registry.select(listOf("issues/add-labels.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesAddLabelsResponse = IssuesAddLabelsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/check-user-can-be-assigned` may expose through its typed API
   * exception.
   */
  public sealed interface IssuesCheckUserCanBeAssignedError

  /**
   * Typed response alternatives for `issues/check-user-can-be-assigned`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface IssuesCheckUserCanBeAssignedResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCheckUserCanBeAssignedResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCheckUserCanBeAssignedResponse,
        IssuesCheckUserCanBeAssignedError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCheckUserCanBeAssignedResponse
  }

  /**
   * Raised by `issues/check-user-can-be-assigned` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class IssuesCheckUserCanBeAssignedApiException(
    public val error: IssuesCheckUserCanBeAssignedError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/check-user-can-be-assigned")

  private object IssuesCheckUserCanBeAssignedResponseDecoder : SdkResponseAlternativeDecoder<IssuesCheckUserCanBeAssignedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesCheckUserCanBeAssignedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesCheckUserCanBeAssignedResponse> = when {
      alternative.id == "issues/check-user-can-be-assigned.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesCheckUserCanBeAssignedResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/check-user-can-be-assigned.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesCheckUserCanBeAssignedResponse.Http404Json(
          json = IssuesCodecs.issuesCheckUserCanBeAssignedResponseCodecAlternative1Registry.select(listOf("issues/check-user-can-be-assigned.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesCheckUserCanBeAssignedResponse = IssuesCheckUserCanBeAssignedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/check-user-can-be-assigned-to-issue` may expose through its
   * typed API exception.
   */
  public sealed interface IssuesCheckUserCanBeAssignedToIssueError

  /**
   * Typed response alternatives for `issues/check-user-can-be-assigned-to-issue`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface IssuesCheckUserCanBeAssignedToIssueResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCheckUserCanBeAssignedToIssueResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCheckUserCanBeAssignedToIssueResponse,
        IssuesCheckUserCanBeAssignedToIssueError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCheckUserCanBeAssignedToIssueResponse
  }

  /**
   * Raised by `issues/check-user-can-be-assigned-to-issue` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class IssuesCheckUserCanBeAssignedToIssueApiException(
    public val error: IssuesCheckUserCanBeAssignedToIssueError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/check-user-can-be-assigned-to-issue")

  private object IssuesCheckUserCanBeAssignedToIssueResponseDecoder : SdkResponseAlternativeDecoder<IssuesCheckUserCanBeAssignedToIssueResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesCheckUserCanBeAssignedToIssueResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesCheckUserCanBeAssignedToIssueResponse> = when {
      alternative.id == "issues/check-user-can-be-assigned-to-issue.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesCheckUserCanBeAssignedToIssueResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/check-user-can-be-assigned-to-issue.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesCheckUserCanBeAssignedToIssueResponse.Http404Json(
          json = IssuesCodecs.issuesCheckUserCanBeAssignedToIssueResponseCodecAlternative1Registry.select(listOf("issues/check-user-can-be-assigned-to-issue.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesCheckUserCanBeAssignedToIssueResponse = IssuesCheckUserCanBeAssignedToIssueResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/create-comment` may expose through its typed API exception.
   */
  public sealed interface IssuesCreateCommentError

  /**
   * Typed response alternatives for `issues/create-comment`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesCreateCommentResponse {
    public class SuccessJson(
      public val json: IssueComment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateCommentResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateCommentResponse,
        IssuesCreateCommentError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateCommentResponse,
        IssuesCreateCommentError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateCommentResponse,
        IssuesCreateCommentError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateCommentResponse,
        IssuesCreateCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateCommentResponse
  }

  /**
   * Raised by `issues/create-comment` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesCreateCommentApiException(
    public val error: IssuesCreateCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/create-comment")

  private object IssuesCreateCommentResponseDecoder : SdkResponseAlternativeDecoder<IssuesCreateCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesCreateCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesCreateCommentResponse> = when {
      alternative.id == "issues/create-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesCreateCommentResponse.SuccessJson(
          json = IssuesCodecs.issuesCreateCommentResponseCodecAlternative0Registry.select(listOf("issues/create-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/create-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesCreateCommentResponse.Http403Json(
          json = IssuesCodecs.issuesCreateCommentResponseCodecAlternative1Registry.select(listOf("issues/create-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/create-comment.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesCreateCommentResponse.Http404Json(
          json = IssuesCodecs.issuesCreateCommentResponseCodecAlternative2Registry.select(listOf("issues/create-comment.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/create-comment.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesCreateCommentResponse.Http410Json(
          json = IssuesCodecs.issuesCreateCommentResponseCodecAlternative3Registry.select(listOf("issues/create-comment.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/create-comment.response.alternative4" -> SdkResponseDecodeResult(
        value = IssuesCreateCommentResponse.Http422Json(
          json = IssuesCodecs.issuesCreateCommentResponseCodecAlternative4Registry.select(listOf("issues/create-comment.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesCreateCommentResponse = IssuesCreateCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/create-label` may expose through its typed API exception.
   */
  public sealed interface IssuesCreateLabelError

  /**
   * Typed response alternatives for `issues/create-label`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesCreateLabelResponse {
    public class SuccessJson(
      public val json: Label,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateLabelResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateLabelResponse,
        IssuesCreateLabelError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateLabelResponse,
        IssuesCreateLabelError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateLabelResponse
  }

  /**
   * Raised by `issues/create-label` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesCreateLabelApiException(
    public val error: IssuesCreateLabelError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/create-label")

  private object IssuesCreateLabelResponseDecoder : SdkResponseAlternativeDecoder<IssuesCreateLabelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesCreateLabelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesCreateLabelResponse> = when {
      alternative.id == "issues/create-label.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesCreateLabelResponse.SuccessJson(
          json = IssuesCodecs.issuesCreateLabelResponseCodecAlternative0Registry.select(listOf("issues/create-label.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/create-label.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesCreateLabelResponse.Http404Json(
          json = IssuesCodecs.issuesCreateLabelResponseCodecAlternative1Registry.select(listOf("issues/create-label.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/create-label.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesCreateLabelResponse.Http422Json(
          json = IssuesCodecs.issuesCreateLabelResponseCodecAlternative2Registry.select(listOf("issues/create-label.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesCreateLabelResponse = IssuesCreateLabelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/create-milestone` may expose through its typed API
   * exception.
   */
  public sealed interface IssuesCreateMilestoneError

  /**
   * Typed response alternatives for `issues/create-milestone`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesCreateMilestoneResponse {
    public class SuccessJson(
      public val json: Milestone,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateMilestoneResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateMilestoneResponse,
        IssuesCreateMilestoneError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateMilestoneResponse,
        IssuesCreateMilestoneError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesCreateMilestoneResponse
  }

  /**
   * Raised by `issues/create-milestone` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesCreateMilestoneApiException(
    public val error: IssuesCreateMilestoneError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/create-milestone")

  private object IssuesCreateMilestoneResponseDecoder : SdkResponseAlternativeDecoder<IssuesCreateMilestoneResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesCreateMilestoneResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesCreateMilestoneResponse> = when {
      alternative.id == "issues/create-milestone.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesCreateMilestoneResponse.SuccessJson(
          json = IssuesCodecs.issuesCreateMilestoneResponseCodecAlternative0Registry.select(listOf("issues/create-milestone.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/create-milestone.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesCreateMilestoneResponse.Http404Json(
          json = IssuesCodecs.issuesCreateMilestoneResponseCodecAlternative1Registry.select(listOf("issues/create-milestone.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/create-milestone.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesCreateMilestoneResponse.Http422Json(
          json = IssuesCodecs.issuesCreateMilestoneResponseCodecAlternative2Registry.select(listOf("issues/create-milestone.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesCreateMilestoneResponse = IssuesCreateMilestoneResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `issues/delete-comment`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesDeleteCommentResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteCommentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteCommentResponse
  }

  private object IssuesDeleteCommentResponseDecoder : SdkResponseAlternativeDecoder<IssuesDeleteCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesDeleteCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesDeleteCommentResponse> = when {
      alternative.id == "issues/delete-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesDeleteCommentResponse.SuccessNoContent(
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
    ): IssuesDeleteCommentResponse = IssuesDeleteCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/delete-issue-field-value` may expose through its typed API
   * exception.
   */
  public sealed interface IssuesDeleteIssueFieldValueError

  /**
   * Typed response alternatives for `issues/delete-issue-field-value`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface IssuesDeleteIssueFieldValueResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteIssueFieldValueResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteIssueFieldValueResponse,
        IssuesDeleteIssueFieldValueError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteIssueFieldValueResponse,
        IssuesDeleteIssueFieldValueError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteIssueFieldValueResponse,
        IssuesDeleteIssueFieldValueError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteIssueFieldValueResponse,
        IssuesDeleteIssueFieldValueError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteIssueFieldValueResponse
  }

  /**
   * Raised by `issues/delete-issue-field-value` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class IssuesDeleteIssueFieldValueApiException(
    public val error: IssuesDeleteIssueFieldValueError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/delete-issue-field-value")

  private object IssuesDeleteIssueFieldValueResponseDecoder : SdkResponseAlternativeDecoder<IssuesDeleteIssueFieldValueResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesDeleteIssueFieldValueResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesDeleteIssueFieldValueResponse> = when {
      alternative.id == "issues/delete-issue-field-value.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesDeleteIssueFieldValueResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/delete-issue-field-value.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesDeleteIssueFieldValueResponse.Http403Json(
          json = IssuesCodecs.issuesDeleteIssueFieldValueResponseCodecAlternative1Registry.select(listOf("issues/delete-issue-field-value.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/delete-issue-field-value.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesDeleteIssueFieldValueResponse.Http404Json(
          json = IssuesCodecs.issuesDeleteIssueFieldValueResponseCodecAlternative2Registry.select(listOf("issues/delete-issue-field-value.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/delete-issue-field-value.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesDeleteIssueFieldValueResponse.Http422Json(
          json = IssuesCodecs.issuesDeleteIssueFieldValueResponseCodecAlternative3Registry.select(listOf("issues/delete-issue-field-value.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/delete-issue-field-value.response.alternative4" -> SdkResponseDecodeResult(
        value = IssuesDeleteIssueFieldValueResponse.Http503Json(
          json = IssuesCodecs.issuesDeleteIssueFieldValueResponseCodecAlternative4Registry.select(listOf("issues/delete-issue-field-value.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesDeleteIssueFieldValueResponse = IssuesDeleteIssueFieldValueResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `issues/delete-label`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesDeleteLabelResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteLabelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteLabelResponse
  }

  private object IssuesDeleteLabelResponseDecoder : SdkResponseAlternativeDecoder<IssuesDeleteLabelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesDeleteLabelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesDeleteLabelResponse> = when {
      alternative.id == "issues/delete-label.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesDeleteLabelResponse.SuccessNoContent(
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
    ): IssuesDeleteLabelResponse = IssuesDeleteLabelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/delete-milestone` may expose through its typed API
   * exception.
   */
  public sealed interface IssuesDeleteMilestoneError

  /**
   * Typed response alternatives for `issues/delete-milestone`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesDeleteMilestoneResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteMilestoneResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteMilestoneResponse,
        IssuesDeleteMilestoneError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesDeleteMilestoneResponse
  }

  /**
   * Raised by `issues/delete-milestone` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesDeleteMilestoneApiException(
    public val error: IssuesDeleteMilestoneError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/delete-milestone")

  private object IssuesDeleteMilestoneResponseDecoder : SdkResponseAlternativeDecoder<IssuesDeleteMilestoneResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesDeleteMilestoneResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesDeleteMilestoneResponse> = when {
      alternative.id == "issues/delete-milestone.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesDeleteMilestoneResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/delete-milestone.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesDeleteMilestoneResponse.Http404Json(
          json = IssuesCodecs.issuesDeleteMilestoneResponseCodecAlternative1Registry.select(listOf("issues/delete-milestone.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesDeleteMilestoneResponse = IssuesDeleteMilestoneResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/get-comment` may expose through its typed API exception.
   */
  public sealed interface IssuesGetCommentError

  /**
   * Typed response alternatives for `issues/get-comment`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesGetCommentResponse {
    public class SuccessJson(
      public val json: IssueComment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesGetCommentResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesGetCommentResponse,
        IssuesGetCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesGetCommentResponse
  }

  /**
   * Raised by `issues/get-comment` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class IssuesGetCommentApiException(
    public val error: IssuesGetCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/get-comment")

  private object IssuesGetCommentResponseDecoder : SdkResponseAlternativeDecoder<IssuesGetCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesGetCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesGetCommentResponse> = when {
      alternative.id == "issues/get-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesGetCommentResponse.SuccessJson(
          json = IssuesCodecs.issuesGetCommentResponseCodecAlternative0Registry.select(listOf("issues/get-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/get-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesGetCommentResponse.Http404Json(
          json = IssuesCodecs.issuesGetCommentResponseCodecAlternative1Registry.select(listOf("issues/get-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesGetCommentResponse = IssuesGetCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/get-label` may expose through its typed API exception.
   */
  public sealed interface IssuesGetLabelError

  /**
   * Typed response alternatives for `issues/get-label`. Non-success alternatives are not converted into success values.
   */
  public sealed interface IssuesGetLabelResponse {
    public class SuccessJson(
      public val json: Label,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesGetLabelResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesGetLabelResponse,
        IssuesGetLabelError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesGetLabelResponse
  }

  /**
   * Raised by `issues/get-label` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class IssuesGetLabelApiException(
    public val error: IssuesGetLabelError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/get-label")

  private object IssuesGetLabelResponseDecoder : SdkResponseAlternativeDecoder<IssuesGetLabelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesGetLabelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesGetLabelResponse> = when {
      alternative.id == "issues/get-label.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesGetLabelResponse.SuccessJson(
          json = IssuesCodecs.issuesGetLabelResponseCodecAlternative0Registry.select(listOf("issues/get-label.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/get-label.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesGetLabelResponse.Http404Json(
          json = IssuesCodecs.issuesGetLabelResponseCodecAlternative1Registry.select(listOf("issues/get-label.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesGetLabelResponse = IssuesGetLabelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/get-milestone` may expose through its typed API exception.
   */
  public sealed interface IssuesGetMilestoneError

  /**
   * Typed response alternatives for `issues/get-milestone`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesGetMilestoneResponse {
    public class SuccessJson(
      public val json: Milestone,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesGetMilestoneResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesGetMilestoneResponse,
        IssuesGetMilestoneError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesGetMilestoneResponse
  }

  /**
   * Raised by `issues/get-milestone` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesGetMilestoneApiException(
    public val error: IssuesGetMilestoneError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/get-milestone")

  private object IssuesGetMilestoneResponseDecoder : SdkResponseAlternativeDecoder<IssuesGetMilestoneResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesGetMilestoneResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesGetMilestoneResponse> = when {
      alternative.id == "issues/get-milestone.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesGetMilestoneResponse.SuccessJson(
          json = IssuesCodecs.issuesGetMilestoneResponseCodecAlternative0Registry.select(listOf("issues/get-milestone.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/get-milestone.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesGetMilestoneResponse.Http404Json(
          json = IssuesCodecs.issuesGetMilestoneResponseCodecAlternative1Registry.select(listOf("issues/get-milestone.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesGetMilestoneResponse = IssuesGetMilestoneResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/list-assignees` may expose through its typed API exception.
   */
  public sealed interface IssuesListAssigneesError

  /**
   * Typed response alternatives for `issues/list-assignees`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesListAssigneesResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListAssigneesResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListAssigneesResponse,
        IssuesListAssigneesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListAssigneesResponse
  }

  /**
   * Raised by `issues/list-assignees` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesListAssigneesApiException(
    public val error: IssuesListAssigneesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/list-assignees")

  private object IssuesListAssigneesResponseDecoder : SdkResponseAlternativeDecoder<IssuesListAssigneesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesListAssigneesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesListAssigneesResponse> = when {
      alternative.id == "issues/list-assignees.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesListAssigneesResponse.SuccessJson(
          json = IssuesCodecs.issuesListAssigneesResponseCodecAlternative0Registry.select(listOf("issues/list-assignees.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-assignees.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesListAssigneesResponse.Http404Json(
          json = IssuesCodecs.issuesListAssigneesResponseCodecAlternative1Registry.select(listOf("issues/list-assignees.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesListAssigneesResponse = IssuesListAssigneesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/list-comments` may expose through its typed API exception.
   */
  public sealed interface IssuesListCommentsError

  /**
   * Typed response alternatives for `issues/list-comments`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesListCommentsResponse {
    public class SuccessJson(
      public val json: List<IssueComment>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListCommentsResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListCommentsResponse,
        IssuesListCommentsError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListCommentsResponse,
        IssuesListCommentsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListCommentsResponse
  }

  /**
   * Raised by `issues/list-comments` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesListCommentsApiException(
    public val error: IssuesListCommentsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/list-comments")

  private object IssuesListCommentsResponseDecoder : SdkResponseAlternativeDecoder<IssuesListCommentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesListCommentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesListCommentsResponse> = when {
      alternative.id == "issues/list-comments.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesListCommentsResponse.SuccessJson(
          json = IssuesCodecs.issuesListCommentsResponseCodecAlternative0Registry.select(listOf("issues/list-comments.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-comments.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesListCommentsResponse.Http404Json(
          json = IssuesCodecs.issuesListCommentsResponseCodecAlternative1Registry.select(listOf("issues/list-comments.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-comments.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesListCommentsResponse.Http410Json(
          json = IssuesCodecs.issuesListCommentsResponseCodecAlternative2Registry.select(listOf("issues/list-comments.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesListCommentsResponse = IssuesListCommentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/list-comments-for-repo` may expose through its typed API
   * exception.
   */
  public sealed interface IssuesListCommentsForRepoError

  /**
   * Typed response alternatives for `issues/list-comments-for-repo`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface IssuesListCommentsForRepoResponse {
    public class SuccessJson(
      public val json: List<IssueComment>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListCommentsForRepoResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListCommentsForRepoResponse,
        IssuesListCommentsForRepoError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListCommentsForRepoResponse,
        IssuesListCommentsForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListCommentsForRepoResponse
  }

  /**
   * Raised by `issues/list-comments-for-repo` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class IssuesListCommentsForRepoApiException(
    public val error: IssuesListCommentsForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/list-comments-for-repo")

  private object IssuesListCommentsForRepoResponseDecoder : SdkResponseAlternativeDecoder<IssuesListCommentsForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesListCommentsForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesListCommentsForRepoResponse> = when {
      alternative.id == "issues/list-comments-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesListCommentsForRepoResponse.SuccessJson(
          json = IssuesCodecs.issuesListCommentsForRepoResponseCodecAlternative0Registry.select(listOf("issues/list-comments-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-comments-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesListCommentsForRepoResponse.Http404Json(
          json = IssuesCodecs.issuesListCommentsForRepoResponseCodecAlternative1Registry.select(listOf("issues/list-comments-for-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-comments-for-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesListCommentsForRepoResponse.Http422Json(
          json = IssuesCodecs.issuesListCommentsForRepoResponseCodecAlternative2Registry.select(listOf("issues/list-comments-for-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesListCommentsForRepoResponse = IssuesListCommentsForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/list-events` may expose through its typed API exception.
   */
  public sealed interface IssuesListEventsError

  /**
   * Typed response alternatives for `issues/list-events`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesListEventsResponse {
    public class SuccessJson(
      public val json: List<IssueEventForIssue>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListEventsResponse

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListEventsResponse,
        IssuesListEventsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListEventsResponse
  }

  /**
   * Raised by `issues/list-events` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class IssuesListEventsApiException(
    public val error: IssuesListEventsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/list-events")

  private object IssuesListEventsResponseDecoder : SdkResponseAlternativeDecoder<IssuesListEventsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesListEventsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesListEventsResponse> = when {
      alternative.id == "issues/list-events.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesListEventsResponse.SuccessJson(
          json = IssuesCodecs.issuesListEventsResponseCodecAlternative0Registry.select(listOf("issues/list-events.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-events.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesListEventsResponse.Http410Json(
          json = IssuesCodecs.issuesListEventsResponseCodecAlternative1Registry.select(listOf("issues/list-events.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesListEventsResponse = IssuesListEventsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/list-issue-field-values-for-issue` may expose through its
   * typed API exception.
   */
  public sealed interface IssuesListIssueFieldValuesForIssueError

  /**
   * Typed response alternatives for `issues/list-issue-field-values-for-issue`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface IssuesListIssueFieldValuesForIssueResponse {
    public class SuccessJson(
      public val json: List<IssueFieldValue>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListIssueFieldValuesForIssueResponse

    public class Http301Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListIssueFieldValuesForIssueResponse,
        IssuesListIssueFieldValuesForIssueError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListIssueFieldValuesForIssueResponse,
        IssuesListIssueFieldValuesForIssueError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListIssueFieldValuesForIssueResponse,
        IssuesListIssueFieldValuesForIssueError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListIssueFieldValuesForIssueResponse
  }

  /**
   * Raised by `issues/list-issue-field-values-for-issue` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class IssuesListIssueFieldValuesForIssueApiException(
    public val error: IssuesListIssueFieldValuesForIssueError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/list-issue-field-values-for-issue")

  private object IssuesListIssueFieldValuesForIssueResponseDecoder : SdkResponseAlternativeDecoder<IssuesListIssueFieldValuesForIssueResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesListIssueFieldValuesForIssueResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesListIssueFieldValuesForIssueResponse> = when {
      alternative.id == "issues/list-issue-field-values-for-issue.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesListIssueFieldValuesForIssueResponse.SuccessJson(
          json = IssuesCodecs.issuesListIssueFieldValuesForIssueResponseCodecAlternative0Registry.select(listOf("issues/list-issue-field-values-for-issue.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-issue-field-values-for-issue.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesListIssueFieldValuesForIssueResponse.Http301Json(
          json = IssuesCodecs.issuesListIssueFieldValuesForIssueResponseCodecAlternative1Registry.select(listOf("issues/list-issue-field-values-for-issue.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-issue-field-values-for-issue.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesListIssueFieldValuesForIssueResponse.Http404Json(
          json = IssuesCodecs.issuesListIssueFieldValuesForIssueResponseCodecAlternative2Registry.select(listOf("issues/list-issue-field-values-for-issue.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-issue-field-values-for-issue.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesListIssueFieldValuesForIssueResponse.Http410Json(
          json = IssuesCodecs.issuesListIssueFieldValuesForIssueResponseCodecAlternative3Registry.select(listOf("issues/list-issue-field-values-for-issue.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesListIssueFieldValuesForIssueResponse = IssuesListIssueFieldValuesForIssueResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `issues/list-labels-for-milestone`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface IssuesListLabelsForMilestoneResponse {
    public class SuccessJson(
      public val json: List<Label>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListLabelsForMilestoneResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListLabelsForMilestoneResponse
  }

  private object IssuesListLabelsForMilestoneResponseDecoder : SdkResponseAlternativeDecoder<IssuesListLabelsForMilestoneResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesListLabelsForMilestoneResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesListLabelsForMilestoneResponse> = when {
      alternative.id == "issues/list-labels-for-milestone.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesListLabelsForMilestoneResponse.SuccessJson(
          json = IssuesCodecs.issuesListLabelsForMilestoneResponseCodecAlternative0Registry.select(listOf("issues/list-labels-for-milestone.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesListLabelsForMilestoneResponse = IssuesListLabelsForMilestoneResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/list-labels-for-repo` may expose through its typed API
   * exception.
   */
  public sealed interface IssuesListLabelsForRepoError

  /**
   * Typed response alternatives for `issues/list-labels-for-repo`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface IssuesListLabelsForRepoResponse {
    public class SuccessJson(
      public val json: List<Label>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListLabelsForRepoResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListLabelsForRepoResponse,
        IssuesListLabelsForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListLabelsForRepoResponse
  }

  /**
   * Raised by `issues/list-labels-for-repo` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesListLabelsForRepoApiException(
    public val error: IssuesListLabelsForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/list-labels-for-repo")

  private object IssuesListLabelsForRepoResponseDecoder : SdkResponseAlternativeDecoder<IssuesListLabelsForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesListLabelsForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesListLabelsForRepoResponse> = when {
      alternative.id == "issues/list-labels-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesListLabelsForRepoResponse.SuccessJson(
          json = IssuesCodecs.issuesListLabelsForRepoResponseCodecAlternative0Registry.select(listOf("issues/list-labels-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-labels-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesListLabelsForRepoResponse.Http404Json(
          json = IssuesCodecs.issuesListLabelsForRepoResponseCodecAlternative1Registry.select(listOf("issues/list-labels-for-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesListLabelsForRepoResponse = IssuesListLabelsForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/list-labels-on-issue` may expose through its typed API
   * exception.
   */
  public sealed interface IssuesListLabelsOnIssueError

  /**
   * Typed response alternatives for `issues/list-labels-on-issue`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface IssuesListLabelsOnIssueResponse {
    public class SuccessJson(
      public val json: List<Label>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListLabelsOnIssueResponse

    public class Http301Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListLabelsOnIssueResponse,
        IssuesListLabelsOnIssueError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListLabelsOnIssueResponse,
        IssuesListLabelsOnIssueError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListLabelsOnIssueResponse,
        IssuesListLabelsOnIssueError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListLabelsOnIssueResponse
  }

  /**
   * Raised by `issues/list-labels-on-issue` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesListLabelsOnIssueApiException(
    public val error: IssuesListLabelsOnIssueError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/list-labels-on-issue")

  private object IssuesListLabelsOnIssueResponseDecoder : SdkResponseAlternativeDecoder<IssuesListLabelsOnIssueResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesListLabelsOnIssueResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesListLabelsOnIssueResponse> = when {
      alternative.id == "issues/list-labels-on-issue.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesListLabelsOnIssueResponse.SuccessJson(
          json = IssuesCodecs.issuesListLabelsOnIssueResponseCodecAlternative0Registry.select(listOf("issues/list-labels-on-issue.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-labels-on-issue.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesListLabelsOnIssueResponse.Http301Json(
          json = IssuesCodecs.issuesListLabelsOnIssueResponseCodecAlternative1Registry.select(listOf("issues/list-labels-on-issue.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-labels-on-issue.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesListLabelsOnIssueResponse.Http404Json(
          json = IssuesCodecs.issuesListLabelsOnIssueResponseCodecAlternative2Registry.select(listOf("issues/list-labels-on-issue.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-labels-on-issue.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesListLabelsOnIssueResponse.Http410Json(
          json = IssuesCodecs.issuesListLabelsOnIssueResponseCodecAlternative3Registry.select(listOf("issues/list-labels-on-issue.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesListLabelsOnIssueResponse = IssuesListLabelsOnIssueResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/list-milestones` may expose through its typed API exception.
   */
  public sealed interface IssuesListMilestonesError

  /**
   * Typed response alternatives for `issues/list-milestones`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesListMilestonesResponse {
    public class SuccessJson(
      public val json: List<Milestone>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListMilestonesResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListMilestonesResponse,
        IssuesListMilestonesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesListMilestonesResponse
  }

  /**
   * Raised by `issues/list-milestones` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesListMilestonesApiException(
    public val error: IssuesListMilestonesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/list-milestones")

  private object IssuesListMilestonesResponseDecoder : SdkResponseAlternativeDecoder<IssuesListMilestonesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesListMilestonesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesListMilestonesResponse> = when {
      alternative.id == "issues/list-milestones.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesListMilestonesResponse.SuccessJson(
          json = IssuesCodecs.issuesListMilestonesResponseCodecAlternative0Registry.select(listOf("issues/list-milestones.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/list-milestones.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesListMilestonesResponse.Http404Json(
          json = IssuesCodecs.issuesListMilestonesResponseCodecAlternative1Registry.select(listOf("issues/list-milestones.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesListMilestonesResponse = IssuesListMilestonesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/lock` may expose through its typed API exception.
   */
  public sealed interface IssuesLockError

  /**
   * Typed response alternatives for `issues/lock`. Non-success alternatives are not converted into success values.
   */
  public sealed interface IssuesLockResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesLockResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesLockResponse,
        IssuesLockError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesLockResponse,
        IssuesLockError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesLockResponse,
        IssuesLockError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesLockResponse,
        IssuesLockError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesLockResponse
  }

  /**
   * Raised by `issues/lock` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class IssuesLockApiException(
    public val error: IssuesLockError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/lock")

  private object IssuesLockResponseDecoder : SdkResponseAlternativeDecoder<IssuesLockResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesLockResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesLockResponse> = when {
      alternative.id == "issues/lock.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesLockResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/lock.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesLockResponse.Http403Json(
          json = IssuesCodecs.issuesLockResponseCodecAlternative1Registry.select(listOf("issues/lock.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/lock.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesLockResponse.Http404Json(
          json = IssuesCodecs.issuesLockResponseCodecAlternative2Registry.select(listOf("issues/lock.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/lock.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesLockResponse.Http410Json(
          json = IssuesCodecs.issuesLockResponseCodecAlternative3Registry.select(listOf("issues/lock.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/lock.response.alternative4" -> SdkResponseDecodeResult(
        value = IssuesLockResponse.Http422Json(
          json = IssuesCodecs.issuesLockResponseCodecAlternative4Registry.select(listOf("issues/lock.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesLockResponse = IssuesLockResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/pin-comment` may expose through its typed API exception.
   */
  public sealed interface IssuesPinCommentError

  /**
   * Typed response alternatives for `issues/pin-comment`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesPinCommentResponse {
    public class SuccessJson(
      public val json: IssueComment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesPinCommentResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesPinCommentResponse,
        IssuesPinCommentError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesPinCommentResponse,
        IssuesPinCommentError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesPinCommentResponse,
        IssuesPinCommentError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesPinCommentResponse,
        IssuesPinCommentError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesPinCommentResponse,
        IssuesPinCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesPinCommentResponse
  }

  /**
   * Raised by `issues/pin-comment` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class IssuesPinCommentApiException(
    public val error: IssuesPinCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/pin-comment")

  private object IssuesPinCommentResponseDecoder : SdkResponseAlternativeDecoder<IssuesPinCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesPinCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesPinCommentResponse> = when {
      alternative.id == "issues/pin-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesPinCommentResponse.SuccessJson(
          json = IssuesCodecs.issuesPinCommentResponseCodecAlternative0Registry.select(listOf("issues/pin-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/pin-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesPinCommentResponse.Http401Json(
          json = IssuesCodecs.issuesPinCommentResponseCodecAlternative1Registry.select(listOf("issues/pin-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/pin-comment.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesPinCommentResponse.Http403Json(
          json = IssuesCodecs.issuesPinCommentResponseCodecAlternative2Registry.select(listOf("issues/pin-comment.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/pin-comment.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesPinCommentResponse.Http404Json(
          json = IssuesCodecs.issuesPinCommentResponseCodecAlternative3Registry.select(listOf("issues/pin-comment.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/pin-comment.response.alternative4" -> SdkResponseDecodeResult(
        value = IssuesPinCommentResponse.Http410Json(
          json = IssuesCodecs.issuesPinCommentResponseCodecAlternative4Registry.select(listOf("issues/pin-comment.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/pin-comment.response.alternative5" -> SdkResponseDecodeResult(
        value = IssuesPinCommentResponse.Http422Json(
          json = IssuesCodecs.issuesPinCommentResponseCodecAlternative5Registry.select(listOf("issues/pin-comment.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesPinCommentResponse = IssuesPinCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/remove-all-labels` may expose through its typed API
   * exception.
   */
  public sealed interface IssuesRemoveAllLabelsError

  /**
   * Typed response alternatives for `issues/remove-all-labels`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesRemoveAllLabelsResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesRemoveAllLabelsResponse

    public class Http301Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesRemoveAllLabelsResponse,
        IssuesRemoveAllLabelsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesRemoveAllLabelsResponse,
        IssuesRemoveAllLabelsError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesRemoveAllLabelsResponse,
        IssuesRemoveAllLabelsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesRemoveAllLabelsResponse
  }

  /**
   * Raised by `issues/remove-all-labels` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesRemoveAllLabelsApiException(
    public val error: IssuesRemoveAllLabelsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/remove-all-labels")

  private object IssuesRemoveAllLabelsResponseDecoder : SdkResponseAlternativeDecoder<IssuesRemoveAllLabelsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesRemoveAllLabelsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesRemoveAllLabelsResponse> = when {
      alternative.id == "issues/remove-all-labels.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesRemoveAllLabelsResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/remove-all-labels.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesRemoveAllLabelsResponse.Http301Json(
          json = IssuesCodecs.issuesRemoveAllLabelsResponseCodecAlternative1Registry.select(listOf("issues/remove-all-labels.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/remove-all-labels.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesRemoveAllLabelsResponse.Http404Json(
          json = IssuesCodecs.issuesRemoveAllLabelsResponseCodecAlternative2Registry.select(listOf("issues/remove-all-labels.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/remove-all-labels.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesRemoveAllLabelsResponse.Http410Json(
          json = IssuesCodecs.issuesRemoveAllLabelsResponseCodecAlternative3Registry.select(listOf("issues/remove-all-labels.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesRemoveAllLabelsResponse = IssuesRemoveAllLabelsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/remove-label` may expose through its typed API exception.
   */
  public sealed interface IssuesRemoveLabelError

  /**
   * Typed response alternatives for `issues/remove-label`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesRemoveLabelResponse {
    public class SuccessJson(
      public val json: List<Label>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesRemoveLabelResponse

    public class Http301Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesRemoveLabelResponse,
        IssuesRemoveLabelError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesRemoveLabelResponse,
        IssuesRemoveLabelError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesRemoveLabelResponse,
        IssuesRemoveLabelError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesRemoveLabelResponse
  }

  /**
   * Raised by `issues/remove-label` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesRemoveLabelApiException(
    public val error: IssuesRemoveLabelError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/remove-label")

  private object IssuesRemoveLabelResponseDecoder : SdkResponseAlternativeDecoder<IssuesRemoveLabelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesRemoveLabelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesRemoveLabelResponse> = when {
      alternative.id == "issues/remove-label.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesRemoveLabelResponse.SuccessJson(
          json = IssuesCodecs.issuesRemoveLabelResponseCodecAlternative0Registry.select(listOf("issues/remove-label.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/remove-label.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesRemoveLabelResponse.Http301Json(
          json = IssuesCodecs.issuesRemoveLabelResponseCodecAlternative1Registry.select(listOf("issues/remove-label.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/remove-label.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesRemoveLabelResponse.Http404Json(
          json = IssuesCodecs.issuesRemoveLabelResponseCodecAlternative2Registry.select(listOf("issues/remove-label.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/remove-label.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesRemoveLabelResponse.Http410Json(
          json = IssuesCodecs.issuesRemoveLabelResponseCodecAlternative3Registry.select(listOf("issues/remove-label.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesRemoveLabelResponse = IssuesRemoveLabelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/set-issue-field-values` may expose through its typed API
   * exception.
   */
  public sealed interface IssuesSetIssueFieldValuesError

  /**
   * Typed response alternatives for `issues/set-issue-field-values`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface IssuesSetIssueFieldValuesResponse {
    public class SuccessJson(
      public val json: List<IssueFieldValue>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetIssueFieldValuesResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetIssueFieldValuesResponse,
        IssuesSetIssueFieldValuesError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetIssueFieldValuesResponse,
        IssuesSetIssueFieldValuesError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetIssueFieldValuesResponse,
        IssuesSetIssueFieldValuesError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetIssueFieldValuesResponse,
        IssuesSetIssueFieldValuesError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetIssueFieldValuesResponse,
        IssuesSetIssueFieldValuesError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetIssueFieldValuesResponse,
        IssuesSetIssueFieldValuesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetIssueFieldValuesResponse
  }

  /**
   * Raised by `issues/set-issue-field-values` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class IssuesSetIssueFieldValuesApiException(
    public val error: IssuesSetIssueFieldValuesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/set-issue-field-values")

  private object IssuesSetIssueFieldValuesResponseDecoder : SdkResponseAlternativeDecoder<IssuesSetIssueFieldValuesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesSetIssueFieldValuesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesSetIssueFieldValuesResponse> = when {
      alternative.id == "issues/set-issue-field-values.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesSetIssueFieldValuesResponse.SuccessJson(
          json = IssuesCodecs.issuesSetIssueFieldValuesResponseCodecAlternative0Registry.select(listOf("issues/set-issue-field-values.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/set-issue-field-values.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesSetIssueFieldValuesResponse.Http400Json(
          json = IssuesCodecs.issuesSetIssueFieldValuesResponseCodecAlternative1Registry.select(listOf("issues/set-issue-field-values.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/set-issue-field-values.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesSetIssueFieldValuesResponse.Http400ScimJson(
          json = IssuesCodecs.issuesSetIssueFieldValuesResponseCodecAlternative2Registry.select(listOf("issues/set-issue-field-values.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/set-issue-field-values.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesSetIssueFieldValuesResponse.Http403Json(
          json = IssuesCodecs.issuesSetIssueFieldValuesResponseCodecAlternative3Registry.select(listOf("issues/set-issue-field-values.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/set-issue-field-values.response.alternative4" -> SdkResponseDecodeResult(
        value = IssuesSetIssueFieldValuesResponse.Http404Json(
          json = IssuesCodecs.issuesSetIssueFieldValuesResponseCodecAlternative4Registry.select(listOf("issues/set-issue-field-values.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/set-issue-field-values.response.alternative5" -> SdkResponseDecodeResult(
        value = IssuesSetIssueFieldValuesResponse.Http422Json(
          json = IssuesCodecs.issuesSetIssueFieldValuesResponseCodecAlternative5Registry.select(listOf("issues/set-issue-field-values.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/set-issue-field-values.response.alternative6" -> SdkResponseDecodeResult(
        value = IssuesSetIssueFieldValuesResponse.Http503Json(
          json = IssuesCodecs.issuesSetIssueFieldValuesResponseCodecAlternative6Registry.select(listOf("issues/set-issue-field-values.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesSetIssueFieldValuesResponse = IssuesSetIssueFieldValuesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/set-labels` may expose through its typed API exception.
   */
  public sealed interface IssuesSetLabelsError

  /**
   * Typed response alternatives for `issues/set-labels`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesSetLabelsResponse {
    public class SuccessJson(
      public val json: List<Label>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetLabelsResponse

    public class Http301Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetLabelsResponse,
        IssuesSetLabelsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetLabelsResponse,
        IssuesSetLabelsError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetLabelsResponse,
        IssuesSetLabelsError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetLabelsResponse,
        IssuesSetLabelsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesSetLabelsResponse
  }

  /**
   * Raised by `issues/set-labels` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class IssuesSetLabelsApiException(
    public val error: IssuesSetLabelsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/set-labels")

  private object IssuesSetLabelsResponseDecoder : SdkResponseAlternativeDecoder<IssuesSetLabelsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesSetLabelsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesSetLabelsResponse> = when {
      alternative.id == "issues/set-labels.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesSetLabelsResponse.SuccessJson(
          json = IssuesCodecs.issuesSetLabelsResponseCodecAlternative0Registry.select(listOf("issues/set-labels.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/set-labels.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesSetLabelsResponse.Http301Json(
          json = IssuesCodecs.issuesSetLabelsResponseCodecAlternative1Registry.select(listOf("issues/set-labels.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/set-labels.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesSetLabelsResponse.Http404Json(
          json = IssuesCodecs.issuesSetLabelsResponseCodecAlternative2Registry.select(listOf("issues/set-labels.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/set-labels.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesSetLabelsResponse.Http410Json(
          json = IssuesCodecs.issuesSetLabelsResponseCodecAlternative3Registry.select(listOf("issues/set-labels.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/set-labels.response.alternative4" -> SdkResponseDecodeResult(
        value = IssuesSetLabelsResponse.Http422Json(
          json = IssuesCodecs.issuesSetLabelsResponseCodecAlternative4Registry.select(listOf("issues/set-labels.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesSetLabelsResponse = IssuesSetLabelsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/unlock` may expose through its typed API exception.
   */
  public sealed interface IssuesUnlockError

  /**
   * Typed response alternatives for `issues/unlock`. Non-success alternatives are not converted into success values.
   */
  public sealed interface IssuesUnlockResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUnlockResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUnlockResponse,
        IssuesUnlockError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUnlockResponse,
        IssuesUnlockError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUnlockResponse
  }

  /**
   * Raised by `issues/unlock` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class IssuesUnlockApiException(
    public val error: IssuesUnlockError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/unlock")

  private object IssuesUnlockResponseDecoder : SdkResponseAlternativeDecoder<IssuesUnlockResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesUnlockResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesUnlockResponse> = when {
      alternative.id == "issues/unlock.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesUnlockResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/unlock.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesUnlockResponse.Http403Json(
          json = IssuesCodecs.issuesUnlockResponseCodecAlternative1Registry.select(listOf("issues/unlock.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/unlock.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesUnlockResponse.Http404Json(
          json = IssuesCodecs.issuesUnlockResponseCodecAlternative2Registry.select(listOf("issues/unlock.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesUnlockResponse = IssuesUnlockResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/unpin-comment` may expose through its typed API exception.
   */
  public sealed interface IssuesUnpinCommentError

  /**
   * Typed response alternatives for `issues/unpin-comment`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesUnpinCommentResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUnpinCommentResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUnpinCommentResponse,
        IssuesUnpinCommentError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUnpinCommentResponse,
        IssuesUnpinCommentError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUnpinCommentResponse,
        IssuesUnpinCommentError

    public class Http410Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUnpinCommentResponse,
        IssuesUnpinCommentError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUnpinCommentResponse,
        IssuesUnpinCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUnpinCommentResponse
  }

  /**
   * Raised by `issues/unpin-comment` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesUnpinCommentApiException(
    public val error: IssuesUnpinCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/unpin-comment")

  private object IssuesUnpinCommentResponseDecoder : SdkResponseAlternativeDecoder<IssuesUnpinCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesUnpinCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesUnpinCommentResponse> = when {
      alternative.id == "issues/unpin-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesUnpinCommentResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/unpin-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesUnpinCommentResponse.Http401Json(
          json = IssuesCodecs.issuesUnpinCommentResponseCodecAlternative1Registry.select(listOf("issues/unpin-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/unpin-comment.response.alternative2" -> SdkResponseDecodeResult(
        value = IssuesUnpinCommentResponse.Http403Json(
          json = IssuesCodecs.issuesUnpinCommentResponseCodecAlternative2Registry.select(listOf("issues/unpin-comment.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/unpin-comment.response.alternative3" -> SdkResponseDecodeResult(
        value = IssuesUnpinCommentResponse.Http404Json(
          json = IssuesCodecs.issuesUnpinCommentResponseCodecAlternative3Registry.select(listOf("issues/unpin-comment.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/unpin-comment.response.alternative4" -> SdkResponseDecodeResult(
        value = IssuesUnpinCommentResponse.Http410Json(
          json = IssuesCodecs.issuesUnpinCommentResponseCodecAlternative4Registry.select(listOf("issues/unpin-comment.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/unpin-comment.response.alternative5" -> SdkResponseDecodeResult(
        value = IssuesUnpinCommentResponse.Http503Json(
          json = IssuesCodecs.issuesUnpinCommentResponseCodecAlternative5Registry.select(listOf("issues/unpin-comment.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesUnpinCommentResponse = IssuesUnpinCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `issues/update-comment` may expose through its typed API exception.
   */
  public sealed interface IssuesUpdateCommentError

  /**
   * Typed response alternatives for `issues/update-comment`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesUpdateCommentResponse {
    public class SuccessJson(
      public val json: IssueComment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUpdateCommentResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUpdateCommentResponse,
        IssuesUpdateCommentError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUpdateCommentResponse
  }

  /**
   * Raised by `issues/update-comment` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class IssuesUpdateCommentApiException(
    public val error: IssuesUpdateCommentError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "issues/update-comment")

  private object IssuesUpdateCommentResponseDecoder : SdkResponseAlternativeDecoder<IssuesUpdateCommentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesUpdateCommentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesUpdateCommentResponse> = when {
      alternative.id == "issues/update-comment.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesUpdateCommentResponse.SuccessJson(
          json = IssuesCodecs.issuesUpdateCommentResponseCodecAlternative0Registry.select(listOf("issues/update-comment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "issues/update-comment.response.alternative1" -> SdkResponseDecodeResult(
        value = IssuesUpdateCommentResponse.Http422Json(
          json = IssuesCodecs.issuesUpdateCommentResponseCodecAlternative1Registry.select(listOf("issues/update-comment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesUpdateCommentResponse = IssuesUpdateCommentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `issues/update-label`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesUpdateLabelResponse {
    public class SuccessJson(
      public val json: Label,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUpdateLabelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUpdateLabelResponse
  }

  private object IssuesUpdateLabelResponseDecoder : SdkResponseAlternativeDecoder<IssuesUpdateLabelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesUpdateLabelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesUpdateLabelResponse> = when {
      alternative.id == "issues/update-label.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesUpdateLabelResponse.SuccessJson(
          json = IssuesCodecs.issuesUpdateLabelResponseCodecAlternative0Registry.select(listOf("issues/update-label.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesUpdateLabelResponse = IssuesUpdateLabelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `issues/update-milestone`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface IssuesUpdateMilestoneResponse {
    public class SuccessJson(
      public val json: Milestone,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUpdateMilestoneResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : IssuesUpdateMilestoneResponse
  }

  private object IssuesUpdateMilestoneResponseDecoder : SdkResponseAlternativeDecoder<IssuesUpdateMilestoneResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): IssuesUpdateMilestoneResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<IssuesUpdateMilestoneResponse> = when {
      alternative.id == "issues/update-milestone.response.alternative0" -> SdkResponseDecodeResult(
        value = IssuesUpdateMilestoneResponse.SuccessJson(
          json = IssuesCodecs.issuesUpdateMilestoneResponseCodecAlternative0Registry.select(listOf("issues/update-milestone.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): IssuesUpdateMilestoneResponse = IssuesUpdateMilestoneResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val issuesAddIssueFieldValuesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/add-issue-field-values",
          method = "POST",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/issue-field-values",
          requestMediaTypes = listOf("application/json"),
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
              id = "issues/add-issue-field-values.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/add-issue-field-values.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/add-issue-field-values.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/add-issue-field-values.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/add-issue-field-values.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/add-issue-field-values.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/add-issue-field-values.response.alternative6",
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

    internal val issuesAddLabelsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/add-labels",
          method = "POST",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/labels",
          requestMediaTypes = listOf("application/json"),
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
              id = "issues/add-labels.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 301),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/add-labels.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/add-labels.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/add-labels.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/add-labels.response.alternative4",
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

    internal val issuesCheckUserCanBeAssignedMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/check-user-can-be-assigned",
          method = "GET",
          path = "/repos/{owner}/{repo}/assignees/{assignee}",
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
              id = "issues/check-user-can-be-assigned.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/check-user-can-be-assigned.response.alternative1",
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

    internal val issuesCheckUserCanBeAssignedToIssueMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/check-user-can-be-assigned-to-issue",
          method = "GET",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/assignees/{assignee}",
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
              id = "issues/check-user-can-be-assigned-to-issue.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/check-user-can-be-assigned-to-issue.response.alternative1",
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

    internal val issuesCreateCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/create-comment",
          method = "POST",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/comments",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "IssueComment",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/create-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/create-comment.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/create-comment.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/create-comment.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/create-comment.response.alternative4",
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

    internal val issuesCreateLabelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/create-label",
          method = "POST",
          path = "/repos/{owner}/{repo}/labels",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Label",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/create-label.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/create-label.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/create-label.response.alternative2",
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

    internal val issuesCreateMilestoneMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/create-milestone",
          method = "POST",
          path = "/repos/{owner}/{repo}/milestones",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "Milestone",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/create-milestone.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/create-milestone.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/create-milestone.response.alternative2",
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

    internal val issuesDeleteCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/delete-comment",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/issues/comments/{comment_id}",
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
              id = "issues/delete-comment.response.alternative0",
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

    internal val issuesDeleteIssueFieldValueMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/delete-issue-field-value",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/issue-field-values/{issue_field_id}",
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
              id = "issues/delete-issue-field-value.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/delete-issue-field-value.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/delete-issue-field-value.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/delete-issue-field-value.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/delete-issue-field-value.response.alternative4",
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

    internal val issuesDeleteLabelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/delete-label",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/labels/{name}",
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
              id = "issues/delete-label.response.alternative0",
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

    internal val issuesDeleteMilestoneMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/delete-milestone",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/milestones/{milestone_number}",
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
              id = "issues/delete-milestone.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/delete-milestone.response.alternative1",
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

    internal val issuesGetCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/get-comment",
          method = "GET",
          path = "/repos/{owner}/{repo}/issues/comments/{comment_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssueComment",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/get-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/get-comment.response.alternative1",
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

    internal val issuesGetLabelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/get-label",
          method = "GET",
          path = "/repos/{owner}/{repo}/labels/{name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Label",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/get-label.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/get-label.response.alternative1",
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

    internal val issuesGetMilestoneMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/get-milestone",
          method = "GET",
          path = "/repos/{owner}/{repo}/milestones/{milestone_number}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Milestone",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/get-milestone.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/get-milestone.response.alternative1",
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

    internal val issuesListAssigneesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/list-assignees",
          method = "GET",
          path = "/repos/{owner}/{repo}/assignees",
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
              id = "issues/list-assignees.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-assignees.response.alternative1",
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

    internal val issuesListCommentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/list-comments",
          method = "GET",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/comments",
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
              id = "issues/list-comments.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-comments.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-comments.response.alternative2",
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

    internal val issuesListCommentsForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/list-comments-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/issues/comments",
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
              id = "issues/list-comments-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-comments-for-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-comments-for-repo.response.alternative2",
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

    internal val issuesListEventsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/list-events",
          method = "GET",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/events",
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
              id = "issues/list-events.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-events.response.alternative1",
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

    internal val issuesListIssueFieldValuesForIssueMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/list-issue-field-values-for-issue",
          method = "GET",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/issue-field-values",
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
              id = "issues/list-issue-field-values-for-issue.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 301),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-issue-field-values-for-issue.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-issue-field-values-for-issue.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-issue-field-values-for-issue.response.alternative3",
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

    internal val issuesListLabelsForMilestoneMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/list-labels-for-milestone",
          method = "GET",
          path = "/repos/{owner}/{repo}/milestones/{milestone_number}/labels",
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
              id = "issues/list-labels-for-milestone.response.alternative0",
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

    internal val issuesListLabelsForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/list-labels-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/labels",
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
              id = "issues/list-labels-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-labels-for-repo.response.alternative1",
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

    internal val issuesListLabelsOnIssueMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/list-labels-on-issue",
          method = "GET",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/labels",
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
              id = "issues/list-labels-on-issue.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 301),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-labels-on-issue.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-labels-on-issue.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-labels-on-issue.response.alternative3",
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

    internal val issuesListMilestonesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/list-milestones",
          method = "GET",
          path = "/repos/{owner}/{repo}/milestones",
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
              id = "issues/list-milestones.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/list-milestones.response.alternative1",
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

    internal val issuesLockMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/lock",
          method = "PUT",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/lock",
          requestMediaTypes = listOf("application/json"),
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
              id = "issues/lock.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/lock.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/lock.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/lock.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/lock.response.alternative4",
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

    internal val issuesPinCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/pin-comment",
          method = "PUT",
          path = "/repos/{owner}/{repo}/issues/comments/{comment_id}/pin",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssueComment",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/pin-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/pin-comment.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/pin-comment.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/pin-comment.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/pin-comment.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/pin-comment.response.alternative5",
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

    internal val issuesRemoveAllLabelsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/remove-all-labels",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/labels",
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
              id = "issues/remove-all-labels.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 301),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/remove-all-labels.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/remove-all-labels.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/remove-all-labels.response.alternative3",
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

    internal val issuesRemoveLabelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/remove-label",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/labels/{name}",
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
              id = "issues/remove-label.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 301),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/remove-label.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/remove-label.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/remove-label.response.alternative3",
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

    internal val issuesSetIssueFieldValuesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/set-issue-field-values",
          method = "PUT",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/issue-field-values",
          requestMediaTypes = listOf("application/json"),
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
              id = "issues/set-issue-field-values.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/set-issue-field-values.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/set-issue-field-values.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/set-issue-field-values.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/set-issue-field-values.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/set-issue-field-values.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/set-issue-field-values.response.alternative6",
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

    internal val issuesSetLabelsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/set-labels",
          method = "PUT",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/labels",
          requestMediaTypes = listOf("application/json"),
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
              id = "issues/set-labels.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 301),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/set-labels.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/set-labels.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/set-labels.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/set-labels.response.alternative4",
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

    internal val issuesUnlockMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/unlock",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/issues/{issue_number}/lock",
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
              id = "issues/unlock.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/unlock.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/unlock.response.alternative2",
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

    internal val issuesUnpinCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/unpin-comment",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/issues/comments/{comment_id}/pin",
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
              id = "issues/unpin-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/unpin-comment.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/unpin-comment.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/unpin-comment.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 410),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/unpin-comment.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/unpin-comment.response.alternative5",
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

    internal val issuesUpdateCommentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/update-comment",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/issues/comments/{comment_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssueComment",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/update-comment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/update-comment.response.alternative1",
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

    internal val issuesUpdateLabelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/update-label",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/labels/{name}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Label",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/update-label.response.alternative0",
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

    internal val issuesUpdateMilestoneMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "issues/update-milestone",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/milestones/{milestone_number}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Milestone",
              mode = SdkResponseMode.BUFFERED,
              id = "issues/update-milestone.response.alternative0",
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
