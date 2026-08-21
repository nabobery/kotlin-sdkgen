package com.nabobery.sdkgen.generated.guardrails

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.BulkAssignKeysRequest
import com.nabobery.sdkgen.generated.BulkAssignKeysResponse
import com.nabobery.sdkgen.generated.BulkAssignMembersRequest
import com.nabobery.sdkgen.generated.BulkAssignMembersResponse
import com.nabobery.sdkgen.generated.BulkUnassignKeysRequest
import com.nabobery.sdkgen.generated.BulkUnassignKeysResponse
import com.nabobery.sdkgen.generated.BulkUnassignMembersRequest
import com.nabobery.sdkgen.generated.BulkUnassignMembersResponse
import com.nabobery.sdkgen.generated.CreateGuardrailRequest
import com.nabobery.sdkgen.generated.CreateGuardrailResponse
import com.nabobery.sdkgen.generated.DeleteGuardrailResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.GetGuardrailResponse
import com.nabobery.sdkgen.generated.Guardrail
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.KeyAssignment
import com.nabobery.sdkgen.generated.ListGuardrailsResponse
import com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse
import com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse
import com.nabobery.sdkgen.generated.MemberAssignment
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.UnauthorizedResponse
import com.nabobery.sdkgen.generated.UpdateGuardrailRequest
import com.nabobery.sdkgen.generated.UpdateGuardrailResponse
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.PaginationDescriptor
import com.nabobery.sdkgen.runtime.PropertyPath
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
import com.nabobery.sdkgen.runtime.pagination.Page
import com.nabobery.sdkgen.runtime.pagination.PageEnvelope
import com.nabobery.sdkgen.runtime.pagination.PageRequest
import com.nabobery.sdkgen.runtime.pagination.PaginationEngine
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.coroutines.flow.Flow

internal object GuardrailsCodecs {
  internal const val BULKASSIGNKEYSTOGUARDRAIL_REQUEST_CODEC_ID: String =
      "bulkAssignKeysToGuardrail.request"

  private val bulkAssignKeysToGuardrailRequestCodec: MediaTypeCodec<BulkAssignKeysRequest> =
      KotlinxSerializationCodec(BULKASSIGNKEYSTOGUARDRAIL_REQUEST_CODEC_ID, BulkAssignKeysRequest.Serializer, SdkJson)

  internal const val BULKASSIGNKEYSTOGUARDRAIL_RESPONSE_CODEC_ID: String =
      "bulkAssignKeysToGuardrail.response"

  private val bulkAssignKeysToGuardrailResponseCodec: MediaTypeCodec<BulkAssignKeysResponse> =
      KotlinxSerializationCodec(BULKASSIGNKEYSTOGUARDRAIL_RESPONSE_CODEC_ID, BulkAssignKeysResponse.Serializer, SdkJson)

  private val bulkAssignKeysToGuardrailResponseCodecAlternative0Codec:
      MediaTypeCodec<BulkAssignKeysResponse> =
      KotlinxSerializationCodec("bulkAssignKeysToGuardrail.response.alternative0", BulkAssignKeysResponse.Serializer, SdkJson)

