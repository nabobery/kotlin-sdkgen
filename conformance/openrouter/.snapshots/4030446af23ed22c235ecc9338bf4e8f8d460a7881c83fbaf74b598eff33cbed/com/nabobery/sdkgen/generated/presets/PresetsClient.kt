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

internal object PresetsCodecs {
  internal const val CREATEPRESETSCHATCOMPLETIONS_REQUEST_CODEC_ID: String =
      "createPresetsChatCompletions.request"

  private val createPresetsChatCompletionsRequestCodec: MediaTypeCodec<ChatRequest> =
      KotlinxSerializationCodec(CREATEPRESETSCHATCOMPLETIONS_REQUEST_CODEC_ID, ChatRequest.Serializer, SdkJson)

  internal const val CREATEPRESETSCHATCOMPLETIONS_RESPONSE_CODEC_ID: String =
      "createPresetsChatCompletions.response"

  private val createPresetsChatCompletionsResponseCodec:
      MediaTypeCodec<CreatePresetFromInferenceResponse> =
      KotlinxSerializationCodec(CREATEPRESETSCHATCOMPLETIONS_RESPONSE_CODEC_ID, CreatePresetFromInferenceResponse.Serializer, SdkJson)

  private val createPresetsChatCompletionsResponseCodecAlternative0Codec:
      MediaTypeCodec<CreatePresetFromInferenceResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative0", CreatePresetFromInferenceResponse.Serializer, SdkJson)

  internal val createPresetsChatCompletionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative0Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createPresetsChatCompletionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative1Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createPresetsChatCompletionsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative2Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative3Codec:
      MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val createPresetsChatCompletionsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative3Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative4Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  internal val createPresetsChatCompletionsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative4Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative5Codec:
      MediaTypeCodec<ConflictResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative5", ConflictResponse.Serializer, SdkJson)

