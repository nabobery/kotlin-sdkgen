package io.github.nabobery.sdkgen.github.generated.projects

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
import com.nabobery.sdkgen.runtime.sdkPrimitiveUnionParameterValues
import io.github.nabobery.sdkgen.github.generated.BasicError
import io.github.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2FieldsPostRequestJsonXe4a0d1be
import io.github.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2FieldsPostRequestJsonXe4a0d1beSerializer
import io.github.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2ItemsGetParameterX9175a229
import io.github.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2ItemsGetParameterXef349106
import io.github.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e
import io.github.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2ViewsItemsGetParameterX00ebcf3e
import io.github.nabobery.sdkgen.github.generated.InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b
import io.github.nabobery.sdkgen.github.generated.InlineUsersProjectsV2FieldsPostRequestJsonXcca31777
import io.github.nabobery.sdkgen.github.generated.InlineUsersProjectsV2FieldsPostRequestJsonXcca31777Serializer
import io.github.nabobery.sdkgen.github.generated.InlineUsersProjectsV2ItemsGetParameterX18bfa365
import io.github.nabobery.sdkgen.github.generated.InlineUsersProjectsV2ItemsGetParameterX7b856da4
import io.github.nabobery.sdkgen.github.generated.InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e
import io.github.nabobery.sdkgen.github.generated.InlineUsersProjectsV2ViewsItemsGetParameterXbd5b66da
import io.github.nabobery.sdkgen.github.generated.InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6
import io.github.nabobery.sdkgen.github.generated.ProjectsV2
import io.github.nabobery.sdkgen.github.generated.ProjectsV2Field
import io.github.nabobery.sdkgen.github.generated.ProjectsV2ItemWithContent
import io.github.nabobery.sdkgen.github.generated.ProjectsV2View
import io.github.nabobery.sdkgen.github.generated.SdkJson
import io.github.nabobery.sdkgen.github.generated.ValidationError
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer

internal object ProjectsCodecs {
  internal const val PROJECTSADDFIELDFORORG_REQUEST_CODEC_ID: String =
      "projects/add-field-for-org.request"

  private val projectsAddFieldForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsProjectsV2FieldsPostRequestJsonXe4a0d1be> =
      KotlinxSerializationCodec(PROJECTSADDFIELDFORORG_REQUEST_CODEC_ID, InlineOrgsProjectsV2FieldsPostRequestJsonXe4a0d1beSerializer, SdkJson)

  internal const val PROJECTSADDFIELDFORORG_RESPONSE_CODEC_ID: String =
      "projects/add-field-for-org.response"

  private val projectsAddFieldForOrgResponseCodec: MediaTypeCodec<ProjectsV2Field> =
      KotlinxSerializationCodec(PROJECTSADDFIELDFORORG_RESPONSE_CODEC_ID, ProjectsV2Field.Serializer, SdkJson)

  private val projectsAddFieldForOrgResponseCodecAlternative0Codec: MediaTypeCodec<ProjectsV2Field>
      =
      KotlinxSerializationCodec("projects/add-field-for-org.response.alternative0", ProjectsV2Field.Serializer, SdkJson)

  internal val projectsAddFieldForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2Field> =
      MediaTypeCodecRegistry.of(projectsAddFieldForOrgResponseCodecAlternative0Codec)

