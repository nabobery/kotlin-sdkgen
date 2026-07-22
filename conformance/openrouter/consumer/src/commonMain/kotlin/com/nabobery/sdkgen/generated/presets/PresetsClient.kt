package com.nabobery.sdkgen.generated.presets

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.ChatRequest
import com.nabobery.sdkgen.generated.ConflictResponse
import com.nabobery.sdkgen.generated.CreatePresetFromInferenceResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.GetPresetResponse
import com.nabobery.sdkgen.generated.GetPresetVersionResponse
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.ListPresetVersionsResponse
import com.nabobery.sdkgen.generated.ListPresetsResponse
import com.nabobery.sdkgen.generated.MessagesRequest
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.ResponsesRequest
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.UnauthorizedResponse
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

public object PresetsCodecs {
  public const val CREATEPRESETSCHATCOMPLETIONS_REQUEST_CODEC_ID: String =
      "createPresetsChatCompletions.request"

  private val createPresetsChatCompletionsRequestCodec: MediaTypeCodec<ChatRequest> =
      KotlinxSerializationCodec(CREATEPRESETSCHATCOMPLETIONS_REQUEST_CODEC_ID, ChatRequest.Serializer, SdkJson)

  public const val CREATEPRESETSCHATCOMPLETIONS_RESPONSE_CODEC_ID: String =
      "createPresetsChatCompletions.response"

  private val createPresetsChatCompletionsResponseCodec:
      MediaTypeCodec<CreatePresetFromInferenceResponse> =
      KotlinxSerializationCodec(CREATEPRESETSCHATCOMPLETIONS_RESPONSE_CODEC_ID, CreatePresetFromInferenceResponse
        .Serializer, SdkJson)

