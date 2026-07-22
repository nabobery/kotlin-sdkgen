package com.nabobery.sdkgen.github.generated.copilot

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.CopilotOrganizationDetails
import com.nabobery.sdkgen.github.generated.CopilotSeatDetails
import com.nabobery.sdkgen.github.generated.CopilotUsageMetrics1DayReport
import com.nabobery.sdkgen.github.generated.CopilotUsageMetrics28DayReport
import com.nabobery.sdkgen.github.generated.InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83
import com.nabobery.sdkgen.github.generated.InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d
import com.nabobery.sdkgen.github.generated.InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa
import com.nabobery.sdkgen.github.generated.InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878
import com.nabobery.sdkgen.github.generated.InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8
import com.nabobery.sdkgen.github.generated.ScimError
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer

public object CopilotCodecs {
  public const val COPILOTADDCOPILOTSEATSFORTEAMS_REQUEST_CODEC_ID: String =
      "copilot/add-copilot-seats-for-teams.request"

  private val copilotAddCopilotSeatsForTeamsRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6> =
      KotlinxSerializationCodec(COPILOTADDCOPILOTSEATSFORTEAMS_REQUEST_CODEC_ID, InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6.Serializer, SdkJson)

  public const val COPILOTADDCOPILOTSEATSFORTEAMS_RESPONSE_CODEC_ID: String =
      "copilot/add-copilot-seats-for-teams.response"

  private val copilotAddCopilotSeatsForTeamsResponseCodec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c> =
      KotlinxSerializationCodec(COPILOTADDCOPILOTSEATSFORTEAMS_RESPONSE_CODEC_ID, InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c.Serializer, SdkJson)

  private val copilotAddCopilotSeatsForTeamsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c> =
      KotlinxSerializationCodec("copilot/add-copilot-seats-for-teams.response.alternative0", InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c.Serializer, SdkJson)

  public val copilotAddCopilotSeatsForTeamsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForTeamsResponseCodecAlternative0Codec)

  private val copilotAddCopilotSeatsForTeamsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/add-copilot-seats-for-teams.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotAddCopilotSeatsForTeamsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForTeamsResponseCodecAlternative1Codec)

  private val copilotAddCopilotSeatsForTeamsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/add-copilot-seats-for-teams.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotAddCopilotSeatsForTeamsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForTeamsResponseCodecAlternative2Codec)

  private val copilotAddCopilotSeatsForTeamsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/add-copilot-seats-for-teams.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotAddCopilotSeatsForTeamsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForTeamsResponseCodecAlternative3Codec)

  private val copilotAddCopilotSeatsForTeamsResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/add-copilot-seats-for-teams.response.alternative5", BasicError.Serializer, SdkJson)

  public val copilotAddCopilotSeatsForTeamsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForTeamsResponseCodecAlternative5Codec)

  public val copilotAddCopilotSeatsForTeamsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForTeamsRequestCodec)

  public val copilotAddCopilotSeatsForTeamsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForTeamsResponseCodec)

  public const val COPILOTADDCOPILOTSEATSFORUSERS_REQUEST_CODEC_ID: String =
      "copilot/add-copilot-seats-for-users.request"

  private val copilotAddCopilotSeatsForUsersRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3> =
      KotlinxSerializationCodec(COPILOTADDCOPILOTSEATSFORUSERS_REQUEST_CODEC_ID, InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3.Serializer, SdkJson)

  public const val COPILOTADDCOPILOTSEATSFORUSERS_RESPONSE_CODEC_ID: String =
      "copilot/add-copilot-seats-for-users.response"

  private val copilotAddCopilotSeatsForUsersResponseCodec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246> =
      KotlinxSerializationCodec(COPILOTADDCOPILOTSEATSFORUSERS_RESPONSE_CODEC_ID, InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246.Serializer, SdkJson)

  private val copilotAddCopilotSeatsForUsersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246> =
      KotlinxSerializationCodec("copilot/add-copilot-seats-for-users.response.alternative0", InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246.Serializer, SdkJson)

  public val copilotAddCopilotSeatsForUsersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForUsersResponseCodecAlternative0Codec)

  private val copilotAddCopilotSeatsForUsersResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/add-copilot-seats-for-users.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotAddCopilotSeatsForUsersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForUsersResponseCodecAlternative1Codec)

  private val copilotAddCopilotSeatsForUsersResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/add-copilot-seats-for-users.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotAddCopilotSeatsForUsersResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForUsersResponseCodecAlternative2Codec)

  private val copilotAddCopilotSeatsForUsersResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/add-copilot-seats-for-users.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotAddCopilotSeatsForUsersResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForUsersResponseCodecAlternative3Codec)

  private val copilotAddCopilotSeatsForUsersResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/add-copilot-seats-for-users.response.alternative5", BasicError.Serializer, SdkJson)

  public val copilotAddCopilotSeatsForUsersResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForUsersResponseCodecAlternative5Codec)

  public val copilotAddCopilotSeatsForUsersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForUsersRequestCodec)

  public val copilotAddCopilotSeatsForUsersResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246> =
      MediaTypeCodecRegistry.of(copilotAddCopilotSeatsForUsersResponseCodec)

  public const val COPILOTADDORGANIZATIONSTOENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID: String =
      "copilot/add-organizations-to-enterprise-coding-agent-policy.request"

  private val copilotAddOrganizationsToEnterpriseCodingAgentPolicyRequestCodec:
      MediaTypeCodec<InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d>
      =
      KotlinxSerializationCodec(COPILOTADDORGANIZATIONSTOENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID, InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d.Serializer, SdkJson)

  private val copilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/add-organizations-to-enterprise-coding-agent-policy.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseCodecAlternative1Codec)

  private val copilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("copilot/add-organizations-to-enterprise-coding-agent-policy.response.alternative2", ScimError.Serializer, SdkJson)

  public val copilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(copilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseCodecAlternative2Codec)

  public val copilotAddOrganizationsToEnterpriseCodingAgentPolicyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d>
      = MediaTypeCodecRegistry.of(copilotAddOrganizationsToEnterpriseCodingAgentPolicyRequestCodec)

  public val copilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val COPILOTCANCELCOPILOTSEATASSIGNMENTFORTEAMS_REQUEST_CODEC_ID: String =
      "copilot/cancel-copilot-seat-assignment-for-teams.request"

  private val copilotCancelCopilotSeatAssignmentForTeamsRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c> =
      KotlinxSerializationCodec(COPILOTCANCELCOPILOTSEATASSIGNMENTFORTEAMS_REQUEST_CODEC_ID, InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c.Serializer, SdkJson)

  public const val COPILOTCANCELCOPILOTSEATASSIGNMENTFORTEAMS_RESPONSE_CODEC_ID: String =
      "copilot/cancel-copilot-seat-assignment-for-teams.response"

  private val copilotCancelCopilotSeatAssignmentForTeamsResponseCodec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785> =
      KotlinxSerializationCodec(COPILOTCANCELCOPILOTSEATASSIGNMENTFORTEAMS_RESPONSE_CODEC_ID, InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785.Serializer, SdkJson)

  private val copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785> =
      KotlinxSerializationCodec("copilot/cancel-copilot-seat-assignment-for-teams.response.alternative0", InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785.Serializer, SdkJson)

  public val copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative0Codec)

  private val copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/cancel-copilot-seat-assignment-for-teams.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative1Codec)

  private val copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/cancel-copilot-seat-assignment-for-teams.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative2Codec)

  private val copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/cancel-copilot-seat-assignment-for-teams.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative3Codec)

  private val copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/cancel-copilot-seat-assignment-for-teams.response.alternative5", BasicError.Serializer, SdkJson)

  public val copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative5Codec)

  public val copilotCancelCopilotSeatAssignmentForTeamsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForTeamsRequestCodec)

  public val copilotCancelCopilotSeatAssignmentForTeamsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForTeamsResponseCodec)

  public const val COPILOTCANCELCOPILOTSEATASSIGNMENTFORUSERS_REQUEST_CODEC_ID: String =
      "copilot/cancel-copilot-seat-assignment-for-users.request"

  private val copilotCancelCopilotSeatAssignmentForUsersRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b> =
      KotlinxSerializationCodec(COPILOTCANCELCOPILOTSEATASSIGNMENTFORUSERS_REQUEST_CODEC_ID, InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b.Serializer, SdkJson)

  public const val COPILOTCANCELCOPILOTSEATASSIGNMENTFORUSERS_RESPONSE_CODEC_ID: String =
      "copilot/cancel-copilot-seat-assignment-for-users.response"

  private val copilotCancelCopilotSeatAssignmentForUsersResponseCodec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89> =
      KotlinxSerializationCodec(COPILOTCANCELCOPILOTSEATASSIGNMENTFORUSERS_RESPONSE_CODEC_ID, InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89.Serializer, SdkJson)

  private val copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89> =
      KotlinxSerializationCodec("copilot/cancel-copilot-seat-assignment-for-users.response.alternative0", InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89.Serializer, SdkJson)

  public val copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative0Codec)

  private val copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/cancel-copilot-seat-assignment-for-users.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative1Codec)

  private val copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/cancel-copilot-seat-assignment-for-users.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative2Codec)

  private val copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/cancel-copilot-seat-assignment-for-users.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative3Codec)

  private val copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/cancel-copilot-seat-assignment-for-users.response.alternative5", BasicError.Serializer, SdkJson)

  public val copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative5Codec)

  public val copilotCancelCopilotSeatAssignmentForUsersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForUsersRequestCodec)

  public val copilotCancelCopilotSeatAssignmentForUsersResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89> =
      MediaTypeCodecRegistry.of(copilotCancelCopilotSeatAssignmentForUsersResponseCodec)

  public const val COPILOTCOPILOTCONTENTEXCLUSIONFORORGANIZATION_RESPONSE_CODEC_ID: String =
      "copilot/copilot-content-exclusion-for-organization.response"

  private val copilotCopilotContentExclusionForOrganizationResponseCodec:
      MediaTypeCodec<Map<String, List<String>>> =
      KotlinxSerializationCodec(COPILOTCOPILOTCONTENTEXCLUSIONFORORGANIZATION_RESPONSE_CODEC_ID, MapSerializer(String.serializer(), ListSerializer(String.serializer())), SdkJson)

  private val copilotCopilotContentExclusionForOrganizationResponseCodecAlternative0Codec:
      MediaTypeCodec<Map<String, List<String>>> =
      KotlinxSerializationCodec("copilot/copilot-content-exclusion-for-organization.response.alternative0", MapSerializer(String.serializer(), ListSerializer(String.serializer())), SdkJson)

  public val copilotCopilotContentExclusionForOrganizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Map<String, List<String>>> =
      MediaTypeCodecRegistry.of(copilotCopilotContentExclusionForOrganizationResponseCodecAlternative0Codec)

  private val copilotCopilotContentExclusionForOrganizationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-content-exclusion-for-organization.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotCopilotContentExclusionForOrganizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotContentExclusionForOrganizationResponseCodecAlternative1Codec)

  private val copilotCopilotContentExclusionForOrganizationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-content-exclusion-for-organization.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCopilotContentExclusionForOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotContentExclusionForOrganizationResponseCodecAlternative2Codec)

  private val copilotCopilotContentExclusionForOrganizationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-content-exclusion-for-organization.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCopilotContentExclusionForOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotContentExclusionForOrganizationResponseCodecAlternative3Codec)

  private val copilotCopilotContentExclusionForOrganizationResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-content-exclusion-for-organization.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotCopilotContentExclusionForOrganizationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotContentExclusionForOrganizationResponseCodecAlternative4Codec)

  public val copilotCopilotContentExclusionForOrganizationRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val copilotCopilotContentExclusionForOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<Map<String, List<String>>> =
      MediaTypeCodecRegistry.of(copilotCopilotContentExclusionForOrganizationResponseCodec)

  public const val COPILOTCOPILOTENTERPRISEONEDAYUSAGEMETRICS_RESPONSE_CODEC_ID: String =
      "copilot/copilot-enterprise-one-day-usage-metrics.response"

  private val copilotCopilotEnterpriseOneDayUsageMetricsResponseCodec:
      MediaTypeCodec<CopilotUsageMetrics1DayReport> =
      KotlinxSerializationCodec(COPILOTCOPILOTENTERPRISEONEDAYUSAGEMETRICS_RESPONSE_CODEC_ID, CopilotUsageMetrics1DayReport.Serializer, SdkJson)

  private val copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotUsageMetrics1DayReport> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-one-day-usage-metrics.response.alternative0", CopilotUsageMetrics1DayReport.Serializer, SdkJson)

  public val copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotUsageMetrics1DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative0Codec)

  private val copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-one-day-usage-metrics.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative1Codec)

  private val copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-one-day-usage-metrics.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative2Codec)

  private val copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-one-day-usage-metrics.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative3Codec)

  public val copilotCopilotEnterpriseOneDayUsageMetricsRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotUsageMetrics1DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseOneDayUsageMetricsResponseCodec)

  public const val COPILOTCOPILOTENTERPRISEUSAGEMETRICS_RESPONSE_CODEC_ID: String =
      "copilot/copilot-enterprise-usage-metrics.response"

  private val copilotCopilotEnterpriseUsageMetricsResponseCodec:
      MediaTypeCodec<CopilotUsageMetrics28DayReport> =
      KotlinxSerializationCodec(COPILOTCOPILOTENTERPRISEUSAGEMETRICS_RESPONSE_CODEC_ID, CopilotUsageMetrics28DayReport.Serializer, SdkJson)

  private val copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotUsageMetrics28DayReport> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-usage-metrics.response.alternative0", CopilotUsageMetrics28DayReport.Serializer, SdkJson)

  public val copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotUsageMetrics28DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative0Codec)

  private val copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-usage-metrics.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative1Codec)

  private val copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-usage-metrics.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative2Codec)

  private val copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-usage-metrics.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative3Codec)

  public val copilotCopilotEnterpriseUsageMetricsRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val copilotCopilotEnterpriseUsageMetricsResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotUsageMetrics28DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseUsageMetricsResponseCodec)

  public const val COPILOTCOPILOTENTERPRISEUSERTEAMSONEDAYREPORT_RESPONSE_CODEC_ID: String =
      "copilot/copilot-enterprise-user-teams-one-day-report.response"

  private val copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodec:
      MediaTypeCodec<CopilotUsageMetrics1DayReport> =
      KotlinxSerializationCodec(COPILOTCOPILOTENTERPRISEUSERTEAMSONEDAYREPORT_RESPONSE_CODEC_ID, CopilotUsageMetrics1DayReport.Serializer, SdkJson)

  private val copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotUsageMetrics1DayReport> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-user-teams-one-day-report.response.alternative0", CopilotUsageMetrics1DayReport.Serializer, SdkJson)

  public val copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotUsageMetrics1DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative0Codec)

  private val copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-user-teams-one-day-report.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative1Codec)

  private val copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-user-teams-one-day-report.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative2Codec)

  private val copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-enterprise-user-teams-one-day-report.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative3Codec)

  public val copilotCopilotEnterpriseUserTeamsOneDayReportRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotUsageMetrics1DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodec)

  private val copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotUsageMetrics1DayReport> =
      KotlinxSerializationCodec("copilot/copilot-organization-one-day-usage-metrics.response.alternative0", CopilotUsageMetrics1DayReport.Serializer, SdkJson)

  public val copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotUsageMetrics1DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative0Codec)

  private val copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-one-day-usage-metrics.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative2Codec)

  private val copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-one-day-usage-metrics.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative3Codec)

  private val copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-one-day-usage-metrics.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative4Codec)

  public val copilotCopilotOrganizationOneDayUsageMetricsRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val COPILOTCOPILOTORGANIZATIONUSAGEMETRICS_RESPONSE_CODEC_ID: String =
      "copilot/copilot-organization-usage-metrics.response"

  private val copilotCopilotOrganizationUsageMetricsResponseCodec:
      MediaTypeCodec<CopilotUsageMetrics28DayReport> =
      KotlinxSerializationCodec(COPILOTCOPILOTORGANIZATIONUSAGEMETRICS_RESPONSE_CODEC_ID, CopilotUsageMetrics28DayReport.Serializer, SdkJson)

  private val copilotCopilotOrganizationUsageMetricsResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotUsageMetrics28DayReport> =
      KotlinxSerializationCodec("copilot/copilot-organization-usage-metrics.response.alternative0", CopilotUsageMetrics28DayReport.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsageMetricsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotUsageMetrics28DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsageMetricsResponseCodecAlternative0Codec)

  private val copilotCopilotOrganizationUsageMetricsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-usage-metrics.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsageMetricsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsageMetricsResponseCodecAlternative1Codec)

  private val copilotCopilotOrganizationUsageMetricsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-usage-metrics.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsageMetricsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsageMetricsResponseCodecAlternative2Codec)

  private val copilotCopilotOrganizationUsageMetricsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-usage-metrics.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsageMetricsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsageMetricsResponseCodecAlternative3Codec)

  public val copilotCopilotOrganizationUsageMetricsRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val copilotCopilotOrganizationUsageMetricsResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotUsageMetrics28DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsageMetricsResponseCodec)

  private val copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotUsageMetrics1DayReport> =
      KotlinxSerializationCodec("copilot/copilot-organization-user-teams-one-day-report.response.alternative0", CopilotUsageMetrics1DayReport.Serializer, SdkJson)

  public val copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotUsageMetrics1DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative0Codec)

  private val copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-user-teams-one-day-report.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative2Codec)

  private val copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-user-teams-one-day-report.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative3Codec)

  private val copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-user-teams-one-day-report.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative4Codec)

  public val copilotCopilotOrganizationUserTeamsOneDayReportRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotUsageMetrics1DayReport> =
      KotlinxSerializationCodec("copilot/copilot-organization-users-one-day-usage-metrics.response.alternative0", CopilotUsageMetrics1DayReport.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotUsageMetrics1DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative0Codec)

  private val copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-users-one-day-usage-metrics.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative2Codec)

  private val copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-users-one-day-usage-metrics.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative3Codec)

  private val copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-users-one-day-usage-metrics.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative4Codec)

  public val copilotCopilotOrganizationUsersOneDayUsageMetricsRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val COPILOTCOPILOTORGANIZATIONUSERSUSAGEMETRICS_RESPONSE_CODEC_ID: String =
      "copilot/copilot-organization-users-usage-metrics.response"

  private val copilotCopilotOrganizationUsersUsageMetricsResponseCodec:
      MediaTypeCodec<CopilotUsageMetrics28DayReport> =
      KotlinxSerializationCodec(COPILOTCOPILOTORGANIZATIONUSERSUSAGEMETRICS_RESPONSE_CODEC_ID, CopilotUsageMetrics28DayReport.Serializer, SdkJson)

  private val copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotUsageMetrics28DayReport> =
      KotlinxSerializationCodec("copilot/copilot-organization-users-usage-metrics.response.alternative0", CopilotUsageMetrics28DayReport.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotUsageMetrics28DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative0Codec)

  private val copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-users-usage-metrics.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative1Codec)

  private val copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-users-usage-metrics.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative2Codec)

  private val copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-organization-users-usage-metrics.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative3Codec)

  public val copilotCopilotOrganizationUsersUsageMetricsRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val copilotCopilotOrganizationUsersUsageMetricsResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotUsageMetrics28DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotOrganizationUsersUsageMetricsResponseCodec)

  public const val COPILOTCOPILOTUSERSONEDAYUSAGEMETRICS_RESPONSE_CODEC_ID: String =
      "copilot/copilot-users-one-day-usage-metrics.response"

  private val copilotCopilotUsersOneDayUsageMetricsResponseCodec:
      MediaTypeCodec<CopilotUsageMetrics1DayReport> =
      KotlinxSerializationCodec(COPILOTCOPILOTUSERSONEDAYUSAGEMETRICS_RESPONSE_CODEC_ID, CopilotUsageMetrics1DayReport.Serializer, SdkJson)

  private val copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotUsageMetrics1DayReport> =
      KotlinxSerializationCodec("copilot/copilot-users-one-day-usage-metrics.response.alternative0", CopilotUsageMetrics1DayReport.Serializer, SdkJson)

  public val copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotUsageMetrics1DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative0Codec)

  private val copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-users-one-day-usage-metrics.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative1Codec)

  private val copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-users-one-day-usage-metrics.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative2Codec)

  private val copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-users-one-day-usage-metrics.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative3Codec)

  public val copilotCopilotUsersOneDayUsageMetricsRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val copilotCopilotUsersOneDayUsageMetricsResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotUsageMetrics1DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotUsersOneDayUsageMetricsResponseCodec)

  public const val COPILOTCOPILOTUSERSUSAGEMETRICS_RESPONSE_CODEC_ID: String =
      "copilot/copilot-users-usage-metrics.response"

  private val copilotCopilotUsersUsageMetricsResponseCodec:
      MediaTypeCodec<CopilotUsageMetrics28DayReport> =
      KotlinxSerializationCodec(COPILOTCOPILOTUSERSUSAGEMETRICS_RESPONSE_CODEC_ID, CopilotUsageMetrics28DayReport.Serializer, SdkJson)

  private val copilotCopilotUsersUsageMetricsResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotUsageMetrics28DayReport> =
      KotlinxSerializationCodec("copilot/copilot-users-usage-metrics.response.alternative0", CopilotUsageMetrics28DayReport.Serializer, SdkJson)

  public val copilotCopilotUsersUsageMetricsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotUsageMetrics28DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotUsersUsageMetricsResponseCodecAlternative0Codec)

  private val copilotCopilotUsersUsageMetricsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-users-usage-metrics.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotCopilotUsersUsageMetricsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotUsersUsageMetricsResponseCodecAlternative1Codec)

  private val copilotCopilotUsersUsageMetricsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-users-usage-metrics.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotCopilotUsersUsageMetricsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotUsersUsageMetricsResponseCodecAlternative2Codec)

  private val copilotCopilotUsersUsageMetricsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/copilot-users-usage-metrics.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotCopilotUsersUsageMetricsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotCopilotUsersUsageMetricsResponseCodecAlternative3Codec)

  public val copilotCopilotUsersUsageMetricsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val copilotCopilotUsersUsageMetricsResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotUsageMetrics28DayReport> =
      MediaTypeCodecRegistry.of(copilotCopilotUsersUsageMetricsResponseCodec)

  private val copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative1Codec)

  private val copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative2Codec)

  private val copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative3Codec)

  private val copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative4Codec)

  private val copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative5", BasicError.Serializer, SdkJson)

  public val copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative5Codec)

  public val copilotDisableCopilotCodingAgentForRepositoryInOrganizationRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative1Codec)

  private val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative2Codec)

  private val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative3Codec)

  private val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative4Codec)

  private val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative5", ValidationError.Serializer, SdkJson)

  public val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative5Codec)

  private val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative6Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative6", BasicError.Serializer, SdkJson)

  public val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative6Codec)

  public val copilotEnableCopilotCodingAgentForRepositoryInOrganizationRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val COPILOTGETCOPILOTCLOUDAGENTCONFIGURATION_RESPONSE_CODEC_ID: String =
      "copilot/get-copilot-cloud-agent-configuration.response"

  private val copilotGetCopilotCloudAgentConfigurationResponseCodec:
      MediaTypeCodec<InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8> =
      KotlinxSerializationCodec(COPILOTGETCOPILOTCLOUDAGENTCONFIGURATION_RESPONSE_CODEC_ID, InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8.Serializer, SdkJson)

  private val copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8> =
      KotlinxSerializationCodec("copilot/get-copilot-cloud-agent-configuration.response.alternative0", InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8.Serializer, SdkJson)

  public val copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative0Codec)

  private val copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-cloud-agent-configuration.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative1Codec)

  private val copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-cloud-agent-configuration.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative2Codec)

  private val copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-cloud-agent-configuration.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative3Codec)

  private val copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-cloud-agent-configuration.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative4Codec)

  public val copilotGetCopilotCloudAgentConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val copilotGetCopilotCloudAgentConfigurationResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCloudAgentConfigurationResponseCodec)

  public const val COPILOTGETCOPILOTCODINGAGENTPERMISSIONSORGANIZATION_RESPONSE_CODEC_ID: String =
      "copilot/get-copilot-coding-agent-permissions-organization.response"

  private val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodec:
      MediaTypeCodec<InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951> =
      KotlinxSerializationCodec(COPILOTGETCOPILOTCODINGAGENTPERMISSIONSORGANIZATION_RESPONSE_CODEC_ID, InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951.Serializer, SdkJson)

  private val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951> =
      KotlinxSerializationCodec("copilot/get-copilot-coding-agent-permissions-organization.response.alternative0", InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951.Serializer, SdkJson)

  public val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative0Codec)

  private val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-coding-agent-permissions-organization.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative1Codec)

  private val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-coding-agent-permissions-organization.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative2Codec)

  private val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-coding-agent-permissions-organization.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative3Codec)

  private val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-coding-agent-permissions-organization.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative4Codec)

  public val copilotGetCopilotCodingAgentPermissionsOrganizationRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951> =
      MediaTypeCodecRegistry.of(copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodec)

  public const val COPILOTGETCOPILOTORGANIZATIONDETAILS_RESPONSE_CODEC_ID: String =
      "copilot/get-copilot-organization-details.response"

  private val copilotGetCopilotOrganizationDetailsResponseCodec:
      MediaTypeCodec<CopilotOrganizationDetails> =
      KotlinxSerializationCodec(COPILOTGETCOPILOTORGANIZATIONDETAILS_RESPONSE_CODEC_ID, CopilotOrganizationDetails.Serializer, SdkJson)

  private val copilotGetCopilotOrganizationDetailsResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotOrganizationDetails> =
      KotlinxSerializationCodec("copilot/get-copilot-organization-details.response.alternative0", CopilotOrganizationDetails.Serializer, SdkJson)

  public val copilotGetCopilotOrganizationDetailsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotOrganizationDetails> =
      MediaTypeCodecRegistry.of(copilotGetCopilotOrganizationDetailsResponseCodecAlternative0Codec)

  private val copilotGetCopilotOrganizationDetailsResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-organization-details.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotOrganizationDetailsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotOrganizationDetailsResponseCodecAlternative1Codec)

  private val copilotGetCopilotOrganizationDetailsResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-organization-details.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotOrganizationDetailsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotOrganizationDetailsResponseCodecAlternative2Codec)

  private val copilotGetCopilotOrganizationDetailsResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-organization-details.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotOrganizationDetailsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotOrganizationDetailsResponseCodecAlternative3Codec)

  private val copilotGetCopilotOrganizationDetailsResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-organization-details.response.alternative5", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotOrganizationDetailsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotOrganizationDetailsResponseCodecAlternative5Codec)

  public val copilotGetCopilotOrganizationDetailsRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  public val copilotGetCopilotOrganizationDetailsResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotOrganizationDetails> =
      MediaTypeCodecRegistry.of(copilotGetCopilotOrganizationDetailsResponseCodec)

  public const val COPILOTGETCOPILOTSEATDETAILSFORUSER_RESPONSE_CODEC_ID: String =
      "copilot/get-copilot-seat-details-for-user.response"

  private val copilotGetCopilotSeatDetailsForUserResponseCodec: MediaTypeCodec<CopilotSeatDetails> =
      KotlinxSerializationCodec(COPILOTGETCOPILOTSEATDETAILSFORUSER_RESPONSE_CODEC_ID, CopilotSeatDetails.Serializer, SdkJson)

  private val copilotGetCopilotSeatDetailsForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotSeatDetails> =
      KotlinxSerializationCodec("copilot/get-copilot-seat-details-for-user.response.alternative0", CopilotSeatDetails.Serializer, SdkJson)

  public val copilotGetCopilotSeatDetailsForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSeatDetails> =
      MediaTypeCodecRegistry.of(copilotGetCopilotSeatDetailsForUserResponseCodecAlternative0Codec)

  private val copilotGetCopilotSeatDetailsForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-seat-details-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotSeatDetailsForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotSeatDetailsForUserResponseCodecAlternative1Codec)

  private val copilotGetCopilotSeatDetailsForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-seat-details-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotSeatDetailsForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotSeatDetailsForUserResponseCodecAlternative2Codec)

  private val copilotGetCopilotSeatDetailsForUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-seat-details-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotSeatDetailsForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotSeatDetailsForUserResponseCodecAlternative3Codec)

  private val copilotGetCopilotSeatDetailsForUserResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/get-copilot-seat-details-for-user.response.alternative5", BasicError.Serializer, SdkJson)

  public val copilotGetCopilotSeatDetailsForUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotGetCopilotSeatDetailsForUserResponseCodecAlternative5Codec)

  public val copilotGetCopilotSeatDetailsForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val copilotGetCopilotSeatDetailsForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotSeatDetails> =
      MediaTypeCodecRegistry.of(copilotGetCopilotSeatDetailsForUserResponseCodec)

  public const val COPILOTLISTCOPILOTCODINGAGENTSELECTEDREPOSITORIESFORORGANIZATION_RESPONSE_CODEC_ID:
      String = "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response"

  private val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodec:
      MediaTypeCodec<InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef>
      =
      KotlinxSerializationCodec(COPILOTLISTCOPILOTCODINGAGENTSELECTEDREPOSITORIESFORORGANIZATION_RESPONSE_CODEC_ID, InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef.Serializer, SdkJson)

  private val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef>
      =
      KotlinxSerializationCodec("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative0", InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef.Serializer, SdkJson)

  public val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef>
      =
      MediaTypeCodecRegistry.of(copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative0Codec)

  private val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative1Codec)

  private val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative2Codec)

  private val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative3Codec)

  private val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative4Codec)

  private val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative5", BasicError.Serializer, SdkJson)

  public val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative5Codec)

  public val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef>
      =
      MediaTypeCodecRegistry.of(copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodec)

  public const val COPILOTLISTCOPILOTSEATS_RESPONSE_CODEC_ID: String =
      "copilot/list-copilot-seats.response"

  private val copilotListCopilotSeatsResponseCodec:
      MediaTypeCodec<InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a> =
      KotlinxSerializationCodec(COPILOTLISTCOPILOTSEATS_RESPONSE_CODEC_ID, InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a.Serializer, SdkJson)

  private val copilotListCopilotSeatsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a> =
      KotlinxSerializationCodec("copilot/list-copilot-seats.response.alternative0", InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a.Serializer, SdkJson)

  public val copilotListCopilotSeatsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a> =
      MediaTypeCodecRegistry.of(copilotListCopilotSeatsResponseCodecAlternative0Codec)

  private val copilotListCopilotSeatsResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/list-copilot-seats.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotListCopilotSeatsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotListCopilotSeatsResponseCodecAlternative1Codec)

  private val copilotListCopilotSeatsResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/list-copilot-seats.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotListCopilotSeatsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotListCopilotSeatsResponseCodecAlternative2Codec)

  private val copilotListCopilotSeatsResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/list-copilot-seats.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotListCopilotSeatsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotListCopilotSeatsResponseCodecAlternative3Codec)

  private val copilotListCopilotSeatsResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/list-copilot-seats.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotListCopilotSeatsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotListCopilotSeatsResponseCodecAlternative4Codec)

  public val copilotListCopilotSeatsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val copilotListCopilotSeatsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a> =
      MediaTypeCodecRegistry.of(copilotListCopilotSeatsResponseCodec)

  public const val COPILOTREMOVEORGANIZATIONSFROMENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID:
      String = "copilot/remove-organizations-from-enterprise-coding-agent-policy.request"

  private val copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyRequestCodec:
      MediaTypeCodec<InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83> =
      KotlinxSerializationCodec(COPILOTREMOVEORGANIZATIONSFROMENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID, InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83.Serializer, SdkJson)

  private val copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/remove-organizations-from-enterprise-coding-agent-policy.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseCodecAlternative1Codec)

  private val copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("copilot/remove-organizations-from-enterprise-coding-agent-policy.response.alternative2", ScimError.Serializer, SdkJson)

  public val copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseCodecAlternative2Codec)

  public val copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83> =
      MediaTypeCodecRegistry.of(copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyRequestCodec)

  public val copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val COPILOTSETCOPILOTCODINGAGENTPERMISSIONSORGANIZATION_REQUEST_CODEC_ID: String =
      "copilot/set-copilot-coding-agent-permissions-organization.request"

  private val copilotSetCopilotCodingAgentPermissionsOrganizationRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88> =
      KotlinxSerializationCodec(COPILOTSETCOPILOTCODINGAGENTPERMISSIONSORGANIZATION_REQUEST_CODEC_ID, InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88.Serializer, SdkJson)

  private val copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-coding-agent-permissions-organization.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative1Codec)

  private val copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-coding-agent-permissions-organization.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative2Codec)

  private val copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-coding-agent-permissions-organization.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative3Codec)

  private val copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot/set-copilot-coding-agent-permissions-organization.response.alternative4", ValidationError.Serializer, SdkJson)

  public val copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative4Codec)

  private val copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-coding-agent-permissions-organization.response.alternative5", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative5Codec)

  public val copilotSetCopilotCodingAgentPermissionsOrganizationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentPermissionsOrganizationRequestCodec)

  public val copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val COPILOTSETCOPILOTCODINGAGENTSELECTEDREPOSITORIESFORORGANIZATION_REQUEST_CODEC_ID:
      String = "copilot/set-copilot-coding-agent-selected-repositories-for-organization.request"

  private val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177> =
      KotlinxSerializationCodec(COPILOTSETCOPILOTCODINGAGENTSELECTEDREPOSITORIESFORORGANIZATION_REQUEST_CODEC_ID, InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177.Serializer, SdkJson)

  private val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative1Codec)

  private val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative2Codec)

  private val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative3Codec)

  private val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative4Codec)

  private val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative5", ValidationError.Serializer, SdkJson)

  public val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative5Codec)

  private val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative6Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative6", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative6Codec)

  public val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177>
      =
      MediaTypeCodecRegistry.of(copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequestCodec)

  public val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  public const val COPILOTSETCOPILOTCONTENTEXCLUSIONFORORGANIZATION_REQUEST_CODEC_ID: String =
      "copilot/set-copilot-content-exclusion-for-organization.request"

  private val copilotSetCopilotContentExclusionForOrganizationRequestCodec:
      MediaTypeCodec<Map<String, List<InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa>>>
      =
      KotlinxSerializationCodec(COPILOTSETCOPILOTCONTENTEXCLUSIONFORORGANIZATION_REQUEST_CODEC_ID, MapSerializer(String.serializer(), ListSerializer(InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa.Serializer)), SdkJson)

  public const val COPILOTSETCOPILOTCONTENTEXCLUSIONFORORGANIZATION_RESPONSE_CODEC_ID: String =
      "copilot/set-copilot-content-exclusion-for-organization.response"

  private val copilotSetCopilotContentExclusionForOrganizationResponseCodec:
      MediaTypeCodec<InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878> =
      KotlinxSerializationCodec(COPILOTSETCOPILOTCONTENTEXCLUSIONFORORGANIZATION_RESPONSE_CODEC_ID, InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878.Serializer, SdkJson)

  private val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878> =
      KotlinxSerializationCodec("copilot/set-copilot-content-exclusion-for-organization.response.alternative0", InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878.Serializer, SdkJson)

  public val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878> =
      MediaTypeCodecRegistry.of(copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative0Codec)

  private val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-content-exclusion-for-organization.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative1Codec)

  private val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-content-exclusion-for-organization.response.alternative2", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative2Codec)

  private val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-content-exclusion-for-organization.response.alternative3", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative3Codec)

  private val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-content-exclusion-for-organization.response.alternative4", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative4Codec)

  private val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationErrorSimple> =
      KotlinxSerializationCodec("copilot/set-copilot-content-exclusion-for-organization.response.alternative5", ValidationErrorSimple.Serializer, SdkJson)

  public val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationErrorSimple> =
      MediaTypeCodecRegistry.of(copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative5Codec)

  private val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative6Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-copilot-content-exclusion-for-organization.response.alternative6", BasicError.Serializer, SdkJson)

  public val copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative6Codec)

  public val copilotSetCopilotContentExclusionForOrganizationRequestCodecRegistry:
      MediaTypeCodecRegistry<Map<String, List<InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa>>>
      = MediaTypeCodecRegistry.of(copilotSetCopilotContentExclusionForOrganizationRequestCodec)

  public val copilotSetCopilotContentExclusionForOrganizationResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878> =
      MediaTypeCodecRegistry.of(copilotSetCopilotContentExclusionForOrganizationResponseCodec)

  public const val COPILOTSETENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID: String =
      "copilot/set-enterprise-coding-agent-policy.request"

  private val copilotSetEnterpriseCodingAgentPolicyRequestCodec:
      MediaTypeCodec<InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71> =
      KotlinxSerializationCodec(COPILOTSETENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID, InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71.Serializer, SdkJson)

  private val copilotSetEnterpriseCodingAgentPolicyResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot/set-enterprise-coding-agent-policy.response.alternative1", BasicError.Serializer, SdkJson)

  public val copilotSetEnterpriseCodingAgentPolicyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSetEnterpriseCodingAgentPolicyResponseCodecAlternative1Codec)

  private val copilotSetEnterpriseCodingAgentPolicyResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("copilot/set-enterprise-coding-agent-policy.response.alternative2", ScimError.Serializer, SdkJson)

  public val copilotSetEnterpriseCodingAgentPolicyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(copilotSetEnterpriseCodingAgentPolicyResponseCodecAlternative2Codec)

  public val copilotSetEnterpriseCodingAgentPolicyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71> =
      MediaTypeCodecRegistry.of(copilotSetEnterpriseCodingAgentPolicyRequestCodec)

  public val copilotSetEnterpriseCodingAgentPolicyResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()
}

