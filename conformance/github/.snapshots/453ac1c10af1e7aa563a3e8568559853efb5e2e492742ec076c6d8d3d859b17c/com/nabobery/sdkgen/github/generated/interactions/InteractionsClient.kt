package com.nabobery.sdkgen.github.generated.interactions

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.InlineOrgsInteractionLimitsGetResponse200JsonX2066929a
import com.nabobery.sdkgen.github.generated.InlineReposInteractionLimitsGetResponse200JsonX9b33954f
import com.nabobery.sdkgen.github.generated.InlineReposInteractionLimitsPullsCreationCapGetResponse200JsonXdf9cbd7a
import com.nabobery.sdkgen.github.generated.InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6
import com.nabobery.sdkgen.github.generated.InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289
import com.nabobery.sdkgen.github.generated.InlineUserInteractionLimitsGetResponse200JsonXf89f7190
import com.nabobery.sdkgen.github.generated.InteractionLimit
import com.nabobery.sdkgen.github.generated.InteractionLimitPullRequestBypassList
import com.nabobery.sdkgen.github.generated.InteractionLimitResponse
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer

public object InteractionsCodecs {
  public const val INTERACTIONSGETPULLREQUESTBYPASSLISTFORREPO_RESPONSE_CODEC_ID: String =
      "interactions/get-pull-request-bypass-list-for-repo.response"

  private val interactionsGetPullRequestBypassListForRepoResponseCodec:
      MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec(INTERACTIONSGETPULLREQUESTBYPASSLISTFORREPO_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val interactionsGetPullRequestBypassListForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("interactions/get-pull-request-bypass-list-for-repo.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  public val interactionsGetPullRequestBypassListForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(interactionsGetPullRequestBypassListForRepoResponseCodecAlternative0Codec)

  private val interactionsGetPullRequestBypassListForRepoResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/get-pull-request-bypass-list-for-repo.response.alternative1", BasicError.Serializer, SdkJson)

  public val interactionsGetPullRequestBypassListForRepoResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsGetPullRequestBypassListForRepoResponseCodecAlternative1Codec)

  private val interactionsGetPullRequestBypassListForRepoResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/get-pull-request-bypass-list-for-repo.response.alternative2", BasicError.Serializer, SdkJson)

  public val interactionsGetPullRequestBypassListForRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsGetPullRequestBypassListForRepoResponseCodecAlternative2Codec)

  public val interactionsGetPullRequestBypassListForRepoRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val interactionsGetPullRequestBypassListForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(interactionsGetPullRequestBypassListForRepoResponseCodec)

  public const val INTERACTIONSGETPULLREQUESTCREATIONCAPFORREPO_RESPONSE_CODEC_ID: String =
      "interactions/get-pull-request-creation-cap-for-repo.response"

  private val interactionsGetPullRequestCreationCapForRepoResponseCodec:
      MediaTypeCodec<InlineReposInteractionLimitsPullsCreationCapGetResponse200JsonXdf9cbd7a> =
      KotlinxSerializationCodec(INTERACTIONSGETPULLREQUESTCREATIONCAPFORREPO_RESPONSE_CODEC_ID, InlineReposInteractionLimitsPullsCreationCapGetResponse200JsonXdf9cbd7a.Serializer, SdkJson)

  private val interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposInteractionLimitsPullsCreationCapGetResponse200JsonXdf9cbd7a> =
      KotlinxSerializationCodec("interactions/get-pull-request-creation-cap-for-repo.response.alternative0", InlineReposInteractionLimitsPullsCreationCapGetResponse200JsonXdf9cbd7a.Serializer, SdkJson)

  public val interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposInteractionLimitsPullsCreationCapGetResponse200JsonXdf9cbd7a>
      =
      MediaTypeCodecRegistry.of(interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative0Codec)

  private val interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/get-pull-request-creation-cap-for-repo.response.alternative1", BasicError.Serializer, SdkJson)