  private val createPresetsChatCompletionsResponseCodecAlternative0Codec:
      MediaTypeCodec<CreatePresetFromInferenceResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative0", CreatePresetFromInferenceResponse
        .Serializer, SdkJson)

  public val createPresetsChatCompletionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative0Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative1", BadRequestResponse.Serializer,
        SdkJson)

  public val createPresetsChatCompletionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative1Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative2", UnauthorizedResponse.Serializer,
        SdkJson)

  public val createPresetsChatCompletionsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative2Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative3Codec:
      MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative3", ForbiddenResponse.Serializer,
        SdkJson)

  public val createPresetsChatCompletionsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative3Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative4Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative4", NotFoundResponse.Serializer,
        SdkJson)

  public val createPresetsChatCompletionsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative4Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative5Codec:
      MediaTypeCodec<ConflictResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative5", ConflictResponse.Serializer,
        SdkJson)

  public val createPresetsChatCompletionsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative5Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative6Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative6", InternalServerResponse
        .Serializer, SdkJson)

  public val createPresetsChatCompletionsResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative6Codec)

  public val createPresetsChatCompletionsRequestCodecRegistry: MediaTypeCodecRegistry<ChatRequest> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsRequestCodec)

  public val createPresetsChatCompletionsResponseCodecRegistry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodec)

  public const val CREATEPRESETSMESSAGES_REQUEST_CODEC_ID: String = "createPresetsMessages.request"

  private val createPresetsMessagesRequestCodec: MediaTypeCodec<MessagesRequest> =
      KotlinxSerializationCodec(CREATEPRESETSMESSAGES_REQUEST_CODEC_ID, MessagesRequest.Serializer, SdkJson)

  public const val CREATEPRESETSMESSAGES_RESPONSE_CODEC_ID: String =
      "createPresetsMessages.response"

  private val createPresetsMessagesResponseCodec: MediaTypeCodec<CreatePresetFromInferenceResponse>
      =
      KotlinxSerializationCodec(CREATEPRESETSMESSAGES_RESPONSE_CODEC_ID, CreatePresetFromInferenceResponse.Serializer,
        SdkJson)

  private val createPresetsMessagesResponseCodecAlternative0Codec:
      MediaTypeCodec<CreatePresetFromInferenceResponse> =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative0", CreatePresetFromInferenceResponse
        .Serializer, SdkJson)

  public val createPresetsMessagesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative0Codec)

  private val createPresetsMessagesResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val createPresetsMessagesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative1Codec)

  private val createPresetsMessagesResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val createPresetsMessagesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative2Codec)

  private val createPresetsMessagesResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse>
      =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  public val createPresetsMessagesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative3Codec)

  private val createPresetsMessagesResponseCodecAlternative4Codec: MediaTypeCodec<NotFoundResponse>
      =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  public val createPresetsMessagesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative4Codec)

  private val createPresetsMessagesResponseCodecAlternative5Codec: MediaTypeCodec<ConflictResponse>
      =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative5", ConflictResponse.Serializer, SdkJson)

  public val createPresetsMessagesResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative5Codec)

  private val createPresetsMessagesResponseCodecAlternative6Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative6", InternalServerResponse.Serializer,
        SdkJson)

  public val createPresetsMessagesResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative6Codec)

  public val createPresetsMessagesRequestCodecRegistry: MediaTypeCodecRegistry<MessagesRequest> =
      MediaTypeCodecRegistry.of(createPresetsMessagesRequestCodec)

  public val createPresetsMessagesResponseCodecRegistry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodec)

  public const val CREATEPRESETSRESPONSES_REQUEST_CODEC_ID: String =
      "createPresetsResponses.request"

  private val createPresetsResponsesRequestCodec: MediaTypeCodec<ResponsesRequest> =
      KotlinxSerializationCodec(CREATEPRESETSRESPONSES_REQUEST_CODEC_ID, ResponsesRequest.Serializer, SdkJson)

  public const val CREATEPRESETSRESPONSES_RESPONSE_CODEC_ID: String =
      "createPresetsResponses.response"

  private val createPresetsResponsesResponseCodec: MediaTypeCodec<CreatePresetFromInferenceResponse>
      =
      KotlinxSerializationCodec(CREATEPRESETSRESPONSES_RESPONSE_CODEC_ID, CreatePresetFromInferenceResponse.Serializer,
        SdkJson)

  private val createPresetsResponsesResponseCodecAlternative0Codec:
      MediaTypeCodec<CreatePresetFromInferenceResponse> =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative0", CreatePresetFromInferenceResponse
        .Serializer, SdkJson)

  public val createPresetsResponsesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative0Codec)

  private val createPresetsResponsesResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val createPresetsResponsesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative1Codec)

  private val createPresetsResponsesResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative2", UnauthorizedResponse.Serializer,
        SdkJson)

  public val createPresetsResponsesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative2Codec)

  private val createPresetsResponsesResponseCodecAlternative3Codec:
      MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  public val createPresetsResponsesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative3Codec)

  private val createPresetsResponsesResponseCodecAlternative4Codec: MediaTypeCodec<NotFoundResponse>
      =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  public val createPresetsResponsesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative4Codec)

  private val createPresetsResponsesResponseCodecAlternative5Codec: MediaTypeCodec<ConflictResponse>
      =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative5", ConflictResponse.Serializer, SdkJson)

  public val createPresetsResponsesResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative5Codec)

  private val createPresetsResponsesResponseCodecAlternative6Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative6", InternalServerResponse.Serializer,
        SdkJson)

  public val createPresetsResponsesResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative6Codec)

  public val createPresetsResponsesRequestCodecRegistry: MediaTypeCodecRegistry<ResponsesRequest> =
      MediaTypeCodecRegistry.of(createPresetsResponsesRequestCodec)

  public val createPresetsResponsesResponseCodecRegistry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodec)

  public const val GETPRESET_RESPONSE_CODEC_ID: String = "getPreset.response"

  private val getPresetResponseCodec: MediaTypeCodec<GetPresetResponse> =
      KotlinxSerializationCodec(GETPRESET_RESPONSE_CODEC_ID, GetPresetResponse.Serializer, SdkJson)

  private val getPresetResponseCodecAlternative0Codec: MediaTypeCodec<GetPresetResponse> =
      KotlinxSerializationCodec("getPreset.response.alternative0", GetPresetResponse.Serializer, SdkJson)

  public val getPresetResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GetPresetResponse> =
      MediaTypeCodecRegistry.of(getPresetResponseCodecAlternative0Codec)

  private val getPresetResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("getPreset.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val getPresetResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BadRequestResponse>
      = MediaTypeCodecRegistry.of(getPresetResponseCodecAlternative1Codec)

  private val getPresetResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getPreset.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val getPresetResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getPresetResponseCodecAlternative2Codec)

  private val getPresetResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getPreset.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  public val getPresetResponseCodecAlternative3Registry: MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getPresetResponseCodecAlternative3Codec)

  private val getPresetResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getPreset.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val getPresetResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getPresetResponseCodecAlternative4Codec)

  public val getPresetRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getPresetResponseCodecRegistry: MediaTypeCodecRegistry<GetPresetResponse> =
      MediaTypeCodecRegistry.of(getPresetResponseCodec)

  public const val GETPRESETVERSION_RESPONSE_CODEC_ID: String = "getPresetVersion.response"

  private val getPresetVersionResponseCodec: MediaTypeCodec<GetPresetVersionResponse> =
      KotlinxSerializationCodec(GETPRESETVERSION_RESPONSE_CODEC_ID, GetPresetVersionResponse.Serializer, SdkJson)

  private val getPresetVersionResponseCodecAlternative0Codec:
      MediaTypeCodec<GetPresetVersionResponse> =
      KotlinxSerializationCodec("getPresetVersion.response.alternative0", GetPresetVersionResponse.Serializer, SdkJson)

  public val getPresetVersionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GetPresetVersionResponse> =
      MediaTypeCodecRegistry.of(getPresetVersionResponseCodecAlternative0Codec)

  private val getPresetVersionResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("getPresetVersion.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val getPresetVersionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(getPresetVersionResponseCodecAlternative1Codec)

  private val getPresetVersionResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getPresetVersion.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val getPresetVersionResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getPresetVersionResponseCodecAlternative2Codec)

  private val getPresetVersionResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getPresetVersion.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  public val getPresetVersionResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getPresetVersionResponseCodecAlternative3Codec)

  private val getPresetVersionResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("getPresetVersion.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val getPresetVersionResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getPresetVersionResponseCodecAlternative4Codec)

  public val getPresetVersionRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getPresetVersionResponseCodecRegistry: MediaTypeCodecRegistry<GetPresetVersionResponse>
      = MediaTypeCodecRegistry.of(getPresetVersionResponseCodec)

  public const val LISTPRESETVERSIONS_RESPONSE_CODEC_ID: String = "listPresetVersions.response"

  private val listPresetVersionsResponseCodec: MediaTypeCodec<ListPresetVersionsResponse> =
      KotlinxSerializationCodec(LISTPRESETVERSIONS_RESPONSE_CODEC_ID, ListPresetVersionsResponse.Serializer, SdkJson)

  private val listPresetVersionsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListPresetVersionsResponse> =
      KotlinxSerializationCodec("listPresetVersions.response.alternative0", ListPresetVersionsResponse.Serializer,
        SdkJson)

  public val listPresetVersionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListPresetVersionsResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodecAlternative0Codec)

  private val listPresetVersionsResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("listPresetVersions.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val listPresetVersionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodecAlternative1Codec)

  private val listPresetVersionsResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse>
      =
      KotlinxSerializationCodec("listPresetVersions.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val listPresetVersionsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodecAlternative2Codec)

  private val listPresetVersionsResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listPresetVersions.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  public val listPresetVersionsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodecAlternative3Codec)

  private val listPresetVersionsResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listPresetVersions.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val listPresetVersionsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodecAlternative4Codec)

  public val listPresetVersionsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listPresetVersionsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListPresetVersionsResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodec)

  public const val LISTPRESETS_RESPONSE_CODEC_ID: String = "listPresets.response"

  private val listPresetsResponseCodec: MediaTypeCodec<ListPresetsResponse> =
      KotlinxSerializationCodec(LISTPRESETS_RESPONSE_CODEC_ID, ListPresetsResponse.Serializer, SdkJson)

  private val listPresetsResponseCodecAlternative0Codec: MediaTypeCodec<ListPresetsResponse> =
      KotlinxSerializationCodec("listPresets.response.alternative0", ListPresetsResponse.Serializer, SdkJson)

  public val listPresetsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListPresetsResponse> =
      MediaTypeCodecRegistry.of(listPresetsResponseCodecAlternative0Codec)

  private val listPresetsResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("listPresets.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val listPresetsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(listPresetsResponseCodecAlternative1Codec)

  private val listPresetsResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listPresets.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val listPresetsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listPresetsResponseCodecAlternative2Codec)

  private val listPresetsResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listPresets.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  public val listPresetsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listPresetsResponseCodecAlternative3Codec)

  public val listPresetsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listPresetsResponseCodecRegistry: MediaTypeCodecRegistry<ListPresetsResponse> =
      MediaTypeCodecRegistry.of(listPresetsResponseCodec)
}

