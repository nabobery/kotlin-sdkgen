package com.nabobery.sdkgen.generated.workspaces

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.BulkAddWorkspaceMembersRequest
import com.nabobery.sdkgen.generated.BulkAddWorkspaceMembersResponse
import com.nabobery.sdkgen.generated.BulkRemoveWorkspaceMembersRequest
import com.nabobery.sdkgen.generated.BulkRemoveWorkspaceMembersResponse
import com.nabobery.sdkgen.generated.CreateWorkspaceRequest
import com.nabobery.sdkgen.generated.CreateWorkspaceResponse
import com.nabobery.sdkgen.generated.DeleteWorkspaceBudgetResponse
import com.nabobery.sdkgen.generated.DeleteWorkspaceResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.GetWorkspaceResponse
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.ListWorkspaceBudgetsResponse
import com.nabobery.sdkgen.generated.ListWorkspaceMembersResponse
import com.nabobery.sdkgen.generated.ListWorkspacesResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.UnauthorizedResponse
import com.nabobery.sdkgen.generated.UpdateWorkspaceRequest
import com.nabobery.sdkgen.generated.UpdateWorkspaceResponse
import com.nabobery.sdkgen.generated.UpsertWorkspaceBudgetRequest
import com.nabobery.sdkgen.generated.UpsertWorkspaceBudgetResponse
import com.nabobery.sdkgen.generated.WorkspaceBudgetInterval
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
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

internal object WorkspacesCodecs {
  internal const val BULKADDWORKSPACEMEMBERS_REQUEST_CODEC_ID: String =
      "bulkAddWorkspaceMembers.request"

  private val bulkAddWorkspaceMembersRequestCodec: MediaTypeCodec<BulkAddWorkspaceMembersRequest> =
      KotlinxSerializationCodec(BULKADDWORKSPACEMEMBERS_REQUEST_CODEC_ID, BulkAddWorkspaceMembersRequest.Serializer, SdkJson)

  internal const val BULKADDWORKSPACEMEMBERS_RESPONSE_CODEC_ID: String =
      "bulkAddWorkspaceMembers.response"

  private val bulkAddWorkspaceMembersResponseCodec: MediaTypeCodec<BulkAddWorkspaceMembersResponse>
      =
      KotlinxSerializationCodec(BULKADDWORKSPACEMEMBERS_RESPONSE_CODEC_ID, BulkAddWorkspaceMembersResponse.Serializer, SdkJson)

  private val bulkAddWorkspaceMembersResponseCodecAlternative0Codec:
      MediaTypeCodec<BulkAddWorkspaceMembersResponse> =
      KotlinxSerializationCodec("bulkAddWorkspaceMembers.response.alternative0", BulkAddWorkspaceMembersResponse.Serializer, SdkJson)

  internal val bulkAddWorkspaceMembersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BulkAddWorkspaceMembersResponse> =
      MediaTypeCodecRegistry.of(bulkAddWorkspaceMembersResponseCodecAlternative0Codec)

  private val bulkAddWorkspaceMembersResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("bulkAddWorkspaceMembers.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val bulkAddWorkspaceMembersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(bulkAddWorkspaceMembersResponseCodecAlternative1Codec)

  private val bulkAddWorkspaceMembersResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("bulkAddWorkspaceMembers.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val bulkAddWorkspaceMembersResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(bulkAddWorkspaceMembersResponseCodecAlternative2Codec)

  private val bulkAddWorkspaceMembersResponseCodecAlternative3Codec:
      MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("bulkAddWorkspaceMembers.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val bulkAddWorkspaceMembersResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(bulkAddWorkspaceMembersResponseCodecAlternative3Codec)

  private val bulkAddWorkspaceMembersResponseCodecAlternative4Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("bulkAddWorkspaceMembers.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  internal val bulkAddWorkspaceMembersResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(bulkAddWorkspaceMembersResponseCodecAlternative4Codec)

  private val bulkAddWorkspaceMembersResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("bulkAddWorkspaceMembers.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val bulkAddWorkspaceMembersResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(bulkAddWorkspaceMembersResponseCodecAlternative5Codec)

  internal val bulkAddWorkspaceMembersRequestCodecRegistry:
      MediaTypeCodecRegistry<BulkAddWorkspaceMembersRequest> =
      MediaTypeCodecRegistry.of(bulkAddWorkspaceMembersRequestCodec)

  internal val bulkAddWorkspaceMembersResponseCodecRegistry:
      MediaTypeCodecRegistry<BulkAddWorkspaceMembersResponse> =
      MediaTypeCodecRegistry.of(bulkAddWorkspaceMembersResponseCodec)

  internal const val BULKREMOVEWORKSPACEMEMBERS_REQUEST_CODEC_ID: String =
      "bulkRemoveWorkspaceMembers.request"

  private val bulkRemoveWorkspaceMembersRequestCodec:
      MediaTypeCodec<BulkRemoveWorkspaceMembersRequest> =
      KotlinxSerializationCodec(BULKREMOVEWORKSPACEMEMBERS_REQUEST_CODEC_ID, BulkRemoveWorkspaceMembersRequest.Serializer, SdkJson)

  internal const val BULKREMOVEWORKSPACEMEMBERS_RESPONSE_CODEC_ID: String =
      "bulkRemoveWorkspaceMembers.response"

  private val bulkRemoveWorkspaceMembersResponseCodec:
      MediaTypeCodec<BulkRemoveWorkspaceMembersResponse> =
      KotlinxSerializationCodec(BULKREMOVEWORKSPACEMEMBERS_RESPONSE_CODEC_ID, BulkRemoveWorkspaceMembersResponse.Serializer, SdkJson)

  private val bulkRemoveWorkspaceMembersResponseCodecAlternative0Codec:
      MediaTypeCodec<BulkRemoveWorkspaceMembersResponse> =
      KotlinxSerializationCodec("bulkRemoveWorkspaceMembers.response.alternative0", BulkRemoveWorkspaceMembersResponse.Serializer, SdkJson)

  internal val bulkRemoveWorkspaceMembersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BulkRemoveWorkspaceMembersResponse> =
      MediaTypeCodecRegistry.of(bulkRemoveWorkspaceMembersResponseCodecAlternative0Codec)

  private val bulkRemoveWorkspaceMembersResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("bulkRemoveWorkspaceMembers.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val bulkRemoveWorkspaceMembersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(bulkRemoveWorkspaceMembersResponseCodecAlternative1Codec)

  private val bulkRemoveWorkspaceMembersResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("bulkRemoveWorkspaceMembers.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val bulkRemoveWorkspaceMembersResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(bulkRemoveWorkspaceMembersResponseCodecAlternative2Codec)

  private val bulkRemoveWorkspaceMembersResponseCodecAlternative3Codec:
      MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("bulkRemoveWorkspaceMembers.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val bulkRemoveWorkspaceMembersResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(bulkRemoveWorkspaceMembersResponseCodecAlternative3Codec)

  private val bulkRemoveWorkspaceMembersResponseCodecAlternative4Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("bulkRemoveWorkspaceMembers.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  internal val bulkRemoveWorkspaceMembersResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(bulkRemoveWorkspaceMembersResponseCodecAlternative4Codec)

  private val bulkRemoveWorkspaceMembersResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("bulkRemoveWorkspaceMembers.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val bulkRemoveWorkspaceMembersResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(bulkRemoveWorkspaceMembersResponseCodecAlternative5Codec)

  internal val bulkRemoveWorkspaceMembersRequestCodecRegistry:
      MediaTypeCodecRegistry<BulkRemoveWorkspaceMembersRequest> =
      MediaTypeCodecRegistry.of(bulkRemoveWorkspaceMembersRequestCodec)

  internal val bulkRemoveWorkspaceMembersResponseCodecRegistry:
      MediaTypeCodecRegistry<BulkRemoveWorkspaceMembersResponse> =
      MediaTypeCodecRegistry.of(bulkRemoveWorkspaceMembersResponseCodec)

  internal const val CREATEWORKSPACE_REQUEST_CODEC_ID: String = "createWorkspace.request"

  private val createWorkspaceRequestCodec: MediaTypeCodec<CreateWorkspaceRequest> =
      KotlinxSerializationCodec(CREATEWORKSPACE_REQUEST_CODEC_ID, CreateWorkspaceRequest.Serializer, SdkJson)

  internal const val CREATEWORKSPACE_RESPONSE_CODEC_ID: String = "createWorkspace.response"

  private val createWorkspaceResponseCodec: MediaTypeCodec<CreateWorkspaceResponse> =
      KotlinxSerializationCodec(CREATEWORKSPACE_RESPONSE_CODEC_ID, CreateWorkspaceResponse.Serializer, SdkJson)

  private val createWorkspaceResponseCodecAlternative0Codec: MediaTypeCodec<CreateWorkspaceResponse>
      =
      KotlinxSerializationCodec("createWorkspace.response.alternative0", CreateWorkspaceResponse.Serializer, SdkJson)

  internal val createWorkspaceResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreateWorkspaceResponse> =
      MediaTypeCodecRegistry.of(createWorkspaceResponseCodecAlternative0Codec)

  private val createWorkspaceResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createWorkspace.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createWorkspaceResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createWorkspaceResponseCodecAlternative1Codec)

  private val createWorkspaceResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createWorkspace.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createWorkspaceResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createWorkspaceResponseCodecAlternative2Codec)

  private val createWorkspaceResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createWorkspace.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val createWorkspaceResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createWorkspaceResponseCodecAlternative3Codec)

  private val createWorkspaceResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("createWorkspace.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val createWorkspaceResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createWorkspaceResponseCodecAlternative4Codec)

  internal val createWorkspaceRequestCodecRegistry: MediaTypeCodecRegistry<CreateWorkspaceRequest> =
      MediaTypeCodecRegistry.of(createWorkspaceRequestCodec)

  internal val createWorkspaceResponseCodecRegistry: MediaTypeCodecRegistry<CreateWorkspaceResponse>
      = MediaTypeCodecRegistry.of(createWorkspaceResponseCodec)

  internal const val DELETEWORKSPACE_RESPONSE_CODEC_ID: String = "deleteWorkspace.response"

  private val deleteWorkspaceResponseCodec: MediaTypeCodec<DeleteWorkspaceResponse> =
      KotlinxSerializationCodec(DELETEWORKSPACE_RESPONSE_CODEC_ID, DeleteWorkspaceResponse.Serializer, SdkJson)

  private val deleteWorkspaceResponseCodecAlternative0Codec: MediaTypeCodec<DeleteWorkspaceResponse>
      =
      KotlinxSerializationCodec("deleteWorkspace.response.alternative0", DeleteWorkspaceResponse.Serializer, SdkJson)

  internal val deleteWorkspaceResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeleteWorkspaceResponse> =
      MediaTypeCodecRegistry.of(deleteWorkspaceResponseCodecAlternative0Codec)

  private val deleteWorkspaceResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("deleteWorkspace.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val deleteWorkspaceResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(deleteWorkspaceResponseCodecAlternative1Codec)

  private val deleteWorkspaceResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteWorkspace.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val deleteWorkspaceResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteWorkspaceResponseCodecAlternative2Codec)

  private val deleteWorkspaceResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("deleteWorkspace.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val deleteWorkspaceResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(deleteWorkspaceResponseCodecAlternative3Codec)

  private val deleteWorkspaceResponseCodecAlternative4Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("deleteWorkspace.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  internal val deleteWorkspaceResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(deleteWorkspaceResponseCodecAlternative4Codec)

  private val deleteWorkspaceResponseCodecAlternative5Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("deleteWorkspace.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val deleteWorkspaceResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteWorkspaceResponseCodecAlternative5Codec)

  internal val deleteWorkspaceRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val deleteWorkspaceResponseCodecRegistry: MediaTypeCodecRegistry<DeleteWorkspaceResponse>
      = MediaTypeCodecRegistry.of(deleteWorkspaceResponseCodec)

  internal const val DELETEWORKSPACEBUDGET_RESPONSE_CODEC_ID: String =
      "deleteWorkspaceBudget.response"

  private val deleteWorkspaceBudgetResponseCodec: MediaTypeCodec<DeleteWorkspaceBudgetResponse> =
      KotlinxSerializationCodec(DELETEWORKSPACEBUDGET_RESPONSE_CODEC_ID, DeleteWorkspaceBudgetResponse.Serializer, SdkJson)

  private val deleteWorkspaceBudgetResponseCodecAlternative0Codec:
      MediaTypeCodec<DeleteWorkspaceBudgetResponse> =
      KotlinxSerializationCodec("deleteWorkspaceBudget.response.alternative0", DeleteWorkspaceBudgetResponse.Serializer, SdkJson)

  internal val deleteWorkspaceBudgetResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeleteWorkspaceBudgetResponse> =
      MediaTypeCodecRegistry.of(deleteWorkspaceBudgetResponseCodecAlternative0Codec)

  private val deleteWorkspaceBudgetResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteWorkspaceBudget.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val deleteWorkspaceBudgetResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteWorkspaceBudgetResponseCodecAlternative1Codec)

  private val deleteWorkspaceBudgetResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse>
      =
      KotlinxSerializationCodec("deleteWorkspaceBudget.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val deleteWorkspaceBudgetResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(deleteWorkspaceBudgetResponseCodecAlternative2Codec)

  private val deleteWorkspaceBudgetResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("deleteWorkspaceBudget.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val deleteWorkspaceBudgetResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteWorkspaceBudgetResponseCodecAlternative3Codec)

  internal val deleteWorkspaceBudgetRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val deleteWorkspaceBudgetResponseCodecRegistry:
      MediaTypeCodecRegistry<DeleteWorkspaceBudgetResponse> =
      MediaTypeCodecRegistry.of(deleteWorkspaceBudgetResponseCodec)

  internal const val GETWORKSPACE_RESPONSE_CODEC_ID: String = "getWorkspace.response"

  private val getWorkspaceResponseCodec: MediaTypeCodec<GetWorkspaceResponse> =
      KotlinxSerializationCodec(GETWORKSPACE_RESPONSE_CODEC_ID, GetWorkspaceResponse.Serializer, SdkJson)

  private val getWorkspaceResponseCodecAlternative0Codec: MediaTypeCodec<GetWorkspaceResponse> =
      KotlinxSerializationCodec("getWorkspace.response.alternative0", GetWorkspaceResponse.Serializer, SdkJson)

  internal val getWorkspaceResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GetWorkspaceResponse> =
      MediaTypeCodecRegistry.of(getWorkspaceResponseCodecAlternative0Codec)

  private val getWorkspaceResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getWorkspace.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val getWorkspaceResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getWorkspaceResponseCodecAlternative1Codec)

  private val getWorkspaceResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getWorkspace.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val getWorkspaceResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getWorkspaceResponseCodecAlternative2Codec)

  private val getWorkspaceResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getWorkspace.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val getWorkspaceResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getWorkspaceResponseCodecAlternative3Codec)

  internal val getWorkspaceRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getWorkspaceResponseCodecRegistry: MediaTypeCodecRegistry<GetWorkspaceResponse> =
      MediaTypeCodecRegistry.of(getWorkspaceResponseCodec)

  internal const val LISTWORKSPACEBUDGETS_RESPONSE_CODEC_ID: String =
      "listWorkspaceBudgets.response"

  private val listWorkspaceBudgetsResponseCodec: MediaTypeCodec<ListWorkspaceBudgetsResponse> =
      KotlinxSerializationCodec(LISTWORKSPACEBUDGETS_RESPONSE_CODEC_ID, ListWorkspaceBudgetsResponse.Serializer, SdkJson)

  private val listWorkspaceBudgetsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListWorkspaceBudgetsResponse> =
      KotlinxSerializationCodec("listWorkspaceBudgets.response.alternative0", ListWorkspaceBudgetsResponse.Serializer, SdkJson)

  internal val listWorkspaceBudgetsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListWorkspaceBudgetsResponse> =
      MediaTypeCodecRegistry.of(listWorkspaceBudgetsResponseCodecAlternative0Codec)

  private val listWorkspaceBudgetsResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listWorkspaceBudgets.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listWorkspaceBudgetsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listWorkspaceBudgetsResponseCodecAlternative1Codec)

  private val listWorkspaceBudgetsResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listWorkspaceBudgets.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val listWorkspaceBudgetsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listWorkspaceBudgetsResponseCodecAlternative2Codec)

  private val listWorkspaceBudgetsResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listWorkspaceBudgets.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val listWorkspaceBudgetsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listWorkspaceBudgetsResponseCodecAlternative3Codec)

  internal val listWorkspaceBudgetsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listWorkspaceBudgetsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListWorkspaceBudgetsResponse> =
      MediaTypeCodecRegistry.of(listWorkspaceBudgetsResponseCodec)

  internal const val LISTWORKSPACEMEMBERS_RESPONSE_CODEC_ID: String =
      "listWorkspaceMembers.response"

  private val listWorkspaceMembersResponseCodec: MediaTypeCodec<ListWorkspaceMembersResponse> =
      KotlinxSerializationCodec(LISTWORKSPACEMEMBERS_RESPONSE_CODEC_ID, ListWorkspaceMembersResponse.Serializer, SdkJson)

  private val listWorkspaceMembersResponseCodecAlternative0Codec:
      MediaTypeCodec<ListWorkspaceMembersResponse> =
      KotlinxSerializationCodec("listWorkspaceMembers.response.alternative0", ListWorkspaceMembersResponse.Serializer, SdkJson)

  internal val listWorkspaceMembersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListWorkspaceMembersResponse> =
      MediaTypeCodecRegistry.of(listWorkspaceMembersResponseCodecAlternative0Codec)

  private val listWorkspaceMembersResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listWorkspaceMembers.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listWorkspaceMembersResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listWorkspaceMembersResponseCodecAlternative1Codec)

  private val listWorkspaceMembersResponseCodecAlternative2Codec: MediaTypeCodec<ForbiddenResponse>
      =
      KotlinxSerializationCodec("listWorkspaceMembers.response.alternative2", ForbiddenResponse.Serializer, SdkJson)

  internal val listWorkspaceMembersResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(listWorkspaceMembersResponseCodecAlternative2Codec)

  private val listWorkspaceMembersResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listWorkspaceMembers.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val listWorkspaceMembersResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listWorkspaceMembersResponseCodecAlternative3Codec)

  private val listWorkspaceMembersResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listWorkspaceMembers.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val listWorkspaceMembersResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listWorkspaceMembersResponseCodecAlternative4Codec)

  internal val listWorkspaceMembersRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listWorkspaceMembersResponseCodecRegistry:
      MediaTypeCodecRegistry<ListWorkspaceMembersResponse> =
      MediaTypeCodecRegistry.of(listWorkspaceMembersResponseCodec)

  internal const val LISTWORKSPACES_RESPONSE_CODEC_ID: String = "listWorkspaces.response"

  private val listWorkspacesResponseCodec: MediaTypeCodec<ListWorkspacesResponse> =
      KotlinxSerializationCodec(LISTWORKSPACES_RESPONSE_CODEC_ID, ListWorkspacesResponse.Serializer, SdkJson)

  private val listWorkspacesResponseCodecAlternative0Codec: MediaTypeCodec<ListWorkspacesResponse> =
      KotlinxSerializationCodec("listWorkspaces.response.alternative0", ListWorkspacesResponse.Serializer, SdkJson)

  internal val listWorkspacesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListWorkspacesResponse> =
      MediaTypeCodecRegistry.of(listWorkspacesResponseCodecAlternative0Codec)

  private val listWorkspacesResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listWorkspaces.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listWorkspacesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listWorkspacesResponseCodecAlternative1Codec)

  private val listWorkspacesResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listWorkspaces.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  internal val listWorkspacesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listWorkspacesResponseCodecAlternative2Codec)

  internal val listWorkspacesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listWorkspacesResponseCodecRegistry: MediaTypeCodecRegistry<ListWorkspacesResponse> =
      MediaTypeCodecRegistry.of(listWorkspacesResponseCodec)

  internal const val UPDATEWORKSPACE_REQUEST_CODEC_ID: String = "updateWorkspace.request"

  private val updateWorkspaceRequestCodec: MediaTypeCodec<UpdateWorkspaceRequest> =
      KotlinxSerializationCodec(UPDATEWORKSPACE_REQUEST_CODEC_ID, UpdateWorkspaceRequest.Serializer, SdkJson)

  internal const val UPDATEWORKSPACE_RESPONSE_CODEC_ID: String = "updateWorkspace.response"

  private val updateWorkspaceResponseCodec: MediaTypeCodec<UpdateWorkspaceResponse> =
      KotlinxSerializationCodec(UPDATEWORKSPACE_RESPONSE_CODEC_ID, UpdateWorkspaceResponse.Serializer, SdkJson)

  private val updateWorkspaceResponseCodecAlternative0Codec: MediaTypeCodec<UpdateWorkspaceResponse>
      =
      KotlinxSerializationCodec("updateWorkspace.response.alternative0", UpdateWorkspaceResponse.Serializer, SdkJson)

  internal val updateWorkspaceResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<UpdateWorkspaceResponse> =
      MediaTypeCodecRegistry.of(updateWorkspaceResponseCodecAlternative0Codec)

  private val updateWorkspaceResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("updateWorkspace.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val updateWorkspaceResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(updateWorkspaceResponseCodecAlternative1Codec)

  private val updateWorkspaceResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("updateWorkspace.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val updateWorkspaceResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(updateWorkspaceResponseCodecAlternative2Codec)

  private val updateWorkspaceResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("updateWorkspace.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val updateWorkspaceResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(updateWorkspaceResponseCodecAlternative3Codec)

  private val updateWorkspaceResponseCodecAlternative4Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("updateWorkspace.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  internal val updateWorkspaceResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(updateWorkspaceResponseCodecAlternative4Codec)

  private val updateWorkspaceResponseCodecAlternative5Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("updateWorkspace.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val updateWorkspaceResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(updateWorkspaceResponseCodecAlternative5Codec)

  internal val updateWorkspaceRequestCodecRegistry: MediaTypeCodecRegistry<UpdateWorkspaceRequest> =
      MediaTypeCodecRegistry.of(updateWorkspaceRequestCodec)

  internal val updateWorkspaceResponseCodecRegistry: MediaTypeCodecRegistry<UpdateWorkspaceResponse>
      = MediaTypeCodecRegistry.of(updateWorkspaceResponseCodec)

  internal const val UPSERTWORKSPACEBUDGET_REQUEST_CODEC_ID: String =
      "upsertWorkspaceBudget.request"

  private val upsertWorkspaceBudgetRequestCodec: MediaTypeCodec<UpsertWorkspaceBudgetRequest> =
      KotlinxSerializationCodec(UPSERTWORKSPACEBUDGET_REQUEST_CODEC_ID, UpsertWorkspaceBudgetRequest.Serializer, SdkJson)

  internal const val UPSERTWORKSPACEBUDGET_RESPONSE_CODEC_ID: String =
      "upsertWorkspaceBudget.response"

  private val upsertWorkspaceBudgetResponseCodec: MediaTypeCodec<UpsertWorkspaceBudgetResponse> =
      KotlinxSerializationCodec(UPSERTWORKSPACEBUDGET_RESPONSE_CODEC_ID, UpsertWorkspaceBudgetResponse.Serializer, SdkJson)

  private val upsertWorkspaceBudgetResponseCodecAlternative0Codec:
      MediaTypeCodec<UpsertWorkspaceBudgetResponse> =
      KotlinxSerializationCodec("upsertWorkspaceBudget.response.alternative0", UpsertWorkspaceBudgetResponse.Serializer, SdkJson)

  internal val upsertWorkspaceBudgetResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<UpsertWorkspaceBudgetResponse> =
      MediaTypeCodecRegistry.of(upsertWorkspaceBudgetResponseCodecAlternative0Codec)

  private val upsertWorkspaceBudgetResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("upsertWorkspaceBudget.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val upsertWorkspaceBudgetResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(upsertWorkspaceBudgetResponseCodecAlternative1Codec)

  private val upsertWorkspaceBudgetResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("upsertWorkspaceBudget.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val upsertWorkspaceBudgetResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(upsertWorkspaceBudgetResponseCodecAlternative2Codec)

  private val upsertWorkspaceBudgetResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse>
      =
      KotlinxSerializationCodec("upsertWorkspaceBudget.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val upsertWorkspaceBudgetResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(upsertWorkspaceBudgetResponseCodecAlternative3Codec)

  private val upsertWorkspaceBudgetResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("upsertWorkspaceBudget.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val upsertWorkspaceBudgetResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(upsertWorkspaceBudgetResponseCodecAlternative4Codec)

  internal val upsertWorkspaceBudgetRequestCodecRegistry:
      MediaTypeCodecRegistry<UpsertWorkspaceBudgetRequest> =
      MediaTypeCodecRegistry.of(upsertWorkspaceBudgetRequestCodec)

  internal val upsertWorkspaceBudgetResponseCodecRegistry:
      MediaTypeCodecRegistry<UpsertWorkspaceBudgetResponse> =
      MediaTypeCodecRegistry.of(upsertWorkspaceBudgetResponseCodec)
}

/**
 * Client for the 'Workspaces' group of OpenRouter API.
 */
public class WorkspacesClient(
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
      SdkExecutor(transport, authentication = this@WorkspacesClient.authentication)

  /**
   * Add multiple organization members to a workspace. Members are assigned the same role they hold in the organization.
   * [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param id The workspace ID (UUID) or slug
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
   * @throws BulkAddWorkspaceMembersApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded BulkAddWorkspaceMembersError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun bulkAddWorkspaceMembers(
    request: BulkAddWorkspaceMembersRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.BulkAddWorkspaceMembersResponse = executor.executeWithTypedErrors<BulkAddWorkspaceMembersRequest, BulkAddWorkspaceMembersResponse, com.nabobery.sdkgen.generated.BulkAddWorkspaceMembersResponse>(
    request = SdkExecutionRequest(bulkAddWorkspaceMembersMetadata, baseUri, request, listOf(WorkspacesCodecs.BULKADDWORKSPACEMEMBERS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = WorkspacesCodecs.bulkAddWorkspaceMembersRequestCodecRegistry,
    responseDecoder = BulkAddWorkspaceMembersResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BulkAddWorkspaceMembersResponse.SuccessJson -> response.json
        is BulkAddWorkspaceMembersResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAddWorkspaceMembersResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAddWorkspaceMembersResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAddWorkspaceMembersResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAddWorkspaceMembersResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAddWorkspaceMembersResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BulkAddWorkspaceMembersResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BulkAddWorkspaceMembersResponse.Http400Json -> BulkAddWorkspaceMembersApiException(response, statusCode, headers)
        is BulkAddWorkspaceMembersResponse.Http401Json -> BulkAddWorkspaceMembersApiException(response, statusCode, headers)
        is BulkAddWorkspaceMembersResponse.Http403Json -> BulkAddWorkspaceMembersApiException(response, statusCode, headers)
        is BulkAddWorkspaceMembersResponse.Http404Json -> BulkAddWorkspaceMembersApiException(response, statusCode, headers)
        is BulkAddWorkspaceMembersResponse.Http500Json -> BulkAddWorkspaceMembersApiException(response, statusCode, headers)
        is BulkAddWorkspaceMembersResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Add multiple organization members to a workspace. Members are assigned the same role they hold in the organization.
   * [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The workspace ID (UUID) or slug
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
  public suspend fun bulkAddWorkspaceMembersWithResponse(
    request: BulkAddWorkspaceMembersRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BulkAddWorkspaceMembersResponse> = executor.executeWithResponse<BulkAddWorkspaceMembersRequest, BulkAddWorkspaceMembersResponse>(SdkExecutionRequest(bulkAddWorkspaceMembersMetadata, baseUri, request, listOf(WorkspacesCodecs.BULKADDWORKSPACEMEMBERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), WorkspacesCodecs.bulkAddWorkspaceMembersRequestCodecRegistry, BulkAddWorkspaceMembersResponseDecoder, options)

  /**
   * Remove multiple members from a workspace. Members with active API keys in the workspace cannot be removed.
   * SCIM-managed members cannot be removed; changes must be made in your identity provider. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param id The workspace ID (UUID) or slug
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
   * @throws BulkRemoveWorkspaceMembersApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded BulkRemoveWorkspaceMembersError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun bulkRemoveWorkspaceMembers(
    request: BulkRemoveWorkspaceMembersRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.BulkRemoveWorkspaceMembersResponse = executor.executeWithTypedErrors<BulkRemoveWorkspaceMembersRequest, BulkRemoveWorkspaceMembersResponse, com.nabobery.sdkgen.generated.BulkRemoveWorkspaceMembersResponse>(
    request = SdkExecutionRequest(bulkRemoveWorkspaceMembersMetadata, baseUri, request, listOf(WorkspacesCodecs.BULKREMOVEWORKSPACEMEMBERS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = WorkspacesCodecs.bulkRemoveWorkspaceMembersRequestCodecRegistry,
    responseDecoder = BulkRemoveWorkspaceMembersResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BulkRemoveWorkspaceMembersResponse.SuccessJson -> response.json
        is BulkRemoveWorkspaceMembersResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkRemoveWorkspaceMembersResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkRemoveWorkspaceMembersResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkRemoveWorkspaceMembersResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkRemoveWorkspaceMembersResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkRemoveWorkspaceMembersResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BulkRemoveWorkspaceMembersResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BulkRemoveWorkspaceMembersResponse.Http400Json -> BulkRemoveWorkspaceMembersApiException(response, statusCode, headers)
        is BulkRemoveWorkspaceMembersResponse.Http401Json -> BulkRemoveWorkspaceMembersApiException(response, statusCode, headers)
        is BulkRemoveWorkspaceMembersResponse.Http403Json -> BulkRemoveWorkspaceMembersApiException(response, statusCode, headers)
        is BulkRemoveWorkspaceMembersResponse.Http404Json -> BulkRemoveWorkspaceMembersApiException(response, statusCode, headers)
        is BulkRemoveWorkspaceMembersResponse.Http500Json -> BulkRemoveWorkspaceMembersApiException(response, statusCode, headers)
        is BulkRemoveWorkspaceMembersResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Remove multiple members from a workspace. Members with active API keys in the workspace cannot be removed.
   * SCIM-managed members cannot be removed; changes must be made in your identity provider. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The workspace ID (UUID) or slug
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
  public suspend fun bulkRemoveWorkspaceMembersWithResponse(
    request: BulkRemoveWorkspaceMembersRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BulkRemoveWorkspaceMembersResponse> = executor.executeWithResponse<BulkRemoveWorkspaceMembersRequest, BulkRemoveWorkspaceMembersResponse>(SdkExecutionRequest(bulkRemoveWorkspaceMembersMetadata, baseUri, request, listOf(WorkspacesCodecs.BULKREMOVEWORKSPACEMEMBERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), WorkspacesCodecs.bulkRemoveWorkspaceMembersRequestCodecRegistry, BulkRemoveWorkspaceMembersResponseDecoder, options)

  /**
   * Create a new workspace for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * @param request Request body sent to the operation.
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
   * @throws CreateWorkspaceApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded CreateWorkspaceError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createWorkspace(
    request: CreateWorkspaceRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.CreateWorkspaceResponse = executor.executeWithTypedErrors<CreateWorkspaceRequest, CreateWorkspaceResponse, com.nabobery.sdkgen.generated.CreateWorkspaceResponse>(
    request = SdkExecutionRequest(createWorkspaceMetadata, baseUri, request, listOf(WorkspacesCodecs.CREATEWORKSPACE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = WorkspacesCodecs.createWorkspaceRequestCodecRegistry,
    responseDecoder = CreateWorkspaceResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateWorkspaceResponse.SuccessJson -> response.json
        is CreateWorkspaceResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateWorkspaceResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateWorkspaceResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateWorkspaceResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateWorkspaceResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateWorkspaceResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateWorkspaceResponse.Http400Json -> CreateWorkspaceApiException(response, statusCode, headers)
        is CreateWorkspaceResponse.Http401Json -> CreateWorkspaceApiException(response, statusCode, headers)
        is CreateWorkspaceResponse.Http403Json -> CreateWorkspaceApiException(response, statusCode, headers)
        is CreateWorkspaceResponse.Http500Json -> CreateWorkspaceApiException(response, statusCode, headers)
        is CreateWorkspaceResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a new workspace for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
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
  public suspend fun createWorkspaceWithResponse(
    request: CreateWorkspaceRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateWorkspaceResponse> = executor.executeWithResponse<CreateWorkspaceRequest, CreateWorkspaceResponse>(SdkExecutionRequest(createWorkspaceMetadata, baseUri, request, listOf(WorkspacesCodecs.CREATEWORKSPACE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), WorkspacesCodecs.createWorkspaceRequestCodecRegistry, CreateWorkspaceResponseDecoder, options)

  /**
   * Delete an existing workspace. The default workspace cannot be deleted. Workspaces with active API keys cannot be
   * deleted; remove the keys first. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param id The workspace ID (UUID) or slug
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
   * @throws DeleteWorkspaceApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded DeleteWorkspaceError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun deleteWorkspace(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.DeleteWorkspaceResponse = executor.executeWithTypedErrors<Unit, DeleteWorkspaceResponse, com.nabobery.sdkgen.generated.DeleteWorkspaceResponse>(
    request = SdkExecutionRequest(deleteWorkspaceMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = WorkspacesCodecs.deleteWorkspaceRequestCodecRegistry,
    responseDecoder = DeleteWorkspaceResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DeleteWorkspaceResponse.SuccessJson -> response.json
        is DeleteWorkspaceResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteWorkspaceResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteWorkspaceResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteWorkspaceResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteWorkspaceResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteWorkspaceResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DeleteWorkspaceResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DeleteWorkspaceResponse.Http400Json -> DeleteWorkspaceApiException(response, statusCode, headers)
        is DeleteWorkspaceResponse.Http401Json -> DeleteWorkspaceApiException(response, statusCode, headers)
        is DeleteWorkspaceResponse.Http403Json -> DeleteWorkspaceApiException(response, statusCode, headers)
        is DeleteWorkspaceResponse.Http404Json -> DeleteWorkspaceApiException(response, statusCode, headers)
        is DeleteWorkspaceResponse.Http500Json -> DeleteWorkspaceApiException(response, statusCode, headers)
        is DeleteWorkspaceResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Delete an existing workspace. The default workspace cannot be deleted. Workspaces with active API keys cannot be
   * deleted; remove the keys first. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The workspace ID (UUID) or slug
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
  public suspend fun deleteWorkspaceWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteWorkspaceResponse> = executor.executeWithResponse<Unit, DeleteWorkspaceResponse>(SdkExecutionRequest(deleteWorkspaceMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), WorkspacesCodecs.deleteWorkspaceRequestCodecRegistry, DeleteWorkspaceResponseDecoder, options)

  /**
   * Remove the budget for a given interval. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param id The workspace ID (UUID) or slug
   * @param interval Budget reset interval. Use "lifetime" for a one-time budget that never resets.
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
   * @throws DeleteWorkspaceBudgetApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded DeleteWorkspaceBudgetError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun deleteWorkspaceBudget(
    id: String,
    interval: WorkspaceBudgetInterval,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.DeleteWorkspaceBudgetResponse = executor.executeWithTypedErrors<Unit, DeleteWorkspaceBudgetResponse, com.nabobery.sdkgen.generated.DeleteWorkspaceBudgetResponse>(
    request = SdkExecutionRequest(deleteWorkspaceBudgetMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "interval", values = listOf(interval.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = WorkspacesCodecs.deleteWorkspaceBudgetRequestCodecRegistry,
    responseDecoder = DeleteWorkspaceBudgetResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DeleteWorkspaceBudgetResponse.SuccessJson -> response.json
        is DeleteWorkspaceBudgetResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteWorkspaceBudgetResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteWorkspaceBudgetResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteWorkspaceBudgetResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DeleteWorkspaceBudgetResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DeleteWorkspaceBudgetResponse.Http401Json -> DeleteWorkspaceBudgetApiException(response, statusCode, headers)
        is DeleteWorkspaceBudgetResponse.Http404Json -> DeleteWorkspaceBudgetApiException(response, statusCode, headers)
        is DeleteWorkspaceBudgetResponse.Http500Json -> DeleteWorkspaceBudgetApiException(response, statusCode, headers)
        is DeleteWorkspaceBudgetResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Remove the budget for a given interval. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The workspace ID (UUID) or slug
   * @param interval Budget reset interval. Use "lifetime" for a one-time budget that never resets.
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
  public suspend fun deleteWorkspaceBudgetWithResponse(
    id: String,
    interval: WorkspaceBudgetInterval,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteWorkspaceBudgetResponse> = executor.executeWithResponse<Unit, DeleteWorkspaceBudgetResponse>(SdkExecutionRequest(deleteWorkspaceBudgetMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "interval", values = listOf(interval.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), WorkspacesCodecs.deleteWorkspaceBudgetRequestCodecRegistry, DeleteWorkspaceBudgetResponseDecoder, options)

  /**
   * Get a single workspace by ID or slug. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param id The workspace ID (UUID) or slug
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
   * @throws GetWorkspaceApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GetWorkspaceError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getWorkspace(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.GetWorkspaceResponse = executor.executeWithTypedErrors<Unit, GetWorkspaceResponse, com.nabobery.sdkgen.generated.GetWorkspaceResponse>(
    request = SdkExecutionRequest(getWorkspaceMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = WorkspacesCodecs.getWorkspaceRequestCodecRegistry,
    responseDecoder = GetWorkspaceResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetWorkspaceResponse.SuccessJson -> response.json
        is GetWorkspaceResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetWorkspaceResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GetWorkspaceResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetWorkspaceResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetWorkspaceResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetWorkspaceResponse.Http401Json -> GetWorkspaceApiException(response, statusCode, headers)
        is GetWorkspaceResponse.Http404Json -> GetWorkspaceApiException(response, statusCode, headers)
        is GetWorkspaceResponse.Http500Json -> GetWorkspaceApiException(response, statusCode, headers)
        is GetWorkspaceResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get a single workspace by ID or slug. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The workspace ID (UUID) or slug
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
  public suspend fun getWorkspaceWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetWorkspaceResponse> = executor.executeWithResponse<Unit, GetWorkspaceResponse>(SdkExecutionRequest(getWorkspaceMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), WorkspacesCodecs.getWorkspaceRequestCodecRegistry, GetWorkspaceResponseDecoder, options)

  /**
   * List all budgets configured for a workspace. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * @param id The workspace ID (UUID) or slug
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
   * @throws ListWorkspaceBudgetsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ListWorkspaceBudgetsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listWorkspaceBudgets(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListWorkspaceBudgetsResponse = executor.executeWithTypedErrors<Unit, ListWorkspaceBudgetsResponse, com.nabobery.sdkgen.generated.ListWorkspaceBudgetsResponse>(
    request = SdkExecutionRequest(listWorkspaceBudgetsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = WorkspacesCodecs.listWorkspaceBudgetsRequestCodecRegistry,
    responseDecoder = ListWorkspaceBudgetsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListWorkspaceBudgetsResponse.SuccessJson -> response.json
        is ListWorkspaceBudgetsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ListWorkspaceBudgetsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ListWorkspaceBudgetsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListWorkspaceBudgetsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListWorkspaceBudgetsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListWorkspaceBudgetsResponse.Http401Json -> ListWorkspaceBudgetsApiException(response, statusCode, headers)
        is ListWorkspaceBudgetsResponse.Http404Json -> ListWorkspaceBudgetsApiException(response, statusCode, headers)
        is ListWorkspaceBudgetsResponse.Http500Json -> ListWorkspaceBudgetsApiException(response, statusCode, headers)
        is ListWorkspaceBudgetsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all budgets configured for a workspace. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The workspace ID (UUID) or slug
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
  public suspend fun listWorkspaceBudgetsWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListWorkspaceBudgetsResponse> = executor.executeWithResponse<Unit, ListWorkspaceBudgetsResponse>(SdkExecutionRequest(listWorkspaceBudgetsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), WorkspacesCodecs.listWorkspaceBudgetsRequestCodecRegistry, ListWorkspaceBudgetsResponseDecoder, options)

  /**
   * List all members of a workspace. Returns paginated results. For the default workspace, returns all organization
   * members (implicit membership). [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param id The workspace ID (UUID) or slug
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
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
   * @throws ListWorkspaceMembersApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ListWorkspaceMembersError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listWorkspaceMembers(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListWorkspaceMembersResponse = executor.executeWithTypedErrors<Unit, ListWorkspaceMembersResponse, com.nabobery.sdkgen.generated.ListWorkspaceMembersResponse>(
    request = SdkExecutionRequest(listWorkspaceMembersMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = WorkspacesCodecs.listWorkspaceMembersRequestCodecRegistry,
    responseDecoder = ListWorkspaceMembersResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListWorkspaceMembersResponse.SuccessJson -> response.json
        is ListWorkspaceMembersResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ListWorkspaceMembersResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ListWorkspaceMembersResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ListWorkspaceMembersResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListWorkspaceMembersResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListWorkspaceMembersResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListWorkspaceMembersResponse.Http401Json -> ListWorkspaceMembersApiException(response, statusCode, headers)
        is ListWorkspaceMembersResponse.Http403Json -> ListWorkspaceMembersApiException(response, statusCode, headers)
        is ListWorkspaceMembersResponse.Http404Json -> ListWorkspaceMembersApiException(response, statusCode, headers)
        is ListWorkspaceMembersResponse.Http500Json -> ListWorkspaceMembersApiException(response, statusCode, headers)
        is ListWorkspaceMembersResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all members of a workspace. Returns paginated results. For the default workspace, returns all organization
   * members (implicit membership). [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The workspace ID (UUID) or slug
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
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
  public suspend fun listWorkspaceMembersWithResponse(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListWorkspaceMembersResponse> = executor.executeWithResponse<Unit, ListWorkspaceMembersResponse>(SdkExecutionRequest(listWorkspaceMembersMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), WorkspacesCodecs.listWorkspaceMembersRequestCodecRegistry, ListWorkspaceMembersResponseDecoder, options)

  /**
   * List all workspaces for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
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
   * @throws ListWorkspacesApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded ListWorkspacesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listWorkspaces(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListWorkspacesResponse = executor.executeWithTypedErrors<Unit, ListWorkspacesResponse, com.nabobery.sdkgen.generated.ListWorkspacesResponse>(
    request = SdkExecutionRequest(listWorkspacesMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = WorkspacesCodecs.listWorkspacesRequestCodecRegistry,
    responseDecoder = ListWorkspacesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListWorkspacesResponse.SuccessJson -> response.json
        is ListWorkspacesResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ListWorkspacesResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListWorkspacesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListWorkspacesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListWorkspacesResponse.Http401Json -> ListWorkspacesApiException(response, statusCode, headers)
        is ListWorkspacesResponse.Http500Json -> ListWorkspacesApiException(response, statusCode, headers)
        is ListWorkspacesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all workspaces for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
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
  public suspend fun listWorkspacesWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListWorkspacesResponse> = executor.executeWithResponse<Unit, ListWorkspacesResponse>(SdkExecutionRequest(listWorkspacesMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), WorkspacesCodecs.listWorkspacesRequestCodecRegistry, ListWorkspacesResponseDecoder, options)

  /**
   * Update an existing workspace by ID or slug. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * @param request Request body sent to the operation.
   * @param id The workspace ID (UUID) or slug
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
   * @throws UpdateWorkspaceApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded UpdateWorkspaceError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun updateWorkspace(
    request: UpdateWorkspaceRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.UpdateWorkspaceResponse = executor.executeWithTypedErrors<UpdateWorkspaceRequest, UpdateWorkspaceResponse, com.nabobery.sdkgen.generated.UpdateWorkspaceResponse>(
    request = SdkExecutionRequest(updateWorkspaceMetadata, baseUri, request, listOf(WorkspacesCodecs.UPDATEWORKSPACE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = WorkspacesCodecs.updateWorkspaceRequestCodecRegistry,
    responseDecoder = UpdateWorkspaceResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UpdateWorkspaceResponse.SuccessJson -> response.json
        is UpdateWorkspaceResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateWorkspaceResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateWorkspaceResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateWorkspaceResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateWorkspaceResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateWorkspaceResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UpdateWorkspaceResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UpdateWorkspaceResponse.Http400Json -> UpdateWorkspaceApiException(response, statusCode, headers)
        is UpdateWorkspaceResponse.Http401Json -> UpdateWorkspaceApiException(response, statusCode, headers)
        is UpdateWorkspaceResponse.Http403Json -> UpdateWorkspaceApiException(response, statusCode, headers)
        is UpdateWorkspaceResponse.Http404Json -> UpdateWorkspaceApiException(response, statusCode, headers)
        is UpdateWorkspaceResponse.Http500Json -> UpdateWorkspaceApiException(response, statusCode, headers)
        is UpdateWorkspaceResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Update an existing workspace by ID or slug. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The workspace ID (UUID) or slug
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
  public suspend fun updateWorkspaceWithResponse(
    request: UpdateWorkspaceRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UpdateWorkspaceResponse> = executor.executeWithResponse<UpdateWorkspaceRequest, UpdateWorkspaceResponse>(SdkExecutionRequest(updateWorkspaceMetadata, baseUri, request, listOf(WorkspacesCodecs.UPDATEWORKSPACE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), WorkspacesCodecs.updateWorkspaceRequestCodecRegistry, UpdateWorkspaceResponseDecoder, options)

  /**
   * Create or update the budget for a given interval. Budget limits must strictly decrease as the interval narrows
   * (lifetime > monthly > weekly > daily). [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param id The workspace ID (UUID) or slug
   * @param interval Budget reset interval. Use "lifetime" for a one-time budget that never resets.
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
   * @throws UpsertWorkspaceBudgetApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded UpsertWorkspaceBudgetError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun upsertWorkspaceBudget(
    request: UpsertWorkspaceBudgetRequest,
    id: String,
    interval: WorkspaceBudgetInterval,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.UpsertWorkspaceBudgetResponse = executor.executeWithTypedErrors<UpsertWorkspaceBudgetRequest, UpsertWorkspaceBudgetResponse, com.nabobery.sdkgen.generated.UpsertWorkspaceBudgetResponse>(
    request = SdkExecutionRequest(upsertWorkspaceBudgetMetadata, baseUri, request, listOf(WorkspacesCodecs.UPSERTWORKSPACEBUDGET_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "interval", values = listOf(interval.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = WorkspacesCodecs.upsertWorkspaceBudgetRequestCodecRegistry,
    responseDecoder = UpsertWorkspaceBudgetResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UpsertWorkspaceBudgetResponse.SuccessJson -> response.json
        is UpsertWorkspaceBudgetResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is UpsertWorkspaceBudgetResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UpsertWorkspaceBudgetResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UpsertWorkspaceBudgetResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is UpsertWorkspaceBudgetResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UpsertWorkspaceBudgetResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UpsertWorkspaceBudgetResponse.Http400Json -> UpsertWorkspaceBudgetApiException(response, statusCode, headers)
        is UpsertWorkspaceBudgetResponse.Http401Json -> UpsertWorkspaceBudgetApiException(response, statusCode, headers)
        is UpsertWorkspaceBudgetResponse.Http404Json -> UpsertWorkspaceBudgetApiException(response, statusCode, headers)
        is UpsertWorkspaceBudgetResponse.Http500Json -> UpsertWorkspaceBudgetApiException(response, statusCode, headers)
        is UpsertWorkspaceBudgetResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create or update the budget for a given interval. Budget limits must strictly decrease as the interval narrows
   * (lifetime > monthly > weekly > daily). [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The workspace ID (UUID) or slug
   * @param interval Budget reset interval. Use "lifetime" for a one-time budget that never resets.
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
  public suspend fun upsertWorkspaceBudgetWithResponse(
    request: UpsertWorkspaceBudgetRequest,
    id: String,
    interval: WorkspaceBudgetInterval,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UpsertWorkspaceBudgetResponse> = executor.executeWithResponse<UpsertWorkspaceBudgetRequest, UpsertWorkspaceBudgetResponse>(SdkExecutionRequest(upsertWorkspaceBudgetMetadata, baseUri, request, listOf(WorkspacesCodecs.UPSERTWORKSPACEBUDGET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "interval", values = listOf(interval.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), WorkspacesCodecs.upsertWorkspaceBudgetRequestCodecRegistry, UpsertWorkspaceBudgetResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `bulkAddWorkspaceMembers` may expose through its typed API
   * exception.
   */
  public sealed interface BulkAddWorkspaceMembersError

  /**
   * Typed response alternatives for `bulkAddWorkspaceMembers`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface BulkAddWorkspaceMembersResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.BulkAddWorkspaceMembersResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAddWorkspaceMembersResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAddWorkspaceMembersResponse,
        BulkAddWorkspaceMembersError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAddWorkspaceMembersResponse,
        BulkAddWorkspaceMembersError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAddWorkspaceMembersResponse,
        BulkAddWorkspaceMembersError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAddWorkspaceMembersResponse,
        BulkAddWorkspaceMembersError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAddWorkspaceMembersResponse,
        BulkAddWorkspaceMembersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAddWorkspaceMembersResponse
  }

  /**
   * Raised by `bulkAddWorkspaceMembers` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class BulkAddWorkspaceMembersApiException(
    public val error: BulkAddWorkspaceMembersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "bulkAddWorkspaceMembers")

  private object BulkAddWorkspaceMembersResponseDecoder : SdkResponseAlternativeDecoder<BulkAddWorkspaceMembersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BulkAddWorkspaceMembersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BulkAddWorkspaceMembersResponse> = when {
      alternative.id == "bulkAddWorkspaceMembers.response.alternative0" -> SdkResponseDecodeResult(
        value = BulkAddWorkspaceMembersResponse.SuccessJson(
          json = WorkspacesCodecs.bulkAddWorkspaceMembersResponseCodecAlternative0Registry.select(listOf("bulkAddWorkspaceMembers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAddWorkspaceMembers.response.alternative1" -> SdkResponseDecodeResult(
        value = BulkAddWorkspaceMembersResponse.Http400Json(
          json = WorkspacesCodecs.bulkAddWorkspaceMembersResponseCodecAlternative1Registry.select(listOf("bulkAddWorkspaceMembers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAddWorkspaceMembers.response.alternative2" -> SdkResponseDecodeResult(
        value = BulkAddWorkspaceMembersResponse.Http401Json(
          json = WorkspacesCodecs.bulkAddWorkspaceMembersResponseCodecAlternative2Registry.select(listOf("bulkAddWorkspaceMembers.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAddWorkspaceMembers.response.alternative3" -> SdkResponseDecodeResult(
        value = BulkAddWorkspaceMembersResponse.Http403Json(
          json = WorkspacesCodecs.bulkAddWorkspaceMembersResponseCodecAlternative3Registry.select(listOf("bulkAddWorkspaceMembers.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAddWorkspaceMembers.response.alternative4" -> SdkResponseDecodeResult(
        value = BulkAddWorkspaceMembersResponse.Http404Json(
          json = WorkspacesCodecs.bulkAddWorkspaceMembersResponseCodecAlternative4Registry.select(listOf("bulkAddWorkspaceMembers.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAddWorkspaceMembers.response.alternative5" -> SdkResponseDecodeResult(
        value = BulkAddWorkspaceMembersResponse.Http500Json(
          json = WorkspacesCodecs.bulkAddWorkspaceMembersResponseCodecAlternative5Registry.select(listOf("bulkAddWorkspaceMembers.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): BulkAddWorkspaceMembersResponse = BulkAddWorkspaceMembersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `bulkRemoveWorkspaceMembers` may expose through its typed API
   * exception.
   */
  public sealed interface BulkRemoveWorkspaceMembersError

  /**
   * Typed response alternatives for `bulkRemoveWorkspaceMembers`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface BulkRemoveWorkspaceMembersResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.BulkRemoveWorkspaceMembersResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkRemoveWorkspaceMembersResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkRemoveWorkspaceMembersResponse,
        BulkRemoveWorkspaceMembersError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkRemoveWorkspaceMembersResponse,
        BulkRemoveWorkspaceMembersError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkRemoveWorkspaceMembersResponse,
        BulkRemoveWorkspaceMembersError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkRemoveWorkspaceMembersResponse,
        BulkRemoveWorkspaceMembersError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkRemoveWorkspaceMembersResponse,
        BulkRemoveWorkspaceMembersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkRemoveWorkspaceMembersResponse
  }

  /**
   * Raised by `bulkRemoveWorkspaceMembers` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class BulkRemoveWorkspaceMembersApiException(
    public val error: BulkRemoveWorkspaceMembersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "bulkRemoveWorkspaceMembers")

  private object BulkRemoveWorkspaceMembersResponseDecoder : SdkResponseAlternativeDecoder<BulkRemoveWorkspaceMembersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BulkRemoveWorkspaceMembersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BulkRemoveWorkspaceMembersResponse> = when {
      alternative.id == "bulkRemoveWorkspaceMembers.response.alternative0" -> SdkResponseDecodeResult(
        value = BulkRemoveWorkspaceMembersResponse.SuccessJson(
          json = WorkspacesCodecs.bulkRemoveWorkspaceMembersResponseCodecAlternative0Registry.select(listOf("bulkRemoveWorkspaceMembers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkRemoveWorkspaceMembers.response.alternative1" -> SdkResponseDecodeResult(
        value = BulkRemoveWorkspaceMembersResponse.Http400Json(
          json = WorkspacesCodecs.bulkRemoveWorkspaceMembersResponseCodecAlternative1Registry.select(listOf("bulkRemoveWorkspaceMembers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkRemoveWorkspaceMembers.response.alternative2" -> SdkResponseDecodeResult(
        value = BulkRemoveWorkspaceMembersResponse.Http401Json(
          json = WorkspacesCodecs.bulkRemoveWorkspaceMembersResponseCodecAlternative2Registry.select(listOf("bulkRemoveWorkspaceMembers.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkRemoveWorkspaceMembers.response.alternative3" -> SdkResponseDecodeResult(
        value = BulkRemoveWorkspaceMembersResponse.Http403Json(
          json = WorkspacesCodecs.bulkRemoveWorkspaceMembersResponseCodecAlternative3Registry.select(listOf("bulkRemoveWorkspaceMembers.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkRemoveWorkspaceMembers.response.alternative4" -> SdkResponseDecodeResult(
        value = BulkRemoveWorkspaceMembersResponse.Http404Json(
          json = WorkspacesCodecs.bulkRemoveWorkspaceMembersResponseCodecAlternative4Registry.select(listOf("bulkRemoveWorkspaceMembers.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkRemoveWorkspaceMembers.response.alternative5" -> SdkResponseDecodeResult(
        value = BulkRemoveWorkspaceMembersResponse.Http500Json(
          json = WorkspacesCodecs.bulkRemoveWorkspaceMembersResponseCodecAlternative5Registry.select(listOf("bulkRemoveWorkspaceMembers.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): BulkRemoveWorkspaceMembersResponse = BulkRemoveWorkspaceMembersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `createWorkspace` may expose through its typed API exception.
   */
  public sealed interface CreateWorkspaceError

  /**
   * Typed response alternatives for `createWorkspace`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CreateWorkspaceResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.CreateWorkspaceResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateWorkspaceResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateWorkspaceResponse,
        CreateWorkspaceError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateWorkspaceResponse,
        CreateWorkspaceError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateWorkspaceResponse,
        CreateWorkspaceError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateWorkspaceResponse,
        CreateWorkspaceError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateWorkspaceResponse
  }

  /**
   * Raised by `createWorkspace` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class CreateWorkspaceApiException(
    public val error: CreateWorkspaceError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createWorkspace")

  private object CreateWorkspaceResponseDecoder : SdkResponseAlternativeDecoder<CreateWorkspaceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateWorkspaceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateWorkspaceResponse> = when {
      alternative.id == "createWorkspace.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateWorkspaceResponse.SuccessJson(
          json = WorkspacesCodecs.createWorkspaceResponseCodecAlternative0Registry.select(listOf("createWorkspace.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createWorkspace.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateWorkspaceResponse.Http400Json(
          json = WorkspacesCodecs.createWorkspaceResponseCodecAlternative1Registry.select(listOf("createWorkspace.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createWorkspace.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateWorkspaceResponse.Http401Json(
          json = WorkspacesCodecs.createWorkspaceResponseCodecAlternative2Registry.select(listOf("createWorkspace.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createWorkspace.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateWorkspaceResponse.Http403Json(
          json = WorkspacesCodecs.createWorkspaceResponseCodecAlternative3Registry.select(listOf("createWorkspace.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createWorkspace.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateWorkspaceResponse.Http500Json(
          json = WorkspacesCodecs.createWorkspaceResponseCodecAlternative4Registry.select(listOf("createWorkspace.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CreateWorkspaceResponse = CreateWorkspaceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `deleteWorkspace` may expose through its typed API exception.
   */
  public sealed interface DeleteWorkspaceError

  /**
   * Typed response alternatives for `deleteWorkspace`. Non-success alternatives are not converted into success values.
   */
  public sealed interface DeleteWorkspaceResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.DeleteWorkspaceResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceResponse,
        DeleteWorkspaceError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceResponse,
        DeleteWorkspaceError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceResponse,
        DeleteWorkspaceError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceResponse,
        DeleteWorkspaceError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceResponse,
        DeleteWorkspaceError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceResponse
  }

  /**
   * Raised by `deleteWorkspace` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class DeleteWorkspaceApiException(
    public val error: DeleteWorkspaceError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "deleteWorkspace")

  private object DeleteWorkspaceResponseDecoder : SdkResponseAlternativeDecoder<DeleteWorkspaceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteWorkspaceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteWorkspaceResponse> = when {
      alternative.id == "deleteWorkspace.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteWorkspaceResponse.SuccessJson(
          json = WorkspacesCodecs.deleteWorkspaceResponseCodecAlternative0Registry.select(listOf("deleteWorkspace.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteWorkspace.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteWorkspaceResponse.Http400Json(
          json = WorkspacesCodecs.deleteWorkspaceResponseCodecAlternative1Registry.select(listOf("deleteWorkspace.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteWorkspace.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteWorkspaceResponse.Http401Json(
          json = WorkspacesCodecs.deleteWorkspaceResponseCodecAlternative2Registry.select(listOf("deleteWorkspace.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteWorkspace.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteWorkspaceResponse.Http403Json(
          json = WorkspacesCodecs.deleteWorkspaceResponseCodecAlternative3Registry.select(listOf("deleteWorkspace.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteWorkspace.response.alternative4" -> SdkResponseDecodeResult(
        value = DeleteWorkspaceResponse.Http404Json(
          json = WorkspacesCodecs.deleteWorkspaceResponseCodecAlternative4Registry.select(listOf("deleteWorkspace.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteWorkspace.response.alternative5" -> SdkResponseDecodeResult(
        value = DeleteWorkspaceResponse.Http500Json(
          json = WorkspacesCodecs.deleteWorkspaceResponseCodecAlternative5Registry.select(listOf("deleteWorkspace.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteWorkspaceResponse = DeleteWorkspaceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `deleteWorkspaceBudget` may expose through its typed API exception.
   */
  public sealed interface DeleteWorkspaceBudgetError

  /**
   * Typed response alternatives for `deleteWorkspaceBudget`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface DeleteWorkspaceBudgetResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.DeleteWorkspaceBudgetResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceBudgetResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceBudgetResponse,
        DeleteWorkspaceBudgetError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceBudgetResponse,
        DeleteWorkspaceBudgetError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceBudgetResponse,
        DeleteWorkspaceBudgetError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteWorkspaceBudgetResponse
  }

  /**
   * Raised by `deleteWorkspaceBudget` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class DeleteWorkspaceBudgetApiException(
    public val error: DeleteWorkspaceBudgetError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "deleteWorkspaceBudget")

  private object DeleteWorkspaceBudgetResponseDecoder : SdkResponseAlternativeDecoder<DeleteWorkspaceBudgetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteWorkspaceBudgetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteWorkspaceBudgetResponse> = when {
      alternative.id == "deleteWorkspaceBudget.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteWorkspaceBudgetResponse.SuccessJson(
          json = WorkspacesCodecs.deleteWorkspaceBudgetResponseCodecAlternative0Registry.select(listOf("deleteWorkspaceBudget.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteWorkspaceBudget.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteWorkspaceBudgetResponse.Http401Json(
          json = WorkspacesCodecs.deleteWorkspaceBudgetResponseCodecAlternative1Registry.select(listOf("deleteWorkspaceBudget.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteWorkspaceBudget.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteWorkspaceBudgetResponse.Http404Json(
          json = WorkspacesCodecs.deleteWorkspaceBudgetResponseCodecAlternative2Registry.select(listOf("deleteWorkspaceBudget.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteWorkspaceBudget.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteWorkspaceBudgetResponse.Http500Json(
          json = WorkspacesCodecs.deleteWorkspaceBudgetResponseCodecAlternative3Registry.select(listOf("deleteWorkspaceBudget.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteWorkspaceBudgetResponse = DeleteWorkspaceBudgetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `getWorkspace` may expose through its typed API exception.
   */
  public sealed interface GetWorkspaceError

  /**
   * Typed response alternatives for `getWorkspace`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetWorkspaceResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.GetWorkspaceResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetWorkspaceResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetWorkspaceResponse,
        GetWorkspaceError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetWorkspaceResponse,
        GetWorkspaceError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetWorkspaceResponse,
        GetWorkspaceError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetWorkspaceResponse
  }

  /**
   * Raised by `getWorkspace` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GetWorkspaceApiException(
    public val error: GetWorkspaceError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getWorkspace")

  private object GetWorkspaceResponseDecoder : SdkResponseAlternativeDecoder<GetWorkspaceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetWorkspaceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetWorkspaceResponse> = when {
      alternative.id == "getWorkspace.response.alternative0" -> SdkResponseDecodeResult(
        value = GetWorkspaceResponse.SuccessJson(
          json = WorkspacesCodecs.getWorkspaceResponseCodecAlternative0Registry.select(listOf("getWorkspace.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getWorkspace.response.alternative1" -> SdkResponseDecodeResult(
        value = GetWorkspaceResponse.Http401Json(
          json = WorkspacesCodecs.getWorkspaceResponseCodecAlternative1Registry.select(listOf("getWorkspace.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getWorkspace.response.alternative2" -> SdkResponseDecodeResult(
        value = GetWorkspaceResponse.Http404Json(
          json = WorkspacesCodecs.getWorkspaceResponseCodecAlternative2Registry.select(listOf("getWorkspace.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getWorkspace.response.alternative3" -> SdkResponseDecodeResult(
        value = GetWorkspaceResponse.Http500Json(
          json = WorkspacesCodecs.getWorkspaceResponseCodecAlternative3Registry.select(listOf("getWorkspace.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetWorkspaceResponse = GetWorkspaceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listWorkspaceBudgets` may expose through its typed API exception.
   */
  public sealed interface ListWorkspaceBudgetsError

  /**
   * Typed response alternatives for `listWorkspaceBudgets`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ListWorkspaceBudgetsResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListWorkspaceBudgetsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspaceBudgetsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspaceBudgetsResponse,
        ListWorkspaceBudgetsError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspaceBudgetsResponse,
        ListWorkspaceBudgetsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspaceBudgetsResponse,
        ListWorkspaceBudgetsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspaceBudgetsResponse
  }

  /**
   * Raised by `listWorkspaceBudgets` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ListWorkspaceBudgetsApiException(
    public val error: ListWorkspaceBudgetsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listWorkspaceBudgets")

  private object ListWorkspaceBudgetsResponseDecoder : SdkResponseAlternativeDecoder<ListWorkspaceBudgetsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListWorkspaceBudgetsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListWorkspaceBudgetsResponse> = when {
      alternative.id == "listWorkspaceBudgets.response.alternative0" -> SdkResponseDecodeResult(
        value = ListWorkspaceBudgetsResponse.SuccessJson(
          json = WorkspacesCodecs.listWorkspaceBudgetsResponseCodecAlternative0Registry.select(listOf("listWorkspaceBudgets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listWorkspaceBudgets.response.alternative1" -> SdkResponseDecodeResult(
        value = ListWorkspaceBudgetsResponse.Http401Json(
          json = WorkspacesCodecs.listWorkspaceBudgetsResponseCodecAlternative1Registry.select(listOf("listWorkspaceBudgets.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listWorkspaceBudgets.response.alternative2" -> SdkResponseDecodeResult(
        value = ListWorkspaceBudgetsResponse.Http404Json(
          json = WorkspacesCodecs.listWorkspaceBudgetsResponseCodecAlternative2Registry.select(listOf("listWorkspaceBudgets.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listWorkspaceBudgets.response.alternative3" -> SdkResponseDecodeResult(
        value = ListWorkspaceBudgetsResponse.Http500Json(
          json = WorkspacesCodecs.listWorkspaceBudgetsResponseCodecAlternative3Registry.select(listOf("listWorkspaceBudgets.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListWorkspaceBudgetsResponse = ListWorkspaceBudgetsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listWorkspaceMembers` may expose through its typed API exception.
   */
  public sealed interface ListWorkspaceMembersError

  /**
   * Typed response alternatives for `listWorkspaceMembers`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ListWorkspaceMembersResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListWorkspaceMembersResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspaceMembersResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspaceMembersResponse,
        ListWorkspaceMembersError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspaceMembersResponse,
        ListWorkspaceMembersError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspaceMembersResponse,
        ListWorkspaceMembersError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspaceMembersResponse,
        ListWorkspaceMembersError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspaceMembersResponse
  }

  /**
   * Raised by `listWorkspaceMembers` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ListWorkspaceMembersApiException(
    public val error: ListWorkspaceMembersError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listWorkspaceMembers")

  private object ListWorkspaceMembersResponseDecoder : SdkResponseAlternativeDecoder<ListWorkspaceMembersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListWorkspaceMembersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListWorkspaceMembersResponse> = when {
      alternative.id == "listWorkspaceMembers.response.alternative0" -> SdkResponseDecodeResult(
        value = ListWorkspaceMembersResponse.SuccessJson(
          json = WorkspacesCodecs.listWorkspaceMembersResponseCodecAlternative0Registry.select(listOf("listWorkspaceMembers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listWorkspaceMembers.response.alternative1" -> SdkResponseDecodeResult(
        value = ListWorkspaceMembersResponse.Http401Json(
          json = WorkspacesCodecs.listWorkspaceMembersResponseCodecAlternative1Registry.select(listOf("listWorkspaceMembers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listWorkspaceMembers.response.alternative2" -> SdkResponseDecodeResult(
        value = ListWorkspaceMembersResponse.Http403Json(
          json = WorkspacesCodecs.listWorkspaceMembersResponseCodecAlternative2Registry.select(listOf("listWorkspaceMembers.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listWorkspaceMembers.response.alternative3" -> SdkResponseDecodeResult(
        value = ListWorkspaceMembersResponse.Http404Json(
          json = WorkspacesCodecs.listWorkspaceMembersResponseCodecAlternative3Registry.select(listOf("listWorkspaceMembers.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listWorkspaceMembers.response.alternative4" -> SdkResponseDecodeResult(
        value = ListWorkspaceMembersResponse.Http500Json(
          json = WorkspacesCodecs.listWorkspaceMembersResponseCodecAlternative4Registry.select(listOf("listWorkspaceMembers.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListWorkspaceMembersResponse = ListWorkspaceMembersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listWorkspaces` may expose through its typed API exception.
   */
  public sealed interface ListWorkspacesError

  /**
   * Typed response alternatives for `listWorkspaces`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListWorkspacesResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListWorkspacesResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspacesResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspacesResponse,
        ListWorkspacesError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspacesResponse,
        ListWorkspacesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListWorkspacesResponse
  }

  /**
   * Raised by `listWorkspaces` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class ListWorkspacesApiException(
    public val error: ListWorkspacesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listWorkspaces")

  private object ListWorkspacesResponseDecoder : SdkResponseAlternativeDecoder<ListWorkspacesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListWorkspacesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListWorkspacesResponse> = when {
      alternative.id == "listWorkspaces.response.alternative0" -> SdkResponseDecodeResult(
        value = ListWorkspacesResponse.SuccessJson(
          json = WorkspacesCodecs.listWorkspacesResponseCodecAlternative0Registry.select(listOf("listWorkspaces.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listWorkspaces.response.alternative1" -> SdkResponseDecodeResult(
        value = ListWorkspacesResponse.Http401Json(
          json = WorkspacesCodecs.listWorkspacesResponseCodecAlternative1Registry.select(listOf("listWorkspaces.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listWorkspaces.response.alternative2" -> SdkResponseDecodeResult(
        value = ListWorkspacesResponse.Http500Json(
          json = WorkspacesCodecs.listWorkspacesResponseCodecAlternative2Registry.select(listOf("listWorkspaces.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListWorkspacesResponse = ListWorkspacesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `updateWorkspace` may expose through its typed API exception.
   */
  public sealed interface UpdateWorkspaceError

  /**
   * Typed response alternatives for `updateWorkspace`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UpdateWorkspaceResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.UpdateWorkspaceResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateWorkspaceResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateWorkspaceResponse,
        UpdateWorkspaceError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateWorkspaceResponse,
        UpdateWorkspaceError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateWorkspaceResponse,
        UpdateWorkspaceError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateWorkspaceResponse,
        UpdateWorkspaceError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateWorkspaceResponse,
        UpdateWorkspaceError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateWorkspaceResponse
  }

  /**
   * Raised by `updateWorkspace` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class UpdateWorkspaceApiException(
    public val error: UpdateWorkspaceError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "updateWorkspace")

  private object UpdateWorkspaceResponseDecoder : SdkResponseAlternativeDecoder<UpdateWorkspaceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UpdateWorkspaceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UpdateWorkspaceResponse> = when {
      alternative.id == "updateWorkspace.response.alternative0" -> SdkResponseDecodeResult(
        value = UpdateWorkspaceResponse.SuccessJson(
          json = WorkspacesCodecs.updateWorkspaceResponseCodecAlternative0Registry.select(listOf("updateWorkspace.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateWorkspace.response.alternative1" -> SdkResponseDecodeResult(
        value = UpdateWorkspaceResponse.Http400Json(
          json = WorkspacesCodecs.updateWorkspaceResponseCodecAlternative1Registry.select(listOf("updateWorkspace.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateWorkspace.response.alternative2" -> SdkResponseDecodeResult(
        value = UpdateWorkspaceResponse.Http401Json(
          json = WorkspacesCodecs.updateWorkspaceResponseCodecAlternative2Registry.select(listOf("updateWorkspace.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateWorkspace.response.alternative3" -> SdkResponseDecodeResult(
        value = UpdateWorkspaceResponse.Http403Json(
          json = WorkspacesCodecs.updateWorkspaceResponseCodecAlternative3Registry.select(listOf("updateWorkspace.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateWorkspace.response.alternative4" -> SdkResponseDecodeResult(
        value = UpdateWorkspaceResponse.Http404Json(
          json = WorkspacesCodecs.updateWorkspaceResponseCodecAlternative4Registry.select(listOf("updateWorkspace.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateWorkspace.response.alternative5" -> SdkResponseDecodeResult(
        value = UpdateWorkspaceResponse.Http500Json(
          json = WorkspacesCodecs.updateWorkspaceResponseCodecAlternative5Registry.select(listOf("updateWorkspace.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UpdateWorkspaceResponse = UpdateWorkspaceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `upsertWorkspaceBudget` may expose through its typed API exception.
   */
  public sealed interface UpsertWorkspaceBudgetError

  /**
   * Typed response alternatives for `upsertWorkspaceBudget`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface UpsertWorkspaceBudgetResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.UpsertWorkspaceBudgetResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpsertWorkspaceBudgetResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpsertWorkspaceBudgetResponse,
        UpsertWorkspaceBudgetError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpsertWorkspaceBudgetResponse,
        UpsertWorkspaceBudgetError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpsertWorkspaceBudgetResponse,
        UpsertWorkspaceBudgetError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpsertWorkspaceBudgetResponse,
        UpsertWorkspaceBudgetError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpsertWorkspaceBudgetResponse
  }

  /**
   * Raised by `upsertWorkspaceBudget` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class UpsertWorkspaceBudgetApiException(
    public val error: UpsertWorkspaceBudgetError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "upsertWorkspaceBudget")

  private object UpsertWorkspaceBudgetResponseDecoder : SdkResponseAlternativeDecoder<UpsertWorkspaceBudgetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UpsertWorkspaceBudgetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UpsertWorkspaceBudgetResponse> = when {
      alternative.id == "upsertWorkspaceBudget.response.alternative0" -> SdkResponseDecodeResult(
        value = UpsertWorkspaceBudgetResponse.SuccessJson(
          json = WorkspacesCodecs.upsertWorkspaceBudgetResponseCodecAlternative0Registry.select(listOf("upsertWorkspaceBudget.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "upsertWorkspaceBudget.response.alternative1" -> SdkResponseDecodeResult(
        value = UpsertWorkspaceBudgetResponse.Http400Json(
          json = WorkspacesCodecs.upsertWorkspaceBudgetResponseCodecAlternative1Registry.select(listOf("upsertWorkspaceBudget.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "upsertWorkspaceBudget.response.alternative2" -> SdkResponseDecodeResult(
        value = UpsertWorkspaceBudgetResponse.Http401Json(
          json = WorkspacesCodecs.upsertWorkspaceBudgetResponseCodecAlternative2Registry.select(listOf("upsertWorkspaceBudget.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "upsertWorkspaceBudget.response.alternative3" -> SdkResponseDecodeResult(
        value = UpsertWorkspaceBudgetResponse.Http404Json(
          json = WorkspacesCodecs.upsertWorkspaceBudgetResponseCodecAlternative3Registry.select(listOf("upsertWorkspaceBudget.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "upsertWorkspaceBudget.response.alternative4" -> SdkResponseDecodeResult(
        value = UpsertWorkspaceBudgetResponse.Http500Json(
          json = WorkspacesCodecs.upsertWorkspaceBudgetResponseCodecAlternative4Registry.select(listOf("upsertWorkspaceBudget.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UpsertWorkspaceBudgetResponse = UpsertWorkspaceBudgetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val bulkAddWorkspaceMembersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "bulkAddWorkspaceMembers",
          method = "POST",
          path = "/workspaces/{id}/members/add",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BulkAddWorkspaceMembersResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAddWorkspaceMembers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAddWorkspaceMembers.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAddWorkspaceMembers.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAddWorkspaceMembers.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAddWorkspaceMembers.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAddWorkspaceMembers.response.alternative5",
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

    internal val bulkRemoveWorkspaceMembersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "bulkRemoveWorkspaceMembers",
          method = "POST",
          path = "/workspaces/{id}/members/remove",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BulkRemoveWorkspaceMembersResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkRemoveWorkspaceMembers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkRemoveWorkspaceMembers.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkRemoveWorkspaceMembers.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkRemoveWorkspaceMembers.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkRemoveWorkspaceMembers.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkRemoveWorkspaceMembers.response.alternative5",
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

    internal val createWorkspaceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createWorkspace",
          method = "POST",
          path = "/workspaces",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CreateWorkspaceResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createWorkspace.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createWorkspace.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createWorkspace.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createWorkspace.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createWorkspace.response.alternative4",
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

    internal val deleteWorkspaceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "deleteWorkspace",
          method = "DELETE",
          path = "/workspaces/{id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeleteWorkspaceResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteWorkspace.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteWorkspace.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteWorkspace.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteWorkspace.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteWorkspace.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteWorkspace.response.alternative5",
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

    internal val deleteWorkspaceBudgetMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "deleteWorkspaceBudget",
          method = "DELETE",
          path = "/workspaces/{id}/budgets/{interval}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeleteWorkspaceBudgetResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteWorkspaceBudget.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteWorkspaceBudget.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteWorkspaceBudget.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteWorkspaceBudget.response.alternative3",
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

    internal val getWorkspaceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "getWorkspace",
          method = "GET",
          path = "/workspaces/{id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GetWorkspaceResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getWorkspace.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getWorkspace.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getWorkspace.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getWorkspace.response.alternative3",
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

    internal val listWorkspaceBudgetsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listWorkspaceBudgets",
          method = "GET",
          path = "/workspaces/{id}/budgets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListWorkspaceBudgetsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaceBudgets.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaceBudgets.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaceBudgets.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaceBudgets.response.alternative3",
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

    internal val listWorkspaceMembersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listWorkspaceMembers",
          method = "GET",
          path = "/workspaces/{id}/members",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListWorkspaceMembersResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaceMembers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaceMembers.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaceMembers.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaceMembers.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaceMembers.response.alternative4",
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

    internal val listWorkspacesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listWorkspaces",
          method = "GET",
          path = "/workspaces",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListWorkspacesResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaces.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaces.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listWorkspaces.response.alternative2",
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

    internal val updateWorkspaceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "updateWorkspace",
          method = "PATCH",
          path = "/workspaces/{id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "UpdateWorkspaceResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateWorkspace.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateWorkspace.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateWorkspace.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateWorkspace.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateWorkspace.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateWorkspace.response.alternative5",
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

    internal val upsertWorkspaceBudgetMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "upsertWorkspaceBudget",
          method = "PUT",
          path = "/workspaces/{id}/budgets/{interval}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "UpsertWorkspaceBudgetResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "upsertWorkspaceBudget.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "upsertWorkspaceBudget.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "upsertWorkspaceBudget.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "upsertWorkspaceBudget.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "upsertWorkspaceBudget.response.alternative4",
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
  }
}
