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
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.ListGuardrailsResponse
import com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse
import com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse
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
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public object GuardrailsCodecs {
  public const val BULKASSIGNKEYSTOGUARDRAIL_REQUEST_CODEC_ID: String =
      "bulkAssignKeysToGuardrail.request"

  private val bulkAssignKeysToGuardrailRequestCodec: MediaTypeCodec<BulkAssignKeysRequest> =
      KotlinxSerializationCodec(BULKASSIGNKEYSTOGUARDRAIL_REQUEST_CODEC_ID, BulkAssignKeysRequest.Serializer, SdkJson)

  public const val BULKASSIGNKEYSTOGUARDRAIL_RESPONSE_CODEC_ID: String =
      "bulkAssignKeysToGuardrail.response"

  private val bulkAssignKeysToGuardrailResponseCodec: MediaTypeCodec<BulkAssignKeysResponse> =
      KotlinxSerializationCodec(BULKASSIGNKEYSTOGUARDRAIL_RESPONSE_CODEC_ID, BulkAssignKeysResponse.Serializer, SdkJson)

  private val bulkAssignKeysToGuardrailResponseCodecAlternative0Codec:
      MediaTypeCodec<BulkAssignKeysResponse> =
      KotlinxSerializationCodec("bulkAssignKeysToGuardrail.response.alternative0", BulkAssignKeysResponse.Serializer,
        SdkJson)

  public val bulkAssignKeysToGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BulkAssignKeysResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodecAlternative0Codec)

  private val bulkAssignKeysToGuardrailResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("bulkAssignKeysToGuardrail.response.alternative1", BadRequestResponse.Serializer,
        SdkJson)

  public val bulkAssignKeysToGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodecAlternative1Codec)

  private val bulkAssignKeysToGuardrailResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("bulkAssignKeysToGuardrail.response.alternative2", UnauthorizedResponse.Serializer,
        SdkJson)

  public val bulkAssignKeysToGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodecAlternative2Codec)

  private val bulkAssignKeysToGuardrailResponseCodecAlternative3Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("bulkAssignKeysToGuardrail.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  public val bulkAssignKeysToGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodecAlternative3Codec)

  private val bulkAssignKeysToGuardrailResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("bulkAssignKeysToGuardrail.response.alternative4", InternalServerResponse.Serializer,
        SdkJson)

  public val bulkAssignKeysToGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodecAlternative4Codec)

  public val bulkAssignKeysToGuardrailRequestCodecRegistry:
      MediaTypeCodecRegistry<BulkAssignKeysRequest> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailRequestCodec)

  public val bulkAssignKeysToGuardrailResponseCodecRegistry:
      MediaTypeCodecRegistry<BulkAssignKeysResponse> =
      MediaTypeCodecRegistry.of(bulkAssignKeysToGuardrailResponseCodec)

  public const val BULKASSIGNMEMBERSTOGUARDRAIL_REQUEST_CODEC_ID: String =
      "bulkAssignMembersToGuardrail.request"

  private val bulkAssignMembersToGuardrailRequestCodec: MediaTypeCodec<BulkAssignMembersRequest> =
      KotlinxSerializationCodec(BULKASSIGNMEMBERSTOGUARDRAIL_REQUEST_CODEC_ID, BulkAssignMembersRequest.Serializer,
        SdkJson)

  public const val BULKASSIGNMEMBERSTOGUARDRAIL_RESPONSE_CODEC_ID: String =
      "bulkAssignMembersToGuardrail.response"

  private val bulkAssignMembersToGuardrailResponseCodec: MediaTypeCodec<BulkAssignMembersResponse> =
      KotlinxSerializationCodec(BULKASSIGNMEMBERSTOGUARDRAIL_RESPONSE_CODEC_ID, BulkAssignMembersResponse.Serializer,
        SdkJson)

  private val bulkAssignMembersToGuardrailResponseCodecAlternative0Codec:
      MediaTypeCodec<BulkAssignMembersResponse> =
      KotlinxSerializationCodec("bulkAssignMembersToGuardrail.response.alternative0", BulkAssignMembersResponse
        .Serializer, SdkJson)

  public val bulkAssignMembersToGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BulkAssignMembersResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodecAlternative0Codec)

  private val bulkAssignMembersToGuardrailResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("bulkAssignMembersToGuardrail.response.alternative1", BadRequestResponse.Serializer,
        SdkJson)

  public val bulkAssignMembersToGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodecAlternative1Codec)

  private val bulkAssignMembersToGuardrailResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("bulkAssignMembersToGuardrail.response.alternative2", UnauthorizedResponse.Serializer,
        SdkJson)

  public val bulkAssignMembersToGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodecAlternative2Codec)

  private val bulkAssignMembersToGuardrailResponseCodecAlternative3Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("bulkAssignMembersToGuardrail.response.alternative3", NotFoundResponse.Serializer,
        SdkJson)

  public val bulkAssignMembersToGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodecAlternative3Codec)

  private val bulkAssignMembersToGuardrailResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("bulkAssignMembersToGuardrail.response.alternative4", InternalServerResponse
        .Serializer, SdkJson)

  public val bulkAssignMembersToGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodecAlternative4Codec)

  public val bulkAssignMembersToGuardrailRequestCodecRegistry:
      MediaTypeCodecRegistry<BulkAssignMembersRequest> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailRequestCodec)

  public val bulkAssignMembersToGuardrailResponseCodecRegistry:
      MediaTypeCodecRegistry<BulkAssignMembersResponse> =
      MediaTypeCodecRegistry.of(bulkAssignMembersToGuardrailResponseCodec)

  public const val BULKUNASSIGNKEYSFROMGUARDRAIL_REQUEST_CODEC_ID: String =
      "bulkUnassignKeysFromGuardrail.request"

  private val bulkUnassignKeysFromGuardrailRequestCodec: MediaTypeCodec<BulkUnassignKeysRequest> =
      KotlinxSerializationCodec(BULKUNASSIGNKEYSFROMGUARDRAIL_REQUEST_CODEC_ID, BulkUnassignKeysRequest.Serializer,
        SdkJson)

  public const val BULKUNASSIGNKEYSFROMGUARDRAIL_RESPONSE_CODEC_ID: String =
      "bulkUnassignKeysFromGuardrail.response"

  private val bulkUnassignKeysFromGuardrailResponseCodec: MediaTypeCodec<BulkUnassignKeysResponse> =
      KotlinxSerializationCodec(BULKUNASSIGNKEYSFROMGUARDRAIL_RESPONSE_CODEC_ID, BulkUnassignKeysResponse.Serializer,
        SdkJson)

  private val bulkUnassignKeysFromGuardrailResponseCodecAlternative0Codec:
      MediaTypeCodec<BulkUnassignKeysResponse> =
      KotlinxSerializationCodec("bulkUnassignKeysFromGuardrail.response.alternative0", BulkUnassignKeysResponse
        .Serializer, SdkJson)

  public val bulkUnassignKeysFromGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BulkUnassignKeysResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodecAlternative0Codec)

  private val bulkUnassignKeysFromGuardrailResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("bulkUnassignKeysFromGuardrail.response.alternative1", BadRequestResponse.Serializer,
        SdkJson)

  public val bulkUnassignKeysFromGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodecAlternative1Codec)

  private val bulkUnassignKeysFromGuardrailResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("bulkUnassignKeysFromGuardrail.response.alternative2", UnauthorizedResponse.Serializer,
        SdkJson)

  public val bulkUnassignKeysFromGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodecAlternative2Codec)

  private val bulkUnassignKeysFromGuardrailResponseCodecAlternative3Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("bulkUnassignKeysFromGuardrail.response.alternative3", NotFoundResponse.Serializer,
        SdkJson)

  public val bulkUnassignKeysFromGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodecAlternative3Codec)

  private val bulkUnassignKeysFromGuardrailResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("bulkUnassignKeysFromGuardrail.response.alternative4", InternalServerResponse
        .Serializer, SdkJson)

  public val bulkUnassignKeysFromGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodecAlternative4Codec)

  public val bulkUnassignKeysFromGuardrailRequestCodecRegistry:
      MediaTypeCodecRegistry<BulkUnassignKeysRequest> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailRequestCodec)

  public val bulkUnassignKeysFromGuardrailResponseCodecRegistry:
      MediaTypeCodecRegistry<BulkUnassignKeysResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignKeysFromGuardrailResponseCodec)

  public const val BULKUNASSIGNMEMBERSFROMGUARDRAIL_REQUEST_CODEC_ID: String =
      "bulkUnassignMembersFromGuardrail.request"

  private val bulkUnassignMembersFromGuardrailRequestCodec:
      MediaTypeCodec<BulkUnassignMembersRequest> =
      KotlinxSerializationCodec(BULKUNASSIGNMEMBERSFROMGUARDRAIL_REQUEST_CODEC_ID, BulkUnassignMembersRequest
        .Serializer, SdkJson)

  public const val BULKUNASSIGNMEMBERSFROMGUARDRAIL_RESPONSE_CODEC_ID: String =
      "bulkUnassignMembersFromGuardrail.response"

  private val bulkUnassignMembersFromGuardrailResponseCodec:
      MediaTypeCodec<BulkUnassignMembersResponse> =
      KotlinxSerializationCodec(BULKUNASSIGNMEMBERSFROMGUARDRAIL_RESPONSE_CODEC_ID, BulkUnassignMembersResponse
        .Serializer, SdkJson)

  private val bulkUnassignMembersFromGuardrailResponseCodecAlternative0Codec:
      MediaTypeCodec<BulkUnassignMembersResponse> =
      KotlinxSerializationCodec("bulkUnassignMembersFromGuardrail.response.alternative0", BulkUnassignMembersResponse
        .Serializer, SdkJson)

  public val bulkUnassignMembersFromGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BulkUnassignMembersResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodecAlternative0Codec)

  private val bulkUnassignMembersFromGuardrailResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("bulkUnassignMembersFromGuardrail.response.alternative1", BadRequestResponse
        .Serializer, SdkJson)

  public val bulkUnassignMembersFromGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodecAlternative1Codec)

  private val bulkUnassignMembersFromGuardrailResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("bulkUnassignMembersFromGuardrail.response.alternative2", UnauthorizedResponse
        .Serializer, SdkJson)

  public val bulkUnassignMembersFromGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodecAlternative2Codec)

  private val bulkUnassignMembersFromGuardrailResponseCodecAlternative3Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("bulkUnassignMembersFromGuardrail.response.alternative3", NotFoundResponse.Serializer,
        SdkJson)

  public val bulkUnassignMembersFromGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodecAlternative3Codec)

  private val bulkUnassignMembersFromGuardrailResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("bulkUnassignMembersFromGuardrail.response.alternative4", InternalServerResponse
        .Serializer, SdkJson)

  public val bulkUnassignMembersFromGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodecAlternative4Codec)

  public val bulkUnassignMembersFromGuardrailRequestCodecRegistry:
      MediaTypeCodecRegistry<BulkUnassignMembersRequest> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailRequestCodec)

  public val bulkUnassignMembersFromGuardrailResponseCodecRegistry:
      MediaTypeCodecRegistry<BulkUnassignMembersResponse> =
      MediaTypeCodecRegistry.of(bulkUnassignMembersFromGuardrailResponseCodec)

  public const val CREATEGUARDRAIL_REQUEST_CODEC_ID: String = "createGuardrail.request"

  private val createGuardrailRequestCodec: MediaTypeCodec<CreateGuardrailRequest> =
      KotlinxSerializationCodec(CREATEGUARDRAIL_REQUEST_CODEC_ID, CreateGuardrailRequest.Serializer, SdkJson)

  public const val CREATEGUARDRAIL_RESPONSE_CODEC_ID: String = "createGuardrail.response"

  private val createGuardrailResponseCodec: MediaTypeCodec<CreateGuardrailResponse> =
      KotlinxSerializationCodec(CREATEGUARDRAIL_RESPONSE_CODEC_ID, CreateGuardrailResponse.Serializer, SdkJson)

  private val createGuardrailResponseCodecAlternative0Codec: MediaTypeCodec<CreateGuardrailResponse>
      =
      KotlinxSerializationCodec("createGuardrail.response.alternative0", CreateGuardrailResponse.Serializer, SdkJson)

  public val createGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreateGuardrailResponse> =
      MediaTypeCodecRegistry.of(createGuardrailResponseCodecAlternative0Codec)

  private val createGuardrailResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createGuardrail.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val createGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createGuardrailResponseCodecAlternative1Codec)

  private val createGuardrailResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createGuardrail.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val createGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createGuardrailResponseCodecAlternative2Codec)

  private val createGuardrailResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createGuardrail.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  public val createGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createGuardrailResponseCodecAlternative3Codec)

  private val createGuardrailResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("createGuardrail.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val createGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createGuardrailResponseCodecAlternative4Codec)

  public val createGuardrailRequestCodecRegistry: MediaTypeCodecRegistry<CreateGuardrailRequest> =
      MediaTypeCodecRegistry.of(createGuardrailRequestCodec)

  public val createGuardrailResponseCodecRegistry: MediaTypeCodecRegistry<CreateGuardrailResponse> =
      MediaTypeCodecRegistry.of(createGuardrailResponseCodec)

  public const val DELETEGUARDRAIL_RESPONSE_CODEC_ID: String = "deleteGuardrail.response"

  private val deleteGuardrailResponseCodec: MediaTypeCodec<DeleteGuardrailResponse> =
      KotlinxSerializationCodec(DELETEGUARDRAIL_RESPONSE_CODEC_ID, DeleteGuardrailResponse.Serializer, SdkJson)

  private val deleteGuardrailResponseCodecAlternative0Codec: MediaTypeCodec<DeleteGuardrailResponse>
      =
      KotlinxSerializationCodec("deleteGuardrail.response.alternative0", DeleteGuardrailResponse.Serializer, SdkJson)

  public val deleteGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeleteGuardrailResponse> =
      MediaTypeCodecRegistry.of(deleteGuardrailResponseCodecAlternative0Codec)

  private val deleteGuardrailResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteGuardrail.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val deleteGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteGuardrailResponseCodecAlternative1Codec)

  private val deleteGuardrailResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("deleteGuardrail.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  public val deleteGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(deleteGuardrailResponseCodecAlternative2Codec)

  private val deleteGuardrailResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("deleteGuardrail.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  public val deleteGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteGuardrailResponseCodecAlternative3Codec)

  public val deleteGuardrailRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val deleteGuardrailResponseCodecRegistry: MediaTypeCodecRegistry<DeleteGuardrailResponse> =
      MediaTypeCodecRegistry.of(deleteGuardrailResponseCodec)

  public const val GETGUARDRAIL_RESPONSE_CODEC_ID: String = "getGuardrail.response"

  private val getGuardrailResponseCodec: MediaTypeCodec<GetGuardrailResponse> =
      KotlinxSerializationCodec(GETGUARDRAIL_RESPONSE_CODEC_ID, GetGuardrailResponse.Serializer, SdkJson)

  private val getGuardrailResponseCodecAlternative0Codec: MediaTypeCodec<GetGuardrailResponse> =
      KotlinxSerializationCodec("getGuardrail.response.alternative0", GetGuardrailResponse.Serializer, SdkJson)

  public val getGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GetGuardrailResponse> =
      MediaTypeCodecRegistry.of(getGuardrailResponseCodecAlternative0Codec)

  private val getGuardrailResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getGuardrail.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val getGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getGuardrailResponseCodecAlternative1Codec)

  private val getGuardrailResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getGuardrail.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  public val getGuardrailResponseCodecAlternative2Registry: MediaTypeCodecRegistry<NotFoundResponse>
      = MediaTypeCodecRegistry.of(getGuardrailResponseCodecAlternative2Codec)

  private val getGuardrailResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getGuardrail.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  public val getGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getGuardrailResponseCodecAlternative3Codec)

  public val getGuardrailRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getGuardrailResponseCodecRegistry: MediaTypeCodecRegistry<GetGuardrailResponse> =
      MediaTypeCodecRegistry.of(getGuardrailResponseCodec)

  public const val LISTGUARDRAILKEYASSIGNMENTS_RESPONSE_CODEC_ID: String =
      "listGuardrailKeyAssignments.response"

  private val listGuardrailKeyAssignmentsResponseCodec: MediaTypeCodec<ListKeyAssignmentsResponse> =
      KotlinxSerializationCodec(LISTGUARDRAILKEYASSIGNMENTS_RESPONSE_CODEC_ID, ListKeyAssignmentsResponse.Serializer,
        SdkJson)

  private val listGuardrailKeyAssignmentsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListKeyAssignmentsResponse> =
      KotlinxSerializationCodec("listGuardrailKeyAssignments.response.alternative0", ListKeyAssignmentsResponse
        .Serializer, SdkJson)

  public val listGuardrailKeyAssignmentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListKeyAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailKeyAssignmentsResponseCodecAlternative0Codec)

  private val listGuardrailKeyAssignmentsResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listGuardrailKeyAssignments.response.alternative1", UnauthorizedResponse.Serializer,
        SdkJson)

  public val listGuardrailKeyAssignmentsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listGuardrailKeyAssignmentsResponseCodecAlternative1Codec)

  private val listGuardrailKeyAssignmentsResponseCodecAlternative2Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listGuardrailKeyAssignments.response.alternative2", NotFoundResponse.Serializer,
        SdkJson)

  public val listGuardrailKeyAssignmentsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listGuardrailKeyAssignmentsResponseCodecAlternative2Codec)

  private val listGuardrailKeyAssignmentsResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listGuardrailKeyAssignments.response.alternative3", InternalServerResponse.Serializer,
        SdkJson)

  public val listGuardrailKeyAssignmentsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listGuardrailKeyAssignmentsResponseCodecAlternative3Codec)

  public val listGuardrailKeyAssignmentsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listGuardrailKeyAssignmentsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListKeyAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailKeyAssignmentsResponseCodec)

  public const val LISTGUARDRAILMEMBERASSIGNMENTS_RESPONSE_CODEC_ID: String =
      "listGuardrailMemberAssignments.response"

  private val listGuardrailMemberAssignmentsResponseCodec:
      MediaTypeCodec<ListMemberAssignmentsResponse> =
      KotlinxSerializationCodec(LISTGUARDRAILMEMBERASSIGNMENTS_RESPONSE_CODEC_ID, ListMemberAssignmentsResponse
        .Serializer, SdkJson)

  private val listGuardrailMemberAssignmentsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListMemberAssignmentsResponse> =
      KotlinxSerializationCodec("listGuardrailMemberAssignments.response.alternative0", ListMemberAssignmentsResponse
        .Serializer, SdkJson)

  public val listGuardrailMemberAssignmentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListMemberAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailMemberAssignmentsResponseCodecAlternative0Codec)

  private val listGuardrailMemberAssignmentsResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listGuardrailMemberAssignments.response.alternative1", UnauthorizedResponse
        .Serializer, SdkJson)

  public val listGuardrailMemberAssignmentsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listGuardrailMemberAssignmentsResponseCodecAlternative1Codec)

  private val listGuardrailMemberAssignmentsResponseCodecAlternative2Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listGuardrailMemberAssignments.response.alternative2", NotFoundResponse.Serializer,
        SdkJson)

  public val listGuardrailMemberAssignmentsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listGuardrailMemberAssignmentsResponseCodecAlternative2Codec)

  private val listGuardrailMemberAssignmentsResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listGuardrailMemberAssignments.response.alternative3", InternalServerResponse
        .Serializer, SdkJson)

  public val listGuardrailMemberAssignmentsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listGuardrailMemberAssignmentsResponseCodecAlternative3Codec)

  public val listGuardrailMemberAssignmentsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listGuardrailMemberAssignmentsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListMemberAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailMemberAssignmentsResponseCodec)

  public const val LISTGUARDRAILS_RESPONSE_CODEC_ID: String = "listGuardrails.response"

  private val listGuardrailsResponseCodec: MediaTypeCodec<ListGuardrailsResponse> =
      KotlinxSerializationCodec(LISTGUARDRAILS_RESPONSE_CODEC_ID, ListGuardrailsResponse.Serializer, SdkJson)

  private val listGuardrailsResponseCodecAlternative0Codec: MediaTypeCodec<ListGuardrailsResponse> =
      KotlinxSerializationCodec("listGuardrails.response.alternative0", ListGuardrailsResponse.Serializer, SdkJson)

  public val listGuardrailsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListGuardrailsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailsResponseCodecAlternative0Codec)

  private val listGuardrailsResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listGuardrails.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val listGuardrailsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listGuardrailsResponseCodecAlternative1Codec)

  private val listGuardrailsResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listGuardrails.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  public val listGuardrailsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listGuardrailsResponseCodecAlternative2Codec)

  public val listGuardrailsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listGuardrailsResponseCodecRegistry: MediaTypeCodecRegistry<ListGuardrailsResponse> =
      MediaTypeCodecRegistry.of(listGuardrailsResponseCodec)

  public const val LISTKEYASSIGNMENTS_RESPONSE_CODEC_ID: String = "listKeyAssignments.response"

  private val listKeyAssignmentsResponseCodec: MediaTypeCodec<ListKeyAssignmentsResponse> =
      KotlinxSerializationCodec(LISTKEYASSIGNMENTS_RESPONSE_CODEC_ID, ListKeyAssignmentsResponse.Serializer, SdkJson)

  private val listKeyAssignmentsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListKeyAssignmentsResponse> =
      KotlinxSerializationCodec("listKeyAssignments.response.alternative0", ListKeyAssignmentsResponse.Serializer,
        SdkJson)

  public val listKeyAssignmentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListKeyAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listKeyAssignmentsResponseCodecAlternative0Codec)

  private val listKeyAssignmentsResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse>
      =
      KotlinxSerializationCodec("listKeyAssignments.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val listKeyAssignmentsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listKeyAssignmentsResponseCodecAlternative1Codec)

  private val listKeyAssignmentsResponseCodecAlternative2Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listKeyAssignments.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  public val listKeyAssignmentsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listKeyAssignmentsResponseCodecAlternative2Codec)

  public val listKeyAssignmentsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listKeyAssignmentsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListKeyAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listKeyAssignmentsResponseCodec)

  public const val LISTMEMBERASSIGNMENTS_RESPONSE_CODEC_ID: String =
      "listMemberAssignments.response"

  private val listMemberAssignmentsResponseCodec: MediaTypeCodec<ListMemberAssignmentsResponse> =
      KotlinxSerializationCodec(LISTMEMBERASSIGNMENTS_RESPONSE_CODEC_ID, ListMemberAssignmentsResponse.Serializer,
        SdkJson)

  private val listMemberAssignmentsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListMemberAssignmentsResponse> =
      KotlinxSerializationCodec("listMemberAssignments.response.alternative0", ListMemberAssignmentsResponse
        .Serializer, SdkJson)

  public val listMemberAssignmentsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListMemberAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listMemberAssignmentsResponseCodecAlternative0Codec)

  private val listMemberAssignmentsResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listMemberAssignments.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val listMemberAssignmentsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listMemberAssignmentsResponseCodecAlternative1Codec)

  private val listMemberAssignmentsResponseCodecAlternative2Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listMemberAssignments.response.alternative2", InternalServerResponse.Serializer,
        SdkJson)

  public val listMemberAssignmentsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listMemberAssignmentsResponseCodecAlternative2Codec)

  public val listMemberAssignmentsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listMemberAssignmentsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListMemberAssignmentsResponse> =
      MediaTypeCodecRegistry.of(listMemberAssignmentsResponseCodec)

  public const val UPDATEGUARDRAIL_REQUEST_CODEC_ID: String = "updateGuardrail.request"

  private val updateGuardrailRequestCodec: MediaTypeCodec<UpdateGuardrailRequest> =
      KotlinxSerializationCodec(UPDATEGUARDRAIL_REQUEST_CODEC_ID, UpdateGuardrailRequest.Serializer, SdkJson)

  public const val UPDATEGUARDRAIL_RESPONSE_CODEC_ID: String = "updateGuardrail.response"

  private val updateGuardrailResponseCodec: MediaTypeCodec<UpdateGuardrailResponse> =
      KotlinxSerializationCodec(UPDATEGUARDRAIL_RESPONSE_CODEC_ID, UpdateGuardrailResponse.Serializer, SdkJson)

  private val updateGuardrailResponseCodecAlternative0Codec: MediaTypeCodec<UpdateGuardrailResponse>
      =
      KotlinxSerializationCodec("updateGuardrail.response.alternative0", UpdateGuardrailResponse.Serializer, SdkJson)

  public val updateGuardrailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<UpdateGuardrailResponse> =
      MediaTypeCodecRegistry.of(updateGuardrailResponseCodecAlternative0Codec)

  private val updateGuardrailResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("updateGuardrail.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val updateGuardrailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(updateGuardrailResponseCodecAlternative1Codec)

  private val updateGuardrailResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("updateGuardrail.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val updateGuardrailResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(updateGuardrailResponseCodecAlternative2Codec)

  private val updateGuardrailResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("updateGuardrail.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  public val updateGuardrailResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(updateGuardrailResponseCodecAlternative3Codec)

  private val updateGuardrailResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("updateGuardrail.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val updateGuardrailResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(updateGuardrailResponseCodecAlternative4Codec)

  public val updateGuardrailRequestCodecRegistry: MediaTypeCodecRegistry<UpdateGuardrailRequest> =
      MediaTypeCodecRegistry.of(updateGuardrailRequestCodec)

  public val updateGuardrailResponseCodecRegistry: MediaTypeCodecRegistry<UpdateGuardrailResponse> =
      MediaTypeCodecRegistry.of(updateGuardrailResponseCodec)
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
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
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
  ): BulkAssignKeysResponse = executor.execute<BulkAssignKeysRequest,
    BulkAssignKeysResponse>(SdkExecutionRequest(bulkAssignKeysToGuardrailMetadata, baseUri, request,
      listOf(GuardrailsCodecs.BULKASSIGNKEYSTOGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.BULKASSIGNKEYSTOGUARDRAIL_RESPONSE_CODEC_ID), GuardrailsCodecs
    .bulkAssignKeysToGuardrailRequestCodecRegistry, GuardrailsCodecs.bulkAssignKeysToGuardrailResponseCodecRegistry,
      options)

  /**
   * Assign multiple API keys to a specific guardrail. A key may hold at most one guardrail; assigning replaces any
   * existing assignment. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun bulkAssignKeysToGuardrailWithResponse(
    request: BulkAssignKeysRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BulkAssignKeysToGuardrailResponse> = executor.executeWithResponse<BulkAssignKeysRequest,
    BulkAssignKeysToGuardrailResponse>(SdkExecutionRequest(bulkAssignKeysToGuardrailMetadata, baseUri, request,
      listOf(GuardrailsCodecs.BULKASSIGNKEYSTOGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.bulkAssignKeysToGuardrailRequestCodecRegistry, BulkAssignKeysToGuardrailResponseDecoder, options)

  /**
   * Assign multiple organization members to a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
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
  ): BulkAssignMembersResponse = executor.execute<BulkAssignMembersRequest,
    BulkAssignMembersResponse>(SdkExecutionRequest(bulkAssignMembersToGuardrailMetadata, baseUri, request,
      listOf(GuardrailsCodecs.BULKASSIGNMEMBERSTOGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.BULKASSIGNMEMBERSTOGUARDRAIL_RESPONSE_CODEC_ID), GuardrailsCodecs
    .bulkAssignMembersToGuardrailRequestCodecRegistry, GuardrailsCodecs
      .bulkAssignMembersToGuardrailResponseCodecRegistry, options)

  /**
   * Assign multiple organization members to a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun bulkAssignMembersToGuardrailWithResponse(
    request: BulkAssignMembersRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BulkAssignMembersToGuardrailResponse> = executor.executeWithResponse<BulkAssignMembersRequest,
    BulkAssignMembersToGuardrailResponse>(SdkExecutionRequest(bulkAssignMembersToGuardrailMetadata, baseUri, request,
      listOf(GuardrailsCodecs.BULKASSIGNMEMBERSTOGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.bulkAssignMembersToGuardrailRequestCodecRegistry, BulkAssignMembersToGuardrailResponseDecoder,
    options)

  /**
   * Unassign multiple API keys from a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
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
  ): BulkUnassignKeysResponse = executor.execute<BulkUnassignKeysRequest,
    BulkUnassignKeysResponse>(SdkExecutionRequest(bulkUnassignKeysFromGuardrailMetadata, baseUri, request,
      listOf(GuardrailsCodecs.BULKUNASSIGNKEYSFROMGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.BULKUNASSIGNKEYSFROMGUARDRAIL_RESPONSE_CODEC_ID), GuardrailsCodecs
    .bulkUnassignKeysFromGuardrailRequestCodecRegistry, GuardrailsCodecs
      .bulkUnassignKeysFromGuardrailResponseCodecRegistry, options)

  /**
   * Unassign multiple API keys from a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun bulkUnassignKeysFromGuardrailWithResponse(
    request: BulkUnassignKeysRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BulkUnassignKeysFromGuardrailResponse> = executor.executeWithResponse<BulkUnassignKeysRequest,
    BulkUnassignKeysFromGuardrailResponse>(SdkExecutionRequest(bulkUnassignKeysFromGuardrailMetadata, baseUri, request,
      listOf(GuardrailsCodecs.BULKUNASSIGNKEYSFROMGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.bulkUnassignKeysFromGuardrailRequestCodecRegistry, BulkUnassignKeysFromGuardrailResponseDecoder,
    options)

  /**
   * Unassign multiple organization members from a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
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
  ): BulkUnassignMembersResponse = executor.execute<BulkUnassignMembersRequest,
    BulkUnassignMembersResponse>(SdkExecutionRequest(bulkUnassignMembersFromGuardrailMetadata, baseUri, request,
      listOf(GuardrailsCodecs.BULKUNASSIGNMEMBERSFROMGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.BULKUNASSIGNMEMBERSFROMGUARDRAIL_RESPONSE_CODEC_ID), GuardrailsCodecs
    .bulkUnassignMembersFromGuardrailRequestCodecRegistry, GuardrailsCodecs
      .bulkUnassignMembersFromGuardrailResponseCodecRegistry, options)

  /**
   * Unassign multiple organization members from a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun bulkUnassignMembersFromGuardrailWithResponse(
    request: BulkUnassignMembersRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BulkUnassignMembersFromGuardrailResponse> = executor
    .executeWithResponse<BulkUnassignMembersRequest,
      BulkUnassignMembersFromGuardrailResponse>(SdkExecutionRequest(bulkUnassignMembersFromGuardrailMetadata, baseUri,
        request, listOf(GuardrailsCodecs.BULKUNASSIGNMEMBERSFROMGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.bulkUnassignMembersFromGuardrailRequestCodecRegistry,
    BulkUnassignMembersFromGuardrailResponseDecoder, options)

  /**
   * Create a new guardrail for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createGuardrail(
    request: CreateGuardrailRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.CreateGuardrailResponse = executor.execute<CreateGuardrailRequest, com.nabobery
    .sdkgen.generated.CreateGuardrailResponse>(SdkExecutionRequest(createGuardrailMetadata, baseUri, request,
      listOf(GuardrailsCodecs.CREATEGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.CREATEGUARDRAIL_RESPONSE_CODEC_ID), GuardrailsCodecs.createGuardrailRequestCodecRegistry,
    GuardrailsCodecs.createGuardrailResponseCodecRegistry, options)

  /**
   * Create a new guardrail for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createGuardrailWithResponse(
    request: CreateGuardrailRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateGuardrailResponse> = executor.executeWithResponse<CreateGuardrailRequest,
    CreateGuardrailResponse>(SdkExecutionRequest(createGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs
      .CREATEGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.createGuardrailRequestCodecRegistry, CreateGuardrailResponseDecoder, options)

  /**
   * Delete an existing guardrail. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun deleteGuardrail(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.DeleteGuardrailResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .DeleteGuardrailResponse>(SdkExecutionRequest(deleteGuardrailMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.DELETEGUARDRAIL_RESPONSE_CODEC_ID), GuardrailsCodecs.deleteGuardrailRequestCodecRegistry,
    GuardrailsCodecs.deleteGuardrailResponseCodecRegistry, options)

  /**
   * Delete an existing guardrail. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun deleteGuardrailWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteGuardrailResponse> = executor.executeWithResponse<Unit,
    DeleteGuardrailResponse>(SdkExecutionRequest(deleteGuardrailMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.deleteGuardrailRequestCodecRegistry, DeleteGuardrailResponseDecoder, options)

  /**
   * Get a single guardrail by ID. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getGuardrail(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.GetGuardrailResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .GetGuardrailResponse>(SdkExecutionRequest(getGuardrailMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.GETGUARDRAIL_RESPONSE_CODEC_ID), GuardrailsCodecs.getGuardrailRequestCodecRegistry,
    GuardrailsCodecs.getGuardrailResponseCodecRegistry, options)

  /**
   * Get a single guardrail by ID. [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getGuardrailWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetGuardrailResponse> = executor.executeWithResponse<Unit,
    GetGuardrailResponse>(SdkExecutionRequest(getGuardrailMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.getGuardrailRequestCodecRegistry, GetGuardrailResponseDecoder, options)

  /**
   * List all API key assignments for a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listGuardrailKeyAssignments(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .ListKeyAssignmentsResponse>(SdkExecutionRequest(listGuardrailKeyAssignmentsMetadata, baseUri, Unit, emptyList(),
      buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.LISTGUARDRAILKEYASSIGNMENTS_RESPONSE_CODEC_ID), GuardrailsCodecs
    .listGuardrailKeyAssignmentsRequestCodecRegistry, GuardrailsCodecs
      .listGuardrailKeyAssignmentsResponseCodecRegistry, options)

  /**
   * List all API key assignments for a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listGuardrailKeyAssignmentsWithResponse(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListGuardrailKeyAssignmentsResponse> = executor.executeWithResponse<Unit,
    ListGuardrailKeyAssignmentsResponse>(SdkExecutionRequest(listGuardrailKeyAssignmentsMetadata, baseUri, Unit,
      emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.listGuardrailKeyAssignmentsRequestCodecRegistry, ListGuardrailKeyAssignmentsResponseDecoder,
    options)

  /**
   * List all organization member assignments for a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listGuardrailMemberAssignments(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .ListMemberAssignmentsResponse>(SdkExecutionRequest(listGuardrailMemberAssignmentsMetadata, baseUri, Unit,
      emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.LISTGUARDRAILMEMBERASSIGNMENTS_RESPONSE_CODEC_ID), GuardrailsCodecs
    .listGuardrailMemberAssignmentsRequestCodecRegistry, GuardrailsCodecs
      .listGuardrailMemberAssignmentsResponseCodecRegistry, options)

  /**
   * List all organization member assignments for a specific guardrail. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listGuardrailMemberAssignmentsWithResponse(
    id: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListGuardrailMemberAssignmentsResponse> = executor.executeWithResponse<Unit,
    ListGuardrailMemberAssignmentsResponse>(SdkExecutionRequest(listGuardrailMemberAssignmentsMetadata, baseUri, Unit,
      emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.listGuardrailMemberAssignmentsRequestCodecRegistry,
    ListGuardrailMemberAssignmentsResponseDecoder, options)

  /**
   * List all guardrails for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listGuardrails(
    limit: Int? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListGuardrailsResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .ListGuardrailsResponse>(SdkExecutionRequest(listGuardrailsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.LISTGUARDRAILS_RESPONSE_CODEC_ID), GuardrailsCodecs.listGuardrailsRequestCodecRegistry,
    GuardrailsCodecs.listGuardrailsResponseCodecRegistry, options)

  /**
   * List all guardrails for the authenticated user. [Management key](/docs/guides/overview/auth/management-api-keys)
   * required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listGuardrailsWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListGuardrailsResponse> = executor.executeWithResponse<Unit,
    ListGuardrailsResponse>(SdkExecutionRequest(listGuardrailsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.listGuardrailsRequestCodecRegistry, ListGuardrailsResponseDecoder, options)

  /**
   * List all API key guardrail assignments for the authenticated user. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listKeyAssignments(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListKeyAssignmentsResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .ListKeyAssignmentsResponse>(SdkExecutionRequest(listKeyAssignmentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.LISTKEYASSIGNMENTS_RESPONSE_CODEC_ID), GuardrailsCodecs
    .listKeyAssignmentsRequestCodecRegistry, GuardrailsCodecs.listKeyAssignmentsResponseCodecRegistry, options)

  /**
   * List all API key guardrail assignments for the authenticated user. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listKeyAssignmentsWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListKeyAssignmentsResponse> = executor.executeWithResponse<Unit,
    ListKeyAssignmentsResponse>(SdkExecutionRequest(listKeyAssignmentsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.listKeyAssignmentsRequestCodecRegistry, ListKeyAssignmentsResponseDecoder, options)

  /**
   * List all organization member guardrail assignments for the authenticated user. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listMemberAssignments(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListMemberAssignmentsResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .ListMemberAssignmentsResponse>(SdkExecutionRequest(listMemberAssignmentsMetadata, baseUri, Unit, emptyList(),
      buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.LISTMEMBERASSIGNMENTS_RESPONSE_CODEC_ID), GuardrailsCodecs
    .listMemberAssignmentsRequestCodecRegistry, GuardrailsCodecs.listMemberAssignmentsResponseCodecRegistry, options)

  /**
   * List all organization member guardrail assignments for the authenticated user. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listMemberAssignmentsWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListMemberAssignmentsResponse> = executor.executeWithResponse<Unit,
    ListMemberAssignmentsResponse>(SdkExecutionRequest(listMemberAssignmentsMetadata, baseUri, Unit, emptyList(),
      buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.listMemberAssignmentsRequestCodecRegistry, ListMemberAssignmentsResponseDecoder, options)

  /**
   * Update an existing guardrail. Collection fields use replace semantics: send the full desired set on every update.
   * [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
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
  ): com.nabobery.sdkgen.generated.UpdateGuardrailResponse = executor.execute<UpdateGuardrailRequest, com.nabobery
    .sdkgen.generated.UpdateGuardrailResponse>(SdkExecutionRequest(updateGuardrailMetadata, baseUri, request,
      listOf(GuardrailsCodecs.UPDATEGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(GuardrailsCodecs.UPDATEGUARDRAIL_RESPONSE_CODEC_ID), GuardrailsCodecs.updateGuardrailRequestCodecRegistry,
    GuardrailsCodecs.updateGuardrailResponseCodecRegistry, options)

  /**
   * Update an existing guardrail. Collection fields use replace semantics: send the full desired set on every update.
   * [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun updateGuardrailWithResponse(
    request: UpdateGuardrailRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UpdateGuardrailResponse> = executor.executeWithResponse<UpdateGuardrailRequest,
    UpdateGuardrailResponse>(SdkExecutionRequest(updateGuardrailMetadata, baseUri, request, listOf(GuardrailsCodecs
      .UPDATEGUARDRAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), GuardrailsCodecs.updateGuardrailRequestCodecRegistry, UpdateGuardrailResponseDecoder, options)

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
    ) : BulkAssignKeysToGuardrailResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignKeysToGuardrailResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignKeysToGuardrailResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignKeysToGuardrailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignKeysToGuardrailResponse
  }

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
          json = GuardrailsCodecs.bulkAssignKeysToGuardrailResponseCodecAlternative0Registry
            .select(listOf("bulkAssignKeysToGuardrail.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignKeysToGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = BulkAssignKeysToGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.bulkAssignKeysToGuardrailResponseCodecAlternative1Registry
            .select(listOf("bulkAssignKeysToGuardrail.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignKeysToGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = BulkAssignKeysToGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.bulkAssignKeysToGuardrailResponseCodecAlternative2Registry
            .select(listOf("bulkAssignKeysToGuardrail.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignKeysToGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = BulkAssignKeysToGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.bulkAssignKeysToGuardrailResponseCodecAlternative3Registry
            .select(listOf("bulkAssignKeysToGuardrail.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignKeysToGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = BulkAssignKeysToGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.bulkAssignKeysToGuardrailResponseCodecAlternative4Registry
            .select(listOf("bulkAssignKeysToGuardrail.response.alternative4"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): BulkAssignKeysToGuardrailResponse = BulkAssignKeysToGuardrailResponse.Unknown(statusCode = statusCode, headers =
      headers)
  }

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
    ) : BulkAssignMembersToGuardrailResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignMembersToGuardrailResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignMembersToGuardrailResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignMembersToGuardrailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkAssignMembersToGuardrailResponse
  }

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
          json = GuardrailsCodecs.bulkAssignMembersToGuardrailResponseCodecAlternative0Registry
            .select(listOf("bulkAssignMembersToGuardrail.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignMembersToGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = BulkAssignMembersToGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.bulkAssignMembersToGuardrailResponseCodecAlternative1Registry
            .select(listOf("bulkAssignMembersToGuardrail.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignMembersToGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = BulkAssignMembersToGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.bulkAssignMembersToGuardrailResponseCodecAlternative2Registry
            .select(listOf("bulkAssignMembersToGuardrail.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignMembersToGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = BulkAssignMembersToGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.bulkAssignMembersToGuardrailResponseCodecAlternative3Registry
            .select(listOf("bulkAssignMembersToGuardrail.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkAssignMembersToGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = BulkAssignMembersToGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.bulkAssignMembersToGuardrailResponseCodecAlternative4Registry
            .select(listOf("bulkAssignMembersToGuardrail.response.alternative4"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): BulkAssignMembersToGuardrailResponse = BulkAssignMembersToGuardrailResponse.Unknown(statusCode = statusCode,
      headers = headers)
  }

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
    ) : BulkUnassignKeysFromGuardrailResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignKeysFromGuardrailResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignKeysFromGuardrailResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignKeysFromGuardrailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignKeysFromGuardrailResponse
  }

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
          json = GuardrailsCodecs.bulkUnassignKeysFromGuardrailResponseCodecAlternative0Registry
            .select(listOf("bulkUnassignKeysFromGuardrail.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignKeysFromGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = BulkUnassignKeysFromGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.bulkUnassignKeysFromGuardrailResponseCodecAlternative1Registry
            .select(listOf("bulkUnassignKeysFromGuardrail.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignKeysFromGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = BulkUnassignKeysFromGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.bulkUnassignKeysFromGuardrailResponseCodecAlternative2Registry
            .select(listOf("bulkUnassignKeysFromGuardrail.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignKeysFromGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = BulkUnassignKeysFromGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.bulkUnassignKeysFromGuardrailResponseCodecAlternative3Registry
            .select(listOf("bulkUnassignKeysFromGuardrail.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignKeysFromGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = BulkUnassignKeysFromGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.bulkUnassignKeysFromGuardrailResponseCodecAlternative4Registry
            .select(listOf("bulkUnassignKeysFromGuardrail.response.alternative4"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): BulkUnassignKeysFromGuardrailResponse = BulkUnassignKeysFromGuardrailResponse.Unknown(statusCode = statusCode,
      headers = headers)
  }

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
    ) : BulkUnassignMembersFromGuardrailResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignMembersFromGuardrailResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignMembersFromGuardrailResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignMembersFromGuardrailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BulkUnassignMembersFromGuardrailResponse
  }

  private object BulkUnassignMembersFromGuardrailResponseDecoder : SdkResponseAlternativeDecoder<BulkUnassignMembersFromGuardrailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BulkUnassignMembersFromGuardrailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType)
      .value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BulkUnassignMembersFromGuardrailResponse> = when {
      alternative.id == "bulkUnassignMembersFromGuardrail.response.alternative0" -> SdkResponseDecodeResult(
        value = BulkUnassignMembersFromGuardrailResponse.SuccessJson(
          json = GuardrailsCodecs.bulkUnassignMembersFromGuardrailResponseCodecAlternative0Registry
            .select(listOf("bulkUnassignMembersFromGuardrail.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignMembersFromGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = BulkUnassignMembersFromGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.bulkUnassignMembersFromGuardrailResponseCodecAlternative1Registry
            .select(listOf("bulkUnassignMembersFromGuardrail.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignMembersFromGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = BulkUnassignMembersFromGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.bulkUnassignMembersFromGuardrailResponseCodecAlternative2Registry
            .select(listOf("bulkUnassignMembersFromGuardrail.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignMembersFromGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = BulkUnassignMembersFromGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.bulkUnassignMembersFromGuardrailResponseCodecAlternative3Registry
            .select(listOf("bulkUnassignMembersFromGuardrail.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "bulkUnassignMembersFromGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = BulkUnassignMembersFromGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.bulkUnassignMembersFromGuardrailResponseCodecAlternative4Registry
            .select(listOf("bulkUnassignMembersFromGuardrail.response.alternative4"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): BulkUnassignMembersFromGuardrailResponse = BulkUnassignMembersFromGuardrailResponse.Unknown(statusCode =
      statusCode, headers = headers)
  }

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
    ) : CreateGuardrailResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateGuardrailResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateGuardrailResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateGuardrailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateGuardrailResponse
  }

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
          json = GuardrailsCodecs.createGuardrailResponseCodecAlternative0Registry
            .select(listOf("createGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.createGuardrailResponseCodecAlternative1Registry
            .select(listOf("createGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.createGuardrailResponseCodecAlternative2Registry
            .select(listOf("createGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateGuardrailResponse.Http403Json(
          json = GuardrailsCodecs.createGuardrailResponseCodecAlternative3Registry
            .select(listOf("createGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.createGuardrailResponseCodecAlternative4Registry
            .select(listOf("createGuardrail.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    ) : DeleteGuardrailResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteGuardrailResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteGuardrailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteGuardrailResponse
  }

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
          json = GuardrailsCodecs.deleteGuardrailResponseCodecAlternative0Registry
            .select(listOf("deleteGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.deleteGuardrailResponseCodecAlternative1Registry
            .select(listOf("deleteGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.deleteGuardrailResponseCodecAlternative2Registry
            .select(listOf("deleteGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.deleteGuardrailResponseCodecAlternative3Registry
            .select(listOf("deleteGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    ) : GetGuardrailResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGuardrailResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGuardrailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetGuardrailResponse
  }

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
          json = GuardrailsCodecs.getGuardrailResponseCodecAlternative0Registry
            .select(listOf("getGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = GetGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.getGuardrailResponseCodecAlternative1Registry
            .select(listOf("getGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = GetGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.getGuardrailResponseCodecAlternative2Registry
            .select(listOf("getGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = GetGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.getGuardrailResponseCodecAlternative3Registry
            .select(listOf("getGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    ) : ListGuardrailKeyAssignmentsResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailKeyAssignmentsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailKeyAssignmentsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailKeyAssignmentsResponse
  }

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
          json = GuardrailsCodecs.listGuardrailKeyAssignmentsResponseCodecAlternative0Registry
            .select(listOf("listGuardrailKeyAssignments.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailKeyAssignments.response.alternative1" -> SdkResponseDecodeResult(
        value = ListGuardrailKeyAssignmentsResponse.Http401Json(
          json = GuardrailsCodecs.listGuardrailKeyAssignmentsResponseCodecAlternative1Registry
            .select(listOf("listGuardrailKeyAssignments.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailKeyAssignments.response.alternative2" -> SdkResponseDecodeResult(
        value = ListGuardrailKeyAssignmentsResponse.Http404Json(
          json = GuardrailsCodecs.listGuardrailKeyAssignmentsResponseCodecAlternative2Registry
            .select(listOf("listGuardrailKeyAssignments.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailKeyAssignments.response.alternative3" -> SdkResponseDecodeResult(
        value = ListGuardrailKeyAssignmentsResponse.Http500Json(
          json = GuardrailsCodecs.listGuardrailKeyAssignmentsResponseCodecAlternative3Registry
            .select(listOf("listGuardrailKeyAssignments.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): ListGuardrailKeyAssignmentsResponse = ListGuardrailKeyAssignmentsResponse.Unknown(statusCode = statusCode,
      headers = headers)
  }

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
    ) : ListGuardrailMemberAssignmentsResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailMemberAssignmentsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailMemberAssignmentsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailMemberAssignmentsResponse
  }

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
          json = GuardrailsCodecs.listGuardrailMemberAssignmentsResponseCodecAlternative0Registry
            .select(listOf("listGuardrailMemberAssignments.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailMemberAssignments.response.alternative1" -> SdkResponseDecodeResult(
        value = ListGuardrailMemberAssignmentsResponse.Http401Json(
          json = GuardrailsCodecs.listGuardrailMemberAssignmentsResponseCodecAlternative1Registry
            .select(listOf("listGuardrailMemberAssignments.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailMemberAssignments.response.alternative2" -> SdkResponseDecodeResult(
        value = ListGuardrailMemberAssignmentsResponse.Http404Json(
          json = GuardrailsCodecs.listGuardrailMemberAssignmentsResponseCodecAlternative2Registry
            .select(listOf("listGuardrailMemberAssignments.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrailMemberAssignments.response.alternative3" -> SdkResponseDecodeResult(
        value = ListGuardrailMemberAssignmentsResponse.Http500Json(
          json = GuardrailsCodecs.listGuardrailMemberAssignmentsResponseCodecAlternative3Registry
            .select(listOf("listGuardrailMemberAssignments.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): ListGuardrailMemberAssignmentsResponse = ListGuardrailMemberAssignmentsResponse.Unknown(statusCode = statusCode,
      headers = headers)
  }

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
    ) : ListGuardrailsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListGuardrailsResponse
  }

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
          json = GuardrailsCodecs.listGuardrailsResponseCodecAlternative0Registry
            .select(listOf("listGuardrails.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrails.response.alternative1" -> SdkResponseDecodeResult(
        value = ListGuardrailsResponse.Http401Json(
          json = GuardrailsCodecs.listGuardrailsResponseCodecAlternative1Registry
            .select(listOf("listGuardrails.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listGuardrails.response.alternative2" -> SdkResponseDecodeResult(
        value = ListGuardrailsResponse.Http500Json(
          json = GuardrailsCodecs.listGuardrailsResponseCodecAlternative2Registry
            .select(listOf("listGuardrails.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    ) : ListKeyAssignmentsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListKeyAssignmentsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListKeyAssignmentsResponse
  }

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
          json = GuardrailsCodecs.listKeyAssignmentsResponseCodecAlternative0Registry
            .select(listOf("listKeyAssignments.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listKeyAssignments.response.alternative1" -> SdkResponseDecodeResult(
        value = ListKeyAssignmentsResponse.Http401Json(
          json = GuardrailsCodecs.listKeyAssignmentsResponseCodecAlternative1Registry
            .select(listOf("listKeyAssignments.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listKeyAssignments.response.alternative2" -> SdkResponseDecodeResult(
        value = ListKeyAssignmentsResponse.Http500Json(
          json = GuardrailsCodecs.listKeyAssignmentsResponseCodecAlternative2Registry
            .select(listOf("listKeyAssignments.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    ) : ListMemberAssignmentsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListMemberAssignmentsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListMemberAssignmentsResponse
  }

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
          json = GuardrailsCodecs.listMemberAssignmentsResponseCodecAlternative0Registry
            .select(listOf("listMemberAssignments.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listMemberAssignments.response.alternative1" -> SdkResponseDecodeResult(
        value = ListMemberAssignmentsResponse.Http401Json(
          json = GuardrailsCodecs.listMemberAssignmentsResponseCodecAlternative1Registry
            .select(listOf("listMemberAssignments.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listMemberAssignments.response.alternative2" -> SdkResponseDecodeResult(
        value = ListMemberAssignmentsResponse.Http500Json(
          json = GuardrailsCodecs.listMemberAssignmentsResponseCodecAlternative2Registry
            .select(listOf("listMemberAssignments.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ) : UpdateGuardrailResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateGuardrailResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateGuardrailResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateGuardrailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateGuardrailResponse
  }

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
          json = GuardrailsCodecs.updateGuardrailResponseCodecAlternative0Registry
            .select(listOf("updateGuardrail.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateGuardrail.response.alternative1" -> SdkResponseDecodeResult(
        value = UpdateGuardrailResponse.Http400Json(
          json = GuardrailsCodecs.updateGuardrailResponseCodecAlternative1Registry
            .select(listOf("updateGuardrail.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateGuardrail.response.alternative2" -> SdkResponseDecodeResult(
        value = UpdateGuardrailResponse.Http401Json(
          json = GuardrailsCodecs.updateGuardrailResponseCodecAlternative2Registry
            .select(listOf("updateGuardrail.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateGuardrail.response.alternative3" -> SdkResponseDecodeResult(
        value = UpdateGuardrailResponse.Http404Json(
          json = GuardrailsCodecs.updateGuardrailResponseCodecAlternative3Registry
            .select(listOf("updateGuardrail.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateGuardrail.response.alternative4" -> SdkResponseDecodeResult(
        value = UpdateGuardrailResponse.Http500Json(
          json = GuardrailsCodecs.updateGuardrailResponseCodecAlternative4Registry
            .select(listOf("updateGuardrail.response.alternative4"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    public val bulkAssignKeysToGuardrailMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val bulkAssignMembersToGuardrailMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val bulkUnassignKeysFromGuardrailMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val bulkUnassignMembersFromGuardrailMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val createGuardrailMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val deleteGuardrailMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val getGuardrailMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val listGuardrailKeyAssignmentsMetadata: OperationMetadata = OperationMetadata(
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
          pagination = null,
          streaming = null,
        )

    public val listGuardrailMemberAssignmentsMetadata: OperationMetadata = OperationMetadata(
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
          pagination = null,
          streaming = null,
        )

    public val listGuardrailsMetadata: OperationMetadata = OperationMetadata(
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
          pagination = null,
          streaming = null,
        )

    public val listKeyAssignmentsMetadata: OperationMetadata = OperationMetadata(
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
          pagination = null,
          streaming = null,
        )

    public val listMemberAssignmentsMetadata: OperationMetadata = OperationMetadata(
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
          pagination = null,
          streaming = null,
        )

    public val updateGuardrailMetadata: OperationMetadata = OperationMetadata(
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
        )
  }
}
