package io.github.nabobery.sdkgen.github.generated.copilotspaces

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
import io.github.nabobery.sdkgen.github.generated.CopilotSpace
import io.github.nabobery.sdkgen.github.generated.CopilotSpaceCollaborator
import io.github.nabobery.sdkgen.github.generated.CopilotSpaceResource
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesPutRequestJsonXce96a929
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85
import io.github.nabobery.sdkgen.github.generated.InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c
import io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3
import io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846
import io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37
import io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63
import io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c
import io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesGetResponse200JsonXc06296f1
import io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesPostRequestJsonX8861b605
import io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesPutRequestJsonXb050d8be
import io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a
import io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b
import io.github.nabobery.sdkgen.github.generated.InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df
import io.github.nabobery.sdkgen.github.generated.SdkJson
import io.github.nabobery.sdkgen.github.generated.ValidationError
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

internal object CopilotSpacesCodecs {
  internal const val COPILOTSPACESADDCOLLABORATORFORORG_REQUEST_CODEC_ID: String =
      "copilot-spaces/add-collaborator-for-org.request"

  private val copilotSpacesAddCollaboratorForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722> =
      KotlinxSerializationCodec(COPILOTSPACESADDCOLLABORATORFORORG_REQUEST_CODEC_ID, InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722.Serializer, SdkJson)

  internal const val COPILOTSPACESADDCOLLABORATORFORORG_RESPONSE_CODEC_ID: String =
      "copilot-spaces/add-collaborator-for-org.response"

  private val copilotSpacesAddCollaboratorForOrgResponseCodec:
      MediaTypeCodec<CopilotSpaceCollaborator> =
      KotlinxSerializationCodec(COPILOTSPACESADDCOLLABORATORFORORG_RESPONSE_CODEC_ID, CopilotSpaceCollaborator.Serializer, SdkJson)

  private val copilotSpacesAddCollaboratorForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotSpaceCollaborator> =
      KotlinxSerializationCodec("copilot-spaces/add-collaborator-for-org.response.alternative0", CopilotSpaceCollaborator.Serializer, SdkJson)

  internal val copilotSpacesAddCollaboratorForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpaceCollaborator> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForOrgResponseCodecAlternative0Codec)

  private val copilotSpacesAddCollaboratorForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/add-collaborator-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesAddCollaboratorForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesAddCollaboratorForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/add-collaborator-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesAddCollaboratorForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForOrgResponseCodecAlternative2Codec)

  private val copilotSpacesAddCollaboratorForOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/add-collaborator-for-org.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesAddCollaboratorForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForOrgResponseCodecAlternative3Codec)

  internal val copilotSpacesAddCollaboratorForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForOrgRequestCodec)

  internal val copilotSpacesAddCollaboratorForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotSpaceCollaborator> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForOrgResponseCodec)

  internal const val COPILOTSPACESADDCOLLABORATORFORUSER_REQUEST_CODEC_ID: String =
      "copilot-spaces/add-collaborator-for-user.request"

  private val copilotSpacesAddCollaboratorForUserRequestCodec:
      MediaTypeCodec<InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37> =
      KotlinxSerializationCodec(COPILOTSPACESADDCOLLABORATORFORUSER_REQUEST_CODEC_ID, InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37.Serializer, SdkJson)

  internal const val COPILOTSPACESADDCOLLABORATORFORUSER_RESPONSE_CODEC_ID: String =
      "copilot-spaces/add-collaborator-for-user.response"

  private val copilotSpacesAddCollaboratorForUserResponseCodec:
      MediaTypeCodec<CopilotSpaceCollaborator> =
      KotlinxSerializationCodec(COPILOTSPACESADDCOLLABORATORFORUSER_RESPONSE_CODEC_ID, CopilotSpaceCollaborator.Serializer, SdkJson)

  private val copilotSpacesAddCollaboratorForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotSpaceCollaborator> =
      KotlinxSerializationCodec("copilot-spaces/add-collaborator-for-user.response.alternative0", CopilotSpaceCollaborator.Serializer, SdkJson)

  internal val copilotSpacesAddCollaboratorForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpaceCollaborator> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForUserResponseCodecAlternative0Codec)

  private val copilotSpacesAddCollaboratorForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/add-collaborator-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesAddCollaboratorForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForUserResponseCodecAlternative1Codec)

  private val copilotSpacesAddCollaboratorForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/add-collaborator-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesAddCollaboratorForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForUserResponseCodecAlternative2Codec)

  private val copilotSpacesAddCollaboratorForUserResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/add-collaborator-for-user.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesAddCollaboratorForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForUserResponseCodecAlternative3Codec)

  internal val copilotSpacesAddCollaboratorForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForUserRequestCodec)

  internal val copilotSpacesAddCollaboratorForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotSpaceCollaborator> =
      MediaTypeCodecRegistry.of(copilotSpacesAddCollaboratorForUserResponseCodec)

  internal const val COPILOTSPACESCREATEFORORG_REQUEST_CODEC_ID: String =
      "copilot-spaces/create-for-org.request"

  private val copilotSpacesCreateForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2> =
      KotlinxSerializationCodec(COPILOTSPACESCREATEFORORG_REQUEST_CODEC_ID, InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2.Serializer, SdkJson)

  internal const val COPILOTSPACESCREATEFORORG_RESPONSE_CODEC_ID: String =
      "copilot-spaces/create-for-org.response"

  private val copilotSpacesCreateForOrgResponseCodec: MediaTypeCodec<CopilotSpace> =
      KotlinxSerializationCodec(COPILOTSPACESCREATEFORORG_RESPONSE_CODEC_ID, CopilotSpace.Serializer, SdkJson)

  private val copilotSpacesCreateForOrgResponseCodecAlternative0Codec: MediaTypeCodec<CopilotSpace>
      =
      KotlinxSerializationCodec("copilot-spaces/create-for-org.response.alternative0", CopilotSpace.Serializer, SdkJson)

  internal val copilotSpacesCreateForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpace> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateForOrgResponseCodecAlternative0Codec)

  private val copilotSpacesCreateForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/create-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesCreateForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesCreateForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/create-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesCreateForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateForOrgResponseCodecAlternative2Codec)

  private val copilotSpacesCreateForOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/create-for-org.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesCreateForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateForOrgResponseCodecAlternative3Codec)

  internal val copilotSpacesCreateForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateForOrgRequestCodec)

  internal val copilotSpacesCreateForOrgResponseCodecRegistry: MediaTypeCodecRegistry<CopilotSpace>
      = MediaTypeCodecRegistry.of(copilotSpacesCreateForOrgResponseCodec)

  internal const val COPILOTSPACESCREATEFORUSER_REQUEST_CODEC_ID: String =
      "copilot-spaces/create-for-user.request"

  private val copilotSpacesCreateForUserRequestCodec:
      MediaTypeCodec<InlineUsersCopilotSpacesPostRequestJsonX8861b605> =
      KotlinxSerializationCodec(COPILOTSPACESCREATEFORUSER_REQUEST_CODEC_ID, InlineUsersCopilotSpacesPostRequestJsonX8861b605.Serializer, SdkJson)

  internal const val COPILOTSPACESCREATEFORUSER_RESPONSE_CODEC_ID: String =
      "copilot-spaces/create-for-user.response"

  private val copilotSpacesCreateForUserResponseCodec: MediaTypeCodec<CopilotSpace> =
      KotlinxSerializationCodec(COPILOTSPACESCREATEFORUSER_RESPONSE_CODEC_ID, CopilotSpace.Serializer, SdkJson)

  private val copilotSpacesCreateForUserResponseCodecAlternative0Codec: MediaTypeCodec<CopilotSpace>
      =
      KotlinxSerializationCodec("copilot-spaces/create-for-user.response.alternative0", CopilotSpace.Serializer, SdkJson)

  internal val copilotSpacesCreateForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpace> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateForUserResponseCodecAlternative0Codec)

  private val copilotSpacesCreateForUserResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/create-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesCreateForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateForUserResponseCodecAlternative1Codec)

  private val copilotSpacesCreateForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/create-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesCreateForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateForUserResponseCodecAlternative2Codec)

  private val copilotSpacesCreateForUserResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/create-for-user.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesCreateForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateForUserResponseCodecAlternative3Codec)

  internal val copilotSpacesCreateForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesPostRequestJsonX8861b605> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateForUserRequestCodec)

  internal val copilotSpacesCreateForUserResponseCodecRegistry: MediaTypeCodecRegistry<CopilotSpace>
      = MediaTypeCodecRegistry.of(copilotSpacesCreateForUserResponseCodec)

  internal const val COPILOTSPACESCREATERESOURCEFORORG_REQUEST_CODEC_ID: String =
      "copilot-spaces/create-resource-for-org.request"

  private val copilotSpacesCreateResourceForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85> =
      KotlinxSerializationCodec(COPILOTSPACESCREATERESOURCEFORORG_REQUEST_CODEC_ID, InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85.Serializer, SdkJson)

  internal const val COPILOTSPACESCREATERESOURCEFORORG_RESPONSE_CODEC_ID: String =
      "copilot-spaces/create-resource-for-org.response"

  private val copilotSpacesCreateResourceForOrgResponseCodec: MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec(COPILOTSPACESCREATERESOURCEFORORG_RESPONSE_CODEC_ID, CopilotSpaceResource.Serializer, SdkJson)

  private val copilotSpacesCreateResourceForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec("copilot-spaces/create-resource-for-org.response.alternative0", CopilotSpaceResource.Serializer, SdkJson)

  internal val copilotSpacesCreateResourceForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForOrgResponseCodecAlternative0Codec)

  private val copilotSpacesCreateResourceForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec("copilot-spaces/create-resource-for-org.response.alternative1", CopilotSpaceResource.Serializer, SdkJson)

  internal val copilotSpacesCreateResourceForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesCreateResourceForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/create-resource-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesCreateResourceForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForOrgResponseCodecAlternative2Codec)

  private val copilotSpacesCreateResourceForOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/create-resource-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val copilotSpacesCreateResourceForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForOrgResponseCodecAlternative3Codec)

  private val copilotSpacesCreateResourceForOrgResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/create-resource-for-org.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesCreateResourceForOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForOrgResponseCodecAlternative4Codec)

  internal val copilotSpacesCreateResourceForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForOrgRequestCodec)

  internal val copilotSpacesCreateResourceForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForOrgResponseCodec)

  internal const val COPILOTSPACESCREATERESOURCEFORUSER_REQUEST_CODEC_ID: String =
      "copilot-spaces/create-resource-for-user.request"

  private val copilotSpacesCreateResourceForUserRequestCodec:
      MediaTypeCodec<InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b> =
      KotlinxSerializationCodec(COPILOTSPACESCREATERESOURCEFORUSER_REQUEST_CODEC_ID, InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b.Serializer, SdkJson)

  internal const val COPILOTSPACESCREATERESOURCEFORUSER_RESPONSE_CODEC_ID: String =
      "copilot-spaces/create-resource-for-user.response"

  private val copilotSpacesCreateResourceForUserResponseCodec: MediaTypeCodec<CopilotSpaceResource>
      =
      KotlinxSerializationCodec(COPILOTSPACESCREATERESOURCEFORUSER_RESPONSE_CODEC_ID, CopilotSpaceResource.Serializer, SdkJson)

  private val copilotSpacesCreateResourceForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec("copilot-spaces/create-resource-for-user.response.alternative0", CopilotSpaceResource.Serializer, SdkJson)

  internal val copilotSpacesCreateResourceForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForUserResponseCodecAlternative0Codec)

  private val copilotSpacesCreateResourceForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec("copilot-spaces/create-resource-for-user.response.alternative1", CopilotSpaceResource.Serializer, SdkJson)

  internal val copilotSpacesCreateResourceForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForUserResponseCodecAlternative1Codec)

  private val copilotSpacesCreateResourceForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/create-resource-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesCreateResourceForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForUserResponseCodecAlternative2Codec)

  private val copilotSpacesCreateResourceForUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/create-resource-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val copilotSpacesCreateResourceForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForUserResponseCodecAlternative3Codec)

  private val copilotSpacesCreateResourceForUserResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/create-resource-for-user.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesCreateResourceForUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForUserResponseCodecAlternative4Codec)

  internal val copilotSpacesCreateResourceForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForUserRequestCodec)

  internal val copilotSpacesCreateResourceForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesCreateResourceForUserResponseCodec)

  private val copilotSpacesDeleteForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/delete-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesDeleteForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesDeleteForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesDeleteForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/delete-for-org.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesDeleteForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesDeleteForOrgResponseCodecAlternative2Codec)

  internal val copilotSpacesDeleteForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val copilotSpacesDeleteForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val copilotSpacesDeleteForUserResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/delete-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesDeleteForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesDeleteForUserResponseCodecAlternative1Codec)

  private val copilotSpacesDeleteForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/delete-for-user.response.alternative2", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesDeleteForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesDeleteForUserResponseCodecAlternative2Codec)

  internal val copilotSpacesDeleteForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val copilotSpacesDeleteForUserResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val copilotSpacesDeleteResourceForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/delete-resource-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesDeleteResourceForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesDeleteResourceForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesDeleteResourceForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/delete-resource-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesDeleteResourceForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesDeleteResourceForOrgResponseCodecAlternative2Codec)

  internal val copilotSpacesDeleteResourceForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val copilotSpacesDeleteResourceForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  private val copilotSpacesDeleteResourceForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/delete-resource-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesDeleteResourceForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesDeleteResourceForUserResponseCodecAlternative1Codec)

  private val copilotSpacesDeleteResourceForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/delete-resource-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesDeleteResourceForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesDeleteResourceForUserResponseCodecAlternative2Codec)

  internal val copilotSpacesDeleteResourceForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal val copilotSpacesDeleteResourceForUserResponseCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal const val COPILOTSPACESGETFORORG_RESPONSE_CODEC_ID: String =
      "copilot-spaces/get-for-org.response"

  private val copilotSpacesGetForOrgResponseCodec: MediaTypeCodec<CopilotSpace> =
      KotlinxSerializationCodec(COPILOTSPACESGETFORORG_RESPONSE_CODEC_ID, CopilotSpace.Serializer, SdkJson)

  private val copilotSpacesGetForOrgResponseCodecAlternative0Codec: MediaTypeCodec<CopilotSpace> =
      KotlinxSerializationCodec("copilot-spaces/get-for-org.response.alternative0", CopilotSpace.Serializer, SdkJson)

  internal val copilotSpacesGetForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpace> =
      MediaTypeCodecRegistry.of(copilotSpacesGetForOrgResponseCodecAlternative0Codec)

  private val copilotSpacesGetForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/get-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesGetForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesGetForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesGetForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/get-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesGetForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesGetForOrgResponseCodecAlternative2Codec)

  internal val copilotSpacesGetForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val copilotSpacesGetForOrgResponseCodecRegistry: MediaTypeCodecRegistry<CopilotSpace> =
      MediaTypeCodecRegistry.of(copilotSpacesGetForOrgResponseCodec)

  internal const val COPILOTSPACESGETFORUSER_RESPONSE_CODEC_ID: String =
      "copilot-spaces/get-for-user.response"

  private val copilotSpacesGetForUserResponseCodec: MediaTypeCodec<CopilotSpace> =
      KotlinxSerializationCodec(COPILOTSPACESGETFORUSER_RESPONSE_CODEC_ID, CopilotSpace.Serializer, SdkJson)

  private val copilotSpacesGetForUserResponseCodecAlternative0Codec: MediaTypeCodec<CopilotSpace> =
      KotlinxSerializationCodec("copilot-spaces/get-for-user.response.alternative0", CopilotSpace.Serializer, SdkJson)

  internal val copilotSpacesGetForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpace> =
      MediaTypeCodecRegistry.of(copilotSpacesGetForUserResponseCodecAlternative0Codec)

  private val copilotSpacesGetForUserResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/get-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesGetForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesGetForUserResponseCodecAlternative1Codec)

  private val copilotSpacesGetForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/get-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesGetForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesGetForUserResponseCodecAlternative2Codec)

  internal val copilotSpacesGetForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val copilotSpacesGetForUserResponseCodecRegistry: MediaTypeCodecRegistry<CopilotSpace> =
      MediaTypeCodecRegistry.of(copilotSpacesGetForUserResponseCodec)

  internal const val COPILOTSPACESGETRESOURCEFORORG_RESPONSE_CODEC_ID: String =
      "copilot-spaces/get-resource-for-org.response"

  private val copilotSpacesGetResourceForOrgResponseCodec: MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec(COPILOTSPACESGETRESOURCEFORORG_RESPONSE_CODEC_ID, CopilotSpaceResource.Serializer, SdkJson)

  private val copilotSpacesGetResourceForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec("copilot-spaces/get-resource-for-org.response.alternative0", CopilotSpaceResource.Serializer, SdkJson)

  internal val copilotSpacesGetResourceForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesGetResourceForOrgResponseCodecAlternative0Codec)

  private val copilotSpacesGetResourceForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/get-resource-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesGetResourceForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesGetResourceForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesGetResourceForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/get-resource-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesGetResourceForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesGetResourceForOrgResponseCodecAlternative2Codec)

  internal val copilotSpacesGetResourceForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val copilotSpacesGetResourceForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesGetResourceForOrgResponseCodec)

  internal const val COPILOTSPACESGETRESOURCEFORUSER_RESPONSE_CODEC_ID: String =
      "copilot-spaces/get-resource-for-user.response"

  private val copilotSpacesGetResourceForUserResponseCodec: MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec(COPILOTSPACESGETRESOURCEFORUSER_RESPONSE_CODEC_ID, CopilotSpaceResource.Serializer, SdkJson)

  private val copilotSpacesGetResourceForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec("copilot-spaces/get-resource-for-user.response.alternative0", CopilotSpaceResource.Serializer, SdkJson)

  internal val copilotSpacesGetResourceForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesGetResourceForUserResponseCodecAlternative0Codec)

  private val copilotSpacesGetResourceForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/get-resource-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesGetResourceForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesGetResourceForUserResponseCodecAlternative1Codec)

  private val copilotSpacesGetResourceForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/get-resource-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesGetResourceForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesGetResourceForUserResponseCodecAlternative2Codec)

  internal val copilotSpacesGetResourceForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val copilotSpacesGetResourceForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesGetResourceForUserResponseCodec)

  internal const val COPILOTSPACESLISTCOLLABORATORSFORORG_RESPONSE_CODEC_ID: String =
      "copilot-spaces/list-collaborators-for-org.response"

  private val copilotSpacesListCollaboratorsForOrgResponseCodec:
      MediaTypeCodec<InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6> =
      KotlinxSerializationCodec(COPILOTSPACESLISTCOLLABORATORSFORORG_RESPONSE_CODEC_ID, InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6.Serializer, SdkJson)

  private val copilotSpacesListCollaboratorsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6> =
      KotlinxSerializationCodec("copilot-spaces/list-collaborators-for-org.response.alternative0", InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6.Serializer, SdkJson)

  internal val copilotSpacesListCollaboratorsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6> =
      MediaTypeCodecRegistry.of(copilotSpacesListCollaboratorsForOrgResponseCodecAlternative0Codec)

  private val copilotSpacesListCollaboratorsForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-collaborators-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListCollaboratorsForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListCollaboratorsForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesListCollaboratorsForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-collaborators-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListCollaboratorsForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListCollaboratorsForOrgResponseCodecAlternative2Codec)

  internal val copilotSpacesListCollaboratorsForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val copilotSpacesListCollaboratorsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6> =
      MediaTypeCodecRegistry.of(copilotSpacesListCollaboratorsForOrgResponseCodec)

  internal const val COPILOTSPACESLISTCOLLABORATORSFORUSER_RESPONSE_CODEC_ID: String =
      "copilot-spaces/list-collaborators-for-user.response"

  private val copilotSpacesListCollaboratorsForUserResponseCodec:
      MediaTypeCodec<InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846> =
      KotlinxSerializationCodec(COPILOTSPACESLISTCOLLABORATORSFORUSER_RESPONSE_CODEC_ID, InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846.Serializer, SdkJson)

  private val copilotSpacesListCollaboratorsForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846> =
      KotlinxSerializationCodec("copilot-spaces/list-collaborators-for-user.response.alternative0", InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846.Serializer, SdkJson)

  internal val copilotSpacesListCollaboratorsForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846> =
      MediaTypeCodecRegistry.of(copilotSpacesListCollaboratorsForUserResponseCodecAlternative0Codec)

  private val copilotSpacesListCollaboratorsForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-collaborators-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListCollaboratorsForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListCollaboratorsForUserResponseCodecAlternative1Codec)

  private val copilotSpacesListCollaboratorsForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-collaborators-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListCollaboratorsForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListCollaboratorsForUserResponseCodecAlternative2Codec)

  internal val copilotSpacesListCollaboratorsForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val copilotSpacesListCollaboratorsForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846> =
      MediaTypeCodecRegistry.of(copilotSpacesListCollaboratorsForUserResponseCodec)

  internal const val COPILOTSPACESLISTFORORG_RESPONSE_CODEC_ID: String =
      "copilot-spaces/list-for-org.response"

  private val copilotSpacesListForOrgResponseCodec:
      MediaTypeCodec<InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc> =
      KotlinxSerializationCodec(COPILOTSPACESLISTFORORG_RESPONSE_CODEC_ID, InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc.Serializer, SdkJson)

  private val copilotSpacesListForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc> =
      KotlinxSerializationCodec("copilot-spaces/list-for-org.response.alternative0", InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc.Serializer, SdkJson)

  internal val copilotSpacesListForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc> =
      MediaTypeCodecRegistry.of(copilotSpacesListForOrgResponseCodecAlternative0Codec)

  private val copilotSpacesListForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesListForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListForOrgResponseCodecAlternative2Codec)

  internal val copilotSpacesListForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val copilotSpacesListForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc> =
      MediaTypeCodecRegistry.of(copilotSpacesListForOrgResponseCodec)

  internal const val COPILOTSPACESLISTFORUSER_RESPONSE_CODEC_ID: String =
      "copilot-spaces/list-for-user.response"

  private val copilotSpacesListForUserResponseCodec:
      MediaTypeCodec<InlineUsersCopilotSpacesGetResponse200JsonXc06296f1> =
      KotlinxSerializationCodec(COPILOTSPACESLISTFORUSER_RESPONSE_CODEC_ID, InlineUsersCopilotSpacesGetResponse200JsonXc06296f1.Serializer, SdkJson)

  private val copilotSpacesListForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUsersCopilotSpacesGetResponse200JsonXc06296f1> =
      KotlinxSerializationCodec("copilot-spaces/list-for-user.response.alternative0", InlineUsersCopilotSpacesGetResponse200JsonXc06296f1.Serializer, SdkJson)

  internal val copilotSpacesListForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesGetResponse200JsonXc06296f1> =
      MediaTypeCodecRegistry.of(copilotSpacesListForUserResponseCodecAlternative0Codec)

  private val copilotSpacesListForUserResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListForUserResponseCodecAlternative1Codec)

  private val copilotSpacesListForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListForUserResponseCodecAlternative2Codec)

  internal val copilotSpacesListForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val copilotSpacesListForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesGetResponse200JsonXc06296f1> =
      MediaTypeCodecRegistry.of(copilotSpacesListForUserResponseCodec)

  internal const val COPILOTSPACESLISTRESOURCESFORORG_RESPONSE_CODEC_ID: String =
      "copilot-spaces/list-resources-for-org.response"

  private val copilotSpacesListResourcesForOrgResponseCodec:
      MediaTypeCodec<InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a> =
      KotlinxSerializationCodec(COPILOTSPACESLISTRESOURCESFORORG_RESPONSE_CODEC_ID, InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a.Serializer, SdkJson)

  private val copilotSpacesListResourcesForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a> =
      KotlinxSerializationCodec("copilot-spaces/list-resources-for-org.response.alternative0", InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a.Serializer, SdkJson)

  internal val copilotSpacesListResourcesForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a> =
      MediaTypeCodecRegistry.of(copilotSpacesListResourcesForOrgResponseCodecAlternative0Codec)

  private val copilotSpacesListResourcesForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-resources-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListResourcesForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListResourcesForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesListResourcesForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-resources-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListResourcesForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListResourcesForOrgResponseCodecAlternative2Codec)

  internal val copilotSpacesListResourcesForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val copilotSpacesListResourcesForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a> =
      MediaTypeCodecRegistry.of(copilotSpacesListResourcesForOrgResponseCodec)

  internal const val COPILOTSPACESLISTRESOURCESFORUSER_RESPONSE_CODEC_ID: String =
      "copilot-spaces/list-resources-for-user.response"

  private val copilotSpacesListResourcesForUserResponseCodec:
      MediaTypeCodec<InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a> =
      KotlinxSerializationCodec(COPILOTSPACESLISTRESOURCESFORUSER_RESPONSE_CODEC_ID, InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a.Serializer, SdkJson)

  private val copilotSpacesListResourcesForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a> =
      KotlinxSerializationCodec("copilot-spaces/list-resources-for-user.response.alternative0", InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a.Serializer, SdkJson)

  internal val copilotSpacesListResourcesForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a> =
      MediaTypeCodecRegistry.of(copilotSpacesListResourcesForUserResponseCodecAlternative0Codec)

  private val copilotSpacesListResourcesForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-resources-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListResourcesForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListResourcesForUserResponseCodecAlternative1Codec)

  private val copilotSpacesListResourcesForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/list-resources-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesListResourcesForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesListResourcesForUserResponseCodecAlternative2Codec)

  internal val copilotSpacesListResourcesForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val copilotSpacesListResourcesForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a> =
      MediaTypeCodecRegistry.of(copilotSpacesListResourcesForUserResponseCodec)

  private val copilotSpacesRemoveCollaboratorForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/remove-collaborator-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesRemoveCollaboratorForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesRemoveCollaboratorForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesRemoveCollaboratorForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/remove-collaborator-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesRemoveCollaboratorForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesRemoveCollaboratorForOrgResponseCodecAlternative2Codec)

  internal val copilotSpacesRemoveCollaboratorForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val copilotSpacesRemoveCollaboratorForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  private val copilotSpacesRemoveCollaboratorForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/remove-collaborator-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesRemoveCollaboratorForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesRemoveCollaboratorForUserResponseCodecAlternative1Codec)

  private val copilotSpacesRemoveCollaboratorForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/remove-collaborator-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesRemoveCollaboratorForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesRemoveCollaboratorForUserResponseCodecAlternative2Codec)

  internal val copilotSpacesRemoveCollaboratorForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val copilotSpacesRemoveCollaboratorForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal const val COPILOTSPACESUPDATECOLLABORATORFORORG_REQUEST_CODEC_ID: String =
      "copilot-spaces/update-collaborator-for-org.request"

  private val copilotSpacesUpdateCollaboratorForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa> =
      KotlinxSerializationCodec(COPILOTSPACESUPDATECOLLABORATORFORORG_REQUEST_CODEC_ID, InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa.Serializer, SdkJson)

  private val copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotSpaceCollaborator> =
      KotlinxSerializationCodec("copilot-spaces/update-collaborator-for-org.response.alternative0", CopilotSpaceCollaborator.Serializer, SdkJson)

  internal val copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpaceCollaborator> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative0Codec)

  private val copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-collaborator-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative2Codec)

  private val copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-collaborator-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative3Codec)

  private val copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/update-collaborator-for-org.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative4Codec)

  internal val copilotSpacesUpdateCollaboratorForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateCollaboratorForOrgRequestCodec)

  internal const val COPILOTSPACESUPDATECOLLABORATORFORUSER_REQUEST_CODEC_ID: String =
      "copilot-spaces/update-collaborator-for-user.request"

  private val copilotSpacesUpdateCollaboratorForUserRequestCodec:
      MediaTypeCodec<InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c> =
      KotlinxSerializationCodec(COPILOTSPACESUPDATECOLLABORATORFORUSER_REQUEST_CODEC_ID, InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c.Serializer, SdkJson)

  private val copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotSpaceCollaborator> =
      KotlinxSerializationCodec("copilot-spaces/update-collaborator-for-user.response.alternative0", CopilotSpaceCollaborator.Serializer, SdkJson)

  internal val copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpaceCollaborator> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative0Codec)

  private val copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-collaborator-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative2Codec)

  private val copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-collaborator-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative3Codec)

  private val copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/update-collaborator-for-user.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative4Codec)

  internal val copilotSpacesUpdateCollaboratorForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateCollaboratorForUserRequestCodec)

  internal const val COPILOTSPACESUPDATEFORORG_REQUEST_CODEC_ID: String =
      "copilot-spaces/update-for-org.request"

  private val copilotSpacesUpdateForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotSpacesPutRequestJsonXce96a929> =
      KotlinxSerializationCodec(COPILOTSPACESUPDATEFORORG_REQUEST_CODEC_ID, InlineOrgsCopilotSpacesPutRequestJsonXce96a929.Serializer, SdkJson)

  internal const val COPILOTSPACESUPDATEFORORG_RESPONSE_CODEC_ID: String =
      "copilot-spaces/update-for-org.response"

  private val copilotSpacesUpdateForOrgResponseCodec: MediaTypeCodec<CopilotSpace> =
      KotlinxSerializationCodec(COPILOTSPACESUPDATEFORORG_RESPONSE_CODEC_ID, CopilotSpace.Serializer, SdkJson)

  private val copilotSpacesUpdateForOrgResponseCodecAlternative0Codec: MediaTypeCodec<CopilotSpace>
      =
      KotlinxSerializationCodec("copilot-spaces/update-for-org.response.alternative0", CopilotSpace.Serializer, SdkJson)

  internal val copilotSpacesUpdateForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpace> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateForOrgResponseCodecAlternative0Codec)

  private val copilotSpacesUpdateForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesUpdateForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateForOrgResponseCodecAlternative2Codec)

  private val copilotSpacesUpdateForOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/update-for-org.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesUpdateForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateForOrgResponseCodecAlternative3Codec)

  internal val copilotSpacesUpdateForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesPutRequestJsonXce96a929> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateForOrgRequestCodec)

  internal val copilotSpacesUpdateForOrgResponseCodecRegistry: MediaTypeCodecRegistry<CopilotSpace>
      = MediaTypeCodecRegistry.of(copilotSpacesUpdateForOrgResponseCodec)

  internal const val COPILOTSPACESUPDATEFORUSER_REQUEST_CODEC_ID: String =
      "copilot-spaces/update-for-user.request"

  private val copilotSpacesUpdateForUserRequestCodec:
      MediaTypeCodec<InlineUsersCopilotSpacesPutRequestJsonXb050d8be> =
      KotlinxSerializationCodec(COPILOTSPACESUPDATEFORUSER_REQUEST_CODEC_ID, InlineUsersCopilotSpacesPutRequestJsonXb050d8be.Serializer, SdkJson)

  internal const val COPILOTSPACESUPDATEFORUSER_RESPONSE_CODEC_ID: String =
      "copilot-spaces/update-for-user.response"

  private val copilotSpacesUpdateForUserResponseCodec: MediaTypeCodec<CopilotSpace> =
      KotlinxSerializationCodec(COPILOTSPACESUPDATEFORUSER_RESPONSE_CODEC_ID, CopilotSpace.Serializer, SdkJson)

  private val copilotSpacesUpdateForUserResponseCodecAlternative0Codec: MediaTypeCodec<CopilotSpace>
      =
      KotlinxSerializationCodec("copilot-spaces/update-for-user.response.alternative0", CopilotSpace.Serializer, SdkJson)

  internal val copilotSpacesUpdateForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpace> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateForUserResponseCodecAlternative0Codec)

  private val copilotSpacesUpdateForUserResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateForUserResponseCodecAlternative1Codec)

  private val copilotSpacesUpdateForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateForUserResponseCodecAlternative2Codec)

  private val copilotSpacesUpdateForUserResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/update-for-user.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesUpdateForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateForUserResponseCodecAlternative3Codec)

  internal val copilotSpacesUpdateForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesPutRequestJsonXb050d8be> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateForUserRequestCodec)

  internal val copilotSpacesUpdateForUserResponseCodecRegistry: MediaTypeCodecRegistry<CopilotSpace>
      = MediaTypeCodecRegistry.of(copilotSpacesUpdateForUserResponseCodec)

  internal const val COPILOTSPACESUPDATERESOURCEFORORG_REQUEST_CODEC_ID: String =
      "copilot-spaces/update-resource-for-org.request"

  private val copilotSpacesUpdateResourceForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c> =
      KotlinxSerializationCodec(COPILOTSPACESUPDATERESOURCEFORORG_REQUEST_CODEC_ID, InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c.Serializer, SdkJson)

  internal const val COPILOTSPACESUPDATERESOURCEFORORG_RESPONSE_CODEC_ID: String =
      "copilot-spaces/update-resource-for-org.response"

  private val copilotSpacesUpdateResourceForOrgResponseCodec: MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec(COPILOTSPACESUPDATERESOURCEFORORG_RESPONSE_CODEC_ID, CopilotSpaceResource.Serializer, SdkJson)

  private val copilotSpacesUpdateResourceForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec("copilot-spaces/update-resource-for-org.response.alternative0", CopilotSpaceResource.Serializer, SdkJson)

  internal val copilotSpacesUpdateResourceForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForOrgResponseCodecAlternative0Codec)

  private val copilotSpacesUpdateResourceForOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-resource-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateResourceForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForOrgResponseCodecAlternative1Codec)

  private val copilotSpacesUpdateResourceForOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-resource-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateResourceForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForOrgResponseCodecAlternative2Codec)

  private val copilotSpacesUpdateResourceForOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/update-resource-for-org.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesUpdateResourceForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForOrgResponseCodecAlternative3Codec)

  internal val copilotSpacesUpdateResourceForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForOrgRequestCodec)

  internal val copilotSpacesUpdateResourceForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForOrgResponseCodec)

  internal const val COPILOTSPACESUPDATERESOURCEFORUSER_REQUEST_CODEC_ID: String =
      "copilot-spaces/update-resource-for-user.request"

  private val copilotSpacesUpdateResourceForUserRequestCodec:
      MediaTypeCodec<InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df> =
      KotlinxSerializationCodec(COPILOTSPACESUPDATERESOURCEFORUSER_REQUEST_CODEC_ID, InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df.Serializer, SdkJson)

  internal const val COPILOTSPACESUPDATERESOURCEFORUSER_RESPONSE_CODEC_ID: String =
      "copilot-spaces/update-resource-for-user.response"

  private val copilotSpacesUpdateResourceForUserResponseCodec: MediaTypeCodec<CopilotSpaceResource>
      =
      KotlinxSerializationCodec(COPILOTSPACESUPDATERESOURCEFORUSER_RESPONSE_CODEC_ID, CopilotSpaceResource.Serializer, SdkJson)

  private val copilotSpacesUpdateResourceForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<CopilotSpaceResource> =
      KotlinxSerializationCodec("copilot-spaces/update-resource-for-user.response.alternative0", CopilotSpaceResource.Serializer, SdkJson)

  internal val copilotSpacesUpdateResourceForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForUserResponseCodecAlternative0Codec)

  private val copilotSpacesUpdateResourceForUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-resource-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateResourceForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForUserResponseCodecAlternative1Codec)

  private val copilotSpacesUpdateResourceForUserResponseCodecAlternative2Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("copilot-spaces/update-resource-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val copilotSpacesUpdateResourceForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForUserResponseCodecAlternative2Codec)

  private val copilotSpacesUpdateResourceForUserResponseCodecAlternative3Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("copilot-spaces/update-resource-for-user.response.alternative3", ValidationError.Serializer, SdkJson)

  internal val copilotSpacesUpdateResourceForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForUserResponseCodecAlternative3Codec)

  internal val copilotSpacesUpdateResourceForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForUserRequestCodec)

  internal val copilotSpacesUpdateResourceForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<CopilotSpaceResource> =
      MediaTypeCodecRegistry.of(copilotSpacesUpdateResourceForUserResponseCodec)
}