  public val interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative1Codec)

  private val interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/get-pull-request-creation-cap-for-repo.response.alternative2", BasicError.Serializer, SdkJson)

  public val interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative2Codec)

  private val interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/get-pull-request-creation-cap-for-repo.response.alternative3", BasicError.Serializer, SdkJson)

  public val interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative3Codec)

  public val interactionsGetPullRequestCreationCapForRepoRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val interactionsGetPullRequestCreationCapForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposInteractionLimitsPullsCreationCapGetResponse200JsonXdf9cbd7a>
      = MediaTypeCodecRegistry.of(interactionsGetPullRequestCreationCapForRepoResponseCodec)

  private val interactionsGetRestrictionsForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUserInteractionLimitsGetResponse200JsonXf89f7190> =
      KotlinxSerializationCodec("interactions/get-restrictions-for-authenticated-user.response.alternative0", InlineUserInteractionLimitsGetResponse200JsonXf89f7190.Serializer, SdkJson)

  public val interactionsGetRestrictionsForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUserInteractionLimitsGetResponse200JsonXf89f7190> =
      MediaTypeCodecRegistry.of(interactionsGetRestrictionsForAuthenticatedUserResponseCodecAlternative0Codec)

  public val interactionsGetRestrictionsForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val INTERACTIONSGETRESTRICTIONSFORORG_RESPONSE_CODEC_ID: String =
      "interactions/get-restrictions-for-org.response"

  private val interactionsGetRestrictionsForOrgResponseCodec:
      MediaTypeCodec<InlineOrgsInteractionLimitsGetResponse200JsonX2066929a> =
      KotlinxSerializationCodec(INTERACTIONSGETRESTRICTIONSFORORG_RESPONSE_CODEC_ID, InlineOrgsInteractionLimitsGetResponse200JsonX2066929a.Serializer, SdkJson)

  private val interactionsGetRestrictionsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsInteractionLimitsGetResponse200JsonX2066929a> =
      KotlinxSerializationCodec("interactions/get-restrictions-for-org.response.alternative0", InlineOrgsInteractionLimitsGetResponse200JsonX2066929a.Serializer, SdkJson)

  public val interactionsGetRestrictionsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsInteractionLimitsGetResponse200JsonX2066929a> =
      MediaTypeCodecRegistry.of(interactionsGetRestrictionsForOrgResponseCodecAlternative0Codec)

  public val interactionsGetRestrictionsForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val interactionsGetRestrictionsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsInteractionLimitsGetResponse200JsonX2066929a> =
      MediaTypeCodecRegistry.of(interactionsGetRestrictionsForOrgResponseCodec)

  public const val INTERACTIONSGETRESTRICTIONSFORREPO_RESPONSE_CODEC_ID: String =
      "interactions/get-restrictions-for-repo.response"

  private val interactionsGetRestrictionsForRepoResponseCodec:
      MediaTypeCodec<InlineReposInteractionLimitsGetResponse200JsonX9b33954f> =
      KotlinxSerializationCodec(INTERACTIONSGETRESTRICTIONSFORREPO_RESPONSE_CODEC_ID, InlineReposInteractionLimitsGetResponse200JsonX9b33954f.Serializer, SdkJson)

  private val interactionsGetRestrictionsForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposInteractionLimitsGetResponse200JsonX9b33954f> =
      KotlinxSerializationCodec("interactions/get-restrictions-for-repo.response.alternative0", InlineReposInteractionLimitsGetResponse200JsonX9b33954f.Serializer, SdkJson)

  public val interactionsGetRestrictionsForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposInteractionLimitsGetResponse200JsonX9b33954f> =
      MediaTypeCodecRegistry.of(interactionsGetRestrictionsForRepoResponseCodecAlternative0Codec)

  public val interactionsGetRestrictionsForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val interactionsGetRestrictionsForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposInteractionLimitsGetResponse200JsonX9b33954f> =
      MediaTypeCodecRegistry.of(interactionsGetRestrictionsForRepoResponseCodec)

  public const val INTERACTIONSREMOVEPULLREQUESTBYPASSLISTFORREPO_REQUEST_CODEC_ID: String =
      "interactions/remove-pull-request-bypass-list-for-repo.request"

  private val interactionsRemovePullRequestBypassListForRepoRequestCodec:
      MediaTypeCodec<InteractionLimitPullRequestBypassList> =
      KotlinxSerializationCodec(INTERACTIONSREMOVEPULLREQUESTBYPASSLISTFORREPO_REQUEST_CODEC_ID, InteractionLimitPullRequestBypassList.Serializer, SdkJson)

  private val interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/remove-pull-request-bypass-list-for-repo.response.alternative1", BasicError.Serializer, SdkJson)

  public val interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative1Codec)

  private val interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/remove-pull-request-bypass-list-for-repo.response.alternative2", BasicError.Serializer, SdkJson)

  public val interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative2Codec)

  private val interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("interactions/remove-pull-request-bypass-list-for-repo.response.alternative3", ValidationError.Serializer, SdkJson)

  public val interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative3Codec)

  public val interactionsRemovePullRequestBypassListForRepoRequestCodecRegistry:
      MediaTypeCodecRegistry<InteractionLimitPullRequestBypassList> =
      MediaTypeCodecRegistry.of(interactionsRemovePullRequestBypassListForRepoRequestCodec)

  public val interactionsRemovePullRequestBypassListForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val interactionsRemoveRestrictionsForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val interactionsRemoveRestrictionsForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val interactionsRemoveRestrictionsForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val interactionsRemoveRestrictionsForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val interactionsRemoveRestrictionsForRepoRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val interactionsRemoveRestrictionsForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val INTERACTIONSSETPULLREQUESTBYPASSLISTFORREPO_REQUEST_CODEC_ID: String =
      "interactions/set-pull-request-bypass-list-for-repo.request"

  private val interactionsSetPullRequestBypassListForRepoRequestCodec:
      MediaTypeCodec<InteractionLimitPullRequestBypassList> =
      KotlinxSerializationCodec(INTERACTIONSSETPULLREQUESTBYPASSLISTFORREPO_REQUEST_CODEC_ID, InteractionLimitPullRequestBypassList.Serializer, SdkJson)

  private val interactionsSetPullRequestBypassListForRepoResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/set-pull-request-bypass-list-for-repo.response.alternative1", BasicError.Serializer, SdkJson)

  public val interactionsSetPullRequestBypassListForRepoResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsSetPullRequestBypassListForRepoResponseCodecAlternative1Codec)

  private val interactionsSetPullRequestBypassListForRepoResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/set-pull-request-bypass-list-for-repo.response.alternative2", BasicError.Serializer, SdkJson)

  public val interactionsSetPullRequestBypassListForRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsSetPullRequestBypassListForRepoResponseCodecAlternative2Codec)

  private val interactionsSetPullRequestBypassListForRepoResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("interactions/set-pull-request-bypass-list-for-repo.response.alternative3", ValidationError.Serializer, SdkJson)

  public val interactionsSetPullRequestBypassListForRepoResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(interactionsSetPullRequestBypassListForRepoResponseCodecAlternative3Codec)

  public val interactionsSetPullRequestBypassListForRepoRequestCodecRegistry:
      MediaTypeCodecRegistry<InteractionLimitPullRequestBypassList> =
      MediaTypeCodecRegistry.of(interactionsSetPullRequestBypassListForRepoRequestCodec)

  public val interactionsSetPullRequestBypassListForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val INTERACTIONSSETRESTRICTIONSFORAUTHENTICATEDUSER_REQUEST_CODEC_ID: String =
      "interactions/set-restrictions-for-authenticated-user.request"

  private val interactionsSetRestrictionsForAuthenticatedUserRequestCodec:
      MediaTypeCodec<InteractionLimit> =
      KotlinxSerializationCodec(INTERACTIONSSETRESTRICTIONSFORAUTHENTICATEDUSER_REQUEST_CODEC_ID, InteractionLimit.Serializer, SdkJson)

  public const val INTERACTIONSSETRESTRICTIONSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "interactions/set-restrictions-for-authenticated-user.response"

  private val interactionsSetRestrictionsForAuthenticatedUserResponseCodec:
      MediaTypeCodec<InteractionLimitResponse> =
      KotlinxSerializationCodec(INTERACTIONSSETRESTRICTIONSFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, InteractionLimitResponse.Serializer, SdkJson)

  private val interactionsSetRestrictionsForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<InteractionLimitResponse> =
      KotlinxSerializationCodec("interactions/set-restrictions-for-authenticated-user.response.alternative0", InteractionLimitResponse.Serializer, SdkJson)

  public val interactionsSetRestrictionsForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InteractionLimitResponse> =
      MediaTypeCodecRegistry.of(interactionsSetRestrictionsForAuthenticatedUserResponseCodecAlternative0Codec)

  private val interactionsSetRestrictionsForAuthenticatedUserResponseCodecAlternative1Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("interactions/set-restrictions-for-authenticated-user.response.alternative1", ValidationError.Serializer, SdkJson)

  public val interactionsSetRestrictionsForAuthenticatedUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(interactionsSetRestrictionsForAuthenticatedUserResponseCodecAlternative1Codec)

  public val interactionsSetRestrictionsForAuthenticatedUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InteractionLimit> =
      MediaTypeCodecRegistry.of(interactionsSetRestrictionsForAuthenticatedUserRequestCodec)

  public val interactionsSetRestrictionsForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InteractionLimitResponse> =
      MediaTypeCodecRegistry.of(interactionsSetRestrictionsForAuthenticatedUserResponseCodec)

  public const val INTERACTIONSSETRESTRICTIONSFORORG_REQUEST_CODEC_ID: String =
      "interactions/set-restrictions-for-org.request"

  private val interactionsSetRestrictionsForOrgRequestCodec: MediaTypeCodec<InteractionLimit> =
      KotlinxSerializationCodec(INTERACTIONSSETRESTRICTIONSFORORG_REQUEST_CODEC_ID, InteractionLimit.Serializer, SdkJson)

  public const val INTERACTIONSSETRESTRICTIONSFORORG_RESPONSE_CODEC_ID: String =
      "interactions/set-restrictions-for-org.response"

  private val interactionsSetRestrictionsForOrgResponseCodec:
      MediaTypeCodec<InteractionLimitResponse> =
      KotlinxSerializationCodec(INTERACTIONSSETRESTRICTIONSFORORG_RESPONSE_CODEC_ID, InteractionLimitResponse.Serializer, SdkJson)

  private val interactionsSetRestrictionsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<InteractionLimitResponse> =
      KotlinxSerializationCodec("interactions/set-restrictions-for-org.response.alternative0", InteractionLimitResponse.Serializer, SdkJson)

  public val interactionsSetRestrictionsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InteractionLimitResponse> =
      MediaTypeCodecRegistry.of(interactionsSetRestrictionsForOrgResponseCodecAlternative0Codec)

  private val interactionsSetRestrictionsForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("interactions/set-restrictions-for-org.response.alternative1", ValidationError.Serializer, SdkJson)

  public val interactionsSetRestrictionsForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(interactionsSetRestrictionsForOrgResponseCodecAlternative1Codec)

  public val interactionsSetRestrictionsForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InteractionLimit> =
      MediaTypeCodecRegistry.of(interactionsSetRestrictionsForOrgRequestCodec)

  public val interactionsSetRestrictionsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<InteractionLimitResponse> =
      MediaTypeCodecRegistry.of(interactionsSetRestrictionsForOrgResponseCodec)

  public const val INTERACTIONSSETRESTRICTIONSFORREPO_REQUEST_CODEC_ID: String =
      "interactions/set-restrictions-for-repo.request"

  private val interactionsSetRestrictionsForRepoRequestCodec: MediaTypeCodec<InteractionLimit> =
      KotlinxSerializationCodec(INTERACTIONSSETRESTRICTIONSFORREPO_REQUEST_CODEC_ID, InteractionLimit.Serializer, SdkJson)

  public const val INTERACTIONSSETRESTRICTIONSFORREPO_RESPONSE_CODEC_ID: String =
      "interactions/set-restrictions-for-repo.response"

  private val interactionsSetRestrictionsForRepoResponseCodec:
      MediaTypeCodec<InteractionLimitResponse> =
      KotlinxSerializationCodec(INTERACTIONSSETRESTRICTIONSFORREPO_RESPONSE_CODEC_ID, InteractionLimitResponse.Serializer, SdkJson)

  private val interactionsSetRestrictionsForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<InteractionLimitResponse> =
      KotlinxSerializationCodec("interactions/set-restrictions-for-repo.response.alternative0", InteractionLimitResponse.Serializer, SdkJson)

  public val interactionsSetRestrictionsForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InteractionLimitResponse> =
      MediaTypeCodecRegistry.of(interactionsSetRestrictionsForRepoResponseCodecAlternative0Codec)

  public val interactionsSetRestrictionsForRepoRequestCodecRegistry:
      MediaTypeCodecRegistry<InteractionLimit> =
      MediaTypeCodecRegistry.of(interactionsSetRestrictionsForRepoRequestCodec)

  public val interactionsSetRestrictionsForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<InteractionLimitResponse> =
      MediaTypeCodecRegistry.of(interactionsSetRestrictionsForRepoResponseCodec)

  public const val INTERACTIONSUPDATEPULLREQUESTCREATIONCAPFORREPO_REQUEST_CODEC_ID: String =
      "interactions/update-pull-request-creation-cap-for-repo.request"

  private val interactionsUpdatePullRequestCreationCapForRepoRequestCodec:
      MediaTypeCodec<InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6> =
      KotlinxSerializationCodec(INTERACTIONSUPDATEPULLREQUESTCREATIONCAPFORREPO_REQUEST_CODEC_ID, InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6.Serializer, SdkJson)

  public const val INTERACTIONSUPDATEPULLREQUESTCREATIONCAPFORREPO_RESPONSE_CODEC_ID: String =
      "interactions/update-pull-request-creation-cap-for-repo.response"

  private val interactionsUpdatePullRequestCreationCapForRepoResponseCodec:
      MediaTypeCodec<InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289> =
      KotlinxSerializationCodec(INTERACTIONSUPDATEPULLREQUESTCREATIONCAPFORREPO_RESPONSE_CODEC_ID, InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289.Serializer, SdkJson)

  private val interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289> =
      KotlinxSerializationCodec("interactions/update-pull-request-creation-cap-for-repo.response.alternative0", InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289.Serializer, SdkJson)

  public val interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289>
      =
      MediaTypeCodecRegistry.of(interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative0Codec)

  private val interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/update-pull-request-creation-cap-for-repo.response.alternative1", BasicError.Serializer, SdkJson)

  public val interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative1Codec)

  private val interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/update-pull-request-creation-cap-for-repo.response.alternative2", BasicError.Serializer, SdkJson)

  public val interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative2Codec)

  private val interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("interactions/update-pull-request-creation-cap-for-repo.response.alternative3", BasicError.Serializer, SdkJson)

  public val interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative3Codec)

  private val interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("interactions/update-pull-request-creation-cap-for-repo.response.alternative4", ValidationError.Serializer, SdkJson)

  public val interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative4Codec)

  public val interactionsUpdatePullRequestCreationCapForRepoRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6>
      = MediaTypeCodecRegistry.of(interactionsUpdatePullRequestCreationCapForRepoRequestCodec)

  public val interactionsUpdatePullRequestCreationCapForRepoResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289>
      = MediaTypeCodecRegistry.of(interactionsUpdatePullRequestCreationCapForRepoResponseCodec)
}