  private val projectsAddFieldForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/add-field-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsAddFieldForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsAddFieldForOrgResponseCodecAlternative2Codec)

  private val projectsAddFieldForOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/add-field-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsAddFieldForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsAddFieldForOrgResponseCodecAlternative3Codec)

  private val projectsAddFieldForOrgResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError>
      =
      KotlinxSerializationCodec("projects/add-field-for-org.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val projectsAddFieldForOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(projectsAddFieldForOrgResponseCodecAlternative4Codec)

  internal val projectsAddFieldForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsProjectsV2FieldsPostRequestJsonXe4a0d1be> =
      MediaTypeCodecRegistry.of(projectsAddFieldForOrgRequestCodec)

  internal val projectsAddFieldForOrgResponseCodecRegistry: MediaTypeCodecRegistry<ProjectsV2Field>
      = MediaTypeCodecRegistry.of(projectsAddFieldForOrgResponseCodec)

  internal const val PROJECTSADDFIELDFORUSER_REQUEST_CODEC_ID: String =
      "projects/add-field-for-user.request"

  private val projectsAddFieldForUserRequestCodec:
      MediaTypeCodec<InlineUsersProjectsV2FieldsPostRequestJsonXcca31777> =
      KotlinxSerializationCodec(PROJECTSADDFIELDFORUSER_REQUEST_CODEC_ID, InlineUsersProjectsV2FieldsPostRequestJsonXcca31777Serializer, SdkJson)

  internal const val PROJECTSADDFIELDFORUSER_RESPONSE_CODEC_ID: String =
      "projects/add-field-for-user.response"

  private val projectsAddFieldForUserResponseCodec: MediaTypeCodec<ProjectsV2Field> =
      KotlinxSerializationCodec(PROJECTSADDFIELDFORUSER_RESPONSE_CODEC_ID, ProjectsV2Field.Serializer, SdkJson)

  private val projectsAddFieldForUserResponseCodecAlternative0Codec: MediaTypeCodec<ProjectsV2Field>
      =
      KotlinxSerializationCodec("projects/add-field-for-user.response.alternative0", ProjectsV2Field.Serializer, SdkJson)

  internal val projectsAddFieldForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2Field> =
      MediaTypeCodecRegistry.of(projectsAddFieldForUserResponseCodecAlternative0Codec)

  private val projectsAddFieldForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/add-field-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsAddFieldForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsAddFieldForUserResponseCodecAlternative2Codec)

  private val projectsAddFieldForUserResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/add-field-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsAddFieldForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsAddFieldForUserResponseCodecAlternative3Codec)

  private val projectsAddFieldForUserResponseCodecAlternative4Codec: MediaTypeCodec<ValidationError>
      =
      KotlinxSerializationCodec("projects/add-field-for-user.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val projectsAddFieldForUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(projectsAddFieldForUserResponseCodecAlternative4Codec)

  internal val projectsAddFieldForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersProjectsV2FieldsPostRequestJsonXcca31777> =
      MediaTypeCodecRegistry.of(projectsAddFieldForUserRequestCodec)

  internal val projectsAddFieldForUserResponseCodecRegistry: MediaTypeCodecRegistry<ProjectsV2Field>
      = MediaTypeCodecRegistry.of(projectsAddFieldForUserResponseCodec)

  internal const val PROJECTSCREATEVIEWFORORG_REQUEST_CODEC_ID: String =
      "projects/create-view-for-org.request"

  private val projectsCreateViewForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b> =
      KotlinxSerializationCodec(PROJECTSCREATEVIEWFORORG_REQUEST_CODEC_ID, InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b.Serializer, SdkJson)

  internal const val PROJECTSCREATEVIEWFORORG_RESPONSE_CODEC_ID: String =
      "projects/create-view-for-org.response"

  private val projectsCreateViewForOrgResponseCodec: MediaTypeCodec<ProjectsV2View> =
      KotlinxSerializationCodec(PROJECTSCREATEVIEWFORORG_RESPONSE_CODEC_ID, ProjectsV2View.Serializer, SdkJson)

  private val projectsCreateViewForOrgResponseCodecAlternative0Codec: MediaTypeCodec<ProjectsV2View>
      =
      KotlinxSerializationCodec("projects/create-view-for-org.response.alternative0", ProjectsV2View.Serializer, SdkJson)

  internal val projectsCreateViewForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2View> =
      MediaTypeCodecRegistry.of(projectsCreateViewForOrgResponseCodecAlternative0Codec)

  private val projectsCreateViewForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/create-view-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsCreateViewForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsCreateViewForOrgResponseCodecAlternative2Codec)

  private val projectsCreateViewForOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/create-view-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsCreateViewForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsCreateViewForOrgResponseCodecAlternative3Codec)

  private val projectsCreateViewForOrgResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/create-view-for-org.response.alternative4", BasicError.Serializer, SdkJson)

  internal val projectsCreateViewForOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsCreateViewForOrgResponseCodecAlternative4Codec)

  private val projectsCreateViewForOrgResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("projects/create-view-for-org.response.alternative5", ValidationError.Serializer, SdkJson)

  internal val projectsCreateViewForOrgResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(projectsCreateViewForOrgResponseCodecAlternative5Codec)

  private val projectsCreateViewForOrgResponseCodecAlternative6Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/create-view-for-org.response.alternative6", BasicError.Serializer, SdkJson)

  internal val projectsCreateViewForOrgResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsCreateViewForOrgResponseCodecAlternative6Codec)

  internal val projectsCreateViewForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b> =
      MediaTypeCodecRegistry.of(projectsCreateViewForOrgRequestCodec)

  internal val projectsCreateViewForOrgResponseCodecRegistry: MediaTypeCodecRegistry<ProjectsV2View>
      = MediaTypeCodecRegistry.of(projectsCreateViewForOrgResponseCodec)

  internal const val PROJECTSCREATEVIEWFORUSER_REQUEST_CODEC_ID: String =
      "projects/create-view-for-user.request"

  private val projectsCreateViewForUserRequestCodec:
      MediaTypeCodec<InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6> =
      KotlinxSerializationCodec(PROJECTSCREATEVIEWFORUSER_REQUEST_CODEC_ID, InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6.Serializer, SdkJson)

  internal const val PROJECTSCREATEVIEWFORUSER_RESPONSE_CODEC_ID: String =
      "projects/create-view-for-user.response"

  private val projectsCreateViewForUserResponseCodec: MediaTypeCodec<ProjectsV2View> =
      KotlinxSerializationCodec(PROJECTSCREATEVIEWFORUSER_RESPONSE_CODEC_ID, ProjectsV2View.Serializer, SdkJson)

  private val projectsCreateViewForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<ProjectsV2View> =
      KotlinxSerializationCodec("projects/create-view-for-user.response.alternative0", ProjectsV2View.Serializer, SdkJson)

  internal val projectsCreateViewForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2View> =
      MediaTypeCodecRegistry.of(projectsCreateViewForUserResponseCodecAlternative0Codec)

  private val projectsCreateViewForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/create-view-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsCreateViewForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsCreateViewForUserResponseCodecAlternative2Codec)

  private val projectsCreateViewForUserResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/create-view-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsCreateViewForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsCreateViewForUserResponseCodecAlternative3Codec)

  private val projectsCreateViewForUserResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/create-view-for-user.response.alternative4", BasicError.Serializer, SdkJson)

  internal val projectsCreateViewForUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsCreateViewForUserResponseCodecAlternative4Codec)

  private val projectsCreateViewForUserResponseCodecAlternative5Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("projects/create-view-for-user.response.alternative5", ValidationError.Serializer, SdkJson)

  internal val projectsCreateViewForUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(projectsCreateViewForUserResponseCodecAlternative5Codec)

  private val projectsCreateViewForUserResponseCodecAlternative6Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/create-view-for-user.response.alternative6", BasicError.Serializer, SdkJson)

  internal val projectsCreateViewForUserResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsCreateViewForUserResponseCodecAlternative6Codec)

  internal val projectsCreateViewForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6> =
      MediaTypeCodecRegistry.of(projectsCreateViewForUserRequestCodec)

  internal val projectsCreateViewForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<ProjectsV2View> =
      MediaTypeCodecRegistry.of(projectsCreateViewForUserResponseCodec)

  private val projectsDeleteItemForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/delete-item-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val projectsDeleteItemForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsDeleteItemForOrgResponseCodecAlternative1Codec)

  private val projectsDeleteItemForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/delete-item-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsDeleteItemForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsDeleteItemForOrgResponseCodecAlternative2Codec)

  internal val projectsDeleteItemForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsDeleteItemForOrgResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val projectsDeleteItemForUserResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/delete-item-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val projectsDeleteItemForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsDeleteItemForUserResponseCodecAlternative1Codec)

  private val projectsDeleteItemForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/delete-item-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsDeleteItemForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsDeleteItemForUserResponseCodecAlternative2Codec)

  internal val projectsDeleteItemForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsDeleteItemForUserResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal const val PROJECTSGETFIELDFORORG_RESPONSE_CODEC_ID: String =
      "projects/get-field-for-org.response"

  private val projectsGetFieldForOrgResponseCodec: MediaTypeCodec<ProjectsV2Field> =
      KotlinxSerializationCodec(PROJECTSGETFIELDFORORG_RESPONSE_CODEC_ID, ProjectsV2Field.Serializer, SdkJson)

  private val projectsGetFieldForOrgResponseCodecAlternative0Codec: MediaTypeCodec<ProjectsV2Field>
      =
      KotlinxSerializationCodec("projects/get-field-for-org.response.alternative0", ProjectsV2Field.Serializer, SdkJson)

  internal val projectsGetFieldForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2Field> =
      MediaTypeCodecRegistry.of(projectsGetFieldForOrgResponseCodecAlternative0Codec)

  private val projectsGetFieldForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-field-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsGetFieldForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetFieldForOrgResponseCodecAlternative2Codec)

  private val projectsGetFieldForOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-field-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsGetFieldForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetFieldForOrgResponseCodecAlternative3Codec)

  internal val projectsGetFieldForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsGetFieldForOrgResponseCodecRegistry: MediaTypeCodecRegistry<ProjectsV2Field>
      = MediaTypeCodecRegistry.of(projectsGetFieldForOrgResponseCodec)

  internal const val PROJECTSGETFIELDFORUSER_RESPONSE_CODEC_ID: String =
      "projects/get-field-for-user.response"

  private val projectsGetFieldForUserResponseCodec: MediaTypeCodec<ProjectsV2Field> =
      KotlinxSerializationCodec(PROJECTSGETFIELDFORUSER_RESPONSE_CODEC_ID, ProjectsV2Field.Serializer, SdkJson)

  private val projectsGetFieldForUserResponseCodecAlternative0Codec: MediaTypeCodec<ProjectsV2Field>
      =
      KotlinxSerializationCodec("projects/get-field-for-user.response.alternative0", ProjectsV2Field.Serializer, SdkJson)

  internal val projectsGetFieldForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2Field> =
      MediaTypeCodecRegistry.of(projectsGetFieldForUserResponseCodecAlternative0Codec)

  private val projectsGetFieldForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-field-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsGetFieldForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetFieldForUserResponseCodecAlternative2Codec)

  private val projectsGetFieldForUserResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-field-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsGetFieldForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetFieldForUserResponseCodecAlternative3Codec)

  internal val projectsGetFieldForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsGetFieldForUserResponseCodecRegistry: MediaTypeCodecRegistry<ProjectsV2Field>
      = MediaTypeCodecRegistry.of(projectsGetFieldForUserResponseCodec)

  internal const val PROJECTSGETFORORG_RESPONSE_CODEC_ID: String = "projects/get-for-org.response"

  private val projectsGetForOrgResponseCodec: MediaTypeCodec<ProjectsV2> =
      KotlinxSerializationCodec(PROJECTSGETFORORG_RESPONSE_CODEC_ID, ProjectsV2.Serializer, SdkJson)

  private val projectsGetForOrgResponseCodecAlternative0Codec: MediaTypeCodec<ProjectsV2> =
      KotlinxSerializationCodec("projects/get-for-org.response.alternative0", ProjectsV2.Serializer, SdkJson)

  internal val projectsGetForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2> =
      MediaTypeCodecRegistry.of(projectsGetForOrgResponseCodecAlternative0Codec)

  private val projectsGetForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsGetForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetForOrgResponseCodecAlternative2Codec)

  private val projectsGetForOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsGetForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetForOrgResponseCodecAlternative3Codec)

  internal val projectsGetForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsGetForOrgResponseCodecRegistry: MediaTypeCodecRegistry<ProjectsV2> =
      MediaTypeCodecRegistry.of(projectsGetForOrgResponseCodec)

  internal const val PROJECTSGETFORUSER_RESPONSE_CODEC_ID: String = "projects/get-for-user.response"

  private val projectsGetForUserResponseCodec: MediaTypeCodec<ProjectsV2> =
      KotlinxSerializationCodec(PROJECTSGETFORUSER_RESPONSE_CODEC_ID, ProjectsV2.Serializer, SdkJson)

  private val projectsGetForUserResponseCodecAlternative0Codec: MediaTypeCodec<ProjectsV2> =
      KotlinxSerializationCodec("projects/get-for-user.response.alternative0", ProjectsV2.Serializer, SdkJson)

  internal val projectsGetForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2> =
      MediaTypeCodecRegistry.of(projectsGetForUserResponseCodecAlternative0Codec)

  private val projectsGetForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsGetForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetForUserResponseCodecAlternative2Codec)

  private val projectsGetForUserResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsGetForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetForUserResponseCodecAlternative3Codec)

  internal val projectsGetForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsGetForUserResponseCodecRegistry: MediaTypeCodecRegistry<ProjectsV2> =
      MediaTypeCodecRegistry.of(projectsGetForUserResponseCodec)

  internal const val PROJECTSGETORGITEM_RESPONSE_CODEC_ID: String = "projects/get-org-item.response"

  private val projectsGetOrgItemResponseCodec: MediaTypeCodec<ProjectsV2ItemWithContent> =
      KotlinxSerializationCodec(PROJECTSGETORGITEM_RESPONSE_CODEC_ID, ProjectsV2ItemWithContent.Serializer, SdkJson)

  private val projectsGetOrgItemResponseCodecAlternative0Codec:
      MediaTypeCodec<ProjectsV2ItemWithContent> =
      KotlinxSerializationCodec("projects/get-org-item.response.alternative0", ProjectsV2ItemWithContent.Serializer, SdkJson)

  internal val projectsGetOrgItemResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2ItemWithContent> =
      MediaTypeCodecRegistry.of(projectsGetOrgItemResponseCodecAlternative0Codec)

  private val projectsGetOrgItemResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-org-item.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsGetOrgItemResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetOrgItemResponseCodecAlternative2Codec)

  private val projectsGetOrgItemResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-org-item.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsGetOrgItemResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetOrgItemResponseCodecAlternative3Codec)

  internal val projectsGetOrgItemRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsGetOrgItemResponseCodecRegistry:
      MediaTypeCodecRegistry<ProjectsV2ItemWithContent> =
      MediaTypeCodecRegistry.of(projectsGetOrgItemResponseCodec)

  internal const val PROJECTSGETUSERITEM_RESPONSE_CODEC_ID: String =
      "projects/get-user-item.response"

  private val projectsGetUserItemResponseCodec: MediaTypeCodec<ProjectsV2ItemWithContent> =
      KotlinxSerializationCodec(PROJECTSGETUSERITEM_RESPONSE_CODEC_ID, ProjectsV2ItemWithContent.Serializer, SdkJson)

  private val projectsGetUserItemResponseCodecAlternative0Codec:
      MediaTypeCodec<ProjectsV2ItemWithContent> =
      KotlinxSerializationCodec("projects/get-user-item.response.alternative0", ProjectsV2ItemWithContent.Serializer, SdkJson)

  internal val projectsGetUserItemResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2ItemWithContent> =
      MediaTypeCodecRegistry.of(projectsGetUserItemResponseCodecAlternative0Codec)

  private val projectsGetUserItemResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-user-item.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsGetUserItemResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetUserItemResponseCodecAlternative2Codec)

  private val projectsGetUserItemResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/get-user-item.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsGetUserItemResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsGetUserItemResponseCodecAlternative3Codec)

  internal val projectsGetUserItemRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsGetUserItemResponseCodecRegistry:
      MediaTypeCodecRegistry<ProjectsV2ItemWithContent> =
      MediaTypeCodecRegistry.of(projectsGetUserItemResponseCodec)

  internal const val PROJECTSLISTFIELDSFORORG_RESPONSE_CODEC_ID: String =
      "projects/list-fields-for-org.response"

  private val projectsListFieldsForOrgResponseCodec: MediaTypeCodec<List<ProjectsV2Field>> =
      KotlinxSerializationCodec(PROJECTSLISTFIELDSFORORG_RESPONSE_CODEC_ID, ListSerializer(ProjectsV2Field.Serializer), SdkJson)

  private val projectsListFieldsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<ProjectsV2Field>> =
      KotlinxSerializationCodec("projects/list-fields-for-org.response.alternative0", ListSerializer(ProjectsV2Field.Serializer), SdkJson)

  internal val projectsListFieldsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<ProjectsV2Field>> =
      MediaTypeCodecRegistry.of(projectsListFieldsForOrgResponseCodecAlternative0Codec)

  private val projectsListFieldsForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-fields-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsListFieldsForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListFieldsForOrgResponseCodecAlternative2Codec)

  private val projectsListFieldsForOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-fields-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsListFieldsForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListFieldsForOrgResponseCodecAlternative3Codec)

  internal val projectsListFieldsForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsListFieldsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<ProjectsV2Field>> =
      MediaTypeCodecRegistry.of(projectsListFieldsForOrgResponseCodec)

  internal const val PROJECTSLISTFIELDSFORUSER_RESPONSE_CODEC_ID: String =
      "projects/list-fields-for-user.response"

  private val projectsListFieldsForUserResponseCodec: MediaTypeCodec<List<ProjectsV2Field>> =
      KotlinxSerializationCodec(PROJECTSLISTFIELDSFORUSER_RESPONSE_CODEC_ID, ListSerializer(ProjectsV2Field.Serializer), SdkJson)

  private val projectsListFieldsForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<ProjectsV2Field>> =
      KotlinxSerializationCodec("projects/list-fields-for-user.response.alternative0", ListSerializer(ProjectsV2Field.Serializer), SdkJson)

  internal val projectsListFieldsForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<ProjectsV2Field>> =
      MediaTypeCodecRegistry.of(projectsListFieldsForUserResponseCodecAlternative0Codec)

  private val projectsListFieldsForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-fields-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsListFieldsForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListFieldsForUserResponseCodecAlternative2Codec)

  private val projectsListFieldsForUserResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-fields-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsListFieldsForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListFieldsForUserResponseCodecAlternative3Codec)

  internal val projectsListFieldsForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsListFieldsForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<ProjectsV2Field>> =
      MediaTypeCodecRegistry.of(projectsListFieldsForUserResponseCodec)

  internal const val PROJECTSLISTFORORG_RESPONSE_CODEC_ID: String = "projects/list-for-org.response"

  private val projectsListForOrgResponseCodec: MediaTypeCodec<List<ProjectsV2>> =
      KotlinxSerializationCodec(PROJECTSLISTFORORG_RESPONSE_CODEC_ID, ListSerializer(ProjectsV2.Serializer), SdkJson)

  private val projectsListForOrgResponseCodecAlternative0Codec: MediaTypeCodec<List<ProjectsV2>> =
      KotlinxSerializationCodec("projects/list-for-org.response.alternative0", ListSerializer(ProjectsV2.Serializer), SdkJson)

  internal val projectsListForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<ProjectsV2>> =
      MediaTypeCodecRegistry.of(projectsListForOrgResponseCodecAlternative0Codec)

  private val projectsListForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsListForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListForOrgResponseCodecAlternative2Codec)

  private val projectsListForOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsListForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListForOrgResponseCodecAlternative3Codec)

  internal val projectsListForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsListForOrgResponseCodecRegistry: MediaTypeCodecRegistry<List<ProjectsV2>> =
      MediaTypeCodecRegistry.of(projectsListForOrgResponseCodec)

  internal const val PROJECTSLISTFORUSER_RESPONSE_CODEC_ID: String =
      "projects/list-for-user.response"

  private val projectsListForUserResponseCodec: MediaTypeCodec<List<ProjectsV2>> =
      KotlinxSerializationCodec(PROJECTSLISTFORUSER_RESPONSE_CODEC_ID, ListSerializer(ProjectsV2.Serializer), SdkJson)

  private val projectsListForUserResponseCodecAlternative0Codec: MediaTypeCodec<List<ProjectsV2>> =
      KotlinxSerializationCodec("projects/list-for-user.response.alternative0", ListSerializer(ProjectsV2.Serializer), SdkJson)

  internal val projectsListForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<ProjectsV2>> =
      MediaTypeCodecRegistry.of(projectsListForUserResponseCodecAlternative0Codec)

  private val projectsListForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsListForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListForUserResponseCodecAlternative2Codec)

  private val projectsListForUserResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsListForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListForUserResponseCodecAlternative3Codec)

  internal val projectsListForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsListForUserResponseCodecRegistry: MediaTypeCodecRegistry<List<ProjectsV2>> =
      MediaTypeCodecRegistry.of(projectsListForUserResponseCodec)

  internal const val PROJECTSLISTITEMSFORORG_RESPONSE_CODEC_ID: String =
      "projects/list-items-for-org.response"

  private val projectsListItemsForOrgResponseCodec: MediaTypeCodec<List<ProjectsV2ItemWithContent>>
      =
      KotlinxSerializationCodec(PROJECTSLISTITEMSFORORG_RESPONSE_CODEC_ID, ListSerializer(ProjectsV2ItemWithContent.Serializer), SdkJson)

  private val projectsListItemsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<ProjectsV2ItemWithContent>> =
      KotlinxSerializationCodec("projects/list-items-for-org.response.alternative0", ListSerializer(ProjectsV2ItemWithContent.Serializer), SdkJson)

  internal val projectsListItemsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<ProjectsV2ItemWithContent>> =
      MediaTypeCodecRegistry.of(projectsListItemsForOrgResponseCodecAlternative0Codec)

  private val projectsListItemsForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-items-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsListItemsForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListItemsForOrgResponseCodecAlternative2Codec)

  private val projectsListItemsForOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-items-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsListItemsForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListItemsForOrgResponseCodecAlternative3Codec)

  internal val projectsListItemsForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsListItemsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<ProjectsV2ItemWithContent>> =
      MediaTypeCodecRegistry.of(projectsListItemsForOrgResponseCodec)

  internal const val PROJECTSLISTITEMSFORUSER_RESPONSE_CODEC_ID: String =
      "projects/list-items-for-user.response"

  private val projectsListItemsForUserResponseCodec: MediaTypeCodec<List<ProjectsV2ItemWithContent>>
      =
      KotlinxSerializationCodec(PROJECTSLISTITEMSFORUSER_RESPONSE_CODEC_ID, ListSerializer(ProjectsV2ItemWithContent.Serializer), SdkJson)

  private val projectsListItemsForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<ProjectsV2ItemWithContent>> =
      KotlinxSerializationCodec("projects/list-items-for-user.response.alternative0", ListSerializer(ProjectsV2ItemWithContent.Serializer), SdkJson)

  internal val projectsListItemsForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<ProjectsV2ItemWithContent>> =
      MediaTypeCodecRegistry.of(projectsListItemsForUserResponseCodecAlternative0Codec)

  private val projectsListItemsForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-items-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsListItemsForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListItemsForUserResponseCodecAlternative2Codec)

  private val projectsListItemsForUserResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/list-items-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsListItemsForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListItemsForUserResponseCodecAlternative3Codec)

  internal val projectsListItemsForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsListItemsForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<ProjectsV2ItemWithContent>> =
      MediaTypeCodecRegistry.of(projectsListItemsForUserResponseCodec)

  internal const val PROJECTSLISTVIEWITEMSFORORG_RESPONSE_CODEC_ID: String =
      "projects/list-view-items-for-org.response"

  private val projectsListViewItemsForOrgResponseCodec:
      MediaTypeCodec<List<ProjectsV2ItemWithContent>> =
      KotlinxSerializationCodec(PROJECTSLISTVIEWITEMSFORORG_RESPONSE_CODEC_ID, ListSerializer(ProjectsV2ItemWithContent.Serializer), SdkJson)

  private val projectsListViewItemsForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<List<ProjectsV2ItemWithContent>> =
      KotlinxSerializationCodec("projects/list-view-items-for-org.response.alternative0", ListSerializer(ProjectsV2ItemWithContent.Serializer), SdkJson)

  internal val projectsListViewItemsForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<ProjectsV2ItemWithContent>> =
      MediaTypeCodecRegistry.of(projectsListViewItemsForOrgResponseCodecAlternative0Codec)

  private val projectsListViewItemsForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("projects/list-view-items-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsListViewItemsForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListViewItemsForOrgResponseCodecAlternative2Codec)

  private val projectsListViewItemsForOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("projects/list-view-items-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsListViewItemsForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListViewItemsForOrgResponseCodecAlternative3Codec)

  private val projectsListViewItemsForOrgResponseCodecAlternative4Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("projects/list-view-items-for-org.response.alternative4", BasicError.Serializer, SdkJson)

  internal val projectsListViewItemsForOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListViewItemsForOrgResponseCodecAlternative4Codec)

  internal val projectsListViewItemsForOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsListViewItemsForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<List<ProjectsV2ItemWithContent>> =
      MediaTypeCodecRegistry.of(projectsListViewItemsForOrgResponseCodec)

  internal const val PROJECTSLISTVIEWITEMSFORUSER_RESPONSE_CODEC_ID: String =
      "projects/list-view-items-for-user.response"

  private val projectsListViewItemsForUserResponseCodec:
      MediaTypeCodec<List<ProjectsV2ItemWithContent>> =
      KotlinxSerializationCodec(PROJECTSLISTVIEWITEMSFORUSER_RESPONSE_CODEC_ID, ListSerializer(ProjectsV2ItemWithContent.Serializer), SdkJson)

  private val projectsListViewItemsForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<List<ProjectsV2ItemWithContent>> =
      KotlinxSerializationCodec("projects/list-view-items-for-user.response.alternative0", ListSerializer(ProjectsV2ItemWithContent.Serializer), SdkJson)

  internal val projectsListViewItemsForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<ProjectsV2ItemWithContent>> =
      MediaTypeCodecRegistry.of(projectsListViewItemsForUserResponseCodecAlternative0Codec)

  private val projectsListViewItemsForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("projects/list-view-items-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsListViewItemsForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListViewItemsForUserResponseCodecAlternative2Codec)

  private val projectsListViewItemsForUserResponseCodecAlternative3Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("projects/list-view-items-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsListViewItemsForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListViewItemsForUserResponseCodecAlternative3Codec)

  private val projectsListViewItemsForUserResponseCodecAlternative4Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("projects/list-view-items-for-user.response.alternative4", BasicError.Serializer, SdkJson)

  internal val projectsListViewItemsForUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsListViewItemsForUserResponseCodecAlternative4Codec)

  internal val projectsListViewItemsForUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val projectsListViewItemsForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<List<ProjectsV2ItemWithContent>> =
      MediaTypeCodecRegistry.of(projectsListViewItemsForUserResponseCodec)

  internal const val PROJECTSUPDATEITEMFORORG_REQUEST_CODEC_ID: String =
      "projects/update-item-for-org.request"

  private val projectsUpdateItemForOrgRequestCodec:
      MediaTypeCodec<InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e> =
      KotlinxSerializationCodec(PROJECTSUPDATEITEMFORORG_REQUEST_CODEC_ID, InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e.Serializer, SdkJson)

  internal const val PROJECTSUPDATEITEMFORORG_RESPONSE_CODEC_ID: String =
      "projects/update-item-for-org.response"

  private val projectsUpdateItemForOrgResponseCodec: MediaTypeCodec<ProjectsV2ItemWithContent> =
      KotlinxSerializationCodec(PROJECTSUPDATEITEMFORORG_RESPONSE_CODEC_ID, ProjectsV2ItemWithContent.Serializer, SdkJson)

  private val projectsUpdateItemForOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<ProjectsV2ItemWithContent> =
      KotlinxSerializationCodec("projects/update-item-for-org.response.alternative0", ProjectsV2ItemWithContent.Serializer, SdkJson)

  internal val projectsUpdateItemForOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2ItemWithContent> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForOrgResponseCodecAlternative0Codec)

  private val projectsUpdateItemForOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/update-item-for-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val projectsUpdateItemForOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForOrgResponseCodecAlternative1Codec)

  private val projectsUpdateItemForOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/update-item-for-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsUpdateItemForOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForOrgResponseCodecAlternative2Codec)

  private val projectsUpdateItemForOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/update-item-for-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsUpdateItemForOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForOrgResponseCodecAlternative3Codec)

  private val projectsUpdateItemForOrgResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("projects/update-item-for-org.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val projectsUpdateItemForOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForOrgResponseCodecAlternative4Codec)

  internal val projectsUpdateItemForOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForOrgRequestCodec)

  internal val projectsUpdateItemForOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<ProjectsV2ItemWithContent> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForOrgResponseCodec)

  internal const val PROJECTSUPDATEITEMFORUSER_REQUEST_CODEC_ID: String =
      "projects/update-item-for-user.request"

  private val projectsUpdateItemForUserRequestCodec:
      MediaTypeCodec<InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e> =
      KotlinxSerializationCodec(PROJECTSUPDATEITEMFORUSER_REQUEST_CODEC_ID, InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e.Serializer, SdkJson)

  internal const val PROJECTSUPDATEITEMFORUSER_RESPONSE_CODEC_ID: String =
      "projects/update-item-for-user.response"

  private val projectsUpdateItemForUserResponseCodec: MediaTypeCodec<ProjectsV2ItemWithContent> =
      KotlinxSerializationCodec(PROJECTSUPDATEITEMFORUSER_RESPONSE_CODEC_ID, ProjectsV2ItemWithContent.Serializer, SdkJson)

  private val projectsUpdateItemForUserResponseCodecAlternative0Codec:
      MediaTypeCodec<ProjectsV2ItemWithContent> =
      KotlinxSerializationCodec("projects/update-item-for-user.response.alternative0", ProjectsV2ItemWithContent.Serializer, SdkJson)

  internal val projectsUpdateItemForUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ProjectsV2ItemWithContent> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForUserResponseCodecAlternative0Codec)

  private val projectsUpdateItemForUserResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/update-item-for-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val projectsUpdateItemForUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForUserResponseCodecAlternative1Codec)

  private val projectsUpdateItemForUserResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/update-item-for-user.response.alternative2", BasicError.Serializer, SdkJson)

  internal val projectsUpdateItemForUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForUserResponseCodecAlternative2Codec)

  private val projectsUpdateItemForUserResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("projects/update-item-for-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val projectsUpdateItemForUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForUserResponseCodecAlternative3Codec)

  private val projectsUpdateItemForUserResponseCodecAlternative4Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("projects/update-item-for-user.response.alternative4", ValidationError.Serializer, SdkJson)

  internal val projectsUpdateItemForUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForUserResponseCodecAlternative4Codec)

  internal val projectsUpdateItemForUserRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForUserRequestCodec)

  internal val projectsUpdateItemForUserResponseCodecRegistry:
      MediaTypeCodecRegistry<ProjectsV2ItemWithContent> =
      MediaTypeCodecRegistry.of(projectsUpdateItemForUserResponseCodec)
}