/**
 * Client for the 'copilot' group of GitHub v3 REST API.
 */
public class CopilotClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@CopilotClient.authentication)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Purchases a GitHub Copilot seat for all users within each specified team.
   * The organization will be billed for each seat based on the organization's Copilot plan. For more information about
   * Copilot pricing, see "[About billing for GitHub Copilot in your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-the-copilot-subscription-for-your-organization/about-billing-for-github-copilot-in-your-organization)."
   *
   * Only organization owners can purchase Copilot seats for their organization members. The organization must have a
   * Copilot Business or Copilot Enterprise subscription and a configured suggestion matching policy.
   * For more information about setting up a Copilot subscription, see "[Subscribing to Copilot for your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-the-copilot-subscription-for-your-organization/subscribing-to-copilot-for-your-organization)."
   * For more information about setting a suggestion matching policy, see "[Managing policies for Copilot in your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/setting
   * -policies-for-copilot-in-your-organization/managing-policies-for-copilot-in-your-organization#policies-for-suggesti
   * on-matching)."
   *
   * The response contains the total number of new seats that were created and existing seats that were refreshed.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `admin:org`
   * scopes to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotAddCopilotSeatsForTeamsApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotAddCopilotSeatsForTeamsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotAddCopilotSeatsForTeams(
    request: InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6,
    org: String,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c = executor.executeWithTypedErrors<InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6, CopilotAddCopilotSeatsForTeamsResponse, InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c>(
    request = SdkExecutionRequest(copilotAddCopilotSeatsForTeamsMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTADDCOPILOTSEATSFORTEAMS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotAddCopilotSeatsForTeamsRequestCodecRegistry,
    responseDecoder = CopilotAddCopilotSeatsForTeamsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotAddCopilotSeatsForTeamsResponse.SuccessJson -> response.json
        is CopilotAddCopilotSeatsForTeamsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddCopilotSeatsForTeamsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddCopilotSeatsForTeamsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddCopilotSeatsForTeamsResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddCopilotSeatsForTeamsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddCopilotSeatsForTeamsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotAddCopilotSeatsForTeamsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotAddCopilotSeatsForTeamsResponse.Http401Json -> CopilotAddCopilotSeatsForTeamsApiException(response, statusCode, headers)
        is CopilotAddCopilotSeatsForTeamsResponse.Http403Json -> CopilotAddCopilotSeatsForTeamsApiException(response, statusCode, headers)
        is CopilotAddCopilotSeatsForTeamsResponse.Http404Json -> CopilotAddCopilotSeatsForTeamsApiException(response, statusCode, headers)
        is CopilotAddCopilotSeatsForTeamsResponse.Http422NoContent -> CopilotAddCopilotSeatsForTeamsApiException(response, statusCode, headers)
        is CopilotAddCopilotSeatsForTeamsResponse.Http500Json -> CopilotAddCopilotSeatsForTeamsApiException(response, statusCode, headers)
        is CopilotAddCopilotSeatsForTeamsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Purchases a GitHub Copilot seat for all users within each specified team.
   * The organization will be billed for each seat based on the organization's Copilot plan. For more information about
   * Copilot pricing, see "[About billing for GitHub Copilot in your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-the-copilot-subscription-for-your-organization/about-billing-for-github-copilot-in-your-organization)."
   *
   * Only organization owners can purchase Copilot seats for their organization members. The organization must have a
   * Copilot Business or Copilot Enterprise subscription and a configured suggestion matching policy.
   * For more information about setting up a Copilot subscription, see "[Subscribing to Copilot for your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-the-copilot-subscription-for-your-organization/subscribing-to-copilot-for-your-organization)."
   * For more information about setting a suggestion matching policy, see "[Managing policies for Copilot in your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/setting
   * -policies-for-copilot-in-your-organization/managing-policies-for-copilot-in-your-organization#policies-for-suggesti
   * on-matching)."
   *
   * The response contains the total number of new seats that were created and existing seats that were refreshed.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `admin:org`
   * scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotAddCopilotSeatsForTeamsWithResponse(
    request: InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotAddCopilotSeatsForTeamsResponse> = executor.executeWithResponse<InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6, CopilotAddCopilotSeatsForTeamsResponse>(SdkExecutionRequest(copilotAddCopilotSeatsForTeamsMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTADDCOPILOTSEATSFORTEAMS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotAddCopilotSeatsForTeamsRequestCodecRegistry, CopilotAddCopilotSeatsForTeamsResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Purchases a GitHub Copilot seat for each user specified.
   * The organization will be billed for each seat based on the organization's Copilot plan. For more information about
   * Copilot pricing, see "[About billing for GitHub Copilot in your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-the-copilot-subscription-for-your-organization/about-billing-for-github-copilot-in-your-organization)."
   *
   * Only organization owners can purchase Copilot seats for their organization members. The organization must have a
   * Copilot Business or Copilot Enterprise subscription and a configured suggestion matching policy.
   * For more information about setting up a Copilot subscription, see "[Subscribing to Copilot for your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-the-copilot-subscription-for-your-organization/subscribing-to-copilot-for-your-organization)."
   * For more information about setting a suggestion matching policy, see "[Managing policies for Copilot in your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/setting
   * -policies-for-copilot-in-your-organization/managing-policies-for-copilot-in-your-organization#policies-for-suggesti
   * on-matching)."
   *
   * The response contains the total number of new seats that were created and existing seats that were refreshed.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `admin:org`
   * scopes to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotAddCopilotSeatsForUsersApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotAddCopilotSeatsForUsersError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotAddCopilotSeatsForUsers(
    request: InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3,
    org: String,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246 = executor.executeWithTypedErrors<InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3, CopilotAddCopilotSeatsForUsersResponse, InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246>(
    request = SdkExecutionRequest(copilotAddCopilotSeatsForUsersMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTADDCOPILOTSEATSFORUSERS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotAddCopilotSeatsForUsersRequestCodecRegistry,
    responseDecoder = CopilotAddCopilotSeatsForUsersResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotAddCopilotSeatsForUsersResponse.SuccessJson -> response.json
        is CopilotAddCopilotSeatsForUsersResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddCopilotSeatsForUsersResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddCopilotSeatsForUsersResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddCopilotSeatsForUsersResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddCopilotSeatsForUsersResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddCopilotSeatsForUsersResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotAddCopilotSeatsForUsersResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotAddCopilotSeatsForUsersResponse.Http401Json -> CopilotAddCopilotSeatsForUsersApiException(response, statusCode, headers)
        is CopilotAddCopilotSeatsForUsersResponse.Http403Json -> CopilotAddCopilotSeatsForUsersApiException(response, statusCode, headers)
        is CopilotAddCopilotSeatsForUsersResponse.Http404Json -> CopilotAddCopilotSeatsForUsersApiException(response, statusCode, headers)
        is CopilotAddCopilotSeatsForUsersResponse.Http422NoContent -> CopilotAddCopilotSeatsForUsersApiException(response, statusCode, headers)
        is CopilotAddCopilotSeatsForUsersResponse.Http500Json -> CopilotAddCopilotSeatsForUsersApiException(response, statusCode, headers)
        is CopilotAddCopilotSeatsForUsersResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Purchases a GitHub Copilot seat for each user specified.
   * The organization will be billed for each seat based on the organization's Copilot plan. For more information about
   * Copilot pricing, see "[About billing for GitHub Copilot in your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-the-copilot-subscription-for-your-organization/about-billing-for-github-copilot-in-your-organization)."
   *
   * Only organization owners can purchase Copilot seats for their organization members. The organization must have a
   * Copilot Business or Copilot Enterprise subscription and a configured suggestion matching policy.
   * For more information about setting up a Copilot subscription, see "[Subscribing to Copilot for your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-the-copilot-subscription-for-your-organization/subscribing-to-copilot-for-your-organization)."
   * For more information about setting a suggestion matching policy, see "[Managing policies for Copilot in your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/setting
   * -policies-for-copilot-in-your-organization/managing-policies-for-copilot-in-your-organization#policies-for-suggesti
   * on-matching)."
   *
   * The response contains the total number of new seats that were created and existing seats that were refreshed.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `admin:org`
   * scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotAddCopilotSeatsForUsersWithResponse(
    request: InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotAddCopilotSeatsForUsersResponse> = executor.executeWithResponse<InlineOrgsCopilotBillingSelectedUsersPostRequestJsonX295ab4c3, CopilotAddCopilotSeatsForUsersResponse>(SdkExecutionRequest(copilotAddCopilotSeatsForUsersMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTADDCOPILOTSEATSFORUSERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotAddCopilotSeatsForUsersRequestCodecRegistry, CopilotAddCopilotSeatsForUsersResponseDecoder, options)

  /**
   * Enables Copilot cloud agent for the specified organizations within the enterprise.
   *
   * The enterprise's coding agent policy must be set to `enabled_for_selected_orgs` before
   * using this endpoint. Organizations can be specified by login or matched via custom properties.
   *
   * Only organizations that have Copilot enabled and belong to the enterprise will be affected.
   *
   * Only enterprise owners can add organizations to the coding agent policy.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or
   * `admin:enterprise` scopes to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotAddOrganizationsToEnterpriseCodingAgentPolicyApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CopilotAddOrganizationsToEnterpriseCodingAgentPolicyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotAddOrganizationsToEnterpriseCodingAgentPolicy(
    request: InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d, CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse, Unit>(
    request = SdkExecutionRequest(copilotAddOrganizationsToEnterpriseCodingAgentPolicyMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTADDORGANIZATIONSTOENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotAddOrganizationsToEnterpriseCodingAgentPolicyRequestCodecRegistry,
    responseDecoder = CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.SuccessNoContent -> response.unit
        is CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.Http400Json -> CopilotAddOrganizationsToEnterpriseCodingAgentPolicyApiException(response, statusCode, headers)
        is CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.Http400ScimJson -> CopilotAddOrganizationsToEnterpriseCodingAgentPolicyApiException(response, statusCode, headers)
        is CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Enables Copilot cloud agent for the specified organizations within the enterprise.
   *
   * The enterprise's coding agent policy must be set to `enabled_for_selected_orgs` before
   * using this endpoint. Organizations can be specified by login or matched via custom properties.
   *
   * Only organizations that have Copilot enabled and belong to the enterprise will be affected.
   *
   * Only enterprise owners can add organizations to the coding agent policy.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or
   * `admin:enterprise` scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotAddOrganizationsToEnterpriseCodingAgentPolicyWithResponse(
    request: InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse> = executor.executeWithResponse<InlineEnterprisesCopilotPoliciesCodingAgentOrganizationsPostRequestJsonX47ee664d, CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse>(SdkExecutionRequest(copilotAddOrganizationsToEnterpriseCodingAgentPolicyMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTADDORGANIZATIONSTOENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CopilotCodecs.copilotAddOrganizationsToEnterpriseCodingAgentPolicyRequestCodecRegistry, CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Sets seats for all members of each team specified to "pending cancellation".
   * This will cause the members of the specified team(s) to lose access to GitHub Copilot at the end of the current
   * billing cycle unless they retain access through another team.
   * For more information about disabling access to Copilot, see "[Revoking access to Copilot for members of your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-access-to-github-copilot-in-your-organization/revoking-access-to-copilot-for-members-of-your-organization)."
   *
   * Only organization owners can cancel Copilot seats for their organization members.
   *
   * The response contains the total number of seats set to "pending cancellation".
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `admin:org`
   * scopes to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotCancelCopilotSeatAssignmentForTeamsApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CopilotCancelCopilotSeatAssignmentForTeamsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotCancelCopilotSeatAssignmentForTeams(
    request: InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c,
    org: String,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785 = executor.executeWithTypedErrors<InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c, CopilotCancelCopilotSeatAssignmentForTeamsResponse, InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785>(
    request = SdkExecutionRequest(copilotCancelCopilotSeatAssignmentForTeamsMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTCANCELCOPILOTSEATASSIGNMENTFORTEAMS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotCancelCopilotSeatAssignmentForTeamsRequestCodecRegistry,
    responseDecoder = CopilotCancelCopilotSeatAssignmentForTeamsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.SuccessJson -> response.json
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http401Json -> CopilotCancelCopilotSeatAssignmentForTeamsApiException(response, statusCode, headers)
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http403Json -> CopilotCancelCopilotSeatAssignmentForTeamsApiException(response, statusCode, headers)
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http404Json -> CopilotCancelCopilotSeatAssignmentForTeamsApiException(response, statusCode, headers)
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http422NoContent -> CopilotCancelCopilotSeatAssignmentForTeamsApiException(response, statusCode, headers)
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http500Json -> CopilotCancelCopilotSeatAssignmentForTeamsApiException(response, statusCode, headers)
        is CopilotCancelCopilotSeatAssignmentForTeamsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Sets seats for all members of each team specified to "pending cancellation".
   * This will cause the members of the specified team(s) to lose access to GitHub Copilot at the end of the current
   * billing cycle unless they retain access through another team.
   * For more information about disabling access to Copilot, see "[Revoking access to Copilot for members of your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-access-to-github-copilot-in-your-organization/revoking-access-to-copilot-for-members-of-your-organization)."
   *
   * Only organization owners can cancel Copilot seats for their organization members.
   *
   * The response contains the total number of seats set to "pending cancellation".
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `admin:org`
   * scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCancelCopilotSeatAssignmentForTeamsWithResponse(
    request: InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotCancelCopilotSeatAssignmentForTeamsResponse> = executor.executeWithResponse<InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c, CopilotCancelCopilotSeatAssignmentForTeamsResponse>(SdkExecutionRequest(copilotCancelCopilotSeatAssignmentForTeamsMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTCANCELCOPILOTSEATASSIGNMENTFORTEAMS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotCancelCopilotSeatAssignmentForTeamsRequestCodecRegistry, CopilotCancelCopilotSeatAssignmentForTeamsResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Sets seats for all users specified to "pending cancellation".
   * This will cause the specified users to lose access to GitHub Copilot at the end of the current billing cycle unless
   * they retain access through team membership.
   * For more information about disabling access to Copilot, see "[Revoking access to Copilot for members of your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-access-to-github-copilot-in-your-organization/revoking-access-to-copilot-for-members-of-your-organization)."
   *
   * Only organization owners can cancel Copilot seats for their organization members.
   *
   * The response contains the total number of seats set to "pending cancellation".
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `admin:org`
   * scopes to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotCancelCopilotSeatAssignmentForUsersApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CopilotCancelCopilotSeatAssignmentForUsersError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotCancelCopilotSeatAssignmentForUsers(
    request: InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b,
    org: String,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89 = executor.executeWithTypedErrors<InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b, CopilotCancelCopilotSeatAssignmentForUsersResponse, InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89>(
    request = SdkExecutionRequest(copilotCancelCopilotSeatAssignmentForUsersMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTCANCELCOPILOTSEATASSIGNMENTFORUSERS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotCancelCopilotSeatAssignmentForUsersRequestCodecRegistry,
    responseDecoder = CopilotCancelCopilotSeatAssignmentForUsersResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.SuccessJson -> response.json
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Http401Json -> CopilotCancelCopilotSeatAssignmentForUsersApiException(response, statusCode, headers)
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Http403Json -> CopilotCancelCopilotSeatAssignmentForUsersApiException(response, statusCode, headers)
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Http404Json -> CopilotCancelCopilotSeatAssignmentForUsersApiException(response, statusCode, headers)
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Http422NoContent -> CopilotCancelCopilotSeatAssignmentForUsersApiException(response, statusCode, headers)
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Http500Json -> CopilotCancelCopilotSeatAssignmentForUsersApiException(response, statusCode, headers)
        is CopilotCancelCopilotSeatAssignmentForUsersResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Sets seats for all users specified to "pending cancellation".
   * This will cause the specified users to lose access to GitHub Copilot at the end of the current billing cycle unless
   * they retain access through team membership.
   * For more information about disabling access to Copilot, see "[Revoking access to Copilot for members of your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-github-copilot-in-your-organization/managin
   * g-access-to-github-copilot-in-your-organization/revoking-access-to-copilot-for-members-of-your-organization)."
   *
   * Only organization owners can cancel Copilot seats for their organization members.
   *
   * The response contains the total number of seats set to "pending cancellation".
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `admin:org`
   * scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCancelCopilotSeatAssignmentForUsersWithResponse(
    request: InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotCancelCopilotSeatAssignmentForUsersResponse> = executor.executeWithResponse<InlineOrgsCopilotBillingSelectedUsersDeleteRequestJsonX42317f8b, CopilotCancelCopilotSeatAssignmentForUsersResponse>(SdkExecutionRequest(copilotCancelCopilotSeatAssignmentForUsersMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTCANCELCOPILOTSEATASSIGNMENTFORUSERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotCancelCopilotSeatAssignmentForUsersRequestCodecRegistry, CopilotCancelCopilotSeatAssignmentForUsersResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets information about an organization's Copilot content exclusion path rules.
   * To configure these settings, go to the organization's settings on GitHub.
   * For more information, see "[Excluding content from GitHub
   * Copilot](https://docs.github.com/copilot/managing-copilot/configuring-and-auditing-content-exclusion/excluding-cont
   * ent-from-github-copilot#configuring-content-exclusions-for-your-organization)."
   *
   * Organization owners can view details about Copilot content exclusion rules for the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `copilot` or `read:org` scopes to use this
   * endpoint.
   *
   * > [!CAUTION]
   * > * At this time, the API does not support comments. This endpoint will not return any comments in the existing
   * rules.
   * > * At this time, the API does not support duplicate keys. If your content exclusion configuration contains
   * duplicate keys, the API will return only the last occurrence of that key. For example, if duplicate entries are
   * present, only the final value will be included in the response.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotCopilotContentExclusionForOrganizationApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CopilotCopilotContentExclusionForOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotCopilotContentExclusionForOrganization(org: String, options: CallOptions = CallOptions()): Map<String, List<String>> = executor.executeWithTypedErrors<Unit, CopilotCopilotContentExclusionForOrganizationResponse, Map<String, List<String>>>(
    request = SdkExecutionRequest(copilotCopilotContentExclusionForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotCopilotContentExclusionForOrganizationRequestCodecRegistry,
    responseDecoder = CopilotCopilotContentExclusionForOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotCopilotContentExclusionForOrganizationResponse.SuccessJson -> response.json
        is CopilotCopilotContentExclusionForOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotContentExclusionForOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotContentExclusionForOrganizationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotContentExclusionForOrganizationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotContentExclusionForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotCopilotContentExclusionForOrganizationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotCopilotContentExclusionForOrganizationResponse.Http401Json -> CopilotCopilotContentExclusionForOrganizationApiException(response, statusCode, headers)
        is CopilotCopilotContentExclusionForOrganizationResponse.Http403Json -> CopilotCopilotContentExclusionForOrganizationApiException(response, statusCode, headers)
        is CopilotCopilotContentExclusionForOrganizationResponse.Http404Json -> CopilotCopilotContentExclusionForOrganizationApiException(response, statusCode, headers)
        is CopilotCopilotContentExclusionForOrganizationResponse.Http500Json -> CopilotCopilotContentExclusionForOrganizationApiException(response, statusCode, headers)
        is CopilotCopilotContentExclusionForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets information about an organization's Copilot content exclusion path rules.
   * To configure these settings, go to the organization's settings on GitHub.
   * For more information, see "[Excluding content from GitHub
   * Copilot](https://docs.github.com/copilot/managing-copilot/configuring-and-auditing-content-exclusion/excluding-cont
   * ent-from-github-copilot#configuring-content-exclusions-for-your-organization)."
   *
   * Organization owners can view details about Copilot content exclusion rules for the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `copilot` or `read:org` scopes to use this
   * endpoint.
   *
   * > [!CAUTION]
   * > * At this time, the API does not support comments. This endpoint will not return any comments in the existing
   * rules.
   * > * At this time, the API does not support duplicate keys. If your content exclusion configuration contains
   * duplicate keys, the API will return only the last occurrence of that key. For example, if duplicate entries are
   * present, only the final value will be included in the response.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCopilotContentExclusionForOrganizationWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<CopilotCopilotContentExclusionForOrganizationResponse> = executor.executeWithResponse<Unit, CopilotCopilotContentExclusionForOrganizationResponse>(SdkExecutionRequest(copilotCopilotContentExclusionForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotCopilotContentExclusionForOrganizationRequestCodecRegistry, CopilotCopilotContentExclusionForOrganizationResponseDecoder, options)

  /**
   * Use this endpoint to retrieve download links for the Copilot enterprise usage metrics report for a specific day.
   * The report provides comprehensive usage data for Copilot features across the enterprise.
   *
   * The report contains aggregated metrics for the specified day, including usage statistics for various Copilot
   * features, user engagement data, and feature adoption metrics. Reports are generated daily and made available for
   * download through signed URLs with a limited expiration time.
   *
   * The response includes download links to the report files, along with the specific date of the report. The report
   * covers a complete day for which data has been processed. Reports are available starting from October 10, 2025, and
   * historical data can be accessed for up to 1 year from the current date.
   *
   * Enterprise owners, billing managers, and authorized users with fine-grained "View Enterprise Copilot Metrics"
   * permission can retrieve Copilot metrics reports for the enterprise. OAuth app tokens and personal access tokens
   * (classic) need either the `manage_billing:copilot` or `read:enterprise` scopes to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotCopilotEnterpriseOneDayUsageMetricsApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CopilotCopilotEnterpriseOneDayUsageMetricsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotCopilotEnterpriseOneDayUsageMetrics(
    enterprise: String,
    day: String,
    options: CallOptions = CallOptions(),
  ): CopilotUsageMetrics1DayReport = executor.executeWithTypedErrors<Unit, CopilotCopilotEnterpriseOneDayUsageMetricsResponse, CopilotUsageMetrics1DayReport>(
    request = SdkExecutionRequest(copilotCopilotEnterpriseOneDayUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = listOf(day.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotCopilotEnterpriseOneDayUsageMetricsRequestCodecRegistry,
    responseDecoder = CopilotCopilotEnterpriseOneDayUsageMetricsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotCopilotEnterpriseOneDayUsageMetricsResponse.SuccessJson -> response.json
        is CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotCopilotEnterpriseOneDayUsageMetricsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Http403Json -> CopilotCopilotEnterpriseOneDayUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Http404Json -> CopilotCopilotEnterpriseOneDayUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Http500Json -> CopilotCopilotEnterpriseOneDayUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Use this endpoint to retrieve download links for the Copilot enterprise usage metrics report for a specific day.
   * The report provides comprehensive usage data for Copilot features across the enterprise.
   *
   * The report contains aggregated metrics for the specified day, including usage statistics for various Copilot
   * features, user engagement data, and feature adoption metrics. Reports are generated daily and made available for
   * download through signed URLs with a limited expiration time.
   *
   * The response includes download links to the report files, along with the specific date of the report. The report
   * covers a complete day for which data has been processed. Reports are available starting from October 10, 2025, and
   * historical data can be accessed for up to 1 year from the current date.
   *
   * Enterprise owners, billing managers, and authorized users with fine-grained "View Enterprise Copilot Metrics"
   * permission can retrieve Copilot metrics reports for the enterprise. OAuth app tokens and personal access tokens
   * (classic) need either the `manage_billing:copilot` or `read:enterprise` scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCopilotEnterpriseOneDayUsageMetricsWithResponse(
    enterprise: String,
    day: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotCopilotEnterpriseOneDayUsageMetricsResponse> = executor.executeWithResponse<Unit, CopilotCopilotEnterpriseOneDayUsageMetricsResponse>(SdkExecutionRequest(copilotCopilotEnterpriseOneDayUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = listOf(day.toString())))
  }), CopilotCodecs.copilotCopilotEnterpriseOneDayUsageMetricsRequestCodecRegistry, CopilotCopilotEnterpriseOneDayUsageMetricsResponseDecoder, options)

  /**
   * Use this endpoint to retrieve download links for the latest 28-day enterprise Copilot usage metrics report. The
   * report provides comprehensive usage data for Copilot features across the enterprise.
   *
   * The report contains aggregated metrics for the previous 28 days, including usage statistics for various Copilot
   * features, user engagement data, and feature adoption metrics. Reports are generated daily and made available for
   * download through signed URLs with a limited expiration time.
   *
   * The response includes download links to the report files, along with the specific date range covered by the report.
   * The report covers a complete 28-day period ending on the most recent day for which data has been processed.
   *
   * Enterprise owners, billing managers, and authorized users with fine-grained "View Enterprise Copilot Metrics"
   * permission can retrieve Copilot metrics reports for the enterprise. OAuth app tokens and personal access tokens
   * (classic) need either the `manage_billing:copilot` or `read:enterprise` scopes to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotCopilotEnterpriseUsageMetricsApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotCopilotEnterpriseUsageMetricsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotCopilotEnterpriseUsageMetrics(enterprise: String, options: CallOptions = CallOptions()): CopilotUsageMetrics28DayReport = executor.executeWithTypedErrors<Unit, CopilotCopilotEnterpriseUsageMetricsResponse, CopilotUsageMetrics28DayReport>(
    request = SdkExecutionRequest(copilotCopilotEnterpriseUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotCopilotEnterpriseUsageMetricsRequestCodecRegistry,
    responseDecoder = CopilotCopilotEnterpriseUsageMetricsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotCopilotEnterpriseUsageMetricsResponse.SuccessJson -> response.json
        is CopilotCopilotEnterpriseUsageMetricsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotEnterpriseUsageMetricsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotEnterpriseUsageMetricsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotEnterpriseUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotCopilotEnterpriseUsageMetricsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotCopilotEnterpriseUsageMetricsResponse.Http403Json -> CopilotCopilotEnterpriseUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotEnterpriseUsageMetricsResponse.Http404Json -> CopilotCopilotEnterpriseUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotEnterpriseUsageMetricsResponse.Http500Json -> CopilotCopilotEnterpriseUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotEnterpriseUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Use this endpoint to retrieve download links for the latest 28-day enterprise Copilot usage metrics report. The
   * report provides comprehensive usage data for Copilot features across the enterprise.
   *
   * The report contains aggregated metrics for the previous 28 days, including usage statistics for various Copilot
   * features, user engagement data, and feature adoption metrics. Reports are generated daily and made available for
   * download through signed URLs with a limited expiration time.
   *
   * The response includes download links to the report files, along with the specific date range covered by the report.
   * The report covers a complete 28-day period ending on the most recent day for which data has been processed.
   *
   * Enterprise owners, billing managers, and authorized users with fine-grained "View Enterprise Copilot Metrics"
   * permission can retrieve Copilot metrics reports for the enterprise. OAuth app tokens and personal access tokens
   * (classic) need either the `manage_billing:copilot` or `read:enterprise` scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCopilotEnterpriseUsageMetricsWithResponse(enterprise: String, options: CallOptions = CallOptions()): SdkResponseResult<CopilotCopilotEnterpriseUsageMetricsResponse> = executor.executeWithResponse<Unit, CopilotCopilotEnterpriseUsageMetricsResponse>(SdkExecutionRequest(copilotCopilotEnterpriseUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CopilotCodecs.copilotCopilotEnterpriseUsageMetricsRequestCodecRegistry, CopilotCopilotEnterpriseUsageMetricsResponseDecoder, options)

  /**
   * Use this endpoint to retrieve download links for the Copilot enterprise user-teams report for a specific day. The
   * report provides user-team join data for Copilot across the enterprise, with one entry per user-team pair.
   *
   * The report contains user-team membership data for the specified day, enabling consumers to join with the existing
   * enterprise user reports to compute team-level usage metrics. Reports are generated daily and made available for
   * download through signed URLs with a limited expiration time.
   *
   * The response includes download links to the report files, along with the specific date of the report. The report
   * covers a complete day for which data has been processed.
   *
   * Enterprise owners, billing managers, and authorized users with fine-grained "View Enterprise Copilot Metrics"
   * permission can retrieve Copilot metrics reports for the enterprise. OAuth app tokens and personal access tokens
   * (classic) need either the `manage_billing:copilot` or `read:enterprise` scopes to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotCopilotEnterpriseUserTeamsOneDayReportApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CopilotCopilotEnterpriseUserTeamsOneDayReportError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotCopilotEnterpriseUserTeamsOneDayReport(
    enterprise: String,
    day: String,
    options: CallOptions = CallOptions(),
  ): CopilotUsageMetrics1DayReport = executor.executeWithTypedErrors<Unit, CopilotCopilotEnterpriseUserTeamsOneDayReportResponse, CopilotUsageMetrics1DayReport>(
    request = SdkExecutionRequest(copilotCopilotEnterpriseUserTeamsOneDayReportMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = listOf(day.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotCopilotEnterpriseUserTeamsOneDayReportRequestCodecRegistry,
    responseDecoder = CopilotCopilotEnterpriseUserTeamsOneDayReportResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.SuccessJson -> response.json
        is CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Http403Json -> CopilotCopilotEnterpriseUserTeamsOneDayReportApiException(response, statusCode, headers)
        is CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Http404Json -> CopilotCopilotEnterpriseUserTeamsOneDayReportApiException(response, statusCode, headers)
        is CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Http500Json -> CopilotCopilotEnterpriseUserTeamsOneDayReportApiException(response, statusCode, headers)
        is CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Use this endpoint to retrieve download links for the Copilot enterprise user-teams report for a specific day. The
   * report provides user-team join data for Copilot across the enterprise, with one entry per user-team pair.
   *
   * The report contains user-team membership data for the specified day, enabling consumers to join with the existing
   * enterprise user reports to compute team-level usage metrics. Reports are generated daily and made available for
   * download through signed URLs with a limited expiration time.
   *
   * The response includes download links to the report files, along with the specific date of the report. The report
   * covers a complete day for which data has been processed.
   *
   * Enterprise owners, billing managers, and authorized users with fine-grained "View Enterprise Copilot Metrics"
   * permission can retrieve Copilot metrics reports for the enterprise. OAuth app tokens and personal access tokens
   * (classic) need either the `manage_billing:copilot` or `read:enterprise` scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCopilotEnterpriseUserTeamsOneDayReportWithResponse(
    enterprise: String,
    day: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotCopilotEnterpriseUserTeamsOneDayReportResponse> = executor.executeWithResponse<Unit, CopilotCopilotEnterpriseUserTeamsOneDayReportResponse>(SdkExecutionRequest(copilotCopilotEnterpriseUserTeamsOneDayReportMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = listOf(day.toString())))
  }), CopilotCodecs.copilotCopilotEnterpriseUserTeamsOneDayReportRequestCodecRegistry, CopilotCopilotEnterpriseUserTeamsOneDayReportResponseDecoder, options)

  /**
   * Use this endpoint to retrieve download links for the Copilot organization usage metrics report for a specific day.
   * The report provides comprehensive usage data for Copilot features across the organization.
   *
   * The report contains aggregated metrics for the specified day, including usage statistics for various Copilot
   * features, user engagement data, and feature adoption metrics. Reports are generated daily and made available for
   * download through signed URLs with a limited expiration time.
   *
   * The response includes download links to the report files, along with the specific date of the report. The report
   * covers a complete day for which data has been processed.
   *
   * Organization owners and authorized users with fine-grained "View Organization Copilot Metrics" permission can
   * retrieve Copilot metrics reports for the organization. OAuth app tokens and personal access tokens (classic) need
   * the `read:org` scope to use this endpoint.
   *
   * For more information about organization metrics attribution, see [How are metrics attributed across
   * organizations](https://docs.github.com/copilot/concepts/copilot-metrics#how-are-metrics-attributed-across-organizat
   * ions).
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCopilotOrganizationOneDayUsageMetricsWithResponse(
    org: String,
    day: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotCopilotOrganizationOneDayUsageMetricsResponse> = executor.executeWithResponse<Unit, CopilotCopilotOrganizationOneDayUsageMetricsResponse>(SdkExecutionRequest(copilotCopilotOrganizationOneDayUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = listOf(day.toString())))
  }), CopilotCodecs.copilotCopilotOrganizationOneDayUsageMetricsRequestCodecRegistry, CopilotCopilotOrganizationOneDayUsageMetricsResponseDecoder, options)

  /**
   * Use this endpoint to retrieve download links for the latest 28-day organization Copilot usage metrics report. The
   * report provides comprehensive usage data for Copilot features across the organization.
   *
   * The report contains aggregated metrics for the previous 28 days, including usage statistics for various Copilot
   * features, user engagement data, and feature adoption metrics. Reports are generated daily and made available for
   * download through signed URLs with a limited expiration time.
   *
   * The response includes download links to the report files, along with the specific date range covered by the report.
   * The report covers a complete 28-day period ending on the most recent day for which data has been processed.
   *
   * Organization owners and authorized users with fine-grained "View Organization Copilot Metrics" permission can
   * retrieve Copilot metrics reports for the organization. OAuth app tokens and personal access tokens (classic) need
   * the `read:org` scope to use this endpoint.
   *
   * For more information about organization metrics attribution, see [How are metrics attributed across
   * organizations](https://docs.github.com/copilot/concepts/copilot-metrics#how-are-metrics-attributed-across-organizat
   * ions).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotCopilotOrganizationUsageMetricsApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CopilotCopilotOrganizationUsageMetricsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotCopilotOrganizationUsageMetrics(org: String, options: CallOptions = CallOptions()): CopilotUsageMetrics28DayReport = executor.executeWithTypedErrors<Unit, CopilotCopilotOrganizationUsageMetricsResponse, CopilotUsageMetrics28DayReport>(
    request = SdkExecutionRequest(copilotCopilotOrganizationUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotCopilotOrganizationUsageMetricsRequestCodecRegistry,
    responseDecoder = CopilotCopilotOrganizationUsageMetricsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotCopilotOrganizationUsageMetricsResponse.SuccessJson -> response.json
        is CopilotCopilotOrganizationUsageMetricsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotOrganizationUsageMetricsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotOrganizationUsageMetricsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotOrganizationUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotCopilotOrganizationUsageMetricsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotCopilotOrganizationUsageMetricsResponse.Http403Json -> CopilotCopilotOrganizationUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotOrganizationUsageMetricsResponse.Http404Json -> CopilotCopilotOrganizationUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotOrganizationUsageMetricsResponse.Http500Json -> CopilotCopilotOrganizationUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotOrganizationUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Use this endpoint to retrieve download links for the latest 28-day organization Copilot usage metrics report. The
   * report provides comprehensive usage data for Copilot features across the organization.
   *
   * The report contains aggregated metrics for the previous 28 days, including usage statistics for various Copilot
   * features, user engagement data, and feature adoption metrics. Reports are generated daily and made available for
   * download through signed URLs with a limited expiration time.
   *
   * The response includes download links to the report files, along with the specific date range covered by the report.
   * The report covers a complete 28-day period ending on the most recent day for which data has been processed.
   *
   * Organization owners and authorized users with fine-grained "View Organization Copilot Metrics" permission can
   * retrieve Copilot metrics reports for the organization. OAuth app tokens and personal access tokens (classic) need
   * the `read:org` scope to use this endpoint.
   *
   * For more information about organization metrics attribution, see [How are metrics attributed across
   * organizations](https://docs.github.com/copilot/concepts/copilot-metrics#how-are-metrics-attributed-across-organizat
   * ions).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCopilotOrganizationUsageMetricsWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<CopilotCopilotOrganizationUsageMetricsResponse> = executor.executeWithResponse<Unit, CopilotCopilotOrganizationUsageMetricsResponse>(SdkExecutionRequest(copilotCopilotOrganizationUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotCopilotOrganizationUsageMetricsRequestCodecRegistry, CopilotCopilotOrganizationUsageMetricsResponseDecoder, options)

  /**
   * Use this endpoint to retrieve download links for the Copilot organization user-teams report for a specific day. The
   * report provides user-team join data for Copilot across the organization, with one entry per user-team pair.
   *
   * The report contains user-team membership data for the specified day, enabling consumers to join with the existing
   * organization user reports to compute team-level usage metrics. Reports are generated daily and made available for
   * download through signed URLs with a limited expiration time.
   *
   * The response includes download links to the report files, along with the specific date of the report. The report
   * covers a complete day for which data has been processed.
   *
   * Organization owners and authorized users with fine-grained "View Organization Copilot Metrics" permission can
   * retrieve Copilot metrics reports for the organization. OAuth app tokens and personal access tokens (classic) need
   * the `read:org` scope to use this endpoint.
   *
   * For more information about organization metrics attribution, see [How are metrics attributed across
   * organizations](https://docs.github.com/copilot/concepts/copilot-metrics#how-are-metrics-attributed-across-organizat
   * ions).
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCopilotOrganizationUserTeamsOneDayReportWithResponse(
    org: String,
    day: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotCopilotOrganizationUserTeamsOneDayReportResponse> = executor.executeWithResponse<Unit, CopilotCopilotOrganizationUserTeamsOneDayReportResponse>(SdkExecutionRequest(copilotCopilotOrganizationUserTeamsOneDayReportMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = listOf(day.toString())))
  }), CopilotCodecs.copilotCopilotOrganizationUserTeamsOneDayReportRequestCodecRegistry, CopilotCopilotOrganizationUserTeamsOneDayReportResponseDecoder, options)

  /**
   * Use this endpoint to retrieve download links for the Copilot organization user usage metrics report for a specific
   * day. The report provides detailed user-level usage data and engagement metrics for Copilot features across the
   * organization.
   *
   * The report contains user-specific metrics for the specified day, including individual user engagement statistics,
   * feature usage patterns, and adoption metrics broken down by user. This report allows authorized users to analyze
   * Copilot usage at the user level to understand adoption patterns and identify opportunities for increased
   * engagement.
   *
   * Reports are generated daily and made available for download through signed URLs with a limited expiration time. The
   * response includes download links to the report files, along with the specific date of the report. The report covers
   * a complete day for which data has been processed.
   *
   * Organization owners and authorized users with fine-grained "View Organization Copilot Metrics" permission can
   * retrieve Copilot metrics reports for the organization. OAuth app tokens and personal access tokens (classic) need
   * the `read:org` scope to use this endpoint.
   *
   * For more information about organization metrics attribution, see [How are metrics attributed across
   * organizations](https://docs.github.com/copilot/concepts/copilot-metrics#how-are-metrics-attributed-across-organizat
   * ions).
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCopilotOrganizationUsersOneDayUsageMetricsWithResponse(
    org: String,
    day: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse> = executor.executeWithResponse<Unit, CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse>(SdkExecutionRequest(copilotCopilotOrganizationUsersOneDayUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = listOf(day.toString())))
  }), CopilotCodecs.copilotCopilotOrganizationUsersOneDayUsageMetricsRequestCodecRegistry, CopilotCopilotOrganizationUsersOneDayUsageMetricsResponseDecoder, options)

  /**
   * Use this endpoint to retrieve download links for the latest 28-day organization users Copilot usage metrics report.
   * The report provides detailed user-level usage data and engagement metrics for Copilot features across the
   * organization.
   *
   * The report contains user-specific metrics for the previous 28 days, including individual user engagement
   * statistics, feature usage patterns, and adoption metrics broken down by user. This report allows authorized users
   * to analyze Copilot usage at the user level to understand adoption patterns and identify opportunities for increased
   * engagement.
   *
   * Reports are generated daily and made available for download through signed URLs with a limited expiration time. The
   * response includes download links to the report files, along with the specific date range covered by the report. The
   * report covers a complete 28-day period ending on the most recent day for which data has been processed.
   *
   * Organization owners and authorized users with fine-grained "View Organization Copilot Metrics" permission can
   * retrieve Copilot metrics reports for the organization. OAuth app tokens and personal access tokens (classic) need
   * the `read:org` scope to use this endpoint.
   *
   * For more information about organization metrics attribution, see [How are metrics attributed across
   * organizations](https://docs.github.com/copilot/concepts/copilot-metrics#how-are-metrics-attributed-across-organizat
   * ions).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotCopilotOrganizationUsersUsageMetricsApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CopilotCopilotOrganizationUsersUsageMetricsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotCopilotOrganizationUsersUsageMetrics(org: String, options: CallOptions = CallOptions()): CopilotUsageMetrics28DayReport = executor.executeWithTypedErrors<Unit, CopilotCopilotOrganizationUsersUsageMetricsResponse, CopilotUsageMetrics28DayReport>(
    request = SdkExecutionRequest(copilotCopilotOrganizationUsersUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotCopilotOrganizationUsersUsageMetricsRequestCodecRegistry,
    responseDecoder = CopilotCopilotOrganizationUsersUsageMetricsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotCopilotOrganizationUsersUsageMetricsResponse.SuccessJson -> response.json
        is CopilotCopilotOrganizationUsersUsageMetricsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotOrganizationUsersUsageMetricsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotOrganizationUsersUsageMetricsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotOrganizationUsersUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotCopilotOrganizationUsersUsageMetricsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotCopilotOrganizationUsersUsageMetricsResponse.Http403Json -> CopilotCopilotOrganizationUsersUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotOrganizationUsersUsageMetricsResponse.Http404Json -> CopilotCopilotOrganizationUsersUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotOrganizationUsersUsageMetricsResponse.Http500Json -> CopilotCopilotOrganizationUsersUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotOrganizationUsersUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Use this endpoint to retrieve download links for the latest 28-day organization users Copilot usage metrics report.
   * The report provides detailed user-level usage data and engagement metrics for Copilot features across the
   * organization.
   *
   * The report contains user-specific metrics for the previous 28 days, including individual user engagement
   * statistics, feature usage patterns, and adoption metrics broken down by user. This report allows authorized users
   * to analyze Copilot usage at the user level to understand adoption patterns and identify opportunities for increased
   * engagement.
   *
   * Reports are generated daily and made available for download through signed URLs with a limited expiration time. The
   * response includes download links to the report files, along with the specific date range covered by the report. The
   * report covers a complete 28-day period ending on the most recent day for which data has been processed.
   *
   * Organization owners and authorized users with fine-grained "View Organization Copilot Metrics" permission can
   * retrieve Copilot metrics reports for the organization. OAuth app tokens and personal access tokens (classic) need
   * the `read:org` scope to use this endpoint.
   *
   * For more information about organization metrics attribution, see [How are metrics attributed across
   * organizations](https://docs.github.com/copilot/concepts/copilot-metrics#how-are-metrics-attributed-across-organizat
   * ions).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCopilotOrganizationUsersUsageMetricsWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<CopilotCopilotOrganizationUsersUsageMetricsResponse> = executor.executeWithResponse<Unit, CopilotCopilotOrganizationUsersUsageMetricsResponse>(SdkExecutionRequest(copilotCopilotOrganizationUsersUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotCopilotOrganizationUsersUsageMetricsRequestCodecRegistry, CopilotCopilotOrganizationUsersUsageMetricsResponseDecoder, options)

  /**
   * Use this endpoint to retrieve download links for the Copilot user usage metrics report for a specific day. The
   * report provides detailed user-level usage data and engagement metrics for Copilot features across the enterprise.
   *
   * The report contains user-specific metrics for the specified day, including individual user engagement statistics,
   * feature usage patterns, and adoption metrics broken down by user. This report allows authorized users to analyze
   * Copilot usage at the user level to understand adoption patterns and identify opportunities for increased
   * engagement.
   *
   * Reports are generated daily and made available for download through signed URLs with a limited expiration time. The
   * response includes download links to the report files, along with the specific date of the report. The report covers
   * a complete day for which data has been processed. Reports are available starting from October 10, 2025, and
   * historical data can be accessed for up to 1 year from the current date.
   *
   * Enterprise owners, billing managers, and authorized users with fine-grained "View Enterprise Copilot Metrics"
   * permission can retrieve Copilot metrics reports for the enterprise. OAuth app tokens and personal access tokens
   * (classic) need either the `manage_billing:copilot` or `read:enterprise` scopes to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotCopilotUsersOneDayUsageMetricsApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotCopilotUsersOneDayUsageMetricsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotCopilotUsersOneDayUsageMetrics(
    enterprise: String,
    day: String,
    options: CallOptions = CallOptions(),
  ): CopilotUsageMetrics1DayReport = executor.executeWithTypedErrors<Unit, CopilotCopilotUsersOneDayUsageMetricsResponse, CopilotUsageMetrics1DayReport>(
    request = SdkExecutionRequest(copilotCopilotUsersOneDayUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = listOf(day.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotCopilotUsersOneDayUsageMetricsRequestCodecRegistry,
    responseDecoder = CopilotCopilotUsersOneDayUsageMetricsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotCopilotUsersOneDayUsageMetricsResponse.SuccessJson -> response.json
        is CopilotCopilotUsersOneDayUsageMetricsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotUsersOneDayUsageMetricsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotUsersOneDayUsageMetricsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotUsersOneDayUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotCopilotUsersOneDayUsageMetricsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotCopilotUsersOneDayUsageMetricsResponse.Http403Json -> CopilotCopilotUsersOneDayUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotUsersOneDayUsageMetricsResponse.Http404Json -> CopilotCopilotUsersOneDayUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotUsersOneDayUsageMetricsResponse.Http500Json -> CopilotCopilotUsersOneDayUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotUsersOneDayUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Use this endpoint to retrieve download links for the Copilot user usage metrics report for a specific day. The
   * report provides detailed user-level usage data and engagement metrics for Copilot features across the enterprise.
   *
   * The report contains user-specific metrics for the specified day, including individual user engagement statistics,
   * feature usage patterns, and adoption metrics broken down by user. This report allows authorized users to analyze
   * Copilot usage at the user level to understand adoption patterns and identify opportunities for increased
   * engagement.
   *
   * Reports are generated daily and made available for download through signed URLs with a limited expiration time. The
   * response includes download links to the report files, along with the specific date of the report. The report covers
   * a complete day for which data has been processed. Reports are available starting from October 10, 2025, and
   * historical data can be accessed for up to 1 year from the current date.
   *
   * Enterprise owners, billing managers, and authorized users with fine-grained "View Enterprise Copilot Metrics"
   * permission can retrieve Copilot metrics reports for the enterprise. OAuth app tokens and personal access tokens
   * (classic) need either the `manage_billing:copilot` or `read:enterprise` scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCopilotUsersOneDayUsageMetricsWithResponse(
    enterprise: String,
    day: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotCopilotUsersOneDayUsageMetricsResponse> = executor.executeWithResponse<Unit, CopilotCopilotUsersOneDayUsageMetricsResponse>(SdkExecutionRequest(copilotCopilotUsersOneDayUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = listOf(day.toString())))
  }), CopilotCodecs.copilotCopilotUsersOneDayUsageMetricsRequestCodecRegistry, CopilotCopilotUsersOneDayUsageMetricsResponseDecoder, options)

  /**
   * Use this endpoint to retrieve download links for the latest 28-day enterprise users Copilot usage metrics report.
   * The report provides detailed user-level usage data and engagement metrics for Copilot features across the
   * enterprise.
   *
   * The report contains user-specific metrics for the previous 28 days, including individual user engagement
   * statistics, feature usage patterns, and adoption metrics broken down by user. This report allows authorized users
   * to analyze Copilot usage at the user level to understand adoption patterns and identify opportunities for increased
   * engagement.
   *
   * Reports are generated daily and made available for download through signed URLs with a limited expiration time. The
   * response includes download links to the report files, along with the specific date range covered by the report. The
   * report covers a complete 28-day period ending on the most recent day for which data has been processed.
   *
   * Enterprise owners, billing managers, and authorized users with fine-grained "View Enterprise Copilot Metrics"
   * permission can retrieve Copilot metrics reports for the enterprise. OAuth app tokens and personal access tokens
   * (classic) need either the `manage_billing:copilot` or `read:enterprise` scopes to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotCopilotUsersUsageMetricsApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotCopilotUsersUsageMetricsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotCopilotUsersUsageMetrics(enterprise: String, options: CallOptions = CallOptions()): CopilotUsageMetrics28DayReport = executor.executeWithTypedErrors<Unit, CopilotCopilotUsersUsageMetricsResponse, CopilotUsageMetrics28DayReport>(
    request = SdkExecutionRequest(copilotCopilotUsersUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotCopilotUsersUsageMetricsRequestCodecRegistry,
    responseDecoder = CopilotCopilotUsersUsageMetricsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotCopilotUsersUsageMetricsResponse.SuccessJson -> response.json
        is CopilotCopilotUsersUsageMetricsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotUsersUsageMetricsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotUsersUsageMetricsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotCopilotUsersUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotCopilotUsersUsageMetricsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotCopilotUsersUsageMetricsResponse.Http403Json -> CopilotCopilotUsersUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotUsersUsageMetricsResponse.Http404Json -> CopilotCopilotUsersUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotUsersUsageMetricsResponse.Http500Json -> CopilotCopilotUsersUsageMetricsApiException(response, statusCode, headers)
        is CopilotCopilotUsersUsageMetricsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Use this endpoint to retrieve download links for the latest 28-day enterprise users Copilot usage metrics report.
   * The report provides detailed user-level usage data and engagement metrics for Copilot features across the
   * enterprise.
   *
   * The report contains user-specific metrics for the previous 28 days, including individual user engagement
   * statistics, feature usage patterns, and adoption metrics broken down by user. This report allows authorized users
   * to analyze Copilot usage at the user level to understand adoption patterns and identify opportunities for increased
   * engagement.
   *
   * Reports are generated daily and made available for download through signed URLs with a limited expiration time. The
   * response includes download links to the report files, along with the specific date range covered by the report. The
   * report covers a complete 28-day period ending on the most recent day for which data has been processed.
   *
   * Enterprise owners, billing managers, and authorized users with fine-grained "View Enterprise Copilot Metrics"
   * permission can retrieve Copilot metrics reports for the enterprise. OAuth app tokens and personal access tokens
   * (classic) need either the `manage_billing:copilot` or `read:enterprise` scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotCopilotUsersUsageMetricsWithResponse(enterprise: String, options: CallOptions = CallOptions()): SdkResponseResult<CopilotCopilotUsersUsageMetricsResponse> = executor.executeWithResponse<Unit, CopilotCopilotUsersUsageMetricsResponse>(SdkExecutionRequest(copilotCopilotUsersUsageMetricsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CopilotCodecs.copilotCopilotUsersUsageMetricsRequestCodecRegistry, CopilotCopilotUsersUsageMetricsResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Removes a repository from the list of selected repositories enabled for Copilot
   * cloud agent in an organization. This method can only be called when the
   * cloud agent repository policy is set to `selected`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scopes to use this endpoint.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotDisableCopilotCodingAgentForRepositoryInOrganizationApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CopilotDisableCopilotCodingAgentForRepositoryInOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotDisableCopilotCodingAgentForRepositoryInOrganization(
    org: String,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse, Unit>(
    request = SdkExecutionRequest(copilotDisableCopilotCodingAgentForRepositoryInOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotDisableCopilotCodingAgentForRepositoryInOrganizationRequestCodecRegistry,
    responseDecoder = CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.SuccessNoContent -> response.unit
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http401Json -> CopilotDisableCopilotCodingAgentForRepositoryInOrganizationApiException(response, statusCode, headers)
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http403Json -> CopilotDisableCopilotCodingAgentForRepositoryInOrganizationApiException(response, statusCode, headers)
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http404Json -> CopilotDisableCopilotCodingAgentForRepositoryInOrganizationApiException(response, statusCode, headers)
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http409Json -> CopilotDisableCopilotCodingAgentForRepositoryInOrganizationApiException(response, statusCode, headers)
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http500Json -> CopilotDisableCopilotCodingAgentForRepositoryInOrganizationApiException(response, statusCode, headers)
        is CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Removes a repository from the list of selected repositories enabled for Copilot
   * cloud agent in an organization. This method can only be called when the
   * cloud agent repository policy is set to `selected`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotDisableCopilotCodingAgentForRepositoryInOrganizationWithResponse(
    org: String,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse> = executor.executeWithResponse<Unit, CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse>(SdkExecutionRequest(copilotDisableCopilotCodingAgentForRepositoryInOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
  }), CopilotCodecs.copilotDisableCopilotCodingAgentForRepositoryInOrganizationRequestCodecRegistry, CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Adds a repository to the list of selected repositories enabled for Copilot
   * cloud agent in an organization. This method can only be called when the
   * cloud agent repository policy is set to `selected`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotEnableCopilotCodingAgentForRepositoryInOrganizationApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CopilotEnableCopilotCodingAgentForRepositoryInOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotEnableCopilotCodingAgentForRepositoryInOrganization(
    org: String,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse, Unit>(
    request = SdkExecutionRequest(copilotEnableCopilotCodingAgentForRepositoryInOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotEnableCopilotCodingAgentForRepositoryInOrganizationRequestCodecRegistry,
    responseDecoder = CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.SuccessNoContent -> response.unit
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http401Json -> CopilotEnableCopilotCodingAgentForRepositoryInOrganizationApiException(response, statusCode, headers)
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http403Json -> CopilotEnableCopilotCodingAgentForRepositoryInOrganizationApiException(response, statusCode, headers)
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http404Json -> CopilotEnableCopilotCodingAgentForRepositoryInOrganizationApiException(response, statusCode, headers)
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http409Json -> CopilotEnableCopilotCodingAgentForRepositoryInOrganizationApiException(response, statusCode, headers)
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http422Json -> CopilotEnableCopilotCodingAgentForRepositoryInOrganizationApiException(response, statusCode, headers)
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http500Json -> CopilotEnableCopilotCodingAgentForRepositoryInOrganizationApiException(response, statusCode, headers)
        is CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Adds a repository to the list of selected repositories enabled for Copilot
   * cloud agent in an organization. This method can only be called when the
   * cloud agent repository policy is set to `selected`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotEnableCopilotCodingAgentForRepositoryInOrganizationWithResponse(
    org: String,
    repositoryId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse> = executor.executeWithResponse<Unit, CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse>(SdkExecutionRequest(copilotEnableCopilotCodingAgentForRepositoryInOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repository_id", values = listOf(repositoryId.toString())))
  }), CopilotCodecs.copilotEnableCopilotCodingAgentForRepositoryInOrganizationRequestCodecRegistry, CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets the Copilot cloud agent configuration for a repository, including MCP server
   * configuration, enabled review tools, Actions workflow approval settings, and firewall
   * configuration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotGetCopilotCloudAgentConfigurationApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CopilotGetCopilotCloudAgentConfigurationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotGetCopilotCloudAgentConfiguration(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8 = executor.executeWithTypedErrors<Unit, CopilotGetCopilotCloudAgentConfigurationResponse, InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8>(
    request = SdkExecutionRequest(copilotGetCopilotCloudAgentConfigurationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotGetCopilotCloudAgentConfigurationRequestCodecRegistry,
    responseDecoder = CopilotGetCopilotCloudAgentConfigurationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotGetCopilotCloudAgentConfigurationResponse.SuccessJson -> response.json
        is CopilotGetCopilotCloudAgentConfigurationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotCloudAgentConfigurationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotCloudAgentConfigurationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotCloudAgentConfigurationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotCloudAgentConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotGetCopilotCloudAgentConfigurationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotGetCopilotCloudAgentConfigurationResponse.Http401Json -> CopilotGetCopilotCloudAgentConfigurationApiException(response, statusCode, headers)
        is CopilotGetCopilotCloudAgentConfigurationResponse.Http403Json -> CopilotGetCopilotCloudAgentConfigurationApiException(response, statusCode, headers)
        is CopilotGetCopilotCloudAgentConfigurationResponse.Http404Json -> CopilotGetCopilotCloudAgentConfigurationApiException(response, statusCode, headers)
        is CopilotGetCopilotCloudAgentConfigurationResponse.Http500Json -> CopilotGetCopilotCloudAgentConfigurationApiException(response, statusCode, headers)
        is CopilotGetCopilotCloudAgentConfigurationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets the Copilot cloud agent configuration for a repository, including MCP server
   * configuration, enabled review tools, Actions workflow approval settings, and firewall
   * configuration.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotGetCopilotCloudAgentConfigurationWithResponse(
    owner: String,
    repo: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotGetCopilotCloudAgentConfigurationResponse> = executor.executeWithResponse<Unit, CopilotGetCopilotCloudAgentConfigurationResponse>(SdkExecutionRequest(copilotGetCopilotCloudAgentConfigurationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
  }), CopilotCodecs.copilotGetCopilotCloudAgentConfigurationRequestCodecRegistry, CopilotGetCopilotCloudAgentConfigurationResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets information about which repositories in an organization have been enabled
   * or disabled for the Copilot cloud agent.
   *
   * Organization owners can configure whether Copilot cloud agent is enabled for
   * all repositories, selected repositories, or no repositories owned by organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotGetCopilotCodingAgentPermissionsOrganizationApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CopilotGetCopilotCodingAgentPermissionsOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotGetCopilotCodingAgentPermissionsOrganization(org: String, options: CallOptions = CallOptions()): InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951 = executor.executeWithTypedErrors<Unit, CopilotGetCopilotCodingAgentPermissionsOrganizationResponse, InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951>(
    request = SdkExecutionRequest(copilotGetCopilotCodingAgentPermissionsOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotGetCopilotCodingAgentPermissionsOrganizationRequestCodecRegistry,
    responseDecoder = CopilotGetCopilotCodingAgentPermissionsOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.SuccessJson -> response.json
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http401Json -> CopilotGetCopilotCodingAgentPermissionsOrganizationApiException(response, statusCode, headers)
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http403Json -> CopilotGetCopilotCodingAgentPermissionsOrganizationApiException(response, statusCode, headers)
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http404Json -> CopilotGetCopilotCodingAgentPermissionsOrganizationApiException(response, statusCode, headers)
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http500Json -> CopilotGetCopilotCodingAgentPermissionsOrganizationApiException(response, statusCode, headers)
        is CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets information about which repositories in an organization have been enabled
   * or disabled for the Copilot cloud agent.
   *
   * Organization owners can configure whether Copilot cloud agent is enabled for
   * all repositories, selected repositories, or no repositories owned by organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotGetCopilotCodingAgentPermissionsOrganizationWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<CopilotGetCopilotCodingAgentPermissionsOrganizationResponse> = executor.executeWithResponse<Unit, CopilotGetCopilotCodingAgentPermissionsOrganizationResponse>(SdkExecutionRequest(copilotGetCopilotCodingAgentPermissionsOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotGetCopilotCodingAgentPermissionsOrganizationRequestCodecRegistry, CopilotGetCopilotCodingAgentPermissionsOrganizationResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets information about an organization's Copilot subscription, including seat breakdown
   * and feature policies. To configure these settings, go to your organization's settings on GitHub.com.
   * For more information, see "[Managing policies for Copilot in your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-policies-for-copilot-business-in-your-organ
   * ization)."
   *
   * Only organization owners can view details about the organization's Copilot Business or Copilot Enterprise
   * subscription.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `read:org` scopes
   * to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotGetCopilotOrganizationDetailsApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotGetCopilotOrganizationDetailsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotGetCopilotOrganizationDetails(org: String, options: CallOptions = CallOptions()): CopilotOrganizationDetails = executor.executeWithTypedErrors<Unit, CopilotGetCopilotOrganizationDetailsResponse, CopilotOrganizationDetails>(
    request = SdkExecutionRequest(copilotGetCopilotOrganizationDetailsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotGetCopilotOrganizationDetailsRequestCodecRegistry,
    responseDecoder = CopilotGetCopilotOrganizationDetailsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotGetCopilotOrganizationDetailsResponse.SuccessJson -> response.json
        is CopilotGetCopilotOrganizationDetailsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotOrganizationDetailsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotOrganizationDetailsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotOrganizationDetailsResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotOrganizationDetailsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotOrganizationDetailsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotGetCopilotOrganizationDetailsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotGetCopilotOrganizationDetailsResponse.Http401Json -> CopilotGetCopilotOrganizationDetailsApiException(response, statusCode, headers)
        is CopilotGetCopilotOrganizationDetailsResponse.Http403Json -> CopilotGetCopilotOrganizationDetailsApiException(response, statusCode, headers)
        is CopilotGetCopilotOrganizationDetailsResponse.Http404Json -> CopilotGetCopilotOrganizationDetailsApiException(response, statusCode, headers)
        is CopilotGetCopilotOrganizationDetailsResponse.Http422NoContent -> CopilotGetCopilotOrganizationDetailsApiException(response, statusCode, headers)
        is CopilotGetCopilotOrganizationDetailsResponse.Http500Json -> CopilotGetCopilotOrganizationDetailsApiException(response, statusCode, headers)
        is CopilotGetCopilotOrganizationDetailsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets information about an organization's Copilot subscription, including seat breakdown
   * and feature policies. To configure these settings, go to your organization's settings on GitHub.com.
   * For more information, see "[Managing policies for Copilot in your
   * organization](https://docs.github.com/copilot/managing-copilot/managing-policies-for-copilot-business-in-your-organ
   * ization)."
   *
   * Only organization owners can view details about the organization's Copilot Business or Copilot Enterprise
   * subscription.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `read:org` scopes
   * to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotGetCopilotOrganizationDetailsWithResponse(org: String, options: CallOptions = CallOptions()): SdkResponseResult<CopilotGetCopilotOrganizationDetailsResponse> = executor.executeWithResponse<Unit, CopilotGetCopilotOrganizationDetailsResponse>(SdkExecutionRequest(copilotGetCopilotOrganizationDetailsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotGetCopilotOrganizationDetailsRequestCodecRegistry, CopilotGetCopilotOrganizationDetailsResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets the GitHub Copilot seat details for a member of an organization who currently has access to GitHub Copilot.
   *
   * The seat object contains information about the user's most recent Copilot activity. Users must have telemetry
   * enabled in their IDE for Copilot in the IDE activity to be reflected in `last_activity_at`.
   * For more information about activity data, see [Metrics data properties for GitHub
   * Copilot](https://docs.github.com/copilot/reference/metrics-data).
   *
   * Only organization owners can view Copilot seat assignment details for members of their organization.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `read:org` scopes
   * to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotGetCopilotSeatDetailsForUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotGetCopilotSeatDetailsForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotGetCopilotSeatDetailsForUser(
    org: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): CopilotSeatDetails = executor.executeWithTypedErrors<Unit, CopilotGetCopilotSeatDetailsForUserResponse, CopilotSeatDetails>(
    request = SdkExecutionRequest(copilotGetCopilotSeatDetailsForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotGetCopilotSeatDetailsForUserRequestCodecRegistry,
    responseDecoder = CopilotGetCopilotSeatDetailsForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotGetCopilotSeatDetailsForUserResponse.SuccessJson -> response.json
        is CopilotGetCopilotSeatDetailsForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotSeatDetailsForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotSeatDetailsForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotSeatDetailsForUserResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotSeatDetailsForUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotGetCopilotSeatDetailsForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotGetCopilotSeatDetailsForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotGetCopilotSeatDetailsForUserResponse.Http401Json -> CopilotGetCopilotSeatDetailsForUserApiException(response, statusCode, headers)
        is CopilotGetCopilotSeatDetailsForUserResponse.Http403Json -> CopilotGetCopilotSeatDetailsForUserApiException(response, statusCode, headers)
        is CopilotGetCopilotSeatDetailsForUserResponse.Http404Json -> CopilotGetCopilotSeatDetailsForUserApiException(response, statusCode, headers)
        is CopilotGetCopilotSeatDetailsForUserResponse.Http422NoContent -> CopilotGetCopilotSeatDetailsForUserApiException(response, statusCode, headers)
        is CopilotGetCopilotSeatDetailsForUserResponse.Http500Json -> CopilotGetCopilotSeatDetailsForUserApiException(response, statusCode, headers)
        is CopilotGetCopilotSeatDetailsForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets the GitHub Copilot seat details for a member of an organization who currently has access to GitHub Copilot.
   *
   * The seat object contains information about the user's most recent Copilot activity. Users must have telemetry
   * enabled in their IDE for Copilot in the IDE activity to be reflected in `last_activity_at`.
   * For more information about activity data, see [Metrics data properties for GitHub
   * Copilot](https://docs.github.com/copilot/reference/metrics-data).
   *
   * Only organization owners can view Copilot seat assignment details for members of their organization.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `read:org` scopes
   * to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotGetCopilotSeatDetailsForUserWithResponse(
    org: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotGetCopilotSeatDetailsForUserResponse> = executor.executeWithResponse<Unit, CopilotGetCopilotSeatDetailsForUserResponse>(SdkExecutionRequest(copilotGetCopilotSeatDetailsForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotCodecs.copilotGetCopilotSeatDetailsForUserRequestCodecRegistry, CopilotGetCopilotSeatDetailsForUserResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Lists the selected repositories that are enabled for Copilot cloud agent in an organization.
   *
   * Organization owners can use this endpoint when the coding agent repository policy
   * is set to `selected` to see which repositories have been enabled.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationApiException When the service returns a
   * declared non-success response; its `error` property exposes the decoded
   * CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotListCopilotCodingAgentSelectedRepositoriesForOrganization(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef = executor.executeWithTypedErrors<Unit, CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse, InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef>(
    request = SdkExecutionRequest(copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CopilotCodecs.copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationRequestCodecRegistry,
    responseDecoder = CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.SuccessJson -> response.json
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http401Json -> CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(response, statusCode, headers)
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http403Json -> CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(response, statusCode, headers)
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http404Json -> CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(response, statusCode, headers)
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http409Json -> CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(response, statusCode, headers)
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http500Json -> CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(response, statusCode, headers)
        is CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Lists the selected repositories that are enabled for Copilot cloud agent in an organization.
   *
   * Organization owners can use this endpoint when the coding agent repository policy
   * is set to `selected` to see which repositories have been enabled.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse> = executor.executeWithResponse<Unit, CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse>(SdkExecutionRequest(copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CopilotCodecs.copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationRequestCodecRegistry, CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Lists all Copilot seats for which an organization with a Copilot Business or Copilot Enterprise subscription is
   * currently being billed.
   * Only organization owners can view assigned seats.
   *
   * Each seat object contains information about the assigned user's most recent Copilot activity. Users must have
   * telemetry enabled in their IDE for Copilot in the IDE activity to be reflected in `last_activity_at`.
   * For more information about activity data, see [Metrics data properties for GitHub
   * Copilot](https://docs.github.com/copilot/reference/metrics-data).
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `read:org` scopes
   * to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotListCopilotSeatsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CopilotListCopilotSeatsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotListCopilotSeats(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a = executor.executeWithTypedErrors<Unit, CopilotListCopilotSeatsResponse, InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a>(
    request = SdkExecutionRequest(copilotListCopilotSeatsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CopilotCodecs.copilotListCopilotSeatsRequestCodecRegistry,
    responseDecoder = CopilotListCopilotSeatsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotListCopilotSeatsResponse.SuccessJson -> response.json
        is CopilotListCopilotSeatsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotListCopilotSeatsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotListCopilotSeatsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotListCopilotSeatsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotListCopilotSeatsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotListCopilotSeatsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotListCopilotSeatsResponse.Http401Json -> CopilotListCopilotSeatsApiException(response, statusCode, headers)
        is CopilotListCopilotSeatsResponse.Http403Json -> CopilotListCopilotSeatsApiException(response, statusCode, headers)
        is CopilotListCopilotSeatsResponse.Http404Json -> CopilotListCopilotSeatsApiException(response, statusCode, headers)
        is CopilotListCopilotSeatsResponse.Http500Json -> CopilotListCopilotSeatsApiException(response, statusCode, headers)
        is CopilotListCopilotSeatsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Lists all Copilot seats for which an organization with a Copilot Business or Copilot Enterprise subscription is
   * currently being billed.
   * Only organization owners can view assigned seats.
   *
   * Each seat object contains information about the assigned user's most recent Copilot activity. Users must have
   * telemetry enabled in their IDE for Copilot in the IDE activity to be reflected in `last_activity_at`.
   * For more information about activity data, see [Metrics data properties for GitHub
   * Copilot](https://docs.github.com/copilot/reference/metrics-data).
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or `read:org` scopes
   * to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotListCopilotSeatsWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotListCopilotSeatsResponse> = executor.executeWithResponse<Unit, CopilotListCopilotSeatsResponse>(SdkExecutionRequest(copilotListCopilotSeatsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CopilotCodecs.copilotListCopilotSeatsRequestCodecRegistry, CopilotListCopilotSeatsResponseDecoder, options)

  /**
   * Disables Copilot cloud agent for the specified organizations within the enterprise.
   *
   * The enterprise's coding agent policy must be set to `enabled_for_selected_orgs` before
   * using this endpoint. Organizations can be specified by login or matched via custom properties.
   *
   * Only organizations that have Copilot enabled and belong to the enterprise will be affected.
   *
   * Only enterprise owners can remove organizations from the coding agent policy.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or
   * `admin:enterprise` scopes to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicy(
    request: InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83, CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse, Unit>(
    request = SdkExecutionRequest(copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTREMOVEORGANIZATIONSFROMENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyRequestCodecRegistry,
    responseDecoder = CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.SuccessNoContent -> response.unit
        is CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.Http400Json -> CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyApiException(response, statusCode, headers)
        is CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.Http400ScimJson -> CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyApiException(response, statusCode, headers)
        is CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Disables Copilot cloud agent for the specified organizations within the enterprise.
   *
   * The enterprise's coding agent policy must be set to `enabled_for_selected_orgs` before
   * using this endpoint. Organizations can be specified by login or matched via custom properties.
   *
   * Only organizations that have Copilot enabled and belong to the enterprise will be affected.
   *
   * Only enterprise owners can remove organizations from the coding agent policy.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or
   * `admin:enterprise` scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyWithResponse(
    request: InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse> = executor.executeWithResponse<InlineEnterprisesCopilotPo0ee5DeleteRequestJsonX72970c83, CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse>(SdkExecutionRequest(copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTREMOVEORGANIZATIONSFROMENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CopilotCodecs.copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyRequestCodecRegistry, CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Sets the policy for which repositories in an organization can use Copilot cloud agent.
   *
   * Organization owners can configure whether Copilot cloud agent is enabled for
   * all repositories, selected repositories, or no repositories owned by the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotSetCopilotCodingAgentPermissionsOrganizationApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CopilotSetCopilotCodingAgentPermissionsOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSetCopilotCodingAgentPermissionsOrganization(
    request: InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88, CopilotSetCopilotCodingAgentPermissionsOrganizationResponse, Unit>(
    request = SdkExecutionRequest(copilotSetCopilotCodingAgentPermissionsOrganizationMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTSETCOPILOTCODINGAGENTPERMISSIONSORGANIZATION_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotSetCopilotCodingAgentPermissionsOrganizationRequestCodecRegistry,
    responseDecoder = CopilotSetCopilotCodingAgentPermissionsOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.SuccessNoContent -> response.unit
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http401Json -> CopilotSetCopilotCodingAgentPermissionsOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http403Json -> CopilotSetCopilotCodingAgentPermissionsOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http404Json -> CopilotSetCopilotCodingAgentPermissionsOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http422Json -> CopilotSetCopilotCodingAgentPermissionsOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http500Json -> CopilotSetCopilotCodingAgentPermissionsOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Sets the policy for which repositories in an organization can use Copilot cloud agent.
   *
   * Organization owners can configure whether Copilot cloud agent is enabled for
   * all repositories, selected repositories, or no repositories owned by the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotSetCopilotCodingAgentPermissionsOrganizationWithResponse(
    request: InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSetCopilotCodingAgentPermissionsOrganizationResponse> = executor.executeWithResponse<InlineOrgsCopilotCodingAgentPermissionsPutRequestJsonX3cae1a88, CopilotSetCopilotCodingAgentPermissionsOrganizationResponse>(SdkExecutionRequest(copilotSetCopilotCodingAgentPermissionsOrganizationMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTSETCOPILOTCODINGAGENTPERMISSIONSORGANIZATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotSetCopilotCodingAgentPermissionsOrganizationRequestCodecRegistry, CopilotSetCopilotCodingAgentPermissionsOrganizationResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Replaces the list of selected repositories that are enabled for Copilot cloud
   * agent in an organization. This method can only be called when the cloud agent
   * repository policy is set to `selected`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationApiException When the service returns a
   * declared non-success response; its `error` property exposes the decoded
   * CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSetCopilotCodingAgentSelectedRepositoriesForOrganization(
    request: InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177, CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse, Unit>(
    request = SdkExecutionRequest(copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTSETCOPILOTCODINGAGENTSELECTEDREPOSITORIESFORORGANIZATION_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequestCodecRegistry,
    responseDecoder = CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.SuccessNoContent -> response.unit
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http401Json -> CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http403Json -> CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http404Json -> CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http409Json -> CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http422Json -> CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http500Json -> CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Replaces the list of selected repositories that are enabled for Copilot cloud
   * agent in an organization. This method can only be called when the cloud agent
   * repository policy is set to `selected`.
   *
   * OAuth app tokens and personal access tokens (classic) need the `admin:org` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationWithResponse(
    request: InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse> = executor.executeWithResponse<InlineOrgsCopilotCodingAgentPermissionsRepositoriesPutRequestJsonXb8471177, CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse>(SdkExecutionRequest(copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTSETCOPILOTCODINGAGENTSELECTEDREPOSITORIESFORORGANIZATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationRequestCodecRegistry, CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Sets Copilot content exclusion path rules for an organization.
   * To configure these settings, go to the organization's settings on GitHub.
   * For more information, see "[Excluding content from GitHub
   * Copilot](https://docs.github.com/copilot/managing-copilot/configuring-and-auditing-content-exclusion/excluding-cont
   * ent-from-github-copilot#configuring-content-exclusions-for-your-organization)."
   *
   * Organization owners can set Copilot content exclusion rules for the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `copilot` scope to use this endpoint.
   *
   * > [!CAUTION]
   * > * At this time, the API does not support comments. When using this endpoint, any existing comments in your rules
   * will be deleted.
   * > * At this time, the API does not support duplicate keys. If you submit content exclusions through the API with
   * duplicate keys, only the last occurrence will be saved. Earlier entries with the same key will be overwritten.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSetCopilotContentExclusionForOrganizationApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * CopilotSetCopilotContentExclusionForOrganizationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSetCopilotContentExclusionForOrganization(
    request: Map<String, List<InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa>>,
    org: String,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878 = executor.executeWithTypedErrors<Map<String, List<InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa>>, CopilotSetCopilotContentExclusionForOrganizationResponse, InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878>(
    request = SdkExecutionRequest(copilotSetCopilotContentExclusionForOrganizationMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTSETCOPILOTCONTENTEXCLUSIONFORORGANIZATION_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotSetCopilotContentExclusionForOrganizationRequestCodecRegistry,
    responseDecoder = CopilotSetCopilotContentExclusionForOrganizationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSetCopilotContentExclusionForOrganizationResponse.SuccessJson -> response.json
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http413Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSetCopilotContentExclusionForOrganizationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http401Json -> CopilotSetCopilotContentExclusionForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http403Json -> CopilotSetCopilotContentExclusionForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http404Json -> CopilotSetCopilotContentExclusionForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http413Json -> CopilotSetCopilotContentExclusionForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http422Json -> CopilotSetCopilotContentExclusionForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Http500Json -> CopilotSetCopilotContentExclusionForOrganizationApiException(response, statusCode, headers)
        is CopilotSetCopilotContentExclusionForOrganizationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Sets Copilot content exclusion path rules for an organization.
   * To configure these settings, go to the organization's settings on GitHub.
   * For more information, see "[Excluding content from GitHub
   * Copilot](https://docs.github.com/copilot/managing-copilot/configuring-and-auditing-content-exclusion/excluding-cont
   * ent-from-github-copilot#configuring-content-exclusions-for-your-organization)."
   *
   * Organization owners can set Copilot content exclusion rules for the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `copilot` scope to use this endpoint.
   *
   * > [!CAUTION]
   * > * At this time, the API does not support comments. When using this endpoint, any existing comments in your rules
   * will be deleted.
   * > * At this time, the API does not support duplicate keys. If you submit content exclusions through the API with
   * duplicate keys, only the last occurrence will be saved. Earlier entries with the same key will be overwritten.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotSetCopilotContentExclusionForOrganizationWithResponse(
    request: Map<String, List<InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa>>,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSetCopilotContentExclusionForOrganizationResponse> = executor.executeWithResponse<Map<String, List<InlineOrgsCopilotContentExclusionPutRequestJsonAdditionalValueItemXbf0bdbaa>>, CopilotSetCopilotContentExclusionForOrganizationResponse>(SdkExecutionRequest(copilotSetCopilotContentExclusionForOrganizationMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTSETCOPILOTCONTENTEXCLUSIONFORORGANIZATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotCodecs.copilotSetCopilotContentExclusionForOrganizationRequestCodecRegistry, CopilotSetCopilotContentExclusionForOrganizationResponseDecoder, options)

  /**
   * Sets the policy for Copilot cloud agent usage across an enterprise.
   *
   * Enterprise owners can configure whether Copilot cloud agent is enabled for all
   * organizations, disabled for all organizations, configured by individual organization
   * admins, or enabled for selected organizations only.
   *
   * Only enterprise owners can set the coding agent policy for their enterprise.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or
   * `admin:enterprise` scopes to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotSetEnterpriseCodingAgentPolicyApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotSetEnterpriseCodingAgentPolicyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSetEnterpriseCodingAgentPolicy(
    request: InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71, CopilotSetEnterpriseCodingAgentPolicyResponse, Unit>(
    request = SdkExecutionRequest(copilotSetEnterpriseCodingAgentPolicyMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTSETENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    }),
    requestCodecs = CopilotCodecs.copilotSetEnterpriseCodingAgentPolicyRequestCodecRegistry,
    responseDecoder = CopilotSetEnterpriseCodingAgentPolicyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSetEnterpriseCodingAgentPolicyResponse.SuccessNoContent -> response.unit
        is CopilotSetEnterpriseCodingAgentPolicyResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetEnterpriseCodingAgentPolicyResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSetEnterpriseCodingAgentPolicyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSetEnterpriseCodingAgentPolicyResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotSetEnterpriseCodingAgentPolicyResponse.Http400Json -> CopilotSetEnterpriseCodingAgentPolicyApiException(response, statusCode, headers)
        is CopilotSetEnterpriseCodingAgentPolicyResponse.Http400ScimJson -> CopilotSetEnterpriseCodingAgentPolicyApiException(response, statusCode, headers)
        is CopilotSetEnterpriseCodingAgentPolicyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Sets the policy for Copilot cloud agent usage across an enterprise.
   *
   * Enterprise owners can configure whether Copilot cloud agent is enabled for all
   * organizations, disabled for all organizations, configured by individual organization
   * admins, or enabled for selected organizations only.
   *
   * Only enterprise owners can set the coding agent policy for their enterprise.
   *
   * OAuth app tokens and personal access tokens (classic) need either the `manage_billing:copilot` or
   * `admin:enterprise` scopes to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun copilotSetEnterpriseCodingAgentPolicyWithResponse(
    request: InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSetEnterpriseCodingAgentPolicyResponse> = executor.executeWithResponse<InlineEnterprisesCopilotPoliciesCodingAgentPutRequestJsonX3d82ef71, CopilotSetEnterpriseCodingAgentPolicyResponse>(SdkExecutionRequest(copilotSetEnterpriseCodingAgentPolicyMetadata, baseUri, request, listOf(CopilotCodecs.COPILOTSETENTERPRISECODINGAGENTPOLICY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), CopilotCodecs.copilotSetEnterpriseCodingAgentPolicyRequestCodecRegistry, CopilotSetEnterpriseCodingAgentPolicyResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `copilot/add-copilot-seats-for-teams` may expose through its typed
   * API exception.
   */
  public sealed interface CopilotAddCopilotSeatsForTeamsError

  /**
   * Typed response alternatives for `copilot/add-copilot-seats-for-teams`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CopilotAddCopilotSeatsForTeamsResponse {
    public class SuccessJson(
      public val json: InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForTeamsResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForTeamsResponse,
        CopilotAddCopilotSeatsForTeamsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForTeamsResponse,
        CopilotAddCopilotSeatsForTeamsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForTeamsResponse,
        CopilotAddCopilotSeatsForTeamsError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForTeamsResponse,
        CopilotAddCopilotSeatsForTeamsError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForTeamsResponse,
        CopilotAddCopilotSeatsForTeamsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForTeamsResponse
  }

  /**
   * Raised by `copilot/add-copilot-seats-for-teams` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotAddCopilotSeatsForTeamsApiException(
    public val error: CopilotAddCopilotSeatsForTeamsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/add-copilot-seats-for-teams")

  private object CopilotAddCopilotSeatsForTeamsResponseDecoder : SdkResponseAlternativeDecoder<CopilotAddCopilotSeatsForTeamsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotAddCopilotSeatsForTeamsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotAddCopilotSeatsForTeamsResponse> = when {
      alternative.id == "copilot/add-copilot-seats-for-teams.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForTeamsResponse.SuccessJson(
          json = CopilotCodecs.copilotAddCopilotSeatsForTeamsResponseCodecAlternative0Registry.select(listOf("copilot/add-copilot-seats-for-teams.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-copilot-seats-for-teams.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForTeamsResponse.Http401Json(
          json = CopilotCodecs.copilotAddCopilotSeatsForTeamsResponseCodecAlternative1Registry.select(listOf("copilot/add-copilot-seats-for-teams.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-copilot-seats-for-teams.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForTeamsResponse.Http403Json(
          json = CopilotCodecs.copilotAddCopilotSeatsForTeamsResponseCodecAlternative2Registry.select(listOf("copilot/add-copilot-seats-for-teams.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-copilot-seats-for-teams.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForTeamsResponse.Http404Json(
          json = CopilotCodecs.copilotAddCopilotSeatsForTeamsResponseCodecAlternative3Registry.select(listOf("copilot/add-copilot-seats-for-teams.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-copilot-seats-for-teams.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForTeamsResponse.Http422NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-copilot-seats-for-teams.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForTeamsResponse.Http500Json(
          json = CopilotCodecs.copilotAddCopilotSeatsForTeamsResponseCodecAlternative5Registry.select(listOf("copilot/add-copilot-seats-for-teams.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotAddCopilotSeatsForTeamsResponse = CopilotAddCopilotSeatsForTeamsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/add-copilot-seats-for-users` may expose through its typed
   * API exception.
   */
  public sealed interface CopilotAddCopilotSeatsForUsersError

  /**
   * Typed response alternatives for `copilot/add-copilot-seats-for-users`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CopilotAddCopilotSeatsForUsersResponse {
    public class SuccessJson(
      public val json: InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForUsersResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForUsersResponse,
        CopilotAddCopilotSeatsForUsersError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForUsersResponse,
        CopilotAddCopilotSeatsForUsersError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForUsersResponse,
        CopilotAddCopilotSeatsForUsersError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForUsersResponse,
        CopilotAddCopilotSeatsForUsersError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForUsersResponse,
        CopilotAddCopilotSeatsForUsersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddCopilotSeatsForUsersResponse
  }

  /**
   * Raised by `copilot/add-copilot-seats-for-users` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotAddCopilotSeatsForUsersApiException(
    public val error: CopilotAddCopilotSeatsForUsersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/add-copilot-seats-for-users")

  private object CopilotAddCopilotSeatsForUsersResponseDecoder : SdkResponseAlternativeDecoder<CopilotAddCopilotSeatsForUsersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotAddCopilotSeatsForUsersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotAddCopilotSeatsForUsersResponse> = when {
      alternative.id == "copilot/add-copilot-seats-for-users.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForUsersResponse.SuccessJson(
          json = CopilotCodecs.copilotAddCopilotSeatsForUsersResponseCodecAlternative0Registry.select(listOf("copilot/add-copilot-seats-for-users.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-copilot-seats-for-users.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForUsersResponse.Http401Json(
          json = CopilotCodecs.copilotAddCopilotSeatsForUsersResponseCodecAlternative1Registry.select(listOf("copilot/add-copilot-seats-for-users.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-copilot-seats-for-users.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForUsersResponse.Http403Json(
          json = CopilotCodecs.copilotAddCopilotSeatsForUsersResponseCodecAlternative2Registry.select(listOf("copilot/add-copilot-seats-for-users.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-copilot-seats-for-users.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForUsersResponse.Http404Json(
          json = CopilotCodecs.copilotAddCopilotSeatsForUsersResponseCodecAlternative3Registry.select(listOf("copilot/add-copilot-seats-for-users.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-copilot-seats-for-users.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForUsersResponse.Http422NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-copilot-seats-for-users.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotAddCopilotSeatsForUsersResponse.Http500Json(
          json = CopilotCodecs.copilotAddCopilotSeatsForUsersResponseCodecAlternative5Registry.select(listOf("copilot/add-copilot-seats-for-users.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotAddCopilotSeatsForUsersResponse = CopilotAddCopilotSeatsForUsersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/add-organizations-to-enterprise-coding-agent-policy` may
   * expose through its typed API exception.
   */
  public sealed interface CopilotAddOrganizationsToEnterpriseCodingAgentPolicyError

  /**
   * Typed response alternatives for `copilot/add-organizations-to-enterprise-coding-agent-policy`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse,
        CopilotAddOrganizationsToEnterpriseCodingAgentPolicyError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse,
        CopilotAddOrganizationsToEnterpriseCodingAgentPolicyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse
  }

  /**
   * Raised by `copilot/add-organizations-to-enterprise-coding-agent-policy` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotAddOrganizationsToEnterpriseCodingAgentPolicyApiException(
    public val error: CopilotAddOrganizationsToEnterpriseCodingAgentPolicyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/add-organizations-to-enterprise-coding-agent-policy")

  private object CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseDecoder : SdkResponseAlternativeDecoder<CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse> = when {
      alternative.id == "copilot/add-organizations-to-enterprise-coding-agent-policy.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-organizations-to-enterprise-coding-agent-policy.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.Http400Json(
          json = CopilotCodecs.copilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseCodecAlternative1Registry.select(listOf("copilot/add-organizations-to-enterprise-coding-agent-policy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/add-organizations-to-enterprise-coding-agent-policy.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.Http400ScimJson(
          json = CopilotCodecs.copilotAddOrganizationsToEnterpriseCodingAgentPolicyResponseCodecAlternative2Registry.select(listOf("copilot/add-organizations-to-enterprise-coding-agent-policy.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
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
    ): CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse = CopilotAddOrganizationsToEnterpriseCodingAgentPolicyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/cancel-copilot-seat-assignment-for-teams` may expose
   * through its typed API exception.
   */
  public sealed interface CopilotCancelCopilotSeatAssignmentForTeamsError

  /**
   * Typed response alternatives for `copilot/cancel-copilot-seat-assignment-for-teams`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CopilotCancelCopilotSeatAssignmentForTeamsResponse {
    public class SuccessJson(
      public val json: InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForTeamsResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForTeamsResponse,
        CopilotCancelCopilotSeatAssignmentForTeamsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForTeamsResponse,
        CopilotCancelCopilotSeatAssignmentForTeamsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForTeamsResponse,
        CopilotCancelCopilotSeatAssignmentForTeamsError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForTeamsResponse,
        CopilotCancelCopilotSeatAssignmentForTeamsError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForTeamsResponse,
        CopilotCancelCopilotSeatAssignmentForTeamsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForTeamsResponse
  }

  /**
   * Raised by `copilot/cancel-copilot-seat-assignment-for-teams` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotCancelCopilotSeatAssignmentForTeamsApiException(
    public val error: CopilotCancelCopilotSeatAssignmentForTeamsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/cancel-copilot-seat-assignment-for-teams")

  private object CopilotCancelCopilotSeatAssignmentForTeamsResponseDecoder : SdkResponseAlternativeDecoder<CopilotCancelCopilotSeatAssignmentForTeamsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCancelCopilotSeatAssignmentForTeamsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCancelCopilotSeatAssignmentForTeamsResponse> = when {
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForTeamsResponse.SuccessJson(
          json = CopilotCodecs.copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative0Registry.select(listOf("copilot/cancel-copilot-seat-assignment-for-teams.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http401Json(
          json = CopilotCodecs.copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative1Registry.select(listOf("copilot/cancel-copilot-seat-assignment-for-teams.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http403Json(
          json = CopilotCodecs.copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative2Registry.select(listOf("copilot/cancel-copilot-seat-assignment-for-teams.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http404Json(
          json = CopilotCodecs.copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative3Registry.select(listOf("copilot/cancel-copilot-seat-assignment-for-teams.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http422NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForTeamsResponse.Http500Json(
          json = CopilotCodecs.copilotCancelCopilotSeatAssignmentForTeamsResponseCodecAlternative5Registry.select(listOf("copilot/cancel-copilot-seat-assignment-for-teams.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCancelCopilotSeatAssignmentForTeamsResponse = CopilotCancelCopilotSeatAssignmentForTeamsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/cancel-copilot-seat-assignment-for-users` may expose
   * through its typed API exception.
   */
  public sealed interface CopilotCancelCopilotSeatAssignmentForUsersError

  /**
   * Typed response alternatives for `copilot/cancel-copilot-seat-assignment-for-users`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CopilotCancelCopilotSeatAssignmentForUsersResponse {
    public class SuccessJson(
      public val json: InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForUsersResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForUsersResponse,
        CopilotCancelCopilotSeatAssignmentForUsersError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForUsersResponse,
        CopilotCancelCopilotSeatAssignmentForUsersError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForUsersResponse,
        CopilotCancelCopilotSeatAssignmentForUsersError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForUsersResponse,
        CopilotCancelCopilotSeatAssignmentForUsersError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForUsersResponse,
        CopilotCancelCopilotSeatAssignmentForUsersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCancelCopilotSeatAssignmentForUsersResponse
  }

  /**
   * Raised by `copilot/cancel-copilot-seat-assignment-for-users` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotCancelCopilotSeatAssignmentForUsersApiException(
    public val error: CopilotCancelCopilotSeatAssignmentForUsersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/cancel-copilot-seat-assignment-for-users")

  private object CopilotCancelCopilotSeatAssignmentForUsersResponseDecoder : SdkResponseAlternativeDecoder<CopilotCancelCopilotSeatAssignmentForUsersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCancelCopilotSeatAssignmentForUsersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCancelCopilotSeatAssignmentForUsersResponse> = when {
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-users.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForUsersResponse.SuccessJson(
          json = CopilotCodecs.copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative0Registry.select(listOf("copilot/cancel-copilot-seat-assignment-for-users.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-users.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForUsersResponse.Http401Json(
          json = CopilotCodecs.copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative1Registry.select(listOf("copilot/cancel-copilot-seat-assignment-for-users.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-users.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForUsersResponse.Http403Json(
          json = CopilotCodecs.copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative2Registry.select(listOf("copilot/cancel-copilot-seat-assignment-for-users.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-users.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForUsersResponse.Http404Json(
          json = CopilotCodecs.copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative3Registry.select(listOf("copilot/cancel-copilot-seat-assignment-for-users.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-users.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForUsersResponse.Http422NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/cancel-copilot-seat-assignment-for-users.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotCancelCopilotSeatAssignmentForUsersResponse.Http500Json(
          json = CopilotCodecs.copilotCancelCopilotSeatAssignmentForUsersResponseCodecAlternative5Registry.select(listOf("copilot/cancel-copilot-seat-assignment-for-users.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCancelCopilotSeatAssignmentForUsersResponse = CopilotCancelCopilotSeatAssignmentForUsersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/copilot-content-exclusion-for-organization` may expose
   * through its typed API exception.
   */
  public sealed interface CopilotCopilotContentExclusionForOrganizationError

  /**
   * Typed response alternatives for `copilot/copilot-content-exclusion-for-organization`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CopilotCopilotContentExclusionForOrganizationResponse {
    public class SuccessJson(
      public val json: Map<String, List<String>>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotContentExclusionForOrganizationResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotContentExclusionForOrganizationResponse,
        CopilotCopilotContentExclusionForOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotContentExclusionForOrganizationResponse,
        CopilotCopilotContentExclusionForOrganizationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotContentExclusionForOrganizationResponse,
        CopilotCopilotContentExclusionForOrganizationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotContentExclusionForOrganizationResponse,
        CopilotCopilotContentExclusionForOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotContentExclusionForOrganizationResponse
  }

  /**
   * Raised by `copilot/copilot-content-exclusion-for-organization` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotCopilotContentExclusionForOrganizationApiException(
    public val error: CopilotCopilotContentExclusionForOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/copilot-content-exclusion-for-organization")

  private object CopilotCopilotContentExclusionForOrganizationResponseDecoder : SdkResponseAlternativeDecoder<CopilotCopilotContentExclusionForOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCopilotContentExclusionForOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCopilotContentExclusionForOrganizationResponse> = when {
      alternative.id == "copilot/copilot-content-exclusion-for-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCopilotContentExclusionForOrganizationResponse.SuccessJson(
          json = CopilotCodecs.copilotCopilotContentExclusionForOrganizationResponseCodecAlternative0Registry.select(listOf("copilot/copilot-content-exclusion-for-organization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-content-exclusion-for-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCopilotContentExclusionForOrganizationResponse.Http401Json(
          json = CopilotCodecs.copilotCopilotContentExclusionForOrganizationResponseCodecAlternative1Registry.select(listOf("copilot/copilot-content-exclusion-for-organization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-content-exclusion-for-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCopilotContentExclusionForOrganizationResponse.Http403Json(
          json = CopilotCodecs.copilotCopilotContentExclusionForOrganizationResponseCodecAlternative2Registry.select(listOf("copilot/copilot-content-exclusion-for-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-content-exclusion-for-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCopilotContentExclusionForOrganizationResponse.Http404Json(
          json = CopilotCodecs.copilotCopilotContentExclusionForOrganizationResponseCodecAlternative3Registry.select(listOf("copilot/copilot-content-exclusion-for-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-content-exclusion-for-organization.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotCopilotContentExclusionForOrganizationResponse.Http500Json(
          json = CopilotCodecs.copilotCopilotContentExclusionForOrganizationResponseCodecAlternative4Registry.select(listOf("copilot/copilot-content-exclusion-for-organization.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCopilotContentExclusionForOrganizationResponse = CopilotCopilotContentExclusionForOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/copilot-enterprise-one-day-usage-metrics` may expose
   * through its typed API exception.
   */
  public sealed interface CopilotCopilotEnterpriseOneDayUsageMetricsError

  /**
   * Typed response alternatives for `copilot/copilot-enterprise-one-day-usage-metrics`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CopilotCopilotEnterpriseOneDayUsageMetricsResponse {
    public class SuccessJson(
      public val json: CopilotUsageMetrics1DayReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseOneDayUsageMetricsResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseOneDayUsageMetricsResponse,
        CopilotCopilotEnterpriseOneDayUsageMetricsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseOneDayUsageMetricsResponse,
        CopilotCopilotEnterpriseOneDayUsageMetricsError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseOneDayUsageMetricsResponse,
        CopilotCopilotEnterpriseOneDayUsageMetricsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseOneDayUsageMetricsResponse
  }

  /**
   * Raised by `copilot/copilot-enterprise-one-day-usage-metrics` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotCopilotEnterpriseOneDayUsageMetricsApiException(
    public val error: CopilotCopilotEnterpriseOneDayUsageMetricsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/copilot-enterprise-one-day-usage-metrics")

  private object CopilotCopilotEnterpriseOneDayUsageMetricsResponseDecoder : SdkResponseAlternativeDecoder<CopilotCopilotEnterpriseOneDayUsageMetricsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCopilotEnterpriseOneDayUsageMetricsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCopilotEnterpriseOneDayUsageMetricsResponse> = when {
      alternative.id == "copilot/copilot-enterprise-one-day-usage-metrics.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseOneDayUsageMetricsResponse.SuccessJson(
          json = CopilotCodecs.copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative0Registry.select(listOf("copilot/copilot-enterprise-one-day-usage-metrics.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-enterprise-one-day-usage-metrics.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Http403Json(
          json = CopilotCodecs.copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative1Registry.select(listOf("copilot/copilot-enterprise-one-day-usage-metrics.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-enterprise-one-day-usage-metrics.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Http404Json(
          json = CopilotCodecs.copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative2Registry.select(listOf("copilot/copilot-enterprise-one-day-usage-metrics.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-enterprise-one-day-usage-metrics.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Http500Json(
          json = CopilotCodecs.copilotCopilotEnterpriseOneDayUsageMetricsResponseCodecAlternative3Registry.select(listOf("copilot/copilot-enterprise-one-day-usage-metrics.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCopilotEnterpriseOneDayUsageMetricsResponse = CopilotCopilotEnterpriseOneDayUsageMetricsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/copilot-enterprise-usage-metrics` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotCopilotEnterpriseUsageMetricsError

  /**
   * Typed response alternatives for `copilot/copilot-enterprise-usage-metrics`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotCopilotEnterpriseUsageMetricsResponse {
    public class SuccessJson(
      public val json: CopilotUsageMetrics28DayReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseUsageMetricsResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseUsageMetricsResponse,
        CopilotCopilotEnterpriseUsageMetricsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseUsageMetricsResponse,
        CopilotCopilotEnterpriseUsageMetricsError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseUsageMetricsResponse,
        CopilotCopilotEnterpriseUsageMetricsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseUsageMetricsResponse
  }

  /**
   * Raised by `copilot/copilot-enterprise-usage-metrics` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotCopilotEnterpriseUsageMetricsApiException(
    public val error: CopilotCopilotEnterpriseUsageMetricsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/copilot-enterprise-usage-metrics")

  private object CopilotCopilotEnterpriseUsageMetricsResponseDecoder : SdkResponseAlternativeDecoder<CopilotCopilotEnterpriseUsageMetricsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCopilotEnterpriseUsageMetricsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCopilotEnterpriseUsageMetricsResponse> = when {
      alternative.id == "copilot/copilot-enterprise-usage-metrics.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseUsageMetricsResponse.SuccessJson(
          json = CopilotCodecs.copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative0Registry.select(listOf("copilot/copilot-enterprise-usage-metrics.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-enterprise-usage-metrics.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseUsageMetricsResponse.Http403Json(
          json = CopilotCodecs.copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative1Registry.select(listOf("copilot/copilot-enterprise-usage-metrics.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-enterprise-usage-metrics.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseUsageMetricsResponse.Http404Json(
          json = CopilotCodecs.copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative2Registry.select(listOf("copilot/copilot-enterprise-usage-metrics.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-enterprise-usage-metrics.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseUsageMetricsResponse.Http500Json(
          json = CopilotCodecs.copilotCopilotEnterpriseUsageMetricsResponseCodecAlternative3Registry.select(listOf("copilot/copilot-enterprise-usage-metrics.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCopilotEnterpriseUsageMetricsResponse = CopilotCopilotEnterpriseUsageMetricsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/copilot-enterprise-user-teams-one-day-report` may expose
   * through its typed API exception.
   */
  public sealed interface CopilotCopilotEnterpriseUserTeamsOneDayReportError

  /**
   * Typed response alternatives for `copilot/copilot-enterprise-user-teams-one-day-report`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface CopilotCopilotEnterpriseUserTeamsOneDayReportResponse {
    public class SuccessJson(
      public val json: CopilotUsageMetrics1DayReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseUserTeamsOneDayReportResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseUserTeamsOneDayReportResponse,
        CopilotCopilotEnterpriseUserTeamsOneDayReportError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseUserTeamsOneDayReportResponse,
        CopilotCopilotEnterpriseUserTeamsOneDayReportError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseUserTeamsOneDayReportResponse,
        CopilotCopilotEnterpriseUserTeamsOneDayReportError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotEnterpriseUserTeamsOneDayReportResponse
  }

  /**
   * Raised by `copilot/copilot-enterprise-user-teams-one-day-report` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotCopilotEnterpriseUserTeamsOneDayReportApiException(
    public val error: CopilotCopilotEnterpriseUserTeamsOneDayReportError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/copilot-enterprise-user-teams-one-day-report")

  private object CopilotCopilotEnterpriseUserTeamsOneDayReportResponseDecoder : SdkResponseAlternativeDecoder<CopilotCopilotEnterpriseUserTeamsOneDayReportResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCopilotEnterpriseUserTeamsOneDayReportResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCopilotEnterpriseUserTeamsOneDayReportResponse> = when {
      alternative.id == "copilot/copilot-enterprise-user-teams-one-day-report.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.SuccessJson(
          json = CopilotCodecs.copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative0Registry.select(listOf("copilot/copilot-enterprise-user-teams-one-day-report.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-enterprise-user-teams-one-day-report.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Http403Json(
          json = CopilotCodecs.copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative1Registry.select(listOf("copilot/copilot-enterprise-user-teams-one-day-report.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-enterprise-user-teams-one-day-report.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Http404Json(
          json = CopilotCodecs.copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative2Registry.select(listOf("copilot/copilot-enterprise-user-teams-one-day-report.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-enterprise-user-teams-one-day-report.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Http500Json(
          json = CopilotCodecs.copilotCopilotEnterpriseUserTeamsOneDayReportResponseCodecAlternative3Registry.select(listOf("copilot/copilot-enterprise-user-teams-one-day-report.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCopilotEnterpriseUserTeamsOneDayReportResponse = CopilotCopilotEnterpriseUserTeamsOneDayReportResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `copilot/copilot-organization-one-day-usage-metrics`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CopilotCopilotOrganizationOneDayUsageMetricsResponse {
    public class SuccessJson(
      public val json: CopilotUsageMetrics1DayReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationOneDayUsageMetricsResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationOneDayUsageMetricsResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationOneDayUsageMetricsResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationOneDayUsageMetricsResponse

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationOneDayUsageMetricsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationOneDayUsageMetricsResponse
  }

  private object CopilotCopilotOrganizationOneDayUsageMetricsResponseDecoder : SdkResponseAlternativeDecoder<CopilotCopilotOrganizationOneDayUsageMetricsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCopilotOrganizationOneDayUsageMetricsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCopilotOrganizationOneDayUsageMetricsResponse> = when {
      alternative.id == "copilot/copilot-organization-one-day-usage-metrics.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationOneDayUsageMetricsResponse.SuccessJson(
          json = CopilotCodecs.copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative0Registry.select(listOf("copilot/copilot-organization-one-day-usage-metrics.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-one-day-usage-metrics.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationOneDayUsageMetricsResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-one-day-usage-metrics.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationOneDayUsageMetricsResponse.Http403Json(
          json = CopilotCodecs.copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative2Registry.select(listOf("copilot/copilot-organization-one-day-usage-metrics.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-one-day-usage-metrics.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationOneDayUsageMetricsResponse.Http404Json(
          json = CopilotCodecs.copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative3Registry.select(listOf("copilot/copilot-organization-one-day-usage-metrics.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-one-day-usage-metrics.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationOneDayUsageMetricsResponse.Http500Json(
          json = CopilotCodecs.copilotCopilotOrganizationOneDayUsageMetricsResponseCodecAlternative4Registry.select(listOf("copilot/copilot-organization-one-day-usage-metrics.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCopilotOrganizationOneDayUsageMetricsResponse = CopilotCopilotOrganizationOneDayUsageMetricsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/copilot-organization-usage-metrics` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotCopilotOrganizationUsageMetricsError

  /**
   * Typed response alternatives for `copilot/copilot-organization-usage-metrics`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotCopilotOrganizationUsageMetricsResponse {
    public class SuccessJson(
      public val json: CopilotUsageMetrics28DayReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsageMetricsResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsageMetricsResponse,
        CopilotCopilotOrganizationUsageMetricsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsageMetricsResponse,
        CopilotCopilotOrganizationUsageMetricsError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsageMetricsResponse,
        CopilotCopilotOrganizationUsageMetricsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsageMetricsResponse
  }

  /**
   * Raised by `copilot/copilot-organization-usage-metrics` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotCopilotOrganizationUsageMetricsApiException(
    public val error: CopilotCopilotOrganizationUsageMetricsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/copilot-organization-usage-metrics")

  private object CopilotCopilotOrganizationUsageMetricsResponseDecoder : SdkResponseAlternativeDecoder<CopilotCopilotOrganizationUsageMetricsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCopilotOrganizationUsageMetricsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCopilotOrganizationUsageMetricsResponse> = when {
      alternative.id == "copilot/copilot-organization-usage-metrics.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsageMetricsResponse.SuccessJson(
          json = CopilotCodecs.copilotCopilotOrganizationUsageMetricsResponseCodecAlternative0Registry.select(listOf("copilot/copilot-organization-usage-metrics.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-usage-metrics.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsageMetricsResponse.Http403Json(
          json = CopilotCodecs.copilotCopilotOrganizationUsageMetricsResponseCodecAlternative1Registry.select(listOf("copilot/copilot-organization-usage-metrics.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-usage-metrics.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsageMetricsResponse.Http404Json(
          json = CopilotCodecs.copilotCopilotOrganizationUsageMetricsResponseCodecAlternative2Registry.select(listOf("copilot/copilot-organization-usage-metrics.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-usage-metrics.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsageMetricsResponse.Http500Json(
          json = CopilotCodecs.copilotCopilotOrganizationUsageMetricsResponseCodecAlternative3Registry.select(listOf("copilot/copilot-organization-usage-metrics.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCopilotOrganizationUsageMetricsResponse = CopilotCopilotOrganizationUsageMetricsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `copilot/copilot-organization-user-teams-one-day-report`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface CopilotCopilotOrganizationUserTeamsOneDayReportResponse {
    public class SuccessJson(
      public val json: CopilotUsageMetrics1DayReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUserTeamsOneDayReportResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUserTeamsOneDayReportResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUserTeamsOneDayReportResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUserTeamsOneDayReportResponse

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUserTeamsOneDayReportResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUserTeamsOneDayReportResponse
  }

  private object CopilotCopilotOrganizationUserTeamsOneDayReportResponseDecoder : SdkResponseAlternativeDecoder<CopilotCopilotOrganizationUserTeamsOneDayReportResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCopilotOrganizationUserTeamsOneDayReportResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCopilotOrganizationUserTeamsOneDayReportResponse> = when {
      alternative.id == "copilot/copilot-organization-user-teams-one-day-report.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUserTeamsOneDayReportResponse.SuccessJson(
          json = CopilotCodecs.copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative0Registry.select(listOf("copilot/copilot-organization-user-teams-one-day-report.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-user-teams-one-day-report.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUserTeamsOneDayReportResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-user-teams-one-day-report.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUserTeamsOneDayReportResponse.Http403Json(
          json = CopilotCodecs.copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative2Registry.select(listOf("copilot/copilot-organization-user-teams-one-day-report.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-user-teams-one-day-report.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUserTeamsOneDayReportResponse.Http404Json(
          json = CopilotCodecs.copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative3Registry.select(listOf("copilot/copilot-organization-user-teams-one-day-report.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-user-teams-one-day-report.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUserTeamsOneDayReportResponse.Http500Json(
          json = CopilotCodecs.copilotCopilotOrganizationUserTeamsOneDayReportResponseCodecAlternative4Registry.select(listOf("copilot/copilot-organization-user-teams-one-day-report.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCopilotOrganizationUserTeamsOneDayReportResponse = CopilotCopilotOrganizationUserTeamsOneDayReportResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `copilot/copilot-organization-users-one-day-usage-metrics`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse {
    public class SuccessJson(
      public val json: CopilotUsageMetrics1DayReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse
  }

  private object CopilotCopilotOrganizationUsersOneDayUsageMetricsResponseDecoder : SdkResponseAlternativeDecoder<CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse> = when {
      alternative.id == "copilot/copilot-organization-users-one-day-usage-metrics.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse.SuccessJson(
          json = CopilotCodecs.copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative0Registry.select(listOf("copilot/copilot-organization-users-one-day-usage-metrics.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-users-one-day-usage-metrics.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-users-one-day-usage-metrics.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse.Http403Json(
          json = CopilotCodecs.copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative2Registry.select(listOf("copilot/copilot-organization-users-one-day-usage-metrics.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-users-one-day-usage-metrics.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse.Http404Json(
          json = CopilotCodecs.copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative3Registry.select(listOf("copilot/copilot-organization-users-one-day-usage-metrics.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-users-one-day-usage-metrics.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse.Http500Json(
          json = CopilotCodecs.copilotCopilotOrganizationUsersOneDayUsageMetricsResponseCodecAlternative4Registry.select(listOf("copilot/copilot-organization-users-one-day-usage-metrics.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse = CopilotCopilotOrganizationUsersOneDayUsageMetricsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/copilot-organization-users-usage-metrics` may expose
   * through its typed API exception.
   */
  public sealed interface CopilotCopilotOrganizationUsersUsageMetricsError

  /**
   * Typed response alternatives for `copilot/copilot-organization-users-usage-metrics`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface CopilotCopilotOrganizationUsersUsageMetricsResponse {
    public class SuccessJson(
      public val json: CopilotUsageMetrics28DayReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsersUsageMetricsResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsersUsageMetricsResponse,
        CopilotCopilotOrganizationUsersUsageMetricsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsersUsageMetricsResponse,
        CopilotCopilotOrganizationUsersUsageMetricsError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsersUsageMetricsResponse,
        CopilotCopilotOrganizationUsersUsageMetricsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotOrganizationUsersUsageMetricsResponse
  }

  /**
   * Raised by `copilot/copilot-organization-users-usage-metrics` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotCopilotOrganizationUsersUsageMetricsApiException(
    public val error: CopilotCopilotOrganizationUsersUsageMetricsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/copilot-organization-users-usage-metrics")

  private object CopilotCopilotOrganizationUsersUsageMetricsResponseDecoder : SdkResponseAlternativeDecoder<CopilotCopilotOrganizationUsersUsageMetricsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCopilotOrganizationUsersUsageMetricsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCopilotOrganizationUsersUsageMetricsResponse> = when {
      alternative.id == "copilot/copilot-organization-users-usage-metrics.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsersUsageMetricsResponse.SuccessJson(
          json = CopilotCodecs.copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative0Registry.select(listOf("copilot/copilot-organization-users-usage-metrics.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-users-usage-metrics.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsersUsageMetricsResponse.Http403Json(
          json = CopilotCodecs.copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative1Registry.select(listOf("copilot/copilot-organization-users-usage-metrics.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-users-usage-metrics.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsersUsageMetricsResponse.Http404Json(
          json = CopilotCodecs.copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative2Registry.select(listOf("copilot/copilot-organization-users-usage-metrics.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-organization-users-usage-metrics.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCopilotOrganizationUsersUsageMetricsResponse.Http500Json(
          json = CopilotCodecs.copilotCopilotOrganizationUsersUsageMetricsResponseCodecAlternative3Registry.select(listOf("copilot/copilot-organization-users-usage-metrics.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCopilotOrganizationUsersUsageMetricsResponse = CopilotCopilotOrganizationUsersUsageMetricsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/copilot-users-one-day-usage-metrics` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotCopilotUsersOneDayUsageMetricsError

  /**
   * Typed response alternatives for `copilot/copilot-users-one-day-usage-metrics`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotCopilotUsersOneDayUsageMetricsResponse {
    public class SuccessJson(
      public val json: CopilotUsageMetrics1DayReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotUsersOneDayUsageMetricsResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotUsersOneDayUsageMetricsResponse,
        CopilotCopilotUsersOneDayUsageMetricsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotUsersOneDayUsageMetricsResponse,
        CopilotCopilotUsersOneDayUsageMetricsError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotUsersOneDayUsageMetricsResponse,
        CopilotCopilotUsersOneDayUsageMetricsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotUsersOneDayUsageMetricsResponse
  }

  /**
   * Raised by `copilot/copilot-users-one-day-usage-metrics` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotCopilotUsersOneDayUsageMetricsApiException(
    public val error: CopilotCopilotUsersOneDayUsageMetricsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/copilot-users-one-day-usage-metrics")

  private object CopilotCopilotUsersOneDayUsageMetricsResponseDecoder : SdkResponseAlternativeDecoder<CopilotCopilotUsersOneDayUsageMetricsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCopilotUsersOneDayUsageMetricsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCopilotUsersOneDayUsageMetricsResponse> = when {
      alternative.id == "copilot/copilot-users-one-day-usage-metrics.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCopilotUsersOneDayUsageMetricsResponse.SuccessJson(
          json = CopilotCodecs.copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative0Registry.select(listOf("copilot/copilot-users-one-day-usage-metrics.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-users-one-day-usage-metrics.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCopilotUsersOneDayUsageMetricsResponse.Http403Json(
          json = CopilotCodecs.copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative1Registry.select(listOf("copilot/copilot-users-one-day-usage-metrics.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-users-one-day-usage-metrics.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCopilotUsersOneDayUsageMetricsResponse.Http404Json(
          json = CopilotCodecs.copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative2Registry.select(listOf("copilot/copilot-users-one-day-usage-metrics.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-users-one-day-usage-metrics.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCopilotUsersOneDayUsageMetricsResponse.Http500Json(
          json = CopilotCodecs.copilotCopilotUsersOneDayUsageMetricsResponseCodecAlternative3Registry.select(listOf("copilot/copilot-users-one-day-usage-metrics.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCopilotUsersOneDayUsageMetricsResponse = CopilotCopilotUsersOneDayUsageMetricsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/copilot-users-usage-metrics` may expose through its typed
   * API exception.
   */
  public sealed interface CopilotCopilotUsersUsageMetricsError

  /**
   * Typed response alternatives for `copilot/copilot-users-usage-metrics`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CopilotCopilotUsersUsageMetricsResponse {
    public class SuccessJson(
      public val json: CopilotUsageMetrics28DayReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotUsersUsageMetricsResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotUsersUsageMetricsResponse,
        CopilotCopilotUsersUsageMetricsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotUsersUsageMetricsResponse,
        CopilotCopilotUsersUsageMetricsError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotUsersUsageMetricsResponse,
        CopilotCopilotUsersUsageMetricsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotCopilotUsersUsageMetricsResponse
  }

  /**
   * Raised by `copilot/copilot-users-usage-metrics` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotCopilotUsersUsageMetricsApiException(
    public val error: CopilotCopilotUsersUsageMetricsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/copilot-users-usage-metrics")

  private object CopilotCopilotUsersUsageMetricsResponseDecoder : SdkResponseAlternativeDecoder<CopilotCopilotUsersUsageMetricsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotCopilotUsersUsageMetricsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotCopilotUsersUsageMetricsResponse> = when {
      alternative.id == "copilot/copilot-users-usage-metrics.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotCopilotUsersUsageMetricsResponse.SuccessJson(
          json = CopilotCodecs.copilotCopilotUsersUsageMetricsResponseCodecAlternative0Registry.select(listOf("copilot/copilot-users-usage-metrics.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-users-usage-metrics.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotCopilotUsersUsageMetricsResponse.Http403Json(
          json = CopilotCodecs.copilotCopilotUsersUsageMetricsResponseCodecAlternative1Registry.select(listOf("copilot/copilot-users-usage-metrics.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-users-usage-metrics.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotCopilotUsersUsageMetricsResponse.Http404Json(
          json = CopilotCodecs.copilotCopilotUsersUsageMetricsResponseCodecAlternative2Registry.select(listOf("copilot/copilot-users-usage-metrics.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/copilot-users-usage-metrics.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotCopilotUsersUsageMetricsResponse.Http500Json(
          json = CopilotCodecs.copilotCopilotUsersUsageMetricsResponseCodecAlternative3Registry.select(listOf("copilot/copilot-users-usage-metrics.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotCopilotUsersUsageMetricsResponse = CopilotCopilotUsersUsageMetricsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that
   * `copilot/disable-copilot-coding-agent-for-repository-in-organization` may expose through its typed API exception.
   */
  public sealed interface CopilotDisableCopilotCodingAgentForRepositoryInOrganizationError

  /**
   * Typed response alternatives for `copilot/disable-copilot-coding-agent-for-repository-in-organization`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse,
        CopilotDisableCopilotCodingAgentForRepositoryInOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse,
        CopilotDisableCopilotCodingAgentForRepositoryInOrganizationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse,
        CopilotDisableCopilotCodingAgentForRepositoryInOrganizationError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse,
        CopilotDisableCopilotCodingAgentForRepositoryInOrganizationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse,
        CopilotDisableCopilotCodingAgentForRepositoryInOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse
  }

  /**
   * Raised by `copilot/disable-copilot-coding-agent-for-repository-in-organization` after decoding a declared
   * non-success response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotDisableCopilotCodingAgentForRepositoryInOrganizationApiException(
    public val error: CopilotDisableCopilotCodingAgentForRepositoryInOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/disable-copilot-coding-agent-for-repository-in-organization")

  private object CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseDecoder : SdkResponseAlternativeDecoder<CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse> = when {
      alternative.id == "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http401Json(
          json = CopilotCodecs.copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative1Registry.select(listOf("copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http403Json(
          json = CopilotCodecs.copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative2Registry.select(listOf("copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http404Json(
          json = CopilotCodecs.copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative3Registry.select(listOf("copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http409Json(
          json = CopilotCodecs.copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative4Registry.select(listOf("copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Http500Json(
          json = CopilotCodecs.copilotDisableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative5Registry.select(listOf("copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse = CopilotDisableCopilotCodingAgentForRepositoryInOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/enable-copilot-coding-agent-for-repository-in-organization`
   * may expose through its typed API exception.
   */
  public sealed interface CopilotEnableCopilotCodingAgentForRepositoryInOrganizationError

  /**
   * Typed response alternatives for `copilot/enable-copilot-coding-agent-for-repository-in-organization`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse,
        CopilotEnableCopilotCodingAgentForRepositoryInOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse,
        CopilotEnableCopilotCodingAgentForRepositoryInOrganizationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse,
        CopilotEnableCopilotCodingAgentForRepositoryInOrganizationError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse,
        CopilotEnableCopilotCodingAgentForRepositoryInOrganizationError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse,
        CopilotEnableCopilotCodingAgentForRepositoryInOrganizationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse,
        CopilotEnableCopilotCodingAgentForRepositoryInOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse
  }

  /**
   * Raised by `copilot/enable-copilot-coding-agent-for-repository-in-organization` after decoding a declared
   * non-success response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotEnableCopilotCodingAgentForRepositoryInOrganizationApiException(
    public val error: CopilotEnableCopilotCodingAgentForRepositoryInOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/enable-copilot-coding-agent-for-repository-in-organization")

  private object CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseDecoder : SdkResponseAlternativeDecoder<CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse> = when {
      alternative.id == "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http401Json(
          json = CopilotCodecs.copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative1Registry.select(listOf("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http403Json(
          json = CopilotCodecs.copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative2Registry.select(listOf("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http404Json(
          json = CopilotCodecs.copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative3Registry.select(listOf("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http409Json(
          json = CopilotCodecs.copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative4Registry.select(listOf("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http422Json(
          json = CopilotCodecs.copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative5Registry.select(listOf("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative6" -> SdkResponseDecodeResult(
        value = CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Http500Json(
          json = CopilotCodecs.copilotEnableCopilotCodingAgentForRepositoryInOrganizationResponseCodecAlternative6Registry.select(listOf("copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse = CopilotEnableCopilotCodingAgentForRepositoryInOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/get-copilot-cloud-agent-configuration` may expose through
   * its typed API exception.
   */
  public sealed interface CopilotGetCopilotCloudAgentConfigurationError

  /**
   * Typed response alternatives for `copilot/get-copilot-cloud-agent-configuration`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotGetCopilotCloudAgentConfigurationResponse {
    public class SuccessJson(
      public val json: InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCloudAgentConfigurationResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCloudAgentConfigurationResponse,
        CopilotGetCopilotCloudAgentConfigurationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCloudAgentConfigurationResponse,
        CopilotGetCopilotCloudAgentConfigurationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCloudAgentConfigurationResponse,
        CopilotGetCopilotCloudAgentConfigurationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCloudAgentConfigurationResponse,
        CopilotGetCopilotCloudAgentConfigurationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCloudAgentConfigurationResponse
  }

  /**
   * Raised by `copilot/get-copilot-cloud-agent-configuration` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotGetCopilotCloudAgentConfigurationApiException(
    public val error: CopilotGetCopilotCloudAgentConfigurationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/get-copilot-cloud-agent-configuration")

  private object CopilotGetCopilotCloudAgentConfigurationResponseDecoder : SdkResponseAlternativeDecoder<CopilotGetCopilotCloudAgentConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotGetCopilotCloudAgentConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotGetCopilotCloudAgentConfigurationResponse> = when {
      alternative.id == "copilot/get-copilot-cloud-agent-configuration.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotCloudAgentConfigurationResponse.SuccessJson(
          json = CopilotCodecs.copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative0Registry.select(listOf("copilot/get-copilot-cloud-agent-configuration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-cloud-agent-configuration.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotCloudAgentConfigurationResponse.Http401Json(
          json = CopilotCodecs.copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative1Registry.select(listOf("copilot/get-copilot-cloud-agent-configuration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-cloud-agent-configuration.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotCloudAgentConfigurationResponse.Http403Json(
          json = CopilotCodecs.copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative2Registry.select(listOf("copilot/get-copilot-cloud-agent-configuration.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-cloud-agent-configuration.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotCloudAgentConfigurationResponse.Http404Json(
          json = CopilotCodecs.copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative3Registry.select(listOf("copilot/get-copilot-cloud-agent-configuration.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-cloud-agent-configuration.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotCloudAgentConfigurationResponse.Http500Json(
          json = CopilotCodecs.copilotGetCopilotCloudAgentConfigurationResponseCodecAlternative4Registry.select(listOf("copilot/get-copilot-cloud-agent-configuration.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotGetCopilotCloudAgentConfigurationResponse = CopilotGetCopilotCloudAgentConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/get-copilot-coding-agent-permissions-organization` may
   * expose through its typed API exception.
   */
  public sealed interface CopilotGetCopilotCodingAgentPermissionsOrganizationError

  /**
   * Typed response alternatives for `copilot/get-copilot-coding-agent-permissions-organization`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CopilotGetCopilotCodingAgentPermissionsOrganizationResponse {
    public class SuccessJson(
      public val json: InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCodingAgentPermissionsOrganizationResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCodingAgentPermissionsOrganizationResponse,
        CopilotGetCopilotCodingAgentPermissionsOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCodingAgentPermissionsOrganizationResponse,
        CopilotGetCopilotCodingAgentPermissionsOrganizationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCodingAgentPermissionsOrganizationResponse,
        CopilotGetCopilotCodingAgentPermissionsOrganizationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCodingAgentPermissionsOrganizationResponse,
        CopilotGetCopilotCodingAgentPermissionsOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotCodingAgentPermissionsOrganizationResponse
  }

  /**
   * Raised by `copilot/get-copilot-coding-agent-permissions-organization` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotGetCopilotCodingAgentPermissionsOrganizationApiException(
    public val error: CopilotGetCopilotCodingAgentPermissionsOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/get-copilot-coding-agent-permissions-organization")

  private object CopilotGetCopilotCodingAgentPermissionsOrganizationResponseDecoder : SdkResponseAlternativeDecoder<CopilotGetCopilotCodingAgentPermissionsOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotGetCopilotCodingAgentPermissionsOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotGetCopilotCodingAgentPermissionsOrganizationResponse> = when {
      alternative.id == "copilot/get-copilot-coding-agent-permissions-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.SuccessJson(
          json = CopilotCodecs.copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative0Registry.select(listOf("copilot/get-copilot-coding-agent-permissions-organization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-coding-agent-permissions-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http401Json(
          json = CopilotCodecs.copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative1Registry.select(listOf("copilot/get-copilot-coding-agent-permissions-organization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-coding-agent-permissions-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http403Json(
          json = CopilotCodecs.copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative2Registry.select(listOf("copilot/get-copilot-coding-agent-permissions-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-coding-agent-permissions-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http404Json(
          json = CopilotCodecs.copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative3Registry.select(listOf("copilot/get-copilot-coding-agent-permissions-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-coding-agent-permissions-organization.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Http500Json(
          json = CopilotCodecs.copilotGetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative4Registry.select(listOf("copilot/get-copilot-coding-agent-permissions-organization.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotGetCopilotCodingAgentPermissionsOrganizationResponse = CopilotGetCopilotCodingAgentPermissionsOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/get-copilot-organization-details` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotGetCopilotOrganizationDetailsError

  /**
   * Typed response alternatives for `copilot/get-copilot-organization-details`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotGetCopilotOrganizationDetailsResponse {
    public class SuccessJson(
      public val json: CopilotOrganizationDetails,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotOrganizationDetailsResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotOrganizationDetailsResponse,
        CopilotGetCopilotOrganizationDetailsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotOrganizationDetailsResponse,
        CopilotGetCopilotOrganizationDetailsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotOrganizationDetailsResponse,
        CopilotGetCopilotOrganizationDetailsError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotOrganizationDetailsResponse,
        CopilotGetCopilotOrganizationDetailsError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotOrganizationDetailsResponse,
        CopilotGetCopilotOrganizationDetailsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotOrganizationDetailsResponse
  }

  /**
   * Raised by `copilot/get-copilot-organization-details` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotGetCopilotOrganizationDetailsApiException(
    public val error: CopilotGetCopilotOrganizationDetailsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/get-copilot-organization-details")

  private object CopilotGetCopilotOrganizationDetailsResponseDecoder : SdkResponseAlternativeDecoder<CopilotGetCopilotOrganizationDetailsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotGetCopilotOrganizationDetailsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotGetCopilotOrganizationDetailsResponse> = when {
      alternative.id == "copilot/get-copilot-organization-details.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotOrganizationDetailsResponse.SuccessJson(
          json = CopilotCodecs.copilotGetCopilotOrganizationDetailsResponseCodecAlternative0Registry.select(listOf("copilot/get-copilot-organization-details.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-organization-details.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotOrganizationDetailsResponse.Http401Json(
          json = CopilotCodecs.copilotGetCopilotOrganizationDetailsResponseCodecAlternative1Registry.select(listOf("copilot/get-copilot-organization-details.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-organization-details.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotOrganizationDetailsResponse.Http403Json(
          json = CopilotCodecs.copilotGetCopilotOrganizationDetailsResponseCodecAlternative2Registry.select(listOf("copilot/get-copilot-organization-details.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-organization-details.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotOrganizationDetailsResponse.Http404Json(
          json = CopilotCodecs.copilotGetCopilotOrganizationDetailsResponseCodecAlternative3Registry.select(listOf("copilot/get-copilot-organization-details.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-organization-details.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotOrganizationDetailsResponse.Http422NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-organization-details.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotOrganizationDetailsResponse.Http500Json(
          json = CopilotCodecs.copilotGetCopilotOrganizationDetailsResponseCodecAlternative5Registry.select(listOf("copilot/get-copilot-organization-details.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotGetCopilotOrganizationDetailsResponse = CopilotGetCopilotOrganizationDetailsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/get-copilot-seat-details-for-user` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotGetCopilotSeatDetailsForUserError

  /**
   * Typed response alternatives for `copilot/get-copilot-seat-details-for-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotGetCopilotSeatDetailsForUserResponse {
    public class SuccessJson(
      public val json: CopilotSeatDetails,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotSeatDetailsForUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotSeatDetailsForUserResponse,
        CopilotGetCopilotSeatDetailsForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotSeatDetailsForUserResponse,
        CopilotGetCopilotSeatDetailsForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotSeatDetailsForUserResponse,
        CopilotGetCopilotSeatDetailsForUserError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotSeatDetailsForUserResponse,
        CopilotGetCopilotSeatDetailsForUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotSeatDetailsForUserResponse,
        CopilotGetCopilotSeatDetailsForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotGetCopilotSeatDetailsForUserResponse
  }

  /**
   * Raised by `copilot/get-copilot-seat-details-for-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotGetCopilotSeatDetailsForUserApiException(
    public val error: CopilotGetCopilotSeatDetailsForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/get-copilot-seat-details-for-user")

  private object CopilotGetCopilotSeatDetailsForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotGetCopilotSeatDetailsForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotGetCopilotSeatDetailsForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotGetCopilotSeatDetailsForUserResponse> = when {
      alternative.id == "copilot/get-copilot-seat-details-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotSeatDetailsForUserResponse.SuccessJson(
          json = CopilotCodecs.copilotGetCopilotSeatDetailsForUserResponseCodecAlternative0Registry.select(listOf("copilot/get-copilot-seat-details-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-seat-details-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotSeatDetailsForUserResponse.Http401Json(
          json = CopilotCodecs.copilotGetCopilotSeatDetailsForUserResponseCodecAlternative1Registry.select(listOf("copilot/get-copilot-seat-details-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-seat-details-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotSeatDetailsForUserResponse.Http403Json(
          json = CopilotCodecs.copilotGetCopilotSeatDetailsForUserResponseCodecAlternative2Registry.select(listOf("copilot/get-copilot-seat-details-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-seat-details-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotSeatDetailsForUserResponse.Http404Json(
          json = CopilotCodecs.copilotGetCopilotSeatDetailsForUserResponseCodecAlternative3Registry.select(listOf("copilot/get-copilot-seat-details-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-seat-details-for-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotSeatDetailsForUserResponse.Http422NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/get-copilot-seat-details-for-user.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotGetCopilotSeatDetailsForUserResponse.Http500Json(
          json = CopilotCodecs.copilotGetCopilotSeatDetailsForUserResponseCodecAlternative5Registry.select(listOf("copilot/get-copilot-seat-details-for-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotGetCopilotSeatDetailsForUserResponse = CopilotGetCopilotSeatDetailsForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that
   * `copilot/list-copilot-coding-agent-selected-repositories-for-organization` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationError

  /**
   * Typed response alternatives for `copilot/list-copilot-coding-agent-selected-repositories-for-organization`.
   * Non-success alternatives are not converted into success values.
   */
  public sealed interface CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse {
    public class SuccessJson(
      public val json:
          InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse,
        CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse,
        CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse,
        CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse,
        CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse,
        CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse
  }

  /**
   * Raised by `copilot/list-copilot-coding-agent-selected-repositories-for-organization` after decoding a declared
   * non-success response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(
    public val error: CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/list-copilot-coding-agent-selected-repositories-for-organization")

  private object CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseDecoder : SdkResponseAlternativeDecoder<CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse> = when {
      alternative.id == "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.SuccessJson(
          json = CopilotCodecs.copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative0Registry.select(listOf("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http401Json(
          json = CopilotCodecs.copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative1Registry.select(listOf("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http403Json(
          json = CopilotCodecs.copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative2Registry.select(listOf("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http404Json(
          json = CopilotCodecs.copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative3Registry.select(listOf("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http409Json(
          json = CopilotCodecs.copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative4Registry.select(listOf("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http500Json(
          json = CopilotCodecs.copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative5Registry.select(listOf("copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse = CopilotListCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/list-copilot-seats` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotListCopilotSeatsError

  /**
   * Typed response alternatives for `copilot/list-copilot-seats`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CopilotListCopilotSeatsResponse {
    public class SuccessJson(
      public val json: InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotSeatsResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotSeatsResponse,
        CopilotListCopilotSeatsError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotSeatsResponse,
        CopilotListCopilotSeatsError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotSeatsResponse,
        CopilotListCopilotSeatsError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotSeatsResponse,
        CopilotListCopilotSeatsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotListCopilotSeatsResponse
  }

  /**
   * Raised by `copilot/list-copilot-seats` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CopilotListCopilotSeatsApiException(
    public val error: CopilotListCopilotSeatsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/list-copilot-seats")

  private object CopilotListCopilotSeatsResponseDecoder : SdkResponseAlternativeDecoder<CopilotListCopilotSeatsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotListCopilotSeatsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotListCopilotSeatsResponse> = when {
      alternative.id == "copilot/list-copilot-seats.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotListCopilotSeatsResponse.SuccessJson(
          json = CopilotCodecs.copilotListCopilotSeatsResponseCodecAlternative0Registry.select(listOf("copilot/list-copilot-seats.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/list-copilot-seats.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotListCopilotSeatsResponse.Http401Json(
          json = CopilotCodecs.copilotListCopilotSeatsResponseCodecAlternative1Registry.select(listOf("copilot/list-copilot-seats.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/list-copilot-seats.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotListCopilotSeatsResponse.Http403Json(
          json = CopilotCodecs.copilotListCopilotSeatsResponseCodecAlternative2Registry.select(listOf("copilot/list-copilot-seats.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/list-copilot-seats.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotListCopilotSeatsResponse.Http404Json(
          json = CopilotCodecs.copilotListCopilotSeatsResponseCodecAlternative3Registry.select(listOf("copilot/list-copilot-seats.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/list-copilot-seats.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotListCopilotSeatsResponse.Http500Json(
          json = CopilotCodecs.copilotListCopilotSeatsResponseCodecAlternative4Registry.select(listOf("copilot/list-copilot-seats.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotListCopilotSeatsResponse = CopilotListCopilotSeatsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/remove-organizations-from-enterprise-coding-agent-policy`
   * may expose through its typed API exception.
   */
  public sealed interface CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyError

  /**
   * Typed response alternatives for `copilot/remove-organizations-from-enterprise-coding-agent-policy`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse,
        CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse,
        CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse
  }

  /**
   * Raised by `copilot/remove-organizations-from-enterprise-coding-agent-policy` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyApiException(
    public val error: CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/remove-organizations-from-enterprise-coding-agent-policy")

  private object CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseDecoder : SdkResponseAlternativeDecoder<CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse> = when {
      alternative.id == "copilot/remove-organizations-from-enterprise-coding-agent-policy.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/remove-organizations-from-enterprise-coding-agent-policy.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.Http400Json(
          json = CopilotCodecs.copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseCodecAlternative1Registry.select(listOf("copilot/remove-organizations-from-enterprise-coding-agent-policy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/remove-organizations-from-enterprise-coding-agent-policy.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.Http400ScimJson(
          json = CopilotCodecs.copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponseCodecAlternative2Registry.select(listOf("copilot/remove-organizations-from-enterprise-coding-agent-policy.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
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
    ): CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse = CopilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/set-copilot-coding-agent-permissions-organization` may
   * expose through its typed API exception.
   */
  public sealed interface CopilotSetCopilotCodingAgentPermissionsOrganizationError

  /**
   * Typed response alternatives for `copilot/set-copilot-coding-agent-permissions-organization`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface CopilotSetCopilotCodingAgentPermissionsOrganizationResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentPermissionsOrganizationResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentPermissionsOrganizationResponse,
        CopilotSetCopilotCodingAgentPermissionsOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentPermissionsOrganizationResponse,
        CopilotSetCopilotCodingAgentPermissionsOrganizationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentPermissionsOrganizationResponse,
        CopilotSetCopilotCodingAgentPermissionsOrganizationError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentPermissionsOrganizationResponse,
        CopilotSetCopilotCodingAgentPermissionsOrganizationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentPermissionsOrganizationResponse,
        CopilotSetCopilotCodingAgentPermissionsOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentPermissionsOrganizationResponse
  }

  /**
   * Raised by `copilot/set-copilot-coding-agent-permissions-organization` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSetCopilotCodingAgentPermissionsOrganizationApiException(
    public val error: CopilotSetCopilotCodingAgentPermissionsOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/set-copilot-coding-agent-permissions-organization")

  private object CopilotSetCopilotCodingAgentPermissionsOrganizationResponseDecoder : SdkResponseAlternativeDecoder<CopilotSetCopilotCodingAgentPermissionsOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSetCopilotCodingAgentPermissionsOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSetCopilotCodingAgentPermissionsOrganizationResponse> = when {
      alternative.id == "copilot/set-copilot-coding-agent-permissions-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-coding-agent-permissions-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http401Json(
          json = CopilotCodecs.copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative1Registry.select(listOf("copilot/set-copilot-coding-agent-permissions-organization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-coding-agent-permissions-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http403Json(
          json = CopilotCodecs.copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative2Registry.select(listOf("copilot/set-copilot-coding-agent-permissions-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-coding-agent-permissions-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http404Json(
          json = CopilotCodecs.copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative3Registry.select(listOf("copilot/set-copilot-coding-agent-permissions-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-coding-agent-permissions-organization.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http422Json(
          json = CopilotCodecs.copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative4Registry.select(listOf("copilot/set-copilot-coding-agent-permissions-organization.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-coding-agent-permissions-organization.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Http500Json(
          json = CopilotCodecs.copilotSetCopilotCodingAgentPermissionsOrganizationResponseCodecAlternative5Registry.select(listOf("copilot/set-copilot-coding-agent-permissions-organization.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSetCopilotCodingAgentPermissionsOrganizationResponse = CopilotSetCopilotCodingAgentPermissionsOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that
   * `copilot/set-copilot-coding-agent-selected-repositories-for-organization` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationError

  /**
   * Typed response alternatives for `copilot/set-copilot-coding-agent-selected-repositories-for-organization`.
   * Non-success alternatives are not converted into success values.
   */
  public sealed interface CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse,
        CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse,
        CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse,
        CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationError

    public class Http409Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse,
        CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse,
        CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse,
        CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse
  }

  /**
   * Raised by `copilot/set-copilot-coding-agent-selected-repositories-for-organization` after decoding a declared
   * non-success response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationApiException(
    public val error: CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/set-copilot-coding-agent-selected-repositories-for-organization")

  private object CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseDecoder : SdkResponseAlternativeDecoder<CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse> = when {
      alternative.id == "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http401Json(
          json = CopilotCodecs.copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative1Registry.select(listOf("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http403Json(
          json = CopilotCodecs.copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative2Registry.select(listOf("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http404Json(
          json = CopilotCodecs.copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative3Registry.select(listOf("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http409Json(
          json = CopilotCodecs.copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative4Registry.select(listOf("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http422Json(
          json = CopilotCodecs.copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative5Registry.select(listOf("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative6" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Http500Json(
          json = CopilotCodecs.copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponseCodecAlternative6Registry.select(listOf("copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse = CopilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/set-copilot-content-exclusion-for-organization` may expose
   * through its typed API exception.
   */
  public sealed interface CopilotSetCopilotContentExclusionForOrganizationError

  /**
   * Typed response alternatives for `copilot/set-copilot-content-exclusion-for-organization`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface CopilotSetCopilotContentExclusionForOrganizationResponse {
    public class SuccessJson(
      public val json: InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotContentExclusionForOrganizationResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotContentExclusionForOrganizationResponse,
        CopilotSetCopilotContentExclusionForOrganizationError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotContentExclusionForOrganizationResponse,
        CopilotSetCopilotContentExclusionForOrganizationError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotContentExclusionForOrganizationResponse,
        CopilotSetCopilotContentExclusionForOrganizationError

    public class Http413Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotContentExclusionForOrganizationResponse,
        CopilotSetCopilotContentExclusionForOrganizationError

    public class Http422Json(
      public val json: ValidationErrorSimple,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotContentExclusionForOrganizationResponse,
        CopilotSetCopilotContentExclusionForOrganizationError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotContentExclusionForOrganizationResponse,
        CopilotSetCopilotContentExclusionForOrganizationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetCopilotContentExclusionForOrganizationResponse
  }

  /**
   * Raised by `copilot/set-copilot-content-exclusion-for-organization` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSetCopilotContentExclusionForOrganizationApiException(
    public val error: CopilotSetCopilotContentExclusionForOrganizationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/set-copilot-content-exclusion-for-organization")

  private object CopilotSetCopilotContentExclusionForOrganizationResponseDecoder : SdkResponseAlternativeDecoder<CopilotSetCopilotContentExclusionForOrganizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSetCopilotContentExclusionForOrganizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSetCopilotContentExclusionForOrganizationResponse> = when {
      alternative.id == "copilot/set-copilot-content-exclusion-for-organization.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotContentExclusionForOrganizationResponse.SuccessJson(
          json = CopilotCodecs.copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative0Registry.select(listOf("copilot/set-copilot-content-exclusion-for-organization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-content-exclusion-for-organization.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotContentExclusionForOrganizationResponse.Http401Json(
          json = CopilotCodecs.copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative1Registry.select(listOf("copilot/set-copilot-content-exclusion-for-organization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-content-exclusion-for-organization.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotContentExclusionForOrganizationResponse.Http403Json(
          json = CopilotCodecs.copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative2Registry.select(listOf("copilot/set-copilot-content-exclusion-for-organization.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-content-exclusion-for-organization.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotContentExclusionForOrganizationResponse.Http404Json(
          json = CopilotCodecs.copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative3Registry.select(listOf("copilot/set-copilot-content-exclusion-for-organization.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-content-exclusion-for-organization.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotContentExclusionForOrganizationResponse.Http413Json(
          json = CopilotCodecs.copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative4Registry.select(listOf("copilot/set-copilot-content-exclusion-for-organization.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-content-exclusion-for-organization.response.alternative5" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotContentExclusionForOrganizationResponse.Http422Json(
          json = CopilotCodecs.copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative5Registry.select(listOf("copilot/set-copilot-content-exclusion-for-organization.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-copilot-content-exclusion-for-organization.response.alternative6" -> SdkResponseDecodeResult(
        value = CopilotSetCopilotContentExclusionForOrganizationResponse.Http500Json(
          json = CopilotCodecs.copilotSetCopilotContentExclusionForOrganizationResponseCodecAlternative6Registry.select(listOf("copilot/set-copilot-content-exclusion-for-organization.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSetCopilotContentExclusionForOrganizationResponse = CopilotSetCopilotContentExclusionForOrganizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot/set-enterprise-coding-agent-policy` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSetEnterpriseCodingAgentPolicyError

  /**
   * Typed response alternatives for `copilot/set-enterprise-coding-agent-policy`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSetEnterpriseCodingAgentPolicyResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetEnterpriseCodingAgentPolicyResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetEnterpriseCodingAgentPolicyResponse,
        CopilotSetEnterpriseCodingAgentPolicyError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetEnterpriseCodingAgentPolicyResponse,
        CopilotSetEnterpriseCodingAgentPolicyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSetEnterpriseCodingAgentPolicyResponse
  }

  /**
   * Raised by `copilot/set-enterprise-coding-agent-policy` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSetEnterpriseCodingAgentPolicyApiException(
    public val error: CopilotSetEnterpriseCodingAgentPolicyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot/set-enterprise-coding-agent-policy")

  private object CopilotSetEnterpriseCodingAgentPolicyResponseDecoder : SdkResponseAlternativeDecoder<CopilotSetEnterpriseCodingAgentPolicyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSetEnterpriseCodingAgentPolicyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSetEnterpriseCodingAgentPolicyResponse> = when {
      alternative.id == "copilot/set-enterprise-coding-agent-policy.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSetEnterpriseCodingAgentPolicyResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-enterprise-coding-agent-policy.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSetEnterpriseCodingAgentPolicyResponse.Http400Json(
          json = CopilotCodecs.copilotSetEnterpriseCodingAgentPolicyResponseCodecAlternative1Registry.select(listOf("copilot/set-enterprise-coding-agent-policy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot/set-enterprise-coding-agent-policy.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSetEnterpriseCodingAgentPolicyResponse.Http400ScimJson(
          json = CopilotCodecs.copilotSetEnterpriseCodingAgentPolicyResponseCodecAlternative2Registry.select(listOf("copilot/set-enterprise-coding-agent-policy.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
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
    ): CopilotSetEnterpriseCodingAgentPolicyResponse = CopilotSetEnterpriseCodingAgentPolicyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val copilotAddCopilotSeatsForTeamsMetadata: OperationMetadata = OperationMetadata(
          operationId = "copilot/add-copilot-seats-for-teams",
          method = "POST",
          path = "/orgs/{org}/copilot/billing/selected_teams",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-teams.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-teams.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-teams.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-teams.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-teams.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-teams.response.alternative5",
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

    public val copilotAddCopilotSeatsForUsersMetadata: OperationMetadata = OperationMetadata(
          operationId = "copilot/add-copilot-seats-for-users",
          method = "POST",
          path = "/orgs/{org}/copilot/billing/selected_users",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-users.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-users.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-users.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-users.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-users.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-copilot-seats-for-users.response.alternative5",
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

    public val copilotAddOrganizationsToEnterpriseCodingAgentPolicyMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/add-organizations-to-enterprise-coding-agent-policy",
          method = "POST",
          path = "/enterprises/{enterprise}/copilot/policies/coding_agent/organizations",
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
              id = "copilot/add-organizations-to-enterprise-coding-agent-policy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-organizations-to-enterprise-coding-agent-policy.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/add-organizations-to-enterprise-coding-agent-policy.response.alternative2",
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

    public val copilotCancelCopilotSeatAssignmentForTeamsMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/cancel-copilot-seat-assignment-for-teams",
          method = "DELETE",
          path = "/orgs/{org}/copilot/billing/selected_teams",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-teams.response.alternative5",
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

    public val copilotCancelCopilotSeatAssignmentForUsersMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/cancel-copilot-seat-assignment-for-users",
          method = "DELETE",
          path = "/orgs/{org}/copilot/billing/selected_users",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-users.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-users.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-users.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-users.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-users.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/cancel-copilot-seat-assignment-for-users.response.alternative5",
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

    public val copilotCopilotContentExclusionForOrganizationMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/copilot-content-exclusion-for-organization",
          method = "GET",
          path = "/orgs/{org}/copilot/content_exclusion",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Map",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-content-exclusion-for-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-content-exclusion-for-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-content-exclusion-for-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-content-exclusion-for-organization.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-content-exclusion-for-organization.response.alternative4",
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

    public val copilotCopilotEnterpriseOneDayUsageMetricsMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/copilot-enterprise-one-day-usage-metrics",
          method = "GET",
          path = "/enterprises/{enterprise}/copilot/metrics/reports/enterprise-1-day",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotUsageMetrics1DayReport",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-one-day-usage-metrics.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-one-day-usage-metrics.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-one-day-usage-metrics.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-one-day-usage-metrics.response.alternative3",
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

    public val copilotCopilotEnterpriseUsageMetricsMetadata: OperationMetadata = OperationMetadata(
          operationId = "copilot/copilot-enterprise-usage-metrics",
          method = "GET",
          path = "/enterprises/{enterprise}/copilot/metrics/reports/enterprise-28-day/latest",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotUsageMetrics28DayReport",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-usage-metrics.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-usage-metrics.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-usage-metrics.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-usage-metrics.response.alternative3",
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

    public val copilotCopilotEnterpriseUserTeamsOneDayReportMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/copilot-enterprise-user-teams-one-day-report",
          method = "GET",
          path = "/enterprises/{enterprise}/copilot/metrics/reports/user-teams-1-day",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotUsageMetrics1DayReport",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-user-teams-one-day-report.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-user-teams-one-day-report.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-user-teams-one-day-report.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-enterprise-user-teams-one-day-report.response.alternative3",
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

    public val copilotCopilotOrganizationOneDayUsageMetricsMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/copilot-organization-one-day-usage-metrics",
          method = "GET",
          path = "/orgs/{org}/copilot/metrics/reports/organization-1-day",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotUsageMetrics1DayReport",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-one-day-usage-metrics.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-one-day-usage-metrics.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-one-day-usage-metrics.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-one-day-usage-metrics.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-one-day-usage-metrics.response.alternative4",
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

    public val copilotCopilotOrganizationUsageMetricsMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/copilot-organization-usage-metrics",
          method = "GET",
          path = "/orgs/{org}/copilot/metrics/reports/organization-28-day/latest",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotUsageMetrics28DayReport",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-usage-metrics.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-usage-metrics.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-usage-metrics.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-usage-metrics.response.alternative3",
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

    public val copilotCopilotOrganizationUserTeamsOneDayReportMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/copilot-organization-user-teams-one-day-report",
          method = "GET",
          path = "/orgs/{org}/copilot/metrics/reports/user-teams-1-day",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotUsageMetrics1DayReport",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-user-teams-one-day-report.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-user-teams-one-day-report.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-user-teams-one-day-report.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-user-teams-one-day-report.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-user-teams-one-day-report.response.alternative4",
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

    public val copilotCopilotOrganizationUsersOneDayUsageMetricsMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/copilot-organization-users-one-day-usage-metrics",
          method = "GET",
          path = "/orgs/{org}/copilot/metrics/reports/users-1-day",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotUsageMetrics1DayReport",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-users-one-day-usage-metrics.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-users-one-day-usage-metrics.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-users-one-day-usage-metrics.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-users-one-day-usage-metrics.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-users-one-day-usage-metrics.response.alternative4",
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

    public val copilotCopilotOrganizationUsersUsageMetricsMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/copilot-organization-users-usage-metrics",
          method = "GET",
          path = "/orgs/{org}/copilot/metrics/reports/users-28-day/latest",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotUsageMetrics28DayReport",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-users-usage-metrics.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-users-usage-metrics.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-users-usage-metrics.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-organization-users-usage-metrics.response.alternative3",
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

    public val copilotCopilotUsersOneDayUsageMetricsMetadata: OperationMetadata = OperationMetadata(
          operationId = "copilot/copilot-users-one-day-usage-metrics",
          method = "GET",
          path = "/enterprises/{enterprise}/copilot/metrics/reports/users-1-day",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotUsageMetrics1DayReport",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-users-one-day-usage-metrics.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-users-one-day-usage-metrics.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-users-one-day-usage-metrics.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-users-one-day-usage-metrics.response.alternative3",
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

    public val copilotCopilotUsersUsageMetricsMetadata: OperationMetadata = OperationMetadata(
          operationId = "copilot/copilot-users-usage-metrics",
          method = "GET",
          path = "/enterprises/{enterprise}/copilot/metrics/reports/users-28-day/latest",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotUsageMetrics28DayReport",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-users-usage-metrics.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-users-usage-metrics.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-users-usage-metrics.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/copilot-users-usage-metrics.response.alternative3",
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

    public val copilotDisableCopilotCodingAgentForRepositoryInOrganizationMetadata:
        OperationMetadata = OperationMetadata(
          operationId = "copilot/disable-copilot-coding-agent-for-repository-in-organization",
          method = "DELETE",
          path = "/orgs/{org}/copilot/coding-agent/permissions/repositories/{repository_id}",
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
              id = "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/disable-copilot-coding-agent-for-repository-in-organization.response.alternative5",
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

    public val copilotEnableCopilotCodingAgentForRepositoryInOrganizationMetadata: OperationMetadata
        = OperationMetadata(
          operationId = "copilot/enable-copilot-coding-agent-for-repository-in-organization",
          method = "PUT",
          path = "/orgs/{org}/copilot/coding-agent/permissions/repositories/{repository_id}",
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
              id = "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/enable-copilot-coding-agent-for-repository-in-organization.response.alternative6",
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

    public val copilotGetCopilotCloudAgentConfigurationMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/get-copilot-cloud-agent-configuration",
          method = "GET",
          path = "/repos/{owner}/{repo}/copilot/cloud-agent/configuration",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineReposCopilotCloudAgentConfigurationGetResponse200JsonX2621ecf8",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-cloud-agent-configuration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-cloud-agent-configuration.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-cloud-agent-configuration.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-cloud-agent-configuration.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-cloud-agent-configuration.response.alternative4",
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

    public val copilotGetCopilotCodingAgentPermissionsOrganizationMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/get-copilot-coding-agent-permissions-organization",
          method = "GET",
          path = "/orgs/{org}/copilot/coding-agent/permissions",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCopilotCodingAgentPermissionsGetResponse200JsonXa3df5951",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-coding-agent-permissions-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-coding-agent-permissions-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-coding-agent-permissions-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-coding-agent-permissions-organization.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-coding-agent-permissions-organization.response.alternative4",
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

    public val copilotGetCopilotOrganizationDetailsMetadata: OperationMetadata = OperationMetadata(
          operationId = "copilot/get-copilot-organization-details",
          method = "GET",
          path = "/orgs/{org}/copilot/billing",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotOrganizationDetails",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-organization-details.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-organization-details.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-organization-details.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-organization-details.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-organization-details.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-organization-details.response.alternative5",
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

    public val copilotGetCopilotSeatDetailsForUserMetadata: OperationMetadata = OperationMetadata(
          operationId = "copilot/get-copilot-seat-details-for-user",
          method = "GET",
          path = "/orgs/{org}/members/{username}/copilot",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSeatDetails",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-seat-details-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-seat-details-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-seat-details-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-seat-details-for-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-seat-details-for-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/get-copilot-seat-details-for-user.response.alternative5",
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

    public val copilotListCopilotCodingAgentSelectedRepositoriesForOrganizationMetadata:
        OperationMetadata = OperationMetadata(
          operationId = "copilot/list-copilot-coding-agent-selected-repositories-for-organization",
          method = "GET",
          path = "/orgs/{org}/copilot/coding-agent/permissions/repositories",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCopilotCodingAgentPermissionsRepositoriesGetResponse200JsonXec306aef",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/list-copilot-coding-agent-selected-repositories-for-organization.response.alternative5",
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

    public val copilotListCopilotSeatsMetadata: OperationMetadata = OperationMetadata(
          operationId = "copilot/list-copilot-seats",
          method = "GET",
          path = "/orgs/{org}/copilot/billing/seats",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/list-copilot-seats.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/list-copilot-seats.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/list-copilot-seats.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/list-copilot-seats.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/list-copilot-seats.response.alternative4",
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

    public val copilotRemoveOrganizationsFromEnterpriseCodingAgentPolicyMetadata: OperationMetadata
        = OperationMetadata(
          operationId = "copilot/remove-organizations-from-enterprise-coding-agent-policy",
          method = "DELETE",
          path = "/enterprises/{enterprise}/copilot/policies/coding_agent/organizations",
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
              id = "copilot/remove-organizations-from-enterprise-coding-agent-policy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/remove-organizations-from-enterprise-coding-agent-policy.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/remove-organizations-from-enterprise-coding-agent-policy.response.alternative2",
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

    public val copilotSetCopilotCodingAgentPermissionsOrganizationMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/set-copilot-coding-agent-permissions-organization",
          method = "PUT",
          path = "/orgs/{org}/copilot/coding-agent/permissions",
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
              id = "copilot/set-copilot-coding-agent-permissions-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-coding-agent-permissions-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-coding-agent-permissions-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-coding-agent-permissions-organization.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-coding-agent-permissions-organization.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-coding-agent-permissions-organization.response.alternative5",
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

    public val copilotSetCopilotCodingAgentSelectedRepositoriesForOrganizationMetadata:
        OperationMetadata = OperationMetadata(
          operationId = "copilot/set-copilot-coding-agent-selected-repositories-for-organization",
          method = "PUT",
          path = "/orgs/{org}/copilot/coding-agent/permissions/repositories",
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
              id = "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-coding-agent-selected-repositories-for-organization.response.alternative6",
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

    public val copilotSetCopilotContentExclusionForOrganizationMetadata: OperationMetadata =
        OperationMetadata(
          operationId = "copilot/set-copilot-content-exclusion-for-organization",
          method = "PUT",
          path = "/orgs/{org}/copilot/content_exclusion",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCopilotContentExclusionPutResponse200JsonX5934f878",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-content-exclusion-for-organization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-content-exclusion-for-organization.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-content-exclusion-for-organization.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-content-exclusion-for-organization.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 413),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-content-exclusion-for-organization.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationErrorSimple",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-content-exclusion-for-organization.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-copilot-content-exclusion-for-organization.response.alternative6",
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

    public val copilotSetEnterpriseCodingAgentPolicyMetadata: OperationMetadata = OperationMetadata(
          operationId = "copilot/set-enterprise-coding-agent-policy",
          method = "PUT",
          path = "/enterprises/{enterprise}/copilot/policies/coding_agent",
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
              id = "copilot/set-enterprise-coding-agent-policy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-enterprise-coding-agent-policy.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot/set-enterprise-coding-agent-policy.response.alternative2",
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
  }
}