/**
 * Client for the 'interactions' group of GitHub v3 REST API.
 */
public class InteractionsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@InteractionsClient.authentication)

  /**
   * Lists the users that are on the pull request creation cap bypass list for a
   * repository. Users on this list can create pull requests regardless of any
   * configured pull request creation cap.
   *
   * Only users with maintainer permissions can view the bypass list.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws InteractionsGetPullRequestBypassListForRepoApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded InteractionsGetPullRequestBypassListForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsGetPullRequestBypassListForRepo(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.executeWithTypedErrors<Unit, InteractionsGetPullRequestBypassListForRepoResponse, List<SimpleUser>>(
    request = SdkExecutionRequest(interactionsGetPullRequestBypassListForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = InteractionsCodecs.interactionsGetPullRequestBypassListForRepoRequestCodecRegistry,
    responseDecoder = InteractionsGetPullRequestBypassListForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is InteractionsGetPullRequestBypassListForRepoResponse.SuccessJson -> response.json
        is InteractionsGetPullRequestBypassListForRepoResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsGetPullRequestBypassListForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsGetPullRequestBypassListForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is InteractionsGetPullRequestBypassListForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is InteractionsGetPullRequestBypassListForRepoResponse.Http403Json -> InteractionsGetPullRequestBypassListForRepoApiException(response, statusCode, headers)
        is InteractionsGetPullRequestBypassListForRepoResponse.Http404Json -> InteractionsGetPullRequestBypassListForRepoApiException(response, statusCode, headers)
        is InteractionsGetPullRequestBypassListForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists the users that are on the pull request creation cap bypass list for a
   * repository. Users on this list can create pull requests regardless of any
   * configured pull request creation cap.
   *
   * Only users with maintainer permissions can view the bypass list.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun interactionsGetPullRequestBypassListForRepoWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<InteractionsGetPullRequestBypassListForRepoResponse> = executor.executeWithResponse<Unit, InteractionsGetPullRequestBypassListForRepoResponse>(SdkExecutionRequest(interactionsGetPullRequestBypassListForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), InteractionsCodecs.interactionsGetPullRequestBypassListForRepoRequestCodecRegistry, InteractionsGetPullRequestBypassListForRepoResponseDecoder, options)

  /**
   * Gets the pull request creation cap configuration for a repository.
   * The cap limits the number of open pull requests a user can have at one time.
   *
   * Only users with admin access to the repository can view the cap configuration.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws InteractionsGetPullRequestCreationCapForRepoApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded InteractionsGetPullRequestCreationCapForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsGetPullRequestCreationCapForRepo(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): InlineReposInteractionLimitsPullsCreationCapGetResponse200JsonXdf9cbd7a = executor.executeWithTypedErrors<Unit, InteractionsGetPullRequestCreationCapForRepoResponse, InlineReposInteractionLimitsPullsCreationCapGetResponse200JsonXdf9cbd7a>(
    request = SdkExecutionRequest(interactionsGetPullRequestCreationCapForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = InteractionsCodecs.interactionsGetPullRequestCreationCapForRepoRequestCodecRegistry,
    responseDecoder = InteractionsGetPullRequestCreationCapForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is InteractionsGetPullRequestCreationCapForRepoResponse.SuccessJson -> response.json
        is InteractionsGetPullRequestCreationCapForRepoResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsGetPullRequestCreationCapForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsGetPullRequestCreationCapForRepoResponse.Http405Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsGetPullRequestCreationCapForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is InteractionsGetPullRequestCreationCapForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is InteractionsGetPullRequestCreationCapForRepoResponse.Http403Json -> InteractionsGetPullRequestCreationCapForRepoApiException(response, statusCode, headers)
        is InteractionsGetPullRequestCreationCapForRepoResponse.Http404Json -> InteractionsGetPullRequestCreationCapForRepoApiException(response, statusCode, headers)
        is InteractionsGetPullRequestCreationCapForRepoResponse.Http405Json -> InteractionsGetPullRequestCreationCapForRepoApiException(response, statusCode, headers)
        is InteractionsGetPullRequestCreationCapForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets the pull request creation cap configuration for a repository.
   * The cap limits the number of open pull requests a user can have at one time.
   *
   * Only users with admin access to the repository can view the cap configuration.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun interactionsGetPullRequestCreationCapForRepoWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<InteractionsGetPullRequestCreationCapForRepoResponse> = executor.executeWithResponse<Unit, InteractionsGetPullRequestCreationCapForRepoResponse>(SdkExecutionRequest(interactionsGetPullRequestCreationCapForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), InteractionsCodecs.interactionsGetPullRequestCreationCapForRepoRequestCodecRegistry, InteractionsGetPullRequestCreationCapForRepoResponseDecoder, options)

  /**
   * Shows which type of GitHub user can interact with your public repositories and when the restriction expires.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun interactionsGetRestrictionsForAuthenticatedUserWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<InteractionsGetRestrictionsForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, InteractionsGetRestrictionsForAuthenticatedUserResponse>(SdkExecutionRequest(interactionsGetRestrictionsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), emptyList()), InteractionsCodecs.interactionsGetRestrictionsForAuthenticatedUserRequestCodecRegistry, InteractionsGetRestrictionsForAuthenticatedUserResponseDecoder, options)

  /**
   * Shows which type of GitHub user can interact with this organization and when the restriction expires. If there is
   * no restrictions, you will see an empty response.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsGetRestrictionsForOrg(org: String, options: CallOptions = CallOptions()): InlineOrgsInteractionLimitsGetResponse200JsonX2066929a = executor.execute<Unit, InlineOrgsInteractionLimitsGetResponse200JsonX2066929a>(SdkExecutionRequest(interactionsGetRestrictionsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), listOf(InteractionsCodecs.INTERACTIONSGETRESTRICTIONSFORORG_RESPONSE_CODEC_ID), InteractionsCodecs.interactionsGetRestrictionsForOrgRequestCodecRegistry, InteractionsCodecs.interactionsGetRestrictionsForOrgResponseCodecRegistry, options)

  /**
   * Shows which type of GitHub user can interact with this organization and when the restriction expires. If there is
   * no restrictions, you will see an empty response.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun interactionsGetRestrictionsForOrgWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<InteractionsGetRestrictionsForOrgResponse> = executor.executeWithResponse<Unit, InteractionsGetRestrictionsForOrgResponse>(SdkExecutionRequest(interactionsGetRestrictionsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), InteractionsCodecs.interactionsGetRestrictionsForOrgRequestCodecRegistry, InteractionsGetRestrictionsForOrgResponseDecoder, options)

  /**
   * Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no
   * restrictions, you will see an empty response.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsGetRestrictionsForRepo(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): InlineReposInteractionLimitsGetResponse200JsonX9b33954f = executor.execute<Unit, InlineReposInteractionLimitsGetResponse200JsonX9b33954f>(SdkExecutionRequest(interactionsGetRestrictionsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), listOf(InteractionsCodecs.INTERACTIONSGETRESTRICTIONSFORREPO_RESPONSE_CODEC_ID), InteractionsCodecs.interactionsGetRestrictionsForRepoRequestCodecRegistry, InteractionsCodecs.interactionsGetRestrictionsForRepoResponseCodecRegistry, options)

  /**
   * Shows which type of GitHub user can interact with this repository and when the restriction expires. If there are no
   * restrictions, you will see an empty response.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun interactionsGetRestrictionsForRepoWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<InteractionsGetRestrictionsForRepoResponse> = executor.executeWithResponse<Unit, InteractionsGetRestrictionsForRepoResponse>(SdkExecutionRequest(interactionsGetRestrictionsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), InteractionsCodecs.interactionsGetRestrictionsForRepoRequestCodecRegistry, InteractionsGetRestrictionsForRepoResponseDecoder, options)

  /**
   * Removes users from the pull request creation cap bypass list for a repository.
   * Removed users will be subject to any configured pull request creation cap.
   *
   * Only users with maintainer permissions can modify the bypass list.
   * You can remove a maximum of 100 users per request.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws InteractionsRemovePullRequestBypassListForRepoApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded InteractionsRemovePullRequestBypassListForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsRemovePullRequestBypassListForRepo(
    request: InteractionLimitPullRequestBypassList,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InteractionLimitPullRequestBypassList, InteractionsRemovePullRequestBypassListForRepoResponse, Unit>(
    request = SdkExecutionRequest(interactionsRemovePullRequestBypassListForRepoMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSREMOVEPULLREQUESTBYPASSLISTFORREPO_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = InteractionsCodecs.interactionsRemovePullRequestBypassListForRepoRequestCodecRegistry,
    responseDecoder = InteractionsRemovePullRequestBypassListForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is InteractionsRemovePullRequestBypassListForRepoResponse.SuccessNoContent -> response.unit
        is InteractionsRemovePullRequestBypassListForRepoResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsRemovePullRequestBypassListForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsRemovePullRequestBypassListForRepoResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsRemovePullRequestBypassListForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is InteractionsRemovePullRequestBypassListForRepoResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is InteractionsRemovePullRequestBypassListForRepoResponse.Http403Json -> InteractionsRemovePullRequestBypassListForRepoApiException(response, statusCode, headers)
        is InteractionsRemovePullRequestBypassListForRepoResponse.Http404Json -> InteractionsRemovePullRequestBypassListForRepoApiException(response, statusCode, headers)
        is InteractionsRemovePullRequestBypassListForRepoResponse.Http422Json -> InteractionsRemovePullRequestBypassListForRepoApiException(response, statusCode, headers)
        is InteractionsRemovePullRequestBypassListForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes users from the pull request creation cap bypass list for a repository.
   * Removed users will be subject to any configured pull request creation cap.
   *
   * Only users with maintainer permissions can modify the bypass list.
   * You can remove a maximum of 100 users per request.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun interactionsRemovePullRequestBypassListForRepoWithResponse(
    request: InteractionLimitPullRequestBypassList,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<InteractionsRemovePullRequestBypassListForRepoResponse> = executor.executeWithResponse<InteractionLimitPullRequestBypassList, InteractionsRemovePullRequestBypassListForRepoResponse>(SdkExecutionRequest(interactionsRemovePullRequestBypassListForRepoMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSREMOVEPULLREQUESTBYPASSLISTFORREPO_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), InteractionsCodecs.interactionsRemovePullRequestBypassListForRepoRequestCodecRegistry, InteractionsRemovePullRequestBypassListForRepoResponseDecoder, options)

  /**
   * Removes any interaction restrictions from your public repositories.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsRemoveRestrictionsForAuthenticatedUser(options: CallOptions = CallOptions()): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(interactionsRemoveRestrictionsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), emptyList()), InteractionsCodecs.interactionsRemoveRestrictionsForAuthenticatedUserRequestCodecRegistry, options)

  /**
   * Removes any interaction restrictions from your public repositories.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun interactionsRemoveRestrictionsForAuthenticatedUserWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<InteractionsRemoveRestrictionsForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, InteractionsRemoveRestrictionsForAuthenticatedUserResponse>(SdkExecutionRequest(interactionsRemoveRestrictionsForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), emptyList()), InteractionsCodecs.interactionsRemoveRestrictionsForAuthenticatedUserRequestCodecRegistry, InteractionsRemoveRestrictionsForAuthenticatedUserResponseDecoder, options)

  /**
   * Removes all interaction restrictions from public repositories in the given organization. You must be an
   * organization owner to remove restrictions.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsRemoveRestrictionsForOrg(org: String, options: CallOptions = CallOptions()): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(interactionsRemoveRestrictionsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), InteractionsCodecs.interactionsRemoveRestrictionsForOrgRequestCodecRegistry, options)

  /**
   * Removes all interaction restrictions from public repositories in the given organization. You must be an
   * organization owner to remove restrictions.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun interactionsRemoveRestrictionsForOrgWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<InteractionsRemoveRestrictionsForOrgResponse> = executor.executeWithResponse<Unit, InteractionsRemoveRestrictionsForOrgResponse>(SdkExecutionRequest(interactionsRemoveRestrictionsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), InteractionsCodecs.interactionsRemoveRestrictionsForOrgRequestCodecRegistry, InteractionsRemoveRestrictionsForOrgResponseDecoder, options)

  /**
   * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove
   * restrictions. If the interaction limit is set for the user or organization that owns this repository, you will
   * receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a
   * single repository.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws InteractionsRemoveRestrictionsForRepoApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded InteractionsRemoveRestrictionsForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsRemoveRestrictionsForRepo(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, InteractionsRemoveRestrictionsForRepoResponse, Unit>(
    request = SdkExecutionRequest(interactionsRemoveRestrictionsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = InteractionsCodecs.interactionsRemoveRestrictionsForRepoRequestCodecRegistry,
    responseDecoder = InteractionsRemoveRestrictionsForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is InteractionsRemoveRestrictionsForRepoResponse.SuccessNoContent -> response.unit
        is InteractionsRemoveRestrictionsForRepoResponse.Http409NoContent -> response.unit
        is InteractionsRemoveRestrictionsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is InteractionsRemoveRestrictionsForRepoResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is InteractionsRemoveRestrictionsForRepoResponse.Http409NoContent -> InteractionsRemoveRestrictionsForRepoApiException(response, statusCode, headers)
        is InteractionsRemoveRestrictionsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove
   * restrictions. If the interaction limit is set for the user or organization that owns this repository, you will
   * receive a `409 Conflict` response and will not be able to use this endpoint to change the interaction limit for a
   * single repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun interactionsRemoveRestrictionsForRepoWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<InteractionsRemoveRestrictionsForRepoResponse> = executor.executeWithResponse<Unit, InteractionsRemoveRestrictionsForRepoResponse>(SdkExecutionRequest(interactionsRemoveRestrictionsForRepoMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), InteractionsCodecs.interactionsRemoveRestrictionsForRepoRequestCodecRegistry, InteractionsRemoveRestrictionsForRepoResponseDecoder, options)

  /**
   * Adds users to the pull request creation cap bypass list for a repository.
   * Users on this list can create pull requests regardless of any configured
   * pull request creation cap.
   *
   * Only users with maintainer permissions can modify the bypass list.
   * You can add a maximum of 100 users per request.
   * The bypass list can only hold a maximum of 100 users.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return No response body.
   * @throws InteractionsSetPullRequestBypassListForRepoApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded InteractionsSetPullRequestBypassListForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsSetPullRequestBypassListForRepo(
    request: InteractionLimitPullRequestBypassList,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InteractionLimitPullRequestBypassList, InteractionsSetPullRequestBypassListForRepoResponse, Unit>(
    request = SdkExecutionRequest(interactionsSetPullRequestBypassListForRepoMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSSETPULLREQUESTBYPASSLISTFORREPO_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = InteractionsCodecs.interactionsSetPullRequestBypassListForRepoRequestCodecRegistry,
    responseDecoder = InteractionsSetPullRequestBypassListForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is InteractionsSetPullRequestBypassListForRepoResponse.SuccessNoContent -> response.unit
        is InteractionsSetPullRequestBypassListForRepoResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsSetPullRequestBypassListForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsSetPullRequestBypassListForRepoResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsSetPullRequestBypassListForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is InteractionsSetPullRequestBypassListForRepoResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is InteractionsSetPullRequestBypassListForRepoResponse.Http403Json -> InteractionsSetPullRequestBypassListForRepoApiException(response, statusCode, headers)
        is InteractionsSetPullRequestBypassListForRepoResponse.Http404Json -> InteractionsSetPullRequestBypassListForRepoApiException(response, statusCode, headers)
        is InteractionsSetPullRequestBypassListForRepoResponse.Http422Json -> InteractionsSetPullRequestBypassListForRepoApiException(response, statusCode, headers)
        is InteractionsSetPullRequestBypassListForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds users to the pull request creation cap bypass list for a repository.
   * Users on this list can create pull requests regardless of any configured
   * pull request creation cap.
   *
   * Only users with maintainer permissions can modify the bypass list.
   * You can add a maximum of 100 users per request.
   * The bypass list can only hold a maximum of 100 users.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun interactionsSetPullRequestBypassListForRepoWithResponse(
    request: InteractionLimitPullRequestBypassList,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<InteractionsSetPullRequestBypassListForRepoResponse> = executor.executeWithResponse<InteractionLimitPullRequestBypassList, InteractionsSetPullRequestBypassListForRepoResponse>(SdkExecutionRequest(interactionsSetPullRequestBypassListForRepoMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSSETPULLREQUESTBYPASSLISTFORREPO_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), InteractionsCodecs.interactionsSetPullRequestBypassListForRepoRequestCodecRegistry, InteractionsSetPullRequestBypassListForRepoResponseDecoder, options)

  /**
   * Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction
   * limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the
   * user.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws InteractionsSetRestrictionsForAuthenticatedUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded InteractionsSetRestrictionsForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsSetRestrictionsForAuthenticatedUser(request: InteractionLimit, options: CallOptions = CallOptions()): InteractionLimitResponse = executor.executeWithTypedErrors<InteractionLimit, InteractionsSetRestrictionsForAuthenticatedUserResponse, InteractionLimitResponse>(
    request = SdkExecutionRequest(interactionsSetRestrictionsForAuthenticatedUserMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSSETRESTRICTIONSFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = InteractionsCodecs.interactionsSetRestrictionsForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = InteractionsSetRestrictionsForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is InteractionsSetRestrictionsForAuthenticatedUserResponse.SuccessJson -> response.json
        is InteractionsSetRestrictionsForAuthenticatedUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsSetRestrictionsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is InteractionsSetRestrictionsForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is InteractionsSetRestrictionsForAuthenticatedUserResponse.Http422Json -> InteractionsSetRestrictionsForAuthenticatedUserApiException(response, statusCode, headers)
        is InteractionsSetRestrictionsForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Temporarily restricts which type of GitHub user can interact with your public repositories. Setting the interaction
   * limit at the user level will overwrite any interaction limits that are set for individual repositories owned by the
   * user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun interactionsSetRestrictionsForAuthenticatedUserWithResponse(request: InteractionLimit, options: CallOptions = CallOptions()): SdkResponseResult<InteractionsSetRestrictionsForAuthenticatedUserResponse> = executor.executeWithResponse<InteractionLimit, InteractionsSetRestrictionsForAuthenticatedUserResponse>(SdkExecutionRequest(interactionsSetRestrictionsForAuthenticatedUserMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSSETRESTRICTIONSFORAUTHENTICATEDUSER_REQUEST_CODEC_ID), emptyList()), InteractionsCodecs.interactionsSetRestrictionsForAuthenticatedUserRequestCodecRegistry, InteractionsSetRestrictionsForAuthenticatedUserResponseDecoder, options)

  /**
   * Temporarily restricts interactions to a certain type of GitHub user in any public repository in the given
   * organization. You must be an organization owner to set these restrictions. Setting the interaction limit at the
   * organization level will overwrite any interaction limits that are set for individual repositories owned by the
   * organization.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws InteractionsSetRestrictionsForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded InteractionsSetRestrictionsForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsSetRestrictionsForOrg(
    request: InteractionLimit,
    org: String,
    options: CallOptions = CallOptions(),
  ): InteractionLimitResponse = executor.executeWithTypedErrors<InteractionLimit, InteractionsSetRestrictionsForOrgResponse, InteractionLimitResponse>(
    request = SdkExecutionRequest(interactionsSetRestrictionsForOrgMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSSETRESTRICTIONSFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = InteractionsCodecs.interactionsSetRestrictionsForOrgRequestCodecRegistry,
    responseDecoder = InteractionsSetRestrictionsForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is InteractionsSetRestrictionsForOrgResponse.SuccessJson -> response.json
        is InteractionsSetRestrictionsForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsSetRestrictionsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is InteractionsSetRestrictionsForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is InteractionsSetRestrictionsForOrgResponse.Http422Json -> InteractionsSetRestrictionsForOrgApiException(response, statusCode, headers)
        is InteractionsSetRestrictionsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Temporarily restricts interactions to a certain type of GitHub user in any public repository in the given
   * organization. You must be an organization owner to set these restrictions. Setting the interaction limit at the
   * organization level will overwrite any interaction limits that are set for individual repositories owned by the
   * organization.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun interactionsSetRestrictionsForOrgWithResponse(
    request: InteractionLimit,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<InteractionsSetRestrictionsForOrgResponse> = executor.executeWithResponse<InteractionLimit, InteractionsSetRestrictionsForOrgResponse>(SdkExecutionRequest(interactionsSetRestrictionsForOrgMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSSETRESTRICTIONSFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), InteractionsCodecs.interactionsSetRestrictionsForOrgRequestCodecRegistry, InteractionsSetRestrictionsForOrgResponseDecoder, options)

  /**
   * Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have
   * owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that
   * owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to
   * change the interaction limit for a single repository.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws InteractionsSetRestrictionsForRepoApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded InteractionsSetRestrictionsForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsSetRestrictionsForRepo(
    request: InteractionLimit,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): InteractionLimitResponse = executor.executeWithTypedErrors<InteractionLimit, InteractionsSetRestrictionsForRepoResponse, InteractionLimitResponse>(
    request = SdkExecutionRequest(interactionsSetRestrictionsForRepoMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSSETRESTRICTIONSFORREPO_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = InteractionsCodecs.interactionsSetRestrictionsForRepoRequestCodecRegistry,
    responseDecoder = InteractionsSetRestrictionsForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is InteractionsSetRestrictionsForRepoResponse.SuccessJson -> response.json
        is InteractionsSetRestrictionsForRepoResponse.Http409NoContent -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsSetRestrictionsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is InteractionsSetRestrictionsForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is InteractionsSetRestrictionsForRepoResponse.Http409NoContent -> InteractionsSetRestrictionsForRepoApiException(response, statusCode, headers)
        is InteractionsSetRestrictionsForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Temporarily restricts interactions to a certain type of GitHub user within the given repository. You must have
   * owner or admin access to set these restrictions. If an interaction limit is set for the user or organization that
   * owns this repository, you will receive a `409 Conflict` response and will not be able to use this endpoint to
   * change the interaction limit for a single repository.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun interactionsSetRestrictionsForRepoWithResponse(
    request: InteractionLimit,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<InteractionsSetRestrictionsForRepoResponse> = executor.executeWithResponse<InteractionLimit, InteractionsSetRestrictionsForRepoResponse>(SdkExecutionRequest(interactionsSetRestrictionsForRepoMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSSETRESTRICTIONSFORREPO_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), InteractionsCodecs.interactionsSetRestrictionsForRepoRequestCodecRegistry, InteractionsSetRestrictionsForRepoResponseDecoder, options)

  /**
   * Updates the pull request creation cap for a repository. The cap limits the number
   * of open pull requests a user can have at one time.
   *
   * Only users with admin access to the repository can configure the cap.
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws InteractionsUpdatePullRequestCreationCapForRepoApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded InteractionsUpdatePullRequestCreationCapForRepoError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun interactionsUpdatePullRequestCreationCapForRepo(
    request: InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289 = executor.executeWithTypedErrors<InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6, InteractionsUpdatePullRequestCreationCapForRepoResponse, InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289>(
    request = SdkExecutionRequest(interactionsUpdatePullRequestCreationCapForRepoMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSUPDATEPULLREQUESTCREATIONCAPFORREPO_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = InteractionsCodecs.interactionsUpdatePullRequestCreationCapForRepoRequestCodecRegistry,
    responseDecoder = InteractionsUpdatePullRequestCreationCapForRepoResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.SuccessJson -> response.json
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.Http405Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.Http403Json -> InteractionsUpdatePullRequestCreationCapForRepoApiException(response, statusCode, headers)
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.Http404Json -> InteractionsUpdatePullRequestCreationCapForRepoApiException(response, statusCode, headers)
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.Http405Json -> InteractionsUpdatePullRequestCreationCapForRepoApiException(response, statusCode, headers)
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.Http422Json -> InteractionsUpdatePullRequestCreationCapForRepoApiException(response, statusCode, headers)
        is InteractionsUpdatePullRequestCreationCapForRepoResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates the pull request creation cap for a repository. The cap limits the number
   * of open pull requests a user can have at one time.
   *
   * Only users with admin access to the repository can configure the cap.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun interactionsUpdatePullRequestCreationCapForRepoWithResponse(
    request: InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6,
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<InteractionsUpdatePullRequestCreationCapForRepoResponse> = executor.executeWithResponse<InlineReposInteractionLimitsPullsCreationCapPatchRequestJsonX0e42dff6, InteractionsUpdatePullRequestCreationCapForRepoResponse>(SdkExecutionRequest(interactionsUpdatePullRequestCreationCapForRepoMetadata, baseUri, request, listOf(InteractionsCodecs.INTERACTIONSUPDATEPULLREQUESTCREATIONCAPFORREPO_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), InteractionsCodecs.interactionsUpdatePullRequestCreationCapForRepoRequestCodecRegistry, InteractionsUpdatePullRequestCreationCapForRepoResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `interactions/get-pull-request-bypass-list-for-repo` may expose
   * through its typed API exception.
   */
  public sealed interface InteractionsGetPullRequestBypassListForRepoError

  /**
   * Typed response alternatives for `interactions/get-pull-request-bypass-list-for-repo`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface InteractionsGetPullRequestBypassListForRepoResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetPullRequestBypassListForRepoResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetPullRequestBypassListForRepoResponse,
        InteractionsGetPullRequestBypassListForRepoError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetPullRequestBypassListForRepoResponse,
        InteractionsGetPullRequestBypassListForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetPullRequestBypassListForRepoResponse
  }

  /**
   * Raised by `interactions/get-pull-request-bypass-list-for-repo` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class InteractionsGetPullRequestBypassListForRepoApiException(
    public val error: InteractionsGetPullRequestBypassListForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "interactions/get-pull-request-bypass-list-for-repo")

  private object InteractionsGetPullRequestBypassListForRepoResponseDecoder : SdkResponseAlternativeDecoder<InteractionsGetPullRequestBypassListForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsGetPullRequestBypassListForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsGetPullRequestBypassListForRepoResponse> = when {
      alternative.id == "interactions/get-pull-request-bypass-list-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsGetPullRequestBypassListForRepoResponse.SuccessJson(
          json = InteractionsCodecs.interactionsGetPullRequestBypassListForRepoResponseCodecAlternative0Registry.select(listOf("interactions/get-pull-request-bypass-list-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/get-pull-request-bypass-list-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = InteractionsGetPullRequestBypassListForRepoResponse.Http403Json(
          json = InteractionsCodecs.interactionsGetPullRequestBypassListForRepoResponseCodecAlternative1Registry.select(listOf("interactions/get-pull-request-bypass-list-for-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/get-pull-request-bypass-list-for-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = InteractionsGetPullRequestBypassListForRepoResponse.Http404Json(
          json = InteractionsCodecs.interactionsGetPullRequestBypassListForRepoResponseCodecAlternative2Registry.select(listOf("interactions/get-pull-request-bypass-list-for-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): InteractionsGetPullRequestBypassListForRepoResponse = InteractionsGetPullRequestBypassListForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `interactions/get-pull-request-creation-cap-for-repo` may expose
   * through its typed API exception.
   */
  public sealed interface InteractionsGetPullRequestCreationCapForRepoError

  /**
   * Typed response alternatives for `interactions/get-pull-request-creation-cap-for-repo`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface InteractionsGetPullRequestCreationCapForRepoResponse {
    public class SuccessJson(
      public val json: InlineReposInteractionLimitsPullsCreationCapGetResponse200JsonXdf9cbd7a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetPullRequestCreationCapForRepoResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetPullRequestCreationCapForRepoResponse,
        InteractionsGetPullRequestCreationCapForRepoError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetPullRequestCreationCapForRepoResponse,
        InteractionsGetPullRequestCreationCapForRepoError

    public class Http405Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetPullRequestCreationCapForRepoResponse,
        InteractionsGetPullRequestCreationCapForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetPullRequestCreationCapForRepoResponse
  }

  /**
   * Raised by `interactions/get-pull-request-creation-cap-for-repo` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class InteractionsGetPullRequestCreationCapForRepoApiException(
    public val error: InteractionsGetPullRequestCreationCapForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "interactions/get-pull-request-creation-cap-for-repo")

  private object InteractionsGetPullRequestCreationCapForRepoResponseDecoder : SdkResponseAlternativeDecoder<InteractionsGetPullRequestCreationCapForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsGetPullRequestCreationCapForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsGetPullRequestCreationCapForRepoResponse> = when {
      alternative.id == "interactions/get-pull-request-creation-cap-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsGetPullRequestCreationCapForRepoResponse.SuccessJson(
          json = InteractionsCodecs.interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative0Registry.select(listOf("interactions/get-pull-request-creation-cap-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/get-pull-request-creation-cap-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = InteractionsGetPullRequestCreationCapForRepoResponse.Http403Json(
          json = InteractionsCodecs.interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative1Registry.select(listOf("interactions/get-pull-request-creation-cap-for-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/get-pull-request-creation-cap-for-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = InteractionsGetPullRequestCreationCapForRepoResponse.Http404Json(
          json = InteractionsCodecs.interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative2Registry.select(listOf("interactions/get-pull-request-creation-cap-for-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/get-pull-request-creation-cap-for-repo.response.alternative3" -> SdkResponseDecodeResult(
        value = InteractionsGetPullRequestCreationCapForRepoResponse.Http405Json(
          json = InteractionsCodecs.interactionsGetPullRequestCreationCapForRepoResponseCodecAlternative3Registry.select(listOf("interactions/get-pull-request-creation-cap-for-repo.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): InteractionsGetPullRequestCreationCapForRepoResponse = InteractionsGetPullRequestCreationCapForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `interactions/get-restrictions-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface InteractionsGetRestrictionsForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InlineUserInteractionLimitsGetResponse200JsonXf89f7190,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetRestrictionsForAuthenticatedUserResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetRestrictionsForAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetRestrictionsForAuthenticatedUserResponse
  }

  private object InteractionsGetRestrictionsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<InteractionsGetRestrictionsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsGetRestrictionsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsGetRestrictionsForAuthenticatedUserResponse> = when {
      alternative.id == "interactions/get-restrictions-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsGetRestrictionsForAuthenticatedUserResponse.SuccessJson(
          json = InteractionsCodecs.interactionsGetRestrictionsForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("interactions/get-restrictions-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/get-restrictions-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = InteractionsGetRestrictionsForAuthenticatedUserResponse.SuccessNoContent(
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
    ): InteractionsGetRestrictionsForAuthenticatedUserResponse = InteractionsGetRestrictionsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `interactions/get-restrictions-for-org`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface InteractionsGetRestrictionsForOrgResponse {
    public class SuccessJson(
      public val json: InlineOrgsInteractionLimitsGetResponse200JsonX2066929a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetRestrictionsForOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetRestrictionsForOrgResponse
  }

  private object InteractionsGetRestrictionsForOrgResponseDecoder : SdkResponseAlternativeDecoder<InteractionsGetRestrictionsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsGetRestrictionsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsGetRestrictionsForOrgResponse> = when {
      alternative.id == "interactions/get-restrictions-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsGetRestrictionsForOrgResponse.SuccessJson(
          json = InteractionsCodecs.interactionsGetRestrictionsForOrgResponseCodecAlternative0Registry.select(listOf("interactions/get-restrictions-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): InteractionsGetRestrictionsForOrgResponse = InteractionsGetRestrictionsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `interactions/get-restrictions-for-repo`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface InteractionsGetRestrictionsForRepoResponse {
    public class SuccessJson(
      public val json: InlineReposInteractionLimitsGetResponse200JsonX9b33954f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetRestrictionsForRepoResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsGetRestrictionsForRepoResponse
  }

  private object InteractionsGetRestrictionsForRepoResponseDecoder : SdkResponseAlternativeDecoder<InteractionsGetRestrictionsForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsGetRestrictionsForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsGetRestrictionsForRepoResponse> = when {
      alternative.id == "interactions/get-restrictions-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsGetRestrictionsForRepoResponse.SuccessJson(
          json = InteractionsCodecs.interactionsGetRestrictionsForRepoResponseCodecAlternative0Registry.select(listOf("interactions/get-restrictions-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): InteractionsGetRestrictionsForRepoResponse = InteractionsGetRestrictionsForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `interactions/remove-pull-request-bypass-list-for-repo` may expose
   * through its typed API exception.
   */
  public sealed interface InteractionsRemovePullRequestBypassListForRepoError

  /**
   * Typed response alternatives for `interactions/remove-pull-request-bypass-list-for-repo`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface InteractionsRemovePullRequestBypassListForRepoResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemovePullRequestBypassListForRepoResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemovePullRequestBypassListForRepoResponse,
        InteractionsRemovePullRequestBypassListForRepoError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemovePullRequestBypassListForRepoResponse,
        InteractionsRemovePullRequestBypassListForRepoError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemovePullRequestBypassListForRepoResponse,
        InteractionsRemovePullRequestBypassListForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemovePullRequestBypassListForRepoResponse
  }

  /**
   * Raised by `interactions/remove-pull-request-bypass-list-for-repo` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class InteractionsRemovePullRequestBypassListForRepoApiException(
    public val error: InteractionsRemovePullRequestBypassListForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "interactions/remove-pull-request-bypass-list-for-repo")

  private object InteractionsRemovePullRequestBypassListForRepoResponseDecoder : SdkResponseAlternativeDecoder<InteractionsRemovePullRequestBypassListForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsRemovePullRequestBypassListForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsRemovePullRequestBypassListForRepoResponse> = when {
      alternative.id == "interactions/remove-pull-request-bypass-list-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsRemovePullRequestBypassListForRepoResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/remove-pull-request-bypass-list-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = InteractionsRemovePullRequestBypassListForRepoResponse.Http403Json(
          json = InteractionsCodecs.interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative1Registry.select(listOf("interactions/remove-pull-request-bypass-list-for-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/remove-pull-request-bypass-list-for-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = InteractionsRemovePullRequestBypassListForRepoResponse.Http404Json(
          json = InteractionsCodecs.interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative2Registry.select(listOf("interactions/remove-pull-request-bypass-list-for-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/remove-pull-request-bypass-list-for-repo.response.alternative3" -> SdkResponseDecodeResult(
        value = InteractionsRemovePullRequestBypassListForRepoResponse.Http422Json(
          json = InteractionsCodecs.interactionsRemovePullRequestBypassListForRepoResponseCodecAlternative3Registry.select(listOf("interactions/remove-pull-request-bypass-list-for-repo.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): InteractionsRemovePullRequestBypassListForRepoResponse = InteractionsRemovePullRequestBypassListForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `interactions/remove-restrictions-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface InteractionsRemoveRestrictionsForAuthenticatedUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemoveRestrictionsForAuthenticatedUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemoveRestrictionsForAuthenticatedUserResponse
  }

  private object InteractionsRemoveRestrictionsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<InteractionsRemoveRestrictionsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsRemoveRestrictionsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsRemoveRestrictionsForAuthenticatedUserResponse> = when {
      alternative.id == "interactions/remove-restrictions-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsRemoveRestrictionsForAuthenticatedUserResponse.SuccessNoContent(
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
    ): InteractionsRemoveRestrictionsForAuthenticatedUserResponse = InteractionsRemoveRestrictionsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `interactions/remove-restrictions-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface InteractionsRemoveRestrictionsForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemoveRestrictionsForOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemoveRestrictionsForOrgResponse
  }

  private object InteractionsRemoveRestrictionsForOrgResponseDecoder : SdkResponseAlternativeDecoder<InteractionsRemoveRestrictionsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsRemoveRestrictionsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsRemoveRestrictionsForOrgResponse> = when {
      alternative.id == "interactions/remove-restrictions-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsRemoveRestrictionsForOrgResponse.SuccessNoContent(
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
    ): InteractionsRemoveRestrictionsForOrgResponse = InteractionsRemoveRestrictionsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `interactions/remove-restrictions-for-repo` may expose through its
   * typed API exception.
   */
  public sealed interface InteractionsRemoveRestrictionsForRepoError

  /**
   * Typed response alternatives for `interactions/remove-restrictions-for-repo`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface InteractionsRemoveRestrictionsForRepoResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemoveRestrictionsForRepoResponse

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemoveRestrictionsForRepoResponse,
        InteractionsRemoveRestrictionsForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsRemoveRestrictionsForRepoResponse
  }

  /**
   * Raised by `interactions/remove-restrictions-for-repo` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class InteractionsRemoveRestrictionsForRepoApiException(
    public val error: InteractionsRemoveRestrictionsForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "interactions/remove-restrictions-for-repo")

  private object InteractionsRemoveRestrictionsForRepoResponseDecoder : SdkResponseAlternativeDecoder<InteractionsRemoveRestrictionsForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsRemoveRestrictionsForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsRemoveRestrictionsForRepoResponse> = when {
      alternative.id == "interactions/remove-restrictions-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsRemoveRestrictionsForRepoResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/remove-restrictions-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = InteractionsRemoveRestrictionsForRepoResponse.Http409NoContent(
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
    ): InteractionsRemoveRestrictionsForRepoResponse = InteractionsRemoveRestrictionsForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `interactions/set-pull-request-bypass-list-for-repo` may expose
   * through its typed API exception.
   */
  public sealed interface InteractionsSetPullRequestBypassListForRepoError

  /**
   * Typed response alternatives for `interactions/set-pull-request-bypass-list-for-repo`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface InteractionsSetPullRequestBypassListForRepoResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetPullRequestBypassListForRepoResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetPullRequestBypassListForRepoResponse,
        InteractionsSetPullRequestBypassListForRepoError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetPullRequestBypassListForRepoResponse,
        InteractionsSetPullRequestBypassListForRepoError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetPullRequestBypassListForRepoResponse,
        InteractionsSetPullRequestBypassListForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetPullRequestBypassListForRepoResponse
  }

  /**
   * Raised by `interactions/set-pull-request-bypass-list-for-repo` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class InteractionsSetPullRequestBypassListForRepoApiException(
    public val error: InteractionsSetPullRequestBypassListForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "interactions/set-pull-request-bypass-list-for-repo")

  private object InteractionsSetPullRequestBypassListForRepoResponseDecoder : SdkResponseAlternativeDecoder<InteractionsSetPullRequestBypassListForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsSetPullRequestBypassListForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsSetPullRequestBypassListForRepoResponse> = when {
      alternative.id == "interactions/set-pull-request-bypass-list-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsSetPullRequestBypassListForRepoResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/set-pull-request-bypass-list-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = InteractionsSetPullRequestBypassListForRepoResponse.Http403Json(
          json = InteractionsCodecs.interactionsSetPullRequestBypassListForRepoResponseCodecAlternative1Registry.select(listOf("interactions/set-pull-request-bypass-list-for-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/set-pull-request-bypass-list-for-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = InteractionsSetPullRequestBypassListForRepoResponse.Http404Json(
          json = InteractionsCodecs.interactionsSetPullRequestBypassListForRepoResponseCodecAlternative2Registry.select(listOf("interactions/set-pull-request-bypass-list-for-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/set-pull-request-bypass-list-for-repo.response.alternative3" -> SdkResponseDecodeResult(
        value = InteractionsSetPullRequestBypassListForRepoResponse.Http422Json(
          json = InteractionsCodecs.interactionsSetPullRequestBypassListForRepoResponseCodecAlternative3Registry.select(listOf("interactions/set-pull-request-bypass-list-for-repo.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): InteractionsSetPullRequestBypassListForRepoResponse = InteractionsSetPullRequestBypassListForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `interactions/set-restrictions-for-authenticated-user` may expose
   * through its typed API exception.
   */
  public sealed interface InteractionsSetRestrictionsForAuthenticatedUserError

  /**
   * Typed response alternatives for `interactions/set-restrictions-for-authenticated-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface InteractionsSetRestrictionsForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: InteractionLimitResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetRestrictionsForAuthenticatedUserResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetRestrictionsForAuthenticatedUserResponse,
        InteractionsSetRestrictionsForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetRestrictionsForAuthenticatedUserResponse
  }

  /**
   * Raised by `interactions/set-restrictions-for-authenticated-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class InteractionsSetRestrictionsForAuthenticatedUserApiException(
    public val error: InteractionsSetRestrictionsForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "interactions/set-restrictions-for-authenticated-user")

  private object InteractionsSetRestrictionsForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<InteractionsSetRestrictionsForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsSetRestrictionsForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsSetRestrictionsForAuthenticatedUserResponse> = when {
      alternative.id == "interactions/set-restrictions-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsSetRestrictionsForAuthenticatedUserResponse.SuccessJson(
          json = InteractionsCodecs.interactionsSetRestrictionsForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("interactions/set-restrictions-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/set-restrictions-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = InteractionsSetRestrictionsForAuthenticatedUserResponse.Http422Json(
          json = InteractionsCodecs.interactionsSetRestrictionsForAuthenticatedUserResponseCodecAlternative1Registry.select(listOf("interactions/set-restrictions-for-authenticated-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): InteractionsSetRestrictionsForAuthenticatedUserResponse = InteractionsSetRestrictionsForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `interactions/set-restrictions-for-org` may expose through its typed
   * API exception.
   */
  public sealed interface InteractionsSetRestrictionsForOrgError

  /**
   * Typed response alternatives for `interactions/set-restrictions-for-org`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface InteractionsSetRestrictionsForOrgResponse {
    public class SuccessJson(
      public val json: InteractionLimitResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetRestrictionsForOrgResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetRestrictionsForOrgResponse,
        InteractionsSetRestrictionsForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetRestrictionsForOrgResponse
  }

  /**
   * Raised by `interactions/set-restrictions-for-org` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class InteractionsSetRestrictionsForOrgApiException(
    public val error: InteractionsSetRestrictionsForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "interactions/set-restrictions-for-org")

  private object InteractionsSetRestrictionsForOrgResponseDecoder : SdkResponseAlternativeDecoder<InteractionsSetRestrictionsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsSetRestrictionsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsSetRestrictionsForOrgResponse> = when {
      alternative.id == "interactions/set-restrictions-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsSetRestrictionsForOrgResponse.SuccessJson(
          json = InteractionsCodecs.interactionsSetRestrictionsForOrgResponseCodecAlternative0Registry.select(listOf("interactions/set-restrictions-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/set-restrictions-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = InteractionsSetRestrictionsForOrgResponse.Http422Json(
          json = InteractionsCodecs.interactionsSetRestrictionsForOrgResponseCodecAlternative1Registry.select(listOf("interactions/set-restrictions-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): InteractionsSetRestrictionsForOrgResponse = InteractionsSetRestrictionsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `interactions/set-restrictions-for-repo` may expose through its
   * typed API exception.
   */
  public sealed interface InteractionsSetRestrictionsForRepoError

  /**
   * Typed response alternatives for `interactions/set-restrictions-for-repo`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface InteractionsSetRestrictionsForRepoResponse {
    public class SuccessJson(
      public val json: InteractionLimitResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetRestrictionsForRepoResponse

    public class Http409NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetRestrictionsForRepoResponse,
        InteractionsSetRestrictionsForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsSetRestrictionsForRepoResponse
  }

  /**
   * Raised by `interactions/set-restrictions-for-repo` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class InteractionsSetRestrictionsForRepoApiException(
    public val error: InteractionsSetRestrictionsForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "interactions/set-restrictions-for-repo")

  private object InteractionsSetRestrictionsForRepoResponseDecoder : SdkResponseAlternativeDecoder<InteractionsSetRestrictionsForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsSetRestrictionsForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsSetRestrictionsForRepoResponse> = when {
      alternative.id == "interactions/set-restrictions-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsSetRestrictionsForRepoResponse.SuccessJson(
          json = InteractionsCodecs.interactionsSetRestrictionsForRepoResponseCodecAlternative0Registry.select(listOf("interactions/set-restrictions-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/set-restrictions-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = InteractionsSetRestrictionsForRepoResponse.Http409NoContent(
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
    ): InteractionsSetRestrictionsForRepoResponse = InteractionsSetRestrictionsForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `interactions/update-pull-request-creation-cap-for-repo` may expose
   * through its typed API exception.
   */
  public sealed interface InteractionsUpdatePullRequestCreationCapForRepoError

  /**
   * Typed response alternatives for `interactions/update-pull-request-creation-cap-for-repo`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface InteractionsUpdatePullRequestCreationCapForRepoResponse {
    public class SuccessJson(
      public val json: InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsUpdatePullRequestCreationCapForRepoResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsUpdatePullRequestCreationCapForRepoResponse,
        InteractionsUpdatePullRequestCreationCapForRepoError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsUpdatePullRequestCreationCapForRepoResponse,
        InteractionsUpdatePullRequestCreationCapForRepoError

    public class Http405Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsUpdatePullRequestCreationCapForRepoResponse,
        InteractionsUpdatePullRequestCreationCapForRepoError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsUpdatePullRequestCreationCapForRepoResponse,
        InteractionsUpdatePullRequestCreationCapForRepoError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : InteractionsUpdatePullRequestCreationCapForRepoResponse
  }

  /**
   * Raised by `interactions/update-pull-request-creation-cap-for-repo` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class InteractionsUpdatePullRequestCreationCapForRepoApiException(
    public val error: InteractionsUpdatePullRequestCreationCapForRepoError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "interactions/update-pull-request-creation-cap-for-repo")

  private object InteractionsUpdatePullRequestCreationCapForRepoResponseDecoder : SdkResponseAlternativeDecoder<InteractionsUpdatePullRequestCreationCapForRepoResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): InteractionsUpdatePullRequestCreationCapForRepoResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<InteractionsUpdatePullRequestCreationCapForRepoResponse> = when {
      alternative.id == "interactions/update-pull-request-creation-cap-for-repo.response.alternative0" -> SdkResponseDecodeResult(
        value = InteractionsUpdatePullRequestCreationCapForRepoResponse.SuccessJson(
          json = InteractionsCodecs.interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative0Registry.select(listOf("interactions/update-pull-request-creation-cap-for-repo.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/update-pull-request-creation-cap-for-repo.response.alternative1" -> SdkResponseDecodeResult(
        value = InteractionsUpdatePullRequestCreationCapForRepoResponse.Http403Json(
          json = InteractionsCodecs.interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative1Registry.select(listOf("interactions/update-pull-request-creation-cap-for-repo.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/update-pull-request-creation-cap-for-repo.response.alternative2" -> SdkResponseDecodeResult(
        value = InteractionsUpdatePullRequestCreationCapForRepoResponse.Http404Json(
          json = InteractionsCodecs.interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative2Registry.select(listOf("interactions/update-pull-request-creation-cap-for-repo.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/update-pull-request-creation-cap-for-repo.response.alternative3" -> SdkResponseDecodeResult(
        value = InteractionsUpdatePullRequestCreationCapForRepoResponse.Http405Json(
          json = InteractionsCodecs.interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative3Registry.select(listOf("interactions/update-pull-request-creation-cap-for-repo.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "interactions/update-pull-request-creation-cap-for-repo.response.alternative4" -> SdkResponseDecodeResult(
        value = InteractionsUpdatePullRequestCreationCapForRepoResponse.Http422Json(
          json = InteractionsCodecs.interactionsUpdatePullRequestCreationCapForRepoResponseCodecAlternative4Registry.select(listOf("interactions/update-pull-request-creation-cap-for-repo.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): InteractionsUpdatePullRequestCreationCapForRepoResponse = InteractionsUpdatePullRequestCreationCapForRepoResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val interactionsGetPullRequestBypassListForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/get-pull-request-bypass-list-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/interaction-limits/pulls/bypass-list",
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
              id = "interactions/get-pull-request-bypass-list-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/get-pull-request-bypass-list-for-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/get-pull-request-bypass-list-for-repo.response.alternative2",
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

    public val interactionsGetPullRequestCreationCapForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/get-pull-request-creation-cap-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/interaction-limits/pulls/creation-cap",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposInteractionLimitsPullsCreationCapGetResponse200JsonXdf9cbd7a",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/get-pull-request-creation-cap-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/get-pull-request-creation-cap-for-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/get-pull-request-creation-cap-for-repo.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 405),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/get-pull-request-creation-cap-for-repo.response.alternative3",
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

    public val interactionsGetRestrictionsForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/get-restrictions-for-authenticated-user",
          method = "GET",
          path = "/user/interaction-limits",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUserInteractionLimitsGetResponse200JsonXf89f7190",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/get-restrictions-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/get-restrictions-for-authenticated-user.response.alternative1",
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

    public val interactionsGetRestrictionsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/get-restrictions-for-org",
          method = "GET",
          path = "/orgs/{org}/interaction-limits",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsInteractionLimitsGetResponse200JsonX2066929a",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/get-restrictions-for-org.response.alternative0",
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

    public val interactionsGetRestrictionsForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/get-restrictions-for-repo",
          method = "GET",
          path = "/repos/{owner}/{repo}/interaction-limits",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposInteractionLimitsGetResponse200JsonX9b33954f",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/get-restrictions-for-repo.response.alternative0",
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

    public val interactionsRemovePullRequestBypassListForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/remove-pull-request-bypass-list-for-repo",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/interaction-limits/pulls/bypass-list",
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
              id = "interactions/remove-pull-request-bypass-list-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/remove-pull-request-bypass-list-for-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/remove-pull-request-bypass-list-for-repo.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/remove-pull-request-bypass-list-for-repo.response.alternative3",
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

    public val interactionsRemoveRestrictionsForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/remove-restrictions-for-authenticated-user",
          method = "DELETE",
          path = "/user/interaction-limits",
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
              id = "interactions/remove-restrictions-for-authenticated-user.response.alternative0",
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

    public val interactionsRemoveRestrictionsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/remove-restrictions-for-org",
          method = "DELETE",
          path = "/orgs/{org}/interaction-limits",
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
              id = "interactions/remove-restrictions-for-org.response.alternative0",
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

    public val interactionsRemoveRestrictionsForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/remove-restrictions-for-repo",
          method = "DELETE",
          path = "/repos/{owner}/{repo}/interaction-limits",
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
              id = "interactions/remove-restrictions-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/remove-restrictions-for-repo.response.alternative1",
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

    public val interactionsSetPullRequestBypassListForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/set-pull-request-bypass-list-for-repo",
          method = "PUT",
          path = "/repos/{owner}/{repo}/interaction-limits/pulls/bypass-list",
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
              id = "interactions/set-pull-request-bypass-list-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/set-pull-request-bypass-list-for-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/set-pull-request-bypass-list-for-repo.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/set-pull-request-bypass-list-for-repo.response.alternative3",
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

    public val interactionsSetRestrictionsForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/set-restrictions-for-authenticated-user",
          method = "PUT",
          path = "/user/interaction-limits",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InteractionLimitResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/set-restrictions-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/set-restrictions-for-authenticated-user.response.alternative1",
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

    public val interactionsSetRestrictionsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/set-restrictions-for-org",
          method = "PUT",
          path = "/orgs/{org}/interaction-limits",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InteractionLimitResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/set-restrictions-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/set-restrictions-for-org.response.alternative1",
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

    public val interactionsSetRestrictionsForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/set-restrictions-for-repo",
          method = "PUT",
          path = "/repos/{owner}/{repo}/interaction-limits",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InteractionLimitResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/set-restrictions-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/set-restrictions-for-repo.response.alternative1",
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

    public val interactionsUpdatePullRequestCreationCapForRepoMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "interactions/update-pull-request-creation-cap-for-repo",
          method = "PATCH",
          path = "/repos/{owner}/{repo}/interaction-limits/pulls/creation-cap",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposInteractionLimitsPullsCreationCapPatchResponse200JsonX3de7c289",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/update-pull-request-creation-cap-for-repo.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/update-pull-request-creation-cap-for-repo.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/update-pull-request-creation-cap-for-repo.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 405),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/update-pull-request-creation-cap-for-repo.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "interactions/update-pull-request-creation-cap-for-repo.response.alternative4",
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