  internal val createPresetsChatCompletionsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative5Codec)

  private val createPresetsChatCompletionsResponseCodecAlternative6Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createPresetsChatCompletions.response.alternative6", InternalServerResponse.Serializer, SdkJson)

  internal val createPresetsChatCompletionsResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodecAlternative6Codec)

  internal val createPresetsChatCompletionsRequestCodecRegistry: MediaTypeCodecRegistry<ChatRequest>
      = MediaTypeCodecRegistry.of(createPresetsChatCompletionsRequestCodec)

  internal val createPresetsChatCompletionsResponseCodecRegistry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsChatCompletionsResponseCodec)

  internal const val CREATEPRESETSMESSAGES_REQUEST_CODEC_ID: String =
      "createPresetsMessages.request"

  private val createPresetsMessagesRequestCodec: MediaTypeCodec<MessagesRequest> =
      KotlinxSerializationCodec(CREATEPRESETSMESSAGES_REQUEST_CODEC_ID, MessagesRequest.Serializer, SdkJson)

  internal const val CREATEPRESETSMESSAGES_RESPONSE_CODEC_ID: String =
      "createPresetsMessages.response"

  private val createPresetsMessagesResponseCodec: MediaTypeCodec<CreatePresetFromInferenceResponse>
      =
      KotlinxSerializationCodec(CREATEPRESETSMESSAGES_RESPONSE_CODEC_ID, CreatePresetFromInferenceResponse.Serializer, SdkJson)

  private val createPresetsMessagesResponseCodecAlternative0Codec:
      MediaTypeCodec<CreatePresetFromInferenceResponse> =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative0", CreatePresetFromInferenceResponse.Serializer, SdkJson)

  internal val createPresetsMessagesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative0Codec)

  private val createPresetsMessagesResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createPresetsMessagesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative1Codec)

  private val createPresetsMessagesResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createPresetsMessagesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative2Codec)

  private val createPresetsMessagesResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse>
      =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val createPresetsMessagesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative3Codec)

  private val createPresetsMessagesResponseCodecAlternative4Codec: MediaTypeCodec<NotFoundResponse>
      =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  internal val createPresetsMessagesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative4Codec)

  private val createPresetsMessagesResponseCodecAlternative5Codec: MediaTypeCodec<ConflictResponse>
      =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative5", ConflictResponse.Serializer, SdkJson)

  internal val createPresetsMessagesResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative5Codec)

  private val createPresetsMessagesResponseCodecAlternative6Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createPresetsMessages.response.alternative6", InternalServerResponse.Serializer, SdkJson)

  internal val createPresetsMessagesResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodecAlternative6Codec)

  internal val createPresetsMessagesRequestCodecRegistry: MediaTypeCodecRegistry<MessagesRequest> =
      MediaTypeCodecRegistry.of(createPresetsMessagesRequestCodec)

  internal val createPresetsMessagesResponseCodecRegistry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsMessagesResponseCodec)

  internal const val CREATEPRESETSRESPONSES_REQUEST_CODEC_ID: String =
      "createPresetsResponses.request"

  private val createPresetsResponsesRequestCodec: MediaTypeCodec<ResponsesRequest> =
      KotlinxSerializationCodec(CREATEPRESETSRESPONSES_REQUEST_CODEC_ID, ResponsesRequest.Serializer, SdkJson)

  internal const val CREATEPRESETSRESPONSES_RESPONSE_CODEC_ID: String =
      "createPresetsResponses.response"

  private val createPresetsResponsesResponseCodec: MediaTypeCodec<CreatePresetFromInferenceResponse>
      =
      KotlinxSerializationCodec(CREATEPRESETSRESPONSES_RESPONSE_CODEC_ID, CreatePresetFromInferenceResponse.Serializer, SdkJson)

  private val createPresetsResponsesResponseCodecAlternative0Codec:
      MediaTypeCodec<CreatePresetFromInferenceResponse> =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative0", CreatePresetFromInferenceResponse.Serializer, SdkJson)

  internal val createPresetsResponsesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative0Codec)

  private val createPresetsResponsesResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createPresetsResponsesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative1Codec)

  private val createPresetsResponsesResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createPresetsResponsesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative2Codec)

  private val createPresetsResponsesResponseCodecAlternative3Codec:
      MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val createPresetsResponsesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative3Codec)

  private val createPresetsResponsesResponseCodecAlternative4Codec: MediaTypeCodec<NotFoundResponse>
      =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  internal val createPresetsResponsesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative4Codec)

  private val createPresetsResponsesResponseCodecAlternative5Codec: MediaTypeCodec<ConflictResponse>
      =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative5", ConflictResponse.Serializer, SdkJson)

  internal val createPresetsResponsesResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative5Codec)

  private val createPresetsResponsesResponseCodecAlternative6Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createPresetsResponses.response.alternative6", InternalServerResponse.Serializer, SdkJson)

  internal val createPresetsResponsesResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodecAlternative6Codec)

  internal val createPresetsResponsesRequestCodecRegistry: MediaTypeCodecRegistry<ResponsesRequest>
      = MediaTypeCodecRegistry.of(createPresetsResponsesRequestCodec)

  internal val createPresetsResponsesResponseCodecRegistry:
      MediaTypeCodecRegistry<CreatePresetFromInferenceResponse> =
      MediaTypeCodecRegistry.of(createPresetsResponsesResponseCodec)

  internal const val GETPRESET_RESPONSE_CODEC_ID: String = "getPreset.response"

  private val getPresetResponseCodec: MediaTypeCodec<GetPresetResponse> =
      KotlinxSerializationCodec(GETPRESET_RESPONSE_CODEC_ID, GetPresetResponse.Serializer, SdkJson)

  private val getPresetResponseCodecAlternative0Codec: MediaTypeCodec<GetPresetResponse> =
      KotlinxSerializationCodec("getPreset.response.alternative0", GetPresetResponse.Serializer, SdkJson)

  internal val getPresetResponseCodecAlternative0Registry: MediaTypeCodecRegistry<GetPresetResponse>
      = MediaTypeCodecRegistry.of(getPresetResponseCodecAlternative0Codec)

  private val getPresetResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("getPreset.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val getPresetResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(getPresetResponseCodecAlternative1Codec)

  private val getPresetResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getPreset.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val getPresetResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getPresetResponseCodecAlternative2Codec)

  private val getPresetResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getPreset.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val getPresetResponseCodecAlternative3Registry: MediaTypeCodecRegistry<NotFoundResponse>
      = MediaTypeCodecRegistry.of(getPresetResponseCodecAlternative3Codec)

  private val getPresetResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getPreset.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val getPresetResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getPresetResponseCodecAlternative4Codec)

  internal val getPresetRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getPresetResponseCodecRegistry: MediaTypeCodecRegistry<GetPresetResponse> =
      MediaTypeCodecRegistry.of(getPresetResponseCodec)

  internal const val GETPRESETVERSION_RESPONSE_CODEC_ID: String = "getPresetVersion.response"

  private val getPresetVersionResponseCodec: MediaTypeCodec<GetPresetVersionResponse> =
      KotlinxSerializationCodec(GETPRESETVERSION_RESPONSE_CODEC_ID, GetPresetVersionResponse.Serializer, SdkJson)

  private val getPresetVersionResponseCodecAlternative0Codec:
      MediaTypeCodec<GetPresetVersionResponse> =
      KotlinxSerializationCodec("getPresetVersion.response.alternative0", GetPresetVersionResponse.Serializer, SdkJson)

  internal val getPresetVersionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GetPresetVersionResponse> =
      MediaTypeCodecRegistry.of(getPresetVersionResponseCodecAlternative0Codec)

  private val getPresetVersionResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("getPresetVersion.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val getPresetVersionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(getPresetVersionResponseCodecAlternative1Codec)

  private val getPresetVersionResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getPresetVersion.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val getPresetVersionResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getPresetVersionResponseCodecAlternative2Codec)

  private val getPresetVersionResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getPresetVersion.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val getPresetVersionResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getPresetVersionResponseCodecAlternative3Codec)

  private val getPresetVersionResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("getPresetVersion.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val getPresetVersionResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getPresetVersionResponseCodecAlternative4Codec)

  internal val getPresetVersionRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getPresetVersionResponseCodecRegistry:
      MediaTypeCodecRegistry<GetPresetVersionResponse> =
      MediaTypeCodecRegistry.of(getPresetVersionResponseCodec)

  internal const val LISTPRESETVERSIONS_RESPONSE_CODEC_ID: String = "listPresetVersions.response"

  private val listPresetVersionsResponseCodec: MediaTypeCodec<ListPresetVersionsResponse> =
      KotlinxSerializationCodec(LISTPRESETVERSIONS_RESPONSE_CODEC_ID, ListPresetVersionsResponse.Serializer, SdkJson)

  private val listPresetVersionsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListPresetVersionsResponse> =
      KotlinxSerializationCodec("listPresetVersions.response.alternative0", ListPresetVersionsResponse.Serializer, SdkJson)

  internal val listPresetVersionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListPresetVersionsResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodecAlternative0Codec)

  private val listPresetVersionsResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("listPresetVersions.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val listPresetVersionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodecAlternative1Codec)

  private val listPresetVersionsResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse>
      =
      KotlinxSerializationCodec("listPresetVersions.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val listPresetVersionsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodecAlternative2Codec)

  private val listPresetVersionsResponseCodecAlternative3Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listPresetVersions.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val listPresetVersionsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodecAlternative3Codec)

  private val listPresetVersionsResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listPresetVersions.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  internal val listPresetVersionsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodecAlternative4Codec)

  internal val listPresetVersionsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listPresetVersionsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListPresetVersionsResponse> =
      MediaTypeCodecRegistry.of(listPresetVersionsResponseCodec)

  internal const val LISTPRESETS_RESPONSE_CODEC_ID: String = "listPresets.response"

  private val listPresetsResponseCodec: MediaTypeCodec<ListPresetsResponse> =
      KotlinxSerializationCodec(LISTPRESETS_RESPONSE_CODEC_ID, ListPresetsResponse.Serializer, SdkJson)

  private val listPresetsResponseCodecAlternative0Codec: MediaTypeCodec<ListPresetsResponse> =
      KotlinxSerializationCodec("listPresets.response.alternative0", ListPresetsResponse.Serializer, SdkJson)

  internal val listPresetsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListPresetsResponse> =
      MediaTypeCodecRegistry.of(listPresetsResponseCodecAlternative0Codec)

  private val listPresetsResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("listPresets.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val listPresetsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(listPresetsResponseCodecAlternative1Codec)

  private val listPresetsResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listPresets.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val listPresetsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listPresetsResponseCodecAlternative2Codec)

  private val listPresetsResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listPresets.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val listPresetsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listPresetsResponseCodecAlternative3Codec)

  internal val listPresetsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listPresetsResponseCodecRegistry: MediaTypeCodecRegistry<ListPresetsResponse> =
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
   * @param slug URL-safe slug identifying the preset. Created if it does not exist.
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
   * @throws CreatePresetsChatCompletionsApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CreatePresetsChatCompletionsError payload.
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
  ): CreatePresetFromInferenceResponse = executor.executeWithTypedErrors<ChatRequest, CreatePresetsChatCompletionsResponse, CreatePresetFromInferenceResponse>(
    request = SdkExecutionRequest(createPresetsChatCompletionsMetadata, baseUri, request, listOf(PresetsCodecs.CREATEPRESETSCHATCOMPLETIONS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PresetsCodecs.createPresetsChatCompletionsRequestCodecRegistry,
    responseDecoder = CreatePresetsChatCompletionsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreatePresetsChatCompletionsResponse.SuccessJson -> response.json
        is CreatePresetsChatCompletionsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsChatCompletionsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsChatCompletionsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsChatCompletionsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsChatCompletionsResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsChatCompletionsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsChatCompletionsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreatePresetsChatCompletionsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreatePresetsChatCompletionsResponse.Http400Json -> CreatePresetsChatCompletionsApiException(response, statusCode, headers)
        is CreatePresetsChatCompletionsResponse.Http401Json -> CreatePresetsChatCompletionsApiException(response, statusCode, headers)
        is CreatePresetsChatCompletionsResponse.Http403Json -> CreatePresetsChatCompletionsApiException(response, statusCode, headers)
        is CreatePresetsChatCompletionsResponse.Http404Json -> CreatePresetsChatCompletionsApiException(response, statusCode, headers)
        is CreatePresetsChatCompletionsResponse.Http409Json -> CreatePresetsChatCompletionsApiException(response, statusCode, headers)
        is CreatePresetsChatCompletionsResponse.Http500Json -> CreatePresetsChatCompletionsApiException(response, statusCode, headers)
        is CreatePresetsChatCompletionsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a preset (or a new version of an existing one) from an inference request body. Only fields that overlap
   * with the preset config are persisted; other fields (e.g. `messages`, `stream`, `prompt`) are silently ignored.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param slug URL-safe slug identifying the preset. Created if it does not exist.
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
  public suspend fun createPresetsChatCompletionsWithResponse(
    request: ChatRequest,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreatePresetsChatCompletionsResponse> = executor.executeWithResponse<ChatRequest, CreatePresetsChatCompletionsResponse>(SdkExecutionRequest(createPresetsChatCompletionsMetadata, baseUri, request, listOf(PresetsCodecs.CREATEPRESETSCHATCOMPLETIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.createPresetsChatCompletionsRequestCodecRegistry, CreatePresetsChatCompletionsResponseDecoder, options)

  /**
   * Creates a preset (or a new version of an existing one) from an inference request body. Only fields that overlap
   * with the preset config are persisted; other fields (e.g. `messages`, `stream`, `prompt`) are silently ignored.
   *
   * @param request Request body sent to the operation.
   * @param slug URL-safe slug identifying the preset. Created if it does not exist.
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
   * @throws CreatePresetsMessagesApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CreatePresetsMessagesError payload.
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
  ): CreatePresetFromInferenceResponse = executor.executeWithTypedErrors<MessagesRequest, CreatePresetsMessagesResponse, CreatePresetFromInferenceResponse>(
    request = SdkExecutionRequest(createPresetsMessagesMetadata, baseUri, request, listOf(PresetsCodecs.CREATEPRESETSMESSAGES_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PresetsCodecs.createPresetsMessagesRequestCodecRegistry,
    responseDecoder = CreatePresetsMessagesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreatePresetsMessagesResponse.SuccessJson -> response.json
        is CreatePresetsMessagesResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsMessagesResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsMessagesResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsMessagesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsMessagesResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsMessagesResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsMessagesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreatePresetsMessagesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreatePresetsMessagesResponse.Http400Json -> CreatePresetsMessagesApiException(response, statusCode, headers)
        is CreatePresetsMessagesResponse.Http401Json -> CreatePresetsMessagesApiException(response, statusCode, headers)
        is CreatePresetsMessagesResponse.Http403Json -> CreatePresetsMessagesApiException(response, statusCode, headers)
        is CreatePresetsMessagesResponse.Http404Json -> CreatePresetsMessagesApiException(response, statusCode, headers)
        is CreatePresetsMessagesResponse.Http409Json -> CreatePresetsMessagesApiException(response, statusCode, headers)
        is CreatePresetsMessagesResponse.Http500Json -> CreatePresetsMessagesApiException(response, statusCode, headers)
        is CreatePresetsMessagesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a preset (or a new version of an existing one) from an inference request body. Only fields that overlap
   * with the preset config are persisted; other fields (e.g. `messages`, `stream`, `prompt`) are silently ignored.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param slug URL-safe slug identifying the preset. Created if it does not exist.
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
  public suspend fun createPresetsMessagesWithResponse(
    request: MessagesRequest,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreatePresetsMessagesResponse> = executor.executeWithResponse<MessagesRequest, CreatePresetsMessagesResponse>(SdkExecutionRequest(createPresetsMessagesMetadata, baseUri, request, listOf(PresetsCodecs.CREATEPRESETSMESSAGES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.createPresetsMessagesRequestCodecRegistry, CreatePresetsMessagesResponseDecoder, options)

  /**
   * Creates a preset (or a new version of an existing one) from an inference request body. Only fields that overlap
   * with the preset config are persisted; other fields (e.g. `messages`, `stream`, `prompt`) are silently ignored.
   *
   * @param request Request body sent to the operation.
   * @param slug URL-safe slug identifying the preset. Created if it does not exist.
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
   * @throws CreatePresetsResponsesApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CreatePresetsResponsesError payload.
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
  ): CreatePresetFromInferenceResponse = executor.executeWithTypedErrors<ResponsesRequest, CreatePresetsResponsesResponse, CreatePresetFromInferenceResponse>(
    request = SdkExecutionRequest(createPresetsResponsesMetadata, baseUri, request, listOf(PresetsCodecs.CREATEPRESETSRESPONSES_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PresetsCodecs.createPresetsResponsesRequestCodecRegistry,
    responseDecoder = CreatePresetsResponsesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreatePresetsResponsesResponse.SuccessJson -> response.json
        is CreatePresetsResponsesResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsResponsesResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsResponsesResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsResponsesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsResponsesResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsResponsesResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreatePresetsResponsesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreatePresetsResponsesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreatePresetsResponsesResponse.Http400Json -> CreatePresetsResponsesApiException(response, statusCode, headers)
        is CreatePresetsResponsesResponse.Http401Json -> CreatePresetsResponsesApiException(response, statusCode, headers)
        is CreatePresetsResponsesResponse.Http403Json -> CreatePresetsResponsesApiException(response, statusCode, headers)
        is CreatePresetsResponsesResponse.Http404Json -> CreatePresetsResponsesApiException(response, statusCode, headers)
        is CreatePresetsResponsesResponse.Http409Json -> CreatePresetsResponsesApiException(response, statusCode, headers)
        is CreatePresetsResponsesResponse.Http500Json -> CreatePresetsResponsesApiException(response, statusCode, headers)
        is CreatePresetsResponsesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a preset (or a new version of an existing one) from an inference request body. Only fields that overlap
   * with the preset config are persisted; other fields (e.g. `messages`, `stream`, `prompt`) are silently ignored.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param slug URL-safe slug identifying the preset. Created if it does not exist.
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
  public suspend fun createPresetsResponsesWithResponse(
    request: ResponsesRequest,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreatePresetsResponsesResponse> = executor.executeWithResponse<ResponsesRequest, CreatePresetsResponsesResponse>(SdkExecutionRequest(createPresetsResponsesMetadata, baseUri, request, listOf(PresetsCodecs.CREATEPRESETSRESPONSES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.createPresetsResponsesRequestCodecRegistry, CreatePresetsResponsesResponseDecoder, options)

  /**
   * Retrieves a preset by its slug with its currently designated version inline.
   *
   * @param slug URL-safe slug identifying the preset.
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
   * @throws GetPresetApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GetPresetError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getPreset(
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.GetPresetResponse = executor.executeWithTypedErrors<Unit, GetPresetResponse, com.nabobery.sdkgen.generated.GetPresetResponse>(
    request = SdkExecutionRequest(getPresetMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PresetsCodecs.getPresetRequestCodecRegistry,
    responseDecoder = GetPresetResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetPresetResponse.SuccessJson -> response.json
        is GetPresetResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is GetPresetResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetPresetResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GetPresetResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetPresetResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetPresetResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetPresetResponse.Http400Json -> GetPresetApiException(response, statusCode, headers)
        is GetPresetResponse.Http401Json -> GetPresetApiException(response, statusCode, headers)
        is GetPresetResponse.Http404Json -> GetPresetApiException(response, statusCode, headers)
        is GetPresetResponse.Http500Json -> GetPresetApiException(response, statusCode, headers)
        is GetPresetResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Retrieves a preset by its slug with its currently designated version inline.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param slug URL-safe slug identifying the preset.
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
  public suspend fun getPresetWithResponse(
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPresetResponse> = executor.executeWithResponse<Unit, GetPresetResponse>(SdkExecutionRequest(getPresetMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.getPresetRequestCodecRegistry, GetPresetResponseDecoder, options)

  /**
   * Retrieves a specific version of a preset by its slug and version number.
   *
   * @param slug URL-safe slug identifying the preset.
   * @param version Version number of the preset.
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
   * @throws GetPresetVersionApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GetPresetVersionError payload.
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
  ): com.nabobery.sdkgen.generated.GetPresetVersionResponse = executor.executeWithTypedErrors<Unit, GetPresetVersionResponse, com.nabobery.sdkgen.generated.GetPresetVersionResponse>(
    request = SdkExecutionRequest(getPresetVersionMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "version", values = listOf(version.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PresetsCodecs.getPresetVersionRequestCodecRegistry,
    responseDecoder = GetPresetVersionResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetPresetVersionResponse.SuccessJson -> response.json
        is GetPresetVersionResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is GetPresetVersionResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetPresetVersionResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GetPresetVersionResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetPresetVersionResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetPresetVersionResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetPresetVersionResponse.Http400Json -> GetPresetVersionApiException(response, statusCode, headers)
        is GetPresetVersionResponse.Http401Json -> GetPresetVersionApiException(response, statusCode, headers)
        is GetPresetVersionResponse.Http404Json -> GetPresetVersionApiException(response, statusCode, headers)
        is GetPresetVersionResponse.Http500Json -> GetPresetVersionApiException(response, statusCode, headers)
        is GetPresetVersionResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Retrieves a specific version of a preset by its slug and version number.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param slug URL-safe slug identifying the preset.
   * @param version Version number of the preset.
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
  public suspend fun getPresetVersionWithResponse(
    slug: String,
    version: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetPresetVersionResponse> = executor.executeWithResponse<Unit, GetPresetVersionResponse>(SdkExecutionRequest(getPresetVersionMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "version", values = listOf(version.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.getPresetVersionRequestCodecRegistry, GetPresetVersionResponseDecoder, options)

  /**
   * Lists all versions of a preset, ordered by version number ascending (oldest first).
   *
   * @param slug URL-safe slug identifying the preset.
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
   * @throws ListPresetVersionsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded ListPresetVersionsError payload.
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
  ): com.nabobery.sdkgen.generated.ListPresetVersionsResponse = executor.executeWithTypedErrors<Unit, ListPresetVersionsResponse, com.nabobery.sdkgen.generated.ListPresetVersionsResponse>(
    request = SdkExecutionRequest(listPresetVersionsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PresetsCodecs.listPresetVersionsRequestCodecRegistry,
    responseDecoder = ListPresetVersionsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListPresetVersionsResponse.SuccessJson -> response.json
        is ListPresetVersionsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is ListPresetVersionsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ListPresetVersionsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ListPresetVersionsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListPresetVersionsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListPresetVersionsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListPresetVersionsResponse.Http400Json -> ListPresetVersionsApiException(response, statusCode, headers)
        is ListPresetVersionsResponse.Http401Json -> ListPresetVersionsApiException(response, statusCode, headers)
        is ListPresetVersionsResponse.Http404Json -> ListPresetVersionsApiException(response, statusCode, headers)
        is ListPresetVersionsResponse.Http500Json -> ListPresetVersionsApiException(response, statusCode, headers)
        is ListPresetVersionsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all versions of a preset, ordered by version number ascending (oldest first).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param slug URL-safe slug identifying the preset.
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
  public suspend fun listPresetVersionsWithResponse(
    slug: String,
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListPresetVersionsResponse> = executor.executeWithResponse<Unit, ListPresetVersionsResponse>(SdkExecutionRequest(listPresetVersionsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.listPresetVersionsRequestCodecRegistry, ListPresetVersionsResponseDecoder, options)

  /**
   * Lists all presets for the authenticated user, ordered by most recently updated first.
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
   * @throws ListPresetsApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded ListPresetsError payload.
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
  ): com.nabobery.sdkgen.generated.ListPresetsResponse = executor.executeWithTypedErrors<Unit, ListPresetsResponse, com.nabobery.sdkgen.generated.ListPresetsResponse>(
    request = SdkExecutionRequest(listPresetsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = PresetsCodecs.listPresetsRequestCodecRegistry,
    responseDecoder = ListPresetsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListPresetsResponse.SuccessJson -> response.json
        is ListPresetsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is ListPresetsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ListPresetsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListPresetsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListPresetsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListPresetsResponse.Http400Json -> ListPresetsApiException(response, statusCode, headers)
        is ListPresetsResponse.Http401Json -> ListPresetsApiException(response, statusCode, headers)
        is ListPresetsResponse.Http500Json -> ListPresetsApiException(response, statusCode, headers)
        is ListPresetsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all presets for the authenticated user, ordered by most recently updated first.
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
  public suspend fun listPresetsWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListPresetsResponse> = executor.executeWithResponse<Unit, ListPresetsResponse>(SdkExecutionRequest(listPresetsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), PresetsCodecs.listPresetsRequestCodecRegistry, ListPresetsResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `createPresetsChatCompletions` may expose through its typed API
   * exception.
   */
  public sealed interface CreatePresetsChatCompletionsError

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
    ) : CreatePresetsChatCompletionsResponse,
        CreatePresetsChatCompletionsError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse,
        CreatePresetsChatCompletionsError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse,
        CreatePresetsChatCompletionsError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse,
        CreatePresetsChatCompletionsError

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse,
        CreatePresetsChatCompletionsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse,
        CreatePresetsChatCompletionsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsChatCompletionsResponse
  }

  /**
   * Raised by `createPresetsChatCompletions` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CreatePresetsChatCompletionsApiException(
    public val error: CreatePresetsChatCompletionsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createPresetsChatCompletions")

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
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative0Registry.select(listOf("createPresetsChatCompletions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative1" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http400Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative1Registry.select(listOf("createPresetsChatCompletions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative2" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http401Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative2Registry.select(listOf("createPresetsChatCompletions.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative3" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http403Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative3Registry.select(listOf("createPresetsChatCompletions.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative4" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http404Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative4Registry.select(listOf("createPresetsChatCompletions.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative5" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http409Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative5Registry.select(listOf("createPresetsChatCompletions.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsChatCompletions.response.alternative6" -> SdkResponseDecodeResult(
        value = CreatePresetsChatCompletionsResponse.Http500Json(
          json = PresetsCodecs.createPresetsChatCompletionsResponseCodecAlternative6Registry.select(listOf("createPresetsChatCompletions.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CreatePresetsChatCompletionsResponse = CreatePresetsChatCompletionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `createPresetsMessages` may expose through its typed API exception.
   */
  public sealed interface CreatePresetsMessagesError

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
    ) : CreatePresetsMessagesResponse,
        CreatePresetsMessagesError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse,
        CreatePresetsMessagesError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse,
        CreatePresetsMessagesError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse,
        CreatePresetsMessagesError

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse,
        CreatePresetsMessagesError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse,
        CreatePresetsMessagesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsMessagesResponse
  }

  /**
   * Raised by `createPresetsMessages` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CreatePresetsMessagesApiException(
    public val error: CreatePresetsMessagesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createPresetsMessages")

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
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative0Registry.select(listOf("createPresetsMessages.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative1" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http400Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative1Registry.select(listOf("createPresetsMessages.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative2" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http401Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative2Registry.select(listOf("createPresetsMessages.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative3" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http403Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative3Registry.select(listOf("createPresetsMessages.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative4" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http404Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative4Registry.select(listOf("createPresetsMessages.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative5" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http409Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative5Registry.select(listOf("createPresetsMessages.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsMessages.response.alternative6" -> SdkResponseDecodeResult(
        value = CreatePresetsMessagesResponse.Http500Json(
          json = PresetsCodecs.createPresetsMessagesResponseCodecAlternative6Registry.select(listOf("createPresetsMessages.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
   * Decoded non-success response alternatives that `createPresetsResponses` may expose through its typed API exception.
   */
  public sealed interface CreatePresetsResponsesError

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
    ) : CreatePresetsResponsesResponse,
        CreatePresetsResponsesError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse,
        CreatePresetsResponsesError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse,
        CreatePresetsResponsesError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse,
        CreatePresetsResponsesError

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse,
        CreatePresetsResponsesError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse,
        CreatePresetsResponsesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreatePresetsResponsesResponse
  }

  /**
   * Raised by `createPresetsResponses` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CreatePresetsResponsesApiException(
    public val error: CreatePresetsResponsesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createPresetsResponses")

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
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative0Registry.select(listOf("createPresetsResponses.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative1" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http400Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative1Registry.select(listOf("createPresetsResponses.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative2" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http401Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative2Registry.select(listOf("createPresetsResponses.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative3" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http403Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative3Registry.select(listOf("createPresetsResponses.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative4" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http404Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative4Registry.select(listOf("createPresetsResponses.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative5" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http409Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative5Registry.select(listOf("createPresetsResponses.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createPresetsResponses.response.alternative6" -> SdkResponseDecodeResult(
        value = CreatePresetsResponsesResponse.Http500Json(
          json = PresetsCodecs.createPresetsResponsesResponseCodecAlternative6Registry.select(listOf("createPresetsResponses.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CreatePresetsResponsesResponse = CreatePresetsResponsesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `getPreset` may expose through its typed API exception.
   */
  public sealed interface GetPresetError

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
    ) : GetPresetResponse,
        GetPresetError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetResponse,
        GetPresetError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetResponse,
        GetPresetError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetResponse,
        GetPresetError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetResponse
  }

  /**
   * Raised by `getPreset` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class GetPresetApiException(
    public val error: GetPresetError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getPreset")

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
          json = PresetsCodecs.getPresetResponseCodecAlternative0Registry.select(listOf("getPreset.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPreset.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPresetResponse.Http400Json(
          json = PresetsCodecs.getPresetResponseCodecAlternative1Registry.select(listOf("getPreset.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPreset.response.alternative2" -> SdkResponseDecodeResult(
        value = GetPresetResponse.Http401Json(
          json = PresetsCodecs.getPresetResponseCodecAlternative2Registry.select(listOf("getPreset.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPreset.response.alternative3" -> SdkResponseDecodeResult(
        value = GetPresetResponse.Http404Json(
          json = PresetsCodecs.getPresetResponseCodecAlternative3Registry.select(listOf("getPreset.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPreset.response.alternative4" -> SdkResponseDecodeResult(
        value = GetPresetResponse.Http500Json(
          json = PresetsCodecs.getPresetResponseCodecAlternative4Registry.select(listOf("getPreset.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
   * Decoded non-success response alternatives that `getPresetVersion` may expose through its typed API exception.
   */
  public sealed interface GetPresetVersionError

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
    ) : GetPresetVersionResponse,
        GetPresetVersionError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetVersionResponse,
        GetPresetVersionError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetVersionResponse,
        GetPresetVersionError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetVersionResponse,
        GetPresetVersionError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetPresetVersionResponse
  }

  /**
   * Raised by `getPresetVersion` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class GetPresetVersionApiException(
    public val error: GetPresetVersionError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getPresetVersion")

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
          json = PresetsCodecs.getPresetVersionResponseCodecAlternative0Registry.select(listOf("getPresetVersion.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPresetVersion.response.alternative1" -> SdkResponseDecodeResult(
        value = GetPresetVersionResponse.Http400Json(
          json = PresetsCodecs.getPresetVersionResponseCodecAlternative1Registry.select(listOf("getPresetVersion.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPresetVersion.response.alternative2" -> SdkResponseDecodeResult(
        value = GetPresetVersionResponse.Http401Json(
          json = PresetsCodecs.getPresetVersionResponseCodecAlternative2Registry.select(listOf("getPresetVersion.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPresetVersion.response.alternative3" -> SdkResponseDecodeResult(
        value = GetPresetVersionResponse.Http404Json(
          json = PresetsCodecs.getPresetVersionResponseCodecAlternative3Registry.select(listOf("getPresetVersion.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getPresetVersion.response.alternative4" -> SdkResponseDecodeResult(
        value = GetPresetVersionResponse.Http500Json(
          json = PresetsCodecs.getPresetVersionResponseCodecAlternative4Registry.select(listOf("getPresetVersion.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
   * Decoded non-success response alternatives that `listPresetVersions` may expose through its typed API exception.
   */
  public sealed interface ListPresetVersionsError

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
    ) : ListPresetVersionsResponse,
        ListPresetVersionsError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetVersionsResponse,
        ListPresetVersionsError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetVersionsResponse,
        ListPresetVersionsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetVersionsResponse,
        ListPresetVersionsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetVersionsResponse
  }

  /**
   * Raised by `listPresetVersions` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class ListPresetVersionsApiException(
    public val error: ListPresetVersionsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listPresetVersions")

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
          json = PresetsCodecs.listPresetVersionsResponseCodecAlternative0Registry.select(listOf("listPresetVersions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresetVersions.response.alternative1" -> SdkResponseDecodeResult(
        value = ListPresetVersionsResponse.Http400Json(
          json = PresetsCodecs.listPresetVersionsResponseCodecAlternative1Registry.select(listOf("listPresetVersions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresetVersions.response.alternative2" -> SdkResponseDecodeResult(
        value = ListPresetVersionsResponse.Http401Json(
          json = PresetsCodecs.listPresetVersionsResponseCodecAlternative2Registry.select(listOf("listPresetVersions.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresetVersions.response.alternative3" -> SdkResponseDecodeResult(
        value = ListPresetVersionsResponse.Http404Json(
          json = PresetsCodecs.listPresetVersionsResponseCodecAlternative3Registry.select(listOf("listPresetVersions.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresetVersions.response.alternative4" -> SdkResponseDecodeResult(
        value = ListPresetVersionsResponse.Http500Json(
          json = PresetsCodecs.listPresetVersionsResponseCodecAlternative4Registry.select(listOf("listPresetVersions.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
   * Decoded non-success response alternatives that `listPresets` may expose through its typed API exception.
   */
  public sealed interface ListPresetsError

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
    ) : ListPresetsResponse,
        ListPresetsError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetsResponse,
        ListPresetsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetsResponse,
        ListPresetsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListPresetsResponse
  }

  /**
   * Raised by `listPresets` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class ListPresetsApiException(
    public val error: ListPresetsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listPresets")

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
          json = PresetsCodecs.listPresetsResponseCodecAlternative0Registry.select(listOf("listPresets.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresets.response.alternative1" -> SdkResponseDecodeResult(
        value = ListPresetsResponse.Http400Json(
          json = PresetsCodecs.listPresetsResponseCodecAlternative1Registry.select(listOf("listPresets.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresets.response.alternative2" -> SdkResponseDecodeResult(
        value = ListPresetsResponse.Http401Json(
          json = PresetsCodecs.listPresetsResponseCodecAlternative2Registry.select(listOf("listPresets.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listPresets.response.alternative3" -> SdkResponseDecodeResult(
        value = ListPresetsResponse.Http500Json(
          json = PresetsCodecs.listPresetsResponseCodecAlternative3Registry.select(listOf("listPresets.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    internal val createPresetsChatCompletionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val createPresetsMessagesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val createPresetsResponsesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val getPresetMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val getPresetVersionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val listPresetVersionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val listPresetsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }
  }
}
