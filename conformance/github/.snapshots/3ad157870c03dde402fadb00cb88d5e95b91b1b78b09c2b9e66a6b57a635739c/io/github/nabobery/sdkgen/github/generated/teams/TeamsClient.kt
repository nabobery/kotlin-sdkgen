package io.github.nabobery.sdkgen.github.generated.teams

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
import io.github.nabobery.sdkgen.github.generated.BasicError
import io.github.nabobery.sdkgen.github.generated.InlineOrgsTeamsMembersGetParameterXeb377714
import io.github.nabobery.sdkgen.github.generated.InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e
import io.github.nabobery.sdkgen.github.generated.InlineOrgsTeamsPatchRequestJsonXa9bea8ae
import io.github.nabobery.sdkgen.github.generated.InlineOrgsTeamsPostRequestJsonXa6db8b97
import io.github.nabobery.sdkgen.github.generated.InlineOrgsTeamsReposPutRequestJsonX41d9868d
import io.github.nabobery.sdkgen.github.generated.InlineTeamTypeParameterXa413f3b6
import io.github.nabobery.sdkgen.github.generated.InlineTeamsMembersGetParameterXfe84a019
import io.github.nabobery.sdkgen.github.generated.InlineTeamsMembershipsPutRequestJsonX1968695f
import io.github.nabobery.sdkgen.github.generated.InlineTeamsPatchRequestJsonX92c4709d
import io.github.nabobery.sdkgen.github.generated.InlineTeamsReposPutRequestJsonXb6898014
import io.github.nabobery.sdkgen.github.generated.MinimalRepository
import io.github.nabobery.sdkgen.github.generated.OrganizationInvitation
import io.github.nabobery.sdkgen.github.generated.SdkJson
import io.github.nabobery.sdkgen.github.generated.Team
import io.github.nabobery.sdkgen.github.generated.TeamFull
import io.github.nabobery.sdkgen.github.generated.TeamMember
import io.github.nabobery.sdkgen.github.generated.TeamMembership
import io.github.nabobery.sdkgen.github.generated.TeamRepository
import io.github.nabobery.sdkgen.github.generated.ValidationError
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.nullable

internal object TeamsCodecs {
  private val teamsAddMemberLegacyResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/add-member-legacy.response.alternative1", BasicError.Serializer, SdkJson)

  internal val teamsAddMemberLegacyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsAddMemberLegacyResponseCodecAlternative1Codec)

  internal val teamsAddMemberLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsAddMemberLegacyResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val TEAMSADDORUPDATEMEMBERSHIPFORUSERINORG_REQUEST_CODEC_ID: String =
      "teams/add-or-update-membership-for-user-in-org.request"

  private val teamsAddOrUpdateMembershipForUserInOrgRequestCodec:
      MediaTypeCodec<InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e?> =
      KotlinxSerializationCodec(TEAMSADDORUPDATEMEMBERSHIPFORUSERINORG_REQUEST_CODEC_ID, InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e.Serializer.nullable, SdkJson)

  internal const val TEAMSADDORUPDATEMEMBERSHIPFORUSERINORG_RESPONSE_CODEC_ID: String =
      "teams/add-or-update-membership-for-user-in-org.response"

  private val teamsAddOrUpdateMembershipForUserInOrgResponseCodec: MediaTypeCodec<TeamMembership> =
      KotlinxSerializationCodec(TEAMSADDORUPDATEMEMBERSHIPFORUSERINORG_RESPONSE_CODEC_ID, TeamMembership.Serializer, SdkJson)

  private val teamsAddOrUpdateMembershipForUserInOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<TeamMembership> =
      KotlinxSerializationCodec("teams/add-or-update-membership-for-user-in-org.response.alternative0", TeamMembership.Serializer, SdkJson)

  internal val teamsAddOrUpdateMembershipForUserInOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TeamMembership> =
      MediaTypeCodecRegistry.of(teamsAddOrUpdateMembershipForUserInOrgResponseCodecAlternative0Codec)

  internal val teamsAddOrUpdateMembershipForUserInOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e?> =
      MediaTypeCodecRegistry.of(teamsAddOrUpdateMembershipForUserInOrgRequestCodec)

  internal val teamsAddOrUpdateMembershipForUserInOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<TeamMembership> =
      MediaTypeCodecRegistry.of(teamsAddOrUpdateMembershipForUserInOrgResponseCodec)

  internal const val TEAMSADDORUPDATEMEMBERSHIPFORUSERLEGACY_REQUEST_CODEC_ID: String =
      "teams/add-or-update-membership-for-user-legacy.request"

  private val teamsAddOrUpdateMembershipForUserLegacyRequestCodec:
      MediaTypeCodec<InlineTeamsMembershipsPutRequestJsonX1968695f?> =
      KotlinxSerializationCodec(TEAMSADDORUPDATEMEMBERSHIPFORUSERLEGACY_REQUEST_CODEC_ID, InlineTeamsMembershipsPutRequestJsonX1968695f.Serializer.nullable, SdkJson)

  internal const val TEAMSADDORUPDATEMEMBERSHIPFORUSERLEGACY_RESPONSE_CODEC_ID: String =
      "teams/add-or-update-membership-for-user-legacy.response"

  private val teamsAddOrUpdateMembershipForUserLegacyResponseCodec: MediaTypeCodec<TeamMembership> =
      KotlinxSerializationCodec(TEAMSADDORUPDATEMEMBERSHIPFORUSERLEGACY_RESPONSE_CODEC_ID, TeamMembership.Serializer, SdkJson)

  private val teamsAddOrUpdateMembershipForUserLegacyResponseCodecAlternative0Codec:
      MediaTypeCodec<TeamMembership> =
      KotlinxSerializationCodec("teams/add-or-update-membership-for-user-legacy.response.alternative0", TeamMembership.Serializer, SdkJson)

  internal val teamsAddOrUpdateMembershipForUserLegacyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TeamMembership> =
      MediaTypeCodecRegistry.of(teamsAddOrUpdateMembershipForUserLegacyResponseCodecAlternative0Codec)

  private val teamsAddOrUpdateMembershipForUserLegacyResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/add-or-update-membership-for-user-legacy.response.alternative2", BasicError.Serializer, SdkJson)

  internal val teamsAddOrUpdateMembershipForUserLegacyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsAddOrUpdateMembershipForUserLegacyResponseCodecAlternative2Codec)

  internal val teamsAddOrUpdateMembershipForUserLegacyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineTeamsMembershipsPutRequestJsonX1968695f?> =
      MediaTypeCodecRegistry.of(teamsAddOrUpdateMembershipForUserLegacyRequestCodec)

  internal val teamsAddOrUpdateMembershipForUserLegacyResponseCodecRegistry:
      MediaTypeCodecRegistry<TeamMembership> =
      MediaTypeCodecRegistry.of(teamsAddOrUpdateMembershipForUserLegacyResponseCodec)

  internal const val TEAMSADDORUPDATEREPOPERMISSIONSINORG_REQUEST_CODEC_ID: String =
      "teams/add-or-update-repo-permissions-in-org.request"

  private val teamsAddOrUpdateRepoPermissionsInOrgRequestCodec:
      MediaTypeCodec<InlineOrgsTeamsReposPutRequestJsonX41d9868d?> =
      KotlinxSerializationCodec(TEAMSADDORUPDATEREPOPERMISSIONSINORG_REQUEST_CODEC_ID, InlineOrgsTeamsReposPutRequestJsonX41d9868d.Serializer.nullable, SdkJson)

  internal val teamsAddOrUpdateRepoPermissionsInOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsTeamsReposPutRequestJsonX41d9868d?> =
      MediaTypeCodecRegistry.of(teamsAddOrUpdateRepoPermissionsInOrgRequestCodec)

  internal val teamsAddOrUpdateRepoPermissionsInOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val TEAMSADDORUPDATEREPOPERMISSIONSLEGACY_REQUEST_CODEC_ID: String =
      "teams/add-or-update-repo-permissions-legacy.request"

  private val teamsAddOrUpdateRepoPermissionsLegacyRequestCodec:
      MediaTypeCodec<InlineTeamsReposPutRequestJsonXb6898014?> =
      KotlinxSerializationCodec(TEAMSADDORUPDATEREPOPERMISSIONSLEGACY_REQUEST_CODEC_ID, InlineTeamsReposPutRequestJsonXb6898014.Serializer.nullable, SdkJson)

  private val teamsAddOrUpdateRepoPermissionsLegacyResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/add-or-update-repo-permissions-legacy.response.alternative1", BasicError.Serializer, SdkJson)

  internal val teamsAddOrUpdateRepoPermissionsLegacyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsAddOrUpdateRepoPermissionsLegacyResponseCodecAlternative1Codec)

  private val teamsAddOrUpdateRepoPermissionsLegacyResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("teams/add-or-update-repo-permissions-legacy.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val teamsAddOrUpdateRepoPermissionsLegacyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(teamsAddOrUpdateRepoPermissionsLegacyResponseCodecAlternative2Codec)

  internal val teamsAddOrUpdateRepoPermissionsLegacyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineTeamsReposPutRequestJsonXb6898014?> =
      MediaTypeCodecRegistry.of(teamsAddOrUpdateRepoPermissionsLegacyRequestCodec)

  internal val teamsAddOrUpdateRepoPermissionsLegacyResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val teamsCheckPermissionsForRepoInOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<TeamRepository> =
      KotlinxSerializationCodec("teams/check-permissions-for-repo-in-org.response.alternative0", TeamRepository.Serializer, SdkJson)

  internal val teamsCheckPermissionsForRepoInOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TeamRepository> =
      MediaTypeCodecRegistry.of(teamsCheckPermissionsForRepoInOrgResponseCodecAlternative0Codec)

  internal val teamsCheckPermissionsForRepoInOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val teamsCheckPermissionsForRepoLegacyResponseCodecAlternative0Codec:
      MediaTypeCodec<TeamRepository> =
      KotlinxSerializationCodec("teams/check-permissions-for-repo-legacy.response.alternative0", TeamRepository.Serializer, SdkJson)

  internal val teamsCheckPermissionsForRepoLegacyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TeamRepository> =
      MediaTypeCodecRegistry.of(teamsCheckPermissionsForRepoLegacyResponseCodecAlternative0Codec)

  internal val teamsCheckPermissionsForRepoLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal const val TEAMSCREATE_REQUEST_CODEC_ID: String = "teams/create.request"

  private val teamsCreateRequestCodec: MediaTypeCodec<InlineOrgsTeamsPostRequestJsonXa6db8b97> =
      KotlinxSerializationCodec(TEAMSCREATE_REQUEST_CODEC_ID, InlineOrgsTeamsPostRequestJsonXa6db8b97.Serializer, SdkJson)

  internal const val TEAMSCREATE_RESPONSE_CODEC_ID: String = "teams/create.response"

  private val teamsCreateResponseCodec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec(TEAMSCREATE_RESPONSE_CODEC_ID, TeamFull.Serializer, SdkJson)

  private val teamsCreateResponseCodecAlternative0Codec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec("teams/create.response.alternative0", TeamFull.Serializer, SdkJson)

  internal val teamsCreateResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TeamFull> =
      MediaTypeCodecRegistry.of(teamsCreateResponseCodecAlternative0Codec)

  private val teamsCreateResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/create.response.alternative1", BasicError.Serializer, SdkJson)

  internal val teamsCreateResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsCreateResponseCodecAlternative1Codec)

  private val teamsCreateResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("teams/create.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val teamsCreateResponseCodecAlternative2Registry: MediaTypeCodecRegistry<ValidationError>
      = MediaTypeCodecRegistry.of(teamsCreateResponseCodecAlternative2Codec)

  internal val teamsCreateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsTeamsPostRequestJsonXa6db8b97> =
      MediaTypeCodecRegistry.of(teamsCreateRequestCodec)

  internal val teamsCreateResponseCodecRegistry: MediaTypeCodecRegistry<TeamFull> =
      MediaTypeCodecRegistry.of(teamsCreateResponseCodec)

  internal val teamsDeleteInOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsDeleteInOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val teamsDeleteLegacyResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/delete-legacy.response.alternative1", BasicError.Serializer, SdkJson)

  internal val teamsDeleteLegacyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsDeleteLegacyResponseCodecAlternative1Codec)

  private val teamsDeleteLegacyResponseCodecAlternative2Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("teams/delete-legacy.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val teamsDeleteLegacyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(teamsDeleteLegacyResponseCodecAlternative2Codec)

  internal val teamsDeleteLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsDeleteLegacyResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val TEAMSGETBYNAME_RESPONSE_CODEC_ID: String = "teams/get-by-name.response"

  private val teamsGetByNameResponseCodec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec(TEAMSGETBYNAME_RESPONSE_CODEC_ID, TeamFull.Serializer, SdkJson)

  private val teamsGetByNameResponseCodecAlternative0Codec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec("teams/get-by-name.response.alternative0", TeamFull.Serializer, SdkJson)

  internal val teamsGetByNameResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TeamFull> =
      MediaTypeCodecRegistry.of(teamsGetByNameResponseCodecAlternative0Codec)

  private val teamsGetByNameResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/get-by-name.response.alternative1", BasicError.Serializer, SdkJson)

  internal val teamsGetByNameResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsGetByNameResponseCodecAlternative1Codec)

  internal val teamsGetByNameRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsGetByNameResponseCodecRegistry: MediaTypeCodecRegistry<TeamFull> =
      MediaTypeCodecRegistry.of(teamsGetByNameResponseCodec)

  internal const val TEAMSGETLEGACY_RESPONSE_CODEC_ID: String = "teams/get-legacy.response"

  private val teamsGetLegacyResponseCodec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec(TEAMSGETLEGACY_RESPONSE_CODEC_ID, TeamFull.Serializer, SdkJson)

  private val teamsGetLegacyResponseCodecAlternative0Codec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec("teams/get-legacy.response.alternative0", TeamFull.Serializer, SdkJson)

  internal val teamsGetLegacyResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TeamFull> =
      MediaTypeCodecRegistry.of(teamsGetLegacyResponseCodecAlternative0Codec)

  private val teamsGetLegacyResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/get-legacy.response.alternative1", BasicError.Serializer, SdkJson)

  internal val teamsGetLegacyResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsGetLegacyResponseCodecAlternative1Codec)

  internal val teamsGetLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsGetLegacyResponseCodecRegistry: MediaTypeCodecRegistry<TeamFull> =
      MediaTypeCodecRegistry.of(teamsGetLegacyResponseCodec)

  internal val teamsGetMemberLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsGetMemberLegacyResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val TEAMSGETMEMBERSHIPFORUSERINORG_RESPONSE_CODEC_ID: String =
      "teams/get-membership-for-user-in-org.response"

  private val teamsGetMembershipForUserInOrgResponseCodec: MediaTypeCodec<TeamMembership> =
      KotlinxSerializationCodec(TEAMSGETMEMBERSHIPFORUSERINORG_RESPONSE_CODEC_ID, TeamMembership.Serializer, SdkJson)

  private val teamsGetMembershipForUserInOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<TeamMembership> =
      KotlinxSerializationCodec("teams/get-membership-for-user-in-org.response.alternative0", TeamMembership.Serializer, SdkJson)

  internal val teamsGetMembershipForUserInOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TeamMembership> =
      MediaTypeCodecRegistry.of(teamsGetMembershipForUserInOrgResponseCodecAlternative0Codec)

  internal val teamsGetMembershipForUserInOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsGetMembershipForUserInOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<TeamMembership> =
      MediaTypeCodecRegistry.of(teamsGetMembershipForUserInOrgResponseCodec)

  internal const val TEAMSGETMEMBERSHIPFORUSERLEGACY_RESPONSE_CODEC_ID: String =
      "teams/get-membership-for-user-legacy.response"

  private val teamsGetMembershipForUserLegacyResponseCodec: MediaTypeCodec<TeamMembership> =
      KotlinxSerializationCodec(TEAMSGETMEMBERSHIPFORUSERLEGACY_RESPONSE_CODEC_ID, TeamMembership.Serializer, SdkJson)

  private val teamsGetMembershipForUserLegacyResponseCodecAlternative0Codec:
      MediaTypeCodec<TeamMembership> =
      KotlinxSerializationCodec("teams/get-membership-for-user-legacy.response.alternative0", TeamMembership.Serializer, SdkJson)

  internal val teamsGetMembershipForUserLegacyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TeamMembership> =
      MediaTypeCodecRegistry.of(teamsGetMembershipForUserLegacyResponseCodecAlternative0Codec)

  private val teamsGetMembershipForUserLegacyResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/get-membership-for-user-legacy.response.alternative1", BasicError.Serializer, SdkJson)

  internal val teamsGetMembershipForUserLegacyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsGetMembershipForUserLegacyResponseCodecAlternative1Codec)

  internal val teamsGetMembershipForUserLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsGetMembershipForUserLegacyResponseCodecRegistry:
      MediaTypeCodecRegistry<TeamMembership> =
      MediaTypeCodecRegistry.of(teamsGetMembershipForUserLegacyResponseCodec)

  internal const val TEAMSLIST_RESPONSE_CODEC_ID: String = "teams/list.response"

  private val teamsListResponseCodec: MediaTypeCodec<List<Team>> =
      KotlinxSerializationCodec(TEAMSLIST_RESPONSE_CODEC_ID, ListSerializer(Team.Serializer), SdkJson)

  private val teamsListResponseCodecAlternative0Codec: MediaTypeCodec<List<Team>> =
      KotlinxSerializationCodec("teams/list.response.alternative0", ListSerializer(Team.Serializer), SdkJson)

  internal val teamsListResponseCodecAlternative0Registry: MediaTypeCodecRegistry<List<Team>> =
      MediaTypeCodecRegistry.of(teamsListResponseCodecAlternative0Codec)

  private val teamsListResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/list.response.alternative1", BasicError.Serializer, SdkJson)

  internal val teamsListResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsListResponseCodecAlternative1Codec)

  internal val teamsListRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsListResponseCodecRegistry: MediaTypeCodecRegistry<List<Team>> =
      MediaTypeCodecRegistry.of(teamsListResponseCodec)

  internal const val TEAMSLISTCHILDINORG_RESPONSE_CODEC_ID: String =
      "teams/list-child-in-org.response"

  private val teamsListChildInOrgResponseCodec: MediaTypeCodec<List<Team>> =
      KotlinxSerializationCodec(TEAMSLISTCHILDINORG_RESPONSE_CODEC_ID, ListSerializer(Team.Serializer), SdkJson)

  private val teamsListChildInOrgResponseCodecAlternative0Codec: MediaTypeCodec<List<Team>> =
      KotlinxSerializationCodec("teams/list-child-in-org.response.alternative0", ListSerializer(Team.Serializer), SdkJson)

  internal val teamsListChildInOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Team>> =
      MediaTypeCodecRegistry.of(teamsListChildInOrgResponseCodecAlternative0Codec)

  internal val teamsListChildInOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsListChildInOrgResponseCodecRegistry: MediaTypeCodecRegistry<List<Team>> =
      MediaTypeCodecRegistry.of(teamsListChildInOrgResponseCodec)

  internal const val TEAMSLISTCHILDLEGACY_RESPONSE_CODEC_ID: String =
      "teams/list-child-legacy.response"

  private val teamsListChildLegacyResponseCodec: MediaTypeCodec<List<Team>> =
      KotlinxSerializationCodec(TEAMSLISTCHILDLEGACY_RESPONSE_CODEC_ID, ListSerializer(Team.Serializer), SdkJson)

  private val teamsListChildLegacyResponseCodecAlternative0Codec: MediaTypeCodec<List<Team>> =
      KotlinxSerializationCodec("teams/list-child-legacy.response.alternative0", ListSerializer(Team.Serializer), SdkJson)

  internal val teamsListChildLegacyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<Team>> =
      MediaTypeCodecRegistry.of(teamsListChildLegacyResponseCodecAlternative0Codec)

  private val teamsListChildLegacyResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/list-child-legacy.response.alternative1", BasicError.Serializer, SdkJson)

  internal val teamsListChildLegacyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsListChildLegacyResponseCodecAlternative1Codec)

  private val teamsListChildLegacyResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/list-child-legacy.response.alternative2", BasicError.Serializer, SdkJson)

  internal val teamsListChildLegacyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsListChildLegacyResponseCodecAlternative2Codec)

  private val teamsListChildLegacyResponseCodecAlternative3Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("teams/list-child-legacy.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val teamsListChildLegacyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(teamsListChildLegacyResponseCodecAlternative3Codec)

  internal val teamsListChildLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsListChildLegacyResponseCodecRegistry: MediaTypeCodecRegistry<List<Team>> =
      MediaTypeCodecRegistry.of(teamsListChildLegacyResponseCodec)

  internal const val TEAMSLISTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID: String =
      "teams/list-for-authenticated-user.response"

  private val teamsListForAuthenticatedUserResponseCodec: MediaTypeCodec<List<TeamFull>> =
      KotlinxSerializationCodec(TEAMSLISTFORAUTHENTICATEDUSER_RESPONSE_CODEC_ID, ListSerializer(TeamFull.Serializer), SdkJson)

  private val teamsListForAuthenticatedUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<TeamFull>> =
      KotlinxSerializationCodec("teams/list-for-authenticated-user.response.alternative0", ListSerializer(TeamFull.Serializer), SdkJson)

  internal val teamsListForAuthenticatedUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<TeamFull>> =
      MediaTypeCodecRegistry.of(teamsListForAuthenticatedUserResponseCodecAlternative0Codec)

  private val teamsListForAuthenticatedUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/list-for-authenticated-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val teamsListForAuthenticatedUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsListForAuthenticatedUserResponseCodecAlternative2Codec)

  private val teamsListForAuthenticatedUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/list-for-authenticated-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val teamsListForAuthenticatedUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsListForAuthenticatedUserResponseCodecAlternative3Codec)

  internal val teamsListForAuthenticatedUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsListForAuthenticatedUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<TeamFull>> =
      MediaTypeCodecRegistry.of(teamsListForAuthenticatedUserResponseCodec)

  internal const val TEAMSLISTMEMBERSINORG_RESPONSE_CODEC_ID: String =
      "teams/list-members-in-org.response"

  private val teamsListMembersInOrgResponseCodec: MediaTypeCodec<List<TeamMember>> =
      KotlinxSerializationCodec(TEAMSLISTMEMBERSINORG_RESPONSE_CODEC_ID, ListSerializer(TeamMember.Serializer), SdkJson)

  private val teamsListMembersInOrgResponseCodecAlternative0Codec: MediaTypeCodec<List<TeamMember>>
      =
      KotlinxSerializationCodec("teams/list-members-in-org.response.alternative0", ListSerializer(TeamMember.Serializer), SdkJson)

  internal val teamsListMembersInOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<TeamMember>> =
      MediaTypeCodecRegistry.of(teamsListMembersInOrgResponseCodecAlternative0Codec)

  internal val teamsListMembersInOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsListMembersInOrgResponseCodecRegistry: MediaTypeCodecRegistry<List<TeamMember>>
      = MediaTypeCodecRegistry.of(teamsListMembersInOrgResponseCodec)

  internal const val TEAMSLISTMEMBERSLEGACY_RESPONSE_CODEC_ID: String =
      "teams/list-members-legacy.response"

  private val teamsListMembersLegacyResponseCodec: MediaTypeCodec<List<TeamMember>> =
      KotlinxSerializationCodec(TEAMSLISTMEMBERSLEGACY_RESPONSE_CODEC_ID, ListSerializer(TeamMember.Serializer), SdkJson)

  private val teamsListMembersLegacyResponseCodecAlternative0Codec: MediaTypeCodec<List<TeamMember>>
      =
      KotlinxSerializationCodec("teams/list-members-legacy.response.alternative0", ListSerializer(TeamMember.Serializer), SdkJson)

  internal val teamsListMembersLegacyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<TeamMember>> =
      MediaTypeCodecRegistry.of(teamsListMembersLegacyResponseCodecAlternative0Codec)

  private val teamsListMembersLegacyResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/list-members-legacy.response.alternative1", BasicError.Serializer, SdkJson)

  internal val teamsListMembersLegacyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsListMembersLegacyResponseCodecAlternative1Codec)

  internal val teamsListMembersLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsListMembersLegacyResponseCodecRegistry: MediaTypeCodecRegistry<List<TeamMember>>
      = MediaTypeCodecRegistry.of(teamsListMembersLegacyResponseCodec)

  internal const val TEAMSLISTPENDINGINVITATIONSINORG_RESPONSE_CODEC_ID: String =
      "teams/list-pending-invitations-in-org.response"

  private val teamsListPendingInvitationsInOrgResponseCodec:
      MediaTypeCodec<List<OrganizationInvitation>> =
      KotlinxSerializationCodec(TEAMSLISTPENDINGINVITATIONSINORG_RESPONSE_CODEC_ID, ListSerializer(OrganizationInvitation.Serializer), SdkJson)

  private val teamsListPendingInvitationsInOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<OrganizationInvitation>> =
      KotlinxSerializationCodec("teams/list-pending-invitations-in-org.response.alternative0", ListSerializer(OrganizationInvitation.Serializer), SdkJson)

  internal val teamsListPendingInvitationsInOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<OrganizationInvitation>> =
      MediaTypeCodecRegistry.of(teamsListPendingInvitationsInOrgResponseCodecAlternative0Codec)

  internal val teamsListPendingInvitationsInOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsListPendingInvitationsInOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<OrganizationInvitation>> =
      MediaTypeCodecRegistry.of(teamsListPendingInvitationsInOrgResponseCodec)

  internal const val TEAMSLISTPENDINGINVITATIONSLEGACY_RESPONSE_CODEC_ID: String =
      "teams/list-pending-invitations-legacy.response"

  private val teamsListPendingInvitationsLegacyResponseCodec:
      MediaTypeCodec<List<OrganizationInvitation>> =
      KotlinxSerializationCodec(TEAMSLISTPENDINGINVITATIONSLEGACY_RESPONSE_CODEC_ID, ListSerializer(OrganizationInvitation.Serializer), SdkJson)

  private val teamsListPendingInvitationsLegacyResponseCodecAlternative0Codec:
      MediaTypeCodec<List<OrganizationInvitation>> =
      KotlinxSerializationCodec("teams/list-pending-invitations-legacy.response.alternative0", ListSerializer(OrganizationInvitation.Serializer), SdkJson)

  internal val teamsListPendingInvitationsLegacyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<OrganizationInvitation>> =
      MediaTypeCodecRegistry.of(teamsListPendingInvitationsLegacyResponseCodecAlternative0Codec)

  internal val teamsListPendingInvitationsLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsListPendingInvitationsLegacyResponseCodecRegistry:
      MediaTypeCodecRegistry<List<OrganizationInvitation>> =
      MediaTypeCodecRegistry.of(teamsListPendingInvitationsLegacyResponseCodec)

  internal const val TEAMSLISTREPOSINORG_RESPONSE_CODEC_ID: String =
      "teams/list-repos-in-org.response"

  private val teamsListReposInOrgResponseCodec: MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec(TEAMSLISTREPOSINORG_RESPONSE_CODEC_ID, ListSerializer(MinimalRepository.Serializer), SdkJson)

  private val teamsListReposInOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec("teams/list-repos-in-org.response.alternative0", ListSerializer(MinimalRepository.Serializer), SdkJson)

  internal val teamsListReposInOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(teamsListReposInOrgResponseCodecAlternative0Codec)

  internal val teamsListReposInOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsListReposInOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(teamsListReposInOrgResponseCodec)

  internal const val TEAMSLISTREPOSLEGACY_RESPONSE_CODEC_ID: String =
      "teams/list-repos-legacy.response"

  private val teamsListReposLegacyResponseCodec: MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec(TEAMSLISTREPOSLEGACY_RESPONSE_CODEC_ID, ListSerializer(MinimalRepository.Serializer), SdkJson)

  private val teamsListReposLegacyResponseCodecAlternative0Codec:
      MediaTypeCodec<List<MinimalRepository>> =
      KotlinxSerializationCodec("teams/list-repos-legacy.response.alternative0", ListSerializer(MinimalRepository.Serializer), SdkJson)

  internal val teamsListReposLegacyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(teamsListReposLegacyResponseCodecAlternative0Codec)

  private val teamsListReposLegacyResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/list-repos-legacy.response.alternative1", BasicError.Serializer, SdkJson)

  internal val teamsListReposLegacyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsListReposLegacyResponseCodecAlternative1Codec)

  internal val teamsListReposLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsListReposLegacyResponseCodecRegistry:
      MediaTypeCodecRegistry<List<MinimalRepository>> =
      MediaTypeCodecRegistry.of(teamsListReposLegacyResponseCodec)

  internal val teamsRemoveMemberLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsRemoveMemberLegacyResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsRemoveMembershipForUserInOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsRemoveMembershipForUserInOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal val teamsRemoveMembershipForUserLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal val teamsRemoveMembershipForUserLegacyResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal val teamsRemoveRepoInOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsRemoveRepoInOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsRemoveRepoLegacyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val teamsRemoveRepoLegacyResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val TEAMSUPDATEINORG_REQUEST_CODEC_ID: String = "teams/update-in-org.request"

  private val teamsUpdateInOrgRequestCodec:
      MediaTypeCodec<InlineOrgsTeamsPatchRequestJsonXa9bea8ae?> =
      KotlinxSerializationCodec(TEAMSUPDATEINORG_REQUEST_CODEC_ID, InlineOrgsTeamsPatchRequestJsonXa9bea8ae.Serializer.nullable, SdkJson)

  internal const val TEAMSUPDATEINORG_RESPONSE_CODEC_ID: String = "teams/update-in-org.response"

  private val teamsUpdateInOrgResponseCodec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec(TEAMSUPDATEINORG_RESPONSE_CODEC_ID, TeamFull.Serializer, SdkJson)

  private val teamsUpdateInOrgResponseCodecAlternative0Codec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec("teams/update-in-org.response.alternative0", TeamFull.Serializer, SdkJson)

  internal val teamsUpdateInOrgResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TeamFull> =
      MediaTypeCodecRegistry.of(teamsUpdateInOrgResponseCodecAlternative0Codec)

  private val teamsUpdateInOrgResponseCodecAlternative1Codec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec("teams/update-in-org.response.alternative1", TeamFull.Serializer, SdkJson)

  internal val teamsUpdateInOrgResponseCodecAlternative1Registry: MediaTypeCodecRegistry<TeamFull> =
      MediaTypeCodecRegistry.of(teamsUpdateInOrgResponseCodecAlternative1Codec)

  private val teamsUpdateInOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/update-in-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val teamsUpdateInOrgResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(teamsUpdateInOrgResponseCodecAlternative2Codec)

  private val teamsUpdateInOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/update-in-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val teamsUpdateInOrgResponseCodecAlternative3Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(teamsUpdateInOrgResponseCodecAlternative3Codec)

  private val teamsUpdateInOrgResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("teams/update-in-org.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val teamsUpdateInOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(teamsUpdateInOrgResponseCodecAlternative4Codec)

  internal val teamsUpdateInOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsTeamsPatchRequestJsonXa9bea8ae?> =
      MediaTypeCodecRegistry.of(teamsUpdateInOrgRequestCodec)

  internal val teamsUpdateInOrgResponseCodecRegistry: MediaTypeCodecRegistry<TeamFull> =
      MediaTypeCodecRegistry.of(teamsUpdateInOrgResponseCodec)

  internal const val TEAMSUPDATELEGACY_REQUEST_CODEC_ID: String = "teams/update-legacy.request"

  private val teamsUpdateLegacyRequestCodec: MediaTypeCodec<InlineTeamsPatchRequestJsonX92c4709d> =
      KotlinxSerializationCodec(TEAMSUPDATELEGACY_REQUEST_CODEC_ID, InlineTeamsPatchRequestJsonX92c4709d.Serializer, SdkJson)

  internal const val TEAMSUPDATELEGACY_RESPONSE_CODEC_ID: String = "teams/update-legacy.response"

  private val teamsUpdateLegacyResponseCodec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec(TEAMSUPDATELEGACY_RESPONSE_CODEC_ID, TeamFull.Serializer, SdkJson)

  private val teamsUpdateLegacyResponseCodecAlternative0Codec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec("teams/update-legacy.response.alternative0", TeamFull.Serializer, SdkJson)

  internal val teamsUpdateLegacyResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TeamFull>
      = MediaTypeCodecRegistry.of(teamsUpdateLegacyResponseCodecAlternative0Codec)

  private val teamsUpdateLegacyResponseCodecAlternative1Codec: MediaTypeCodec<TeamFull> =
      KotlinxSerializationCodec("teams/update-legacy.response.alternative1", TeamFull.Serializer, SdkJson)

  internal val teamsUpdateLegacyResponseCodecAlternative1Registry: MediaTypeCodecRegistry<TeamFull>
      = MediaTypeCodecRegistry.of(teamsUpdateLegacyResponseCodecAlternative1Codec)

  private val teamsUpdateLegacyResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/update-legacy.response.alternative2", BasicError.Serializer, SdkJson)

  internal val teamsUpdateLegacyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsUpdateLegacyResponseCodecAlternative2Codec)

  private val teamsUpdateLegacyResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("teams/update-legacy.response.alternative3", BasicError.Serializer, SdkJson)

  internal val teamsUpdateLegacyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(teamsUpdateLegacyResponseCodecAlternative3Codec)

  private val teamsUpdateLegacyResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("teams/update-legacy.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val teamsUpdateLegacyResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(teamsUpdateLegacyResponseCodecAlternative4Codec)

  internal val teamsUpdateLegacyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineTeamsPatchRequestJsonX92c4709d> =
      MediaTypeCodecRegistry.of(teamsUpdateLegacyRequestCodec)

  internal val teamsUpdateLegacyResponseCodecRegistry: MediaTypeCodecRegistry<TeamFull> =
      MediaTypeCodecRegistry.of(teamsUpdateLegacyResponseCodec)
}