/**
 * Client for the 'copilot-spaces' group of GitHub v3 REST API.
 */
public class CopilotSpacesClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@CopilotSpacesClient.authentication)

  /**
   * Adds a collaborator (user or team) to a specific Copilot Space owned by an organization. The authenticated user
   * must have appropriate permissions to manage collaborators.
   *
   * **Note:** When adding users as collaborators, they must already be members of the organization.
   * When adding teams as collaborators, they must be defined in the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesAddCollaboratorForOrgApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotSpacesAddCollaboratorForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesAddCollaboratorForOrg(
    request: InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722,
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): CopilotSpaceCollaborator = executor.executeWithTypedErrors<InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722, CopilotSpacesAddCollaboratorForOrgResponse, CopilotSpaceCollaborator>(
    request = SdkExecutionRequest(copilotSpacesAddCollaboratorForOrgMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESADDCOLLABORATORFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesAddCollaboratorForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesAddCollaboratorForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesAddCollaboratorForOrgResponse.SuccessJson -> response.json
        is CopilotSpacesAddCollaboratorForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesAddCollaboratorForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesAddCollaboratorForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesAddCollaboratorForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesAddCollaboratorForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesAddCollaboratorForOrgResponse.Http403Json -> CopilotSpacesAddCollaboratorForOrgApiException(response, statusCode, headers)
        is CopilotSpacesAddCollaboratorForOrgResponse.Http404Json -> CopilotSpacesAddCollaboratorForOrgApiException(response, statusCode, headers)
        is CopilotSpacesAddCollaboratorForOrgResponse.Http422Json -> CopilotSpacesAddCollaboratorForOrgApiException(response, statusCode, headers)
        is CopilotSpacesAddCollaboratorForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds a collaborator (user or team) to a specific Copilot Space owned by an organization. The authenticated user
   * must have appropriate permissions to manage collaborators.
   *
   * **Note:** When adding users as collaborators, they must already be members of the organization.
   * When adding teams as collaborators, they must be defined in the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesAddCollaboratorForOrgWithResponse(
    request: InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722,
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesAddCollaboratorForOrgResponse> = executor.executeWithResponse<InlineOrgsCopilotSpacesCollaboratorsPostRequestJsonXb7298722, CopilotSpacesAddCollaboratorForOrgResponse>(SdkExecutionRequest(copilotSpacesAddCollaboratorForOrgMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESADDCOLLABORATORFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
  }), CopilotSpacesCodecs.copilotSpacesAddCollaboratorForOrgRequestCodecRegistry, CopilotSpacesAddCollaboratorForOrgResponseDecoder, options)

  /**
   * Adds a collaborator to a specific Copilot Space owned by a user. The authenticated user must be the owner of the
   * space or have admin access to the space.
   *
   * Team collaborators are not supported for user-owned Copilot Spaces.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesAddCollaboratorForUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotSpacesAddCollaboratorForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesAddCollaboratorForUser(
    request: InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37,
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): CopilotSpaceCollaborator = executor.executeWithTypedErrors<InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37, CopilotSpacesAddCollaboratorForUserResponse, CopilotSpaceCollaborator>(
    request = SdkExecutionRequest(copilotSpacesAddCollaboratorForUserMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESADDCOLLABORATORFORUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesAddCollaboratorForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesAddCollaboratorForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesAddCollaboratorForUserResponse.SuccessJson -> response.json
        is CopilotSpacesAddCollaboratorForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesAddCollaboratorForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesAddCollaboratorForUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesAddCollaboratorForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesAddCollaboratorForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesAddCollaboratorForUserResponse.Http403Json -> CopilotSpacesAddCollaboratorForUserApiException(response, statusCode, headers)
        is CopilotSpacesAddCollaboratorForUserResponse.Http404Json -> CopilotSpacesAddCollaboratorForUserApiException(response, statusCode, headers)
        is CopilotSpacesAddCollaboratorForUserResponse.Http422Json -> CopilotSpacesAddCollaboratorForUserApiException(response, statusCode, headers)
        is CopilotSpacesAddCollaboratorForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Adds a collaborator to a specific Copilot Space owned by a user. The authenticated user must be the owner of the
   * space or have admin access to the space.
   *
   * Team collaborators are not supported for user-owned Copilot Spaces.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesAddCollaboratorForUserWithResponse(
    request: InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37,
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesAddCollaboratorForUserResponse> = executor.executeWithResponse<InlineUsersCopilotSpacesCollaboratorsPostRequestJsonX9d3d5f37, CopilotSpacesAddCollaboratorForUserResponse>(SdkExecutionRequest(copilotSpacesAddCollaboratorForUserMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESADDCOLLABORATORFORUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesAddCollaboratorForUserRequestCodecRegistry, CopilotSpacesAddCollaboratorForUserResponseDecoder, options)

  /**
   * Creates a new Copilot Space owned by an organization. The authenticated user must have permissions to create spaces
   * in the organization.
   *
   * Organization members with appropriate permissions can create Copilot Spaces to be shared within their organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by the submitted resources.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesCreateForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CopilotSpacesCreateForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesCreateForOrg(
    request: InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2,
    org: String,
    options: CallOptions = CallOptions(),
  ): CopilotSpace = executor.executeWithTypedErrors<InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2, CopilotSpacesCreateForOrgResponse, CopilotSpace>(
    request = SdkExecutionRequest(copilotSpacesCreateForOrgMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESCREATEFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesCreateForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesCreateForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesCreateForOrgResponse.SuccessJson -> response.json
        is CopilotSpacesCreateForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesCreateForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesCreateForOrgResponse.Http403Json -> CopilotSpacesCreateForOrgApiException(response, statusCode, headers)
        is CopilotSpacesCreateForOrgResponse.Http404Json -> CopilotSpacesCreateForOrgApiException(response, statusCode, headers)
        is CopilotSpacesCreateForOrgResponse.Http422Json -> CopilotSpacesCreateForOrgApiException(response, statusCode, headers)
        is CopilotSpacesCreateForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a new Copilot Space owned by an organization. The authenticated user must have permissions to create spaces
   * in the organization.
   *
   * Organization members with appropriate permissions can create Copilot Spaces to be shared within their organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by the submitted resources.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesCreateForOrgWithResponse(
    request: InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesCreateForOrgResponse> = executor.executeWithResponse<InlineOrgsCopilotSpacesPostRequestJsonXb43ee6a2, CopilotSpacesCreateForOrgResponse>(SdkExecutionRequest(copilotSpacesCreateForOrgMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESCREATEFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CopilotSpacesCodecs.copilotSpacesCreateForOrgRequestCodecRegistry, CopilotSpacesCreateForOrgResponseDecoder, options)

  /**
   * Creates a new Copilot Space owned by a user. Only the authenticated user can create spaces for their own account.
   *
   * Users can create personal Copilot Spaces for their individual use.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:user` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesCreateForUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotSpacesCreateForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesCreateForUser(
    request: InlineUsersCopilotSpacesPostRequestJsonX8861b605,
    username: String,
    options: CallOptions = CallOptions(),
  ): CopilotSpace = executor.executeWithTypedErrors<InlineUsersCopilotSpacesPostRequestJsonX8861b605, CopilotSpacesCreateForUserResponse, CopilotSpace>(
    request = SdkExecutionRequest(copilotSpacesCreateForUserMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESCREATEFORUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesCreateForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesCreateForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesCreateForUserResponse.SuccessJson -> response.json
        is CopilotSpacesCreateForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateForUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesCreateForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesCreateForUserResponse.Http403Json -> CopilotSpacesCreateForUserApiException(response, statusCode, headers)
        is CopilotSpacesCreateForUserResponse.Http404Json -> CopilotSpacesCreateForUserApiException(response, statusCode, headers)
        is CopilotSpacesCreateForUserResponse.Http422Json -> CopilotSpacesCreateForUserApiException(response, statusCode, headers)
        is CopilotSpacesCreateForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a new Copilot Space owned by a user. Only the authenticated user can create spaces for their own account.
   *
   * Users can create personal Copilot Spaces for their individual use.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesCreateForUserWithResponse(
    request: InlineUsersCopilotSpacesPostRequestJsonX8861b605,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesCreateForUserResponse> = executor.executeWithResponse<InlineUsersCopilotSpacesPostRequestJsonX8861b605, CopilotSpacesCreateForUserResponse>(SdkExecutionRequest(copilotSpacesCreateForUserMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESCREATEFORUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesCreateForUserRequestCodecRegistry, CopilotSpacesCreateForUserResponseDecoder, options)

  /**
   * Creates a new resource in a specific Copilot Space owned by an organization.
   * The authenticated user must have write permissions on the space.
   *
   * The following resource types are supported: `repository`, `github_file`, `free_text`, `github_issue`,
   * `github_pull_request`.
   * The `uploaded_text_file` and `media_content` types are not supported via this endpoint.
   *
   * For `github_file` resources, if a resource with the same repository, file path, and SHA already exists, the
   * existing resource is returned with a `200` status.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space,
   * including the resource being created.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesCreateResourceForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotSpacesCreateResourceForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesCreateResourceForOrg(
    request: InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85,
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): CopilotSpaceResource = executor.executeWithTypedErrors<InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85, CopilotSpacesCreateResourceForOrgResponse, CopilotSpaceResource>(
    request = SdkExecutionRequest(copilotSpacesCreateResourceForOrgMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESCREATERESOURCEFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesCreateResourceForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesCreateResourceForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesCreateResourceForOrgResponse.SuccessJson -> response.json
        is CopilotSpacesCreateResourceForOrgResponse.SuccessJson2 -> response.json
        is CopilotSpacesCreateResourceForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateResourceForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateResourceForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateResourceForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesCreateResourceForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesCreateResourceForOrgResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesCreateResourceForOrgResponse.Http403Json -> CopilotSpacesCreateResourceForOrgApiException(response, statusCode, headers)
        is CopilotSpacesCreateResourceForOrgResponse.Http404Json -> CopilotSpacesCreateResourceForOrgApiException(response, statusCode, headers)
        is CopilotSpacesCreateResourceForOrgResponse.Http422Json -> CopilotSpacesCreateResourceForOrgApiException(response, statusCode, headers)
        is CopilotSpacesCreateResourceForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a new resource in a specific Copilot Space owned by an organization.
   * The authenticated user must have write permissions on the space.
   *
   * The following resource types are supported: `repository`, `github_file`, `free_text`, `github_issue`,
   * `github_pull_request`.
   * The `uploaded_text_file` and `media_content` types are not supported via this endpoint.
   *
   * For `github_file` resources, if a resource with the same repository, file path, and SHA already exists, the
   * existing resource is returned with a `200` status.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space,
   * including the resource being created.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesCreateResourceForOrgWithResponse(
    request: InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85,
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesCreateResourceForOrgResponse> = executor.executeWithResponse<InlineOrgsCopilotSpacesResourcesPostRequestJsonX9e725f85, CopilotSpacesCreateResourceForOrgResponse>(SdkExecutionRequest(copilotSpacesCreateResourceForOrgMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESCREATERESOURCEFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
  }), CopilotSpacesCodecs.copilotSpacesCreateResourceForOrgRequestCodecRegistry, CopilotSpacesCreateResourceForOrgResponseDecoder, options)

  /**
   * Creates a new resource in a specific Copilot Space owned by a user.
   * The authenticated user must have write permissions on the space.
   *
   * The following resource types are supported: `repository`, `github_file`, `free_text`, `github_issue`,
   * `github_pull_request`.
   * The `uploaded_text_file` and `media_content` types are not supported via this endpoint.
   *
   * For `github_file` resources, if a resource with the same repository, file path, and SHA already exists, the
   * existing resource is returned with a `200` status.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:user` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesCreateResourceForUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotSpacesCreateResourceForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesCreateResourceForUser(
    request: InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b,
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): CopilotSpaceResource = executor.executeWithTypedErrors<InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b, CopilotSpacesCreateResourceForUserResponse, CopilotSpaceResource>(
    request = SdkExecutionRequest(copilotSpacesCreateResourceForUserMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESCREATERESOURCEFORUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesCreateResourceForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesCreateResourceForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesCreateResourceForUserResponse.SuccessJson -> response.json
        is CopilotSpacesCreateResourceForUserResponse.SuccessJson2 -> response.json
        is CopilotSpacesCreateResourceForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateResourceForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateResourceForUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesCreateResourceForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesCreateResourceForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesCreateResourceForUserResponse.SuccessJson2 -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesCreateResourceForUserResponse.Http403Json -> CopilotSpacesCreateResourceForUserApiException(response, statusCode, headers)
        is CopilotSpacesCreateResourceForUserResponse.Http404Json -> CopilotSpacesCreateResourceForUserApiException(response, statusCode, headers)
        is CopilotSpacesCreateResourceForUserResponse.Http422Json -> CopilotSpacesCreateResourceForUserApiException(response, statusCode, headers)
        is CopilotSpacesCreateResourceForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a new resource in a specific Copilot Space owned by a user.
   * The authenticated user must have write permissions on the space.
   *
   * The following resource types are supported: `repository`, `github_file`, `free_text`, `github_issue`,
   * `github_pull_request`.
   * The `uploaded_text_file` and `media_content` types are not supported via this endpoint.
   *
   * For `github_file` resources, if a resource with the same repository, file path, and SHA already exists, the
   * existing resource is returned with a `200` status.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesCreateResourceForUserWithResponse(
    request: InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b,
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesCreateResourceForUserResponse> = executor.executeWithResponse<InlineUsersCopilotSpacesResourcesPostRequestJsonXb1f2e92b, CopilotSpacesCreateResourceForUserResponse>(SdkExecutionRequest(copilotSpacesCreateResourceForUserMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESCREATERESOURCEFORUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesCreateResourceForUserRequestCodecRegistry, CopilotSpacesCreateResourceForUserResponseDecoder, options)

  /**
   * Deletes a Copilot Space owned by an organization. The authenticated user must have permissions to delete spaces in
   * the organization.
   *
   * **Warning:** This action is permanent and cannot be undone. Deleting a Copilot Space will remove all associated
   * resources and configurations.
   *
   * Organization members with appropriate permissions can delete Copilot Spaces owned by their organization.
   *
   * OAuth app tokens and personal access tokens (classic) need both the `read:org` and `repo` scopes to use this
   * endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotSpacesDeleteForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CopilotSpacesDeleteForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesDeleteForOrg(
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CopilotSpacesDeleteForOrgResponse, Unit>(
    request = SdkExecutionRequest(copilotSpacesDeleteForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesDeleteForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesDeleteForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesDeleteForOrgResponse.SuccessNoContent -> response.unit
        is CopilotSpacesDeleteForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesDeleteForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesDeleteForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesDeleteForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesDeleteForOrgResponse.Http404Json -> CopilotSpacesDeleteForOrgApiException(response, statusCode, headers)
        is CopilotSpacesDeleteForOrgResponse.Http422Json -> CopilotSpacesDeleteForOrgApiException(response, statusCode, headers)
        is CopilotSpacesDeleteForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a Copilot Space owned by an organization. The authenticated user must have permissions to delete spaces in
   * the organization.
   *
   * **Warning:** This action is permanent and cannot be undone. Deleting a Copilot Space will remove all associated
   * resources and configurations.
   *
   * Organization members with appropriate permissions can delete Copilot Spaces owned by their organization.
   *
   * OAuth app tokens and personal access tokens (classic) need both the `read:org` and `repo` scopes to use this
   * endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesDeleteForOrgWithResponse(
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesDeleteForOrgResponse> = executor.executeWithResponse<Unit, CopilotSpacesDeleteForOrgResponse>(SdkExecutionRequest(copilotSpacesDeleteForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
  }), CopilotSpacesCodecs.copilotSpacesDeleteForOrgRequestCodecRegistry, CopilotSpacesDeleteForOrgResponseDecoder, options)

  /**
   * Deletes a Copilot Space owned by a user. The authenticated user must be the owner of the space.
   *
   * **Warning:** This action is permanent and cannot be undone. Deleting a space will remove all associated resources
   * and configurations.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotSpacesDeleteForUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotSpacesDeleteForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesDeleteForUser(
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CopilotSpacesDeleteForUserResponse, Unit>(
    request = SdkExecutionRequest(copilotSpacesDeleteForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesDeleteForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesDeleteForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesDeleteForUserResponse.SuccessNoContent -> response.unit
        is CopilotSpacesDeleteForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesDeleteForUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesDeleteForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesDeleteForUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesDeleteForUserResponse.Http404Json -> CopilotSpacesDeleteForUserApiException(response, statusCode, headers)
        is CopilotSpacesDeleteForUserResponse.Http422Json -> CopilotSpacesDeleteForUserApiException(response, statusCode, headers)
        is CopilotSpacesDeleteForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a Copilot Space owned by a user. The authenticated user must be the owner of the space.
   *
   * **Warning:** This action is permanent and cannot be undone. Deleting a space will remove all associated resources
   * and configurations.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesDeleteForUserWithResponse(
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesDeleteForUserResponse> = executor.executeWithResponse<Unit, CopilotSpacesDeleteForUserResponse>(SdkExecutionRequest(copilotSpacesDeleteForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesDeleteForUserRequestCodecRegistry, CopilotSpacesDeleteForUserResponseDecoder, options)

  /**
   * Deletes a resource from a specific Copilot Space owned by an organization.
   * The authenticated user must have write permissions on the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotSpacesDeleteResourceForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotSpacesDeleteResourceForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesDeleteResourceForOrg(
    org: String,
    spaceNumber: Int,
    spaceResourceId: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CopilotSpacesDeleteResourceForOrgResponse, Unit>(
    request = SdkExecutionRequest(copilotSpacesDeleteResourceForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesDeleteResourceForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesDeleteResourceForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesDeleteResourceForOrgResponse.SuccessNoContent -> response.unit
        is CopilotSpacesDeleteResourceForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesDeleteResourceForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesDeleteResourceForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesDeleteResourceForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesDeleteResourceForOrgResponse.Http403Json -> CopilotSpacesDeleteResourceForOrgApiException(response, statusCode, headers)
        is CopilotSpacesDeleteResourceForOrgResponse.Http404Json -> CopilotSpacesDeleteResourceForOrgApiException(response, statusCode, headers)
        is CopilotSpacesDeleteResourceForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a resource from a specific Copilot Space owned by an organization.
   * The authenticated user must have write permissions on the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesDeleteResourceForOrgWithResponse(
    org: String,
    spaceNumber: Int,
    spaceResourceId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesDeleteResourceForOrgResponse> = executor.executeWithResponse<Unit, CopilotSpacesDeleteResourceForOrgResponse>(SdkExecutionRequest(copilotSpacesDeleteResourceForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
  }), CopilotSpacesCodecs.copilotSpacesDeleteResourceForOrgRequestCodecRegistry, CopilotSpacesDeleteResourceForOrgResponseDecoder, options)

  /**
   * Deletes a resource from a specific Copilot Space owned by a user.
   * The authenticated user must have write permissions on the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:user` scope to use this endpoint.
   *
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotSpacesDeleteResourceForUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotSpacesDeleteResourceForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesDeleteResourceForUser(
    spaceNumber: Int,
    spaceResourceId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CopilotSpacesDeleteResourceForUserResponse, Unit>(
    request = SdkExecutionRequest(copilotSpacesDeleteResourceForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesDeleteResourceForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesDeleteResourceForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesDeleteResourceForUserResponse.SuccessNoContent -> response.unit
        is CopilotSpacesDeleteResourceForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesDeleteResourceForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesDeleteResourceForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesDeleteResourceForUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesDeleteResourceForUserResponse.Http403Json -> CopilotSpacesDeleteResourceForUserApiException(response, statusCode, headers)
        is CopilotSpacesDeleteResourceForUserResponse.Http404Json -> CopilotSpacesDeleteResourceForUserApiException(response, statusCode, headers)
        is CopilotSpacesDeleteResourceForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a resource from a specific Copilot Space owned by a user.
   * The authenticated user must have write permissions on the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesDeleteResourceForUserWithResponse(
    spaceNumber: Int,
    spaceResourceId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesDeleteResourceForUserResponse> = executor.executeWithResponse<Unit, CopilotSpacesDeleteResourceForUserResponse>(SdkExecutionRequest(copilotSpacesDeleteResourceForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesDeleteResourceForUserRequestCodecRegistry, CopilotSpacesDeleteResourceForUserResponseDecoder, options)

  /**
   * Gets details about a specific Copilot Space owned by an organization. The authenticated user must have read access
   * to the Space.
   *
   * Internal Spaces require the authenticated user to be a member of the organization or have been granted read
   * permissions.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesGetForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CopilotSpacesGetForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesGetForOrg(
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): CopilotSpace = executor.executeWithTypedErrors<Unit, CopilotSpacesGetForOrgResponse, CopilotSpace>(
    request = SdkExecutionRequest(copilotSpacesGetForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesGetForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesGetForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesGetForOrgResponse.SuccessJson -> response.json
        is CopilotSpacesGetForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesGetForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesGetForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesGetForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesGetForOrgResponse.Http403Json -> CopilotSpacesGetForOrgApiException(response, statusCode, headers)
        is CopilotSpacesGetForOrgResponse.Http404Json -> CopilotSpacesGetForOrgApiException(response, statusCode, headers)
        is CopilotSpacesGetForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets details about a specific Copilot Space owned by an organization. The authenticated user must have read access
   * to the Space.
   *
   * Internal Spaces require the authenticated user to be a member of the organization or have been granted read
   * permissions.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesGetForOrgWithResponse(
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesGetForOrgResponse> = executor.executeWithResponse<Unit, CopilotSpacesGetForOrgResponse>(SdkExecutionRequest(copilotSpacesGetForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
  }), CopilotSpacesCodecs.copilotSpacesGetForOrgRequestCodecRegistry, CopilotSpacesGetForOrgResponseDecoder, options)

  /**
   * Gets details about a specific Copilot Space owned by a user. The authenticated user must have read access to the
   * Space.
   *
   * Private user spaces require the authenticated user to be the owner of the space.
   * Public user spaces are accessible to any authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesGetForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CopilotSpacesGetForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesGetForUser(
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): CopilotSpace = executor.executeWithTypedErrors<Unit, CopilotSpacesGetForUserResponse, CopilotSpace>(
    request = SdkExecutionRequest(copilotSpacesGetForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesGetForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesGetForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesGetForUserResponse.SuccessJson -> response.json
        is CopilotSpacesGetForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesGetForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesGetForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesGetForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesGetForUserResponse.Http403Json -> CopilotSpacesGetForUserApiException(response, statusCode, headers)
        is CopilotSpacesGetForUserResponse.Http404Json -> CopilotSpacesGetForUserApiException(response, statusCode, headers)
        is CopilotSpacesGetForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets details about a specific Copilot Space owned by a user. The authenticated user must have read access to the
   * Space.
   *
   * Private user spaces require the authenticated user to be the owner of the space.
   * Public user spaces are accessible to any authenticated user.
   *
   * OAuth app tokens and personal access tokens (classic) need the `repo` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesGetForUserWithResponse(
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesGetForUserResponse> = executor.executeWithResponse<Unit, CopilotSpacesGetForUserResponse>(SdkExecutionRequest(copilotSpacesGetForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesGetForUserRequestCodecRegistry, CopilotSpacesGetForUserResponseDecoder, options)

  /**
   * Gets a specific resource attached to a Copilot Space owned by an organization.
   * The authenticated user must have appropriate permissions to view the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesGetResourceForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotSpacesGetResourceForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesGetResourceForOrg(
    org: String,
    spaceNumber: Int,
    spaceResourceId: Int,
    options: CallOptions = CallOptions(),
  ): CopilotSpaceResource = executor.executeWithTypedErrors<Unit, CopilotSpacesGetResourceForOrgResponse, CopilotSpaceResource>(
    request = SdkExecutionRequest(copilotSpacesGetResourceForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesGetResourceForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesGetResourceForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesGetResourceForOrgResponse.SuccessJson -> response.json
        is CopilotSpacesGetResourceForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesGetResourceForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesGetResourceForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesGetResourceForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesGetResourceForOrgResponse.Http403Json -> CopilotSpacesGetResourceForOrgApiException(response, statusCode, headers)
        is CopilotSpacesGetResourceForOrgResponse.Http404Json -> CopilotSpacesGetResourceForOrgApiException(response, statusCode, headers)
        is CopilotSpacesGetResourceForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a specific resource attached to a Copilot Space owned by an organization.
   * The authenticated user must have appropriate permissions to view the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesGetResourceForOrgWithResponse(
    org: String,
    spaceNumber: Int,
    spaceResourceId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesGetResourceForOrgResponse> = executor.executeWithResponse<Unit, CopilotSpacesGetResourceForOrgResponse>(SdkExecutionRequest(copilotSpacesGetResourceForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
  }), CopilotSpacesCodecs.copilotSpacesGetResourceForOrgRequestCodecRegistry, CopilotSpacesGetResourceForOrgResponseDecoder, options)

  /**
   * Gets a specific resource attached to a Copilot Space owned by a user.
   * The authenticated user must have appropriate permissions to view the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:user` scope to use this endpoint.
   *
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesGetResourceForUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotSpacesGetResourceForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesGetResourceForUser(
    spaceNumber: Int,
    spaceResourceId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): CopilotSpaceResource = executor.executeWithTypedErrors<Unit, CopilotSpacesGetResourceForUserResponse, CopilotSpaceResource>(
    request = SdkExecutionRequest(copilotSpacesGetResourceForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesGetResourceForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesGetResourceForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesGetResourceForUserResponse.SuccessJson -> response.json
        is CopilotSpacesGetResourceForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesGetResourceForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesGetResourceForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesGetResourceForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesGetResourceForUserResponse.Http403Json -> CopilotSpacesGetResourceForUserApiException(response, statusCode, headers)
        is CopilotSpacesGetResourceForUserResponse.Http404Json -> CopilotSpacesGetResourceForUserApiException(response, statusCode, headers)
        is CopilotSpacesGetResourceForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a specific resource attached to a Copilot Space owned by a user.
   * The authenticated user must have appropriate permissions to view the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesGetResourceForUserWithResponse(
    spaceNumber: Int,
    spaceResourceId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesGetResourceForUserResponse> = executor.executeWithResponse<Unit, CopilotSpacesGetResourceForUserResponse>(SdkExecutionRequest(copilotSpacesGetResourceForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesGetResourceForUserRequestCodecRegistry, CopilotSpacesGetResourceForUserResponseDecoder, options)

  /**
   * Lists all collaborators for a specific Copilot Space owned by an organization. The authenticated user must have
   * appropriate permissions to view collaborators.
   *
   * Each collaborator entry specifies which user or team has access to the space and at what level (reader, writer, or
   * admin). The space owner (organization) is excluded from this list.
   *
   * **Note:** Team collaborators listed here are teams that are defined in the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesListCollaboratorsForOrgApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotSpacesListCollaboratorsForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesListCollaboratorsForOrg(
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6 = executor.executeWithTypedErrors<Unit, CopilotSpacesListCollaboratorsForOrgResponse, InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6>(
    request = SdkExecutionRequest(copilotSpacesListCollaboratorsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesListCollaboratorsForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesListCollaboratorsForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesListCollaboratorsForOrgResponse.SuccessJson -> response.json
        is CopilotSpacesListCollaboratorsForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListCollaboratorsForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListCollaboratorsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesListCollaboratorsForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesListCollaboratorsForOrgResponse.Http403Json -> CopilotSpacesListCollaboratorsForOrgApiException(response, statusCode, headers)
        is CopilotSpacesListCollaboratorsForOrgResponse.Http404Json -> CopilotSpacesListCollaboratorsForOrgApiException(response, statusCode, headers)
        is CopilotSpacesListCollaboratorsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all collaborators for a specific Copilot Space owned by an organization. The authenticated user must have
   * appropriate permissions to view collaborators.
   *
   * Each collaborator entry specifies which user or team has access to the space and at what level (reader, writer, or
   * admin). The space owner (organization) is excluded from this list.
   *
   * **Note:** Team collaborators listed here are teams that are defined in the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesListCollaboratorsForOrgWithResponse(
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesListCollaboratorsForOrgResponse> = executor.executeWithResponse<Unit, CopilotSpacesListCollaboratorsForOrgResponse>(SdkExecutionRequest(copilotSpacesListCollaboratorsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
  }), CopilotSpacesCodecs.copilotSpacesListCollaboratorsForOrgRequestCodecRegistry, CopilotSpacesListCollaboratorsForOrgResponseDecoder, options)

  /**
   * Lists all collaborators for a specific Copilot Space owned by a user. The authenticated user must be the owner of
   * the space or have admin access to the space.
   *
   * Each collaborator entry specifies which user has access to the space and at what level (reader, writer, or admin).
   * The space owner is excluded from this list.
   *
   * Team collaborators are not supported for user-owned Copilot Spaces.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesListCollaboratorsForUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotSpacesListCollaboratorsForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesListCollaboratorsForUser(
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846 = executor.executeWithTypedErrors<Unit, CopilotSpacesListCollaboratorsForUserResponse, InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846>(
    request = SdkExecutionRequest(copilotSpacesListCollaboratorsForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesListCollaboratorsForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesListCollaboratorsForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesListCollaboratorsForUserResponse.SuccessJson -> response.json
        is CopilotSpacesListCollaboratorsForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListCollaboratorsForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListCollaboratorsForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesListCollaboratorsForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesListCollaboratorsForUserResponse.Http403Json -> CopilotSpacesListCollaboratorsForUserApiException(response, statusCode, headers)
        is CopilotSpacesListCollaboratorsForUserResponse.Http404Json -> CopilotSpacesListCollaboratorsForUserApiException(response, statusCode, headers)
        is CopilotSpacesListCollaboratorsForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all collaborators for a specific Copilot Space owned by a user. The authenticated user must be the owner of
   * the space or have admin access to the space.
   *
   * Each collaborator entry specifies which user has access to the space and at what level (reader, writer, or admin).
   * The space owner is excluded from this list.
   *
   * Team collaborators are not supported for user-owned Copilot Spaces.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesListCollaboratorsForUserWithResponse(
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesListCollaboratorsForUserResponse> = executor.executeWithResponse<Unit, CopilotSpacesListCollaboratorsForUserResponse>(SdkExecutionRequest(copilotSpacesListCollaboratorsForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesListCollaboratorsForUserRequestCodecRegistry, CopilotSpacesListCollaboratorsForUserResponseDecoder, options)

  /**
   * Lists Copilot Spaces owned by an organization. The authenticated user must have read access to the organization's
   * Copilot Spaces.
   *
   * Only Spaces that are readable by the authenticated user are returned. This includes public Spaces and internal
   * Spaces if the user is a member of the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in a space; spaces
   * with inaccessible resources are omitted from the response.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor.
   * @param perPage The number of results per page (max 100).
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesListForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CopilotSpacesListForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesListForOrg(
    org: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc = executor.executeWithTypedErrors<Unit, CopilotSpacesListForOrgResponse, InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc>(
    request = SdkExecutionRequest(copilotSpacesListForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesListForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesListForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesListForOrgResponse.SuccessJson -> response.json
        is CopilotSpacesListForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesListForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesListForOrgResponse.Http403Json -> CopilotSpacesListForOrgApiException(response, statusCode, headers)
        is CopilotSpacesListForOrgResponse.Http404Json -> CopilotSpacesListForOrgApiException(response, statusCode, headers)
        is CopilotSpacesListForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists Copilot Spaces owned by an organization. The authenticated user must have read access to the organization's
   * Copilot Spaces.
   *
   * Only Spaces that are readable by the authenticated user are returned. This includes public Spaces and internal
   * Spaces if the user is a member of the organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in a space; spaces
   * with inaccessible resources are omitted from the response.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor.
   * @param perPage The number of results per page (max 100).
   * @param options Execution options.
   */
  public suspend fun copilotSpacesListForOrgWithResponse(
    org: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesListForOrgResponse> = executor.executeWithResponse<Unit, CopilotSpacesListForOrgResponse>(SdkExecutionRequest(copilotSpacesListForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CopilotSpacesCodecs.copilotSpacesListForOrgRequestCodecRegistry, CopilotSpacesListForOrgResponseDecoder, options)

  /**
   * Lists Copilot Spaces owned by a user. The authenticated user must have read access to the user's Copilot Spaces.
   *
   * Only Spaces that are readable by the authenticated user are returned. This includes the user's own spaces, and
   * public user spaces when accessing another user's spaces.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:user` scope to use this endpoint.
   *
   * @param username The handle for the GitHub user account.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor.
   * @param perPage The number of results per page (max 100).
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesListForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CopilotSpacesListForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesListForUser(
    username: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): InlineUsersCopilotSpacesGetResponse200JsonXc06296f1 = executor.executeWithTypedErrors<Unit, CopilotSpacesListForUserResponse, InlineUsersCopilotSpacesGetResponse200JsonXc06296f1>(
    request = SdkExecutionRequest(copilotSpacesListForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesListForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesListForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesListForUserResponse.SuccessJson -> response.json
        is CopilotSpacesListForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesListForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesListForUserResponse.Http403Json -> CopilotSpacesListForUserApiException(response, statusCode, headers)
        is CopilotSpacesListForUserResponse.Http404Json -> CopilotSpacesListForUserApiException(response, statusCode, headers)
        is CopilotSpacesListForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists Copilot Spaces owned by a user. The authenticated user must have read access to the user's Copilot Spaces.
   *
   * Only Spaces that are readable by the authenticated user are returned. This includes the user's own spaces, and
   * public user spaces when accessing another user's spaces.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param username The handle for the GitHub user account.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor.
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor.
   * @param perPage The number of results per page (max 100).
   * @param options Execution options.
   */
  public suspend fun copilotSpacesListForUserWithResponse(
    username: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesListForUserResponse> = executor.executeWithResponse<Unit, CopilotSpacesListForUserResponse>(SdkExecutionRequest(copilotSpacesListForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), CopilotSpacesCodecs.copilotSpacesListForUserRequestCodecRegistry, CopilotSpacesListForUserResponseDecoder, options)

  /**
   * Lists all resources attached to a specific Copilot Space owned by an organization.
   * The authenticated user must have appropriate permissions to view the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesListResourcesForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotSpacesListResourcesForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesListResourcesForOrg(
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a = executor.executeWithTypedErrors<Unit, CopilotSpacesListResourcesForOrgResponse, InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a>(
    request = SdkExecutionRequest(copilotSpacesListResourcesForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesListResourcesForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesListResourcesForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesListResourcesForOrgResponse.SuccessJson -> response.json
        is CopilotSpacesListResourcesForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListResourcesForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListResourcesForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesListResourcesForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesListResourcesForOrgResponse.Http403Json -> CopilotSpacesListResourcesForOrgApiException(response, statusCode, headers)
        is CopilotSpacesListResourcesForOrgResponse.Http404Json -> CopilotSpacesListResourcesForOrgApiException(response, statusCode, headers)
        is CopilotSpacesListResourcesForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all resources attached to a specific Copilot Space owned by an organization.
   * The authenticated user must have appropriate permissions to view the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesListResourcesForOrgWithResponse(
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesListResourcesForOrgResponse> = executor.executeWithResponse<Unit, CopilotSpacesListResourcesForOrgResponse>(SdkExecutionRequest(copilotSpacesListResourcesForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
  }), CopilotSpacesCodecs.copilotSpacesListResourcesForOrgRequestCodecRegistry, CopilotSpacesListResourcesForOrgResponseDecoder, options)

  /**
   * Lists all resources attached to a specific Copilot Space owned by a user.
   * The authenticated user must have appropriate permissions to view the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:user` scope to use this endpoint.
   *
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesListResourcesForUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotSpacesListResourcesForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesListResourcesForUser(
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a = executor.executeWithTypedErrors<Unit, CopilotSpacesListResourcesForUserResponse, InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a>(
    request = SdkExecutionRequest(copilotSpacesListResourcesForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesListResourcesForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesListResourcesForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesListResourcesForUserResponse.SuccessJson -> response.json
        is CopilotSpacesListResourcesForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListResourcesForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesListResourcesForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesListResourcesForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesListResourcesForUserResponse.Http403Json -> CopilotSpacesListResourcesForUserApiException(response, statusCode, headers)
        is CopilotSpacesListResourcesForUserResponse.Http404Json -> CopilotSpacesListResourcesForUserApiException(response, statusCode, headers)
        is CopilotSpacesListResourcesForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all resources attached to a specific Copilot Space owned by a user.
   * The authenticated user must have appropriate permissions to view the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesListResourcesForUserWithResponse(
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesListResourcesForUserResponse> = executor.executeWithResponse<Unit, CopilotSpacesListResourcesForUserResponse>(SdkExecutionRequest(copilotSpacesListResourcesForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesListResourcesForUserRequestCodecRegistry, CopilotSpacesListResourcesForUserResponseDecoder, options)

  /**
   * Removes a collaborator from a specific Copilot Space owned by an organization. The authenticated user must have
   * appropriate permissions to manage collaborators.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * @param actorIdentifier The username (for users) or team slug (for teams). The numeric ID of a user or team is also
   * accepted.
   * @param actorType The type of actor (user or team).
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotSpacesRemoveCollaboratorForOrgApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotSpacesRemoveCollaboratorForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesRemoveCollaboratorForOrg(
    actorIdentifier: String,
    actorType: InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c,
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CopilotSpacesRemoveCollaboratorForOrgResponse, Unit>(
    request = SdkExecutionRequest(copilotSpacesRemoveCollaboratorForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_identifier", values = listOf(actorIdentifier.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_type", values = listOf(actorType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesRemoveCollaboratorForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesRemoveCollaboratorForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesRemoveCollaboratorForOrgResponse.SuccessNoContent -> response.unit
        is CopilotSpacesRemoveCollaboratorForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesRemoveCollaboratorForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesRemoveCollaboratorForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesRemoveCollaboratorForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesRemoveCollaboratorForOrgResponse.Http403Json -> CopilotSpacesRemoveCollaboratorForOrgApiException(response, statusCode, headers)
        is CopilotSpacesRemoveCollaboratorForOrgResponse.Http404Json -> CopilotSpacesRemoveCollaboratorForOrgApiException(response, statusCode, headers)
        is CopilotSpacesRemoveCollaboratorForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a collaborator from a specific Copilot Space owned by an organization. The authenticated user must have
   * appropriate permissions to manage collaborators.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param actorIdentifier The username (for users) or team slug (for teams). The numeric ID of a user or team is also
   * accepted.
   * @param actorType The type of actor (user or team).
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesRemoveCollaboratorForOrgWithResponse(
    actorIdentifier: String,
    actorType: InlineOrgsCopilotSpacesCollaboratorsDeleteParameterXbeb3e54c,
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesRemoveCollaboratorForOrgResponse> = executor.executeWithResponse<Unit, CopilotSpacesRemoveCollaboratorForOrgResponse>(SdkExecutionRequest(copilotSpacesRemoveCollaboratorForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_identifier", values = listOf(actorIdentifier.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_type", values = listOf(actorType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
  }), CopilotSpacesCodecs.copilotSpacesRemoveCollaboratorForOrgRequestCodecRegistry, CopilotSpacesRemoveCollaboratorForOrgResponseDecoder, options)

  /**
   * Removes a collaborator from a specific Copilot Space owned by a user. The authenticated user must be the owner of
   * the space or have admin access to the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * @param actorIdentifier The username of the collaborator. The numeric user ID is also accepted.
   * @param actorType The type of actor (must be `User` for user-owned spaces; `Team` will be rejected).
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return No response body.
   * @throws CopilotSpacesRemoveCollaboratorForUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded CopilotSpacesRemoveCollaboratorForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesRemoveCollaboratorForUser(
    actorIdentifier: String,
    actorType: InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3,
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CopilotSpacesRemoveCollaboratorForUserResponse, Unit>(
    request = SdkExecutionRequest(copilotSpacesRemoveCollaboratorForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_identifier", values = listOf(actorIdentifier.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_type", values = listOf(actorType.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesRemoveCollaboratorForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesRemoveCollaboratorForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesRemoveCollaboratorForUserResponse.SuccessNoContent -> response.unit
        is CopilotSpacesRemoveCollaboratorForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesRemoveCollaboratorForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesRemoveCollaboratorForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesRemoveCollaboratorForUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesRemoveCollaboratorForUserResponse.Http403Json -> CopilotSpacesRemoveCollaboratorForUserApiException(response, statusCode, headers)
        is CopilotSpacesRemoveCollaboratorForUserResponse.Http404Json -> CopilotSpacesRemoveCollaboratorForUserApiException(response, statusCode, headers)
        is CopilotSpacesRemoveCollaboratorForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Removes a collaborator from a specific Copilot Space owned by a user. The authenticated user must be the owner of
   * the space or have admin access to the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param actorIdentifier The username of the collaborator. The numeric user ID is also accepted.
   * @param actorType The type of actor (must be `User` for user-owned spaces; `Team` will be rejected).
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesRemoveCollaboratorForUserWithResponse(
    actorIdentifier: String,
    actorType: InlineUsersCopilotSpacesCollaboratorsDeleteParameterXafaaeaa3,
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesRemoveCollaboratorForUserResponse> = executor.executeWithResponse<Unit, CopilotSpacesRemoveCollaboratorForUserResponse>(SdkExecutionRequest(copilotSpacesRemoveCollaboratorForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_identifier", values = listOf(actorIdentifier.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_type", values = listOf(actorType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesRemoveCollaboratorForUserRequestCodecRegistry, CopilotSpacesRemoveCollaboratorForUserResponseDecoder, options)

  /**
   * Updates the role of a collaborator for a specific Copilot Space owned by an organization. The authenticated user
   * must have appropriate permissions to manage collaborators.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param actorIdentifier The username (for users) or team slug (for teams). The numeric ID of a user or team is also
   * accepted.
   * @param actorType The type of actor (user or team).
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesUpdateCollaboratorForOrgWithResponse(
    request: InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa,
    actorIdentifier: String,
    actorType: InlineOrgsCopilotSpacesCollaboratorsPutParameterXbaf4e5fa,
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesUpdateCollaboratorForOrgResponse> = executor.executeWithResponse<InlineOrgsCopilotSpacesCollaboratorsPutRequestJsonXa2ef22fa, CopilotSpacesUpdateCollaboratorForOrgResponse>(SdkExecutionRequest(copilotSpacesUpdateCollaboratorForOrgMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESUPDATECOLLABORATORFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_identifier", values = listOf(actorIdentifier.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_type", values = listOf(actorType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
  }), CopilotSpacesCodecs.copilotSpacesUpdateCollaboratorForOrgRequestCodecRegistry, CopilotSpacesUpdateCollaboratorForOrgResponseDecoder, options)

  /**
   * Updates the role of a collaborator for a specific Copilot Space owned by a user. The authenticated user must be the
   * owner of the space or have admin access to the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `user` scope to use this endpoint.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param actorIdentifier The username of the collaborator. The numeric user ID is also accepted.
   * @param actorType The type of actor (must be `User` for user-owned spaces; `Team` will be rejected).
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesUpdateCollaboratorForUserWithResponse(
    request: InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c,
    actorIdentifier: String,
    actorType: InlineUsersCopilotSpacesCollaboratorsPutParameterX047fcd63,
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesUpdateCollaboratorForUserResponse> = executor.executeWithResponse<InlineUsersCopilotSpacesCollaboratorsPutRequestJsonX9fe1970c, CopilotSpacesUpdateCollaboratorForUserResponse>(SdkExecutionRequest(copilotSpacesUpdateCollaboratorForUserMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESUPDATECOLLABORATORFORUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_identifier", values = listOf(actorIdentifier.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "actor_type", values = listOf(actorType.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesUpdateCollaboratorForUserRequestCodecRegistry, CopilotSpacesUpdateCollaboratorForUserResponseDecoder, options)

  /**
   * Updates a Copilot Space owned by an organization. The authenticated user must have permissions to update spaces in
   * the organization.
   *
   * Organization members with appropriate permissions can update Copilot Spaces owned by their organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space,
   * including any being added or updated.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesUpdateForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CopilotSpacesUpdateForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesUpdateForOrg(
    request: InlineOrgsCopilotSpacesPutRequestJsonXce96a929,
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): CopilotSpace = executor.executeWithTypedErrors<InlineOrgsCopilotSpacesPutRequestJsonXce96a929, CopilotSpacesUpdateForOrgResponse, CopilotSpace>(
    request = SdkExecutionRequest(copilotSpacesUpdateForOrgMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESUPDATEFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesUpdateForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesUpdateForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesUpdateForOrgResponse.SuccessJson -> response.json
        is CopilotSpacesUpdateForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesUpdateForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesUpdateForOrgResponse.Http403Json -> CopilotSpacesUpdateForOrgApiException(response, statusCode, headers)
        is CopilotSpacesUpdateForOrgResponse.Http404Json -> CopilotSpacesUpdateForOrgApiException(response, statusCode, headers)
        is CopilotSpacesUpdateForOrgResponse.Http422Json -> CopilotSpacesUpdateForOrgApiException(response, statusCode, headers)
        is CopilotSpacesUpdateForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates a Copilot Space owned by an organization. The authenticated user must have permissions to update spaces in
   * the organization.
   *
   * Organization members with appropriate permissions can update Copilot Spaces owned by their organization.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space,
   * including any being added or updated.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesUpdateForOrgWithResponse(
    request: InlineOrgsCopilotSpacesPutRequestJsonXce96a929,
    org: String,
    spaceNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesUpdateForOrgResponse> = executor.executeWithResponse<InlineOrgsCopilotSpacesPutRequestJsonXce96a929, CopilotSpacesUpdateForOrgResponse>(SdkExecutionRequest(copilotSpacesUpdateForOrgMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESUPDATEFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
  }), CopilotSpacesCodecs.copilotSpacesUpdateForOrgRequestCodecRegistry, CopilotSpacesUpdateForOrgResponseDecoder, options)

  /**
   * Updates a Copilot Space owned by a user. Only the authenticated user can update spaces for their own account.
   *
   * Users can update their personal Copilot Spaces.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:user` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesUpdateForUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotSpacesUpdateForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesUpdateForUser(
    request: InlineUsersCopilotSpacesPutRequestJsonXb050d8be,
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): CopilotSpace = executor.executeWithTypedErrors<InlineUsersCopilotSpacesPutRequestJsonXb050d8be, CopilotSpacesUpdateForUserResponse, CopilotSpace>(
    request = SdkExecutionRequest(copilotSpacesUpdateForUserMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESUPDATEFORUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesUpdateForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesUpdateForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesUpdateForUserResponse.SuccessJson -> response.json
        is CopilotSpacesUpdateForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateForUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesUpdateForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesUpdateForUserResponse.Http403Json -> CopilotSpacesUpdateForUserApiException(response, statusCode, headers)
        is CopilotSpacesUpdateForUserResponse.Http404Json -> CopilotSpacesUpdateForUserApiException(response, statusCode, headers)
        is CopilotSpacesUpdateForUserResponse.Http422Json -> CopilotSpacesUpdateForUserApiException(response, statusCode, headers)
        is CopilotSpacesUpdateForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates a Copilot Space owned by a user. Only the authenticated user can update spaces for their own account.
   *
   * Users can update their personal Copilot Spaces.
   *
   * OAuth app tokens and personal access tokens (classic) need the `read:user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesUpdateForUserWithResponse(
    request: InlineUsersCopilotSpacesPutRequestJsonXb050d8be,
    spaceNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesUpdateForUserResponse> = executor.executeWithResponse<InlineUsersCopilotSpacesPutRequestJsonXb050d8be, CopilotSpacesUpdateForUserResponse>(SdkExecutionRequest(copilotSpacesUpdateForUserMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESUPDATEFORUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesUpdateForUserRequestCodecRegistry, CopilotSpacesUpdateForUserResponseDecoder, options)

  /**
   * Updates the metadata of a resource in a specific Copilot Space owned by an organization.
   * The authenticated user must have write permissions on the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space,
   * including the resource being updated.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesUpdateResourceForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CopilotSpacesUpdateResourceForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesUpdateResourceForOrg(
    request: InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c,
    org: String,
    spaceNumber: Int,
    spaceResourceId: Int,
    options: CallOptions = CallOptions(),
  ): CopilotSpaceResource = executor.executeWithTypedErrors<InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c, CopilotSpacesUpdateResourceForOrgResponse, CopilotSpaceResource>(
    request = SdkExecutionRequest(copilotSpacesUpdateResourceForOrgMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESUPDATERESOURCEFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesUpdateResourceForOrgRequestCodecRegistry,
    responseDecoder = CopilotSpacesUpdateResourceForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesUpdateResourceForOrgResponse.SuccessJson -> response.json
        is CopilotSpacesUpdateResourceForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateResourceForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateResourceForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateResourceForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesUpdateResourceForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesUpdateResourceForOrgResponse.Http403Json -> CopilotSpacesUpdateResourceForOrgApiException(response, statusCode, headers)
        is CopilotSpacesUpdateResourceForOrgResponse.Http404Json -> CopilotSpacesUpdateResourceForOrgApiException(response, statusCode, headers)
        is CopilotSpacesUpdateResourceForOrgResponse.Http422Json -> CopilotSpacesUpdateResourceForOrgApiException(response, statusCode, headers)
        is CopilotSpacesUpdateResourceForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates the metadata of a resource in a specific Copilot Space owned by an organization.
   * The authenticated user must have write permissions on the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:org` scope to use this endpoint.
   *
   * Fine-grained tokens and GitHub App user access tokens must have been granted access to the organization that owns
   * the space. They must also have been granted access to every repository referenced by resources in the space,
   * including the resource being updated.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesUpdateResourceForOrgWithResponse(
    request: InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c,
    org: String,
    spaceNumber: Int,
    spaceResourceId: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesUpdateResourceForOrgResponse> = executor.executeWithResponse<InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c, CopilotSpacesUpdateResourceForOrgResponse>(SdkExecutionRequest(copilotSpacesUpdateResourceForOrgMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESUPDATERESOURCEFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
  }), CopilotSpacesCodecs.copilotSpacesUpdateResourceForOrgRequestCodecRegistry, CopilotSpacesUpdateResourceForOrgResponseDecoder, options)

  /**
   * Updates the metadata of a resource in a specific Copilot Space owned by a user.
   * The authenticated user must have write permissions on the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:user` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CopilotSpacesUpdateResourceForUserApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CopilotSpacesUpdateResourceForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun copilotSpacesUpdateResourceForUser(
    request: InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df,
    spaceNumber: Int,
    spaceResourceId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): CopilotSpaceResource = executor.executeWithTypedErrors<InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df, CopilotSpacesUpdateResourceForUserResponse, CopilotSpaceResource>(
    request = SdkExecutionRequest(copilotSpacesUpdateResourceForUserMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESUPDATERESOURCEFORUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = CopilotSpacesCodecs.copilotSpacesUpdateResourceForUserRequestCodecRegistry,
    responseDecoder = CopilotSpacesUpdateResourceForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CopilotSpacesUpdateResourceForUserResponse.SuccessJson -> response.json
        is CopilotSpacesUpdateResourceForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateResourceForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateResourceForUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CopilotSpacesUpdateResourceForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CopilotSpacesUpdateResourceForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CopilotSpacesUpdateResourceForUserResponse.Http403Json -> CopilotSpacesUpdateResourceForUserApiException(response, statusCode, headers)
        is CopilotSpacesUpdateResourceForUserResponse.Http404Json -> CopilotSpacesUpdateResourceForUserApiException(response, statusCode, headers)
        is CopilotSpacesUpdateResourceForUserResponse.Http422Json -> CopilotSpacesUpdateResourceForUserApiException(response, statusCode, headers)
        is CopilotSpacesUpdateResourceForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates the metadata of a resource in a specific Copilot Space owned by a user.
   * The authenticated user must have write permissions on the space.
   *
   * OAuth app tokens and personal access tokens (classic) need the `write:user` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param spaceNumber The unique identifier of the Copilot Space.
   * @param spaceResourceId The unique identifier of the resource.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun copilotSpacesUpdateResourceForUserWithResponse(
    request: InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df,
    spaceNumber: Int,
    spaceResourceId: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CopilotSpacesUpdateResourceForUserResponse> = executor.executeWithResponse<InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df, CopilotSpacesUpdateResourceForUserResponse>(SdkExecutionRequest(copilotSpacesUpdateResourceForUserMetadata, baseUri, request, listOf(CopilotSpacesCodecs.COPILOTSPACESUPDATERESOURCEFORUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_number", values = listOf(spaceNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "space_resource_id", values = listOf(spaceResourceId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), CopilotSpacesCodecs.copilotSpacesUpdateResourceForUserRequestCodecRegistry, CopilotSpacesUpdateResourceForUserResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `copilot-spaces/add-collaborator-for-org` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesAddCollaboratorForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/add-collaborator-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesAddCollaboratorForOrgResponse {
    public class SuccessJson(
      public val json: CopilotSpaceCollaborator,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesAddCollaboratorForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesAddCollaboratorForOrgResponse,
        CopilotSpacesAddCollaboratorForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesAddCollaboratorForOrgResponse,
        CopilotSpacesAddCollaboratorForOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesAddCollaboratorForOrgResponse,
        CopilotSpacesAddCollaboratorForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesAddCollaboratorForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/add-collaborator-for-org` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesAddCollaboratorForOrgApiException(
    public val error: CopilotSpacesAddCollaboratorForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/add-collaborator-for-org")

  private object CopilotSpacesAddCollaboratorForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesAddCollaboratorForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesAddCollaboratorForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesAddCollaboratorForOrgResponse> = when {
      alternative.id == "copilot-spaces/add-collaborator-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesAddCollaboratorForOrgResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesAddCollaboratorForOrgResponseCodecAlternative0Registry.select(listOf("copilot-spaces/add-collaborator-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/add-collaborator-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesAddCollaboratorForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesAddCollaboratorForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/add-collaborator-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/add-collaborator-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesAddCollaboratorForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesAddCollaboratorForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/add-collaborator-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/add-collaborator-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesAddCollaboratorForOrgResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesAddCollaboratorForOrgResponseCodecAlternative3Registry.select(listOf("copilot-spaces/add-collaborator-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesAddCollaboratorForOrgResponse = CopilotSpacesAddCollaboratorForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/add-collaborator-for-user` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesAddCollaboratorForUserError

  /**
   * Typed response alternatives for `copilot-spaces/add-collaborator-for-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesAddCollaboratorForUserResponse {
    public class SuccessJson(
      public val json: CopilotSpaceCollaborator,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesAddCollaboratorForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesAddCollaboratorForUserResponse,
        CopilotSpacesAddCollaboratorForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesAddCollaboratorForUserResponse,
        CopilotSpacesAddCollaboratorForUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesAddCollaboratorForUserResponse,
        CopilotSpacesAddCollaboratorForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesAddCollaboratorForUserResponse
  }

  /**
   * Raised by `copilot-spaces/add-collaborator-for-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesAddCollaboratorForUserApiException(
    public val error: CopilotSpacesAddCollaboratorForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/add-collaborator-for-user")

  private object CopilotSpacesAddCollaboratorForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesAddCollaboratorForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesAddCollaboratorForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesAddCollaboratorForUserResponse> = when {
      alternative.id == "copilot-spaces/add-collaborator-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesAddCollaboratorForUserResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesAddCollaboratorForUserResponseCodecAlternative0Registry.select(listOf("copilot-spaces/add-collaborator-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/add-collaborator-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesAddCollaboratorForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesAddCollaboratorForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/add-collaborator-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/add-collaborator-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesAddCollaboratorForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesAddCollaboratorForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/add-collaborator-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/add-collaborator-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesAddCollaboratorForUserResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesAddCollaboratorForUserResponseCodecAlternative3Registry.select(listOf("copilot-spaces/add-collaborator-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesAddCollaboratorForUserResponse = CopilotSpacesAddCollaboratorForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/create-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotSpacesCreateForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/create-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CopilotSpacesCreateForOrgResponse {
    public class SuccessJson(
      public val json: CopilotSpace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateForOrgResponse,
        CopilotSpacesCreateForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateForOrgResponse,
        CopilotSpacesCreateForOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateForOrgResponse,
        CopilotSpacesCreateForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/create-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesCreateForOrgApiException(
    public val error: CopilotSpacesCreateForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/create-for-org")

  private object CopilotSpacesCreateForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesCreateForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesCreateForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesCreateForOrgResponse> = when {
      alternative.id == "copilot-spaces/create-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateForOrgResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesCreateForOrgResponseCodecAlternative0Registry.select(listOf("copilot-spaces/create-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/create-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/create-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateForOrgResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateForOrgResponseCodecAlternative3Registry.select(listOf("copilot-spaces/create-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesCreateForOrgResponse = CopilotSpacesCreateForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/create-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotSpacesCreateForUserError

  /**
   * Typed response alternatives for `copilot-spaces/create-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CopilotSpacesCreateForUserResponse {
    public class SuccessJson(
      public val json: CopilotSpace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateForUserResponse,
        CopilotSpacesCreateForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateForUserResponse,
        CopilotSpacesCreateForUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateForUserResponse,
        CopilotSpacesCreateForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateForUserResponse
  }

  /**
   * Raised by `copilot-spaces/create-for-user` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesCreateForUserApiException(
    public val error: CopilotSpacesCreateForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/create-for-user")

  private object CopilotSpacesCreateForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesCreateForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesCreateForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesCreateForUserResponse> = when {
      alternative.id == "copilot-spaces/create-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateForUserResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesCreateForUserResponseCodecAlternative0Registry.select(listOf("copilot-spaces/create-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/create-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/create-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateForUserResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateForUserResponseCodecAlternative3Registry.select(listOf("copilot-spaces/create-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesCreateForUserResponse = CopilotSpacesCreateForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/create-resource-for-org` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesCreateResourceForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/create-resource-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesCreateResourceForOrgResponse {
    public class SuccessJson(
      public val json: CopilotSpaceResource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForOrgResponse

    public class SuccessJson2(
      public val json: CopilotSpaceResource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForOrgResponse,
        CopilotSpacesCreateResourceForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForOrgResponse,
        CopilotSpacesCreateResourceForOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForOrgResponse,
        CopilotSpacesCreateResourceForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/create-resource-for-org` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesCreateResourceForOrgApiException(
    public val error: CopilotSpacesCreateResourceForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/create-resource-for-org")

  private object CopilotSpacesCreateResourceForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesCreateResourceForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesCreateResourceForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesCreateResourceForOrgResponse> = when {
      alternative.id == "copilot-spaces/create-resource-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateResourceForOrgResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesCreateResourceForOrgResponseCodecAlternative0Registry.select(listOf("copilot-spaces/create-resource-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-resource-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateResourceForOrgResponse.SuccessJson2(
          json = CopilotSpacesCodecs.copilotSpacesCreateResourceForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/create-resource-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-resource-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateResourceForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateResourceForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/create-resource-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-resource-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateResourceForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateResourceForOrgResponseCodecAlternative3Registry.select(listOf("copilot-spaces/create-resource-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-resource-for-org.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateResourceForOrgResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateResourceForOrgResponseCodecAlternative4Registry.select(listOf("copilot-spaces/create-resource-for-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesCreateResourceForOrgResponse = CopilotSpacesCreateResourceForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/create-resource-for-user` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesCreateResourceForUserError

  /**
   * Typed response alternatives for `copilot-spaces/create-resource-for-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesCreateResourceForUserResponse {
    public class SuccessJson(
      public val json: CopilotSpaceResource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForUserResponse

    public class SuccessJson2(
      public val json: CopilotSpaceResource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForUserResponse,
        CopilotSpacesCreateResourceForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForUserResponse,
        CopilotSpacesCreateResourceForUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForUserResponse,
        CopilotSpacesCreateResourceForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesCreateResourceForUserResponse
  }

  /**
   * Raised by `copilot-spaces/create-resource-for-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesCreateResourceForUserApiException(
    public val error: CopilotSpacesCreateResourceForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/create-resource-for-user")

  private object CopilotSpacesCreateResourceForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesCreateResourceForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesCreateResourceForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesCreateResourceForUserResponse> = when {
      alternative.id == "copilot-spaces/create-resource-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateResourceForUserResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesCreateResourceForUserResponseCodecAlternative0Registry.select(listOf("copilot-spaces/create-resource-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-resource-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateResourceForUserResponse.SuccessJson2(
          json = CopilotSpacesCodecs.copilotSpacesCreateResourceForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/create-resource-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-resource-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateResourceForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateResourceForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/create-resource-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-resource-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateResourceForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateResourceForUserResponseCodecAlternative3Registry.select(listOf("copilot-spaces/create-resource-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/create-resource-for-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotSpacesCreateResourceForUserResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesCreateResourceForUserResponseCodecAlternative4Registry.select(listOf("copilot-spaces/create-resource-for-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesCreateResourceForUserResponse = CopilotSpacesCreateResourceForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/delete-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotSpacesDeleteForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/delete-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CopilotSpacesDeleteForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteForOrgResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteForOrgResponse,
        CopilotSpacesDeleteForOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteForOrgResponse,
        CopilotSpacesDeleteForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/delete-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesDeleteForOrgApiException(
    public val error: CopilotSpacesDeleteForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/delete-for-org")

  private object CopilotSpacesDeleteForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesDeleteForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesDeleteForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesDeleteForOrgResponse> = when {
      alternative.id == "copilot-spaces/delete-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/delete-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesDeleteForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/delete-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/delete-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteForOrgResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesDeleteForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/delete-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesDeleteForOrgResponse = CopilotSpacesDeleteForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/delete-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotSpacesDeleteForUserError

  /**
   * Typed response alternatives for `copilot-spaces/delete-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CopilotSpacesDeleteForUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteForUserResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteForUserResponse,
        CopilotSpacesDeleteForUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteForUserResponse,
        CopilotSpacesDeleteForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteForUserResponse
  }

  /**
   * Raised by `copilot-spaces/delete-for-user` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesDeleteForUserApiException(
    public val error: CopilotSpacesDeleteForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/delete-for-user")

  private object CopilotSpacesDeleteForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesDeleteForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesDeleteForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesDeleteForUserResponse> = when {
      alternative.id == "copilot-spaces/delete-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteForUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/delete-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesDeleteForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/delete-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/delete-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteForUserResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesDeleteForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/delete-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesDeleteForUserResponse = CopilotSpacesDeleteForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/delete-resource-for-org` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesDeleteResourceForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/delete-resource-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesDeleteResourceForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteResourceForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteResourceForOrgResponse,
        CopilotSpacesDeleteResourceForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteResourceForOrgResponse,
        CopilotSpacesDeleteResourceForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteResourceForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/delete-resource-for-org` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesDeleteResourceForOrgApiException(
    public val error: CopilotSpacesDeleteResourceForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/delete-resource-for-org")

  private object CopilotSpacesDeleteResourceForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesDeleteResourceForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesDeleteResourceForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesDeleteResourceForOrgResponse> = when {
      alternative.id == "copilot-spaces/delete-resource-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteResourceForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/delete-resource-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteResourceForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesDeleteResourceForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/delete-resource-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/delete-resource-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteResourceForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesDeleteResourceForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/delete-resource-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesDeleteResourceForOrgResponse = CopilotSpacesDeleteResourceForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/delete-resource-for-user` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesDeleteResourceForUserError

  /**
   * Typed response alternatives for `copilot-spaces/delete-resource-for-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesDeleteResourceForUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteResourceForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteResourceForUserResponse,
        CopilotSpacesDeleteResourceForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteResourceForUserResponse,
        CopilotSpacesDeleteResourceForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesDeleteResourceForUserResponse
  }

  /**
   * Raised by `copilot-spaces/delete-resource-for-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesDeleteResourceForUserApiException(
    public val error: CopilotSpacesDeleteResourceForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/delete-resource-for-user")

  private object CopilotSpacesDeleteResourceForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesDeleteResourceForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesDeleteResourceForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesDeleteResourceForUserResponse> = when {
      alternative.id == "copilot-spaces/delete-resource-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteResourceForUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/delete-resource-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteResourceForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesDeleteResourceForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/delete-resource-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/delete-resource-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesDeleteResourceForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesDeleteResourceForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/delete-resource-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesDeleteResourceForUserResponse = CopilotSpacesDeleteResourceForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/get-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotSpacesGetForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/get-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CopilotSpacesGetForOrgResponse {
    public class SuccessJson(
      public val json: CopilotSpace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetForOrgResponse,
        CopilotSpacesGetForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetForOrgResponse,
        CopilotSpacesGetForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/get-for-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesGetForOrgApiException(
    public val error: CopilotSpacesGetForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/get-for-org")

  private object CopilotSpacesGetForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesGetForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesGetForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesGetForOrgResponse> = when {
      alternative.id == "copilot-spaces/get-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetForOrgResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesGetForOrgResponseCodecAlternative0Registry.select(listOf("copilot-spaces/get-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/get-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesGetForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/get-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/get-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesGetForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/get-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesGetForOrgResponse = CopilotSpacesGetForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/get-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotSpacesGetForUserError

  /**
   * Typed response alternatives for `copilot-spaces/get-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CopilotSpacesGetForUserResponse {
    public class SuccessJson(
      public val json: CopilotSpace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetForUserResponse,
        CopilotSpacesGetForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetForUserResponse,
        CopilotSpacesGetForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetForUserResponse
  }

  /**
   * Raised by `copilot-spaces/get-for-user` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesGetForUserApiException(
    public val error: CopilotSpacesGetForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/get-for-user")

  private object CopilotSpacesGetForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesGetForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesGetForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesGetForUserResponse> = when {
      alternative.id == "copilot-spaces/get-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetForUserResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesGetForUserResponseCodecAlternative0Registry.select(listOf("copilot-spaces/get-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/get-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesGetForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/get-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/get-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesGetForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/get-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesGetForUserResponse = CopilotSpacesGetForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/get-resource-for-org` may expose through its typed
   * API exception.
   */
  public sealed interface CopilotSpacesGetResourceForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/get-resource-for-org`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CopilotSpacesGetResourceForOrgResponse {
    public class SuccessJson(
      public val json: CopilotSpaceResource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetResourceForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetResourceForOrgResponse,
        CopilotSpacesGetResourceForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetResourceForOrgResponse,
        CopilotSpacesGetResourceForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetResourceForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/get-resource-for-org` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesGetResourceForOrgApiException(
    public val error: CopilotSpacesGetResourceForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/get-resource-for-org")

  private object CopilotSpacesGetResourceForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesGetResourceForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesGetResourceForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesGetResourceForOrgResponse> = when {
      alternative.id == "copilot-spaces/get-resource-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetResourceForOrgResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesGetResourceForOrgResponseCodecAlternative0Registry.select(listOf("copilot-spaces/get-resource-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/get-resource-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetResourceForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesGetResourceForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/get-resource-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/get-resource-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetResourceForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesGetResourceForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/get-resource-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesGetResourceForOrgResponse = CopilotSpacesGetResourceForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/get-resource-for-user` may expose through its typed
   * API exception.
   */
  public sealed interface CopilotSpacesGetResourceForUserError

  /**
   * Typed response alternatives for `copilot-spaces/get-resource-for-user`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CopilotSpacesGetResourceForUserResponse {
    public class SuccessJson(
      public val json: CopilotSpaceResource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetResourceForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetResourceForUserResponse,
        CopilotSpacesGetResourceForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetResourceForUserResponse,
        CopilotSpacesGetResourceForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesGetResourceForUserResponse
  }

  /**
   * Raised by `copilot-spaces/get-resource-for-user` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesGetResourceForUserApiException(
    public val error: CopilotSpacesGetResourceForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/get-resource-for-user")

  private object CopilotSpacesGetResourceForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesGetResourceForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesGetResourceForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesGetResourceForUserResponse> = when {
      alternative.id == "copilot-spaces/get-resource-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetResourceForUserResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesGetResourceForUserResponseCodecAlternative0Registry.select(listOf("copilot-spaces/get-resource-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/get-resource-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetResourceForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesGetResourceForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/get-resource-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/get-resource-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesGetResourceForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesGetResourceForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/get-resource-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesGetResourceForUserResponse = CopilotSpacesGetResourceForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/list-collaborators-for-org` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesListCollaboratorsForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/list-collaborators-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesListCollaboratorsForOrgResponse {
    public class SuccessJson(
      public val json: InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListCollaboratorsForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListCollaboratorsForOrgResponse,
        CopilotSpacesListCollaboratorsForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListCollaboratorsForOrgResponse,
        CopilotSpacesListCollaboratorsForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListCollaboratorsForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/list-collaborators-for-org` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesListCollaboratorsForOrgApiException(
    public val error: CopilotSpacesListCollaboratorsForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/list-collaborators-for-org")

  private object CopilotSpacesListCollaboratorsForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesListCollaboratorsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesListCollaboratorsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesListCollaboratorsForOrgResponse> = when {
      alternative.id == "copilot-spaces/list-collaborators-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesListCollaboratorsForOrgResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesListCollaboratorsForOrgResponseCodecAlternative0Registry.select(listOf("copilot-spaces/list-collaborators-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-collaborators-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesListCollaboratorsForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesListCollaboratorsForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/list-collaborators-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-collaborators-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesListCollaboratorsForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesListCollaboratorsForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/list-collaborators-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesListCollaboratorsForOrgResponse = CopilotSpacesListCollaboratorsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/list-collaborators-for-user` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesListCollaboratorsForUserError

  /**
   * Typed response alternatives for `copilot-spaces/list-collaborators-for-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesListCollaboratorsForUserResponse {
    public class SuccessJson(
      public val json: InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListCollaboratorsForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListCollaboratorsForUserResponse,
        CopilotSpacesListCollaboratorsForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListCollaboratorsForUserResponse,
        CopilotSpacesListCollaboratorsForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListCollaboratorsForUserResponse
  }

  /**
   * Raised by `copilot-spaces/list-collaborators-for-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesListCollaboratorsForUserApiException(
    public val error: CopilotSpacesListCollaboratorsForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/list-collaborators-for-user")

  private object CopilotSpacesListCollaboratorsForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesListCollaboratorsForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesListCollaboratorsForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesListCollaboratorsForUserResponse> = when {
      alternative.id == "copilot-spaces/list-collaborators-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesListCollaboratorsForUserResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesListCollaboratorsForUserResponseCodecAlternative0Registry.select(listOf("copilot-spaces/list-collaborators-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-collaborators-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesListCollaboratorsForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesListCollaboratorsForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/list-collaborators-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-collaborators-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesListCollaboratorsForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesListCollaboratorsForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/list-collaborators-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesListCollaboratorsForUserResponse = CopilotSpacesListCollaboratorsForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/list-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotSpacesListForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/list-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CopilotSpacesListForOrgResponse {
    public class SuccessJson(
      public val json: InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListForOrgResponse,
        CopilotSpacesListForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListForOrgResponse,
        CopilotSpacesListForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/list-for-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesListForOrgApiException(
    public val error: CopilotSpacesListForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/list-for-org")

  private object CopilotSpacesListForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesListForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesListForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesListForOrgResponse> = when {
      alternative.id == "copilot-spaces/list-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesListForOrgResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesListForOrgResponseCodecAlternative0Registry.select(listOf("copilot-spaces/list-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesListForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesListForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/list-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesListForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesListForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/list-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesListForOrgResponse = CopilotSpacesListForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/list-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotSpacesListForUserError

  /**
   * Typed response alternatives for `copilot-spaces/list-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CopilotSpacesListForUserResponse {
    public class SuccessJson(
      public val json: InlineUsersCopilotSpacesGetResponse200JsonXc06296f1,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListForUserResponse,
        CopilotSpacesListForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListForUserResponse,
        CopilotSpacesListForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListForUserResponse
  }

  /**
   * Raised by `copilot-spaces/list-for-user` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesListForUserApiException(
    public val error: CopilotSpacesListForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/list-for-user")

  private object CopilotSpacesListForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesListForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesListForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesListForUserResponse> = when {
      alternative.id == "copilot-spaces/list-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesListForUserResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesListForUserResponseCodecAlternative0Registry.select(listOf("copilot-spaces/list-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesListForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesListForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/list-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesListForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesListForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/list-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesListForUserResponse = CopilotSpacesListForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/list-resources-for-org` may expose through its typed
   * API exception.
   */
  public sealed interface CopilotSpacesListResourcesForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/list-resources-for-org`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CopilotSpacesListResourcesForOrgResponse {
    public class SuccessJson(
      public val json: InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListResourcesForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListResourcesForOrgResponse,
        CopilotSpacesListResourcesForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListResourcesForOrgResponse,
        CopilotSpacesListResourcesForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListResourcesForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/list-resources-for-org` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesListResourcesForOrgApiException(
    public val error: CopilotSpacesListResourcesForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/list-resources-for-org")

  private object CopilotSpacesListResourcesForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesListResourcesForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesListResourcesForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesListResourcesForOrgResponse> = when {
      alternative.id == "copilot-spaces/list-resources-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesListResourcesForOrgResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesListResourcesForOrgResponseCodecAlternative0Registry.select(listOf("copilot-spaces/list-resources-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-resources-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesListResourcesForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesListResourcesForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/list-resources-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-resources-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesListResourcesForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesListResourcesForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/list-resources-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesListResourcesForOrgResponse = CopilotSpacesListResourcesForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/list-resources-for-user` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesListResourcesForUserError

  /**
   * Typed response alternatives for `copilot-spaces/list-resources-for-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesListResourcesForUserResponse {
    public class SuccessJson(
      public val json: InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListResourcesForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListResourcesForUserResponse,
        CopilotSpacesListResourcesForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListResourcesForUserResponse,
        CopilotSpacesListResourcesForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesListResourcesForUserResponse
  }

  /**
   * Raised by `copilot-spaces/list-resources-for-user` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesListResourcesForUserApiException(
    public val error: CopilotSpacesListResourcesForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/list-resources-for-user")

  private object CopilotSpacesListResourcesForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesListResourcesForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesListResourcesForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesListResourcesForUserResponse> = when {
      alternative.id == "copilot-spaces/list-resources-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesListResourcesForUserResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesListResourcesForUserResponseCodecAlternative0Registry.select(listOf("copilot-spaces/list-resources-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-resources-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesListResourcesForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesListResourcesForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/list-resources-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/list-resources-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesListResourcesForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesListResourcesForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/list-resources-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesListResourcesForUserResponse = CopilotSpacesListResourcesForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/remove-collaborator-for-org` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesRemoveCollaboratorForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/remove-collaborator-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesRemoveCollaboratorForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesRemoveCollaboratorForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesRemoveCollaboratorForOrgResponse,
        CopilotSpacesRemoveCollaboratorForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesRemoveCollaboratorForOrgResponse,
        CopilotSpacesRemoveCollaboratorForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesRemoveCollaboratorForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/remove-collaborator-for-org` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesRemoveCollaboratorForOrgApiException(
    public val error: CopilotSpacesRemoveCollaboratorForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/remove-collaborator-for-org")

  private object CopilotSpacesRemoveCollaboratorForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesRemoveCollaboratorForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesRemoveCollaboratorForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesRemoveCollaboratorForOrgResponse> = when {
      alternative.id == "copilot-spaces/remove-collaborator-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesRemoveCollaboratorForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/remove-collaborator-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesRemoveCollaboratorForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesRemoveCollaboratorForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/remove-collaborator-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/remove-collaborator-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesRemoveCollaboratorForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesRemoveCollaboratorForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/remove-collaborator-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesRemoveCollaboratorForOrgResponse = CopilotSpacesRemoveCollaboratorForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/remove-collaborator-for-user` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesRemoveCollaboratorForUserError

  /**
   * Typed response alternatives for `copilot-spaces/remove-collaborator-for-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesRemoveCollaboratorForUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesRemoveCollaboratorForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesRemoveCollaboratorForUserResponse,
        CopilotSpacesRemoveCollaboratorForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesRemoveCollaboratorForUserResponse,
        CopilotSpacesRemoveCollaboratorForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesRemoveCollaboratorForUserResponse
  }

  /**
   * Raised by `copilot-spaces/remove-collaborator-for-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesRemoveCollaboratorForUserApiException(
    public val error: CopilotSpacesRemoveCollaboratorForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/remove-collaborator-for-user")

  private object CopilotSpacesRemoveCollaboratorForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesRemoveCollaboratorForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesRemoveCollaboratorForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesRemoveCollaboratorForUserResponse> = when {
      alternative.id == "copilot-spaces/remove-collaborator-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesRemoveCollaboratorForUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/remove-collaborator-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesRemoveCollaboratorForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesRemoveCollaboratorForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/remove-collaborator-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/remove-collaborator-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesRemoveCollaboratorForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesRemoveCollaboratorForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/remove-collaborator-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesRemoveCollaboratorForUserResponse = CopilotSpacesRemoveCollaboratorForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `copilot-spaces/update-collaborator-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesUpdateCollaboratorForOrgResponse {
    public class SuccessJson(
      public val json: CopilotSpaceCollaborator,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForOrgResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForOrgResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForOrgResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForOrgResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForOrgResponse
  }

  private object CopilotSpacesUpdateCollaboratorForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesUpdateCollaboratorForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesUpdateCollaboratorForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesUpdateCollaboratorForOrgResponse> = when {
      alternative.id == "copilot-spaces/update-collaborator-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateCollaboratorForOrgResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative0Registry.select(listOf("copilot-spaces/update-collaborator-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-collaborator-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateCollaboratorForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-collaborator-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateCollaboratorForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/update-collaborator-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-collaborator-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateCollaboratorForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative3Registry.select(listOf("copilot-spaces/update-collaborator-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-collaborator-for-org.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateCollaboratorForOrgResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateCollaboratorForOrgResponseCodecAlternative4Registry.select(listOf("copilot-spaces/update-collaborator-for-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesUpdateCollaboratorForOrgResponse = CopilotSpacesUpdateCollaboratorForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `copilot-spaces/update-collaborator-for-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesUpdateCollaboratorForUserResponse {
    public class SuccessJson(
      public val json: CopilotSpaceCollaborator,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForUserResponse

    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForUserResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForUserResponse

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateCollaboratorForUserResponse
  }

  private object CopilotSpacesUpdateCollaboratorForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesUpdateCollaboratorForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesUpdateCollaboratorForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesUpdateCollaboratorForUserResponse> = when {
      alternative.id == "copilot-spaces/update-collaborator-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateCollaboratorForUserResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative0Registry.select(listOf("copilot-spaces/update-collaborator-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-collaborator-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateCollaboratorForUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-collaborator-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateCollaboratorForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/update-collaborator-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-collaborator-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateCollaboratorForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative3Registry.select(listOf("copilot-spaces/update-collaborator-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-collaborator-for-user.response.alternative4" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateCollaboratorForUserResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateCollaboratorForUserResponseCodecAlternative4Registry.select(listOf("copilot-spaces/update-collaborator-for-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesUpdateCollaboratorForUserResponse = CopilotSpacesUpdateCollaboratorForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/update-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotSpacesUpdateForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/update-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CopilotSpacesUpdateForOrgResponse {
    public class SuccessJson(
      public val json: CopilotSpace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateForOrgResponse,
        CopilotSpacesUpdateForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateForOrgResponse,
        CopilotSpacesUpdateForOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateForOrgResponse,
        CopilotSpacesUpdateForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/update-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesUpdateForOrgApiException(
    public val error: CopilotSpacesUpdateForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/update-for-org")

  private object CopilotSpacesUpdateForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesUpdateForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesUpdateForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesUpdateForOrgResponse> = when {
      alternative.id == "copilot-spaces/update-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateForOrgResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesUpdateForOrgResponseCodecAlternative0Registry.select(listOf("copilot-spaces/update-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/update-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/update-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateForOrgResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateForOrgResponseCodecAlternative3Registry.select(listOf("copilot-spaces/update-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesUpdateForOrgResponse = CopilotSpacesUpdateForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/update-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface CopilotSpacesUpdateForUserError

  /**
   * Typed response alternatives for `copilot-spaces/update-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CopilotSpacesUpdateForUserResponse {
    public class SuccessJson(
      public val json: CopilotSpace,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateForUserResponse,
        CopilotSpacesUpdateForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateForUserResponse,
        CopilotSpacesUpdateForUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateForUserResponse,
        CopilotSpacesUpdateForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateForUserResponse
  }

  /**
   * Raised by `copilot-spaces/update-for-user` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesUpdateForUserApiException(
    public val error: CopilotSpacesUpdateForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/update-for-user")

  private object CopilotSpacesUpdateForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesUpdateForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesUpdateForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesUpdateForUserResponse> = when {
      alternative.id == "copilot-spaces/update-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateForUserResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesUpdateForUserResponseCodecAlternative0Registry.select(listOf("copilot-spaces/update-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/update-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/update-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateForUserResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateForUserResponseCodecAlternative3Registry.select(listOf("copilot-spaces/update-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesUpdateForUserResponse = CopilotSpacesUpdateForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/update-resource-for-org` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesUpdateResourceForOrgError

  /**
   * Typed response alternatives for `copilot-spaces/update-resource-for-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesUpdateResourceForOrgResponse {
    public class SuccessJson(
      public val json: CopilotSpaceResource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateResourceForOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateResourceForOrgResponse,
        CopilotSpacesUpdateResourceForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateResourceForOrgResponse,
        CopilotSpacesUpdateResourceForOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateResourceForOrgResponse,
        CopilotSpacesUpdateResourceForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateResourceForOrgResponse
  }

  /**
   * Raised by `copilot-spaces/update-resource-for-org` after decoding a declared non-success response. [error] is typed
   * and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesUpdateResourceForOrgApiException(
    public val error: CopilotSpacesUpdateResourceForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/update-resource-for-org")

  private object CopilotSpacesUpdateResourceForOrgResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesUpdateResourceForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesUpdateResourceForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesUpdateResourceForOrgResponse> = when {
      alternative.id == "copilot-spaces/update-resource-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateResourceForOrgResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesUpdateResourceForOrgResponseCodecAlternative0Registry.select(listOf("copilot-spaces/update-resource-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-resource-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateResourceForOrgResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateResourceForOrgResponseCodecAlternative1Registry.select(listOf("copilot-spaces/update-resource-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-resource-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateResourceForOrgResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateResourceForOrgResponseCodecAlternative2Registry.select(listOf("copilot-spaces/update-resource-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-resource-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateResourceForOrgResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateResourceForOrgResponseCodecAlternative3Registry.select(listOf("copilot-spaces/update-resource-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesUpdateResourceForOrgResponse = CopilotSpacesUpdateResourceForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `copilot-spaces/update-resource-for-user` may expose through its
   * typed API exception.
   */
  public sealed interface CopilotSpacesUpdateResourceForUserError

  /**
   * Typed response alternatives for `copilot-spaces/update-resource-for-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CopilotSpacesUpdateResourceForUserResponse {
    public class SuccessJson(
      public val json: CopilotSpaceResource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateResourceForUserResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateResourceForUserResponse,
        CopilotSpacesUpdateResourceForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateResourceForUserResponse,
        CopilotSpacesUpdateResourceForUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateResourceForUserResponse,
        CopilotSpacesUpdateResourceForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CopilotSpacesUpdateResourceForUserResponse
  }

  /**
   * Raised by `copilot-spaces/update-resource-for-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CopilotSpacesUpdateResourceForUserApiException(
    public val error: CopilotSpacesUpdateResourceForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "copilot-spaces/update-resource-for-user")

  private object CopilotSpacesUpdateResourceForUserResponseDecoder : SdkResponseAlternativeDecoder<CopilotSpacesUpdateResourceForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CopilotSpacesUpdateResourceForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CopilotSpacesUpdateResourceForUserResponse> = when {
      alternative.id == "copilot-spaces/update-resource-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateResourceForUserResponse.SuccessJson(
          json = CopilotSpacesCodecs.copilotSpacesUpdateResourceForUserResponseCodecAlternative0Registry.select(listOf("copilot-spaces/update-resource-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-resource-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateResourceForUserResponse.Http403Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateResourceForUserResponseCodecAlternative1Registry.select(listOf("copilot-spaces/update-resource-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-resource-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateResourceForUserResponse.Http404Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateResourceForUserResponseCodecAlternative2Registry.select(listOf("copilot-spaces/update-resource-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "copilot-spaces/update-resource-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = CopilotSpacesUpdateResourceForUserResponse.Http422Json(
          json = CopilotSpacesCodecs.copilotSpacesUpdateResourceForUserResponseCodecAlternative3Registry.select(listOf("copilot-spaces/update-resource-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CopilotSpacesUpdateResourceForUserResponse = CopilotSpacesUpdateResourceForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val copilotSpacesAddCollaboratorForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/add-collaborator-for-org",
          method = "POST",
          path = "/orgs/{org}/copilot-spaces/{space_number}/collaborators",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceCollaborator",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/add-collaborator-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/add-collaborator-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/add-collaborator-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/add-collaborator-for-org.response.alternative3",
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

    internal val copilotSpacesAddCollaboratorForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/add-collaborator-for-user",
          method = "POST",
          path = "/users/{username}/copilot-spaces/{space_number}/collaborators",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceCollaborator",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/add-collaborator-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/add-collaborator-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/add-collaborator-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/add-collaborator-for-user.response.alternative3",
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

    internal val copilotSpacesCreateForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/create-for-org",
          method = "POST",
          path = "/orgs/{org}/copilot-spaces",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpace",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-for-org.response.alternative3",
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

    internal val copilotSpacesCreateForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/create-for-user",
          method = "POST",
          path = "/users/{username}/copilot-spaces",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpace",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-for-user.response.alternative3",
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

    internal val copilotSpacesCreateResourceForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/create-resource-for-org",
          method = "POST",
          path = "/orgs/{org}/copilot-spaces/{space_number}/resources",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceResource",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-resource-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceResource",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-resource-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-resource-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-resource-for-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-resource-for-org.response.alternative4",
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

    internal val copilotSpacesCreateResourceForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/create-resource-for-user",
          method = "POST",
          path = "/users/{username}/copilot-spaces/{space_number}/resources",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceResource",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-resource-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceResource",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-resource-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-resource-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-resource-for-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/create-resource-for-user.response.alternative4",
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

    internal val copilotSpacesDeleteForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/delete-for-org",
          method = "DELETE",
          path = "/orgs/{org}/copilot-spaces/{space_number}",
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
              id = "copilot-spaces/delete-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/delete-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/delete-for-org.response.alternative2",
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

    internal val copilotSpacesDeleteForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/delete-for-user",
          method = "DELETE",
          path = "/users/{username}/copilot-spaces/{space_number}",
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
              id = "copilot-spaces/delete-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/delete-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/delete-for-user.response.alternative2",
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

    internal val copilotSpacesDeleteResourceForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/delete-resource-for-org",
          method = "DELETE",
          path = "/orgs/{org}/copilot-spaces/{space_number}/resources/{space_resource_id}",
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
              id = "copilot-spaces/delete-resource-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/delete-resource-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/delete-resource-for-org.response.alternative2",
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

    internal val copilotSpacesDeleteResourceForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/delete-resource-for-user",
          method = "DELETE",
          path = "/users/{username}/copilot-spaces/{space_number}/resources/{space_resource_id}",
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
              id = "copilot-spaces/delete-resource-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/delete-resource-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/delete-resource-for-user.response.alternative2",
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

    internal val copilotSpacesGetForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/get-for-org",
          method = "GET",
          path = "/orgs/{org}/copilot-spaces/{space_number}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpace",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-for-org.response.alternative2",
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

    internal val copilotSpacesGetForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/get-for-user",
          method = "GET",
          path = "/users/{username}/copilot-spaces/{space_number}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpace",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-for-user.response.alternative2",
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

    internal val copilotSpacesGetResourceForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/get-resource-for-org",
          method = "GET",
          path = "/orgs/{org}/copilot-spaces/{space_number}/resources/{space_resource_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceResource",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-resource-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-resource-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-resource-for-org.response.alternative2",
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

    internal val copilotSpacesGetResourceForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/get-resource-for-user",
          method = "GET",
          path = "/users/{username}/copilot-spaces/{space_number}/resources/{space_resource_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceResource",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-resource-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-resource-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/get-resource-for-user.response.alternative2",
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

    internal val copilotSpacesListCollaboratorsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/list-collaborators-for-org",
          method = "GET",
          path = "/orgs/{org}/copilot-spaces/{space_number}/collaborators",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCopilotSpacesCollaboratorsGetResponse200JsonX22ddadd6",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-collaborators-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-collaborators-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-collaborators-for-org.response.alternative2",
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

    internal val copilotSpacesListCollaboratorsForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/list-collaborators-for-user",
          method = "GET",
          path = "/users/{username}/copilot-spaces/{space_number}/collaborators",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUsersCopilotSpacesCollaboratorsGetResponse200JsonX00b0a846",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-collaborators-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-collaborators-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-collaborators-for-user.response.alternative2",
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

    internal val copilotSpacesListForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/list-for-org",
          method = "GET",
          path = "/orgs/{org}/copilot-spaces",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCopilotSpacesGetResponse200JsonX30d564cc",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-for-org.response.alternative2",
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

    internal val copilotSpacesListForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/list-for-user",
          method = "GET",
          path = "/users/{username}/copilot-spaces",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUsersCopilotSpacesGetResponse200JsonXc06296f1",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-for-user.response.alternative2",
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

    internal val copilotSpacesListResourcesForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/list-resources-for-org",
          method = "GET",
          path = "/orgs/{org}/copilot-spaces/{space_number}/resources",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineOrgsCopilotSpacesResourcesGetResponse200JsonX2e7ef50a",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-resources-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-resources-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-resources-for-org.response.alternative2",
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

    internal val copilotSpacesListResourcesForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/list-resources-for-user",
          method = "GET",
          path = "/users/{username}/copilot-spaces/{space_number}/resources",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineUsersCopilotSpacesResourcesGetResponse200JsonX867cfb5a",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-resources-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-resources-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/list-resources-for-user.response.alternative2",
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

    internal val copilotSpacesRemoveCollaboratorForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/remove-collaborator-for-org",
          method = "DELETE",
          path = "/orgs/{org}/copilot-spaces/{space_number}/collaborators/{actor_type}/{actor_identifier}",
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
              id = "copilot-spaces/remove-collaborator-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/remove-collaborator-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/remove-collaborator-for-org.response.alternative2",
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

    internal val copilotSpacesRemoveCollaboratorForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/remove-collaborator-for-user",
          method = "DELETE",
          path = "/users/{username}/copilot-spaces/{space_number}/collaborators/{actor_type}/{actor_identifier}",
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
              id = "copilot-spaces/remove-collaborator-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/remove-collaborator-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/remove-collaborator-for-user.response.alternative2",
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

    internal val copilotSpacesUpdateCollaboratorForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/update-collaborator-for-org",
          method = "PUT",
          path = "/orgs/{org}/copilot-spaces/{space_number}/collaborators/{actor_type}/{actor_identifier}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceCollaborator",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-collaborator-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-collaborator-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-collaborator-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-collaborator-for-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-collaborator-for-org.response.alternative4",
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

    internal val copilotSpacesUpdateCollaboratorForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/update-collaborator-for-user",
          method = "PUT",
          path = "/users/{username}/copilot-spaces/{space_number}/collaborators/{actor_type}/{actor_identifier}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200, 204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceCollaborator",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-collaborator-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-collaborator-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-collaborator-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-collaborator-for-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-collaborator-for-user.response.alternative4",
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

    internal val copilotSpacesUpdateForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/update-for-org",
          method = "PUT",
          path = "/orgs/{org}/copilot-spaces/{space_number}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpace",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-for-org.response.alternative3",
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

    internal val copilotSpacesUpdateForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/update-for-user",
          method = "PUT",
          path = "/users/{username}/copilot-spaces/{space_number}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpace",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-for-user.response.alternative3",
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

    internal val copilotSpacesUpdateResourceForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/update-resource-for-org",
          method = "PUT",
          path = "/orgs/{org}/copilot-spaces/{space_number}/resources/{space_resource_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceResource",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-resource-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-resource-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-resource-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-resource-for-org.response.alternative3",
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

    internal val copilotSpacesUpdateResourceForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "copilot-spaces/update-resource-for-user",
          method = "PUT",
          path = "/users/{username}/copilot-spaces/{space_number}/resources/{space_resource_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CopilotSpaceResource",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-resource-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-resource-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-resource-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "copilot-spaces/update-resource-for-user.response.alternative3",
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
  }
}