/**
 * Client for the 'Presets' group of OpenRouter API.
 */
public class PresetsClient(
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
      SdkExecutor(transport, authentication = this@PresetsClient.authentication)

  /**
   * Creates a preset (or a new version of an existing one) from an inference request body. Only fields that overlap
   * with the preset config are persisted; other fields (e.g. `messages`, `stream`, `prompt`) are silently ignored.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createPresetsChatCompletions(
    request: ChatRequest,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): CreatePresetFromInferenceResponse = executor.execute<ChatRequest,
    CreatePresetFromInferenceResponse>(SdkExecutionRequest(createPresetsChatCompletionsMetadata, baseUri, request,
      listOf(PresetsCodecs.CREATEPRESETSCHATCOMPLETIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(PresetsCodecs.CREATEPRESETSCHATCOMPLETIONS_RESPONSE_CODEC_ID), PresetsCodecs
    .createPresetsChatCompletionsRequestCodecRegistry, PresetsCodecs.createPresetsChatCompletionsResponseCodecRegistry,
      options)

  /**
   * Creates a preset (or a new version of an existing one) from an inference request body. Only fields that overlap
   * with the preset config are persisted; other fields (e.g. `messages`, `stream`, `prompt`) are silently ignored.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createPresetsChatCompletionsWithResponse(
    request: ChatRequest,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreatePresetsChatCompletionsResponse> = executor.executeWithResponse<ChatRequest,
    CreatePresetsChatCompletionsResponse>(SdkExecutionRequest(createPresetsChatCompletionsMetadata, baseUri, request,
      listOf(PresetsCodecs.CREATEPRESETSCHATCOMPLETIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.createPresetsChatCompletionsRequestCodecRegistry, CreatePresetsChatCompletionsResponseDecoder,
    options)

  /**
   * Creates a preset (or a new version of an existing one) from an inference request body. Only fields that overlap
   * with the preset config are persisted; other fields (e.g. `messages`, `stream`, `prompt`) are silently ignored.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createPresetsMessages(
    request: MessagesRequest,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): CreatePresetFromInferenceResponse = executor.execute<MessagesRequest,
    CreatePresetFromInferenceResponse>(SdkExecutionRequest(createPresetsMessagesMetadata, baseUri, request,
      listOf(PresetsCodecs.CREATEPRESETSMESSAGES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(PresetsCodecs.CREATEPRESETSMESSAGES_RESPONSE_CODEC_ID), PresetsCodecs
    .createPresetsMessagesRequestCodecRegistry, PresetsCodecs.createPresetsMessagesResponseCodecRegistry, options)

  /**
   * Creates a preset (or a new version of an existing one) from an inference request body. Only fields that overlap
   * with the preset config are persisted; other fields (e.g. `messages`, `stream`, `prompt`) are silently ignored.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createPresetsMessagesWithResponse(
    request: MessagesRequest,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreatePresetsMessagesResponse> = executor.executeWithResponse<MessagesRequest,
    CreatePresetsMessagesResponse>(SdkExecutionRequest(createPresetsMessagesMetadata, baseUri, request,
      listOf(PresetsCodecs.CREATEPRESETSMESSAGES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.createPresetsMessagesRequestCodecRegistry, CreatePresetsMessagesResponseDecoder, options)

  /**
   * Creates a preset (or a new version of an existing one) from an inference request body. Only fields that overlap
   * with the preset config are persisted; other fields (e.g. `messages`, `stream`, `prompt`) are silently ignored.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createPresetsResponses(
    request: ResponsesRequest,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): CreatePresetFromInferenceResponse = executor.execute<ResponsesRequest,
    CreatePresetFromInferenceResponse>(SdkExecutionRequest(createPresetsResponsesMetadata, baseUri, request,
      listOf(PresetsCodecs.CREATEPRESETSRESPONSES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(PresetsCodecs.CREATEPRESETSRESPONSES_RESPONSE_CODEC_ID), PresetsCodecs
    .createPresetsResponsesRequestCodecRegistry, PresetsCodecs.createPresetsResponsesResponseCodecRegistry, options)

  /**
   * Creates a preset (or a new version of an existing one) from an inference request body. Only fields that overlap
   * with the preset config are persisted; other fields (e.g. `messages`, `stream`, `prompt`) are silently ignored.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createPresetsResponsesWithResponse(
    request: ResponsesRequest,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreatePresetsResponsesResponse> = executor.executeWithResponse<ResponsesRequest,
    CreatePresetsResponsesResponse>(SdkExecutionRequest(createPresetsResponsesMetadata, baseUri, request,
      listOf(PresetsCodecs.CREATEPRESETSRESPONSES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.createPresetsResponsesRequestCodecRegistry, CreatePresetsResponsesResponseDecoder, options)

  /**
   * Retrieves a preset by its slug with its currently designated version inline.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getPreset(
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.GetPresetResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .GetPresetResponse>(SdkExecutionRequest(getPresetMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(PresetsCodecs.GETPRESET_RESPONSE_CODEC_ID), PresetsCodecs.getPresetRequestCodecRegistry, PresetsCodecs
    .getPresetResponseCodecRegistry, options)

  /**
   * Retrieves a preset by its slug with its currently designated version inline.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getPresetWithResponse(
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPresetResponse> = executor.executeWithResponse<Unit,
    GetPresetResponse>(SdkExecutionRequest(getPresetMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.getPresetRequestCodecRegistry, GetPresetResponseDecoder, options)

  /**
   * Retrieves a specific version of a preset by its slug and version number.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getPresetVersion(
    slug: String,
    version: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.GetPresetVersionResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .GetPresetVersionResponse>(SdkExecutionRequest(getPresetVersionMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "version", values = listOf(version
      .toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(PresetsCodecs.GETPRESETVERSION_RESPONSE_CODEC_ID), PresetsCodecs.getPresetVersionRequestCodecRegistry,
    PresetsCodecs.getPresetVersionResponseCodecRegistry, options)

  /**
   * Retrieves a specific version of a preset by its slug and version number.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getPresetVersionWithResponse(
    slug: String,
    version: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPresetVersionResponse> = executor.executeWithResponse<Unit,
    GetPresetVersionResponse>(SdkExecutionRequest(getPresetVersionMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "version", values = listOf(version
      .toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.getPresetVersionRequestCodecRegistry, GetPresetVersionResponseDecoder, options)

  /**
   * Lists all versions of a preset, ordered by version number ascending (oldest first).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listPresetVersions(
    slug: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListPresetVersionsResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .ListPresetVersionsResponse>(SdkExecutionRequest(listPresetVersionsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
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
  }), listOf(PresetsCodecs.LISTPRESETVERSIONS_RESPONSE_CODEC_ID), PresetsCodecs.listPresetVersionsRequestCodecRegistry,
    PresetsCodecs.listPresetVersionsResponseCodecRegistry, options)

  /**
   * Lists all versions of a preset, ordered by version number ascending (oldest first).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listPresetVersionsWithResponse(
    slug: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListPresetVersionsResponse> = executor.executeWithResponse<Unit,
    ListPresetVersionsResponse>(SdkExecutionRequest(listPresetVersionsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
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
  }), PresetsCodecs.listPresetVersionsRequestCodecRegistry, ListPresetVersionsResponseDecoder, options)

  /**
   * Lists all presets for the authenticated user, ordered by most recently updated first.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listPresets(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListPresetsResponse = executor.execute<Unit, com.nabobery.sdkgen.generated
    .ListPresetsResponse>(SdkExecutionRequest(listPresetsMetadata, baseUri, Unit, emptyList(), buildList {
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
  }), listOf(PresetsCodecs.LISTPRESETS_RESPONSE_CODEC_ID), PresetsCodecs.listPresetsRequestCodecRegistry, PresetsCodecs
    .listPresetsResponseCodecRegistry, options)

  /**
   * Lists all presets for the authenticated user, ordered by most recently updated first.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listPresetsWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListPresetsResponse> = executor.executeWithResponse<Unit,
    ListPresetsResponse>(SdkExecutionRequest(listPresetsMetadata, baseUri, Unit, emptyList(), buildList {
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
  }), PresetsCodecs.listPresetsRequestCodecRegistry, ListPresetsResponseDecoder, options)

  /**
   * Typed response alternatives for `createPresetsChatCompletions`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CreatePresetsChatCompletionsResponse {
    public class SuccessJson(
      public val json: CreatePresetFromInferenceResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse
  }

  private object CreatePresetsChatCompletionsResponseDecoder : SdkResponseAlternativeDecoder<CreatePresetsChatCompletionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreatePresetsChatCompletionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreatePresetsChatCompletionsResponse> = when {
      alternative.id == "createPresetsChatCompletions.response.alternative0" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.SuccessJson(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative0Registry
            .select(listOf("createPresetsChatCompletions.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative1" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http400Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative1Registry
            .select(listOf("createPresetsChatCompletions.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative2" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http401Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative2Registry
            .select(listOf("createPresetsChatCompletions.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative3" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http403Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative3Registry
            .select(listOf("createPresetsChatCompletions.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative4" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http404Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative4Registry
            .select(listOf("createPresetsChatCompletions.response.alternative4"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative5" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http409Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative5Registry
            .select(listOf("createPresetsChatCompletions.response.alternative5"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative6" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http500Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative6Registry
            .select(listOf("createPresetsChatCompletions.response.alternative6"), mediaType ?: "application/json")
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
    ): CreatePresetsChatCompletionsResponse = CreatePresetsChatCompletionsResponse.Unknown(statusCode = statusCode,
      headers = headers)
  }

  /**
   * Typed response alternatives for `createPresetsMessages`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CreatePresetsMessagesResponse {
    public class SuccessJson(
      public val json: CreatePresetFromInferenceResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse
  }

  private object CreatePresetsMessagesResponseDecoder : SdkResponseAlternativeDecoder<CreatePresetsMessagesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreatePresetsMessagesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreatePresetsMessagesResponse> = when {
      alternative.id == "createPresetsMessages.response.alternative0" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.SuccessJson(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative0Registry
            .select(listOf("createPresetsMessages.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative1" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http400Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative1Registry
            .select(listOf("createPresetsMessages.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative2" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http401Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative2Registry
            .select(listOf("createPresetsMessages.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative3" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http403Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative3Registry
            .select(listOf("createPresetsMessages.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative4" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http404Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative4Registry
            .select(listOf("createPresetsMessages.response.alternative4"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative5" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http409Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative5Registry
            .select(listOf("createPresetsMessages.response.alternative5"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative6" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http500Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative6Registry
            .select(listOf("createPresetsMessages.response.alternative6"), mediaType ?: "application/json")
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
    ): CreatePresetsMessagesResponse = CreatePresetsMessagesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `createPresetsResponses`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CreatePresetsResponsesResponse {
    public class SuccessJson(
      public val json: CreatePresetFromInferenceResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse
  }

  private object CreatePresetsResponsesResponseDecoder : SdkResponseAlternativeDecoder<CreatePresetsResponsesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreatePresetsResponsesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreatePresetsResponsesResponse> = when {
      alternative.id == "createPresetsResponses.response.alternative0" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.SuccessJson(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative0Registry
            .select(listOf("createPresetsResponses.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative1" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http400Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative1Registry
            .select(listOf("createPresetsResponses.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative2" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http401Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative2Registry
            .select(listOf("createPresetsResponses.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative3" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http403Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative3Registry
            .select(listOf("createPresetsResponses.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative4" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http404Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative4Registry
            .select(listOf("createPresetsResponses.response.alternative4"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative5" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http409Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative5Registry
            .select(listOf("createPresetsResponses.response.alternative5"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative6" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http500Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative6Registry
            .select(listOf("createPresetsResponses.response.alternative6"), mediaType ?: "application/json")
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
    ): CreatePresetsResponsesResponse = CreatePresetsResponsesResponse.Unknown(statusCode = statusCode, headers =
      headers)
  }

  /**
   * Typed response alternatives for `getPreset`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetPresetResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.GetPresetResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetResponse
  }

  private object GetPresetResponseDecoder : SdkResponseAlternativeDecoder<GetPresetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPresetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPresetResponse> = when {
      alternative.id == "getPreset.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPresetResponse.SuccessJson(
          json = PresetsCodecs.getPresetResponseCodecAlternative0Registry
            .select(listOf("getPreset.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPreset.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPresetResponse.Http400Json(
          json = PresetsCodecs.getPresetResponseCodecAlternative1Registry
            .select(listOf("getPreset.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPreset.response.alternative2" -> SdkResponseDecodeResult(
        value = GetPresetResponse.Http401Json(
          json = PresetsCodecs.getPresetResponseCodecAlternative2Registry
            .select(listOf("getPreset.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPreset.response.alternative3" -> SdkResponseDecodeResult(
        value = GetPresetResponse.Http404Json(
          json = PresetsCodecs.getPresetResponseCodecAlternative3Registry
            .select(listOf("getPreset.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPreset.response.alternative4" -> SdkResponseDecodeResult(
        value = GetPresetResponse.Http500Json(
          json = PresetsCodecs.getPresetResponseCodecAlternative4Registry
            .select(listOf("getPreset.response.alternative4"), mediaType ?: "application/json").decode(body,
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
    ): GetPresetResponse = GetPresetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `getPresetVersion`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetPresetVersionResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.GetPresetVersionResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetVersionResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetVersionResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetVersionResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetVersionResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetVersionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetVersionResponse
  }

  private object GetPresetVersionResponseDecoder : SdkResponseAlternativeDecoder<GetPresetVersionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetPresetVersionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetPresetVersionResponse> = when {
      alternative.id == "getPresetVersion.response.alternative0" -> SdkResponseDecodeResult(
        value = GetPresetVersionResponse.SuccessJson(
          json = PresetsCodecs.getPresetVersionResponseCodecAlternative0Registry
            .select(listOf("getPresetVersion.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPresetVersion.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPresetVersionResponse.Http400Json(
          json = PresetsCodecs.getPresetVersionResponseCodecAlternative1Registry
            .select(listOf("getPresetVersion.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPresetVersion.response.alternative2" -> SdkResponseDecodeResult(
        value = GetPresetVersionResponse.Http401Json(
          json = PresetsCodecs.getPresetVersionResponseCodecAlternative2Registry
            .select(listOf("getPresetVersion.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPresetVersion.response.alternative3" -> SdkResponseDecodeResult(
        value = GetPresetVersionResponse.Http404Json(
          json = PresetsCodecs.getPresetVersionResponseCodecAlternative3Registry
            .select(listOf("getPresetVersion.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPresetVersion.response.alternative4" -> SdkResponseDecodeResult(
        value = GetPresetVersionResponse.Http500Json(
          json = PresetsCodecs.getPresetVersionResponseCodecAlternative4Registry
            .select(listOf("getPresetVersion.response.alternative4"), mediaType ?: "application/json").decode(body,
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
    ): GetPresetVersionResponse = GetPresetVersionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `listPresetVersions`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface ListPresetVersionsResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListPresetVersionsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetVersionsResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetVersionsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetVersionsResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetVersionsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetVersionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetVersionsResponse
  }

  private object ListPresetVersionsResponseDecoder : SdkResponseAlternativeDecoder<ListPresetVersionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListPresetVersionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListPresetVersionsResponse> = when {
      alternative.id == "listPresetVersions.response.alternative0" -> SdkResponseDecodeResult(
        value = ListPresetVersionsResponse.SuccessJson(
          json = PresetsCodecs.listPresetVersionsResponseCodecAlternative0Registry
            .select(listOf("listPresetVersions.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresetVersions.response.alternative1" -> SdkResponseDecodeResult(
        value = ListPresetVersionsResponse.Http400Json(
          json = PresetsCodecs.listPresetVersionsResponseCodecAlternative1Registry
            .select(listOf("listPresetVersions.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresetVersions.response.alternative2" -> SdkResponseDecodeResult(
        value = ListPresetVersionsResponse.Http401Json(
          json = PresetsCodecs.listPresetVersionsResponseCodecAlternative2Registry
            .select(listOf("listPresetVersions.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresetVersions.response.alternative3" -> SdkResponseDecodeResult(
        value = ListPresetVersionsResponse.Http404Json(
          json = PresetsCodecs.listPresetVersionsResponseCodecAlternative3Registry
            .select(listOf("listPresetVersions.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresetVersions.response.alternative4" -> SdkResponseDecodeResult(
        value = ListPresetVersionsResponse.Http500Json(
          json = PresetsCodecs.listPresetVersionsResponseCodecAlternative4Registry
            .select(listOf("listPresetVersions.response.alternative4"), mediaType ?: "application/json").decode(body,
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
    ): ListPresetVersionsResponse = ListPresetVersionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `listPresets`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListPresetsResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListPresetsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetsResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetsResponse
  }

  private object ListPresetsResponseDecoder : SdkResponseAlternativeDecoder<ListPresetsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListPresetsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListPresetsResponse> = when {
      alternative.id == "listPresets.response.alternative0" -> SdkResponseDecodeResult(
        value = ListPresetsResponse.SuccessJson(
          json = PresetsCodecs.listPresetsResponseCodecAlternative0Registry
            .select(listOf("listPresets.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresets.response.alternative1" -> SdkResponseDecodeResult(
        value = ListPresetsResponse.Http400Json(
          json = PresetsCodecs.listPresetsResponseCodecAlternative1Registry
            .select(listOf("listPresets.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresets.response.alternative2" -> SdkResponseDecodeResult(
        value = ListPresetsResponse.Http401Json(
          json = PresetsCodecs.listPresetsResponseCodecAlternative2Registry
            .select(listOf("listPresets.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresets.response.alternative3" -> SdkResponseDecodeResult(
        value = ListPresetsResponse.Http500Json(
          json = PresetsCodecs.listPresetsResponseCodecAlternative3Registry
            .select(listOf("listPresets.response.alternative3"), mediaType ?: "application/json").decode(body,
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
    ): ListPresetsResponse = ListPresetsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val createPresetsChatCompletionsMetadata: OperationMetadata = OperationMetadata(
          operationId = "createPresetsChatCompletions",
          method = "POST",
          path = "/presets/{slug}/chat/completions",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CreatePresetFromInferenceResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsChatCompletions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsChatCompletions.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsChatCompletions.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsChatCompletions.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsChatCompletions.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "ConflictResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsChatCompletions.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsChatCompletions.response.alternative6",
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

    public val createPresetsMessagesMetadata: OperationMetadata = OperationMetadata(
          operationId = "createPresetsMessages",
          method = "POST",
          path = "/presets/{slug}/messages",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CreatePresetFromInferenceResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsMessages.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsMessages.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsMessages.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsMessages.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsMessages.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "ConflictResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsMessages.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsMessages.response.alternative6",
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

    public val createPresetsResponsesMetadata: OperationMetadata = OperationMetadata(
          operationId = "createPresetsResponses",
          method = "POST",
          path = "/presets/{slug}/responses",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CreatePresetFromInferenceResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsResponses.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsResponses.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsResponses.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsResponses.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsResponses.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "ConflictResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsResponses.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createPresetsResponses.response.alternative6",
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

    public val getPresetMetadata: OperationMetadata = OperationMetadata(
          operationId = "getPreset",
          method = "GET",
          path = "/presets/{slug}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GetPresetResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getPreset.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getPreset.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getPreset.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getPreset.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getPreset.response.alternative4",
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

    public val getPresetVersionMetadata: OperationMetadata = OperationMetadata(
          operationId = "getPresetVersion",
          method = "GET",
          path = "/presets/{slug}/versions/{version}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GetPresetVersionResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getPresetVersion.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getPresetVersion.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getPresetVersion.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getPresetVersion.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getPresetVersion.response.alternative4",
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

    public val listPresetVersionsMetadata: OperationMetadata = OperationMetadata(
          operationId = "listPresetVersions",
          method = "GET",
          path = "/presets/{slug}/versions",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListPresetVersionsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listPresetVersions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listPresetVersions.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listPresetVersions.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listPresetVersions.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listPresetVersions.response.alternative4",
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

    public val listPresetsMetadata: OperationMetadata = OperationMetadata(
          operationId = "listPresets",
          method = "GET",
          path = "/presets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListPresetsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listPresets.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listPresets.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listPresets.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listPresets.response.alternative3",
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
  }
}