/**
 * Client for the 'projects' group of GitHub v3 REST API.
 */
public class ProjectsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ProjectsClient.authentication)

  /**
   * Add a field to an organization-owned project.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsAddFieldForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsAddFieldForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsAddFieldForOrg(
    request: InlineOrgsProjectsV2FieldsPostRequestJsonXe4a0d1be,
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): ProjectsV2Field = executor.executeWithTypedErrors<InlineOrgsProjectsV2FieldsPostRequestJsonXe4a0d1be, ProjectsAddFieldForOrgResponse, ProjectsV2Field>(
    request = SdkExecutionRequest(projectsAddFieldForOrgMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSADDFIELDFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsAddFieldForOrgRequestCodecRegistry,
    responseDecoder = ProjectsAddFieldForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsAddFieldForOrgResponse.SuccessJson -> response.json
        is ProjectsAddFieldForOrgResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsAddFieldForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsAddFieldForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsAddFieldForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsAddFieldForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsAddFieldForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsAddFieldForOrgResponse.Http304NoContent -> ProjectsAddFieldForOrgApiException(response, statusCode, headers)
        is ProjectsAddFieldForOrgResponse.Http401Json -> ProjectsAddFieldForOrgApiException(response, statusCode, headers)
        is ProjectsAddFieldForOrgResponse.Http403Json -> ProjectsAddFieldForOrgApiException(response, statusCode, headers)
        is ProjectsAddFieldForOrgResponse.Http422Json -> ProjectsAddFieldForOrgApiException(response, statusCode, headers)
        is ProjectsAddFieldForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Add a field to an organization-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   */
  public suspend fun projectsAddFieldForOrgWithResponse(
    request: InlineOrgsProjectsV2FieldsPostRequestJsonXe4a0d1be,
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsAddFieldForOrgResponse> = executor.executeWithResponse<InlineOrgsProjectsV2FieldsPostRequestJsonXe4a0d1be, ProjectsAddFieldForOrgResponse>(SdkExecutionRequest(projectsAddFieldForOrgMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSADDFIELDFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
  }), ProjectsCodecs.projectsAddFieldForOrgRequestCodecRegistry, ProjectsAddFieldForOrgResponseDecoder, options)

  /**
   * Add a field to a specified user owned project.
   *
   * @param request Request body sent to the operation.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsAddFieldForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsAddFieldForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsAddFieldForUser(
    request: InlineUsersProjectsV2FieldsPostRequestJsonXcca31777,
    projectNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): ProjectsV2Field = executor.executeWithTypedErrors<InlineUsersProjectsV2FieldsPostRequestJsonXcca31777, ProjectsAddFieldForUserResponse, ProjectsV2Field>(
    request = SdkExecutionRequest(projectsAddFieldForUserMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSADDFIELDFORUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsAddFieldForUserRequestCodecRegistry,
    responseDecoder = ProjectsAddFieldForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsAddFieldForUserResponse.SuccessJson -> response.json
        is ProjectsAddFieldForUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsAddFieldForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsAddFieldForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsAddFieldForUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsAddFieldForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsAddFieldForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsAddFieldForUserResponse.Http304NoContent -> ProjectsAddFieldForUserApiException(response, statusCode, headers)
        is ProjectsAddFieldForUserResponse.Http401Json -> ProjectsAddFieldForUserApiException(response, statusCode, headers)
        is ProjectsAddFieldForUserResponse.Http403Json -> ProjectsAddFieldForUserApiException(response, statusCode, headers)
        is ProjectsAddFieldForUserResponse.Http422Json -> ProjectsAddFieldForUserApiException(response, statusCode, headers)
        is ProjectsAddFieldForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Add a field to a specified user owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun projectsAddFieldForUserWithResponse(
    request: InlineUsersProjectsV2FieldsPostRequestJsonXcca31777,
    projectNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsAddFieldForUserResponse> = executor.executeWithResponse<InlineUsersProjectsV2FieldsPostRequestJsonXcca31777, ProjectsAddFieldForUserResponse>(SdkExecutionRequest(projectsAddFieldForUserMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSADDFIELDFORUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), ProjectsCodecs.projectsAddFieldForUserRequestCodecRegistry, ProjectsAddFieldForUserResponseDecoder, options)

  /**
   * Create a new view in an organization-owned project. Views allow you to customize how items in a project are
   * displayed and filtered.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsCreateViewForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsCreateViewForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsCreateViewForOrg(
    request: InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b,
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): ProjectsV2View = executor.executeWithTypedErrors<InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b, ProjectsCreateViewForOrgResponse, ProjectsV2View>(
    request = SdkExecutionRequest(projectsCreateViewForOrgMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSCREATEVIEWFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsCreateViewForOrgRequestCodecRegistry,
    responseDecoder = ProjectsCreateViewForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsCreateViewForOrgResponse.SuccessJson -> response.json
        is ProjectsCreateViewForOrgResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForOrgResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsCreateViewForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsCreateViewForOrgResponse.Http304NoContent -> ProjectsCreateViewForOrgApiException(response, statusCode, headers)
        is ProjectsCreateViewForOrgResponse.Http401Json -> ProjectsCreateViewForOrgApiException(response, statusCode, headers)
        is ProjectsCreateViewForOrgResponse.Http403Json -> ProjectsCreateViewForOrgApiException(response, statusCode, headers)
        is ProjectsCreateViewForOrgResponse.Http404Json -> ProjectsCreateViewForOrgApiException(response, statusCode, headers)
        is ProjectsCreateViewForOrgResponse.Http422Json -> ProjectsCreateViewForOrgApiException(response, statusCode, headers)
        is ProjectsCreateViewForOrgResponse.Http503Json -> ProjectsCreateViewForOrgApiException(response, statusCode, headers)
        is ProjectsCreateViewForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a new view in an organization-owned project. Views allow you to customize how items in a project are
   * displayed and filtered.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   */
  public suspend fun projectsCreateViewForOrgWithResponse(
    request: InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b,
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsCreateViewForOrgResponse> = executor.executeWithResponse<InlineOrgsProjectsV2ViewsPostRequestJsonX6663a94b, ProjectsCreateViewForOrgResponse>(SdkExecutionRequest(projectsCreateViewForOrgMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSCREATEVIEWFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
  }), ProjectsCodecs.projectsCreateViewForOrgRequestCodecRegistry, ProjectsCreateViewForOrgResponseDecoder, options)

  /**
   * Create a new view in a user-owned project. Views allow you to customize how items in a project are displayed and
   * filtered.
   *
   * @param request Request body sent to the operation.
   * @param projectNumber The project's number.
   * @param userId The unique identifier of the user.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsCreateViewForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsCreateViewForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsCreateViewForUser(
    request: InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6,
    projectNumber: Int,
    userId: String,
    options: CallOptions = CallOptions(),
  ): ProjectsV2View = executor.executeWithTypedErrors<InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6, ProjectsCreateViewForUserResponse, ProjectsV2View>(
    request = SdkExecutionRequest(projectsCreateViewForUserMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSCREATEVIEWFORUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "user_id", values = listOf(userId.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsCreateViewForUserRequestCodecRegistry,
    responseDecoder = ProjectsCreateViewForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsCreateViewForUserResponse.SuccessJson -> response.json
        is ProjectsCreateViewForUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForUserResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsCreateViewForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsCreateViewForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsCreateViewForUserResponse.Http304NoContent -> ProjectsCreateViewForUserApiException(response, statusCode, headers)
        is ProjectsCreateViewForUserResponse.Http401Json -> ProjectsCreateViewForUserApiException(response, statusCode, headers)
        is ProjectsCreateViewForUserResponse.Http403Json -> ProjectsCreateViewForUserApiException(response, statusCode, headers)
        is ProjectsCreateViewForUserResponse.Http404Json -> ProjectsCreateViewForUserApiException(response, statusCode, headers)
        is ProjectsCreateViewForUserResponse.Http422Json -> ProjectsCreateViewForUserApiException(response, statusCode, headers)
        is ProjectsCreateViewForUserResponse.Http503Json -> ProjectsCreateViewForUserApiException(response, statusCode, headers)
        is ProjectsCreateViewForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a new view in a user-owned project. Views allow you to customize how items in a project are displayed and
   * filtered.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param projectNumber The project's number.
   * @param userId The unique identifier of the user.
   * @param options Execution options.
   */
  public suspend fun projectsCreateViewForUserWithResponse(
    request: InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6,
    projectNumber: Int,
    userId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsCreateViewForUserResponse> = executor.executeWithResponse<InlineUsersProjectsV2ViewsPostRequestJsonXe7bcdaf6, ProjectsCreateViewForUserResponse>(SdkExecutionRequest(projectsCreateViewForUserMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSCREATEVIEWFORUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "user_id", values = listOf(userId.toString())))
  }), ProjectsCodecs.projectsCreateViewForUserRequestCodecRegistry, ProjectsCreateViewForUserResponseDecoder, options)

  /**
   * Delete a specific item from an organization-owned project.
   *
   * @param itemId The unique identifier of the project item.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   * @return No response body.
   * @throws ProjectsDeleteItemForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsDeleteItemForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsDeleteItemForOrg(
    itemId: Int,
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, ProjectsDeleteItemForOrgResponse, Unit>(
    request = SdkExecutionRequest(projectsDeleteItemForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsDeleteItemForOrgRequestCodecRegistry,
    responseDecoder = ProjectsDeleteItemForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsDeleteItemForOrgResponse.SuccessNoContent -> response.unit
        is ProjectsDeleteItemForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsDeleteItemForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsDeleteItemForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsDeleteItemForOrgResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is ProjectsDeleteItemForOrgResponse.Http401Json -> ProjectsDeleteItemForOrgApiException(response, statusCode, headers)
        is ProjectsDeleteItemForOrgResponse.Http403Json -> ProjectsDeleteItemForOrgApiException(response, statusCode, headers)
        is ProjectsDeleteItemForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Delete a specific item from an organization-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param itemId The unique identifier of the project item.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   */
  public suspend fun projectsDeleteItemForOrgWithResponse(
    itemId: Int,
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsDeleteItemForOrgResponse> = executor.executeWithResponse<Unit, ProjectsDeleteItemForOrgResponse>(SdkExecutionRequest(projectsDeleteItemForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
  }), ProjectsCodecs.projectsDeleteItemForOrgRequestCodecRegistry, ProjectsDeleteItemForOrgResponseDecoder, options)

  /**
   * Delete a specific item from a user-owned project.
   *
   * @param itemId The unique identifier of the project item.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return No response body.
   * @throws ProjectsDeleteItemForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsDeleteItemForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsDeleteItemForUser(
    itemId: Int,
    projectNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, ProjectsDeleteItemForUserResponse, Unit>(
    request = SdkExecutionRequest(projectsDeleteItemForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsDeleteItemForUserRequestCodecRegistry,
    responseDecoder = ProjectsDeleteItemForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsDeleteItemForUserResponse.SuccessNoContent -> response.unit
        is ProjectsDeleteItemForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsDeleteItemForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsDeleteItemForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsDeleteItemForUserResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is ProjectsDeleteItemForUserResponse.Http401Json -> ProjectsDeleteItemForUserApiException(response, statusCode, headers)
        is ProjectsDeleteItemForUserResponse.Http403Json -> ProjectsDeleteItemForUserApiException(response, statusCode, headers)
        is ProjectsDeleteItemForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Delete a specific item from a user-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param itemId The unique identifier of the project item.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun projectsDeleteItemForUserWithResponse(
    itemId: Int,
    projectNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsDeleteItemForUserResponse> = executor.executeWithResponse<Unit, ProjectsDeleteItemForUserResponse>(SdkExecutionRequest(projectsDeleteItemForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), ProjectsCodecs.projectsDeleteItemForUserRequestCodecRegistry, ProjectsDeleteItemForUserResponseDecoder, options)

  /**
   * Get a specific field for an organization-owned project.
   *
   * @param fieldId The unique identifier of the field.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsGetFieldForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsGetFieldForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsGetFieldForOrg(
    fieldId: Int,
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): ProjectsV2Field = executor.executeWithTypedErrors<Unit, ProjectsGetFieldForOrgResponse, ProjectsV2Field>(
    request = SdkExecutionRequest(projectsGetFieldForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "field_id", values = listOf(fieldId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsGetFieldForOrgRequestCodecRegistry,
    responseDecoder = ProjectsGetFieldForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsGetFieldForOrgResponse.SuccessJson -> response.json
        is ProjectsGetFieldForOrgResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetFieldForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetFieldForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetFieldForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsGetFieldForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsGetFieldForOrgResponse.Http304NoContent -> ProjectsGetFieldForOrgApiException(response, statusCode, headers)
        is ProjectsGetFieldForOrgResponse.Http401Json -> ProjectsGetFieldForOrgApiException(response, statusCode, headers)
        is ProjectsGetFieldForOrgResponse.Http403Json -> ProjectsGetFieldForOrgApiException(response, statusCode, headers)
        is ProjectsGetFieldForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get a specific field for an organization-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param fieldId The unique identifier of the field.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   */
  public suspend fun projectsGetFieldForOrgWithResponse(
    fieldId: Int,
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsGetFieldForOrgResponse> = executor.executeWithResponse<Unit, ProjectsGetFieldForOrgResponse>(SdkExecutionRequest(projectsGetFieldForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "field_id", values = listOf(fieldId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
  }), ProjectsCodecs.projectsGetFieldForOrgRequestCodecRegistry, ProjectsGetFieldForOrgResponseDecoder, options)

  /**
   * Get a specific field for a user-owned project.
   *
   * @param fieldId The unique identifier of the field.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsGetFieldForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsGetFieldForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsGetFieldForUser(
    fieldId: Int,
    projectNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): ProjectsV2Field = executor.executeWithTypedErrors<Unit, ProjectsGetFieldForUserResponse, ProjectsV2Field>(
    request = SdkExecutionRequest(projectsGetFieldForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "field_id", values = listOf(fieldId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsGetFieldForUserRequestCodecRegistry,
    responseDecoder = ProjectsGetFieldForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsGetFieldForUserResponse.SuccessJson -> response.json
        is ProjectsGetFieldForUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetFieldForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetFieldForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetFieldForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsGetFieldForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsGetFieldForUserResponse.Http304NoContent -> ProjectsGetFieldForUserApiException(response, statusCode, headers)
        is ProjectsGetFieldForUserResponse.Http401Json -> ProjectsGetFieldForUserApiException(response, statusCode, headers)
        is ProjectsGetFieldForUserResponse.Http403Json -> ProjectsGetFieldForUserApiException(response, statusCode, headers)
        is ProjectsGetFieldForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get a specific field for a user-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param fieldId The unique identifier of the field.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun projectsGetFieldForUserWithResponse(
    fieldId: Int,
    projectNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsGetFieldForUserResponse> = executor.executeWithResponse<Unit, ProjectsGetFieldForUserResponse>(SdkExecutionRequest(projectsGetFieldForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "field_id", values = listOf(fieldId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), ProjectsCodecs.projectsGetFieldForUserRequestCodecRegistry, ProjectsGetFieldForUserResponseDecoder, options)

  /**
   * Get a specific organization-owned project.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsGetForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsGetForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsGetForOrg(
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): ProjectsV2 = executor.executeWithTypedErrors<Unit, ProjectsGetForOrgResponse, ProjectsV2>(
    request = SdkExecutionRequest(projectsGetForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsGetForOrgRequestCodecRegistry,
    responseDecoder = ProjectsGetForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsGetForOrgResponse.SuccessJson -> response.json
        is ProjectsGetForOrgResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsGetForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsGetForOrgResponse.Http304NoContent -> ProjectsGetForOrgApiException(response, statusCode, headers)
        is ProjectsGetForOrgResponse.Http401Json -> ProjectsGetForOrgApiException(response, statusCode, headers)
        is ProjectsGetForOrgResponse.Http403Json -> ProjectsGetForOrgApiException(response, statusCode, headers)
        is ProjectsGetForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get a specific organization-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   */
  public suspend fun projectsGetForOrgWithResponse(
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsGetForOrgResponse> = executor.executeWithResponse<Unit, ProjectsGetForOrgResponse>(SdkExecutionRequest(projectsGetForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
  }), ProjectsCodecs.projectsGetForOrgRequestCodecRegistry, ProjectsGetForOrgResponseDecoder, options)

  /**
   * Get a specific user-owned project.
   *
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsGetForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsGetForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsGetForUser(
    projectNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): ProjectsV2 = executor.executeWithTypedErrors<Unit, ProjectsGetForUserResponse, ProjectsV2>(
    request = SdkExecutionRequest(projectsGetForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsGetForUserRequestCodecRegistry,
    responseDecoder = ProjectsGetForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsGetForUserResponse.SuccessJson -> response.json
        is ProjectsGetForUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsGetForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsGetForUserResponse.Http304NoContent -> ProjectsGetForUserApiException(response, statusCode, headers)
        is ProjectsGetForUserResponse.Http401Json -> ProjectsGetForUserApiException(response, statusCode, headers)
        is ProjectsGetForUserResponse.Http403Json -> ProjectsGetForUserApiException(response, statusCode, headers)
        is ProjectsGetForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get a specific user-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun projectsGetForUserWithResponse(
    projectNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsGetForUserResponse> = executor.executeWithResponse<Unit, ProjectsGetForUserResponse>(SdkExecutionRequest(projectsGetForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), ProjectsCodecs.projectsGetForUserRequestCodecRegistry, ProjectsGetForUserResponseDecoder, options)

  /**
   * Get a specific item from an organization-owned project.
   *
   * @param itemId The unique identifier of the project item.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param fields Limit results to specific fields, by their IDs. If not specified, the title field will be returned.
   *
   * Example: fields[]=123&fields[]=456&fields[]=789 or fields=123,456,789
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsGetOrgItemApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsGetOrgItemError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsGetOrgItem(
    itemId: Int,
    org: String,
    projectNumber: Int,
    fields: InlineOrgsProjectsV2ItemsGetParameterXef349106? = null,
    options: CallOptions = CallOptions(),
  ): ProjectsV2ItemWithContent = executor.executeWithTypedErrors<Unit, ProjectsGetOrgItemResponse, ProjectsV2ItemWithContent>(
    request = SdkExecutionRequest(projectsGetOrgItemMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
    }),
    requestCodecs = ProjectsCodecs.projectsGetOrgItemRequestCodecRegistry,
    responseDecoder = ProjectsGetOrgItemResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsGetOrgItemResponse.SuccessJson -> response.json
        is ProjectsGetOrgItemResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetOrgItemResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetOrgItemResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetOrgItemResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsGetOrgItemResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsGetOrgItemResponse.Http304NoContent -> ProjectsGetOrgItemApiException(response, statusCode, headers)
        is ProjectsGetOrgItemResponse.Http401Json -> ProjectsGetOrgItemApiException(response, statusCode, headers)
        is ProjectsGetOrgItemResponse.Http403Json -> ProjectsGetOrgItemApiException(response, statusCode, headers)
        is ProjectsGetOrgItemResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get a specific item from an organization-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param itemId The unique identifier of the project item.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param fields Limit results to specific fields, by their IDs. If not specified, the title field will be returned.
   *
   * Example: fields[]=123&fields[]=456&fields[]=789 or fields=123,456,789
   * @param options Execution options.
   */
  public suspend fun projectsGetOrgItemWithResponse(
    itemId: Int,
    org: String,
    projectNumber: Int,
    fields: InlineOrgsProjectsV2ItemsGetParameterXef349106? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsGetOrgItemResponse> = executor.executeWithResponse<Unit, ProjectsGetOrgItemResponse>(SdkExecutionRequest(projectsGetOrgItemMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
  }), ProjectsCodecs.projectsGetOrgItemRequestCodecRegistry, ProjectsGetOrgItemResponseDecoder, options)

  /**
   * Get a specific item from a user-owned project.
   *
   * @param itemId The unique identifier of the project item.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param fields Limit results to specific fields, by their IDs. If not specified, the title field will be returned.
   *
   * Example: fields[]=123&fields[]=456&fields[]=789 or fields=123,456,789
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsGetUserItemApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsGetUserItemError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsGetUserItem(
    itemId: Int,
    projectNumber: Int,
    username: String,
    fields: InlineUsersProjectsV2ItemsGetParameterX18bfa365? = null,
    options: CallOptions = CallOptions(),
  ): ProjectsV2ItemWithContent = executor.executeWithTypedErrors<Unit, ProjectsGetUserItemResponse, ProjectsV2ItemWithContent>(
    request = SdkExecutionRequest(projectsGetUserItemMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
    }),
    requestCodecs = ProjectsCodecs.projectsGetUserItemRequestCodecRegistry,
    responseDecoder = ProjectsGetUserItemResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsGetUserItemResponse.SuccessJson -> response.json
        is ProjectsGetUserItemResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetUserItemResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetUserItemResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsGetUserItemResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsGetUserItemResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsGetUserItemResponse.Http304NoContent -> ProjectsGetUserItemApiException(response, statusCode, headers)
        is ProjectsGetUserItemResponse.Http401Json -> ProjectsGetUserItemApiException(response, statusCode, headers)
        is ProjectsGetUserItemResponse.Http403Json -> ProjectsGetUserItemApiException(response, statusCode, headers)
        is ProjectsGetUserItemResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get a specific item from a user-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param itemId The unique identifier of the project item.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param fields Limit results to specific fields, by their IDs. If not specified, the title field will be returned.
   *
   * Example: fields[]=123&fields[]=456&fields[]=789 or fields=123,456,789
   * @param options Execution options.
   */
  public suspend fun projectsGetUserItemWithResponse(
    itemId: Int,
    projectNumber: Int,
    username: String,
    fields: InlineUsersProjectsV2ItemsGetParameterX18bfa365? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsGetUserItemResponse> = executor.executeWithResponse<Unit, ProjectsGetUserItemResponse>(SdkExecutionRequest(projectsGetUserItemMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
  }), ProjectsCodecs.projectsGetUserItemRequestCodecRegistry, ProjectsGetUserItemResponseDecoder, options)

  /**
   * List all fields for a specific organization-owned project.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsListFieldsForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsListFieldsForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsListFieldsForOrg(
    org: String,
    projectNumber: Int,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<ProjectsV2Field> = executor.executeWithTypedErrors<Unit, ProjectsListFieldsForOrgResponse, List<ProjectsV2Field>>(
    request = SdkExecutionRequest(projectsListFieldsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ProjectsCodecs.projectsListFieldsForOrgRequestCodecRegistry,
    responseDecoder = ProjectsListFieldsForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsListFieldsForOrgResponse.SuccessJson -> response.json
        is ProjectsListFieldsForOrgResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListFieldsForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListFieldsForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListFieldsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsListFieldsForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsListFieldsForOrgResponse.Http304NoContent -> ProjectsListFieldsForOrgApiException(response, statusCode, headers)
        is ProjectsListFieldsForOrgResponse.Http401Json -> ProjectsListFieldsForOrgApiException(response, statusCode, headers)
        is ProjectsListFieldsForOrgResponse.Http403Json -> ProjectsListFieldsForOrgApiException(response, statusCode, headers)
        is ProjectsListFieldsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all fields for a specific organization-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun projectsListFieldsForOrgWithResponse(
    org: String,
    projectNumber: Int,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsListFieldsForOrgResponse> = executor.executeWithResponse<Unit, ProjectsListFieldsForOrgResponse>(SdkExecutionRequest(projectsListFieldsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ProjectsCodecs.projectsListFieldsForOrgRequestCodecRegistry, ProjectsListFieldsForOrgResponseDecoder, options)

  /**
   * List all fields for a specific user-owned project.
   *
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsListFieldsForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsListFieldsForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsListFieldsForUser(
    projectNumber: Int,
    username: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<ProjectsV2Field> = executor.executeWithTypedErrors<Unit, ProjectsListFieldsForUserResponse, List<ProjectsV2Field>>(
    request = SdkExecutionRequest(projectsListFieldsForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ProjectsCodecs.projectsListFieldsForUserRequestCodecRegistry,
    responseDecoder = ProjectsListFieldsForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsListFieldsForUserResponse.SuccessJson -> response.json
        is ProjectsListFieldsForUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListFieldsForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListFieldsForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListFieldsForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsListFieldsForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsListFieldsForUserResponse.Http304NoContent -> ProjectsListFieldsForUserApiException(response, statusCode, headers)
        is ProjectsListFieldsForUserResponse.Http401Json -> ProjectsListFieldsForUserApiException(response, statusCode, headers)
        is ProjectsListFieldsForUserResponse.Http403Json -> ProjectsListFieldsForUserApiException(response, statusCode, headers)
        is ProjectsListFieldsForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all fields for a specific user-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun projectsListFieldsForUserWithResponse(
    projectNumber: Int,
    username: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsListFieldsForUserResponse> = executor.executeWithResponse<Unit, ProjectsListFieldsForUserResponse>(SdkExecutionRequest(projectsListFieldsForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ProjectsCodecs.projectsListFieldsForUserRequestCodecRegistry, ProjectsListFieldsForUserResponseDecoder, options)

  /**
   * List all projects owned by a specific organization accessible by the authenticated user.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q Limit results to projects of the specified type.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsListForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsListForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsListForOrg(
    org: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    q: String? = null,
    options: CallOptions = CallOptions(),
  ): List<ProjectsV2> = executor.executeWithTypedErrors<Unit, ProjectsListForOrgResponse, List<ProjectsV2>>(
    request = SdkExecutionRequest(projectsListForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ProjectsCodecs.projectsListForOrgRequestCodecRegistry,
    responseDecoder = ProjectsListForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsListForOrgResponse.SuccessJson -> response.json
        is ProjectsListForOrgResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsListForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsListForOrgResponse.Http304NoContent -> ProjectsListForOrgApiException(response, statusCode, headers)
        is ProjectsListForOrgResponse.Http401Json -> ProjectsListForOrgApiException(response, statusCode, headers)
        is ProjectsListForOrgResponse.Http403Json -> ProjectsListForOrgApiException(response, statusCode, headers)
        is ProjectsListForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all projects owned by a specific organization accessible by the authenticated user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q Limit results to projects of the specified type.
   * @param options Execution options.
   */
  public suspend fun projectsListForOrgWithResponse(
    org: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    q: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsListForOrgResponse> = executor.executeWithResponse<Unit, ProjectsListForOrgResponse>(SdkExecutionRequest(projectsListForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it.toString()) }.orEmpty()))
  }), ProjectsCodecs.projectsListForOrgRequestCodecRegistry, ProjectsListForOrgResponseDecoder, options)

  /**
   * List all projects owned by a specific user accessible by the authenticated user.
   *
   * @param username The handle for the GitHub user account.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q Limit results to projects of the specified type.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsListForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsListForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsListForUser(
    username: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    q: String? = null,
    options: CallOptions = CallOptions(),
  ): List<ProjectsV2> = executor.executeWithTypedErrors<Unit, ProjectsListForUserResponse, List<ProjectsV2>>(
    request = SdkExecutionRequest(projectsListForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ProjectsCodecs.projectsListForUserRequestCodecRegistry,
    responseDecoder = ProjectsListForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsListForUserResponse.SuccessJson -> response.json
        is ProjectsListForUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsListForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsListForUserResponse.Http304NoContent -> ProjectsListForUserApiException(response, statusCode, headers)
        is ProjectsListForUserResponse.Http401Json -> ProjectsListForUserApiException(response, statusCode, headers)
        is ProjectsListForUserResponse.Http403Json -> ProjectsListForUserApiException(response, statusCode, headers)
        is ProjectsListForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all projects owned by a specific user accessible by the authenticated user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param username The handle for the GitHub user account.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q Limit results to projects of the specified type.
   * @param options Execution options.
   */
  public suspend fun projectsListForUserWithResponse(
    username: String,
    after: String? = null,
    before: String? = null,
    perPage: Int? = null,
    q: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsListForUserResponse> = executor.executeWithResponse<Unit, ProjectsListForUserResponse>(SdkExecutionRequest(projectsListForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it.toString()) }.orEmpty()))
  }), ProjectsCodecs.projectsListForUserRequestCodecRegistry, ProjectsListForUserResponseDecoder, options)

  /**
   * List all items for a specific organization-owned project accessible by the authenticated user.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param fields Limit results to specific fields, by their IDs. If not specified, the title field will be returned.
   *
   * Example: `fields[]=123&fields[]=456&fields[]=789` or `fields=123,456,789`
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q Search query to filter items, see [Filtering
   * projects](https://docs.github.com/issues/planning-and-tracking-with-projects/customizing-views-in-your-project/filt
   * ering-projects) for more information.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsListItemsForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsListItemsForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsListItemsForOrg(
    org: String,
    projectNumber: Int,
    after: String? = null,
    before: String? = null,
    fields: InlineOrgsProjectsV2ItemsGetParameterX9175a229? = null,
    perPage: Int? = null,
    q: String? = null,
    options: CallOptions = CallOptions(),
  ): List<ProjectsV2ItemWithContent> = executor.executeWithTypedErrors<Unit, ProjectsListItemsForOrgResponse, List<ProjectsV2ItemWithContent>>(
    request = SdkExecutionRequest(projectsListItemsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ProjectsCodecs.projectsListItemsForOrgRequestCodecRegistry,
    responseDecoder = ProjectsListItemsForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsListItemsForOrgResponse.SuccessJson -> response.json
        is ProjectsListItemsForOrgResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListItemsForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListItemsForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListItemsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsListItemsForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsListItemsForOrgResponse.Http304NoContent -> ProjectsListItemsForOrgApiException(response, statusCode, headers)
        is ProjectsListItemsForOrgResponse.Http401Json -> ProjectsListItemsForOrgApiException(response, statusCode, headers)
        is ProjectsListItemsForOrgResponse.Http403Json -> ProjectsListItemsForOrgApiException(response, statusCode, headers)
        is ProjectsListItemsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all items for a specific organization-owned project accessible by the authenticated user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param fields Limit results to specific fields, by their IDs. If not specified, the title field will be returned.
   *
   * Example: `fields[]=123&fields[]=456&fields[]=789` or `fields=123,456,789`
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q Search query to filter items, see [Filtering
   * projects](https://docs.github.com/issues/planning-and-tracking-with-projects/customizing-views-in-your-project/filt
   * ering-projects) for more information.
   * @param options Execution options.
   */
  public suspend fun projectsListItemsForOrgWithResponse(
    org: String,
    projectNumber: Int,
    after: String? = null,
    before: String? = null,
    fields: InlineOrgsProjectsV2ItemsGetParameterX9175a229? = null,
    perPage: Int? = null,
    q: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsListItemsForOrgResponse> = executor.executeWithResponse<Unit, ProjectsListItemsForOrgResponse>(SdkExecutionRequest(projectsListItemsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it.toString()) }.orEmpty()))
  }), ProjectsCodecs.projectsListItemsForOrgRequestCodecRegistry, ProjectsListItemsForOrgResponseDecoder, options)

  /**
   * List all items for a specific user-owned project accessible by the authenticated user.
   *
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param fields Limit results to specific fields, by their IDs. If not specified, the title field will be returned.
   *
   * Example: `fields[]=123&fields[]=456&fields[]=789` or `fields=123,456,789`
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q Search query to filter items, see [Filtering
   * projects](https://docs.github.com/issues/planning-and-tracking-with-projects/customizing-views-in-your-project/filt
   * ering-projects) for more information.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsListItemsForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsListItemsForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsListItemsForUser(
    projectNumber: Int,
    username: String,
    after: String? = null,
    before: String? = null,
    fields: InlineUsersProjectsV2ItemsGetParameterX7b856da4? = null,
    perPage: Int? = null,
    q: String? = null,
    options: CallOptions = CallOptions(),
  ): List<ProjectsV2ItemWithContent> = executor.executeWithTypedErrors<Unit, ProjectsListItemsForUserResponse, List<ProjectsV2ItemWithContent>>(
    request = SdkExecutionRequest(projectsListItemsForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ProjectsCodecs.projectsListItemsForUserRequestCodecRegistry,
    responseDecoder = ProjectsListItemsForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsListItemsForUserResponse.SuccessJson -> response.json
        is ProjectsListItemsForUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListItemsForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListItemsForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListItemsForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsListItemsForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsListItemsForUserResponse.Http304NoContent -> ProjectsListItemsForUserApiException(response, statusCode, headers)
        is ProjectsListItemsForUserResponse.Http401Json -> ProjectsListItemsForUserApiException(response, statusCode, headers)
        is ProjectsListItemsForUserResponse.Http403Json -> ProjectsListItemsForUserApiException(response, statusCode, headers)
        is ProjectsListItemsForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all items for a specific user-owned project accessible by the authenticated user.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param fields Limit results to specific fields, by their IDs. If not specified, the title field will be returned.
   *
   * Example: `fields[]=123&fields[]=456&fields[]=789` or `fields=123,456,789`
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param q Search query to filter items, see [Filtering
   * projects](https://docs.github.com/issues/planning-and-tracking-with-projects/customizing-views-in-your-project/filt
   * ering-projects) for more information.
   * @param options Execution options.
   */
  public suspend fun projectsListItemsForUserWithResponse(
    projectNumber: Int,
    username: String,
    after: String? = null,
    before: String? = null,
    fields: InlineUsersProjectsV2ItemsGetParameterX7b856da4? = null,
    perPage: Int? = null,
    q: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsListItemsForUserResponse> = executor.executeWithResponse<Unit, ProjectsListItemsForUserResponse>(SdkExecutionRequest(projectsListItemsForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it.toString()) }.orEmpty()))
  }), ProjectsCodecs.projectsListItemsForUserRequestCodecRegistry, ProjectsListItemsForUserResponseDecoder, options)

  /**
   * List items in an organization project with the saved view's filter applied.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param viewNumber The number that identifies the project view.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param fields Limit results to specific fields, by their IDs. If not specified, the
   * title field will be returned.
   *
   * Example: `fields[]=123&fields[]=456&fields[]=789` or `fields=123,456,789`
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsListViewItemsForOrgApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ProjectsListViewItemsForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsListViewItemsForOrg(
    org: String,
    projectNumber: Int,
    viewNumber: Int,
    after: String? = null,
    before: String? = null,
    fields: InlineOrgsProjectsV2ViewsItemsGetParameterX00ebcf3e? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<ProjectsV2ItemWithContent> = executor.executeWithTypedErrors<Unit, ProjectsListViewItemsForOrgResponse, List<ProjectsV2ItemWithContent>>(
    request = SdkExecutionRequest(projectsListViewItemsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "view_number", values = listOf(viewNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ProjectsCodecs.projectsListViewItemsForOrgRequestCodecRegistry,
    responseDecoder = ProjectsListViewItemsForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsListViewItemsForOrgResponse.SuccessJson -> response.json
        is ProjectsListViewItemsForOrgResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListViewItemsForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListViewItemsForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListViewItemsForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListViewItemsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsListViewItemsForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsListViewItemsForOrgResponse.Http304NoContent -> ProjectsListViewItemsForOrgApiException(response, statusCode, headers)
        is ProjectsListViewItemsForOrgResponse.Http401Json -> ProjectsListViewItemsForOrgApiException(response, statusCode, headers)
        is ProjectsListViewItemsForOrgResponse.Http403Json -> ProjectsListViewItemsForOrgApiException(response, statusCode, headers)
        is ProjectsListViewItemsForOrgResponse.Http404Json -> ProjectsListViewItemsForOrgApiException(response, statusCode, headers)
        is ProjectsListViewItemsForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List items in an organization project with the saved view's filter applied.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param viewNumber The number that identifies the project view.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param fields Limit results to specific fields, by their IDs. If not specified, the
   * title field will be returned.
   *
   * Example: `fields[]=123&fields[]=456&fields[]=789` or `fields=123,456,789`
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun projectsListViewItemsForOrgWithResponse(
    org: String,
    projectNumber: Int,
    viewNumber: Int,
    after: String? = null,
    before: String? = null,
    fields: InlineOrgsProjectsV2ViewsItemsGetParameterX00ebcf3e? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsListViewItemsForOrgResponse> = executor.executeWithResponse<Unit, ProjectsListViewItemsForOrgResponse>(SdkExecutionRequest(projectsListViewItemsForOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "view_number", values = listOf(viewNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ProjectsCodecs.projectsListViewItemsForOrgRequestCodecRegistry, ProjectsListViewItemsForOrgResponseDecoder, options)

  /**
   * List items in a user project with the saved view's filter applied.
   *
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param viewNumber The number that identifies the project view.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param fields Limit results to specific fields, by their IDs. If not specified, the
   * title field will be returned.
   *
   * Example: `fields[]=123&fields[]=456&fields[]=789` or `fields=123,456,789`
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsListViewItemsForUserApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ProjectsListViewItemsForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsListViewItemsForUser(
    projectNumber: Int,
    username: String,
    viewNumber: Int,
    after: String? = null,
    before: String? = null,
    fields: InlineUsersProjectsV2ViewsItemsGetParameterXbd5b66da? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<ProjectsV2ItemWithContent> = executor.executeWithTypedErrors<Unit, ProjectsListViewItemsForUserResponse, List<ProjectsV2ItemWithContent>>(
    request = SdkExecutionRequest(projectsListViewItemsForUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "view_number", values = listOf(viewNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ProjectsCodecs.projectsListViewItemsForUserRequestCodecRegistry,
    responseDecoder = ProjectsListViewItemsForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsListViewItemsForUserResponse.SuccessJson -> response.json
        is ProjectsListViewItemsForUserResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListViewItemsForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListViewItemsForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListViewItemsForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsListViewItemsForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsListViewItemsForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsListViewItemsForUserResponse.Http304NoContent -> ProjectsListViewItemsForUserApiException(response, statusCode, headers)
        is ProjectsListViewItemsForUserResponse.Http401Json -> ProjectsListViewItemsForUserApiException(response, statusCode, headers)
        is ProjectsListViewItemsForUserResponse.Http403Json -> ProjectsListViewItemsForUserApiException(response, statusCode, headers)
        is ProjectsListViewItemsForUserResponse.Http404Json -> ProjectsListViewItemsForUserApiException(response, statusCode, headers)
        is ProjectsListViewItemsForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List items in a user project with the saved view's filter applied.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param viewNumber The number that identifies the project view.
   * @param after A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results after this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param before A cursor, as given in the [Link
   * header](https://docs.github.com/rest/guides/using-pagination-in-the-rest-api#using-link-headers). If specified, the
   * query only searches for results before this cursor. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param fields Limit results to specific fields, by their IDs. If not specified, the
   * title field will be returned.
   *
   * Example: `fields[]=123&fields[]=456&fields[]=789` or `fields=123,456,789`
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun projectsListViewItemsForUserWithResponse(
    projectNumber: Int,
    username: String,
    viewNumber: Int,
    after: String? = null,
    before: String? = null,
    fields: InlineUsersProjectsV2ViewsItemsGetParameterXbd5b66da? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsListViewItemsForUserResponse> = executor.executeWithResponse<Unit, ProjectsListViewItemsForUserResponse>(SdkExecutionRequest(projectsListViewItemsForUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "view_number", values = listOf(viewNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "after", values = after?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "before", values = before?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "fields", values = fields?.let { sdkPrimitiveUnionParameterValues(it.raw) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), ProjectsCodecs.projectsListViewItemsForUserRequestCodecRegistry, ProjectsListViewItemsForUserResponseDecoder, options)

  /**
   * Update a specific item in an organization-owned project.
   *
   * @param request Request body sent to the operation.
   * @param itemId The unique identifier of the project item.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsUpdateItemForOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsUpdateItemForOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsUpdateItemForOrg(
    request: InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e,
    itemId: Int,
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): ProjectsV2ItemWithContent = executor.executeWithTypedErrors<InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e, ProjectsUpdateItemForOrgResponse, ProjectsV2ItemWithContent>(
    request = SdkExecutionRequest(projectsUpdateItemForOrgMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSUPDATEITEMFORORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsUpdateItemForOrgRequestCodecRegistry,
    responseDecoder = ProjectsUpdateItemForOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsUpdateItemForOrgResponse.SuccessJson -> response.json
        is ProjectsUpdateItemForOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsUpdateItemForOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsUpdateItemForOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsUpdateItemForOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsUpdateItemForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsUpdateItemForOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsUpdateItemForOrgResponse.Http401Json -> ProjectsUpdateItemForOrgApiException(response, statusCode, headers)
        is ProjectsUpdateItemForOrgResponse.Http403Json -> ProjectsUpdateItemForOrgApiException(response, statusCode, headers)
        is ProjectsUpdateItemForOrgResponse.Http404Json -> ProjectsUpdateItemForOrgApiException(response, statusCode, headers)
        is ProjectsUpdateItemForOrgResponse.Http422Json -> ProjectsUpdateItemForOrgApiException(response, statusCode, headers)
        is ProjectsUpdateItemForOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Update a specific item in an organization-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param itemId The unique identifier of the project item.
   * @param org The organization name. The name is not case sensitive.
   * @param projectNumber The project's number.
   * @param options Execution options.
   */
  public suspend fun projectsUpdateItemForOrgWithResponse(
    request: InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e,
    itemId: Int,
    org: String,
    projectNumber: Int,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsUpdateItemForOrgResponse> = executor.executeWithResponse<InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e, ProjectsUpdateItemForOrgResponse>(SdkExecutionRequest(projectsUpdateItemForOrgMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSUPDATEITEMFORORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
  }), ProjectsCodecs.projectsUpdateItemForOrgRequestCodecRegistry, ProjectsUpdateItemForOrgResponseDecoder, options)

  /**
   * Update a specific item in a user-owned project.
   *
   * @param request Request body sent to the operation.
   * @param itemId The unique identifier of the project item.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ProjectsUpdateItemForUserApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ProjectsUpdateItemForUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun projectsUpdateItemForUser(
    request: InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e,
    itemId: Int,
    projectNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): ProjectsV2ItemWithContent = executor.executeWithTypedErrors<InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e, ProjectsUpdateItemForUserResponse, ProjectsV2ItemWithContent>(
    request = SdkExecutionRequest(projectsUpdateItemForUserMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSUPDATEITEMFORUSER_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = ProjectsCodecs.projectsUpdateItemForUserRequestCodecRegistry,
    responseDecoder = ProjectsUpdateItemForUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ProjectsUpdateItemForUserResponse.SuccessJson -> response.json
        is ProjectsUpdateItemForUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsUpdateItemForUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsUpdateItemForUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsUpdateItemForUserResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is ProjectsUpdateItemForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ProjectsUpdateItemForUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ProjectsUpdateItemForUserResponse.Http401Json -> ProjectsUpdateItemForUserApiException(response, statusCode, headers)
        is ProjectsUpdateItemForUserResponse.Http403Json -> ProjectsUpdateItemForUserApiException(response, statusCode, headers)
        is ProjectsUpdateItemForUserResponse.Http404Json -> ProjectsUpdateItemForUserApiException(response, statusCode, headers)
        is ProjectsUpdateItemForUserResponse.Http422Json -> ProjectsUpdateItemForUserApiException(response, statusCode, headers)
        is ProjectsUpdateItemForUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Update a specific item in a user-owned project.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param itemId The unique identifier of the project item.
   * @param projectNumber The project's number.
   * @param username The handle for the GitHub user account.
   * @param options Execution options.
   */
  public suspend fun projectsUpdateItemForUserWithResponse(
    request: InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e,
    itemId: Int,
    projectNumber: Int,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ProjectsUpdateItemForUserResponse> = executor.executeWithResponse<InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e, ProjectsUpdateItemForUserResponse>(SdkExecutionRequest(projectsUpdateItemForUserMetadata, baseUri, request, listOf(ProjectsCodecs.PROJECTSUPDATEITEMFORUSER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "item_id", values = listOf(itemId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "project_number", values = listOf(projectNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), ProjectsCodecs.projectsUpdateItemForUserRequestCodecRegistry, ProjectsUpdateItemForUserResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `projects/add-field-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsAddFieldForOrgError

  /**
   * Typed response alternatives for `projects/add-field-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsAddFieldForOrgResponse {
    public class SuccessJson(
      public val json: ProjectsV2Field,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForOrgResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForOrgResponse,
        ProjectsAddFieldForOrgError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForOrgResponse,
        ProjectsAddFieldForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForOrgResponse,
        ProjectsAddFieldForOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForOrgResponse,
        ProjectsAddFieldForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForOrgResponse
  }

  /**
   * Raised by `projects/add-field-for-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ProjectsAddFieldForOrgApiException(
    public val error: ProjectsAddFieldForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/add-field-for-org")

  private object ProjectsAddFieldForOrgResponseDecoder : SdkResponseAlternativeDecoder<ProjectsAddFieldForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsAddFieldForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsAddFieldForOrgResponse> = when {
      alternative.id == "projects/add-field-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsAddFieldForOrgResponse.SuccessJson(
          json = ProjectsCodecs.projectsAddFieldForOrgResponseCodecAlternative0Registry.select(listOf("projects/add-field-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/add-field-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsAddFieldForOrgResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/add-field-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsAddFieldForOrgResponse.Http401Json(
          json = ProjectsCodecs.projectsAddFieldForOrgResponseCodecAlternative2Registry.select(listOf("projects/add-field-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/add-field-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsAddFieldForOrgResponse.Http403Json(
          json = ProjectsCodecs.projectsAddFieldForOrgResponseCodecAlternative3Registry.select(listOf("projects/add-field-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/add-field-for-org.response.alternative4" -> SdkResponseDecodeResult(
        value = ProjectsAddFieldForOrgResponse.Http422Json(
          json = ProjectsCodecs.projectsAddFieldForOrgResponseCodecAlternative4Registry.select(listOf("projects/add-field-for-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsAddFieldForOrgResponse = ProjectsAddFieldForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/add-field-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsAddFieldForUserError

  /**
   * Typed response alternatives for `projects/add-field-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsAddFieldForUserResponse {
    public class SuccessJson(
      public val json: ProjectsV2Field,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForUserResponse,
        ProjectsAddFieldForUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForUserResponse,
        ProjectsAddFieldForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForUserResponse,
        ProjectsAddFieldForUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForUserResponse,
        ProjectsAddFieldForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsAddFieldForUserResponse
  }

  /**
   * Raised by `projects/add-field-for-user` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ProjectsAddFieldForUserApiException(
    public val error: ProjectsAddFieldForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/add-field-for-user")

  private object ProjectsAddFieldForUserResponseDecoder : SdkResponseAlternativeDecoder<ProjectsAddFieldForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsAddFieldForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsAddFieldForUserResponse> = when {
      alternative.id == "projects/add-field-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsAddFieldForUserResponse.SuccessJson(
          json = ProjectsCodecs.projectsAddFieldForUserResponseCodecAlternative0Registry.select(listOf("projects/add-field-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/add-field-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsAddFieldForUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/add-field-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsAddFieldForUserResponse.Http401Json(
          json = ProjectsCodecs.projectsAddFieldForUserResponseCodecAlternative2Registry.select(listOf("projects/add-field-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/add-field-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsAddFieldForUserResponse.Http403Json(
          json = ProjectsCodecs.projectsAddFieldForUserResponseCodecAlternative3Registry.select(listOf("projects/add-field-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/add-field-for-user.response.alternative4" -> SdkResponseDecodeResult(
        value = ProjectsAddFieldForUserResponse.Http422Json(
          json = ProjectsCodecs.projectsAddFieldForUserResponseCodecAlternative4Registry.select(listOf("projects/add-field-for-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsAddFieldForUserResponse = ProjectsAddFieldForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/create-view-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsCreateViewForOrgError

  /**
   * Typed response alternatives for `projects/create-view-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsCreateViewForOrgResponse {
    public class SuccessJson(
      public val json: ProjectsV2View,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForOrgResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForOrgResponse,
        ProjectsCreateViewForOrgError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForOrgResponse,
        ProjectsCreateViewForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForOrgResponse,
        ProjectsCreateViewForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForOrgResponse,
        ProjectsCreateViewForOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForOrgResponse,
        ProjectsCreateViewForOrgError

    public class Http503Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForOrgResponse,
        ProjectsCreateViewForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForOrgResponse
  }

  /**
   * Raised by `projects/create-view-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ProjectsCreateViewForOrgApiException(
    public val error: ProjectsCreateViewForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/create-view-for-org")

  private object ProjectsCreateViewForOrgResponseDecoder : SdkResponseAlternativeDecoder<ProjectsCreateViewForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsCreateViewForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsCreateViewForOrgResponse> = when {
      alternative.id == "projects/create-view-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForOrgResponse.SuccessJson(
          json = ProjectsCodecs.projectsCreateViewForOrgResponseCodecAlternative0Registry.select(listOf("projects/create-view-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForOrgResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForOrgResponse.Http401Json(
          json = ProjectsCodecs.projectsCreateViewForOrgResponseCodecAlternative2Registry.select(listOf("projects/create-view-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForOrgResponse.Http403Json(
          json = ProjectsCodecs.projectsCreateViewForOrgResponseCodecAlternative3Registry.select(listOf("projects/create-view-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-org.response.alternative4" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForOrgResponse.Http404Json(
          json = ProjectsCodecs.projectsCreateViewForOrgResponseCodecAlternative4Registry.select(listOf("projects/create-view-for-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-org.response.alternative5" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForOrgResponse.Http422Json(
          json = ProjectsCodecs.projectsCreateViewForOrgResponseCodecAlternative5Registry.select(listOf("projects/create-view-for-org.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-org.response.alternative6" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForOrgResponse.Http503Json(
          json = ProjectsCodecs.projectsCreateViewForOrgResponseCodecAlternative6Registry.select(listOf("projects/create-view-for-org.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsCreateViewForOrgResponse = ProjectsCreateViewForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/create-view-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsCreateViewForUserError

  /**
   * Typed response alternatives for `projects/create-view-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsCreateViewForUserResponse {
    public class SuccessJson(
      public val json: ProjectsV2View,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForUserResponse,
        ProjectsCreateViewForUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForUserResponse,
        ProjectsCreateViewForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForUserResponse,
        ProjectsCreateViewForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForUserResponse,
        ProjectsCreateViewForUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForUserResponse,
        ProjectsCreateViewForUserError

    public class Http503Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForUserResponse,
        ProjectsCreateViewForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsCreateViewForUserResponse
  }

  /**
   * Raised by `projects/create-view-for-user` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ProjectsCreateViewForUserApiException(
    public val error: ProjectsCreateViewForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/create-view-for-user")

  private object ProjectsCreateViewForUserResponseDecoder : SdkResponseAlternativeDecoder<ProjectsCreateViewForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsCreateViewForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsCreateViewForUserResponse> = when {
      alternative.id == "projects/create-view-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForUserResponse.SuccessJson(
          json = ProjectsCodecs.projectsCreateViewForUserResponseCodecAlternative0Registry.select(listOf("projects/create-view-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForUserResponse.Http401Json(
          json = ProjectsCodecs.projectsCreateViewForUserResponseCodecAlternative2Registry.select(listOf("projects/create-view-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForUserResponse.Http403Json(
          json = ProjectsCodecs.projectsCreateViewForUserResponseCodecAlternative3Registry.select(listOf("projects/create-view-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-user.response.alternative4" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForUserResponse.Http404Json(
          json = ProjectsCodecs.projectsCreateViewForUserResponseCodecAlternative4Registry.select(listOf("projects/create-view-for-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-user.response.alternative5" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForUserResponse.Http422Json(
          json = ProjectsCodecs.projectsCreateViewForUserResponseCodecAlternative5Registry.select(listOf("projects/create-view-for-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/create-view-for-user.response.alternative6" -> SdkResponseDecodeResult(
        value = ProjectsCreateViewForUserResponse.Http503Json(
          json = ProjectsCodecs.projectsCreateViewForUserResponseCodecAlternative6Registry.select(listOf("projects/create-view-for-user.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsCreateViewForUserResponse = ProjectsCreateViewForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/delete-item-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsDeleteItemForOrgError

  /**
   * Typed response alternatives for `projects/delete-item-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsDeleteItemForOrgResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsDeleteItemForOrgResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsDeleteItemForOrgResponse,
        ProjectsDeleteItemForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsDeleteItemForOrgResponse,
        ProjectsDeleteItemForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsDeleteItemForOrgResponse
  }

  /**
   * Raised by `projects/delete-item-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ProjectsDeleteItemForOrgApiException(
    public val error: ProjectsDeleteItemForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/delete-item-for-org")

  private object ProjectsDeleteItemForOrgResponseDecoder : SdkResponseAlternativeDecoder<ProjectsDeleteItemForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsDeleteItemForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsDeleteItemForOrgResponse> = when {
      alternative.id == "projects/delete-item-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsDeleteItemForOrgResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/delete-item-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsDeleteItemForOrgResponse.Http401Json(
          json = ProjectsCodecs.projectsDeleteItemForOrgResponseCodecAlternative1Registry.select(listOf("projects/delete-item-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/delete-item-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsDeleteItemForOrgResponse.Http403Json(
          json = ProjectsCodecs.projectsDeleteItemForOrgResponseCodecAlternative2Registry.select(listOf("projects/delete-item-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsDeleteItemForOrgResponse = ProjectsDeleteItemForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/delete-item-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsDeleteItemForUserError

  /**
   * Typed response alternatives for `projects/delete-item-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsDeleteItemForUserResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsDeleteItemForUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsDeleteItemForUserResponse,
        ProjectsDeleteItemForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsDeleteItemForUserResponse,
        ProjectsDeleteItemForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsDeleteItemForUserResponse
  }

  /**
   * Raised by `projects/delete-item-for-user` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ProjectsDeleteItemForUserApiException(
    public val error: ProjectsDeleteItemForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/delete-item-for-user")

  private object ProjectsDeleteItemForUserResponseDecoder : SdkResponseAlternativeDecoder<ProjectsDeleteItemForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsDeleteItemForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsDeleteItemForUserResponse> = when {
      alternative.id == "projects/delete-item-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsDeleteItemForUserResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/delete-item-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsDeleteItemForUserResponse.Http401Json(
          json = ProjectsCodecs.projectsDeleteItemForUserResponseCodecAlternative1Registry.select(listOf("projects/delete-item-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/delete-item-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsDeleteItemForUserResponse.Http403Json(
          json = ProjectsCodecs.projectsDeleteItemForUserResponseCodecAlternative2Registry.select(listOf("projects/delete-item-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsDeleteItemForUserResponse = ProjectsDeleteItemForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/get-field-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsGetFieldForOrgError

  /**
   * Typed response alternatives for `projects/get-field-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsGetFieldForOrgResponse {
    public class SuccessJson(
      public val json: ProjectsV2Field,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetFieldForOrgResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetFieldForOrgResponse,
        ProjectsGetFieldForOrgError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetFieldForOrgResponse,
        ProjectsGetFieldForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetFieldForOrgResponse,
        ProjectsGetFieldForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetFieldForOrgResponse
  }

  /**
   * Raised by `projects/get-field-for-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ProjectsGetFieldForOrgApiException(
    public val error: ProjectsGetFieldForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/get-field-for-org")

  private object ProjectsGetFieldForOrgResponseDecoder : SdkResponseAlternativeDecoder<ProjectsGetFieldForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsGetFieldForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsGetFieldForOrgResponse> = when {
      alternative.id == "projects/get-field-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsGetFieldForOrgResponse.SuccessJson(
          json = ProjectsCodecs.projectsGetFieldForOrgResponseCodecAlternative0Registry.select(listOf("projects/get-field-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-field-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsGetFieldForOrgResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-field-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsGetFieldForOrgResponse.Http401Json(
          json = ProjectsCodecs.projectsGetFieldForOrgResponseCodecAlternative2Registry.select(listOf("projects/get-field-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-field-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsGetFieldForOrgResponse.Http403Json(
          json = ProjectsCodecs.projectsGetFieldForOrgResponseCodecAlternative3Registry.select(listOf("projects/get-field-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsGetFieldForOrgResponse = ProjectsGetFieldForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/get-field-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsGetFieldForUserError

  /**
   * Typed response alternatives for `projects/get-field-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsGetFieldForUserResponse {
    public class SuccessJson(
      public val json: ProjectsV2Field,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetFieldForUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetFieldForUserResponse,
        ProjectsGetFieldForUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetFieldForUserResponse,
        ProjectsGetFieldForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetFieldForUserResponse,
        ProjectsGetFieldForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetFieldForUserResponse
  }

  /**
   * Raised by `projects/get-field-for-user` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ProjectsGetFieldForUserApiException(
    public val error: ProjectsGetFieldForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/get-field-for-user")

  private object ProjectsGetFieldForUserResponseDecoder : SdkResponseAlternativeDecoder<ProjectsGetFieldForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsGetFieldForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsGetFieldForUserResponse> = when {
      alternative.id == "projects/get-field-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsGetFieldForUserResponse.SuccessJson(
          json = ProjectsCodecs.projectsGetFieldForUserResponseCodecAlternative0Registry.select(listOf("projects/get-field-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-field-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsGetFieldForUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-field-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsGetFieldForUserResponse.Http401Json(
          json = ProjectsCodecs.projectsGetFieldForUserResponseCodecAlternative2Registry.select(listOf("projects/get-field-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-field-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsGetFieldForUserResponse.Http403Json(
          json = ProjectsCodecs.projectsGetFieldForUserResponseCodecAlternative3Registry.select(listOf("projects/get-field-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsGetFieldForUserResponse = ProjectsGetFieldForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/get-for-org` may expose through its typed API exception.
   */
  public sealed interface ProjectsGetForOrgError

  /**
   * Typed response alternatives for `projects/get-for-org`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ProjectsGetForOrgResponse {
    public class SuccessJson(
      public val json: ProjectsV2,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetForOrgResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetForOrgResponse,
        ProjectsGetForOrgError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetForOrgResponse,
        ProjectsGetForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetForOrgResponse,
        ProjectsGetForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetForOrgResponse
  }

  /**
   * Raised by `projects/get-for-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ProjectsGetForOrgApiException(
    public val error: ProjectsGetForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/get-for-org")

  private object ProjectsGetForOrgResponseDecoder : SdkResponseAlternativeDecoder<ProjectsGetForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsGetForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsGetForOrgResponse> = when {
      alternative.id == "projects/get-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsGetForOrgResponse.SuccessJson(
          json = ProjectsCodecs.projectsGetForOrgResponseCodecAlternative0Registry.select(listOf("projects/get-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsGetForOrgResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsGetForOrgResponse.Http401Json(
          json = ProjectsCodecs.projectsGetForOrgResponseCodecAlternative2Registry.select(listOf("projects/get-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsGetForOrgResponse.Http403Json(
          json = ProjectsCodecs.projectsGetForOrgResponseCodecAlternative3Registry.select(listOf("projects/get-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsGetForOrgResponse = ProjectsGetForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/get-for-user` may expose through its typed API exception.
   */
  public sealed interface ProjectsGetForUserError

  /**
   * Typed response alternatives for `projects/get-for-user`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ProjectsGetForUserResponse {
    public class SuccessJson(
      public val json: ProjectsV2,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetForUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetForUserResponse,
        ProjectsGetForUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetForUserResponse,
        ProjectsGetForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetForUserResponse,
        ProjectsGetForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetForUserResponse
  }

  /**
   * Raised by `projects/get-for-user` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ProjectsGetForUserApiException(
    public val error: ProjectsGetForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/get-for-user")

  private object ProjectsGetForUserResponseDecoder : SdkResponseAlternativeDecoder<ProjectsGetForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsGetForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsGetForUserResponse> = when {
      alternative.id == "projects/get-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsGetForUserResponse.SuccessJson(
          json = ProjectsCodecs.projectsGetForUserResponseCodecAlternative0Registry.select(listOf("projects/get-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsGetForUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsGetForUserResponse.Http401Json(
          json = ProjectsCodecs.projectsGetForUserResponseCodecAlternative2Registry.select(listOf("projects/get-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsGetForUserResponse.Http403Json(
          json = ProjectsCodecs.projectsGetForUserResponseCodecAlternative3Registry.select(listOf("projects/get-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsGetForUserResponse = ProjectsGetForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/get-org-item` may expose through its typed API exception.
   */
  public sealed interface ProjectsGetOrgItemError

  /**
   * Typed response alternatives for `projects/get-org-item`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ProjectsGetOrgItemResponse {
    public class SuccessJson(
      public val json: ProjectsV2ItemWithContent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetOrgItemResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetOrgItemResponse,
        ProjectsGetOrgItemError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetOrgItemResponse,
        ProjectsGetOrgItemError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetOrgItemResponse,
        ProjectsGetOrgItemError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetOrgItemResponse
  }

  /**
   * Raised by `projects/get-org-item` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ProjectsGetOrgItemApiException(
    public val error: ProjectsGetOrgItemError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/get-org-item")

  private object ProjectsGetOrgItemResponseDecoder : SdkResponseAlternativeDecoder<ProjectsGetOrgItemResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsGetOrgItemResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsGetOrgItemResponse> = when {
      alternative.id == "projects/get-org-item.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsGetOrgItemResponse.SuccessJson(
          json = ProjectsCodecs.projectsGetOrgItemResponseCodecAlternative0Registry.select(listOf("projects/get-org-item.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-org-item.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsGetOrgItemResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-org-item.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsGetOrgItemResponse.Http401Json(
          json = ProjectsCodecs.projectsGetOrgItemResponseCodecAlternative2Registry.select(listOf("projects/get-org-item.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-org-item.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsGetOrgItemResponse.Http403Json(
          json = ProjectsCodecs.projectsGetOrgItemResponseCodecAlternative3Registry.select(listOf("projects/get-org-item.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsGetOrgItemResponse = ProjectsGetOrgItemResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/get-user-item` may expose through its typed API exception.
   */
  public sealed interface ProjectsGetUserItemError

  /**
   * Typed response alternatives for `projects/get-user-item`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ProjectsGetUserItemResponse {
    public class SuccessJson(
      public val json: ProjectsV2ItemWithContent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetUserItemResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetUserItemResponse,
        ProjectsGetUserItemError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetUserItemResponse,
        ProjectsGetUserItemError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetUserItemResponse,
        ProjectsGetUserItemError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsGetUserItemResponse
  }

  /**
   * Raised by `projects/get-user-item` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ProjectsGetUserItemApiException(
    public val error: ProjectsGetUserItemError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/get-user-item")

  private object ProjectsGetUserItemResponseDecoder : SdkResponseAlternativeDecoder<ProjectsGetUserItemResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsGetUserItemResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsGetUserItemResponse> = when {
      alternative.id == "projects/get-user-item.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsGetUserItemResponse.SuccessJson(
          json = ProjectsCodecs.projectsGetUserItemResponseCodecAlternative0Registry.select(listOf("projects/get-user-item.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-user-item.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsGetUserItemResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-user-item.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsGetUserItemResponse.Http401Json(
          json = ProjectsCodecs.projectsGetUserItemResponseCodecAlternative2Registry.select(listOf("projects/get-user-item.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/get-user-item.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsGetUserItemResponse.Http403Json(
          json = ProjectsCodecs.projectsGetUserItemResponseCodecAlternative3Registry.select(listOf("projects/get-user-item.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsGetUserItemResponse = ProjectsGetUserItemResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/list-fields-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsListFieldsForOrgError

  /**
   * Typed response alternatives for `projects/list-fields-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsListFieldsForOrgResponse {
    public class SuccessJson(
      public val json: List<ProjectsV2Field>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListFieldsForOrgResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListFieldsForOrgResponse,
        ProjectsListFieldsForOrgError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListFieldsForOrgResponse,
        ProjectsListFieldsForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListFieldsForOrgResponse,
        ProjectsListFieldsForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListFieldsForOrgResponse
  }

  /**
   * Raised by `projects/list-fields-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ProjectsListFieldsForOrgApiException(
    public val error: ProjectsListFieldsForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/list-fields-for-org")

  private object ProjectsListFieldsForOrgResponseDecoder : SdkResponseAlternativeDecoder<ProjectsListFieldsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsListFieldsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsListFieldsForOrgResponse> = when {
      alternative.id == "projects/list-fields-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsListFieldsForOrgResponse.SuccessJson(
          json = ProjectsCodecs.projectsListFieldsForOrgResponseCodecAlternative0Registry.select(listOf("projects/list-fields-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-fields-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsListFieldsForOrgResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-fields-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsListFieldsForOrgResponse.Http401Json(
          json = ProjectsCodecs.projectsListFieldsForOrgResponseCodecAlternative2Registry.select(listOf("projects/list-fields-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-fields-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsListFieldsForOrgResponse.Http403Json(
          json = ProjectsCodecs.projectsListFieldsForOrgResponseCodecAlternative3Registry.select(listOf("projects/list-fields-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsListFieldsForOrgResponse = ProjectsListFieldsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/list-fields-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsListFieldsForUserError

  /**
   * Typed response alternatives for `projects/list-fields-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsListFieldsForUserResponse {
    public class SuccessJson(
      public val json: List<ProjectsV2Field>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListFieldsForUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListFieldsForUserResponse,
        ProjectsListFieldsForUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListFieldsForUserResponse,
        ProjectsListFieldsForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListFieldsForUserResponse,
        ProjectsListFieldsForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListFieldsForUserResponse
  }

  /**
   * Raised by `projects/list-fields-for-user` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ProjectsListFieldsForUserApiException(
    public val error: ProjectsListFieldsForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/list-fields-for-user")

  private object ProjectsListFieldsForUserResponseDecoder : SdkResponseAlternativeDecoder<ProjectsListFieldsForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsListFieldsForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsListFieldsForUserResponse> = when {
      alternative.id == "projects/list-fields-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsListFieldsForUserResponse.SuccessJson(
          json = ProjectsCodecs.projectsListFieldsForUserResponseCodecAlternative0Registry.select(listOf("projects/list-fields-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-fields-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsListFieldsForUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-fields-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsListFieldsForUserResponse.Http401Json(
          json = ProjectsCodecs.projectsListFieldsForUserResponseCodecAlternative2Registry.select(listOf("projects/list-fields-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-fields-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsListFieldsForUserResponse.Http403Json(
          json = ProjectsCodecs.projectsListFieldsForUserResponseCodecAlternative3Registry.select(listOf("projects/list-fields-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsListFieldsForUserResponse = ProjectsListFieldsForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/list-for-org` may expose through its typed API exception.
   */
  public sealed interface ProjectsListForOrgError

  /**
   * Typed response alternatives for `projects/list-for-org`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ProjectsListForOrgResponse {
    public class SuccessJson(
      public val json: List<ProjectsV2>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListForOrgResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListForOrgResponse,
        ProjectsListForOrgError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListForOrgResponse,
        ProjectsListForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListForOrgResponse,
        ProjectsListForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListForOrgResponse
  }

  /**
   * Raised by `projects/list-for-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ProjectsListForOrgApiException(
    public val error: ProjectsListForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/list-for-org")

  private object ProjectsListForOrgResponseDecoder : SdkResponseAlternativeDecoder<ProjectsListForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsListForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsListForOrgResponse> = when {
      alternative.id == "projects/list-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsListForOrgResponse.SuccessJson(
          json = ProjectsCodecs.projectsListForOrgResponseCodecAlternative0Registry.select(listOf("projects/list-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsListForOrgResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsListForOrgResponse.Http401Json(
          json = ProjectsCodecs.projectsListForOrgResponseCodecAlternative2Registry.select(listOf("projects/list-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsListForOrgResponse.Http403Json(
          json = ProjectsCodecs.projectsListForOrgResponseCodecAlternative3Registry.select(listOf("projects/list-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsListForOrgResponse = ProjectsListForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/list-for-user` may expose through its typed API exception.
   */
  public sealed interface ProjectsListForUserError

  /**
   * Typed response alternatives for `projects/list-for-user`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ProjectsListForUserResponse {
    public class SuccessJson(
      public val json: List<ProjectsV2>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListForUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListForUserResponse,
        ProjectsListForUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListForUserResponse,
        ProjectsListForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListForUserResponse,
        ProjectsListForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListForUserResponse
  }

  /**
   * Raised by `projects/list-for-user` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ProjectsListForUserApiException(
    public val error: ProjectsListForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/list-for-user")

  private object ProjectsListForUserResponseDecoder : SdkResponseAlternativeDecoder<ProjectsListForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsListForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsListForUserResponse> = when {
      alternative.id == "projects/list-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsListForUserResponse.SuccessJson(
          json = ProjectsCodecs.projectsListForUserResponseCodecAlternative0Registry.select(listOf("projects/list-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsListForUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsListForUserResponse.Http401Json(
          json = ProjectsCodecs.projectsListForUserResponseCodecAlternative2Registry.select(listOf("projects/list-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsListForUserResponse.Http403Json(
          json = ProjectsCodecs.projectsListForUserResponseCodecAlternative3Registry.select(listOf("projects/list-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsListForUserResponse = ProjectsListForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/list-items-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsListItemsForOrgError

  /**
   * Typed response alternatives for `projects/list-items-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsListItemsForOrgResponse {
    public class SuccessJson(
      public val json: List<ProjectsV2ItemWithContent>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListItemsForOrgResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListItemsForOrgResponse,
        ProjectsListItemsForOrgError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListItemsForOrgResponse,
        ProjectsListItemsForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListItemsForOrgResponse,
        ProjectsListItemsForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListItemsForOrgResponse
  }

  /**
   * Raised by `projects/list-items-for-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class ProjectsListItemsForOrgApiException(
    public val error: ProjectsListItemsForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/list-items-for-org")

  private object ProjectsListItemsForOrgResponseDecoder : SdkResponseAlternativeDecoder<ProjectsListItemsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsListItemsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsListItemsForOrgResponse> = when {
      alternative.id == "projects/list-items-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsListItemsForOrgResponse.SuccessJson(
          json = ProjectsCodecs.projectsListItemsForOrgResponseCodecAlternative0Registry.select(listOf("projects/list-items-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-items-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsListItemsForOrgResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-items-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsListItemsForOrgResponse.Http401Json(
          json = ProjectsCodecs.projectsListItemsForOrgResponseCodecAlternative2Registry.select(listOf("projects/list-items-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-items-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsListItemsForOrgResponse.Http403Json(
          json = ProjectsCodecs.projectsListItemsForOrgResponseCodecAlternative3Registry.select(listOf("projects/list-items-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsListItemsForOrgResponse = ProjectsListItemsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/list-items-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsListItemsForUserError

  /**
   * Typed response alternatives for `projects/list-items-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsListItemsForUserResponse {
    public class SuccessJson(
      public val json: List<ProjectsV2ItemWithContent>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListItemsForUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListItemsForUserResponse,
        ProjectsListItemsForUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListItemsForUserResponse,
        ProjectsListItemsForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListItemsForUserResponse,
        ProjectsListItemsForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListItemsForUserResponse
  }

  /**
   * Raised by `projects/list-items-for-user` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ProjectsListItemsForUserApiException(
    public val error: ProjectsListItemsForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/list-items-for-user")

  private object ProjectsListItemsForUserResponseDecoder : SdkResponseAlternativeDecoder<ProjectsListItemsForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsListItemsForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsListItemsForUserResponse> = when {
      alternative.id == "projects/list-items-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsListItemsForUserResponse.SuccessJson(
          json = ProjectsCodecs.projectsListItemsForUserResponseCodecAlternative0Registry.select(listOf("projects/list-items-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-items-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsListItemsForUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-items-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsListItemsForUserResponse.Http401Json(
          json = ProjectsCodecs.projectsListItemsForUserResponseCodecAlternative2Registry.select(listOf("projects/list-items-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-items-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsListItemsForUserResponse.Http403Json(
          json = ProjectsCodecs.projectsListItemsForUserResponseCodecAlternative3Registry.select(listOf("projects/list-items-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsListItemsForUserResponse = ProjectsListItemsForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/list-view-items-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsListViewItemsForOrgError

  /**
   * Typed response alternatives for `projects/list-view-items-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsListViewItemsForOrgResponse {
    public class SuccessJson(
      public val json: List<ProjectsV2ItemWithContent>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForOrgResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForOrgResponse,
        ProjectsListViewItemsForOrgError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForOrgResponse,
        ProjectsListViewItemsForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForOrgResponse,
        ProjectsListViewItemsForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForOrgResponse,
        ProjectsListViewItemsForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForOrgResponse
  }

  /**
   * Raised by `projects/list-view-items-for-org` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class ProjectsListViewItemsForOrgApiException(
    public val error: ProjectsListViewItemsForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/list-view-items-for-org")

  private object ProjectsListViewItemsForOrgResponseDecoder : SdkResponseAlternativeDecoder<ProjectsListViewItemsForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsListViewItemsForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsListViewItemsForOrgResponse> = when {
      alternative.id == "projects/list-view-items-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsListViewItemsForOrgResponse.SuccessJson(
          json = ProjectsCodecs.projectsListViewItemsForOrgResponseCodecAlternative0Registry.select(listOf("projects/list-view-items-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-view-items-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsListViewItemsForOrgResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-view-items-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsListViewItemsForOrgResponse.Http401Json(
          json = ProjectsCodecs.projectsListViewItemsForOrgResponseCodecAlternative2Registry.select(listOf("projects/list-view-items-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-view-items-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsListViewItemsForOrgResponse.Http403Json(
          json = ProjectsCodecs.projectsListViewItemsForOrgResponseCodecAlternative3Registry.select(listOf("projects/list-view-items-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-view-items-for-org.response.alternative4" -> SdkResponseDecodeResult(
        value = ProjectsListViewItemsForOrgResponse.Http404Json(
          json = ProjectsCodecs.projectsListViewItemsForOrgResponseCodecAlternative4Registry.select(listOf("projects/list-view-items-for-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsListViewItemsForOrgResponse = ProjectsListViewItemsForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/list-view-items-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsListViewItemsForUserError

  /**
   * Typed response alternatives for `projects/list-view-items-for-user`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface ProjectsListViewItemsForUserResponse {
    public class SuccessJson(
      public val json: List<ProjectsV2ItemWithContent>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForUserResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForUserResponse,
        ProjectsListViewItemsForUserError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForUserResponse,
        ProjectsListViewItemsForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForUserResponse,
        ProjectsListViewItemsForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForUserResponse,
        ProjectsListViewItemsForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsListViewItemsForUserResponse
  }

  /**
   * Raised by `projects/list-view-items-for-user` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class ProjectsListViewItemsForUserApiException(
    public val error: ProjectsListViewItemsForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/list-view-items-for-user")

  private object ProjectsListViewItemsForUserResponseDecoder : SdkResponseAlternativeDecoder<ProjectsListViewItemsForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsListViewItemsForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsListViewItemsForUserResponse> = when {
      alternative.id == "projects/list-view-items-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsListViewItemsForUserResponse.SuccessJson(
          json = ProjectsCodecs.projectsListViewItemsForUserResponseCodecAlternative0Registry.select(listOf("projects/list-view-items-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-view-items-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsListViewItemsForUserResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-view-items-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsListViewItemsForUserResponse.Http401Json(
          json = ProjectsCodecs.projectsListViewItemsForUserResponseCodecAlternative2Registry.select(listOf("projects/list-view-items-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-view-items-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsListViewItemsForUserResponse.Http403Json(
          json = ProjectsCodecs.projectsListViewItemsForUserResponseCodecAlternative3Registry.select(listOf("projects/list-view-items-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/list-view-items-for-user.response.alternative4" -> SdkResponseDecodeResult(
        value = ProjectsListViewItemsForUserResponse.Http404Json(
          json = ProjectsCodecs.projectsListViewItemsForUserResponseCodecAlternative4Registry.select(listOf("projects/list-view-items-for-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsListViewItemsForUserResponse = ProjectsListViewItemsForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/update-item-for-org` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsUpdateItemForOrgError

  /**
   * Typed response alternatives for `projects/update-item-for-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsUpdateItemForOrgResponse {
    public class SuccessJson(
      public val json: ProjectsV2ItemWithContent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForOrgResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForOrgResponse,
        ProjectsUpdateItemForOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForOrgResponse,
        ProjectsUpdateItemForOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForOrgResponse,
        ProjectsUpdateItemForOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForOrgResponse,
        ProjectsUpdateItemForOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForOrgResponse
  }

  /**
   * Raised by `projects/update-item-for-org` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ProjectsUpdateItemForOrgApiException(
    public val error: ProjectsUpdateItemForOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/update-item-for-org")

  private object ProjectsUpdateItemForOrgResponseDecoder : SdkResponseAlternativeDecoder<ProjectsUpdateItemForOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsUpdateItemForOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsUpdateItemForOrgResponse> = when {
      alternative.id == "projects/update-item-for-org.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsUpdateItemForOrgResponse.SuccessJson(
          json = ProjectsCodecs.projectsUpdateItemForOrgResponseCodecAlternative0Registry.select(listOf("projects/update-item-for-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/update-item-for-org.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsUpdateItemForOrgResponse.Http401Json(
          json = ProjectsCodecs.projectsUpdateItemForOrgResponseCodecAlternative1Registry.select(listOf("projects/update-item-for-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/update-item-for-org.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsUpdateItemForOrgResponse.Http403Json(
          json = ProjectsCodecs.projectsUpdateItemForOrgResponseCodecAlternative2Registry.select(listOf("projects/update-item-for-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/update-item-for-org.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsUpdateItemForOrgResponse.Http404Json(
          json = ProjectsCodecs.projectsUpdateItemForOrgResponseCodecAlternative3Registry.select(listOf("projects/update-item-for-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/update-item-for-org.response.alternative4" -> SdkResponseDecodeResult(
        value = ProjectsUpdateItemForOrgResponse.Http422Json(
          json = ProjectsCodecs.projectsUpdateItemForOrgResponseCodecAlternative4Registry.select(listOf("projects/update-item-for-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsUpdateItemForOrgResponse = ProjectsUpdateItemForOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `projects/update-item-for-user` may expose through its typed API
   * exception.
   */
  public sealed interface ProjectsUpdateItemForUserError

  /**
   * Typed response alternatives for `projects/update-item-for-user`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ProjectsUpdateItemForUserResponse {
    public class SuccessJson(
      public val json: ProjectsV2ItemWithContent,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForUserResponse

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForUserResponse,
        ProjectsUpdateItemForUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForUserResponse,
        ProjectsUpdateItemForUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForUserResponse,
        ProjectsUpdateItemForUserError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForUserResponse,
        ProjectsUpdateItemForUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ProjectsUpdateItemForUserResponse
  }

  /**
   * Raised by `projects/update-item-for-user` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ProjectsUpdateItemForUserApiException(
    public val error: ProjectsUpdateItemForUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "projects/update-item-for-user")

  private object ProjectsUpdateItemForUserResponseDecoder : SdkResponseAlternativeDecoder<ProjectsUpdateItemForUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ProjectsUpdateItemForUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ProjectsUpdateItemForUserResponse> = when {
      alternative.id == "projects/update-item-for-user.response.alternative0" -> SdkResponseDecodeResult(
        value = ProjectsUpdateItemForUserResponse.SuccessJson(
          json = ProjectsCodecs.projectsUpdateItemForUserResponseCodecAlternative0Registry.select(listOf("projects/update-item-for-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/update-item-for-user.response.alternative1" -> SdkResponseDecodeResult(
        value = ProjectsUpdateItemForUserResponse.Http401Json(
          json = ProjectsCodecs.projectsUpdateItemForUserResponseCodecAlternative1Registry.select(listOf("projects/update-item-for-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/update-item-for-user.response.alternative2" -> SdkResponseDecodeResult(
        value = ProjectsUpdateItemForUserResponse.Http403Json(
          json = ProjectsCodecs.projectsUpdateItemForUserResponseCodecAlternative2Registry.select(listOf("projects/update-item-for-user.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/update-item-for-user.response.alternative3" -> SdkResponseDecodeResult(
        value = ProjectsUpdateItemForUserResponse.Http404Json(
          json = ProjectsCodecs.projectsUpdateItemForUserResponseCodecAlternative3Registry.select(listOf("projects/update-item-for-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "projects/update-item-for-user.response.alternative4" -> SdkResponseDecodeResult(
        value = ProjectsUpdateItemForUserResponse.Http422Json(
          json = ProjectsCodecs.projectsUpdateItemForUserResponseCodecAlternative4Registry.select(listOf("projects/update-item-for-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ProjectsUpdateItemForUserResponse = ProjectsUpdateItemForUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val projectsAddFieldForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/add-field-for-org",
          method = "POST",
          path = "/orgs/{org}/projectsV2/{project_number}/fields",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2Field",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/add-field-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/add-field-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/add-field-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/add-field-for-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/add-field-for-org.response.alternative4",
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

    internal val projectsAddFieldForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/add-field-for-user",
          method = "POST",
          path = "/users/{username}/projectsV2/{project_number}/fields",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2Field",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/add-field-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/add-field-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/add-field-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/add-field-for-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/add-field-for-user.response.alternative4",
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

    internal val projectsCreateViewForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/create-view-for-org",
          method = "POST",
          path = "/orgs/{org}/projectsV2/{project_number}/views",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2View",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-org.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-org.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-org.response.alternative6",
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

    internal val projectsCreateViewForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/create-view-for-user",
          method = "POST",
          path = "/users/{user_id}/projectsV2/{project_number}/views",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2View",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-user.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/create-view-for-user.response.alternative6",
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

    internal val projectsDeleteItemForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/delete-item-for-org",
          method = "DELETE",
          path = "/orgs/{org}/projectsV2/{project_number}/items/{item_id}",
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
              id = "projects/delete-item-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/delete-item-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/delete-item-for-org.response.alternative2",
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

    internal val projectsDeleteItemForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/delete-item-for-user",
          method = "DELETE",
          path = "/users/{username}/projectsV2/{project_number}/items/{item_id}",
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
              id = "projects/delete-item-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/delete-item-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/delete-item-for-user.response.alternative2",
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

    internal val projectsGetFieldForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/get-field-for-org",
          method = "GET",
          path = "/orgs/{org}/projectsV2/{project_number}/fields/{field_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2Field",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-field-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-field-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-field-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-field-for-org.response.alternative3",
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

    internal val projectsGetFieldForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/get-field-for-user",
          method = "GET",
          path = "/users/{username}/projectsV2/{project_number}/fields/{field_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2Field",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-field-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-field-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-field-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-field-for-user.response.alternative3",
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

    internal val projectsGetForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/get-for-org",
          method = "GET",
          path = "/orgs/{org}/projectsV2/{project_number}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-for-org.response.alternative3",
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

    internal val projectsGetForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/get-for-user",
          method = "GET",
          path = "/users/{username}/projectsV2/{project_number}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-for-user.response.alternative3",
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

    internal val projectsGetOrgItemMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/get-org-item",
          method = "GET",
          path = "/orgs/{org}/projectsV2/{project_number}/items/{item_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2ItemWithContent",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-org-item.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-org-item.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-org-item.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-org-item.response.alternative3",
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

    internal val projectsGetUserItemMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/get-user-item",
          method = "GET",
          path = "/users/{username}/projectsV2/{project_number}/items/{item_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2ItemWithContent",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-user-item.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-user-item.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-user-item.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/get-user-item.response.alternative3",
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

    internal val projectsListFieldsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/list-fields-for-org",
          method = "GET",
          path = "/orgs/{org}/projectsV2/{project_number}/fields",
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
              id = "projects/list-fields-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-fields-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-fields-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-fields-for-org.response.alternative3",
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

    internal val projectsListFieldsForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/list-fields-for-user",
          method = "GET",
          path = "/users/{username}/projectsV2/{project_number}/fields",
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
              id = "projects/list-fields-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-fields-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-fields-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-fields-for-user.response.alternative3",
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

    internal val projectsListForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/list-for-org",
          method = "GET",
          path = "/orgs/{org}/projectsV2",
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
              id = "projects/list-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-for-org.response.alternative3",
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

    internal val projectsListForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/list-for-user",
          method = "GET",
          path = "/users/{username}/projectsV2",
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
              id = "projects/list-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-for-user.response.alternative3",
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

    internal val projectsListItemsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/list-items-for-org",
          method = "GET",
          path = "/orgs/{org}/projectsV2/{project_number}/items",
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
              id = "projects/list-items-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-items-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-items-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-items-for-org.response.alternative3",
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

    internal val projectsListItemsForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/list-items-for-user",
          method = "GET",
          path = "/users/{username}/projectsV2/{project_number}/items",
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
              id = "projects/list-items-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-items-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-items-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-items-for-user.response.alternative3",
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

    internal val projectsListViewItemsForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/list-view-items-for-org",
          method = "GET",
          path = "/orgs/{org}/projectsV2/{project_number}/views/{view_number}/items",
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
              id = "projects/list-view-items-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-view-items-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-view-items-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-view-items-for-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-view-items-for-org.response.alternative4",
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

    internal val projectsListViewItemsForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/list-view-items-for-user",
          method = "GET",
          path = "/users/{username}/projectsV2/{project_number}/views/{view_number}/items",
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
              id = "projects/list-view-items-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-view-items-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-view-items-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-view-items-for-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/list-view-items-for-user.response.alternative4",
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

    internal val projectsUpdateItemForOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/update-item-for-org",
          method = "PATCH",
          path = "/orgs/{org}/projectsV2/{project_number}/items/{item_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2ItemWithContent",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/update-item-for-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/update-item-for-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/update-item-for-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/update-item-for-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/update-item-for-org.response.alternative4",
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

    internal val projectsUpdateItemForUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "projects/update-item-for-user",
          method = "PATCH",
          path = "/users/{username}/projectsV2/{project_number}/items/{item_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ProjectsV2ItemWithContent",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/update-item-for-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/update-item-for-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/update-item-for-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/update-item-for-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "projects/update-item-for-user.response.alternative4",
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