  internal val bulkAssignKeysToGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BulkAssignKeysResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodecAlternative0Codec)

  private val bulkAssignKeysToGuardrailResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("bulkAssignKeysToGuardrail.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val bulkAssignKeysToGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodecAlternative1Codec)

  private val bulkAssignKeysToGuardrailResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("bulkAssignKeysToGuardrail.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val bulkAssignKeysToGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodecAlternative2Codec)

  private val bulkAssignKeysToGuardrailResponseCodecAlternative3Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("bulkAssignKeysToGuardrail.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val bulkAssignKeysToGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodecAlternative3Codec)

  private val bulkAssignKeysToGuardrailResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("bulkAssignKeysToGuardrail.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val bulkAssignKeysToGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodecAlternative4Codec)

  internal val bulkAssignKeysToGuardrailRequestCodecRegistry:
      MediaTypeCodecRegistry<BulkAssignKeysRequest> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailRequestCodec)

  internal val bulkAssignKeysToGuardrailResponseCodecRegistry:
      MediaTypeCodecRegistry<BulkAssignKeysResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodec)

  internal const val BULKASSIGNMEMBERSTOGUARDRAIL_REQUEST_CODEC_ID: String =
      "bulkAssignMembersToGuardrail.request"

  private val bulkAssignMembersToGuardrailRequestCodec: MediaTypeCodec<BulkAssignMembersRequest> =
      KotlinxSerializationCodec(BULKASSIGNMEMBERSTOGUARDRAIL_REQUEST_CODEC_ID, BulkAssignMembersRequest.Serializer, SdkJson)

  internal const val BULKASSIGNMEMBERSTOGUARDRAIL_RESPONSE_CODEC_ID: String =
      "bulkAssignMembersToGuardrail.response"

  private val bulkAssignMembersToGuardrailResponseCodec: MediaTypeCodec<BulkAssignMembersResponse> =
      KotlinxSerializationCodec(BULKASSIGNMEMBERSTOGUARDRAIL_RESPONSE_CODEC_ID, BulkAssignMembersResponse.Serializer, SdkJson)

  private val bulkAssignMembersToGuardrailResponseCodecAlternative0Codec:
      MediaTypeCodec<BulkAssignMembersResponse> =
      KotlinxSerializationCodec("bulkAssignMembersToGuardrail.response.alternative0", BulkAssignMembersResponse.Serializer, SdkJson)

  internal val bulkAssignMembersToGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BulkAssignMembersResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodecAlternative0Codec)

  private val bulkAssignMembersToGuardrailResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("bulkAssignMembersToGuardrail.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val bulkAssignMembersToGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodecAlternative1Codec)

  private val bulkAssignMembersToGuardrailResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("bulkAssignMembersToGuardrail.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val bulkAssignMembersToGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodecAlternative2Codec)

  private val bulkAssignMembersToGuardrailResponseCodecAlternative3Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("bulkAssignMembersToGuardrail.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val bulkAssignMembersToGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodecAlternative3Codec)

  private val bulkAssignMembersToGuardrailResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("bulkAssignMembersToGuardrail.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val bulkAssignMembersToGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodecAlternative4Codec)

  internal val bulkAssignMembersToGuardrailRequestCodecRegistry:
      MediaTypeCodecRegistry<BulkAssignMembersRequest> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailRequestCodec)

  internal val bulkAssignMembersToGuardrailResponseCodecRegistry:
      MediaTypeCodecRegistry<BulkAssignMembersResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodec)

  internal const val BULKUNASSIGNKEYSFROMGUARDRAIL_REQUEST_CODEC_ID: String =
      "bulkUnassignKeysFromGuardrail.request"

  private val bulkUnassignKeysFromGuardrailRequestCodec: MediaTypeCodec<BulkUnassignKeysRequest> =
      KotlinxSerializationCodec(BULKUNASSIGNKEYSFROMGUARDRAIL_REQUEST_CODEC_ID, BulkUnassignKeysRequest.Serializer, SdkJson)

  internal const val BULKUNASSIGNKEYSFROMGUARDRAIL_RESPONSE_CODEC_ID: String =
      "bulkUnassignKeysFromGuardrail.response"

  private val bulkUnassignKeysFromGuardrailResponseCodec: MediaTypeCodec<BulkUnassignKeysResponse> =
      KotlinxSerializationCodec(BULKUNASSIGNKEYSFROMGUARDRAIL_RESPONSE_CODEC_ID, BulkUnassignKeysResponse.Serializer, SdkJson)

  private val bulkUnassignKeysFromGuardrailResponseCodecAlternative0Codec:
      MediaTypeCodec<BulkUnassignKeysResponse> =
      KotlinxSerializationCodec("bulkUnassignKeysFromGuardrail.response.alternative0", BulkUnassignKeysResponse.Serializer, SdkJson)

  internal val bulkUnassignKeysFromGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BulkUnassignKeysResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodecAlternative0Codec)

  private val bulkUnassignKeysFromGuardrailResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("bulkUnassignKeysFromGuardrail.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val bulkUnassignKeysFromGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodecAlternative1Codec)

  private val bulkUnassignKeysFromGuardrailResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("bulkUnassignKeysFromGuardrail.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val bulkUnassignKeysFromGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodecAlternative2Codec)

  private val bulkUnassignKeysFromGuardrailResponseCodecAlternative3Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("bulkUnassignKeysFromGuardrail.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val bulkUnassignKeysFromGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodecAlternative3Codec)

  private val bulkUnassignKeysFromGuardrailResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("bulkUnassignKeysFromGuardrail.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val bulkUnassignKeysFromGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodecAlternative4Codec)

  internal val bulkUnassignKeysFromGuardrailRequestCodecRegistry:
      MediaTypeCodecRegistry<BulkUnassignKeysRequest> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailRequestCodec)

  internal val bulkUnassignKeysFromGuardrailResponseCodecRegistry:
      MediaTypeCodecRegistry<BulkUnassignKeysResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodec)

  internal const val BULKUNASSIGNMEMBERSFROMGUARDRAIL_REQUEST_CODEC_ID: String =
      "bulkUnassignMembersFromGuardrail.request"

  private val bulkUnassignMembersFromGuardrailRequestCodec:
      MediaTypeCodec<BulkUnassignMembersRequest> =
      KotlinxSerializationCodec(BULKUNASSIGNMEMBERSFROMGUARDRAIL_REQUEST_CODEC_ID, BulkUnassignMembersRequest.Serializer, SdkJson)

  internal const val BULKUNASSIGNMEMBERSFROMGUARDRAIL_RESPONSE_CODEC_ID: String =
      "bulkUnassignMembersFromGuardrail.response"

  private val bulkUnassignMembersFromGuardrailResponseCodec:
      MediaTypeCodec<BulkUnassignMembersResponse> =
      KotlinxSerializationCodec(BULKUNASSIGNMEMBERSFROMGUARDRAIL_RESPONSE_CODEC_ID, BulkUnassignMembersResponse.Serializer, SdkJson)

  private val bulkUnassignMembersFromGuardrailResponseCodecAlternative0Codec:
      MediaTypeCodec<BulkUnassignMembersResponse> =
      KotlinxSerializationCodec("bulkUnassignMembersFromGuardrail.response.alternative0", BulkUnassignMembersResponse.Serializer, SdkJson)

  internal val bulkUnassignMembersFromGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BulkUnassignMembersResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodecAlternative0Codec)

  private val bulkUnassignMembersFromGuardrailResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("bulkUnassignMembersFromGuardrail.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val bulkUnassignMembersFromGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodecAlternative1Codec)

  private val bulkUnassignMembersFromGuardrailResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("bulkUnassignMembersFromGuardrail.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val bulkUnassignMembersFromGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodecAlternative2Codec)

  private val bulkUnassignMembersFromGuardrailResponseCodecAlternative3Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("bulkUnassignMembersFromGuardrail.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val bulkUnassignMembersFromGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodecAlternative3Codec)

  private val bulkUnassignMembersFromGuardrailResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("bulkUnassignMembersFromGuardrail.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val bulkUnassignMembersFromGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodecAlternative4Codec)

  internal val bulkUnassignMembersFromGuardrailRequestCodecRegistry:
      MediaTypeCodecRegistry<BulkUnassignMembersRequest> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailRequestCodec)

  internal val bulkUnassignMembersFromGuardrailResponseCodecRegistry:
      MediaTypeCodecRegistry<BulkUnassignMembersResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodec)

  internal const val CREATEGUARDRAIL_REQUEST_CODEC_ID: String = "createGuardrail.request"

  private val createGuardrailRequestCodec: MediaTypeCodec<CreateGuardrailRequest> =
      KotlinxSerializationCodec(CREATEGUARDRAIL_REQUEST_CODEC_ID, CreateGuardrailRequest.Serializer, SdkJson)

  internal const val CREATEGUARDRAIL_RESPONSE_CODEC_ID: String = "createGuardrail.response"

  private val createGuardrailResponseCodec: MediaTypeCodec<CreateGuardrailResponse> =
      KotlinxSerializationCodec(CREATEGUARDRAIL_RESPONSE_CODEC_ID, CreateGuardrailResponse.Serializer, SdkJson)

  private val createGuardrailResponseCodecAlternative0Codec: MediaTypeCodec<CreateGuardrailResponse>
      =
      KotlinxSerializationCodec("createGuardrail.response.alternative0", CreateGuardrailResponse.Serializer, SdkJson)

  internal val createGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreateGuardrailResponse> =
      MediaTypeCodecRegistry.of(createGuardrailResponseCodecAlternative0Codec)

  private val createGuardrailResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createGuardrail.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createGuardrailResponseCodecAlternative1Codec)

  private val createGuardrailResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createGuardrail.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createGuardrailResponseCodecAlternative2Codec)

  private val createGuardrailResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createGuardrail.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val createGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createGuardrailResponseCodecAlternative3Codec)

  private val createGuardrailResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("createGuardrail.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val createGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createGuardrailResponseCodecAlternative4Codec)

  internal val createGuardrailRequestCodecRegistry: MediaTypeCodecRegistry<CreateGuardrailRequest> =
      MediaTypeCodecRegistry.of(createGuardrailRequestCodec)

  internal val createGuardrailResponseCodecRegistry: MediaTypeCodecRegistry<CreateGuardrailResponse>
      = MediaTypeCodecRegistry.of(createGuardrailResponseCodec)

  internal const val DELETEGUARDRAIL_RESPONSE_CODEC_ID: String = "deleteGuardrail.response"

  private val deleteGuardrailResponseCodec: MediaTypeCodec<DeleteGuardrailResponse> =
      KotlinxSerializationCodec(DELETEGUARDRAIL_RESPONSE_CODEC_ID, DeleteGuardrailResponse.Serializer, SdkJson)

  private val deleteGuardrailResponseCodecAlternative0Codec: MediaTypeCodec<DeleteGuardrailResponse>
      =
      KotlinxSerializationCodec("deleteGuardrail.response.alternative0", DeleteGuardrailResponse.Serializer, SdkJson)

  internal val deleteGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeleteGuardrailResponse> =
      MediaTypeCodecRegistry.of(deleteGuardrailResponseCodecAlternative0Codec)

  private val deleteGuardrailResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteGuardrail.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val deleteGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteGuardrailResponseCodecAlternative1Codec)

  private val deleteGuardrailResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("deleteGuardrail.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val deleteGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(deleteGuardrailResponseCodecAlternative2Codec)

  private val deleteGuardrailResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("deleteGuardrail.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val deleteGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteGuardrailResponseCodecAlternative3Codec)

  internal val deleteGuardrailRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val deleteGuardrailResponseCodecRegistry: MediaTypeCodecRegistry<DeleteGuardrailResponse>
      = MediaTypeCodecRegistry.of(deleteGuardrailResponseCodec)

  internal const val GETGUARDRAIL_RESPONSE_CODEC_ID: String = "getGuardrail.response"

  private val getGuardrailResponseCodec: MediaTypeCodec<GetGuardrailResponse> =
      KotlinxSerializationCodec(GETGUARDRAIL_RESPONSE_CODEC_ID, GetGuardrailResponse.Serializer, SdkJson)

  private val getGuardrailResponseCodecAlternative0Codec: MediaTypeCodec<GetGuardrailResponse> =
      KotlinxSerializationCodec("getGuardrail.response.alternative0", GetGuardrailResponse.Serializer, SdkJson)

  internal val getGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GetGuardrailResponse> =
      MediaTypeCodecRegistry.of(getGuardrailResponseCodecAlternative0Codec)

  private val getGuardrailResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getGuardrail.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val getGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getGuardrailResponseCodecAlternative1Codec)

  private val getGuardrailResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getGuardrail.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val getGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getGuardrailResponseCodecAlternative2Codec)

  private val getGuardrailResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getGuardrail.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val getGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getGuardrailResponseCodecAlternative3Codec)

  internal val getGuardrailRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getGuardrailResponseCodecRegistry: MediaTypeCodecRegistry<GetGuardrailResponse> =
      MediaTypeCodecRegistry.of(getGuardrailResponseCodec)

  internal const val LISTGUARDRAILKEYASSIGNMENTS_RESPONSE_CODEC_ID: String =
      "listGuardrailKeyAssignments.response"

  private val listGuardrailKeyAssignmentsResponseCodec: MediaTypeCodec<ListKeyAssignmentsResponse> =
      KotlinxSerializationCodec(LISTGUARDRAILKEYASSIGNMENTS_RESPONSE_CODEC_ID, ListKeyAssignmentsResponse.Serializer, SdkJson)

  private val listGuardrailKeyAssignmentsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListKeyAssignmentsResponse> =
      KotlinxSerializationCodec("listGuardrailKeyAssignments.response.alternative0", ListKeyAssignmentsResponse.Serializer, SdkJson)

  internal val listGuardrailKeyAssignmentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListKeyAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailKeyAssignmentsResponseCodecAlternative0Codec)

  private val listGuardrailKeyAssignmentsResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listGuardrailKeyAssignments.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listGuardrailKeyAssignmentsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listGuardrailKeyAssignmentsResponseCodecAlternative1Codec)

  private val listGuardrailKeyAssignmentsResponseCodecAlternative2Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listGuardrailKeyAssignments.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val listGuardrailKeyAssignmentsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listGuardrailKeyAssignmentsResponseCodecAlternative2Codec)

  private val listGuardrailKeyAssignmentsResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listGuardrailKeyAssignments.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val listGuardrailKeyAssignmentsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listGuardrailKeyAssignmentsResponseCodecAlternative3Codec)

  internal val listGuardrailKeyAssignmentsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listGuardrailKeyAssignmentsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListKeyAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailKeyAssignmentsResponseCodec)

  internal const val LISTGUARDRAILMEMBERASSIGNMENTS_RESPONSE_CODEC_ID: String =
      "listGuardrailMemberAssignments.response"

  private val listGuardrailMemberAssignmentsResponseCodec:
      MediaTypeCodec<ListMemberAssignmentsResponse> =
      KotlinxSerializationCodec(LISTGUARDRAILMEMBERASSIGNMENTS_RESPONSE_CODEC_ID, ListMemberAssignmentsResponse.Serializer, SdkJson)

  private val listGuardrailMemberAssignmentsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListMemberAssignmentsResponse> =
      KotlinxSerializationCodec("listGuardrailMemberAssignments.response.alternative0", ListMemberAssignmentsResponse.Serializer, SdkJson)

  internal val listGuardrailMemberAssignmentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListMemberAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailMemberAssignmentsResponseCodecAlternative0Codec)

  private val listGuardrailMemberAssignmentsResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listGuardrailMemberAssignments.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listGuardrailMemberAssignmentsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listGuardrailMemberAssignmentsResponseCodecAlternative1Codec)

  private val listGuardrailMemberAssignmentsResponseCodecAlternative2Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listGuardrailMemberAssignments.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val listGuardrailMemberAssignmentsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listGuardrailMemberAssignmentsResponseCodecAlternative2Codec)

  private val listGuardrailMemberAssignmentsResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listGuardrailMemberAssignments.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val listGuardrailMemberAssignmentsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listGuardrailMemberAssignmentsResponseCodecAlternative3Codec)

  internal val listGuardrailMemberAssignmentsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listGuardrailMemberAssignmentsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListMemberAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailMemberAssignmentsResponseCodec)

  internal const val LISTGUARDRAILS_RESPONSE_CODEC_ID: String = "listGuardrails.response"

  private val listGuardrailsResponseCodec: MediaTypeCodec<ListGuardrailsResponse> =
      KotlinxSerializationCodec(LISTGUARDRAILS_RESPONSE_CODEC_ID, ListGuardrailsResponse.Serializer, SdkJson)

  private val listGuardrailsResponseCodecAlternative0Codec: MediaTypeCodec<ListGuardrailsResponse> =
      KotlinxSerializationCodec("listGuardrails.response.alternative0", ListGuardrailsResponse.Serializer, SdkJson)

  internal val listGuardrailsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListGuardrailsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailsResponseCodecAlternative0Codec)

  private val listGuardrailsResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listGuardrails.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listGuardrailsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listGuardrailsResponseCodecAlternative1Codec)

  private val listGuardrailsResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listGuardrails.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  internal val listGuardrailsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listGuardrailsResponseCodecAlternative2Codec)

  internal val listGuardrailsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listGuardrailsResponseCodecRegistry: MediaTypeCodecRegistry<ListGuardrailsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailsResponseCodec)

  internal const val LISTKEYASSIGNMENTS_RESPONSE_CODEC_ID: String = "listKeyAssignments.response"

  private val listKeyAssignmentsResponseCodec: MediaTypeCodec<ListKeyAssignmentsResponse> =
      KotlinxSerializationCodec(LISTKEYASSIGNMENTS_RESPONSE_CODEC_ID, ListKeyAssignmentsResponse.Serializer, SdkJson)

  private val listKeyAssignmentsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListKeyAssignmentsResponse> =
      KotlinxSerializationCodec("listKeyAssignments.response.alternative0", ListKeyAssignmentsResponse.Serializer, SdkJson)

  internal val listKeyAssignmentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListKeyAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listKeyAssignmentsResponseCodecAlternative0Codec)

  private val listKeyAssignmentsResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse>
      =
      KotlinxSerializationCodec("listKeyAssignments.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listKeyAssignmentsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listKeyAssignmentsResponseCodecAlternative1Codec)

  private val listKeyAssignmentsResponseCodecAlternative2Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listKeyAssignments.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  internal val listKeyAssignmentsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listKeyAssignmentsResponseCodecAlternative2Codec)

  internal val listKeyAssignmentsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listKeyAssignmentsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListKeyAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listKeyAssignmentsResponseCodec)

  internal const val LISTMEMBERASSIGNMENTS_RESPONSE_CODEC_ID: String =
      "listMemberAssignments.response"

  private val listMemberAssignmentsResponseCodec: MediaTypeCodec<ListMemberAssignmentsResponse> =
      KotlinxSerializationCodec(LISTMEMBERASSIGNMENTS_RESPONSE_CODEC_ID, ListMemberAssignmentsResponse.Serializer, SdkJson)

  private val listMemberAssignmentsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListMemberAssignmentsResponse> =
      KotlinxSerializationCodec("listMemberAssignments.response.alternative0", ListMemberAssignmentsResponse.Serializer, SdkJson)

  internal val listMemberAssignmentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListMemberAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listMemberAssignmentsResponseCodecAlternative0Codec)

  private val listMemberAssignmentsResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listMemberAssignments.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listMemberAssignmentsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listMemberAssignmentsResponseCodecAlternative1Codec)

  private val listMemberAssignmentsResponseCodecAlternative2Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listMemberAssignments.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  internal val listMemberAssignmentsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listMemberAssignmentsResponseCodecAlternative2Codec)

  internal val listMemberAssignmentsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listMemberAssignmentsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListMemberAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listMemberAssignmentsResponseCodec)

  internal const val UPDATEGUARDRAIL_REQUEST_CODEC_ID: String = "updateGuardrail.request"

  private val updateGuardrailRequestCodec: MediaTypeCodec<UpdateGuardrailRequest> =
      KotlinxSerializationCodec(UPDATEGUARDRAIL_REQUEST_CODEC_ID, UpdateGuardrailRequest.Serializer, SdkJson)

  internal const val UPDATEGUARDRAIL_RESPONSE_CODEC_ID: String = "updateGuardrail.response"

  private val updateGuardrailResponseCodec: MediaTypeCodec<UpdateGuardrailResponse> =
      KotlinxSerializationCodec(UPDATEGUARDRAIL_RESPONSE_CODEC_ID, UpdateGuardrailResponse.Serializer, SdkJson)

  private val updateGuardrailResponseCodecAlternative0Codec: MediaTypeCodec<UpdateGuardrailResponse>
      =
      KotlinxSerializationCodec("updateGuardrail.response.alternative0", UpdateGuardrailResponse.Serializer, SdkJson)

  internal val updateGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<UpdateGuardrailResponse> =
      MediaTypeCodecRegistry.of(updateGuardrailResponseCodecAlternative0Codec)

  private val updateGuardrailResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("updateGuardrail.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val updateGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(updateGuardrailResponseCodecAlternative1Codec)

  private val updateGuardrailResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("updateGuardrail.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val updateGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(updateGuardrailResponseCodecAlternative2Codec)

  private val updateGuardrailResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("updateGuardrail.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val updateGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(updateGuardrailResponseCodecAlternative3Codec)

  private val updateGuardrailResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("updateGuardrail.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val updateGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(updateGuardrailResponseCodecAlternative4Codec)

  internal val updateGuardrailRequestCodecRegistry: MediaTypeCodecRegistry<UpdateGuardrailRequest> =
      MediaTypeCodecRegistry.of(updateGuardrailRequestCodec)

  internal val updateGuardrailResponseCodecRegistry: MediaTypeCodecRegistry<UpdateGuardrailResponse>
      = MediaTypeCodecRegistry.of(updateGuardrailResponseCodec)
}

/**
 * Client for the 'Guardrails' group of OpenRouter API.
 */
public class GuardrailsClient(
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
      SdkExecutor(transport, authentication = this@GuardrailsClient.authentication)

  /**
   * Assign multiple API keys to a specific guardrail. A key may hold at most one guardrail; assigning replaces any
   * existing assignment. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
   * @throws BulkAssignKeysToGuardrailApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded BulkAssignKeysToGuardrailError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun bulkAssignKeysToGuardrail(
    request: BulkAssignKeysRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): BulkAssignKeysResponse = executor.executeWithTypedErrors<BulkAssignKeysRequest, BulkAssignKeysToGuardrailResponse, BulkAssignKeysResponse>(
    request = SdkExecutionRequest(bulkAssignKeysToGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.BULKASSIGNKEYSTOGUARDRAIL_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GuardrailsCodecs.bulkAssignKeysToGuardrailRequestCodecRegistry,
    responseDecoder = BulkAssignKeysToGuardrailResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BulkAssignKeysToGuardrailResponse.SuccessJson -> response.json
        is BulkAssignKeysToGuardrailResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAssignKeysToGuardrailResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAssignKeysToGuardrailResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAssignKeysToGuardrailResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAssignKeysToGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BulkAssignKeysToGuardrailResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BulkAssignKeysToGuardrailResponse.Http400Json -> BulkAssignKeysToGuardrailApiException(response, statusCode, headers)
        is BulkAssignKeysToGuardrailResponse.Http401Json -> BulkAssignKeysToGuardrailApiException(response, statusCode, headers)
        is BulkAssignKeysToGuardrailResponse.Http404Json -> BulkAssignKeysToGuardrailApiException(response, statusCode, headers)
        is BulkAssignKeysToGuardrailResponse.Http500Json -> BulkAssignKeysToGuardrailApiException(response, statusCode, headers)
        is BulkAssignKeysToGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Assign multiple API keys to a specific guardrail. A key may hold at most one guardrail; assigning replaces any
   * existing assignment. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun bulkAssignKeysToGuardrailWithResponse(
    request: BulkAssignKeysRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BulkAssignKeysToGuardrailResponse> = executor.executeWithResponse<BulkAssignKeysRequest, BulkAssignKeysToGuardrailResponse>(SdkExecutionRequest(bulkAssignKeysToGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.BULKASSIGNKEYSTOGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.bulkAssignKeysToGuardrailRequestCodecRegistry, BulkAssignKeysToGuardrailResponseDecoder, options)

  /**
   * Assign multiple organization members to a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
   * @throws BulkAssignMembersToGuardrailApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded BulkAssignMembersToGuardrailError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun bulkAssignMembersToGuardrail(
    request: BulkAssignMembersRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): BulkAssignMembersResponse = executor.executeWithTypedErrors<BulkAssignMembersRequest, BulkAssignMembersToGuardrailResponse, BulkAssignMembersResponse>(
    request = SdkExecutionRequest(bulkAssignMembersToGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.BULKASSIGNMEMBERSTOGUARDRAIL_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GuardrailsCodecs.bulkAssignMembersToGuardrailRequestCodecRegistry,
    responseDecoder = BulkAssignMembersToGuardrailResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BulkAssignMembersToGuardrailResponse.SuccessJson -> response.json
        is BulkAssignMembersToGuardrailResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAssignMembersToGuardrailResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAssignMembersToGuardrailResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAssignMembersToGuardrailResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkAssignMembersToGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BulkAssignMembersToGuardrailResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BulkAssignMembersToGuardrailResponse.Http400Json -> BulkAssignMembersToGuardrailApiException(response, statusCode, headers)
        is BulkAssignMembersToGuardrailResponse.Http401Json -> BulkAssignMembersToGuardrailApiException(response, statusCode, headers)
        is BulkAssignMembersToGuardrailResponse.Http404Json -> BulkAssignMembersToGuardrailApiException(response, statusCode, headers)
        is BulkAssignMembersToGuardrailResponse.Http500Json -> BulkAssignMembersToGuardrailApiException(response, statusCode, headers)
        is BulkAssignMembersToGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Assign multiple organization members to a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun bulkAssignMembersToGuardrailWithResponse(
    request: BulkAssignMembersRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BulkAssignMembersToGuardrailResponse> = executor.executeWithResponse<BulkAssignMembersRequest, BulkAssignMembersToGuardrailResponse>(SdkExecutionRequest(bulkAssignMembersToGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.BULKASSIGNMEMBERSTOGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.bulkAssignMembersToGuardrailRequestCodecRegistry, BulkAssignMembersToGuardrailResponseDecoder, options)

  /**
   * Unassign multiple API keys from a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
   * @throws BulkUnassignKeysFromGuardrailApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded BulkUnassignKeysFromGuardrailError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun bulkUnassignKeysFromGuardrail(
    request: BulkUnassignKeysRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): BulkUnassignKeysResponse = executor.executeWithTypedErrors<BulkUnassignKeysRequest, BulkUnassignKeysFromGuardrailResponse, BulkUnassignKeysResponse>(
    request = SdkExecutionRequest(bulkUnassignKeysFromGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.BULKUNASSIGNKEYSFROMGUARDRAIL_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GuardrailsCodecs.bulkUnassignKeysFromGuardrailRequestCodecRegistry,
    responseDecoder = BulkUnassignKeysFromGuardrailResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BulkUnassignKeysFromGuardrailResponse.SuccessJson -> response.json
        is BulkUnassignKeysFromGuardrailResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkUnassignKeysFromGuardrailResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkUnassignKeysFromGuardrailResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkUnassignKeysFromGuardrailResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkUnassignKeysFromGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BulkUnassignKeysFromGuardrailResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BulkUnassignKeysFromGuardrailResponse.Http400Json -> BulkUnassignKeysFromGuardrailApiException(response, statusCode, headers)
        is BulkUnassignKeysFromGuardrailResponse.Http401Json -> BulkUnassignKeysFromGuardrailApiException(response, statusCode, headers)
        is BulkUnassignKeysFromGuardrailResponse.Http404Json -> BulkUnassignKeysFromGuardrailApiException(response, statusCode, headers)
        is BulkUnassignKeysFromGuardrailResponse.Http500Json -> BulkUnassignKeysFromGuardrailApiException(response, statusCode, headers)
        is BulkUnassignKeysFromGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Unassign multiple API keys from a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun bulkUnassignKeysFromGuardrailWithResponse(
    request: BulkUnassignKeysRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BulkUnassignKeysFromGuardrailResponse> = executor.executeWithResponse<BulkUnassignKeysRequest, BulkUnassignKeysFromGuardrailResponse>(SdkExecutionRequest(bulkUnassignKeysFromGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.BULKUNASSIGNKEYSFROMGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.bulkUnassignKeysFromGuardrailRequestCodecRegistry, BulkUnassignKeysFromGuardrailResponseDecoder, options)

  /**
   * Unassign multiple organization members from a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
   * @throws BulkUnassignMembersFromGuardrailApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded BulkUnassignMembersFromGuardrailError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun bulkUnassignMembersFromGuardrail(
    request: BulkUnassignMembersRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): BulkUnassignMembersResponse = executor.executeWithTypedErrors<BulkUnassignMembersRequest, BulkUnassignMembersFromGuardrailResponse, BulkUnassignMembersResponse>(
    request = SdkExecutionRequest(bulkUnassignMembersFromGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.BULKUNASSIGNMEMBERSFROMGUARDRAIL_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GuardrailsCodecs.bulkUnassignMembersFromGuardrailRequestCodecRegistry,
    responseDecoder = BulkUnassignMembersFromGuardrailResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BulkUnassignMembersFromGuardrailResponse.SuccessJson -> response.json
        is BulkUnassignMembersFromGuardrailResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkUnassignMembersFromGuardrailResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkUnassignMembersFromGuardrailResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkUnassignMembersFromGuardrailResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BulkUnassignMembersFromGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BulkUnassignMembersFromGuardrailResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BulkUnassignMembersFromGuardrailResponse.Http400Json -> BulkUnassignMembersFromGuardrailApiException(response, statusCode, headers)
        is BulkUnassignMembersFromGuardrailResponse.Http401Json -> BulkUnassignMembersFromGuardrailApiException(response, statusCode, headers)
        is BulkUnassignMembersFromGuardrailResponse.Http404Json -> BulkUnassignMembersFromGuardrailApiException(response, statusCode, headers)
        is BulkUnassignMembersFromGuardrailResponse.Http500Json -> BulkUnassignMembersFromGuardrailApiException(response, statusCode, headers)
        is BulkUnassignMembersFromGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Unassign multiple organization members from a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun bulkUnassignMembersFromGuardrailWithResponse(
    request: BulkUnassignMembersRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BulkUnassignMembersFromGuardrailResponse> = executor.executeWithResponse<BulkUnassignMembersRequest, BulkUnassignMembersFromGuardrailResponse>(SdkExecutionRequest(bulkUnassignMembersFromGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.BULKUNASSIGNMEMBERSFROMGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.bulkUnassignMembersFromGuardrailRequestCodecRegistry, BulkUnassignMembersFromGuardrailResponseDecoder, options)

  /**
   * Create a new guardrail for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
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
   * @throws CreateGuardrailApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded CreateGuardrailError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createGuardrail(
    request: CreateGuardrailRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.CreateGuardrailResponse = executor.executeWithTypedErrors<CreateGuardrailRequest, CreateGuardrailResponse, com.nabobery.sdkgen.generated.CreateGuardrailResponse>(
    request = SdkExecutionRequest(createGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.CREATEGUARDRAIL_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GuardrailsCodecs.createGuardrailRequestCodecRegistry,
    responseDecoder = CreateGuardrailResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateGuardrailResponse.SuccessJson -> response.json
        is CreateGuardrailResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateGuardrailResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateGuardrailResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateGuardrailResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateGuardrailResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateGuardrailResponse.Http400Json -> CreateGuardrailApiException(response, statusCode, headers)
        is CreateGuardrailResponse.Http401Json -> CreateGuardrailApiException(response, statusCode, headers)
        is CreateGuardrailResponse.Http403Json -> CreateGuardrailApiException(response, statusCode, headers)
        is CreateGuardrailResponse.Http500Json -> CreateGuardrailApiException(response, statusCode, headers)
        is CreateGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a new guardrail for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
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
  public suspend fun createGuardrailWithResponse(
    request: CreateGuardrailRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateGuardrailResponse> = executor.executeWithResponse<CreateGuardrailRequest, CreateGuardrailResponse>(SdkExecutionRequest(createGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.CREATEGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.createGuardrailRequestCodecRegistry, CreateGuardrailResponseDecoder, options)

  /**
   * Delete an existing guardrail. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param id The unique identifier of the guardrail to delete
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
   * @throws DeleteGuardrailApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded DeleteGuardrailError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun deleteGuardrail(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.DeleteGuardrailResponse = executor.executeWithTypedErrors<Unit, DeleteGuardrailResponse, com.nabobery.sdkgen.generated.DeleteGuardrailResponse>(
    request = SdkExecutionRequest(deleteGuardrailMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GuardrailsCodecs.deleteGuardrailRequestCodecRegistry,
    responseDecoder = DeleteGuardrailResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DeleteGuardrailResponse.SuccessJson -> response.json
        is DeleteGuardrailResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteGuardrailResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteGuardrailResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DeleteGuardrailResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DeleteGuardrailResponse.Http401Json -> DeleteGuardrailApiException(response, statusCode, headers)
        is DeleteGuardrailResponse.Http404Json -> DeleteGuardrailApiException(response, statusCode, headers)
        is DeleteGuardrailResponse.Http500Json -> DeleteGuardrailApiException(response, statusCode, headers)
        is DeleteGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Delete an existing guardrail. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The unique identifier of the guardrail to delete
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun deleteGuardrailWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteGuardrailResponse> = executor.executeWithResponse<Unit, DeleteGuardrailResponse>(SdkExecutionRequest(deleteGuardrailMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.deleteGuardrailRequestCodecRegistry, DeleteGuardrailResponseDecoder, options)

  /**
   * Get a single guardrail by ID. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param id The unique identifier of the guardrail to retrieve
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
   * @throws GetGuardrailApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GetGuardrailError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getGuardrail(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.GetGuardrailResponse = executor.executeWithTypedErrors<Unit, GetGuardrailResponse, com.nabobery.sdkgen.generated.GetGuardrailResponse>(
    request = SdkExecutionRequest(getGuardrailMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GuardrailsCodecs.getGuardrailRequestCodecRegistry,
    responseDecoder = GetGuardrailResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetGuardrailResponse.SuccessJson -> response.json
        is GetGuardrailResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetGuardrailResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GetGuardrailResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetGuardrailResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetGuardrailResponse.Http401Json -> GetGuardrailApiException(response, statusCode, headers)
        is GetGuardrailResponse.Http404Json -> GetGuardrailApiException(response, statusCode, headers)
        is GetGuardrailResponse.Http500Json -> GetGuardrailApiException(response, statusCode, headers)
        is GetGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get a single guardrail by ID. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The unique identifier of the guardrail to retrieve
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun getGuardrailWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetGuardrailResponse> = executor.executeWithResponse<Unit, GetGuardrailResponse>(SdkExecutionRequest(getGuardrailMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.getGuardrailRequestCodecRegistry, GetGuardrailResponseDecoder, options)

  /**
   * List all API key assignments for a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options, including pagination bounds.
   * @return The first decoded page.
   */
  public suspend fun listGuardrailKeyAssignments(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Page<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment> {
    val engine = PaginationEngine<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment>(
          descriptor = requireNotNull(listGuardrailKeyAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
          operationId = listGuardrailKeyAssignmentsMetadata.operationId,
          requestedPageSize = limit,
          initialOffset = offset?.toLong() ?: 0L,
        )
    return engine.firstPage { pageRequest -> fetchlistGuardrailKeyAssignmentsPage(Unit, id, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }
  }

  /**
   * List all API key assignments for a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun listGuardrailKeyAssignmentsWithResponse(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListGuardrailKeyAssignmentsResponse> = executor.executeWithResponse<Unit, ListGuardrailKeyAssignmentsResponse>(SdkExecutionRequest(listGuardrailKeyAssignmentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.listGuardrailKeyAssignmentsRequestCodecRegistry, ListGuardrailKeyAssignmentsResponseDecoder, options)

  /**
   * Returns a cold page flow for listGuardrailKeyAssignments.
   *
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
   * @param options Execution options, including pagination bounds.
   */
  public fun listGuardrailKeyAssignmentsPages(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Page<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment>> = PaginationEngine<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment>(
    descriptor = requireNotNull(listGuardrailKeyAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listGuardrailKeyAssignmentsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).pages(fetch = { pageRequest -> fetchlistGuardrailKeyAssignmentsPage(Unit, id, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  /**
   * Returns a cold item flow for listGuardrailKeyAssignments.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listGuardrailKeyAssignmentsItems(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<KeyAssignment> = PaginationEngine<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment>(
    descriptor = requireNotNull(listGuardrailKeyAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listGuardrailKeyAssignmentsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).items(fetch = { pageRequest -> fetchlistGuardrailKeyAssignmentsPage(Unit, id, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  private fun metadataForListGuardrailKeyAssignmentsPage(
    pageRequest: PageRequest,
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
  ): OperationMetadata = listGuardrailKeyAssignmentsMetadata

  private suspend fun fetchlistGuardrailKeyAssignmentsPage(
    request: Unit,
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    pageRequest: PageRequest,
    options: CallOptions,
  ): PageEnvelope<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment> {
    val pageRequestValue = when (pageRequest) {
      PageRequest.First -> request
      is PageRequest.NextCursor -> request
      is PageRequest.NextOffset -> request
      is PageRequest.NextPage -> request
      is PageRequest.NextUrl -> request
      is PageRequest.NextToken -> request
    }
    val pageMetadata = metadataForListGuardrailKeyAssignmentsPage(pageRequest, id, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle)
    val response = executor.execute<Unit, com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse>(SdkExecutionRequest(pageMetadata, baseUri, pageRequestValue, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = when (pageRequest) {
        is PageRequest.NextOffset -> listOf(pageRequest.offset.toString())
        else -> offset?.let { listOf(it.toString()) }.orEmpty()
      }))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }), listOf(GuardrailsCodecs.LISTGUARDRAILKEYASSIGNMENTS_RESPONSE_CODEC_ID), GuardrailsCodecs.listGuardrailKeyAssignmentsRequestCodecRegistry, GuardrailsCodecs.listGuardrailKeyAssignmentsResponseCodecRegistry, options)
    return PageEnvelope(value = response, items = response.data.orEmpty())
  }

  /**
   * List all organization member assignments for a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options, including pagination bounds.
   * @return The first decoded page.
   */
  public suspend fun listGuardrailMemberAssignments(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Page<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment> {
    val engine = PaginationEngine<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment>(
          descriptor = requireNotNull(listGuardrailMemberAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
          operationId = listGuardrailMemberAssignmentsMetadata.operationId,
          requestedPageSize = limit,
          initialOffset = offset?.toLong() ?: 0L,
        )
    return engine.firstPage { pageRequest -> fetchlistGuardrailMemberAssignmentsPage(Unit, id, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }
  }

  /**
   * List all organization member assignments for a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun listGuardrailMemberAssignmentsWithResponse(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListGuardrailMemberAssignmentsResponse> = executor.executeWithResponse<Unit, ListGuardrailMemberAssignmentsResponse>(SdkExecutionRequest(listGuardrailMemberAssignmentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.listGuardrailMemberAssignmentsRequestCodecRegistry, ListGuardrailMemberAssignmentsResponseDecoder, options)

  /**
   * Returns a cold page flow for listGuardrailMemberAssignments.
   *
   * @param id The unique identifier of the guardrail
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
   * @param options Execution options, including pagination bounds.
   */
  public fun listGuardrailMemberAssignmentsPages(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Page<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment>> = PaginationEngine<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment>(
    descriptor = requireNotNull(listGuardrailMemberAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listGuardrailMemberAssignmentsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).pages(fetch = { pageRequest -> fetchlistGuardrailMemberAssignmentsPage(Unit, id, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  /**
   * Returns a cold item flow for listGuardrailMemberAssignments.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listGuardrailMemberAssignmentsItems(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<MemberAssignment> = PaginationEngine<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment>(
    descriptor = requireNotNull(listGuardrailMemberAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listGuardrailMemberAssignmentsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).items(fetch = { pageRequest -> fetchlistGuardrailMemberAssignmentsPage(Unit, id, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  private fun metadataForListGuardrailMemberAssignmentsPage(
    pageRequest: PageRequest,
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
  ): OperationMetadata = listGuardrailMemberAssignmentsMetadata

  private suspend fun fetchlistGuardrailMemberAssignmentsPage(
    request: Unit,
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    pageRequest: PageRequest,
    options: CallOptions,
  ): PageEnvelope<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment> {
    val pageRequestValue = when (pageRequest) {
      PageRequest.First -> request
      is PageRequest.NextCursor -> request
      is PageRequest.NextOffset -> request
      is PageRequest.NextPage -> request
      is PageRequest.NextUrl -> request
      is PageRequest.NextToken -> request
    }
    val pageMetadata = metadataForListGuardrailMemberAssignmentsPage(pageRequest, id, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle)
    val response = executor.execute<Unit, com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse>(SdkExecutionRequest(pageMetadata, baseUri, pageRequestValue, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = when (pageRequest) {
        is PageRequest.NextOffset -> listOf(pageRequest.offset.toString())
        else -> offset?.let { listOf(it.toString()) }.orEmpty()
      }))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }), listOf(GuardrailsCodecs.LISTGUARDRAILMEMBERASSIGNMENTS_RESPONSE_CODEC_ID), GuardrailsCodecs.listGuardrailMemberAssignmentsRequestCodecRegistry, GuardrailsCodecs.listGuardrailMemberAssignmentsResponseCodecRegistry, options)
    return PageEnvelope(value = response, items = response.data.orEmpty())
  }

  /**
   * List all guardrails for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * @param options Execution options, including pagination bounds.
   * @return The first decoded page.
   */
  public suspend fun listGuardrails(
    limit: Int? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Page<com.nabobery.sdkgen.generated.ListGuardrailsResponse, Guardrail> {
    val engine = PaginationEngine<com.nabobery.sdkgen.generated.ListGuardrailsResponse, Guardrail>(
          descriptor = requireNotNull(listGuardrailsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
          operationId = listGuardrailsMetadata.operationId,
          requestedPageSize = limit,
          initialOffset = offset?.toLong() ?: 0L,
        )
    return engine.firstPage { pageRequest -> fetchlistGuardrailsPage(Unit, limit, offset, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }
  }

  /**
   * List all guardrails for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
   * @param workspaceId Filter guardrails by workspace ID. By default, guardrails in the default workspace are returned.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun listGuardrailsWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListGuardrailsResponse> = executor.executeWithResponse<Unit, ListGuardrailsResponse>(SdkExecutionRequest(listGuardrailsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.listGuardrailsRequestCodecRegistry, ListGuardrailsResponseDecoder, options)

  /**
   * Returns a cold page flow for listGuardrails.
   *
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
   * @param workspaceId Filter guardrails by workspace ID. By default, guardrails in the default workspace are returned.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listGuardrailsPages(
    limit: Int? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Page<com.nabobery.sdkgen.generated.ListGuardrailsResponse, Guardrail>> = PaginationEngine<com.nabobery.sdkgen.generated.ListGuardrailsResponse, Guardrail>(
    descriptor = requireNotNull(listGuardrailsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listGuardrailsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).pages(fetch = { pageRequest -> fetchlistGuardrailsPage(Unit, limit, offset, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  /**
   * Returns a cold item flow for listGuardrails.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listGuardrailsItems(
    limit: Int? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Guardrail> = PaginationEngine<com.nabobery.sdkgen.generated.ListGuardrailsResponse, Guardrail>(
    descriptor = requireNotNull(listGuardrailsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listGuardrailsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).items(fetch = { pageRequest -> fetchlistGuardrailsPage(Unit, limit, offset, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  private fun metadataForListGuardrailsPage(
    pageRequest: PageRequest,
    limit: Int? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
  ): OperationMetadata = listGuardrailsMetadata

  private suspend fun fetchlistGuardrailsPage(
    request: Unit,
    limit: Int? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    pageRequest: PageRequest,
    options: CallOptions,
  ): PageEnvelope<com.nabobery.sdkgen.generated.ListGuardrailsResponse, Guardrail> {
    val pageRequestValue = when (pageRequest) {
      PageRequest.First -> request
      is PageRequest.NextCursor -> request
      is PageRequest.NextOffset -> request
      is PageRequest.NextPage -> request
      is PageRequest.NextUrl -> request
      is PageRequest.NextToken -> request
    }
    val pageMetadata = metadataForListGuardrailsPage(pageRequest, limit, offset, workspaceId, httpReferer, xOpenRouterCategories, xOpenRouterTitle)
    val response = executor.execute<Unit, com.nabobery.sdkgen.generated.ListGuardrailsResponse>(SdkExecutionRequest(pageMetadata, baseUri, pageRequestValue, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = when (pageRequest) {
        is PageRequest.NextOffset -> listOf(pageRequest.offset.toString())
        else -> offset?.let { listOf(it.toString()) }.orEmpty()
      }))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }), listOf(GuardrailsCodecs.LISTGUARDRAILS_RESPONSE_CODEC_ID), GuardrailsCodecs.listGuardrailsRequestCodecRegistry, GuardrailsCodecs.listGuardrailsResponseCodecRegistry, options)
    return PageEnvelope(value = response, items = response.data.orEmpty())
  }

  /**
   * List all API key guardrail assignments for the authenticated user. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options, including pagination bounds.
   * @return The first decoded page.
   */
  public suspend fun listKeyAssignments(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Page<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment> {
    val engine = PaginationEngine<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment>(
          descriptor = requireNotNull(listKeyAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
          operationId = listKeyAssignmentsMetadata.operationId,
          requestedPageSize = limit,
          initialOffset = offset?.toLong() ?: 0L,
        )
    return engine.firstPage { pageRequest -> fetchlistKeyAssignmentsPage(Unit, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }
  }

  /**
   * List all API key guardrail assignments for the authenticated user. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
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
  public suspend fun listKeyAssignmentsWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListKeyAssignmentsResponse> = executor.executeWithResponse<Unit, ListKeyAssignmentsResponse>(SdkExecutionRequest(listKeyAssignmentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.listKeyAssignmentsRequestCodecRegistry, ListKeyAssignmentsResponseDecoder, options)

  /**
   * Returns a cold page flow for listKeyAssignments.
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
   * @param options Execution options, including pagination bounds.
   */
  public fun listKeyAssignmentsPages(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Page<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment>> = PaginationEngine<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment>(
    descriptor = requireNotNull(listKeyAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listKeyAssignmentsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).pages(fetch = { pageRequest -> fetchlistKeyAssignmentsPage(Unit, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  /**
   * Returns a cold item flow for listKeyAssignments.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listKeyAssignmentsItems(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<KeyAssignment> = PaginationEngine<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment>(
    descriptor = requireNotNull(listKeyAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listKeyAssignmentsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).items(fetch = { pageRequest -> fetchlistKeyAssignmentsPage(Unit, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  private fun metadataForListKeyAssignmentsPage(
    pageRequest: PageRequest,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
  ): OperationMetadata = listKeyAssignmentsMetadata

  private suspend fun fetchlistKeyAssignmentsPage(
    request: Unit,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    pageRequest: PageRequest,
    options: CallOptions,
  ): PageEnvelope<com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse, KeyAssignment> {
    val pageRequestValue = when (pageRequest) {
      PageRequest.First -> request
      is PageRequest.NextCursor -> request
      is PageRequest.NextOffset -> request
      is PageRequest.NextPage -> request
      is PageRequest.NextUrl -> request
      is PageRequest.NextToken -> request
    }
    val pageMetadata = metadataForListKeyAssignmentsPage(pageRequest, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle)
    val response = executor.execute<Unit, com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse>(SdkExecutionRequest(pageMetadata, baseUri, pageRequestValue, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = when (pageRequest) {
        is PageRequest.NextOffset -> listOf(pageRequest.offset.toString())
        else -> offset?.let { listOf(it.toString()) }.orEmpty()
      }))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }), listOf(GuardrailsCodecs.LISTKEYASSIGNMENTS_RESPONSE_CODEC_ID), GuardrailsCodecs.listKeyAssignmentsRequestCodecRegistry, GuardrailsCodecs.listKeyAssignmentsResponseCodecRegistry, options)
    return PageEnvelope(value = response, items = response.data.orEmpty())
  }

  /**
   * List all organization member guardrail assignments for the authenticated user. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options, including pagination bounds.
   * @return The first decoded page.
   */
  public suspend fun listMemberAssignments(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Page<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment> {
    val engine = PaginationEngine<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment>(
          descriptor = requireNotNull(listMemberAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
          operationId = listMemberAssignmentsMetadata.operationId,
          requestedPageSize = limit,
          initialOffset = offset?.toLong() ?: 0L,
        )
    return engine.firstPage { pageRequest -> fetchlistMemberAssignmentsPage(Unit, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }
  }

  /**
   * List all organization member guardrail assignments for the authenticated user. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
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
  public suspend fun listMemberAssignmentsWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListMemberAssignmentsResponse> = executor.executeWithResponse<Unit, ListMemberAssignmentsResponse>(SdkExecutionRequest(listMemberAssignmentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.listMemberAssignmentsRequestCodecRegistry, ListMemberAssignmentsResponseDecoder, options)

  /**
   * Returns a cold page flow for listMemberAssignments.
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
   * @param options Execution options, including pagination bounds.
   */
  public fun listMemberAssignmentsPages(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<Page<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment>> = PaginationEngine<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment>(
    descriptor = requireNotNull(listMemberAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listMemberAssignmentsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).pages(fetch = { pageRequest -> fetchlistMemberAssignmentsPage(Unit, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  /**
   * Returns a cold item flow for listMemberAssignments.
   *
   * @param options Execution options, including pagination bounds.
   */
  public fun listMemberAssignmentsItems(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<MemberAssignment> = PaginationEngine<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment>(
    descriptor = requireNotNull(listMemberAssignmentsMetadata.pagination as? PaginationDescriptor.OffsetLimit),
    operationId = listMemberAssignmentsMetadata.operationId,
    requestedPageSize = limit,
    initialOffset = offset?.toLong() ?: 0L,
  ).items(fetch = { pageRequest -> fetchlistMemberAssignmentsPage(Unit, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle, pageRequest, options) }, pagination = options.pagination)

  private fun metadataForListMemberAssignmentsPage(
    pageRequest: PageRequest,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
  ): OperationMetadata = listMemberAssignmentsMetadata

  private suspend fun fetchlistMemberAssignmentsPage(
    request: Unit,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    pageRequest: PageRequest,
    options: CallOptions,
  ): PageEnvelope<com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse, MemberAssignment> {
    val pageRequestValue = when (pageRequest) {
      PageRequest.First -> request
      is PageRequest.NextCursor -> request
      is PageRequest.NextOffset -> request
      is PageRequest.NextPage -> request
      is PageRequest.NextUrl -> request
      is PageRequest.NextToken -> request
    }
    val pageMetadata = metadataForListMemberAssignmentsPage(pageRequest, limit, offset, httpReferer, xOpenRouterCategories, xOpenRouterTitle)
    val response = executor.execute<Unit, com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse>(SdkExecutionRequest(pageMetadata, baseUri, pageRequestValue, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = when (pageRequest) {
        is PageRequest.NextOffset -> listOf(pageRequest.offset.toString())
        else -> offset?.let { listOf(it.toString()) }.orEmpty()
      }))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }), listOf(GuardrailsCodecs.LISTMEMBERASSIGNMENTS_RESPONSE_CODEC_ID), GuardrailsCodecs.listMemberAssignmentsRequestCodecRegistry, GuardrailsCodecs.listMemberAssignmentsResponseCodecRegistry, options)
    return PageEnvelope(value = response, items = response.data.orEmpty())
  }

  /**
   * Update an existing guardrail. Collection fields use replace semantics: send the full desired set on every update.
   * [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param id The unique identifier of the guardrail to update
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
   * @throws UpdateGuardrailApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded UpdateGuardrailError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun updateGuardrail(
    request: UpdateGuardrailRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.UpdateGuardrailResponse = executor.executeWithTypedErrors<UpdateGuardrailRequest, UpdateGuardrailResponse, com.nabobery.sdkgen.generated.UpdateGuardrailResponse>(
    request = SdkExecutionRequest(updateGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.UPDATEGUARDRAIL_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = GuardrailsCodecs.updateGuardrailRequestCodecRegistry,
    responseDecoder = UpdateGuardrailResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UpdateGuardrailResponse.SuccessJson -> response.json
        is UpdateGuardrailResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateGuardrailResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateGuardrailResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateGuardrailResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UpdateGuardrailResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UpdateGuardrailResponse.Http400Json -> UpdateGuardrailApiException(response, statusCode, headers)
        is UpdateGuardrailResponse.Http401Json -> UpdateGuardrailApiException(response, statusCode, headers)
        is UpdateGuardrailResponse.Http404Json -> UpdateGuardrailApiException(response, statusCode, headers)
        is UpdateGuardrailResponse.Http500Json -> UpdateGuardrailApiException(response, statusCode, headers)
        is UpdateGuardrailResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Update an existing guardrail. Collection fields use replace semantics: send the full desired set on every update.
   * [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The unique identifier of the guardrail to update
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public suspend fun updateGuardrailWithResponse(
    request: UpdateGuardrailRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UpdateGuardrailResponse> = executor.executeWithResponse<UpdateGuardrailRequest, UpdateGuardrailResponse>(SdkExecutionRequest(updateGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs.UPDATEGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.updateGuardrailRequestCodecRegistry, UpdateGuardrailResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `bulkAssignKeysToGuardrail` may expose through its typed API
   * exception.
   */
  public sealed interface BulkAssignKeysToGuardrailError

  /**
   * Typed response alternatives for `bulkAssignKeysToGuardrail`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface BulkAssignKeysToGuardrailResponse {
    public class SuccessJson(
      public val json: BulkAssignKeysResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignKeysToGuardrailResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignKeysToGuardrailResponse,
        BulkAssignKeysToGuardrailError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignKeysToGuardrailResponse,
        BulkAssignKeysToGuardrailError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignKeysToGuardrailResponse,
        BulkAssignKeysToGuardrailError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignKeysToGuardrailResponse,
        BulkAssignKeysToGuardrailError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignKeysToGuardrailResponse
  }

  /**
   * Raised by `bulkAssignKeysToGuardrail` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class BulkAssignKeysToGuardrailApiException(
    public val error: BulkAssignKeysToGuardrailError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "bulkAssignKeysToGuardrail")

  private object BulkAssignKeysToGuardrailResponseDecoder : SdkResponseAlternativeDecoder<BulkAssignKeysToGuardrailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BulkAssignKeysToGuardrailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BulkAssignKeysToGuardrailResponse> = when {
      alternative.id == "bulkAssignKeysToGuardrail.response.alternative0" -> SdkResponseDecodeResult(
        value = BulkAssignKeysToGuardrailResponse.SuccessJson(
          json = GuardrailsCodecs.bulkAssignKeysToGuardrailResponseCodecAlternative0Registry.select(listOf("bulkAssignKeysToGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignKeysToGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = BulkAssignKeysToGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.bulkAssignKeysToGuardrailResponseCodecAlternative1Registry.select(listOf("bulkAssignKeysToGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignKeysToGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = BulkAssignKeysToGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.bulkAssignKeysToGuardrailResponseCodecAlternative2Registry.select(listOf("bulkAssignKeysToGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignKeysToGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = BulkAssignKeysToGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.bulkAssignKeysToGuardrailResponseCodecAlternative3Registry.select(listOf("bulkAssignKeysToGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignKeysToGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = BulkAssignKeysToGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.bulkAssignKeysToGuardrailResponseCodecAlternative4Registry.select(listOf("bulkAssignKeysToGuardrail.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): BulkAssignKeysToGuardrailResponse = BulkAssignKeysToGuardrailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `bulkAssignMembersToGuardrail` may expose through its typed API
   * exception.
   */
  public sealed interface BulkAssignMembersToGuardrailError

  /**
   * Typed response alternatives for `bulkAssignMembersToGuardrail`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface BulkAssignMembersToGuardrailResponse {
    public class SuccessJson(
      public val json: BulkAssignMembersResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignMembersToGuardrailResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignMembersToGuardrailResponse,
        BulkAssignMembersToGuardrailError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignMembersToGuardrailResponse,
        BulkAssignMembersToGuardrailError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignMembersToGuardrailResponse,
        BulkAssignMembersToGuardrailError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignMembersToGuardrailResponse,
        BulkAssignMembersToGuardrailError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignMembersToGuardrailResponse
  }

  /**
   * Raised by `bulkAssignMembersToGuardrail` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class BulkAssignMembersToGuardrailApiException(
    public val error: BulkAssignMembersToGuardrailError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "bulkAssignMembersToGuardrail")

  private object BulkAssignMembersToGuardrailResponseDecoder : SdkResponseAlternativeDecoder<BulkAssignMembersToGuardrailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BulkAssignMembersToGuardrailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BulkAssignMembersToGuardrailResponse> = when {
      alternative.id == "bulkAssignMembersToGuardrail.response.alternative0" -> SdkResponseDecodeResult(
        value = BulkAssignMembersToGuardrailResponse.SuccessJson(
          json = GuardrailsCodecs.bulkAssignMembersToGuardrailResponseCodecAlternative0Registry.select(listOf("bulkAssignMembersToGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignMembersToGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = BulkAssignMembersToGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.bulkAssignMembersToGuardrailResponseCodecAlternative1Registry.select(listOf("bulkAssignMembersToGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignMembersToGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = BulkAssignMembersToGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.bulkAssignMembersToGuardrailResponseCodecAlternative2Registry.select(listOf("bulkAssignMembersToGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignMembersToGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = BulkAssignMembersToGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.bulkAssignMembersToGuardrailResponseCodecAlternative3Registry.select(listOf("bulkAssignMembersToGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignMembersToGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = BulkAssignMembersToGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.bulkAssignMembersToGuardrailResponseCodecAlternative4Registry.select(listOf("bulkAssignMembersToGuardrail.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): BulkAssignMembersToGuardrailResponse = BulkAssignMembersToGuardrailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `bulkUnassignKeysFromGuardrail` may expose through its typed API
   * exception.
   */
  public sealed interface BulkUnassignKeysFromGuardrailError

  /**
   * Typed response alternatives for `bulkUnassignKeysFromGuardrail`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface BulkUnassignKeysFromGuardrailResponse {
    public class SuccessJson(
      public val json: BulkUnassignKeysResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignKeysFromGuardrailResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignKeysFromGuardrailResponse,
        BulkUnassignKeysFromGuardrailError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignKeysFromGuardrailResponse,
        BulkUnassignKeysFromGuardrailError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignKeysFromGuardrailResponse,
        BulkUnassignKeysFromGuardrailError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignKeysFromGuardrailResponse,
        BulkUnassignKeysFromGuardrailError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignKeysFromGuardrailResponse
  }

  /**
   * Raised by `bulkUnassignKeysFromGuardrail` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class BulkUnassignKeysFromGuardrailApiException(
    public val error: BulkUnassignKeysFromGuardrailError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "bulkUnassignKeysFromGuardrail")

  private object BulkUnassignKeysFromGuardrailResponseDecoder : SdkResponseAlternativeDecoder<BulkUnassignKeysFromGuardrailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BulkUnassignKeysFromGuardrailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BulkUnassignKeysFromGuardrailResponse> = when {
      alternative.id == "bulkUnassignKeysFromGuardrail.response.alternative0" -> SdkResponseDecodeResult(
        value = BulkUnassignKeysFromGuardrailResponse.SuccessJson(
          json = GuardrailsCodecs.bulkUnassignKeysFromGuardrailResponseCodecAlternative0Registry.select(listOf("bulkUnassignKeysFromGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignKeysFromGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = BulkUnassignKeysFromGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.bulkUnassignKeysFromGuardrailResponseCodecAlternative1Registry.select(listOf("bulkUnassignKeysFromGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignKeysFromGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = BulkUnassignKeysFromGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.bulkUnassignKeysFromGuardrailResponseCodecAlternative2Registry.select(listOf("bulkUnassignKeysFromGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignKeysFromGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = BulkUnassignKeysFromGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.bulkUnassignKeysFromGuardrailResponseCodecAlternative3Registry.select(listOf("bulkUnassignKeysFromGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignKeysFromGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = BulkUnassignKeysFromGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.bulkUnassignKeysFromGuardrailResponseCodecAlternative4Registry.select(listOf("bulkUnassignKeysFromGuardrail.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): BulkUnassignKeysFromGuardrailResponse = BulkUnassignKeysFromGuardrailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `bulkUnassignMembersFromGuardrail` may expose through its typed API
   * exception.
   */
  public sealed interface BulkUnassignMembersFromGuardrailError

  /**
   * Typed response alternatives for `bulkUnassignMembersFromGuardrail`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface BulkUnassignMembersFromGuardrailResponse {
    public class SuccessJson(
      public val json: BulkUnassignMembersResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignMembersFromGuardrailResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignMembersFromGuardrailResponse,
        BulkUnassignMembersFromGuardrailError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignMembersFromGuardrailResponse,
        BulkUnassignMembersFromGuardrailError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignMembersFromGuardrailResponse,
        BulkUnassignMembersFromGuardrailError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignMembersFromGuardrailResponse,
        BulkUnassignMembersFromGuardrailError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignMembersFromGuardrailResponse
  }

  /**
   * Raised by `bulkUnassignMembersFromGuardrail` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class BulkUnassignMembersFromGuardrailApiException(
    public val error: BulkUnassignMembersFromGuardrailError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "bulkUnassignMembersFromGuardrail")

  private object BulkUnassignMembersFromGuardrailResponseDecoder : SdkResponseAlternativeDecoder<BulkUnassignMembersFromGuardrailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BulkUnassignMembersFromGuardrailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BulkUnassignMembersFromGuardrailResponse> = when {
      alternative.id == "bulkUnassignMembersFromGuardrail.response.alternative0" -> SdkResponseDecodeResult(
        value = BulkUnassignMembersFromGuardrailResponse.SuccessJson(
          json = GuardrailsCodecs.bulkUnassignMembersFromGuardrailResponseCodecAlternative0Registry.select(listOf("bulkUnassignMembersFromGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignMembersFromGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = BulkUnassignMembersFromGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.bulkUnassignMembersFromGuardrailResponseCodecAlternative1Registry.select(listOf("bulkUnassignMembersFromGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignMembersFromGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = BulkUnassignMembersFromGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.bulkUnassignMembersFromGuardrailResponseCodecAlternative2Registry.select(listOf("bulkUnassignMembersFromGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignMembersFromGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = BulkUnassignMembersFromGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.bulkUnassignMembersFromGuardrailResponseCodecAlternative3Registry.select(listOf("bulkUnassignMembersFromGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignMembersFromGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = BulkUnassignMembersFromGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.bulkUnassignMembersFromGuardrailResponseCodecAlternative4Registry.select(listOf("bulkUnassignMembersFromGuardrail.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): BulkUnassignMembersFromGuardrailResponse = BulkUnassignMembersFromGuardrailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `createGuardrail` may expose through its typed API exception.
   */
  public sealed interface CreateGuardrailError

  /**
   * Typed response alternatives for `createGuardrail`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CreateGuardrailResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.CreateGuardrailResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateGuardrailResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateGuardrailResponse,
        CreateGuardrailError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateGuardrailResponse,
        CreateGuardrailError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateGuardrailResponse,
        CreateGuardrailError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateGuardrailResponse,
        CreateGuardrailError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateGuardrailResponse
  }

  /**
   * Raised by `createGuardrail` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class CreateGuardrailApiException(
    public val error: CreateGuardrailError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createGuardrail")

  private object CreateGuardrailResponseDecoder : SdkResponseAlternativeDecoder<CreateGuardrailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateGuardrailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateGuardrailResponse> = when {
      alternative.id == "createGuardrail.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateGuardrailResponse.SuccessJson(
          json = GuardrailsCodecs.createGuardrailResponseCodecAlternative0Registry.select(listOf("createGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.createGuardrailResponseCodecAlternative1Registry.select(listOf("createGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.createGuardrailResponseCodecAlternative2Registry.select(listOf("createGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateGuardrailResponse.Http403Json(
          json = GuardrailsCodecs.createGuardrailResponseCodecAlternative3Registry.select(listOf("createGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.createGuardrailResponseCodecAlternative4Registry.select(listOf("createGuardrail.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CreateGuardrailResponse = CreateGuardrailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `deleteGuardrail` may expose through its typed API exception.
   */
  public sealed interface DeleteGuardrailError

  /**
   * Typed response alternatives for `deleteGuardrail`. Non-success alternatives are not converted into success values.
   */
  public sealed interface DeleteGuardrailResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.DeleteGuardrailResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteGuardrailResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteGuardrailResponse,
        DeleteGuardrailError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteGuardrailResponse,
        DeleteGuardrailError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteGuardrailResponse,
        DeleteGuardrailError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteGuardrailResponse
  }

  /**
   * Raised by `deleteGuardrail` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class DeleteGuardrailApiException(
    public val error: DeleteGuardrailError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "deleteGuardrail")

  private object DeleteGuardrailResponseDecoder : SdkResponseAlternativeDecoder<DeleteGuardrailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteGuardrailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteGuardrailResponse> = when {
      alternative.id == "deleteGuardrail.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteGuardrailResponse.SuccessJson(
          json = GuardrailsCodecs.deleteGuardrailResponseCodecAlternative0Registry.select(listOf("deleteGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.deleteGuardrailResponseCodecAlternative1Registry.select(listOf("deleteGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.deleteGuardrailResponseCodecAlternative2Registry.select(listOf("deleteGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.deleteGuardrailResponseCodecAlternative3Registry.select(listOf("deleteGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteGuardrailResponse = DeleteGuardrailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `getGuardrail` may expose through its typed API exception.
   */
  public sealed interface GetGuardrailError

  /**
   * Typed response alternatives for `getGuardrail`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetGuardrailResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.GetGuardrailResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGuardrailResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGuardrailResponse,
        GetGuardrailError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGuardrailResponse,
        GetGuardrailError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGuardrailResponse,
        GetGuardrailError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGuardrailResponse
  }

  /**
   * Raised by `getGuardrail` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GetGuardrailApiException(
    public val error: GetGuardrailError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getGuardrail")

  private object GetGuardrailResponseDecoder : SdkResponseAlternativeDecoder<GetGuardrailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetGuardrailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetGuardrailResponse> = when {
      alternative.id == "getGuardrail.response.alternative0" -> SdkResponseDecodeResult(
        value = GetGuardrailResponse.SuccessJson(
          json = GuardrailsCodecs.getGuardrailResponseCodecAlternative0Registry.select(listOf("getGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = GetGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.getGuardrailResponseCodecAlternative1Registry.select(listOf("getGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = GetGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.getGuardrailResponseCodecAlternative2Registry.select(listOf("getGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = GetGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.getGuardrailResponseCodecAlternative3Registry.select(listOf("getGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetGuardrailResponse = GetGuardrailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listGuardrailKeyAssignments` may expose through its typed API
   * exception.
   */
  public sealed interface ListGuardrailKeyAssignmentsError

  /**
   * Typed response alternatives for `listGuardrailKeyAssignments`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ListGuardrailKeyAssignmentsResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailKeyAssignmentsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailKeyAssignmentsResponse,
        ListGuardrailKeyAssignmentsError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailKeyAssignmentsResponse,
        ListGuardrailKeyAssignmentsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailKeyAssignmentsResponse,
        ListGuardrailKeyAssignmentsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailKeyAssignmentsResponse
  }

  /**
   * Raised by `listGuardrailKeyAssignments` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ListGuardrailKeyAssignmentsApiException(
    public val error: ListGuardrailKeyAssignmentsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listGuardrailKeyAssignments")

  private object ListGuardrailKeyAssignmentsResponseDecoder : SdkResponseAlternativeDecoder<ListGuardrailKeyAssignmentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListGuardrailKeyAssignmentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListGuardrailKeyAssignmentsResponse> = when {
      alternative.id == "listGuardrailKeyAssignments.response.alternative0" -> SdkResponseDecodeResult(
        value = ListGuardrailKeyAssignmentsResponse.SuccessJson(
          json = GuardrailsCodecs.listGuardrailKeyAssignmentsResponseCodecAlternative0Registry.select(listOf("listGuardrailKeyAssignments.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailKeyAssignments.response.alternative1" -> SdkResponseDecodeResult(
        value = ListGuardrailKeyAssignmentsResponse.Http401Json(
          json = GuardrailsCodecs.listGuardrailKeyAssignmentsResponseCodecAlternative1Registry.select(listOf("listGuardrailKeyAssignments.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailKeyAssignments.response.alternative2" -> SdkResponseDecodeResult(
        value = ListGuardrailKeyAssignmentsResponse.Http404Json(
          json = GuardrailsCodecs.listGuardrailKeyAssignmentsResponseCodecAlternative2Registry.select(listOf("listGuardrailKeyAssignments.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailKeyAssignments.response.alternative3" -> SdkResponseDecodeResult(
        value = ListGuardrailKeyAssignmentsResponse.Http500Json(
          json = GuardrailsCodecs.listGuardrailKeyAssignmentsResponseCodecAlternative3Registry.select(listOf("listGuardrailKeyAssignments.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListGuardrailKeyAssignmentsResponse = ListGuardrailKeyAssignmentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listGuardrailMemberAssignments` may expose through its typed API
   * exception.
   */
  public sealed interface ListGuardrailMemberAssignmentsError

  /**
   * Typed response alternatives for `listGuardrailMemberAssignments`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ListGuardrailMemberAssignmentsResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailMemberAssignmentsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailMemberAssignmentsResponse,
        ListGuardrailMemberAssignmentsError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailMemberAssignmentsResponse,
        ListGuardrailMemberAssignmentsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailMemberAssignmentsResponse,
        ListGuardrailMemberAssignmentsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailMemberAssignmentsResponse
  }

  /**
   * Raised by `listGuardrailMemberAssignments` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ListGuardrailMemberAssignmentsApiException(
    public val error: ListGuardrailMemberAssignmentsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listGuardrailMemberAssignments")

  private object ListGuardrailMemberAssignmentsResponseDecoder : SdkResponseAlternativeDecoder<ListGuardrailMemberAssignmentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListGuardrailMemberAssignmentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListGuardrailMemberAssignmentsResponse> = when {
      alternative.id == "listGuardrailMemberAssignments.response.alternative0" -> SdkResponseDecodeResult(
        value = ListGuardrailMemberAssignmentsResponse.SuccessJson(
          json = GuardrailsCodecs.listGuardrailMemberAssignmentsResponseCodecAlternative0Registry.select(listOf("listGuardrailMemberAssignments.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailMemberAssignments.response.alternative1" -> SdkResponseDecodeResult(
        value = ListGuardrailMemberAssignmentsResponse.Http401Json(
          json = GuardrailsCodecs.listGuardrailMemberAssignmentsResponseCodecAlternative1Registry.select(listOf("listGuardrailMemberAssignments.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailMemberAssignments.response.alternative2" -> SdkResponseDecodeResult(
        value = ListGuardrailMemberAssignmentsResponse.Http404Json(
          json = GuardrailsCodecs.listGuardrailMemberAssignmentsResponseCodecAlternative2Registry.select(listOf("listGuardrailMemberAssignments.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailMemberAssignments.response.alternative3" -> SdkResponseDecodeResult(
        value = ListGuardrailMemberAssignmentsResponse.Http500Json(
          json = GuardrailsCodecs.listGuardrailMemberAssignmentsResponseCodecAlternative3Registry.select(listOf("listGuardrailMemberAssignments.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListGuardrailMemberAssignmentsResponse = ListGuardrailMemberAssignmentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listGuardrails` may expose through its typed API exception.
   */
  public sealed interface ListGuardrailsError

  /**
   * Typed response alternatives for `listGuardrails`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListGuardrailsResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListGuardrailsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailsResponse,
        ListGuardrailsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailsResponse,
        ListGuardrailsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailsResponse
  }

  /**
   * Raised by `listGuardrails` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class ListGuardrailsApiException(
    public val error: ListGuardrailsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listGuardrails")

  private object ListGuardrailsResponseDecoder : SdkResponseAlternativeDecoder<ListGuardrailsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListGuardrailsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListGuardrailsResponse> = when {
      alternative.id == "listGuardrails.response.alternative0" -> SdkResponseDecodeResult(
        value = ListGuardrailsResponse.SuccessJson(
          json = GuardrailsCodecs.listGuardrailsResponseCodecAlternative0Registry.select(listOf("listGuardrails.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrails.response.alternative1" -> SdkResponseDecodeResult(
        value = ListGuardrailsResponse.Http401Json(
          json = GuardrailsCodecs.listGuardrailsResponseCodecAlternative1Registry.select(listOf("listGuardrails.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrails.response.alternative2" -> SdkResponseDecodeResult(
        value = ListGuardrailsResponse.Http500Json(
          json = GuardrailsCodecs.listGuardrailsResponseCodecAlternative2Registry.select(listOf("listGuardrails.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListGuardrailsResponse = ListGuardrailsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listKeyAssignments` may expose through its typed API exception.
   */
  public sealed interface ListKeyAssignmentsError

  /**
   * Typed response alternatives for `listKeyAssignments`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ListKeyAssignmentsResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListKeyAssignmentsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListKeyAssignmentsResponse,
        ListKeyAssignmentsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListKeyAssignmentsResponse,
        ListKeyAssignmentsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListKeyAssignmentsResponse
  }

  /**
   * Raised by `listKeyAssignments` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class ListKeyAssignmentsApiException(
    public val error: ListKeyAssignmentsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listKeyAssignments")

  private object ListKeyAssignmentsResponseDecoder : SdkResponseAlternativeDecoder<ListKeyAssignmentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListKeyAssignmentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListKeyAssignmentsResponse> = when {
      alternative.id == "listKeyAssignments.response.alternative0" -> SdkResponseDecodeResult(
        value = ListKeyAssignmentsResponse.SuccessJson(
          json = GuardrailsCodecs.listKeyAssignmentsResponseCodecAlternative0Registry.select(listOf("listKeyAssignments.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listKeyAssignments.response.alternative1" -> SdkResponseDecodeResult(
        value = ListKeyAssignmentsResponse.Http401Json(
          json = GuardrailsCodecs.listKeyAssignmentsResponseCodecAlternative1Registry.select(listOf("listKeyAssignments.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listKeyAssignments.response.alternative2" -> SdkResponseDecodeResult(
        value = ListKeyAssignmentsResponse.Http500Json(
          json = GuardrailsCodecs.listKeyAssignmentsResponseCodecAlternative2Registry.select(listOf("listKeyAssignments.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListKeyAssignmentsResponse = ListKeyAssignmentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listMemberAssignments` may expose through its typed API exception.
   */
  public sealed interface ListMemberAssignmentsError

  /**
   * Typed response alternatives for `listMemberAssignments`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ListMemberAssignmentsResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListMemberAssignmentsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListMemberAssignmentsResponse,
        ListMemberAssignmentsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListMemberAssignmentsResponse,
        ListMemberAssignmentsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListMemberAssignmentsResponse
  }

  /**
   * Raised by `listMemberAssignments` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ListMemberAssignmentsApiException(
    public val error: ListMemberAssignmentsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listMemberAssignments")

  private object ListMemberAssignmentsResponseDecoder : SdkResponseAlternativeDecoder<ListMemberAssignmentsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListMemberAssignmentsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListMemberAssignmentsResponse> = when {
      alternative.id == "listMemberAssignments.response.alternative0" -> SdkResponseDecodeResult(
        value = ListMemberAssignmentsResponse.SuccessJson(
          json = GuardrailsCodecs.listMemberAssignmentsResponseCodecAlternative0Registry.select(listOf("listMemberAssignments.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listMemberAssignments.response.alternative1" -> SdkResponseDecodeResult(
        value = ListMemberAssignmentsResponse.Http401Json(
          json = GuardrailsCodecs.listMemberAssignmentsResponseCodecAlternative1Registry.select(listOf("listMemberAssignments.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listMemberAssignments.response.alternative2" -> SdkResponseDecodeResult(
        value = ListMemberAssignmentsResponse.Http500Json(
          json = GuardrailsCodecs.listMemberAssignmentsResponseCodecAlternative2Registry.select(listOf("listMemberAssignments.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListMemberAssignmentsResponse = ListMemberAssignmentsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `updateGuardrail` may expose through its typed API exception.
   */
  public sealed interface UpdateGuardrailError

  /**
   * Typed response alternatives for `updateGuardrail`. Non-success alternatives are not converted into success values.
   */
  public sealed interface UpdateGuardrailResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.UpdateGuardrailResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateGuardrailResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateGuardrailResponse,
        UpdateGuardrailError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateGuardrailResponse,
        UpdateGuardrailError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateGuardrailResponse,
        UpdateGuardrailError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateGuardrailResponse,
        UpdateGuardrailError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateGuardrailResponse
  }

  /**
   * Raised by `updateGuardrail` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class UpdateGuardrailApiException(
    public val error: UpdateGuardrailError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "updateGuardrail")

  private object UpdateGuardrailResponseDecoder : SdkResponseAlternativeDecoder<UpdateGuardrailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UpdateGuardrailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UpdateGuardrailResponse> = when {
      alternative.id == "updateGuardrail.response.alternative0" -> SdkResponseDecodeResult(
        value = UpdateGuardrailResponse.SuccessJson(
          json = GuardrailsCodecs.updateGuardrailResponseCodecAlternative0Registry.select(listOf("updateGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = UpdateGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.updateGuardrailResponseCodecAlternative1Registry.select(listOf("updateGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = UpdateGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.updateGuardrailResponseCodecAlternative2Registry.select(listOf("updateGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = UpdateGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.updateGuardrailResponseCodecAlternative3Registry.select(listOf("updateGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = UpdateGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.updateGuardrailResponseCodecAlternative4Registry.select(listOf("updateGuardrail.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UpdateGuardrailResponse = UpdateGuardrailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val bulkAssignKeysToGuardrailMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "bulkAssignKeysToGuardrail",
          method = "POST",
          path = "/guardrails/{id}/assignments/keys",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BulkAssignKeysResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAssignKeysToGuardrail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAssignKeysToGuardrail.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAssignKeysToGuardrail.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAssignKeysToGuardrail.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAssignKeysToGuardrail.response.alternative4",
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

    internal val bulkAssignMembersToGuardrailMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "bulkAssignMembersToGuardrail",
          method = "POST",
          path = "/guardrails/{id}/assignments/members",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BulkAssignMembersResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAssignMembersToGuardrail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAssignMembersToGuardrail.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAssignMembersToGuardrail.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAssignMembersToGuardrail.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkAssignMembersToGuardrail.response.alternative4",
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

    internal val bulkUnassignKeysFromGuardrailMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "bulkUnassignKeysFromGuardrail",
          method = "POST",
          path = "/guardrails/{id}/assignments/keys/remove",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BulkUnassignKeysResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkUnassignKeysFromGuardrail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkUnassignKeysFromGuardrail.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkUnassignKeysFromGuardrail.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkUnassignKeysFromGuardrail.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkUnassignKeysFromGuardrail.response.alternative4",
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

    internal val bulkUnassignMembersFromGuardrailMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "bulkUnassignMembersFromGuardrail",
          method = "POST",
          path = "/guardrails/{id}/assignments/members/remove",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BulkUnassignMembersResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkUnassignMembersFromGuardrail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkUnassignMembersFromGuardrail.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkUnassignMembersFromGuardrail.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkUnassignMembersFromGuardrail.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "bulkUnassignMembersFromGuardrail.response.alternative4",
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

    internal val createGuardrailMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createGuardrail",
          method = "POST",
          path = "/guardrails",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CreateGuardrailResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createGuardrail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createGuardrail.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createGuardrail.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createGuardrail.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createGuardrail.response.alternative4",
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

    internal val deleteGuardrailMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "deleteGuardrail",
          method = "DELETE",
          path = "/guardrails/{id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeleteGuardrailResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteGuardrail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteGuardrail.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteGuardrail.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteGuardrail.response.alternative3",
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

    internal val getGuardrailMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "getGuardrail",
          method = "GET",
          path = "/guardrails/{id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GetGuardrailResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGuardrail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGuardrail.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGuardrail.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getGuardrail.response.alternative3",
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

    internal val listGuardrailKeyAssignmentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listGuardrailKeyAssignments",
          method = "GET",
          path = "/guardrails/{id}/assignments/keys",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListKeyAssignmentsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGuardrailKeyAssignments.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGuardrailKeyAssignments.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGuardrailKeyAssignments.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGuardrailKeyAssignments.response.alternative3",
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
          pagination = PaginationDescriptor.OffsetLimit(requestOffsetParam = "offset", requestLimitParam = "limit", responseItemsPath = PropertyPath("data"), responseTotalPath = null),
          streaming = null,
        ) }

    internal val listGuardrailMemberAssignmentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listGuardrailMemberAssignments",
          method = "GET",
          path = "/guardrails/{id}/assignments/members",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListMemberAssignmentsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGuardrailMemberAssignments.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGuardrailMemberAssignments.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGuardrailMemberAssignments.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGuardrailMemberAssignments.response.alternative3",
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
          pagination = PaginationDescriptor.OffsetLimit(requestOffsetParam = "offset", requestLimitParam = "limit", responseItemsPath = PropertyPath("data"), responseTotalPath = null),
          streaming = null,
        ) }

    internal val listGuardrailsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listGuardrails",
          method = "GET",
          path = "/guardrails",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListGuardrailsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGuardrails.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGuardrails.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listGuardrails.response.alternative2",
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
          pagination = PaginationDescriptor.OffsetLimit(requestOffsetParam = "offset", requestLimitParam = "limit", responseItemsPath = PropertyPath("data"), responseTotalPath = null),
          streaming = null,
        ) }

    internal val listKeyAssignmentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listKeyAssignments",
          method = "GET",
          path = "/guardrails/assignments/keys",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListKeyAssignmentsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listKeyAssignments.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listKeyAssignments.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listKeyAssignments.response.alternative2",
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
          pagination = PaginationDescriptor.OffsetLimit(requestOffsetParam = "offset", requestLimitParam = "limit", responseItemsPath = PropertyPath("data"), responseTotalPath = null),
          streaming = null,
        ) }

    internal val listMemberAssignmentsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listMemberAssignments",
          method = "GET",
          path = "/guardrails/assignments/members",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListMemberAssignmentsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listMemberAssignments.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listMemberAssignments.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listMemberAssignments.response.alternative2",
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
          pagination = PaginationDescriptor.OffsetLimit(requestOffsetParam = "offset", requestLimitParam = "limit", responseItemsPath = PropertyPath("data"), responseTotalPath = null),
          streaming = null,
        ) }

    internal val updateGuardrailMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "updateGuardrail",
          method = "PATCH",
          path = "/guardrails/{id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "UpdateGuardrailResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateGuardrail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateGuardrail.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateGuardrail.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateGuardrail.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateGuardrail.response.alternative4",
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
  }
}