/**
 * Client for the 'teams' group of GitHub v3 REST API.
 */
public class TeamsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@TeamsClient.authentication)

  /**
   * The "Add team member" endpoint (described below) is closing down.
   *
   * We recommend using the [Add or update team membership for a
   * user](https://docs.github.com/rest/teams/members#add-or-update-team-membership-for-a-user) endpoint instead. It
   * allows you to invite new organization members to your teams.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * To add someone to a team, the authenticated user must be an organization owner or a team maintainer in the team
   * they're changing. The person being added to the team must be a member of the team's organization.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see
   * "[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return No response body.
   * @throws TeamsAddMemberLegacyApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded TeamsAddMemberLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsAddMemberLegacy(
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, TeamsAddMemberLegacyResponse, Unit>(
    request = SdkExecutionRequest(teamsAddMemberLegacyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsAddMemberLegacyRequestCodecRegistry,
    responseDecoder = TeamsAddMemberLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsAddMemberLegacyResponse.SuccessNoContent -> response.unit
        is TeamsAddMemberLegacyResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsAddMemberLegacyResponse.Http404NoContent -> response.unit
        is TeamsAddMemberLegacyResponse.Http422NoContent -> response.unit
        is TeamsAddMemberLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsAddMemberLegacyResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is TeamsAddMemberLegacyResponse.Http403Json -> TeamsAddMemberLegacyApiException(response, statusCode, headers)
        is TeamsAddMemberLegacyResponse.Http404NoContent -> TeamsAddMemberLegacyApiException(response, statusCode, headers)
        is TeamsAddMemberLegacyResponse.Http422NoContent -> TeamsAddMemberLegacyApiException(response, statusCode, headers)
        is TeamsAddMemberLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * The "Add team member" endpoint (described below) is closing down.
   *
   * We recommend using the [Add or update team membership for a
   * user](https://docs.github.com/rest/teams/members#add-or-update-team-membership-for-a-user) endpoint instead. It
   * allows you to invite new organization members to your teams.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * To add someone to a team, the authenticated user must be an organization owner or a team maintainer in the team
   * they're changing. The person being added to the team must be a member of the team's organization.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see
   * "[HTTP method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun teamsAddMemberLegacyWithResponse(
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsAddMemberLegacyResponse> = executor.executeWithResponse<Unit, TeamsAddMemberLegacyResponse>(SdkExecutionRequest(teamsAddMemberLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), TeamsCodecs.teamsAddMemberLegacyRequestCodecRegistry, TeamsAddMemberLegacyResponseDecoder, options)

  /**
   * Adds an organization member to a team. An authenticated organization owner or team maintainer can add organization
   * members to a team.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * An organization owner can add someone who is not part of the team's organization to a team. When an organization
   * owner adds someone to a team who is not an organization member, this endpoint will send an invitation to the person
   * via email. This newly-created membership will be in the "pending" state until the person accepts the invitation, at
   * which point the membership will transition to the "active" state and the user will be added as a member of the
   * team.
   *
   * If the user is already a member of the team, this endpoint will update the role of the team member's role. To
   * update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `PUT
   * /organizations/{org_id}/team/{team_id}/memberships/{username}`.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsAddOrUpdateMembershipForUserInOrgApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded TeamsAddOrUpdateMembershipForUserInOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsAddOrUpdateMembershipForUserInOrg(
    request: InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e? = null,
    org: String,
    teamSlug: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): TeamMembership = executor.executeWithTypedErrors<InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e?, TeamsAddOrUpdateMembershipForUserInOrgResponse, TeamMembership>(
    request = SdkExecutionRequest(teamsAddOrUpdateMembershipForUserInOrgMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSADDORUPDATEMEMBERSHIPFORUSERINORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsAddOrUpdateMembershipForUserInOrgRequestCodecRegistry,
    responseDecoder = TeamsAddOrUpdateMembershipForUserInOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsAddOrUpdateMembershipForUserInOrgResponse.SuccessJson -> response.json
        is TeamsAddOrUpdateMembershipForUserInOrgResponse.Http403NoContent -> error("Runtime selected a non-success response for success mapping.")
        is TeamsAddOrUpdateMembershipForUserInOrgResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is TeamsAddOrUpdateMembershipForUserInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsAddOrUpdateMembershipForUserInOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsAddOrUpdateMembershipForUserInOrgResponse.Http403NoContent -> TeamsAddOrUpdateMembershipForUserInOrgApiException(response, statusCode, headers)
        is TeamsAddOrUpdateMembershipForUserInOrgResponse.Http422NoContent -> TeamsAddOrUpdateMembershipForUserInOrgApiException(response, statusCode, headers)
        is TeamsAddOrUpdateMembershipForUserInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds an organization member to a team. An authenticated organization owner or team maintainer can add organization
   * members to a team.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * An organization owner can add someone who is not part of the team's organization to a team. When an organization
   * owner adds someone to a team who is not an organization member, this endpoint will send an invitation to the person
   * via email. This newly-created membership will be in the "pending" state until the person accepts the invitation, at
   * which point the membership will transition to the "active" state and the user will be added as a member of the
   * team.
   *
   * If the user is already a member of the team, this endpoint will update the role of the team member's role. To
   * update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `PUT
   * /organizations/{org_id}/team/{team_id}/memberships/{username}`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun teamsAddOrUpdateMembershipForUserInOrgWithResponse(
    request: InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e? = null,
    org: String,
    teamSlug: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsAddOrUpdateMembershipForUserInOrgResponse> = executor.executeWithResponse<InlineOrgsTeamsMembershipsPutRequestJsonXfb20306e?, TeamsAddOrUpdateMembershipForUserInOrgResponse>(SdkExecutionRequest(teamsAddOrUpdateMembershipForUserInOrgMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSADDORUPDATEMEMBERSHIPFORUSERINORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), TeamsCodecs.teamsAddOrUpdateMembershipForUserInOrgRequestCodecRegistry, TeamsAddOrUpdateMembershipForUserInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Add or update team membership for a
   * user](https://docs.github.com/rest/teams/members#add-or-update-team-membership-for-a-user) endpoint.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * If the user is already a member of the team's organization, this endpoint will add the user to the team. To add a
   * membership between an organization member and a team, the authenticated user must be an organization owner or a
   * team maintainer.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * If the user is unaffiliated with the team's organization, this endpoint will send an invitation to the user via
   * email. This newly-created membership will be in the "pending" state until the user accepts the invitation, at which
   * point the membership will transition to the "active" state and the user will be added as a member of the team. To
   * add a membership between an unaffiliated user and a team, the authenticated user must be an organization owner.
   *
   * If the user is already a member of the team, this endpoint will update the role of the team member's role. To
   * update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.
   *
   * @param request Request body sent to the operation.
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsAddOrUpdateMembershipForUserLegacyApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded TeamsAddOrUpdateMembershipForUserLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsAddOrUpdateMembershipForUserLegacy(
    request: InlineTeamsMembershipsPutRequestJsonX1968695f? = null,
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): TeamMembership = executor.executeWithTypedErrors<InlineTeamsMembershipsPutRequestJsonX1968695f?, TeamsAddOrUpdateMembershipForUserLegacyResponse, TeamMembership>(
    request = SdkExecutionRequest(teamsAddOrUpdateMembershipForUserLegacyMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSADDORUPDATEMEMBERSHIPFORUSERLEGACY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsAddOrUpdateMembershipForUserLegacyRequestCodecRegistry,
    responseDecoder = TeamsAddOrUpdateMembershipForUserLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsAddOrUpdateMembershipForUserLegacyResponse.SuccessJson -> response.json
        is TeamsAddOrUpdateMembershipForUserLegacyResponse.Http403NoContent -> error("Runtime selected a non-success response for success mapping.")
        is TeamsAddOrUpdateMembershipForUserLegacyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsAddOrUpdateMembershipForUserLegacyResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is TeamsAddOrUpdateMembershipForUserLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsAddOrUpdateMembershipForUserLegacyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsAddOrUpdateMembershipForUserLegacyResponse.Http403NoContent -> TeamsAddOrUpdateMembershipForUserLegacyApiException(response, statusCode, headers)
        is TeamsAddOrUpdateMembershipForUserLegacyResponse.Http404Json -> TeamsAddOrUpdateMembershipForUserLegacyApiException(response, statusCode, headers)
        is TeamsAddOrUpdateMembershipForUserLegacyResponse.Http422NoContent -> TeamsAddOrUpdateMembershipForUserLegacyApiException(response, statusCode, headers)
        is TeamsAddOrUpdateMembershipForUserLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Add or update team membership for a
   * user](https://docs.github.com/rest/teams/members#add-or-update-team-membership-for-a-user) endpoint.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * If the user is already a member of the team's organization, this endpoint will add the user to the team. To add a
   * membership between an organization member and a team, the authenticated user must be an organization owner or a
   * team maintainer.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * If the user is unaffiliated with the team's organization, this endpoint will send an invitation to the user via
   * email. This newly-created membership will be in the "pending" state until the user accepts the invitation, at which
   * point the membership will transition to the "active" state and the user will be added as a member of the team. To
   * add a membership between an unaffiliated user and a team, the authenticated user must be an organization owner.
   *
   * If the user is already a member of the team, this endpoint will update the role of the team member's role. To
   * update the membership of a team member, the authenticated user must be an organization owner or a team maintainer.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun teamsAddOrUpdateMembershipForUserLegacyWithResponse(
    request: InlineTeamsMembershipsPutRequestJsonX1968695f? = null,
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsAddOrUpdateMembershipForUserLegacyResponse> = executor.executeWithResponse<InlineTeamsMembershipsPutRequestJsonX1968695f?, TeamsAddOrUpdateMembershipForUserLegacyResponse>(SdkExecutionRequest(teamsAddOrUpdateMembershipForUserLegacyMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSADDORUPDATEMEMBERSHIPFORUSERLEGACY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), TeamsCodecs.teamsAddOrUpdateMembershipForUserLegacyRequestCodecRegistry, TeamsAddOrUpdateMembershipForUserLegacyResponseDecoder, options)

  /**
   * To add a repository to a team or update the team's permission on a repository, the authenticated user must have
   * admin access to the repository, and must be able to see the team. The repository must be owned by the organization,
   * or a direct fork of a repository owned by the organization. You will get a `422 Unprocessable Entity` status if you
   * attempt to add a repository to a team that is not owned by the organization. Note that, if you choose not to pass
   * any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more
   * information, see "[HTTP
   * method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `PUT
   * /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}`.
   *
   * For more information about the permission levels, see "[Repository permission levels for an
   * organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/repository-permission-
   * levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)".
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsAddOrUpdateRepoPermissionsInOrg(
    request: InlineOrgsTeamsReposPutRequestJsonX41d9868d? = null,
    org: String,
    owner: String,
    repo: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<InlineOrgsTeamsReposPutRequestJsonX41d9868d?>(SdkExecutionRequest(teamsAddOrUpdateRepoPermissionsInOrgMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSADDORUPDATEREPOPERMISSIONSINORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
  }), TeamsCodecs.teamsAddOrUpdateRepoPermissionsInOrgRequestCodecRegistry, options)

  /**
   * To add a repository to a team or update the team's permission on a repository, the authenticated user must have
   * admin access to the repository, and must be able to see the team. The repository must be owned by the organization,
   * or a direct fork of a repository owned by the organization. You will get a `422 Unprocessable Entity` status if you
   * attempt to add a repository to a team that is not owned by the organization. Note that, if you choose not to pass
   * any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more
   * information, see "[HTTP
   * method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `PUT
   * /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}`.
   *
   * For more information about the permission levels, see "[Repository permission levels for an
   * organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/repository-permission-
   * levels-for-an-organization#permission-levels-for-repositories-owned-by-an-organization)".
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   */
  public suspend fun teamsAddOrUpdateRepoPermissionsInOrgWithResponse(
    request: InlineOrgsTeamsReposPutRequestJsonX41d9868d? = null,
    org: String,
    owner: String,
    repo: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsAddOrUpdateRepoPermissionsInOrgResponse> = executor.executeWithResponse<InlineOrgsTeamsReposPutRequestJsonX41d9868d?, TeamsAddOrUpdateRepoPermissionsInOrgResponse>(SdkExecutionRequest(teamsAddOrUpdateRepoPermissionsInOrgMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSADDORUPDATEREPOPERMISSIONSINORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
  }), TeamsCodecs.teamsAddOrUpdateRepoPermissionsInOrgRequestCodecRegistry, TeamsAddOrUpdateRepoPermissionsInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new "[Add or update team repository
   * permissions](https://docs.github.com/rest/teams/teams#add-or-update-team-repository-permissions)" endpoint.
   *
   * To add a repository to a team or update the team's permission on a repository, the authenticated user must have
   * admin access to the repository, and must be able to see the team. The repository must be owned by the organization,
   * or a direct fork of a repository owned by the organization. You will get a `422 Unprocessable Entity` status if you
   * attempt to add a repository to a team that is not owned by the organization.
   *
   * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out
   * to this endpoint. For more information, see "[HTTP
   * method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param teamId The unique identifier of the team.
   * @param options Execution options.
   * @return No response body.
   * @throws TeamsAddOrUpdateRepoPermissionsLegacyApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded TeamsAddOrUpdateRepoPermissionsLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsAddOrUpdateRepoPermissionsLegacy(
    request: InlineTeamsReposPutRequestJsonXb6898014? = null,
    owner: String,
    repo: String,
    teamId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<InlineTeamsReposPutRequestJsonXb6898014?, TeamsAddOrUpdateRepoPermissionsLegacyResponse, Unit>(
    request = SdkExecutionRequest(teamsAddOrUpdateRepoPermissionsLegacyMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSADDORUPDATEREPOPERMISSIONSLEGACY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsAddOrUpdateRepoPermissionsLegacyRequestCodecRegistry,
    responseDecoder = TeamsAddOrUpdateRepoPermissionsLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsAddOrUpdateRepoPermissionsLegacyResponse.SuccessNoContent -> response.unit
        is TeamsAddOrUpdateRepoPermissionsLegacyResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsAddOrUpdateRepoPermissionsLegacyResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsAddOrUpdateRepoPermissionsLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsAddOrUpdateRepoPermissionsLegacyResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is TeamsAddOrUpdateRepoPermissionsLegacyResponse.Http403Json -> TeamsAddOrUpdateRepoPermissionsLegacyApiException(response, statusCode, headers)
        is TeamsAddOrUpdateRepoPermissionsLegacyResponse.Http422Json -> TeamsAddOrUpdateRepoPermissionsLegacyApiException(response, statusCode, headers)
        is TeamsAddOrUpdateRepoPermissionsLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new "[Add or update team repository
   * permissions](https://docs.github.com/rest/teams/teams#add-or-update-team-repository-permissions)" endpoint.
   *
   * To add a repository to a team or update the team's permission on a repository, the authenticated user must have
   * admin access to the repository, and must be able to see the team. The repository must be owned by the organization,
   * or a direct fork of a repository owned by the organization. You will get a `422 Unprocessable Entity` status if you
   * attempt to add a repository to a team that is not owned by the organization.
   *
   * Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out
   * to this endpoint. For more information, see "[HTTP
   * method](https://docs.github.com/rest/guides/getting-started-with-the-rest-api#http-method)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param teamId The unique identifier of the team.
   * @param options Execution options.
   */
  public suspend fun teamsAddOrUpdateRepoPermissionsLegacyWithResponse(
    request: InlineTeamsReposPutRequestJsonXb6898014? = null,
    owner: String,
    repo: String,
    teamId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsAddOrUpdateRepoPermissionsLegacyResponse> = executor.executeWithResponse<InlineTeamsReposPutRequestJsonXb6898014?, TeamsAddOrUpdateRepoPermissionsLegacyResponse>(SdkExecutionRequest(teamsAddOrUpdateRepoPermissionsLegacyMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSADDORUPDATEREPOPERMISSIONSLEGACY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
  }), TeamsCodecs.teamsAddOrUpdateRepoPermissionsLegacyRequestCodecRegistry, TeamsAddOrUpdateRepoPermissionsLegacyResponseDecoder, options)

  /**
   * Checks whether a team has `admin`, `push`, `maintain`, `triage`, or `pull` permission for a repository.
   * Repositories inherited through a parent team will also be checked.
   *
   * You can also get information about the specified repository, including what permissions the team grants on it, by
   * passing the following custom [media
   * type](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types/) via the
   * `application/vnd.github.v3.repository+json` accept header.
   *
   * If a team doesn't have permission for the repository, you will receive a `404 Not Found` response status.
   *
   * If the repository is private, you must have at least `read` permission for that repository, and your token must
   * have the `repo` or `admin:org` scope. Otherwise, you will receive a `404 Not Found` response status.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `GET
   * /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}`.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   */
  public suspend fun teamsCheckPermissionsForRepoInOrgWithResponse(
    org: String,
    owner: String,
    repo: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsCheckPermissionsForRepoInOrgResponse> = executor.executeWithResponse<Unit, TeamsCheckPermissionsForRepoInOrgResponse>(SdkExecutionRequest(teamsCheckPermissionsForRepoInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
  }), TeamsCodecs.teamsCheckPermissionsForRepoInOrgRequestCodecRegistry, TeamsCheckPermissionsForRepoInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Check team permissions for a
   * repository](https://docs.github.com/rest/teams/teams#check-team-permissions-for-a-repository) endpoint.
   *
   * > [!NOTE]
   * > Repositories inherited through a parent team will also be checked.
   *
   * You can also get information about the specified repository, including what permissions the team grants on it, by
   * passing the following custom [media
   * type](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types/) via the
   * `Accept` header:
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param teamId The unique identifier of the team.
   * @param options Execution options.
   */
  public suspend fun teamsCheckPermissionsForRepoLegacyWithResponse(
    owner: String,
    repo: String,
    teamId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsCheckPermissionsForRepoLegacyResponse> = executor.executeWithResponse<Unit, TeamsCheckPermissionsForRepoLegacyResponse>(SdkExecutionRequest(teamsCheckPermissionsForRepoLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
  }), TeamsCodecs.teamsCheckPermissionsForRepoLegacyRequestCodecRegistry, TeamsCheckPermissionsForRepoLegacyResponseDecoder, options)

  /**
   * To create a team, the authenticated user must be a member or owner of `{org}`. By default, organization members can
   * create teams. Organization owners can limit team creation to organization owners. For more information, see
   * "[Setting team creation
   * permissions](https://docs.github.com/articles/setting-team-creation-permissions-in-your-organization)."
   *
   * When you create a new team, you automatically become a team maintainer without explicitly adding yourself to the
   * optional array of `maintainers`. For more information, see "[About
   * teams](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/about-teams)".
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsCreateApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded TeamsCreateError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsCreate(
    request: InlineOrgsTeamsPostRequestJsonXa6db8b97,
    org: String,
    options: CallOptions = CallOptions(),
  ): TeamFull = executor.executeWithTypedErrors<InlineOrgsTeamsPostRequestJsonXa6db8b97, TeamsCreateResponse, TeamFull>(
    request = SdkExecutionRequest(teamsCreateMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSCREATE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsCreateRequestCodecRegistry,
    responseDecoder = TeamsCreateResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsCreateResponse.SuccessJson -> response.json
        is TeamsCreateResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsCreateResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsCreateResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsCreateResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsCreateResponse.Http403Json -> TeamsCreateApiException(response, statusCode, headers)
        is TeamsCreateResponse.Http422Json -> TeamsCreateApiException(response, statusCode, headers)
        is TeamsCreateResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * To create a team, the authenticated user must be a member or owner of `{org}`. By default, organization members can
   * create teams. Organization owners can limit team creation to organization owners. For more information, see
   * "[Setting team creation
   * permissions](https://docs.github.com/articles/setting-team-creation-permissions-in-your-organization)."
   *
   * When you create a new team, you automatically become a team maintainer without explicitly adding yourself to the
   * optional array of `maintainers`. For more information, see "[About
   * teams](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/about-teams)".
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun teamsCreateWithResponse(
    request: InlineOrgsTeamsPostRequestJsonXa6db8b97,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsCreateResponse> = executor.executeWithResponse<InlineOrgsTeamsPostRequestJsonXa6db8b97, TeamsCreateResponse>(SdkExecutionRequest(teamsCreateMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSCREATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), TeamsCodecs.teamsCreateRequestCodecRegistry, TeamsCreateResponseDecoder, options)

  /**
   * To delete a team, the authenticated user must be an organization owner or team maintainer.
   *
   * If you are an organization owner, deleting a parent team will delete all of its child teams as well.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `DELETE
   * /organizations/{org_id}/team/{team_id}`.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   * @return No response body.
   * @throws TeamsDeleteInOrgApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded TeamsDeleteInOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsDeleteInOrg(
    org: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, TeamsDeleteInOrgResponse, Unit>(
    request = SdkExecutionRequest(teamsDeleteInOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsDeleteInOrgRequestCodecRegistry,
    responseDecoder = TeamsDeleteInOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsDeleteInOrgResponse.SuccessNoContent -> response.unit
        is TeamsDeleteInOrgResponse.Http422NoContent -> response.unit
        is TeamsDeleteInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsDeleteInOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is TeamsDeleteInOrgResponse.Http422NoContent -> TeamsDeleteInOrgApiException(response, statusCode, headers)
        is TeamsDeleteInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * To delete a team, the authenticated user must be an organization owner or team maintainer.
   *
   * If you are an organization owner, deleting a parent team will delete all of its child teams as well.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `DELETE
   * /organizations/{org_id}/team/{team_id}`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   */
  public suspend fun teamsDeleteInOrgWithResponse(
    org: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsDeleteInOrgResponse> = executor.executeWithResponse<Unit, TeamsDeleteInOrgResponse>(SdkExecutionRequest(teamsDeleteInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
  }), TeamsCodecs.teamsDeleteInOrgRequestCodecRegistry, TeamsDeleteInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Delete a
   * team](https://docs.github.com/rest/teams/teams#delete-a-team) endpoint.
   *
   * To delete a team, the authenticated user must be an organization owner or team maintainer.
   *
   * If you are an organization owner, deleting a parent team will delete all of its child teams as well.
   *
   * @param teamId The unique identifier of the team.
   * @param options Execution options.
   * @return No response body.
   * @throws TeamsDeleteLegacyApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded TeamsDeleteLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsDeleteLegacy(teamId: Int, options: CallOptions = CallOptions()): Unit = executor.executeWithTypedErrors<Unit, TeamsDeleteLegacyResponse, Unit>(
    request = SdkExecutionRequest(teamsDeleteLegacyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsDeleteLegacyRequestCodecRegistry,
    responseDecoder = TeamsDeleteLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsDeleteLegacyResponse.SuccessNoContent -> response.unit
        is TeamsDeleteLegacyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsDeleteLegacyResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsDeleteLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsDeleteLegacyResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is TeamsDeleteLegacyResponse.Http404Json -> TeamsDeleteLegacyApiException(response, statusCode, headers)
        is TeamsDeleteLegacyResponse.Http422Json -> TeamsDeleteLegacyApiException(response, statusCode, headers)
        is TeamsDeleteLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Delete a
   * team](https://docs.github.com/rest/teams/teams#delete-a-team) endpoint.
   *
   * To delete a team, the authenticated user must be an organization owner or team maintainer.
   *
   * If you are an organization owner, deleting a parent team will delete all of its child teams as well.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param teamId The unique identifier of the team.
   * @param options Execution options.
   */
  public suspend fun teamsDeleteLegacyWithResponse(teamId: Int, options: CallOptions = CallOptions()): SdkResponseResult<TeamsDeleteLegacyResponse> = executor.executeWithResponse<Unit, TeamsDeleteLegacyResponse>(SdkExecutionRequest(teamsDeleteLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
  }), TeamsCodecs.teamsDeleteLegacyRequestCodecRegistry, TeamsDeleteLegacyResponseDecoder, options)

  /**
   * Gets a team using the team's `slug`. To create the `slug`, GitHub replaces special characters in the `name` string,
   * changes all words to lowercase, and replaces spaces with a `-` separator. For example, `"My TEam Näme"` would
   * become `my-team-name`.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `GET
   * /organizations/{org_id}/team/{team_id}`.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsGetByNameApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded TeamsGetByNameError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsGetByName(
    org: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): TeamFull = executor.executeWithTypedErrors<Unit, TeamsGetByNameResponse, TeamFull>(
    request = SdkExecutionRequest(teamsGetByNameMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsGetByNameRequestCodecRegistry,
    responseDecoder = TeamsGetByNameResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsGetByNameResponse.SuccessJson -> response.json
        is TeamsGetByNameResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsGetByNameResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsGetByNameResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsGetByNameResponse.Http404Json -> TeamsGetByNameApiException(response, statusCode, headers)
        is TeamsGetByNameResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a team using the team's `slug`. To create the `slug`, GitHub replaces special characters in the `name` string,
   * changes all words to lowercase, and replaces spaces with a `-` separator. For example, `"My TEam Näme"` would
   * become `my-team-name`.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `GET
   * /organizations/{org_id}/team/{team_id}`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   */
  public suspend fun teamsGetByNameWithResponse(
    org: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsGetByNameResponse> = executor.executeWithResponse<Unit, TeamsGetByNameResponse>(SdkExecutionRequest(teamsGetByNameMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
  }), TeamsCodecs.teamsGetByNameRequestCodecRegistry, TeamsGetByNameResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the [Get a team by
   * name](https://docs.github.com/rest/teams/teams#get-a-team-by-name) endpoint.
   *
   * @param teamId The unique identifier of the team.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsGetLegacyApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded TeamsGetLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsGetLegacy(teamId: Int, options: CallOptions = CallOptions()): TeamFull = executor.executeWithTypedErrors<Unit, TeamsGetLegacyResponse, TeamFull>(
    request = SdkExecutionRequest(teamsGetLegacyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsGetLegacyRequestCodecRegistry,
    responseDecoder = TeamsGetLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsGetLegacyResponse.SuccessJson -> response.json
        is TeamsGetLegacyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsGetLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsGetLegacyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsGetLegacyResponse.Http404Json -> TeamsGetLegacyApiException(response, statusCode, headers)
        is TeamsGetLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the [Get a team by
   * name](https://docs.github.com/rest/teams/teams#get-a-team-by-name) endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param teamId The unique identifier of the team.
   * @param options Execution options.
   */
  public suspend fun teamsGetLegacyWithResponse(teamId: Int, options: CallOptions = CallOptions()): SdkResponseResult<TeamsGetLegacyResponse> = executor.executeWithResponse<Unit, TeamsGetLegacyResponse>(SdkExecutionRequest(teamsGetLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
  }), TeamsCodecs.teamsGetLegacyRequestCodecRegistry, TeamsGetLegacyResponseDecoder, options)

  /**
   * The "Get team member" endpoint (described below) is closing down.
   *
   * We recommend using the [Get team membership for a
   * user](https://docs.github.com/rest/teams/members#get-team-membership-for-a-user) endpoint instead. It allows you to
   * get both active and pending memberships.
   *
   * To list members in a team, the team must be visible to the authenticated user.
   *
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return No response body.
   * @throws TeamsGetMemberLegacyApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded TeamsGetMemberLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsGetMemberLegacy(
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, TeamsGetMemberLegacyResponse, Unit>(
    request = SdkExecutionRequest(teamsGetMemberLegacyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsGetMemberLegacyRequestCodecRegistry,
    responseDecoder = TeamsGetMemberLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsGetMemberLegacyResponse.SuccessNoContent -> response.unit
        is TeamsGetMemberLegacyResponse.Http404NoContent -> response.unit
        is TeamsGetMemberLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsGetMemberLegacyResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is TeamsGetMemberLegacyResponse.Http404NoContent -> TeamsGetMemberLegacyApiException(response, statusCode, headers)
        is TeamsGetMemberLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * The "Get team member" endpoint (described below) is closing down.
   *
   * We recommend using the [Get team membership for a
   * user](https://docs.github.com/rest/teams/members#get-team-membership-for-a-user) endpoint instead. It allows you to
   * get both active and pending memberships.
   *
   * To list members in a team, the team must be visible to the authenticated user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun teamsGetMemberLegacyWithResponse(
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsGetMemberLegacyResponse> = executor.executeWithResponse<Unit, TeamsGetMemberLegacyResponse>(SdkExecutionRequest(teamsGetMemberLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), TeamsCodecs.teamsGetMemberLegacyRequestCodecRegistry, TeamsGetMemberLegacyResponseDecoder, options)

  /**
   * Team members will include the members of child teams.
   *
   * To get a user's membership with a team, the team must be visible to the authenticated user.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `GET
   * /organizations/{org_id}/team/{team_id}/memberships/{username}`.
   *
   * > [!NOTE]
   * > The response contains the `state` of the membership and the member's `role`.
   *
   * The `role` for organization owners is set to `maintainer`. For more information about `maintainer` roles, see
   * [Create a team](https://docs.github.com/rest/teams/teams#create-a-team).
   *
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsGetMembershipForUserInOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded TeamsGetMembershipForUserInOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsGetMembershipForUserInOrg(
    org: String,
    teamSlug: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): TeamMembership = executor.executeWithTypedErrors<Unit, TeamsGetMembershipForUserInOrgResponse, TeamMembership>(
    request = SdkExecutionRequest(teamsGetMembershipForUserInOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsGetMembershipForUserInOrgRequestCodecRegistry,
    responseDecoder = TeamsGetMembershipForUserInOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsGetMembershipForUserInOrgResponse.SuccessJson -> response.json
        is TeamsGetMembershipForUserInOrgResponse.Http404NoContent -> error("Runtime selected a non-success response for success mapping.")
        is TeamsGetMembershipForUserInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsGetMembershipForUserInOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsGetMembershipForUserInOrgResponse.Http404NoContent -> TeamsGetMembershipForUserInOrgApiException(response, statusCode, headers)
        is TeamsGetMembershipForUserInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Team members will include the members of child teams.
   *
   * To get a user's membership with a team, the team must be visible to the authenticated user.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `GET
   * /organizations/{org_id}/team/{team_id}/memberships/{username}`.
   *
   * > [!NOTE]
   * > The response contains the `state` of the membership and the member's `role`.
   *
   * The `role` for organization owners is set to `maintainer`. For more information about `maintainer` roles, see
   * [Create a team](https://docs.github.com/rest/teams/teams#create-a-team).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun teamsGetMembershipForUserInOrgWithResponse(
    org: String,
    teamSlug: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsGetMembershipForUserInOrgResponse> = executor.executeWithResponse<Unit, TeamsGetMembershipForUserInOrgResponse>(SdkExecutionRequest(teamsGetMembershipForUserInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), TeamsCodecs.teamsGetMembershipForUserInOrgRequestCodecRegistry, TeamsGetMembershipForUserInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Get team membership for a
   * user](https://docs.github.com/rest/teams/members#get-team-membership-for-a-user) endpoint.
   *
   * Team members will include the members of child teams.
   *
   * To get a user's membership with a team, the team must be visible to the authenticated user.
   *
   * **Note:**
   * The response contains the `state` of the membership and the member's `role`.
   *
   * The `role` for organization owners is set to `maintainer`. For more information about `maintainer` roles, see
   * [Create a team](https://docs.github.com/rest/teams/teams#create-a-team).
   *
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsGetMembershipForUserLegacyApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded TeamsGetMembershipForUserLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsGetMembershipForUserLegacy(
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): TeamMembership = executor.executeWithTypedErrors<Unit, TeamsGetMembershipForUserLegacyResponse, TeamMembership>(
    request = SdkExecutionRequest(teamsGetMembershipForUserLegacyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsGetMembershipForUserLegacyRequestCodecRegistry,
    responseDecoder = TeamsGetMembershipForUserLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsGetMembershipForUserLegacyResponse.SuccessJson -> response.json
        is TeamsGetMembershipForUserLegacyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsGetMembershipForUserLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsGetMembershipForUserLegacyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsGetMembershipForUserLegacyResponse.Http404Json -> TeamsGetMembershipForUserLegacyApiException(response, statusCode, headers)
        is TeamsGetMembershipForUserLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Get team membership for a
   * user](https://docs.github.com/rest/teams/members#get-team-membership-for-a-user) endpoint.
   *
   * Team members will include the members of child teams.
   *
   * To get a user's membership with a team, the team must be visible to the authenticated user.
   *
   * **Note:**
   * The response contains the `state` of the membership and the member's `role`.
   *
   * The `role` for organization owners is set to `maintainer`. For more information about `maintainer` roles, see
   * [Create a team](https://docs.github.com/rest/teams/teams#create-a-team).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun teamsGetMembershipForUserLegacyWithResponse(
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsGetMembershipForUserLegacyResponse> = executor.executeWithResponse<Unit, TeamsGetMembershipForUserLegacyResponse>(SdkExecutionRequest(teamsGetMembershipForUserLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), TeamsCodecs.teamsGetMembershipForUserLegacyRequestCodecRegistry, TeamsGetMembershipForUserLegacyResponseDecoder, options)

  /**
   * Lists all teams in an organization that are visible to the authenticated user.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param teamType Filter team results by their type. For more information, see "[What kind of team should I
   * use?](https://docs.github.com/enterprise-cloud@latest/admin/concepts/enterprise-fundamentals/teams-in-an-enterprise
   * #what-kind-of-team-should-i-use)"
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsListApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded TeamsListError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsList(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    teamType: InlineTeamTypeParameterXa413f3b6? = null,
    options: CallOptions = CallOptions(),
  ): List<Team> = executor.executeWithTypedErrors<Unit, TeamsListResponse, List<Team>>(
    request = SdkExecutionRequest(teamsListMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "team_type", values = teamType?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = TeamsCodecs.teamsListRequestCodecRegistry,
    responseDecoder = TeamsListResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsListResponse.SuccessJson -> response.json
        is TeamsListResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsListResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsListResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsListResponse.Http403Json -> TeamsListApiException(response, statusCode, headers)
        is TeamsListResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all teams in an organization that are visible to the authenticated user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param teamType Filter team results by their type. For more information, see "[What kind of team should I
   * use?](https://docs.github.com/enterprise-cloud@latest/admin/concepts/enterprise-fundamentals/teams-in-an-enterprise
   * #what-kind-of-team-should-i-use)"
   * @param options Execution options.
   */
  public suspend fun teamsListWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    teamType: InlineTeamTypeParameterXa413f3b6? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsListResponse> = executor.executeWithResponse<Unit, TeamsListResponse>(SdkExecutionRequest(teamsListMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "team_type", values = teamType?.let { listOf(it.toString()) }.orEmpty()))
  }), TeamsCodecs.teamsListRequestCodecRegistry, TeamsListResponseDecoder, options)

  /**
   * Lists the child teams of the team specified by `{team_slug}`.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `GET
   * /organizations/{org_id}/team/{team_id}/teams`.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
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
  public suspend fun teamsListChildInOrg(
    org: String,
    teamSlug: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Team> = executor.execute<Unit, List<Team>>(SdkExecutionRequest(teamsListChildInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(TeamsCodecs.TEAMSLISTCHILDINORG_RESPONSE_CODEC_ID), TeamsCodecs.teamsListChildInOrgRequestCodecRegistry, TeamsCodecs.teamsListChildInOrgResponseCodecRegistry, options)

  /**
   * Lists the child teams of the team specified by `{team_slug}`.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `GET
   * /organizations/{org_id}/team/{team_id}/teams`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun teamsListChildInOrgWithResponse(
    org: String,
    teamSlug: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsListChildInOrgResponse> = executor.executeWithResponse<Unit, TeamsListChildInOrgResponse>(SdkExecutionRequest(teamsListChildInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), TeamsCodecs.teamsListChildInOrgRequestCodecRegistry, TeamsListChildInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [`List child
   * teams`](https://docs.github.com/rest/teams/teams#list-child-teams) endpoint.
   *
   * @param teamId The unique identifier of the team.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsListChildLegacyApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded TeamsListChildLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsListChildLegacy(
    teamId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<Team> = executor.executeWithTypedErrors<Unit, TeamsListChildLegacyResponse, List<Team>>(
    request = SdkExecutionRequest(teamsListChildLegacyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = TeamsCodecs.teamsListChildLegacyRequestCodecRegistry,
    responseDecoder = TeamsListChildLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsListChildLegacyResponse.SuccessJson -> response.json
        is TeamsListChildLegacyResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsListChildLegacyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsListChildLegacyResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsListChildLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsListChildLegacyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsListChildLegacyResponse.Http403Json -> TeamsListChildLegacyApiException(response, statusCode, headers)
        is TeamsListChildLegacyResponse.Http404Json -> TeamsListChildLegacyApiException(response, statusCode, headers)
        is TeamsListChildLegacyResponse.Http422Json -> TeamsListChildLegacyApiException(response, statusCode, headers)
        is TeamsListChildLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [`List child
   * teams`](https://docs.github.com/rest/teams/teams#list-child-teams) endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param teamId The unique identifier of the team.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun teamsListChildLegacyWithResponse(
    teamId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsListChildLegacyResponse> = executor.executeWithResponse<Unit, TeamsListChildLegacyResponse>(SdkExecutionRequest(teamsListChildLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), TeamsCodecs.teamsListChildLegacyRequestCodecRegistry, TeamsListChildLegacyResponseDecoder, options)

  /**
   * List all of the teams across all of the organizations to which the authenticated
   * user belongs.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user`, `repo`, or `read:org` scope to use this
   * endpoint.
   *
   * When using a fine-grained personal access token, the resource owner of the token must be a single organization, and
   * the response will only include the teams from that organization.
   *
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsListForAuthenticatedUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded TeamsListForAuthenticatedUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsListForAuthenticatedUser(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<TeamFull> = executor.executeWithTypedErrors<Unit, TeamsListForAuthenticatedUserResponse, List<TeamFull>>(
    request = SdkExecutionRequest(teamsListForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = TeamsCodecs.teamsListForAuthenticatedUserRequestCodecRegistry,
    responseDecoder = TeamsListForAuthenticatedUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsListForAuthenticatedUserResponse.SuccessJson -> response.json
        is TeamsListForAuthenticatedUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is TeamsListForAuthenticatedUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsListForAuthenticatedUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsListForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsListForAuthenticatedUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsListForAuthenticatedUserResponse.Http304NoContent -> TeamsListForAuthenticatedUserApiException(response, statusCode, headers)
        is TeamsListForAuthenticatedUserResponse.Http403Json -> TeamsListForAuthenticatedUserApiException(response, statusCode, headers)
        is TeamsListForAuthenticatedUserResponse.Http404Json -> TeamsListForAuthenticatedUserApiException(response, statusCode, headers)
        is TeamsListForAuthenticatedUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all of the teams across all of the organizations to which the authenticated
   * user belongs.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user`, `repo`, or `read:org` scope to use this
   * endpoint.
   *
   * When using a fine-grained personal access token, the resource owner of the token must be a single organization, and
   * the response will only include the teams from that organization.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun teamsListForAuthenticatedUserWithResponse(
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsListForAuthenticatedUserResponse> = executor.executeWithResponse<Unit, TeamsListForAuthenticatedUserResponse>(SdkExecutionRequest(teamsListForAuthenticatedUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), TeamsCodecs.teamsListForAuthenticatedUserRequestCodecRegistry, TeamsListForAuthenticatedUserResponseDecoder, options)

  /**
   * Team members will include the members of child teams.
   *
   * Each member includes their `role` on the team (`member` or `maintainer`) and an `inherited` flag indicating whether
   * the membership is inherited from a child team (`true`) or is a direct membership (`false`). These fields let you
   * read a member's role and direct/inherited status without additional requests.
   *
   * To list members in a team, the team must be visible to the authenticated user.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param role Filters members returned by their role in the team.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsListMembersInOrg(
    org: String,
    teamSlug: String,
    page: Int? = null,
    perPage: Int? = null,
    role: InlineOrgsTeamsMembersGetParameterXeb377714? = null,
    options: CallOptions = CallOptions(),
  ): List<TeamMember> = executor.execute<Unit, List<TeamMember>>(SdkExecutionRequest(teamsListMembersInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "role", values = role?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(TeamsCodecs.TEAMSLISTMEMBERSINORG_RESPONSE_CODEC_ID), TeamsCodecs.teamsListMembersInOrgRequestCodecRegistry, TeamsCodecs.teamsListMembersInOrgResponseCodecRegistry, options)

  /**
   * Team members will include the members of child teams.
   *
   * Each member includes their `role` on the team (`member` or `maintainer`) and an `inherited` flag indicating whether
   * the membership is inherited from a child team (`true`) or is a direct membership (`false`). These fields let you
   * read a member's role and direct/inherited status without additional requests.
   *
   * To list members in a team, the team must be visible to the authenticated user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param role Filters members returned by their role in the team.
   * @param options Execution options.
   */
  public suspend fun teamsListMembersInOrgWithResponse(
    org: String,
    teamSlug: String,
    page: Int? = null,
    perPage: Int? = null,
    role: InlineOrgsTeamsMembersGetParameterXeb377714? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsListMembersInOrgResponse> = executor.executeWithResponse<Unit, TeamsListMembersInOrgResponse>(SdkExecutionRequest(teamsListMembersInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "role", values = role?.let { listOf(it.toString()) }.orEmpty()))
  }), TeamsCodecs.teamsListMembersInOrgRequestCodecRegistry, TeamsListMembersInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [`List team
   * members`](https://docs.github.com/rest/teams/members#list-team-members) endpoint.
   *
   * Team members will include the members of child teams.
   *
   * Each member includes their `role` on the team (`member` or `maintainer`) and an `inherited` flag indicating whether
   * the membership is inherited from a child team (`true`) or is a direct membership (`false`).
   *
   * @param teamId The unique identifier of the team.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param role Filters members returned by their role in the team.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsListMembersLegacyApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded TeamsListMembersLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsListMembersLegacy(
    teamId: Int,
    page: Int? = null,
    perPage: Int? = null,
    role: InlineTeamsMembersGetParameterXfe84a019? = null,
    options: CallOptions = CallOptions(),
  ): List<TeamMember> = executor.executeWithTypedErrors<Unit, TeamsListMembersLegacyResponse, List<TeamMember>>(
    request = SdkExecutionRequest(teamsListMembersLegacyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "role", values = role?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = TeamsCodecs.teamsListMembersLegacyRequestCodecRegistry,
    responseDecoder = TeamsListMembersLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsListMembersLegacyResponse.SuccessJson -> response.json
        is TeamsListMembersLegacyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsListMembersLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsListMembersLegacyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsListMembersLegacyResponse.Http404Json -> TeamsListMembersLegacyApiException(response, statusCode, headers)
        is TeamsListMembersLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [`List team
   * members`](https://docs.github.com/rest/teams/members#list-team-members) endpoint.
   *
   * Team members will include the members of child teams.
   *
   * Each member includes their `role` on the team (`member` or `maintainer`) and an `inherited` flag indicating whether
   * the membership is inherited from a child team (`true`) or is a direct membership (`false`).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param teamId The unique identifier of the team.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param role Filters members returned by their role in the team.
   * @param options Execution options.
   */
  public suspend fun teamsListMembersLegacyWithResponse(
    teamId: Int,
    page: Int? = null,
    perPage: Int? = null,
    role: InlineTeamsMembersGetParameterXfe84a019? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsListMembersLegacyResponse> = executor.executeWithResponse<Unit, TeamsListMembersLegacyResponse>(SdkExecutionRequest(teamsListMembersLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "role", values = role?.let { listOf(it.toString()) }.orEmpty()))
  }), TeamsCodecs.teamsListMembersLegacyRequestCodecRegistry, TeamsListMembersLegacyResponseDecoder, options)

  /**
   * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the
   * following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is
   * not a GitHub member, the `login` field in the return hash will be `null`.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `GET
   * /organizations/{org_id}/team/{team_id}/invitations`.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsListPendingInvitationsInOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded TeamsListPendingInvitationsInOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsListPendingInvitationsInOrg(
    org: String,
    teamSlug: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<OrganizationInvitation> = executor.executeWithTypedErrors<Unit, TeamsListPendingInvitationsInOrgResponse, List<OrganizationInvitation>>(
    request = SdkExecutionRequest(teamsListPendingInvitationsInOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = TeamsCodecs.teamsListPendingInvitationsInOrgRequestCodecRegistry,
    responseDecoder = TeamsListPendingInvitationsInOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsListPendingInvitationsInOrgResponse.SuccessJson -> response.json
        is TeamsListPendingInvitationsInOrgResponse.Http422NoContent -> error("Runtime selected a non-success response for success mapping.")
        is TeamsListPendingInvitationsInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsListPendingInvitationsInOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsListPendingInvitationsInOrgResponse.Http422NoContent -> TeamsListPendingInvitationsInOrgApiException(response, statusCode, headers)
        is TeamsListPendingInvitationsInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the
   * following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is
   * not a GitHub member, the `login` field in the return hash will be `null`.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `GET
   * /organizations/{org_id}/team/{team_id}/invitations`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun teamsListPendingInvitationsInOrgWithResponse(
    org: String,
    teamSlug: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsListPendingInvitationsInOrgResponse> = executor.executeWithResponse<Unit, TeamsListPendingInvitationsInOrgResponse>(SdkExecutionRequest(teamsListPendingInvitationsInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), TeamsCodecs.teamsListPendingInvitationsInOrgRequestCodecRegistry, TeamsListPendingInvitationsInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [`List pending team
   * invitations`](https://docs.github.com/rest/teams/members#list-pending-team-invitations) endpoint.
   *
   * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the
   * following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is
   * not a GitHub member, the `login` field in the return hash will be `null`.
   *
   * @param teamId The unique identifier of the team.
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
  public suspend fun teamsListPendingInvitationsLegacy(
    teamId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<OrganizationInvitation> = executor.execute<Unit, List<OrganizationInvitation>>(SdkExecutionRequest(teamsListPendingInvitationsLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(TeamsCodecs.TEAMSLISTPENDINGINVITATIONSLEGACY_RESPONSE_CODEC_ID), TeamsCodecs.teamsListPendingInvitationsLegacyRequestCodecRegistry, TeamsCodecs.teamsListPendingInvitationsLegacyResponseCodecRegistry, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [`List pending team
   * invitations`](https://docs.github.com/rest/teams/members#list-pending-team-invitations) endpoint.
   *
   * The return hash contains a `role` field which refers to the Organization Invitation role and will be one of the
   * following values: `direct_member`, `admin`, `billing_manager`, `hiring_manager`, or `reinstate`. If the invitee is
   * not a GitHub member, the `login` field in the return hash will be `null`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param teamId The unique identifier of the team.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun teamsListPendingInvitationsLegacyWithResponse(
    teamId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsListPendingInvitationsLegacyResponse> = executor.executeWithResponse<Unit, TeamsListPendingInvitationsLegacyResponse>(SdkExecutionRequest(teamsListPendingInvitationsLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), TeamsCodecs.teamsListPendingInvitationsLegacyRequestCodecRegistry, TeamsListPendingInvitationsLegacyResponseDecoder, options)

  /**
   * Lists a team's repositories visible to the authenticated user.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `GET
   * /organizations/{org_id}/team/{team_id}/repos`.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
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
  public suspend fun teamsListReposInOrg(
    org: String,
    teamSlug: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<MinimalRepository> = executor.execute<Unit, List<MinimalRepository>>(SdkExecutionRequest(teamsListReposInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(TeamsCodecs.TEAMSLISTREPOSINORG_RESPONSE_CODEC_ID), TeamsCodecs.teamsListReposInOrgRequestCodecRegistry, TeamsCodecs.teamsListReposInOrgResponseCodecRegistry, options)

  /**
   * Lists a team's repositories visible to the authenticated user.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `GET
   * /organizations/{org_id}/team/{team_id}/repos`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun teamsListReposInOrgWithResponse(
    org: String,
    teamSlug: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsListReposInOrgResponse> = executor.executeWithResponse<Unit, TeamsListReposInOrgResponse>(SdkExecutionRequest(teamsListReposInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), TeamsCodecs.teamsListReposInOrgRequestCodecRegistry, TeamsListReposInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [List team
   * repositories](https://docs.github.com/rest/teams/teams#list-team-repositories) endpoint.
   *
   * @param teamId The unique identifier of the team.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsListReposLegacyApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded TeamsListReposLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsListReposLegacy(
    teamId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<MinimalRepository> = executor.executeWithTypedErrors<Unit, TeamsListReposLegacyResponse, List<MinimalRepository>>(
    request = SdkExecutionRequest(teamsListReposLegacyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = TeamsCodecs.teamsListReposLegacyRequestCodecRegistry,
    responseDecoder = TeamsListReposLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsListReposLegacyResponse.SuccessJson -> response.json
        is TeamsListReposLegacyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsListReposLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsListReposLegacyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsListReposLegacyResponse.Http404Json -> TeamsListReposLegacyApiException(response, statusCode, headers)
        is TeamsListReposLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [List team
   * repositories](https://docs.github.com/rest/teams/teams#list-team-repositories) endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param teamId The unique identifier of the team.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun teamsListReposLegacyWithResponse(
    teamId: Int,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsListReposLegacyResponse> = executor.executeWithResponse<Unit, TeamsListReposLegacyResponse>(SdkExecutionRequest(teamsListReposLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), TeamsCodecs.teamsListReposLegacyRequestCodecRegistry, TeamsListReposLegacyResponseDecoder, options)

  /**
   * The "Remove team member" endpoint (described below) is closing down.
   *
   * We recommend using the [Remove team membership for a
   * user](https://docs.github.com/rest/teams/members#remove-team-membership-for-a-user) endpoint instead. It allows you
   * to remove both active and pending memberships.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * To remove a team member, the authenticated user must have 'admin' permissions to the team or be an owner of the org
   * that the team is associated with. Removing a team member does not delete the user, it just removes them from the
   * team.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return No response body.
   * @throws TeamsRemoveMemberLegacyApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded TeamsRemoveMemberLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsRemoveMemberLegacy(
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, TeamsRemoveMemberLegacyResponse, Unit>(
    request = SdkExecutionRequest(teamsRemoveMemberLegacyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsRemoveMemberLegacyRequestCodecRegistry,
    responseDecoder = TeamsRemoveMemberLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsRemoveMemberLegacyResponse.SuccessNoContent -> response.unit
        is TeamsRemoveMemberLegacyResponse.Http404NoContent -> response.unit
        is TeamsRemoveMemberLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsRemoveMemberLegacyResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is TeamsRemoveMemberLegacyResponse.Http404NoContent -> TeamsRemoveMemberLegacyApiException(response, statusCode, headers)
        is TeamsRemoveMemberLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * The "Remove team member" endpoint (described below) is closing down.
   *
   * We recommend using the [Remove team membership for a
   * user](https://docs.github.com/rest/teams/members#remove-team-membership-for-a-user) endpoint instead. It allows you
   * to remove both active and pending memberships.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * To remove a team member, the authenticated user must have 'admin' permissions to the team or be an owner of the org
   * that the team is associated with. Removing a team member does not delete the user, it just removes them from the
   * team.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun teamsRemoveMemberLegacyWithResponse(
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsRemoveMemberLegacyResponse> = executor.executeWithResponse<Unit, TeamsRemoveMemberLegacyResponse>(SdkExecutionRequest(teamsRemoveMemberLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), TeamsCodecs.teamsRemoveMemberLegacyRequestCodecRegistry, TeamsRemoveMemberLegacyResponseDecoder, options)

  /**
   * To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team
   * or be an owner of the organization that the team is associated with. Removing team membership does not delete the
   * user, it just removes their membership from the team.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `DELETE
   * /organizations/{org_id}/team/{team_id}/memberships/{username}`.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return No response body.
   * @throws TeamsRemoveMembershipForUserInOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded TeamsRemoveMembershipForUserInOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsRemoveMembershipForUserInOrg(
    org: String,
    teamSlug: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, TeamsRemoveMembershipForUserInOrgResponse, Unit>(
    request = SdkExecutionRequest(teamsRemoveMembershipForUserInOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsRemoveMembershipForUserInOrgRequestCodecRegistry,
    responseDecoder = TeamsRemoveMembershipForUserInOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsRemoveMembershipForUserInOrgResponse.SuccessNoContent -> response.unit
        is TeamsRemoveMembershipForUserInOrgResponse.Http403NoContent -> response.unit
        is TeamsRemoveMembershipForUserInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsRemoveMembershipForUserInOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is TeamsRemoveMembershipForUserInOrgResponse.Http403NoContent -> TeamsRemoveMembershipForUserInOrgApiException(response, statusCode, headers)
        is TeamsRemoveMembershipForUserInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team
   * or be an owner of the organization that the team is associated with. Removing team membership does not delete the
   * user, it just removes their membership from the team.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `DELETE
   * /organizations/{org_id}/team/{team_id}/memberships/{username}`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun teamsRemoveMembershipForUserInOrgWithResponse(
    org: String,
    teamSlug: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsRemoveMembershipForUserInOrgResponse> = executor.executeWithResponse<Unit, TeamsRemoveMembershipForUserInOrgResponse>(SdkExecutionRequest(teamsRemoveMembershipForUserInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), TeamsCodecs.teamsRemoveMembershipForUserInOrgRequestCodecRegistry, TeamsRemoveMembershipForUserInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Remove team membership for a
   * user](https://docs.github.com/rest/teams/members#remove-team-membership-for-a-user) endpoint.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team
   * or be an owner of the organization that the team is associated with. Removing team membership does not delete the
   * user, it just removes their membership from the team.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return No response body.
   * @throws TeamsRemoveMembershipForUserLegacyApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded TeamsRemoveMembershipForUserLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsRemoveMembershipForUserLegacy(
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, TeamsRemoveMembershipForUserLegacyResponse, Unit>(
    request = SdkExecutionRequest(teamsRemoveMembershipForUserLegacyMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsRemoveMembershipForUserLegacyRequestCodecRegistry,
    responseDecoder = TeamsRemoveMembershipForUserLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsRemoveMembershipForUserLegacyResponse.SuccessNoContent -> response.unit
        is TeamsRemoveMembershipForUserLegacyResponse.Http403NoContent -> response.unit
        is TeamsRemoveMembershipForUserLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsRemoveMembershipForUserLegacyResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is TeamsRemoveMembershipForUserLegacyResponse.Http403NoContent -> TeamsRemoveMembershipForUserLegacyApiException(response, statusCode, headers)
        is TeamsRemoveMembershipForUserLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Remove team membership for a
   * user](https://docs.github.com/rest/teams/members#remove-team-membership-for-a-user) endpoint.
   *
   * Team synchronization is available for organizations using GitHub Enterprise Cloud. For more information, see
   * [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products) in the GitHub Help
   * documentation.
   *
   * To remove a membership between a user and a team, the authenticated user must have 'admin' permissions to the team
   * or be an owner of the organization that the team is associated with. Removing team membership does not delete the
   * user, it just removes their membership from the team.
   *
   * > [!NOTE]
   * > When you have team synchronization set up for a team with your organization's identity provider (IdP), you will
   * see an error if you attempt to use the API for making changes to the team's membership. If you have access to
   * manage group membership in your IdP, you can manage GitHub team membership through your identity provider, which
   * automatically adds and removes team members in an organization. For more information, see "[Synchronizing teams
   * between your identity provider and
   * GitHub](https://docs.github.com/articles/synchronizing-teams-between-your-identity-provider-and-github/)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param teamId The unique identifier of the team.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun teamsRemoveMembershipForUserLegacyWithResponse(
    teamId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsRemoveMembershipForUserLegacyResponse> = executor.executeWithResponse<Unit, TeamsRemoveMembershipForUserLegacyResponse>(SdkExecutionRequest(teamsRemoveMembershipForUserLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), TeamsCodecs.teamsRemoveMembershipForUserLegacyRequestCodecRegistry, TeamsRemoveMembershipForUserLegacyResponseDecoder, options)

  /**
   * If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the
   * team. To remove a repository from a team as an organization member, the authenticated user must have admin access
   * to the repository and must be able to see the team. This does not delete the repository, it just removes it from
   * the team.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `DELETE
   * /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}`.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsRemoveRepoInOrg(
    org: String,
    owner: String,
    repo: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(teamsRemoveRepoInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
  }), TeamsCodecs.teamsRemoveRepoInOrgRequestCodecRegistry, options)

  /**
   * If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the
   * team. To remove a repository from a team as an organization member, the authenticated user must have admin access
   * to the repository and must be able to see the team. This does not delete the repository, it just removes it from
   * the team.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `DELETE
   * /organizations/{org_id}/team/{team_id}/repos/{owner}/{repo}`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   */
  public suspend fun teamsRemoveRepoInOrgWithResponse(
    org: String,
    owner: String,
    repo: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsRemoveRepoInOrgResponse> = executor.executeWithResponse<Unit, TeamsRemoveRepoInOrgResponse>(SdkExecutionRequest(teamsRemoveRepoInOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
  }), TeamsCodecs.teamsRemoveRepoInOrgRequestCodecRegistry, TeamsRemoveRepoInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Remove a repository from a
   * team](https://docs.github.com/rest/teams/teams#remove-a-repository-from-a-team) endpoint.
   *
   * If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the
   * team. To remove a repository from a team as an organization member, the authenticated user must have admin access
   * to the repository and must be able to see the team. NOTE: This does not delete the repository, it just removes it
   * from the team.
   *
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param teamId The unique identifier of the team.
   * @param options Execution options.
   * @return No response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsRemoveRepoLegacy(
    owner: String,
    repo: String,
    teamId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeBodyless<Unit>(SdkExecutionRequest(teamsRemoveRepoLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
  }), TeamsCodecs.teamsRemoveRepoLegacyRequestCodecRegistry, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Remove a repository from a
   * team](https://docs.github.com/rest/teams/teams#remove-a-repository-from-a-team) endpoint.
   *
   * If the authenticated user is an organization owner or a team maintainer, they can remove any repositories from the
   * team. To remove a repository from a team as an organization member, the authenticated user must have admin access
   * to the repository and must be able to see the team. NOTE: This does not delete the repository, it just removes it
   * from the team.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param owner The account owner of the repository. The name is not case sensitive.
   * @param repo The name of the repository without the `.git` extension. The name is not case sensitive.
   * @param teamId The unique identifier of the team.
   * @param options Execution options.
   */
  public suspend fun teamsRemoveRepoLegacyWithResponse(
    owner: String,
    repo: String,
    teamId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsRemoveRepoLegacyResponse> = executor.executeWithResponse<Unit, TeamsRemoveRepoLegacyResponse>(SdkExecutionRequest(teamsRemoveRepoLegacyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "owner", values = listOf(owner.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "repo", values = listOf(repo.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
  }), TeamsCodecs.teamsRemoveRepoLegacyRequestCodecRegistry, TeamsRemoveRepoLegacyResponseDecoder, options)

  /**
   * To edit a team, the authenticated user must either be an organization owner or a team maintainer.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `PATCH
   * /organizations/{org_id}/team/{team_id}`.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsUpdateInOrgApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded TeamsUpdateInOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsUpdateInOrg(
    request: InlineOrgsTeamsPatchRequestJsonXa9bea8ae? = null,
    org: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): TeamFull = executor.executeWithTypedErrors<InlineOrgsTeamsPatchRequestJsonXa9bea8ae?, TeamsUpdateInOrgResponse, TeamFull>(
    request = SdkExecutionRequest(teamsUpdateInOrgMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSUPDATEINORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsUpdateInOrgRequestCodecRegistry,
    responseDecoder = TeamsUpdateInOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsUpdateInOrgResponse.SuccessJson -> response.json
        is TeamsUpdateInOrgResponse.SuccessJson2 -> response.json
        is TeamsUpdateInOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsUpdateInOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsUpdateInOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsUpdateInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsUpdateInOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsUpdateInOrgResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is TeamsUpdateInOrgResponse.Http403Json -> TeamsUpdateInOrgApiException(response, statusCode, headers)
        is TeamsUpdateInOrgResponse.Http404Json -> TeamsUpdateInOrgApiException(response, statusCode, headers)
        is TeamsUpdateInOrgResponse.Http422Json -> TeamsUpdateInOrgApiException(response, statusCode, headers)
        is TeamsUpdateInOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * To edit a team, the authenticated user must either be an organization owner or a team maintainer.
   *
   * > [!NOTE]
   * > You can also specify a team by `org_id` and `team_id` using the route `PATCH
   * /organizations/{org_id}/team/{team_id}`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   */
  public suspend fun teamsUpdateInOrgWithResponse(
    request: InlineOrgsTeamsPatchRequestJsonXa9bea8ae? = null,
    org: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsUpdateInOrgResponse> = executor.executeWithResponse<InlineOrgsTeamsPatchRequestJsonXa9bea8ae?, TeamsUpdateInOrgResponse>(SdkExecutionRequest(teamsUpdateInOrgMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSUPDATEINORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
  }), TeamsCodecs.teamsUpdateInOrgRequestCodecRegistry, TeamsUpdateInOrgResponseDecoder, options)

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Update a
   * team](https://docs.github.com/rest/teams/teams#update-a-team) endpoint.
   *
   * To edit a team, the authenticated user must either be an organization owner or a team maintainer.
   *
   * > [!NOTE]
   * > With nested teams, the `privacy` for parent teams cannot be `secret`.
   *
   * @param request Request body sent to the operation.
   * @param teamId The unique identifier of the team.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws TeamsUpdateLegacyApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded TeamsUpdateLegacyError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun teamsUpdateLegacy(
    request: InlineTeamsPatchRequestJsonX92c4709d,
    teamId: Int,
    options: CallOptions = CallOptions(),
  ): TeamFull = executor.executeWithTypedErrors<InlineTeamsPatchRequestJsonX92c4709d, TeamsUpdateLegacyResponse, TeamFull>(
    request = SdkExecutionRequest(teamsUpdateLegacyMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSUPDATELEGACY_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
    }),
    requestCodecs = TeamsCodecs.teamsUpdateLegacyRequestCodecRegistry,
    responseDecoder = TeamsUpdateLegacyResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is TeamsUpdateLegacyResponse.SuccessJson -> response.json
        is TeamsUpdateLegacyResponse.SuccessJson2 -> response.json
        is TeamsUpdateLegacyResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsUpdateLegacyResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsUpdateLegacyResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is TeamsUpdateLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is TeamsUpdateLegacyResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is TeamsUpdateLegacyResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is TeamsUpdateLegacyResponse.Http403Json -> TeamsUpdateLegacyApiException(response, statusCode, headers)
        is TeamsUpdateLegacyResponse.Http404Json -> TeamsUpdateLegacyApiException(response, statusCode, headers)
        is TeamsUpdateLegacyResponse.Http422Json -> TeamsUpdateLegacyApiException(response, statusCode, headers)
        is TeamsUpdateLegacyResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!WARNING]
   * > **Endpoint closing down notice:** This endpoint route is closing down and will be removed from the Teams API. We
   * recommend migrating your existing code to use the new [Update a
   * team](https://docs.github.com/rest/teams/teams#update-a-team) endpoint.
   *
   * To edit a team, the authenticated user must either be an organization owner or a team maintainer.
   *
   * > [!NOTE]
   * > With nested teams, the `privacy` for parent teams cannot be `secret`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param teamId The unique identifier of the team.
   * @param options Execution options.
   */
  public suspend fun teamsUpdateLegacyWithResponse(
    request: InlineTeamsPatchRequestJsonX92c4709d,
    teamId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<TeamsUpdateLegacyResponse> = executor.executeWithResponse<InlineTeamsPatchRequestJsonX92c4709d, TeamsUpdateLegacyResponse>(SdkExecutionRequest(teamsUpdateLegacyMetadata, baseUri, request, listOf(TeamsCodecs.TEAMSUPDATELEGACY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_id", values = listOf(teamId.toString())))
  }), TeamsCodecs.teamsUpdateLegacyRequestCodecRegistry, TeamsUpdateLegacyResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `teams/add-member-legacy` may expose through its typed API
   * exception.
   */
  public sealed interface TeamsAddMemberLegacyError

  /**
   * Typed response alternatives for `teams/add-member-legacy`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsAddMemberLegacyResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddMemberLegacyResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddMemberLegacyResponse,
        TeamsAddMemberLegacyError

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddMemberLegacyResponse,
        TeamsAddMemberLegacyError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddMemberLegacyResponse,
        TeamsAddMemberLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddMemberLegacyResponse
  }

  /**
   * Raised by `teams/add-member-legacy` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class TeamsAddMemberLegacyApiException(
    public val error: TeamsAddMemberLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/add-member-legacy")

  private object TeamsAddMemberLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsAddMemberLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsAddMemberLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsAddMemberLegacyResponse> = when {
      alternative.id == "teams/add-member-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsAddMemberLegacyResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/add-member-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsAddMemberLegacyResponse.Http403Json(
          json = TeamsCodecs.teamsAddMemberLegacyResponseCodecAlternative1Registry.select(listOf("teams/add-member-legacy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/add-member-legacy.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsAddMemberLegacyResponse.Http404NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/add-member-legacy.response.alternative3" -> SdkResponseDecodeResult(
        value = TeamsAddMemberLegacyResponse.Http422NoContent(
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
    ): TeamsAddMemberLegacyResponse = TeamsAddMemberLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/add-or-update-membership-for-user-in-org` may expose through
   * its typed API exception.
   */
  public sealed interface TeamsAddOrUpdateMembershipForUserInOrgError

  /**
   * Typed response alternatives for `teams/add-or-update-membership-for-user-in-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface TeamsAddOrUpdateMembershipForUserInOrgResponse {
    public class SuccessJson(
      public val json: TeamMembership,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateMembershipForUserInOrgResponse

    public class Http403NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateMembershipForUserInOrgResponse,
        TeamsAddOrUpdateMembershipForUserInOrgError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateMembershipForUserInOrgResponse,
        TeamsAddOrUpdateMembershipForUserInOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateMembershipForUserInOrgResponse
  }

  /**
   * Raised by `teams/add-or-update-membership-for-user-in-org` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class TeamsAddOrUpdateMembershipForUserInOrgApiException(
    public val error: TeamsAddOrUpdateMembershipForUserInOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/add-or-update-membership-for-user-in-org")

  private object TeamsAddOrUpdateMembershipForUserInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsAddOrUpdateMembershipForUserInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsAddOrUpdateMembershipForUserInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsAddOrUpdateMembershipForUserInOrgResponse> = when {
      alternative.id == "teams/add-or-update-membership-for-user-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsAddOrUpdateMembershipForUserInOrgResponse.SuccessJson(
          json = TeamsCodecs.teamsAddOrUpdateMembershipForUserInOrgResponseCodecAlternative0Registry.select(listOf("teams/add-or-update-membership-for-user-in-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/add-or-update-membership-for-user-in-org.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsAddOrUpdateMembershipForUserInOrgResponse.Http403NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/add-or-update-membership-for-user-in-org.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsAddOrUpdateMembershipForUserInOrgResponse.Http422NoContent(
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
    ): TeamsAddOrUpdateMembershipForUserInOrgResponse = TeamsAddOrUpdateMembershipForUserInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/add-or-update-membership-for-user-legacy` may expose through
   * its typed API exception.
   */
  public sealed interface TeamsAddOrUpdateMembershipForUserLegacyError

  /**
   * Typed response alternatives for `teams/add-or-update-membership-for-user-legacy`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface TeamsAddOrUpdateMembershipForUserLegacyResponse {
    public class SuccessJson(
      public val json: TeamMembership,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateMembershipForUserLegacyResponse

    public class Http403NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateMembershipForUserLegacyResponse,
        TeamsAddOrUpdateMembershipForUserLegacyError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateMembershipForUserLegacyResponse,
        TeamsAddOrUpdateMembershipForUserLegacyError

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateMembershipForUserLegacyResponse,
        TeamsAddOrUpdateMembershipForUserLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateMembershipForUserLegacyResponse
  }

  /**
   * Raised by `teams/add-or-update-membership-for-user-legacy` after decoding a declared non-success response. [error]
   * is typed and is not included in the exception message or diagnostic rendering.
   */
  public class TeamsAddOrUpdateMembershipForUserLegacyApiException(
    public val error: TeamsAddOrUpdateMembershipForUserLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/add-or-update-membership-for-user-legacy")

  private object TeamsAddOrUpdateMembershipForUserLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsAddOrUpdateMembershipForUserLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsAddOrUpdateMembershipForUserLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsAddOrUpdateMembershipForUserLegacyResponse> = when {
      alternative.id == "teams/add-or-update-membership-for-user-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsAddOrUpdateMembershipForUserLegacyResponse.SuccessJson(
          json = TeamsCodecs.teamsAddOrUpdateMembershipForUserLegacyResponseCodecAlternative0Registry.select(listOf("teams/add-or-update-membership-for-user-legacy.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/add-or-update-membership-for-user-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsAddOrUpdateMembershipForUserLegacyResponse.Http403NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/add-or-update-membership-for-user-legacy.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsAddOrUpdateMembershipForUserLegacyResponse.Http404Json(
          json = TeamsCodecs.teamsAddOrUpdateMembershipForUserLegacyResponseCodecAlternative2Registry.select(listOf("teams/add-or-update-membership-for-user-legacy.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/add-or-update-membership-for-user-legacy.response.alternative3" -> SdkResponseDecodeResult(
        value = TeamsAddOrUpdateMembershipForUserLegacyResponse.Http422NoContent(
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
    ): TeamsAddOrUpdateMembershipForUserLegacyResponse = TeamsAddOrUpdateMembershipForUserLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `teams/add-or-update-repo-permissions-in-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface TeamsAddOrUpdateRepoPermissionsInOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateRepoPermissionsInOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateRepoPermissionsInOrgResponse
  }

  private object TeamsAddOrUpdateRepoPermissionsInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsAddOrUpdateRepoPermissionsInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsAddOrUpdateRepoPermissionsInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsAddOrUpdateRepoPermissionsInOrgResponse> = when {
      alternative.id == "teams/add-or-update-repo-permissions-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsAddOrUpdateRepoPermissionsInOrgResponse.SuccessNoContent(
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
    ): TeamsAddOrUpdateRepoPermissionsInOrgResponse = TeamsAddOrUpdateRepoPermissionsInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/add-or-update-repo-permissions-legacy` may expose through its
   * typed API exception.
   */
  public sealed interface TeamsAddOrUpdateRepoPermissionsLegacyError

  /**
   * Typed response alternatives for `teams/add-or-update-repo-permissions-legacy`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface TeamsAddOrUpdateRepoPermissionsLegacyResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateRepoPermissionsLegacyResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateRepoPermissionsLegacyResponse,
        TeamsAddOrUpdateRepoPermissionsLegacyError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateRepoPermissionsLegacyResponse,
        TeamsAddOrUpdateRepoPermissionsLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsAddOrUpdateRepoPermissionsLegacyResponse
  }

  /**
   * Raised by `teams/add-or-update-repo-permissions-legacy` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class TeamsAddOrUpdateRepoPermissionsLegacyApiException(
    public val error: TeamsAddOrUpdateRepoPermissionsLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/add-or-update-repo-permissions-legacy")

  private object TeamsAddOrUpdateRepoPermissionsLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsAddOrUpdateRepoPermissionsLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsAddOrUpdateRepoPermissionsLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsAddOrUpdateRepoPermissionsLegacyResponse> = when {
      alternative.id == "teams/add-or-update-repo-permissions-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsAddOrUpdateRepoPermissionsLegacyResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/add-or-update-repo-permissions-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsAddOrUpdateRepoPermissionsLegacyResponse.Http403Json(
          json = TeamsCodecs.teamsAddOrUpdateRepoPermissionsLegacyResponseCodecAlternative1Registry.select(listOf("teams/add-or-update-repo-permissions-legacy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/add-or-update-repo-permissions-legacy.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsAddOrUpdateRepoPermissionsLegacyResponse.Http422Json(
          json = TeamsCodecs.teamsAddOrUpdateRepoPermissionsLegacyResponseCodecAlternative2Registry.select(listOf("teams/add-or-update-repo-permissions-legacy.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsAddOrUpdateRepoPermissionsLegacyResponse = TeamsAddOrUpdateRepoPermissionsLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `teams/check-permissions-for-repo-in-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface TeamsCheckPermissionsForRepoInOrgResponse {
    public class SuccessJson(
      public val json: TeamRepository,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCheckPermissionsForRepoInOrgResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCheckPermissionsForRepoInOrgResponse

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCheckPermissionsForRepoInOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCheckPermissionsForRepoInOrgResponse
  }

  private object TeamsCheckPermissionsForRepoInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsCheckPermissionsForRepoInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsCheckPermissionsForRepoInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsCheckPermissionsForRepoInOrgResponse> = when {
      alternative.id == "teams/check-permissions-for-repo-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsCheckPermissionsForRepoInOrgResponse.SuccessJson(
          json = TeamsCodecs.teamsCheckPermissionsForRepoInOrgResponseCodecAlternative0Registry.select(listOf("teams/check-permissions-for-repo-in-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/check-permissions-for-repo-in-org.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsCheckPermissionsForRepoInOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/check-permissions-for-repo-in-org.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsCheckPermissionsForRepoInOrgResponse.Http404NoContent(
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
    ): TeamsCheckPermissionsForRepoInOrgResponse = TeamsCheckPermissionsForRepoInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `teams/check-permissions-for-repo-legacy`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface TeamsCheckPermissionsForRepoLegacyResponse {
    public class SuccessJson(
      public val json: TeamRepository,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCheckPermissionsForRepoLegacyResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCheckPermissionsForRepoLegacyResponse

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCheckPermissionsForRepoLegacyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCheckPermissionsForRepoLegacyResponse
  }

  private object TeamsCheckPermissionsForRepoLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsCheckPermissionsForRepoLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsCheckPermissionsForRepoLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsCheckPermissionsForRepoLegacyResponse> = when {
      alternative.id == "teams/check-permissions-for-repo-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsCheckPermissionsForRepoLegacyResponse.SuccessJson(
          json = TeamsCodecs.teamsCheckPermissionsForRepoLegacyResponseCodecAlternative0Registry.select(listOf("teams/check-permissions-for-repo-legacy.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/check-permissions-for-repo-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsCheckPermissionsForRepoLegacyResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/check-permissions-for-repo-legacy.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsCheckPermissionsForRepoLegacyResponse.Http404NoContent(
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
    ): TeamsCheckPermissionsForRepoLegacyResponse = TeamsCheckPermissionsForRepoLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/create` may expose through its typed API exception.
   */
  public sealed interface TeamsCreateError

  /**
   * Typed response alternatives for `teams/create`. Non-success alternatives are not converted into success values.
   */
  public sealed interface TeamsCreateResponse {
    public class SuccessJson(
      public val json: TeamFull,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCreateResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCreateResponse,
        TeamsCreateError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCreateResponse,
        TeamsCreateError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsCreateResponse
  }

  /**
   * Raised by `teams/create` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class TeamsCreateApiException(
    public val error: TeamsCreateError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/create")

  private object TeamsCreateResponseDecoder : SdkResponseAlternativeDecoder<TeamsCreateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsCreateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsCreateResponse> = when {
      alternative.id == "teams/create.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsCreateResponse.SuccessJson(
          json = TeamsCodecs.teamsCreateResponseCodecAlternative0Registry.select(listOf("teams/create.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/create.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsCreateResponse.Http403Json(
          json = TeamsCodecs.teamsCreateResponseCodecAlternative1Registry.select(listOf("teams/create.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/create.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsCreateResponse.Http422Json(
          json = TeamsCodecs.teamsCreateResponseCodecAlternative2Registry.select(listOf("teams/create.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsCreateResponse = TeamsCreateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/delete-in-org` may expose through its typed API exception.
   */
  public sealed interface TeamsDeleteInOrgError

  /**
   * Typed response alternatives for `teams/delete-in-org`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsDeleteInOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsDeleteInOrgResponse

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsDeleteInOrgResponse,
        TeamsDeleteInOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsDeleteInOrgResponse
  }

  /**
   * Raised by `teams/delete-in-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class TeamsDeleteInOrgApiException(
    public val error: TeamsDeleteInOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/delete-in-org")

  private object TeamsDeleteInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsDeleteInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsDeleteInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsDeleteInOrgResponse> = when {
      alternative.id == "teams/delete-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsDeleteInOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/delete-in-org.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsDeleteInOrgResponse.Http422NoContent(
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
    ): TeamsDeleteInOrgResponse = TeamsDeleteInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/delete-legacy` may expose through its typed API exception.
   */
  public sealed interface TeamsDeleteLegacyError

  /**
   * Typed response alternatives for `teams/delete-legacy`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsDeleteLegacyResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsDeleteLegacyResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsDeleteLegacyResponse,
        TeamsDeleteLegacyError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsDeleteLegacyResponse,
        TeamsDeleteLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsDeleteLegacyResponse
  }

  /**
   * Raised by `teams/delete-legacy` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class TeamsDeleteLegacyApiException(
    public val error: TeamsDeleteLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/delete-legacy")

  private object TeamsDeleteLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsDeleteLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsDeleteLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsDeleteLegacyResponse> = when {
      alternative.id == "teams/delete-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsDeleteLegacyResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/delete-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsDeleteLegacyResponse.Http404Json(
          json = TeamsCodecs.teamsDeleteLegacyResponseCodecAlternative1Registry.select(listOf("teams/delete-legacy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/delete-legacy.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsDeleteLegacyResponse.Http422Json(
          json = TeamsCodecs.teamsDeleteLegacyResponseCodecAlternative2Registry.select(listOf("teams/delete-legacy.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsDeleteLegacyResponse = TeamsDeleteLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/get-by-name` may expose through its typed API exception.
   */
  public sealed interface TeamsGetByNameError

  /**
   * Typed response alternatives for `teams/get-by-name`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsGetByNameResponse {
    public class SuccessJson(
      public val json: TeamFull,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetByNameResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetByNameResponse,
        TeamsGetByNameError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetByNameResponse
  }

  /**
   * Raised by `teams/get-by-name` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class TeamsGetByNameApiException(
    public val error: TeamsGetByNameError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/get-by-name")

  private object TeamsGetByNameResponseDecoder : SdkResponseAlternativeDecoder<TeamsGetByNameResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsGetByNameResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsGetByNameResponse> = when {
      alternative.id == "teams/get-by-name.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsGetByNameResponse.SuccessJson(
          json = TeamsCodecs.teamsGetByNameResponseCodecAlternative0Registry.select(listOf("teams/get-by-name.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/get-by-name.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsGetByNameResponse.Http404Json(
          json = TeamsCodecs.teamsGetByNameResponseCodecAlternative1Registry.select(listOf("teams/get-by-name.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsGetByNameResponse = TeamsGetByNameResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/get-legacy` may expose through its typed API exception.
   */
  public sealed interface TeamsGetLegacyError

  /**
   * Typed response alternatives for `teams/get-legacy`. Non-success alternatives are not converted into success values.
   */
  public sealed interface TeamsGetLegacyResponse {
    public class SuccessJson(
      public val json: TeamFull,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetLegacyResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetLegacyResponse,
        TeamsGetLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetLegacyResponse
  }

  /**
   * Raised by `teams/get-legacy` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class TeamsGetLegacyApiException(
    public val error: TeamsGetLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/get-legacy")

  private object TeamsGetLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsGetLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsGetLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsGetLegacyResponse> = when {
      alternative.id == "teams/get-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsGetLegacyResponse.SuccessJson(
          json = TeamsCodecs.teamsGetLegacyResponseCodecAlternative0Registry.select(listOf("teams/get-legacy.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/get-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsGetLegacyResponse.Http404Json(
          json = TeamsCodecs.teamsGetLegacyResponseCodecAlternative1Registry.select(listOf("teams/get-legacy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsGetLegacyResponse = TeamsGetLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/get-member-legacy` may expose through its typed API
   * exception.
   */
  public sealed interface TeamsGetMemberLegacyError

  /**
   * Typed response alternatives for `teams/get-member-legacy`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsGetMemberLegacyResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetMemberLegacyResponse

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetMemberLegacyResponse,
        TeamsGetMemberLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetMemberLegacyResponse
  }

  /**
   * Raised by `teams/get-member-legacy` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class TeamsGetMemberLegacyApiException(
    public val error: TeamsGetMemberLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/get-member-legacy")

  private object TeamsGetMemberLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsGetMemberLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsGetMemberLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsGetMemberLegacyResponse> = when {
      alternative.id == "teams/get-member-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsGetMemberLegacyResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/get-member-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsGetMemberLegacyResponse.Http404NoContent(
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
    ): TeamsGetMemberLegacyResponse = TeamsGetMemberLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/get-membership-for-user-in-org` may expose through its typed
   * API exception.
   */
  public sealed interface TeamsGetMembershipForUserInOrgError

  /**
   * Typed response alternatives for `teams/get-membership-for-user-in-org`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface TeamsGetMembershipForUserInOrgResponse {
    public class SuccessJson(
      public val json: TeamMembership,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetMembershipForUserInOrgResponse

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetMembershipForUserInOrgResponse,
        TeamsGetMembershipForUserInOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetMembershipForUserInOrgResponse
  }

  /**
   * Raised by `teams/get-membership-for-user-in-org` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class TeamsGetMembershipForUserInOrgApiException(
    public val error: TeamsGetMembershipForUserInOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/get-membership-for-user-in-org")

  private object TeamsGetMembershipForUserInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsGetMembershipForUserInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsGetMembershipForUserInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsGetMembershipForUserInOrgResponse> = when {
      alternative.id == "teams/get-membership-for-user-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsGetMembershipForUserInOrgResponse.SuccessJson(
          json = TeamsCodecs.teamsGetMembershipForUserInOrgResponseCodecAlternative0Registry.select(listOf("teams/get-membership-for-user-in-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/get-membership-for-user-in-org.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsGetMembershipForUserInOrgResponse.Http404NoContent(
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
    ): TeamsGetMembershipForUserInOrgResponse = TeamsGetMembershipForUserInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/get-membership-for-user-legacy` may expose through its typed
   * API exception.
   */
  public sealed interface TeamsGetMembershipForUserLegacyError

  /**
   * Typed response alternatives for `teams/get-membership-for-user-legacy`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface TeamsGetMembershipForUserLegacyResponse {
    public class SuccessJson(
      public val json: TeamMembership,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetMembershipForUserLegacyResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetMembershipForUserLegacyResponse,
        TeamsGetMembershipForUserLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsGetMembershipForUserLegacyResponse
  }

  /**
   * Raised by `teams/get-membership-for-user-legacy` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class TeamsGetMembershipForUserLegacyApiException(
    public val error: TeamsGetMembershipForUserLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/get-membership-for-user-legacy")

  private object TeamsGetMembershipForUserLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsGetMembershipForUserLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsGetMembershipForUserLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsGetMembershipForUserLegacyResponse> = when {
      alternative.id == "teams/get-membership-for-user-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsGetMembershipForUserLegacyResponse.SuccessJson(
          json = TeamsCodecs.teamsGetMembershipForUserLegacyResponseCodecAlternative0Registry.select(listOf("teams/get-membership-for-user-legacy.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/get-membership-for-user-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsGetMembershipForUserLegacyResponse.Http404Json(
          json = TeamsCodecs.teamsGetMembershipForUserLegacyResponseCodecAlternative1Registry.select(listOf("teams/get-membership-for-user-legacy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsGetMembershipForUserLegacyResponse = TeamsGetMembershipForUserLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/list` may expose through its typed API exception.
   */
  public sealed interface TeamsListError

  /**
   * Typed response alternatives for `teams/list`. Non-success alternatives are not converted into success values.
   */
  public sealed interface TeamsListResponse {
    public class SuccessJson(
      public val json: List<Team>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListResponse,
        TeamsListError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListResponse
  }

  /**
   * Raised by `teams/list` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class TeamsListApiException(
    public val error: TeamsListError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/list")

  private object TeamsListResponseDecoder : SdkResponseAlternativeDecoder<TeamsListResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsListResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsListResponse> = when {
      alternative.id == "teams/list.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsListResponse.SuccessJson(
          json = TeamsCodecs.teamsListResponseCodecAlternative0Registry.select(listOf("teams/list.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/list.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsListResponse.Http403Json(
          json = TeamsCodecs.teamsListResponseCodecAlternative1Registry.select(listOf("teams/list.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsListResponse = TeamsListResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `teams/list-child-in-org`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsListChildInOrgResponse {
    public class SuccessJson(
      public val json: List<Team>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListChildInOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListChildInOrgResponse
  }

  private object TeamsListChildInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsListChildInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsListChildInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsListChildInOrgResponse> = when {
      alternative.id == "teams/list-child-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsListChildInOrgResponse.SuccessJson(
          json = TeamsCodecs.teamsListChildInOrgResponseCodecAlternative0Registry.select(listOf("teams/list-child-in-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsListChildInOrgResponse = TeamsListChildInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/list-child-legacy` may expose through its typed API
   * exception.
   */
  public sealed interface TeamsListChildLegacyError

  /**
   * Typed response alternatives for `teams/list-child-legacy`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsListChildLegacyResponse {
    public class SuccessJson(
      public val json: List<Team>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListChildLegacyResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListChildLegacyResponse,
        TeamsListChildLegacyError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListChildLegacyResponse,
        TeamsListChildLegacyError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListChildLegacyResponse,
        TeamsListChildLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListChildLegacyResponse
  }

  /**
   * Raised by `teams/list-child-legacy` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class TeamsListChildLegacyApiException(
    public val error: TeamsListChildLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/list-child-legacy")

  private object TeamsListChildLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsListChildLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsListChildLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsListChildLegacyResponse> = when {
      alternative.id == "teams/list-child-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsListChildLegacyResponse.SuccessJson(
          json = TeamsCodecs.teamsListChildLegacyResponseCodecAlternative0Registry.select(listOf("teams/list-child-legacy.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/list-child-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsListChildLegacyResponse.Http403Json(
          json = TeamsCodecs.teamsListChildLegacyResponseCodecAlternative1Registry.select(listOf("teams/list-child-legacy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/list-child-legacy.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsListChildLegacyResponse.Http404Json(
          json = TeamsCodecs.teamsListChildLegacyResponseCodecAlternative2Registry.select(listOf("teams/list-child-legacy.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/list-child-legacy.response.alternative3" -> SdkResponseDecodeResult(
        value = TeamsListChildLegacyResponse.Http422Json(
          json = TeamsCodecs.teamsListChildLegacyResponseCodecAlternative3Registry.select(listOf("teams/list-child-legacy.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsListChildLegacyResponse = TeamsListChildLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/list-for-authenticated-user` may expose through its typed API
   * exception.
   */
  public sealed interface TeamsListForAuthenticatedUserError

  /**
   * Typed response alternatives for `teams/list-for-authenticated-user`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface TeamsListForAuthenticatedUserResponse {
    public class SuccessJson(
      public val json: List<TeamFull>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListForAuthenticatedUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListForAuthenticatedUserResponse,
        TeamsListForAuthenticatedUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListForAuthenticatedUserResponse,
        TeamsListForAuthenticatedUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListForAuthenticatedUserResponse,
        TeamsListForAuthenticatedUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListForAuthenticatedUserResponse
  }

  /**
   * Raised by `teams/list-for-authenticated-user` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class TeamsListForAuthenticatedUserApiException(
    public val error: TeamsListForAuthenticatedUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/list-for-authenticated-user")

  private object TeamsListForAuthenticatedUserResponseDecoder : SdkResponseAlternativeDecoder<TeamsListForAuthenticatedUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsListForAuthenticatedUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsListForAuthenticatedUserResponse> = when {
      alternative.id == "teams/list-for-authenticated-user.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsListForAuthenticatedUserResponse.SuccessJson(
          json = TeamsCodecs.teamsListForAuthenticatedUserResponseCodecAlternative0Registry.select(listOf("teams/list-for-authenticated-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/list-for-authenticated-user.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsListForAuthenticatedUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/list-for-authenticated-user.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsListForAuthenticatedUserResponse.Http403Json(
          json = TeamsCodecs.teamsListForAuthenticatedUserResponseCodecAlternative2Registry.select(listOf("teams/list-for-authenticated-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/list-for-authenticated-user.response.alternative3" -> SdkResponseDecodeResult(
        value = TeamsListForAuthenticatedUserResponse.Http404Json(
          json = TeamsCodecs.teamsListForAuthenticatedUserResponseCodecAlternative3Registry.select(listOf("teams/list-for-authenticated-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsListForAuthenticatedUserResponse = TeamsListForAuthenticatedUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `teams/list-members-in-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface TeamsListMembersInOrgResponse {
    public class SuccessJson(
      public val json: List<TeamMember>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListMembersInOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListMembersInOrgResponse
  }

  private object TeamsListMembersInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsListMembersInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsListMembersInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsListMembersInOrgResponse> = when {
      alternative.id == "teams/list-members-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsListMembersInOrgResponse.SuccessJson(
          json = TeamsCodecs.teamsListMembersInOrgResponseCodecAlternative0Registry.select(listOf("teams/list-members-in-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsListMembersInOrgResponse = TeamsListMembersInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/list-members-legacy` may expose through its typed API
   * exception.
   */
  public sealed interface TeamsListMembersLegacyError

  /**
   * Typed response alternatives for `teams/list-members-legacy`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface TeamsListMembersLegacyResponse {
    public class SuccessJson(
      public val json: List<TeamMember>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListMembersLegacyResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListMembersLegacyResponse,
        TeamsListMembersLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListMembersLegacyResponse
  }

  /**
   * Raised by `teams/list-members-legacy` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class TeamsListMembersLegacyApiException(
    public val error: TeamsListMembersLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/list-members-legacy")

  private object TeamsListMembersLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsListMembersLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsListMembersLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsListMembersLegacyResponse> = when {
      alternative.id == "teams/list-members-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsListMembersLegacyResponse.SuccessJson(
          json = TeamsCodecs.teamsListMembersLegacyResponseCodecAlternative0Registry.select(listOf("teams/list-members-legacy.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/list-members-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsListMembersLegacyResponse.Http404Json(
          json = TeamsCodecs.teamsListMembersLegacyResponseCodecAlternative1Registry.select(listOf("teams/list-members-legacy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsListMembersLegacyResponse = TeamsListMembersLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/list-pending-invitations-in-org` may expose through its typed
   * API exception.
   */
  public sealed interface TeamsListPendingInvitationsInOrgError

  /**
   * Typed response alternatives for `teams/list-pending-invitations-in-org`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface TeamsListPendingInvitationsInOrgResponse {
    public class SuccessJson(
      public val json: List<OrganizationInvitation>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListPendingInvitationsInOrgResponse

    public class Http422NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListPendingInvitationsInOrgResponse,
        TeamsListPendingInvitationsInOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListPendingInvitationsInOrgResponse
  }

  /**
   * Raised by `teams/list-pending-invitations-in-org` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class TeamsListPendingInvitationsInOrgApiException(
    public val error: TeamsListPendingInvitationsInOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/list-pending-invitations-in-org")

  private object TeamsListPendingInvitationsInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsListPendingInvitationsInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsListPendingInvitationsInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsListPendingInvitationsInOrgResponse> = when {
      alternative.id == "teams/list-pending-invitations-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsListPendingInvitationsInOrgResponse.SuccessJson(
          json = TeamsCodecs.teamsListPendingInvitationsInOrgResponseCodecAlternative0Registry.select(listOf("teams/list-pending-invitations-in-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/list-pending-invitations-in-org.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsListPendingInvitationsInOrgResponse.Http422NoContent(
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
    ): TeamsListPendingInvitationsInOrgResponse = TeamsListPendingInvitationsInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `teams/list-pending-invitations-legacy`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface TeamsListPendingInvitationsLegacyResponse {
    public class SuccessJson(
      public val json: List<OrganizationInvitation>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListPendingInvitationsLegacyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListPendingInvitationsLegacyResponse
  }

  private object TeamsListPendingInvitationsLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsListPendingInvitationsLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsListPendingInvitationsLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsListPendingInvitationsLegacyResponse> = when {
      alternative.id == "teams/list-pending-invitations-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsListPendingInvitationsLegacyResponse.SuccessJson(
          json = TeamsCodecs.teamsListPendingInvitationsLegacyResponseCodecAlternative0Registry.select(listOf("teams/list-pending-invitations-legacy.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsListPendingInvitationsLegacyResponse = TeamsListPendingInvitationsLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `teams/list-repos-in-org`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsListReposInOrgResponse {
    public class SuccessJson(
      public val json: List<MinimalRepository>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListReposInOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListReposInOrgResponse
  }

  private object TeamsListReposInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsListReposInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsListReposInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsListReposInOrgResponse> = when {
      alternative.id == "teams/list-repos-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsListReposInOrgResponse.SuccessJson(
          json = TeamsCodecs.teamsListReposInOrgResponseCodecAlternative0Registry.select(listOf("teams/list-repos-in-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsListReposInOrgResponse = TeamsListReposInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/list-repos-legacy` may expose through its typed API
   * exception.
   */
  public sealed interface TeamsListReposLegacyError

  /**
   * Typed response alternatives for `teams/list-repos-legacy`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsListReposLegacyResponse {
    public class SuccessJson(
      public val json: List<MinimalRepository>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListReposLegacyResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListReposLegacyResponse,
        TeamsListReposLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsListReposLegacyResponse
  }

  /**
   * Raised by `teams/list-repos-legacy` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class TeamsListReposLegacyApiException(
    public val error: TeamsListReposLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/list-repos-legacy")

  private object TeamsListReposLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsListReposLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsListReposLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsListReposLegacyResponse> = when {
      alternative.id == "teams/list-repos-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsListReposLegacyResponse.SuccessJson(
          json = TeamsCodecs.teamsListReposLegacyResponseCodecAlternative0Registry.select(listOf("teams/list-repos-legacy.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/list-repos-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsListReposLegacyResponse.Http404Json(
          json = TeamsCodecs.teamsListReposLegacyResponseCodecAlternative1Registry.select(listOf("teams/list-repos-legacy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsListReposLegacyResponse = TeamsListReposLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/remove-member-legacy` may expose through its typed API
   * exception.
   */
  public sealed interface TeamsRemoveMemberLegacyError

  /**
   * Typed response alternatives for `teams/remove-member-legacy`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface TeamsRemoveMemberLegacyResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveMemberLegacyResponse

    public class Http404NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveMemberLegacyResponse,
        TeamsRemoveMemberLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveMemberLegacyResponse
  }

  /**
   * Raised by `teams/remove-member-legacy` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class TeamsRemoveMemberLegacyApiException(
    public val error: TeamsRemoveMemberLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/remove-member-legacy")

  private object TeamsRemoveMemberLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsRemoveMemberLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsRemoveMemberLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsRemoveMemberLegacyResponse> = when {
      alternative.id == "teams/remove-member-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsRemoveMemberLegacyResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/remove-member-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsRemoveMemberLegacyResponse.Http404NoContent(
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
    ): TeamsRemoveMemberLegacyResponse = TeamsRemoveMemberLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/remove-membership-for-user-in-org` may expose through its
   * typed API exception.
   */
  public sealed interface TeamsRemoveMembershipForUserInOrgError

  /**
   * Typed response alternatives for `teams/remove-membership-for-user-in-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface TeamsRemoveMembershipForUserInOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveMembershipForUserInOrgResponse

    public class Http403NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveMembershipForUserInOrgResponse,
        TeamsRemoveMembershipForUserInOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveMembershipForUserInOrgResponse
  }

  /**
   * Raised by `teams/remove-membership-for-user-in-org` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class TeamsRemoveMembershipForUserInOrgApiException(
    public val error: TeamsRemoveMembershipForUserInOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/remove-membership-for-user-in-org")

  private object TeamsRemoveMembershipForUserInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsRemoveMembershipForUserInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsRemoveMembershipForUserInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsRemoveMembershipForUserInOrgResponse> = when {
      alternative.id == "teams/remove-membership-for-user-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsRemoveMembershipForUserInOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/remove-membership-for-user-in-org.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsRemoveMembershipForUserInOrgResponse.Http403NoContent(
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
    ): TeamsRemoveMembershipForUserInOrgResponse = TeamsRemoveMembershipForUserInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/remove-membership-for-user-legacy` may expose through its
   * typed API exception.
   */
  public sealed interface TeamsRemoveMembershipForUserLegacyError

  /**
   * Typed response alternatives for `teams/remove-membership-for-user-legacy`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface TeamsRemoveMembershipForUserLegacyResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveMembershipForUserLegacyResponse

    public class Http403NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveMembershipForUserLegacyResponse,
        TeamsRemoveMembershipForUserLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveMembershipForUserLegacyResponse
  }

  /**
   * Raised by `teams/remove-membership-for-user-legacy` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class TeamsRemoveMembershipForUserLegacyApiException(
    public val error: TeamsRemoveMembershipForUserLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/remove-membership-for-user-legacy")

  private object TeamsRemoveMembershipForUserLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsRemoveMembershipForUserLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsRemoveMembershipForUserLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsRemoveMembershipForUserLegacyResponse> = when {
      alternative.id == "teams/remove-membership-for-user-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsRemoveMembershipForUserLegacyResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/remove-membership-for-user-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsRemoveMembershipForUserLegacyResponse.Http403NoContent(
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
    ): TeamsRemoveMembershipForUserLegacyResponse = TeamsRemoveMembershipForUserLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `teams/remove-repo-in-org`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsRemoveRepoInOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveRepoInOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveRepoInOrgResponse
  }

  private object TeamsRemoveRepoInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsRemoveRepoInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsRemoveRepoInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsRemoveRepoInOrgResponse> = when {
      alternative.id == "teams/remove-repo-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsRemoveRepoInOrgResponse.SuccessNoContent(
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
    ): TeamsRemoveRepoInOrgResponse = TeamsRemoveRepoInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `teams/remove-repo-legacy`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsRemoveRepoLegacyResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveRepoLegacyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsRemoveRepoLegacyResponse
  }

  private object TeamsRemoveRepoLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsRemoveRepoLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsRemoveRepoLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsRemoveRepoLegacyResponse> = when {
      alternative.id == "teams/remove-repo-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsRemoveRepoLegacyResponse.SuccessNoContent(
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
    ): TeamsRemoveRepoLegacyResponse = TeamsRemoveRepoLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/update-in-org` may expose through its typed API exception.
   */
  public sealed interface TeamsUpdateInOrgError

  /**
   * Typed response alternatives for `teams/update-in-org`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsUpdateInOrgResponse {
    public class SuccessJson(
      public val json: TeamFull,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateInOrgResponse

    public class SuccessJson2(
      public val json: TeamFull,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateInOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateInOrgResponse,
        TeamsUpdateInOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateInOrgResponse,
        TeamsUpdateInOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateInOrgResponse,
        TeamsUpdateInOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateInOrgResponse
  }

  /**
   * Raised by `teams/update-in-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class TeamsUpdateInOrgApiException(
    public val error: TeamsUpdateInOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/update-in-org")

  private object TeamsUpdateInOrgResponseDecoder : SdkResponseAlternativeDecoder<TeamsUpdateInOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsUpdateInOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsUpdateInOrgResponse> = when {
      alternative.id == "teams/update-in-org.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsUpdateInOrgResponse.SuccessJson(
          json = TeamsCodecs.teamsUpdateInOrgResponseCodecAlternative0Registry.select(listOf("teams/update-in-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/update-in-org.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsUpdateInOrgResponse.SuccessJson2(
          json = TeamsCodecs.teamsUpdateInOrgResponseCodecAlternative1Registry.select(listOf("teams/update-in-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/update-in-org.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsUpdateInOrgResponse.Http403Json(
          json = TeamsCodecs.teamsUpdateInOrgResponseCodecAlternative2Registry.select(listOf("teams/update-in-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/update-in-org.response.alternative3" -> SdkResponseDecodeResult(
        value = TeamsUpdateInOrgResponse.Http404Json(
          json = TeamsCodecs.teamsUpdateInOrgResponseCodecAlternative3Registry.select(listOf("teams/update-in-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/update-in-org.response.alternative4" -> SdkResponseDecodeResult(
        value = TeamsUpdateInOrgResponse.Http422Json(
          json = TeamsCodecs.teamsUpdateInOrgResponseCodecAlternative4Registry.select(listOf("teams/update-in-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsUpdateInOrgResponse = TeamsUpdateInOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `teams/update-legacy` may expose through its typed API exception.
   */
  public sealed interface TeamsUpdateLegacyError

  /**
   * Typed response alternatives for `teams/update-legacy`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface TeamsUpdateLegacyResponse {
    public class SuccessJson(
      public val json: TeamFull,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateLegacyResponse

    public class SuccessJson2(
      public val json: TeamFull,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateLegacyResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateLegacyResponse,
        TeamsUpdateLegacyError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateLegacyResponse,
        TeamsUpdateLegacyError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateLegacyResponse,
        TeamsUpdateLegacyError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : TeamsUpdateLegacyResponse
  }

  /**
   * Raised by `teams/update-legacy` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class TeamsUpdateLegacyApiException(
    public val error: TeamsUpdateLegacyError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "teams/update-legacy")

  private object TeamsUpdateLegacyResponseDecoder : SdkResponseAlternativeDecoder<TeamsUpdateLegacyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): TeamsUpdateLegacyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<TeamsUpdateLegacyResponse> = when {
      alternative.id == "teams/update-legacy.response.alternative0" -> SdkResponseDecodeResult(
        value = TeamsUpdateLegacyResponse.SuccessJson(
          json = TeamsCodecs.teamsUpdateLegacyResponseCodecAlternative0Registry.select(listOf("teams/update-legacy.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/update-legacy.response.alternative1" -> SdkResponseDecodeResult(
        value = TeamsUpdateLegacyResponse.SuccessJson2(
          json = TeamsCodecs.teamsUpdateLegacyResponseCodecAlternative1Registry.select(listOf("teams/update-legacy.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/update-legacy.response.alternative2" -> SdkResponseDecodeResult(
        value = TeamsUpdateLegacyResponse.Http403Json(
          json = TeamsCodecs.teamsUpdateLegacyResponseCodecAlternative2Registry.select(listOf("teams/update-legacy.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/update-legacy.response.alternative3" -> SdkResponseDecodeResult(
        value = TeamsUpdateLegacyResponse.Http404Json(
          json = TeamsCodecs.teamsUpdateLegacyResponseCodecAlternative3Registry.select(listOf("teams/update-legacy.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "teams/update-legacy.response.alternative4" -> SdkResponseDecodeResult(
        value = TeamsUpdateLegacyResponse.Http422Json(
          json = TeamsCodecs.teamsUpdateLegacyResponseCodecAlternative4Registry.select(listOf("teams/update-legacy.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): TeamsUpdateLegacyResponse = TeamsUpdateLegacyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val teamsAddMemberLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/add-member-legacy",
          method = "PUT",
          path = "/teams/{team_id}/members/{username}",
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
              id = "teams/add-member-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-member-legacy.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-member-legacy.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-member-legacy.response.alternative3",
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

    internal val teamsAddOrUpdateMembershipForUserInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/add-or-update-membership-for-user-in-org",
          method = "PUT",
          path = "/orgs/{org}/teams/{team_slug}/memberships/{username}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamMembership",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-or-update-membership-for-user-in-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-or-update-membership-for-user-in-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-or-update-membership-for-user-in-org.response.alternative2",
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

    internal val teamsAddOrUpdateMembershipForUserLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/add-or-update-membership-for-user-legacy",
          method = "PUT",
          path = "/teams/{team_id}/memberships/{username}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamMembership",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-or-update-membership-for-user-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-or-update-membership-for-user-legacy.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-or-update-membership-for-user-legacy.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-or-update-membership-for-user-legacy.response.alternative3",
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

    internal val teamsAddOrUpdateRepoPermissionsInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/add-or-update-repo-permissions-in-org",
          method = "PUT",
          path = "/orgs/{org}/teams/{team_slug}/repos/{owner}/{repo}",
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
              id = "teams/add-or-update-repo-permissions-in-org.response.alternative0",
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

    internal val teamsAddOrUpdateRepoPermissionsLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/add-or-update-repo-permissions-legacy",
          method = "PUT",
          path = "/teams/{team_id}/repos/{owner}/{repo}",
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
              id = "teams/add-or-update-repo-permissions-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-or-update-repo-permissions-legacy.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/add-or-update-repo-permissions-legacy.response.alternative2",
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

    internal val teamsCheckPermissionsForRepoInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/check-permissions-for-repo-in-org",
          method = "GET",
          path = "/orgs/{org}/teams/{team_slug}/repos/{owner}/{repo}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamRepository",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/check-permissions-for-repo-in-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/check-permissions-for-repo-in-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/check-permissions-for-repo-in-org.response.alternative2",
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

    internal val teamsCheckPermissionsForRepoLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/check-permissions-for-repo-legacy",
          method = "GET",
          path = "/teams/{team_id}/repos/{owner}/{repo}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamRepository",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/check-permissions-for-repo-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/check-permissions-for-repo-legacy.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/check-permissions-for-repo-legacy.response.alternative2",
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

    internal val teamsCreateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/create",
          method = "POST",
          path = "/orgs/{org}/teams",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamFull",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/create.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/create.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/create.response.alternative2",
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

    internal val teamsDeleteInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/delete-in-org",
          method = "DELETE",
          path = "/orgs/{org}/teams/{team_slug}",
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
              id = "teams/delete-in-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/delete-in-org.response.alternative1",
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

    internal val teamsDeleteLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/delete-legacy",
          method = "DELETE",
          path = "/teams/{team_id}",
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
              id = "teams/delete-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/delete-legacy.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/delete-legacy.response.alternative2",
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

    internal val teamsGetByNameMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/get-by-name",
          method = "GET",
          path = "/orgs/{org}/teams/{team_slug}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamFull",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/get-by-name.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/get-by-name.response.alternative1",
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

    internal val teamsGetLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/get-legacy",
          method = "GET",
          path = "/teams/{team_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamFull",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/get-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/get-legacy.response.alternative1",
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

    internal val teamsGetMemberLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/get-member-legacy",
          method = "GET",
          path = "/teams/{team_id}/members/{username}",
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
              id = "teams/get-member-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/get-member-legacy.response.alternative1",
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

    internal val teamsGetMembershipForUserInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/get-membership-for-user-in-org",
          method = "GET",
          path = "/orgs/{org}/teams/{team_slug}/memberships/{username}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamMembership",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/get-membership-for-user-in-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/get-membership-for-user-in-org.response.alternative1",
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

    internal val teamsGetMembershipForUserLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/get-membership-for-user-legacy",
          method = "GET",
          path = "/teams/{team_id}/memberships/{username}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamMembership",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/get-membership-for-user-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/get-membership-for-user-legacy.response.alternative1",
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

    internal val teamsListMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/list",
          method = "GET",
          path = "/orgs/{org}/teams",
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
              id = "teams/list.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/list.response.alternative1",
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

    internal val teamsListChildInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/list-child-in-org",
          method = "GET",
          path = "/orgs/{org}/teams/{team_slug}/teams",
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
              id = "teams/list-child-in-org.response.alternative0",
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

    internal val teamsListChildLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/list-child-legacy",
          method = "GET",
          path = "/teams/{team_id}/teams",
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
              id = "teams/list-child-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/list-child-legacy.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/list-child-legacy.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/list-child-legacy.response.alternative3",
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

    internal val teamsListForAuthenticatedUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/list-for-authenticated-user",
          method = "GET",
          path = "/user/teams",
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
              id = "teams/list-for-authenticated-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/list-for-authenticated-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/list-for-authenticated-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/list-for-authenticated-user.response.alternative3",
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

    internal val teamsListMembersInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/list-members-in-org",
          method = "GET",
          path = "/orgs/{org}/teams/{team_slug}/members",
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
              id = "teams/list-members-in-org.response.alternative0",
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

    internal val teamsListMembersLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/list-members-legacy",
          method = "GET",
          path = "/teams/{team_id}/members",
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
              id = "teams/list-members-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/list-members-legacy.response.alternative1",
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

    internal val teamsListPendingInvitationsInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/list-pending-invitations-in-org",
          method = "GET",
          path = "/orgs/{org}/teams/{team_slug}/invitations",
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
              id = "teams/list-pending-invitations-in-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/list-pending-invitations-in-org.response.alternative1",
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

    internal val teamsListPendingInvitationsLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/list-pending-invitations-legacy",
          method = "GET",
          path = "/teams/{team_id}/invitations",
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
              id = "teams/list-pending-invitations-legacy.response.alternative0",
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

    internal val teamsListReposInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/list-repos-in-org",
          method = "GET",
          path = "/orgs/{org}/teams/{team_slug}/repos",
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
              id = "teams/list-repos-in-org.response.alternative0",
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

    internal val teamsListReposLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/list-repos-legacy",
          method = "GET",
          path = "/teams/{team_id}/repos",
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
              id = "teams/list-repos-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/list-repos-legacy.response.alternative1",
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

    internal val teamsRemoveMemberLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/remove-member-legacy",
          method = "DELETE",
          path = "/teams/{team_id}/members/{username}",
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
              id = "teams/remove-member-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/remove-member-legacy.response.alternative1",
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

    internal val teamsRemoveMembershipForUserInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/remove-membership-for-user-in-org",
          method = "DELETE",
          path = "/orgs/{org}/teams/{team_slug}/memberships/{username}",
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
              id = "teams/remove-membership-for-user-in-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/remove-membership-for-user-in-org.response.alternative1",
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

    internal val teamsRemoveMembershipForUserLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/remove-membership-for-user-legacy",
          method = "DELETE",
          path = "/teams/{team_id}/memberships/{username}",
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
              id = "teams/remove-membership-for-user-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/remove-membership-for-user-legacy.response.alternative1",
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

    internal val teamsRemoveRepoInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/remove-repo-in-org",
          method = "DELETE",
          path = "/orgs/{org}/teams/{team_slug}/repos/{owner}/{repo}",
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
              id = "teams/remove-repo-in-org.response.alternative0",
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

    internal val teamsRemoveRepoLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/remove-repo-legacy",
          method = "DELETE",
          path = "/teams/{team_id}/repos/{owner}/{repo}",
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
              id = "teams/remove-repo-legacy.response.alternative0",
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

    internal val teamsUpdateInOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/update-in-org",
          method = "PATCH",
          path = "/orgs/{org}/teams/{team_slug}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamFull",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/update-in-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamFull",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/update-in-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/update-in-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/update-in-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/update-in-org.response.alternative4",
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

    internal val teamsUpdateLegacyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "teams/update-legacy",
          method = "PATCH",
          path = "/teams/{team_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamFull",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/update-legacy.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "TeamFull",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/update-legacy.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/update-legacy.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/update-legacy.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "teams/update-legacy.response.alternative4",
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
