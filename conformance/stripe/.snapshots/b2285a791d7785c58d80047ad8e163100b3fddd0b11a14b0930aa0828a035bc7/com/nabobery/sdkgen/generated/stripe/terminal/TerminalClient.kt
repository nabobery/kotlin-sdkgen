package com.nabobery.sdkgen.generated.stripe.terminal

import com.nabobery.sdkgen.generated.stripe.DeletedTerminalConfiguration
import com.nabobery.sdkgen.generated.stripe.DeletedTerminalLocation
import com.nabobery.sdkgen.generated.stripe.DeletedTerminalReader
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalConfigurationsGetResponse200JsonXb465ea87
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalConnectionTokensPostRequestFormXa133cd51
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalLocationsGetResponse200JsonX0ba0f556
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalLocationsGetResponse200JsonX60b92cce
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalLocationsPostRequestFormX2fb2d15d
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalOnboardingLinksPostRequestFormXcee20784
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersCancelActionPostRequestFormX920448c6
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersGetParameterX1c327cde
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersGetParameterX71ea6570
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersGetResponse200JsonX7ec8c9fd
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersGetResponse200JsonXfb8527fc
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersPostRequestFormX89ae8d1b
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc
import com.nabobery.sdkgen.generated.stripe.InlineV1TerminalRefundsPostRequestFormX533386be
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.TerminalConnectionToken
import com.nabobery.sdkgen.generated.stripe.TerminalLocation
import com.nabobery.sdkgen.generated.stripe.TerminalOnboardingLink
import com.nabobery.sdkgen.generated.stripe.TerminalReader
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
import com.nabobery.sdkgen.runtime.SdkRequestBody
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
import com.nabobery.sdkgen.runtime.bodies.FormUrlEncodedBody
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

public object TerminalCodecs {
  public const val DELETETERMINALCONFIGURATIONSCONFIGURATION_REQUEST_CODEC_ID: String =
      "DeleteTerminalConfigurationsConfiguration.request"

  private val deleteTerminalConfigurationsConfigurationRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteTerminalConfigurationsConfigurationFormCodec

  private val deleteTerminalConfigurationsConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedTerminalConfiguration> =
      KotlinxSerializationCodec("DeleteTerminalConfigurationsConfiguration.response.alternative0", DeletedTerminalConfiguration.Serializer, SdkJson)

  public val deleteTerminalConfigurationsConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedTerminalConfiguration> =
      MediaTypeCodecRegistry.of(deleteTerminalConfigurationsConfigurationResponseCodecAlternative0Codec)

  private val deleteTerminalConfigurationsConfigurationResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteTerminalConfigurationsConfiguration.response.alternative1", Error.Serializer, SdkJson)

  public val deleteTerminalConfigurationsConfigurationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteTerminalConfigurationsConfigurationResponseCodecAlternative1Codec)

  public val deleteTerminalConfigurationsConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteTerminalConfigurationsConfigurationRequestCodec)

  public const val DELETETERMINALLOCATIONSLOCATION_REQUEST_CODEC_ID: String =
      "DeleteTerminalLocationsLocation.request"

  private val deleteTerminalLocationsLocationRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteTerminalLocationsLocationFormCodec

  private val deleteTerminalLocationsLocationResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedTerminalLocation> =
      KotlinxSerializationCodec("DeleteTerminalLocationsLocation.response.alternative0", DeletedTerminalLocation.Serializer, SdkJson)

  public val deleteTerminalLocationsLocationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedTerminalLocation> =
      MediaTypeCodecRegistry.of(deleteTerminalLocationsLocationResponseCodecAlternative0Codec)

  private val deleteTerminalLocationsLocationResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteTerminalLocationsLocation.response.alternative1", Error.Serializer, SdkJson)

  public val deleteTerminalLocationsLocationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteTerminalLocationsLocationResponseCodecAlternative1Codec)

  public val deleteTerminalLocationsLocationRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteTerminalLocationsLocationRequestCodec)

  public const val DELETETERMINALREADERSREADER_REQUEST_CODEC_ID: String =
      "DeleteTerminalReadersReader.request"

  private val deleteTerminalReadersReaderRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteTerminalReadersReaderFormCodec

  private val deleteTerminalReadersReaderResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedTerminalReader> =
      KotlinxSerializationCodec("DeleteTerminalReadersReader.response.alternative0", DeletedTerminalReader.Serializer, SdkJson)

  public val deleteTerminalReadersReaderResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedTerminalReader> =
      MediaTypeCodecRegistry.of(deleteTerminalReadersReaderResponseCodecAlternative0Codec)

  private val deleteTerminalReadersReaderResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteTerminalReadersReader.response.alternative1", Error.Serializer, SdkJson)

  public val deleteTerminalReadersReaderResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteTerminalReadersReaderResponseCodecAlternative1Codec)

  public val deleteTerminalReadersReaderRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteTerminalReadersReaderRequestCodec)

  public const val GETTERMINALCONFIGURATIONS_REQUEST_CODEC_ID: String =
      "GetTerminalConfigurations.request"

  private val getTerminalConfigurationsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTerminalConfigurationsFormCodec

  private val getTerminalConfigurationsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TerminalConfigurationsGetResponse200JsonXb465ea87> =
      KotlinxSerializationCodec("GetTerminalConfigurations.response.alternative0", InlineV1TerminalConfigurationsGetResponse200JsonXb465ea87.Serializer, SdkJson)

  public val getTerminalConfigurationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TerminalConfigurationsGetResponse200JsonXb465ea87> =
      MediaTypeCodecRegistry.of(getTerminalConfigurationsResponseCodecAlternative0Codec)

  private val getTerminalConfigurationsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTerminalConfigurations.response.alternative1", Error.Serializer, SdkJson)

  public val getTerminalConfigurationsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTerminalConfigurationsResponseCodecAlternative1Codec)

  public val getTerminalConfigurationsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTerminalConfigurationsRequestCodec)

  public const val GETTERMINALCONFIGURATIONSCONFIGURATION_REQUEST_CODEC_ID: String =
      "GetTerminalConfigurationsConfiguration.request"

  private val getTerminalConfigurationsConfigurationRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTerminalConfigurationsConfigurationFormCodec

  private val getTerminalConfigurationsConfigurationResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47> =
      KotlinxSerializationCodec("GetTerminalConfigurationsConfiguration.response.alternative0", InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47.Serializer, SdkJson)

  public val getTerminalConfigurationsConfigurationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47> =
      MediaTypeCodecRegistry.of(getTerminalConfigurationsConfigurationResponseCodecAlternative0Codec)

  private val getTerminalConfigurationsConfigurationResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTerminalConfigurationsConfiguration.response.alternative1", Error.Serializer, SdkJson)

  public val getTerminalConfigurationsConfigurationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTerminalConfigurationsConfigurationResponseCodecAlternative1Codec)

  public val getTerminalConfigurationsConfigurationRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTerminalConfigurationsConfigurationRequestCodec)

  public const val GETTERMINALLOCATIONS_REQUEST_CODEC_ID: String = "GetTerminalLocations.request"

  private val getTerminalLocationsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTerminalLocationsFormCodec

  private val getTerminalLocationsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TerminalLocationsGetResponse200JsonX0ba0f556> =
      KotlinxSerializationCodec("GetTerminalLocations.response.alternative0", InlineV1TerminalLocationsGetResponse200JsonX0ba0f556.Serializer, SdkJson)

  public val getTerminalLocationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TerminalLocationsGetResponse200JsonX0ba0f556> =
      MediaTypeCodecRegistry.of(getTerminalLocationsResponseCodecAlternative0Codec)

  private val getTerminalLocationsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTerminalLocations.response.alternative1", Error.Serializer, SdkJson)

  public val getTerminalLocationsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTerminalLocationsResponseCodecAlternative1Codec)

  public val getTerminalLocationsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTerminalLocationsRequestCodec)

  public const val GETTERMINALLOCATIONSLOCATION_REQUEST_CODEC_ID: String =
      "GetTerminalLocationsLocation.request"

  private val getTerminalLocationsLocationRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTerminalLocationsLocationFormCodec

  private val getTerminalLocationsLocationResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TerminalLocationsGetResponse200JsonX60b92cce> =
      KotlinxSerializationCodec("GetTerminalLocationsLocation.response.alternative0", InlineV1TerminalLocationsGetResponse200JsonX60b92cce.Serializer, SdkJson)

  public val getTerminalLocationsLocationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TerminalLocationsGetResponse200JsonX60b92cce> =
      MediaTypeCodecRegistry.of(getTerminalLocationsLocationResponseCodecAlternative0Codec)

  private val getTerminalLocationsLocationResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTerminalLocationsLocation.response.alternative1", Error.Serializer, SdkJson)

  public val getTerminalLocationsLocationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTerminalLocationsLocationResponseCodecAlternative1Codec)

  public val getTerminalLocationsLocationRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTerminalLocationsLocationRequestCodec)

  public const val GETTERMINALREADERS_REQUEST_CODEC_ID: String = "GetTerminalReaders.request"

  private val getTerminalReadersRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTerminalReadersFormCodec

  private val getTerminalReadersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TerminalReadersGetResponse200JsonX7ec8c9fd> =
      KotlinxSerializationCodec("GetTerminalReaders.response.alternative0", InlineV1TerminalReadersGetResponse200JsonX7ec8c9fd.Serializer, SdkJson)

  public val getTerminalReadersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TerminalReadersGetResponse200JsonX7ec8c9fd> =
      MediaTypeCodecRegistry.of(getTerminalReadersResponseCodecAlternative0Codec)

  private val getTerminalReadersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTerminalReaders.response.alternative1", Error.Serializer, SdkJson)

  public val getTerminalReadersResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTerminalReadersResponseCodecAlternative1Codec)

  public val getTerminalReadersRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTerminalReadersRequestCodec)

  public const val GETTERMINALREADERSREADER_REQUEST_CODEC_ID: String =
      "GetTerminalReadersReader.request"

  private val getTerminalReadersReaderRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTerminalReadersReaderFormCodec

  private val getTerminalReadersReaderResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TerminalReadersGetResponse200JsonXfb8527fc> =
      KotlinxSerializationCodec("GetTerminalReadersReader.response.alternative0", InlineV1TerminalReadersGetResponse200JsonXfb8527fc.Serializer, SdkJson)

  public val getTerminalReadersReaderResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TerminalReadersGetResponse200JsonXfb8527fc> =
      MediaTypeCodecRegistry.of(getTerminalReadersReaderResponseCodecAlternative0Codec)

  private val getTerminalReadersReaderResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTerminalReadersReader.response.alternative1", Error.Serializer, SdkJson)

  public val getTerminalReadersReaderResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTerminalReadersReaderResponseCodecAlternative1Codec)

  public val getTerminalReadersReaderRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTerminalReadersReaderRequestCodec)

  public const val POSTTERMINALCONNECTIONTOKENS_REQUEST_CODEC_ID: String =
      "PostTerminalConnectionTokens.request"

  private val postTerminalConnectionTokensRequestCodec:
      MediaTypeCodec<InlineV1TerminalConnectionTokensPostRequestFormXa133cd51?> =
      PostTerminalConnectionTokensFormCodec

  private val postTerminalConnectionTokensResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalConnectionToken> =
      KotlinxSerializationCodec("PostTerminalConnectionTokens.response.alternative0", TerminalConnectionToken.Serializer, SdkJson)

  public val postTerminalConnectionTokensResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalConnectionToken> =
      MediaTypeCodecRegistry.of(postTerminalConnectionTokensResponseCodecAlternative0Codec)

  private val postTerminalConnectionTokensResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalConnectionTokens.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalConnectionTokensResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalConnectionTokensResponseCodecAlternative1Codec)

  public val postTerminalConnectionTokensRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalConnectionTokensPostRequestFormXa133cd51?> =
      MediaTypeCodecRegistry.of(postTerminalConnectionTokensRequestCodec)

  public const val POSTTERMINALLOCATIONS_REQUEST_CODEC_ID: String = "PostTerminalLocations.request"

  private val postTerminalLocationsRequestCodec:
      MediaTypeCodec<InlineV1TerminalLocationsPostRequestFormX2fb2d15d?> =
      PostTerminalLocationsFormCodec

  private val postTerminalLocationsResponseCodecAlternative0Codec: MediaTypeCodec<TerminalLocation>
      =
      KotlinxSerializationCodec("PostTerminalLocations.response.alternative0", TerminalLocation.Serializer, SdkJson)

  public val postTerminalLocationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalLocation> =
      MediaTypeCodecRegistry.of(postTerminalLocationsResponseCodecAlternative0Codec)

  private val postTerminalLocationsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalLocations.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalLocationsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalLocationsResponseCodecAlternative1Codec)

  public val postTerminalLocationsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalLocationsPostRequestFormX2fb2d15d?> =
      MediaTypeCodecRegistry.of(postTerminalLocationsRequestCodec)

  public const val POSTTERMINALONBOARDINGLINKS_REQUEST_CODEC_ID: String =
      "PostTerminalOnboardingLinks.request"

  private val postTerminalOnboardingLinksRequestCodec:
      MediaTypeCodec<InlineV1TerminalOnboardingLinksPostRequestFormXcee20784> =
      PostTerminalOnboardingLinksFormCodec

  private val postTerminalOnboardingLinksResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalOnboardingLink> =
      KotlinxSerializationCodec("PostTerminalOnboardingLinks.response.alternative0", TerminalOnboardingLink.Serializer, SdkJson)

  public val postTerminalOnboardingLinksResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalOnboardingLink> =
      MediaTypeCodecRegistry.of(postTerminalOnboardingLinksResponseCodecAlternative0Codec)

  private val postTerminalOnboardingLinksResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalOnboardingLinks.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalOnboardingLinksResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalOnboardingLinksResponseCodecAlternative1Codec)

  public val postTerminalOnboardingLinksRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalOnboardingLinksPostRequestFormXcee20784> =
      MediaTypeCodecRegistry.of(postTerminalOnboardingLinksRequestCodec)

  public const val POSTTERMINALREADERS_REQUEST_CODEC_ID: String = "PostTerminalReaders.request"

  private val postTerminalReadersRequestCodec:
      MediaTypeCodec<InlineV1TerminalReadersPostRequestFormX89ae8d1b> = PostTerminalReadersFormCodec

  private val postTerminalReadersResponseCodecAlternative0Codec: MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTerminalReaders.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTerminalReadersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTerminalReadersResponseCodecAlternative0Codec)

  private val postTerminalReadersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalReaders.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalReadersResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalReadersResponseCodecAlternative1Codec)

  public val postTerminalReadersRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalReadersPostRequestFormX89ae8d1b> =
      MediaTypeCodecRegistry.of(postTerminalReadersRequestCodec)

  public const val POSTTERMINALREADERSREADERCANCELACTION_REQUEST_CODEC_ID: String =
      "PostTerminalReadersReaderCancelAction.request"

  private val postTerminalReadersReaderCancelActionRequestCodec:
      MediaTypeCodec<InlineV1TerminalReadersCancelActionPostRequestFormX920448c6?> =
      PostTerminalReadersReaderCancelActionFormCodec

  private val postTerminalReadersReaderCancelActionResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTerminalReadersReaderCancelAction.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTerminalReadersReaderCancelActionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderCancelActionResponseCodecAlternative0Codec)

  private val postTerminalReadersReaderCancelActionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalReadersReaderCancelAction.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalReadersReaderCancelActionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderCancelActionResponseCodecAlternative1Codec)

  public val postTerminalReadersReaderCancelActionRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalReadersCancelActionPostRequestFormX920448c6?> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderCancelActionRequestCodec)

  public const val POSTTERMINALREADERSREADERCOLLECTINPUTS_REQUEST_CODEC_ID: String =
      "PostTerminalReadersReaderCollectInputs.request"

  private val postTerminalReadersReaderCollectInputsRequestCodec:
      MediaTypeCodec<InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d> =
      PostTerminalReadersReaderCollectInputsFormCodec

  private val postTerminalReadersReaderCollectInputsResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTerminalReadersReaderCollectInputs.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTerminalReadersReaderCollectInputsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderCollectInputsResponseCodecAlternative0Codec)

  private val postTerminalReadersReaderCollectInputsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalReadersReaderCollectInputs.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalReadersReaderCollectInputsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderCollectInputsResponseCodecAlternative1Codec)

  public val postTerminalReadersReaderCollectInputsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderCollectInputsRequestCodec)

  public const val POSTTERMINALREADERSREADERCOLLECTPAYMENTMETHOD_REQUEST_CODEC_ID: String =
      "PostTerminalReadersReaderCollectPaymentMethod.request"

  private val postTerminalReadersReaderCollectPaymentMethodRequestCodec:
      MediaTypeCodec<InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535> =
      PostTerminalReadersReaderCollectPaymentMethodFormCodec

  private val postTerminalReadersReaderCollectPaymentMethodResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTerminalReadersReaderCollectPaymentMethod.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTerminalReadersReaderCollectPaymentMethodResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderCollectPaymentMethodResponseCodecAlternative0Codec)

  private val postTerminalReadersReaderCollectPaymentMethodResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalReadersReaderCollectPaymentMethod.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalReadersReaderCollectPaymentMethodResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderCollectPaymentMethodResponseCodecAlternative1Codec)

  public val postTerminalReadersReaderCollectPaymentMethodRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderCollectPaymentMethodRequestCodec)

  public const val POSTTERMINALREADERSREADERCONFIRMPAYMENTINTENT_REQUEST_CODEC_ID: String =
      "PostTerminalReadersReaderConfirmPaymentIntent.request"

  private val postTerminalReadersReaderConfirmPaymentIntentRequestCodec:
      MediaTypeCodec<InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c> =
      PostTerminalReadersReaderConfirmPaymentIntentFormCodec

  private val postTerminalReadersReaderConfirmPaymentIntentResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTerminalReadersReaderConfirmPaymentIntent.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTerminalReadersReaderConfirmPaymentIntentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderConfirmPaymentIntentResponseCodecAlternative0Codec)

  private val postTerminalReadersReaderConfirmPaymentIntentResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalReadersReaderConfirmPaymentIntent.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalReadersReaderConfirmPaymentIntentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderConfirmPaymentIntentResponseCodecAlternative1Codec)

  public val postTerminalReadersReaderConfirmPaymentIntentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderConfirmPaymentIntentRequestCodec)

  public const val POSTTERMINALREADERSREADERPROCESSPAYMENTINTENT_REQUEST_CODEC_ID: String =
      "PostTerminalReadersReaderProcessPaymentIntent.request"

  private val postTerminalReadersReaderProcessPaymentIntentRequestCodec:
      MediaTypeCodec<InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402> =
      PostTerminalReadersReaderProcessPaymentIntentFormCodec

  private val postTerminalReadersReaderProcessPaymentIntentResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTerminalReadersReaderProcessPaymentIntent.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTerminalReadersReaderProcessPaymentIntentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderProcessPaymentIntentResponseCodecAlternative0Codec)

  private val postTerminalReadersReaderProcessPaymentIntentResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalReadersReaderProcessPaymentIntent.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalReadersReaderProcessPaymentIntentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderProcessPaymentIntentResponseCodecAlternative1Codec)

  public val postTerminalReadersReaderProcessPaymentIntentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderProcessPaymentIntentRequestCodec)

  public const val POSTTERMINALREADERSREADERPROCESSSETUPINTENT_REQUEST_CODEC_ID: String =
      "PostTerminalReadersReaderProcessSetupIntent.request"

  private val postTerminalReadersReaderProcessSetupIntentRequestCodec:
      MediaTypeCodec<InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04> =
      PostTerminalReadersReaderProcessSetupIntentFormCodec

  private val postTerminalReadersReaderProcessSetupIntentResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTerminalReadersReaderProcessSetupIntent.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTerminalReadersReaderProcessSetupIntentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderProcessSetupIntentResponseCodecAlternative0Codec)

  private val postTerminalReadersReaderProcessSetupIntentResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalReadersReaderProcessSetupIntent.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalReadersReaderProcessSetupIntentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderProcessSetupIntentResponseCodecAlternative1Codec)

  public val postTerminalReadersReaderProcessSetupIntentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderProcessSetupIntentRequestCodec)

  public const val POSTTERMINALREADERSREADERREFUNDPAYMENT_REQUEST_CODEC_ID: String =
      "PostTerminalReadersReaderRefundPayment.request"

  private val postTerminalReadersReaderRefundPaymentRequestCodec:
      MediaTypeCodec<InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab?> =
      PostTerminalReadersReaderRefundPaymentFormCodec

  private val postTerminalReadersReaderRefundPaymentResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTerminalReadersReaderRefundPayment.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTerminalReadersReaderRefundPaymentResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderRefundPaymentResponseCodecAlternative0Codec)

  private val postTerminalReadersReaderRefundPaymentResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalReadersReaderRefundPayment.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalReadersReaderRefundPaymentResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderRefundPaymentResponseCodecAlternative1Codec)

  public val postTerminalReadersReaderRefundPaymentRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab?> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderRefundPaymentRequestCodec)

  public const val POSTTERMINALREADERSREADERSETREADERDISPLAY_REQUEST_CODEC_ID: String =
      "PostTerminalReadersReaderSetReaderDisplay.request"

  private val postTerminalReadersReaderSetReaderDisplayRequestCodec:
      MediaTypeCodec<InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc> =
      PostTerminalReadersReaderSetReaderDisplayFormCodec

  private val postTerminalReadersReaderSetReaderDisplayResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTerminalReadersReaderSetReaderDisplay.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTerminalReadersReaderSetReaderDisplayResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderSetReaderDisplayResponseCodecAlternative0Codec)

  private val postTerminalReadersReaderSetReaderDisplayResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalReadersReaderSetReaderDisplay.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalReadersReaderSetReaderDisplayResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderSetReaderDisplayResponseCodecAlternative1Codec)

  public val postTerminalReadersReaderSetReaderDisplayRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc> =
      MediaTypeCodecRegistry.of(postTerminalReadersReaderSetReaderDisplayRequestCodec)

  public const val POSTTERMINALREFUNDS_REQUEST_CODEC_ID: String = "PostTerminalRefunds.request"

  private val postTerminalRefundsRequestCodec:
      MediaTypeCodec<InlineV1TerminalRefundsPostRequestFormX533386be?> =
      PostTerminalRefundsFormCodec

  private val postTerminalRefundsResponseCodecAlternative0Codec: MediaTypeCodec<JsonObject> =
      KotlinxSerializationCodec("PostTerminalRefunds.response.alternative0", JsonObject.serializer(), SdkJson)

  public val postTerminalRefundsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<JsonObject> =
      MediaTypeCodecRegistry.of(postTerminalRefundsResponseCodecAlternative0Codec)

  private val postTerminalRefundsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTerminalRefunds.response.alternative1", Error.Serializer, SdkJson)

  public val postTerminalRefundsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTerminalRefundsResponseCodecAlternative1Codec)

  public val postTerminalRefundsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TerminalRefundsPostRequestFormX533386be?> =
      MediaTypeCodecRegistry.of(postTerminalRefundsRequestCodec)

  public object DeleteTerminalConfigurationsConfigurationFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteTerminalConfigurationsConfiguration.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object DeleteTerminalLocationsLocationFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteTerminalLocationsLocation.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object DeleteTerminalReadersReaderFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteTerminalReadersReader.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetTerminalConfigurationsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTerminalConfigurations.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetTerminalConfigurationsConfigurationFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTerminalConfigurationsConfiguration.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetTerminalLocationsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTerminalLocations.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetTerminalLocationsLocationFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTerminalLocationsLocation.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetTerminalReadersFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTerminalReaders.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object GetTerminalReadersReaderFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTerminalReadersReader.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: JsonObject?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): JsonObject? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalConnectionTokensFormCodec : MediaTypeCodec<InlineV1TerminalConnectionTokensPostRequestFormXa133cd51?> {
    override val id: String = "PostTerminalConnectionTokens.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalConnectionTokensPostRequestFormXa133cd51?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.location?.let { formValue0 ->
        form.add("location", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalConnectionTokensPostRequestFormXa133cd51? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalLocationsFormCodec : MediaTypeCodec<InlineV1TerminalLocationsPostRequestFormX2fb2d15d?> {
    override val id: String = "PostTerminalLocations.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalLocationsPostRequestFormX2fb2d15d?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.address?.let { formValue0 ->
        formValue0.city?.let { formValue2 ->
          form.add("address" + "[city]", formValue2)
        }
        form.add("address" + "[country]", formValue0.country)
        formValue0.line1?.let { formValue2 ->
          form.add("address" + "[line1]", formValue2)
        }
        formValue0.line2?.let { formValue2 ->
          form.add("address" + "[line2]", formValue2)
        }
        formValue0.postalCode?.let { formValue2 ->
          form.add("address" + "[postal_code]", formValue2)
        }
        formValue0.state?.let { formValue2 ->
          form.add("address" + "[state]", formValue2)
        }
      }
      request.addressKana?.let { formValue0 ->
        formValue0.city?.let { formValue2 ->
          form.add("address_kana" + "[city]", formValue2)
        }
        formValue0.country?.let { formValue2 ->
          form.add("address_kana" + "[country]", formValue2)
        }
        formValue0.line1?.let { formValue2 ->
          form.add("address_kana" + "[line1]", formValue2)
        }
        formValue0.line2?.let { formValue2 ->
          form.add("address_kana" + "[line2]", formValue2)
        }
        formValue0.postalCode?.let { formValue2 ->
          form.add("address_kana" + "[postal_code]", formValue2)
        }
        formValue0.state?.let { formValue2 ->
          form.add("address_kana" + "[state]", formValue2)
        }
        formValue0.town?.let { formValue2 ->
          form.add("address_kana" + "[town]", formValue2)
        }
      }
      request.addressKanji?.let { formValue0 ->
        formValue0.city?.let { formValue2 ->
          form.add("address_kanji" + "[city]", formValue2)
        }
        formValue0.country?.let { formValue2 ->
          form.add("address_kanji" + "[country]", formValue2)
        }
        formValue0.line1?.let { formValue2 ->
          form.add("address_kanji" + "[line1]", formValue2)
        }
        formValue0.line2?.let { formValue2 ->
          form.add("address_kanji" + "[line2]", formValue2)
        }
        formValue0.postalCode?.let { formValue2 ->
          form.add("address_kanji" + "[postal_code]", formValue2)
        }
        formValue0.state?.let { formValue2 ->
          form.add("address_kanji" + "[state]", formValue2)
        }
        formValue0.town?.let { formValue2 ->
          form.add("address_kanji" + "[town]", formValue2)
        }
      }
      request.configurationOverrides?.let { formValue0 ->
        form.add("configuration_overrides", formValue0)
      }
      request.displayName?.let { formValue0 ->
        form.add("display_name", formValue0)
      }
      request.displayNameKana?.let { formValue0 ->
        form.add("display_name_kana", formValue0)
      }
      request.displayNameKanji?.let { formValue0 ->
        form.add("display_name_kanji", formValue0)
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1TerminalLocationsPostRequestFormMetadataAnyOf2X0bdef11b).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.phone?.let { formValue0 ->
        form.add("phone", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalLocationsPostRequestFormX2fb2d15d? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalOnboardingLinksFormCodec : MediaTypeCodec<InlineV1TerminalOnboardingLinksPostRequestFormXcee20784> {
    override val id: String = "PostTerminalOnboardingLinks.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalOnboardingLinksPostRequestFormXcee20784, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.linkOptions.appleTermsAndConditions?.let { formValue1 ->
        formValue1.allowRelinking?.let { formValue3 ->
          form.add("link_options" + "[apple_terms_and_conditions]" + "[allow_relinking]", formValue3.toString())
        }
        form.add("link_options" + "[apple_terms_and_conditions]" + "[merchant_display_name]", formValue1.merchantDisplayName)
      }
      form.add("link_type", request.linkType.value)
      request.onBehalfOf?.let { formValue0 ->
        form.add("on_behalf_of", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalOnboardingLinksPostRequestFormXcee20784 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalReadersFormCodec : MediaTypeCodec<InlineV1TerminalReadersPostRequestFormX89ae8d1b> {
    override val id: String = "PostTerminalReaders.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalReadersPostRequestFormX89ae8d1b, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.label?.let { formValue0 ->
        form.add("label", formValue0)
      }
      request.location?.let { formValue0 ->
        form.add("location", formValue0)
      }
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1TerminalReadersPostRequestFormMetadataAnyOf2X0025dc50).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      form.add("registration_code", request.registrationCode)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalReadersPostRequestFormX89ae8d1b {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalReadersReaderCancelActionFormCodec : MediaTypeCodec<InlineV1TerminalReadersCancelActionPostRequestFormX920448c6?> {
    override val id: String = "PostTerminalReadersReaderCancelAction.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalReadersCancelActionPostRequestFormX920448c6?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalReadersCancelActionPostRequestFormX920448c6? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalReadersReaderCollectInputsFormCodec : MediaTypeCodec<InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d> {
    override val id: String = "PostTerminalReadersReaderCollectInputs.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      if (request.inputs.isEmpty()) {
        form.add("inputs", "")
      } else {
        request.inputs.forEachIndexed { formIndex0, formElement0 ->
          formElement0.customText.description?.let { formValue3 ->
            form.add("inputs" + "[" + formIndex0 + "]" + "[custom_text]" + "[description]", formValue3)
          }
          formElement0.customText.skipButton?.let { formValue3 ->
            form.add("inputs" + "[" + formIndex0 + "]" + "[custom_text]" + "[skip_button]", formValue3)
          }
          formElement0.customText.submitButton?.let { formValue3 ->
            form.add("inputs" + "[" + formIndex0 + "]" + "[custom_text]" + "[submit_button]", formValue3)
          }
          form.add("inputs" + "[" + formIndex0 + "]" + "[custom_text]" + "[title]", formElement0.customText.title)
          formElement0.required?.let { formValue2 ->
            form.add("inputs" + "[" + formIndex0 + "]" + "[required]", formValue2.toString())
          }
          formElement0.selection?.let { formValue2 ->
            if (formValue2.choices.isEmpty()) {
              form.add("inputs" + "[" + formIndex0 + "]" + "[selection]" + "[choices]", "")
            } else {
              formValue2.choices.forEachIndexed { formIndex4, formElement4 ->
                form.add("inputs" + "[" + formIndex0 + "]" + "[selection]" + "[choices]" + "[" + formIndex4 + "]" + "[id]", formElement4.id)
                formElement4.style?.let { formValue6 ->
                  form.add("inputs" + "[" + formIndex0 + "]" + "[selection]" + "[choices]" + "[" + formIndex4 + "]" + "[style]", formValue6.value)
                }
                form.add("inputs" + "[" + formIndex0 + "]" + "[selection]" + "[choices]" + "[" + formIndex4 + "]" + "[text]", formElement4.text)
              }
            }
          }
          formElement0.toggles?.let { formValue2 ->
            if (formValue2.isEmpty()) {
              form.add("inputs" + "[" + formIndex0 + "]" + "[toggles]", "")
            } else {
              formValue2.forEachIndexed { formIndex3, formElement3 ->
                formElement3.defaultValue?.let { formValue5 ->
                  form.add("inputs" + "[" + formIndex0 + "]" + "[toggles]" + "[" + formIndex3 + "]" + "[default_value]", formValue5.value)
                }
                formElement3.description?.let { formValue5 ->
                  form.add("inputs" + "[" + formIndex0 + "]" + "[toggles]" + "[" + formIndex3 + "]" + "[description]", formValue5)
                }
                formElement3.title?.let { formValue5 ->
                  form.add("inputs" + "[" + formIndex0 + "]" + "[toggles]" + "[" + formIndex3 + "]" + "[title]", formValue5)
                }
              }
            }
          }
          form.add("inputs" + "[" + formIndex0 + "]" + "[type]", formElement0.type.value)
        }
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalReadersReaderCollectPaymentMethodFormCodec : MediaTypeCodec<InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535> {
    override val id: String = "PostTerminalReadersReaderCollectPaymentMethod.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.collectConfig?.let { formValue0 ->
        formValue0.allowRedisplay?.let { formValue2 ->
          form.add("collect_config" + "[allow_redisplay]", formValue2.value)
        }
        formValue0.enableCustomerCancellation?.let { formValue2 ->
          form.add("collect_config" + "[enable_customer_cancellation]", formValue2.toString())
        }
        formValue0.skipTipping?.let { formValue2 ->
          form.add("collect_config" + "[skip_tipping]", formValue2.toString())
        }
        formValue0.tipping?.let { formValue2 ->
          formValue2.amountEligible?.let { formValue4 ->
            form.add("collect_config" + "[tipping]" + "[amount_eligible]", formValue4.toString())
          }
        }
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      form.add("payment_intent", request.paymentIntent)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalReadersReaderConfirmPaymentIntentFormCodec : MediaTypeCodec<InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c> {
    override val id: String = "PostTerminalReadersReaderConfirmPaymentIntent.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.confirmConfig?.let { formValue0 ->
        formValue0.returnUrl?.let { formValue2 ->
          form.add("confirm_config" + "[return_url]", formValue2)
        }
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      form.add("payment_intent", request.paymentIntent)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalReadersReaderProcessPaymentIntentFormCodec : MediaTypeCodec<InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402> {
    override val id: String = "PostTerminalReadersReaderProcessPaymentIntent.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      form.add("payment_intent", request.paymentIntent)
      request.processConfig?.let { formValue0 ->
        formValue0.allowRedisplay?.let { formValue2 ->
          form.add("process_config" + "[allow_redisplay]", formValue2.value)
        }
        formValue0.enableCustomerCancellation?.let { formValue2 ->
          form.add("process_config" + "[enable_customer_cancellation]", formValue2.toString())
        }
        formValue0.returnUrl?.let { formValue2 ->
          form.add("process_config" + "[return_url]", formValue2)
        }
        formValue0.skipTipping?.let { formValue2 ->
          form.add("process_config" + "[skip_tipping]", formValue2.toString())
        }
        formValue0.tipping?.let { formValue2 ->
          formValue2.amountEligible?.let { formValue4 ->
            form.add("process_config" + "[tipping]" + "[amount_eligible]", formValue4.toString())
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalReadersReaderProcessSetupIntentFormCodec : MediaTypeCodec<InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04> {
    override val id: String = "PostTerminalReadersReaderProcessSetupIntent.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("allow_redisplay", request.allowRedisplay.value)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.processConfig?.let { formValue0 ->
        formValue0.enableCustomerCancellation?.let { formValue2 ->
          form.add("process_config" + "[enable_customer_cancellation]", formValue2.toString())
        }
      }
      form.add("setup_intent", request.setupIntent)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalReadersReaderRefundPaymentFormCodec : MediaTypeCodec<InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab?> {
    override val id: String = "PostTerminalReadersReaderRefundPayment.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.charge?.let { formValue0 ->
        form.add("charge", formValue0)
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.paymentIntent?.let { formValue0 ->
        form.add("payment_intent", formValue0)
      }
      request.refundApplicationFee?.let { formValue0 ->
        form.add("refund_application_fee", formValue0.toString())
      }
      request.refundPaymentConfig?.let { formValue0 ->
        formValue0.enableCustomerCancellation?.let { formValue2 ->
          form.add("refund_payment_config" + "[enable_customer_cancellation]", formValue2.toString())
        }
      }
      request.reverseTransfer?.let { formValue0 ->
        form.add("reverse_transfer", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalReadersReaderSetReaderDisplayFormCodec : MediaTypeCodec<InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc> {
    override val id: String = "PostTerminalReadersReaderSetReaderDisplay.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.cart?.let { formValue0 ->
        form.add("cart" + "[currency]", formValue0.currency)
        if (formValue0.lineItems.isEmpty()) {
          form.add("cart" + "[line_items]", "")
        } else {
          formValue0.lineItems.forEachIndexed { formIndex2, formElement2 ->
            form.add("cart" + "[line_items]" + "[" + formIndex2 + "]" + "[amount]", formElement2.amount.toString())
            form.add("cart" + "[line_items]" + "[" + formIndex2 + "]" + "[description]", formElement2.description)
            form.add("cart" + "[line_items]" + "[" + formIndex2 + "]" + "[quantity]", formElement2.quantity.toString())
          }
        }
        formValue0.tax?.let { formValue2 ->
          form.add("cart" + "[tax]", formValue2.toString())
        }
        form.add("cart" + "[total]", formValue0.total.toString())
      }
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      form.add("type", request.type.value)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTerminalRefundsFormCodec : MediaTypeCodec<InlineV1TerminalRefundsPostRequestFormX533386be?> {
    override val id: String = "PostTerminalRefunds.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TerminalRefundsPostRequestFormX533386be?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TerminalRefundsPostRequestFormX533386be? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'terminal' group of Stripe API.
 */
public class TerminalClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "basicAuth" to SecurityScheme.HttpBasic,
        "bearerAuth" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@TerminalClient.authentication)

  /**
   * <p>Deletes a <code>Configuration</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param configuration Wire parameter `configuration`.
   * @param options Execution options.
   */
  public suspend fun deleteTerminalConfigurationsConfigurationWithResponse(
    request: JsonObject? = null,
    configuration: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteTerminalConfigurationsConfigurationResponse> = executor.executeWithResponse<JsonObject?, DeleteTerminalConfigurationsConfigurationResponse>(SdkExecutionRequest(deleteTerminalConfigurationsConfigurationMetadata, baseUri, request, listOf(TerminalCodecs.DELETETERMINALCONFIGURATIONSCONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration", values = listOf(configuration.toString())))
  }), TerminalCodecs.deleteTerminalConfigurationsConfigurationRequestCodecRegistry, DeleteTerminalConfigurationsConfigurationResponseDecoder, options)

  /**
   * <p>Deletes a <code>Location</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param location Wire parameter `location`.
   * @param options Execution options.
   */
  public suspend fun deleteTerminalLocationsLocationWithResponse(
    request: JsonObject? = null,
    location: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteTerminalLocationsLocationResponse> = executor.executeWithResponse<JsonObject?, DeleteTerminalLocationsLocationResponse>(SdkExecutionRequest(deleteTerminalLocationsLocationMetadata, baseUri, request, listOf(TerminalCodecs.DELETETERMINALLOCATIONSLOCATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "location", values = listOf(location.toString())))
  }), TerminalCodecs.deleteTerminalLocationsLocationRequestCodecRegistry, DeleteTerminalLocationsLocationResponseDecoder, options)

  /**
   * <p>Deletes a <code>Reader</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reader Wire parameter `reader`.
   * @param options Execution options.
   */
  public suspend fun deleteTerminalReadersReaderWithResponse(
    request: JsonObject? = null,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteTerminalReadersReaderResponse> = executor.executeWithResponse<JsonObject?, DeleteTerminalReadersReaderResponse>(SdkExecutionRequest(deleteTerminalReadersReaderMetadata, baseUri, request, listOf(TerminalCodecs.DELETETERMINALREADERSREADER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TerminalCodecs.deleteTerminalReadersReaderRequestCodecRegistry, DeleteTerminalReadersReaderResponseDecoder, options)

  /**
   * <p>Returns a list of <code>Configuration</code> objects.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param isAccountDefault if present, only return the account default or non-default configurations.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getTerminalConfigurationsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    isAccountDefault: Boolean? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTerminalConfigurationsResponse> = executor.executeWithResponse<JsonObject?, GetTerminalConfigurationsResponse>(SdkExecutionRequest(getTerminalConfigurationsMetadata, baseUri, request, listOf(TerminalCodecs.GETTERMINALCONFIGURATIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "is_account_default", values = isAccountDefault?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), TerminalCodecs.getTerminalConfigurationsRequestCodecRegistry, GetTerminalConfigurationsResponseDecoder, options)

  /**
   * <p>Retrieves a <code>Configuration</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param configuration Wire parameter `configuration`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTerminalConfigurationsConfigurationWithResponse(
    request: JsonObject? = null,
    configuration: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTerminalConfigurationsConfigurationResponse> = executor.executeWithResponse<JsonObject?, GetTerminalConfigurationsConfigurationResponse>(SdkExecutionRequest(getTerminalConfigurationsConfigurationMetadata, baseUri, request, listOf(TerminalCodecs.GETTERMINALCONFIGURATIONSCONFIGURATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "configuration", values = listOf(configuration.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TerminalCodecs.getTerminalConfigurationsConfigurationRequestCodecRegistry, GetTerminalConfigurationsConfigurationResponseDecoder, options)

  /**
   * <p>Returns a list of <code>Location</code> objects.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getTerminalLocationsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTerminalLocationsResponse> = executor.executeWithResponse<JsonObject?, GetTerminalLocationsResponse>(SdkExecutionRequest(getTerminalLocationsMetadata, baseUri, request, listOf(TerminalCodecs.GETTERMINALLOCATIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), TerminalCodecs.getTerminalLocationsRequestCodecRegistry, GetTerminalLocationsResponseDecoder, options)

  /**
   * <p>Retrieves a <code>Location</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param location Wire parameter `location`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTerminalLocationsLocationWithResponse(
    request: JsonObject? = null,
    location: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTerminalLocationsLocationResponse> = executor.executeWithResponse<JsonObject?, GetTerminalLocationsLocationResponse>(SdkExecutionRequest(getTerminalLocationsLocationMetadata, baseUri, request, listOf(TerminalCodecs.GETTERMINALLOCATIONSLOCATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "location", values = listOf(location.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TerminalCodecs.getTerminalLocationsLocationRequestCodecRegistry, GetTerminalLocationsLocationResponseDecoder, options)

  /**
   * <p>Returns a list of <code>Reader</code> objects.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param deviceType Filters readers by device type
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param location A location ID to filter the response list to only readers at the specific location
   * @param serialNumber Filters readers by serial number
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status A status filter to filter readers to only offline or online readers
   * @param options Execution options.
   */
  public suspend fun getTerminalReadersWithResponse(
    request: JsonObject? = null,
    deviceType: InlineV1TerminalReadersGetParameterX1c327cde? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    location: String? = null,
    serialNumber: String? = null,
    startingAfter: String? = null,
    status: InlineV1TerminalReadersGetParameterX71ea6570? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTerminalReadersResponse> = executor.executeWithResponse<JsonObject?, GetTerminalReadersResponse>(SdkExecutionRequest(getTerminalReadersMetadata, baseUri, request, listOf(TerminalCodecs.GETTERMINALREADERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "device_type", values = deviceType?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "location", values = location?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "serial_number", values = serialNumber?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), TerminalCodecs.getTerminalReadersRequestCodecRegistry, GetTerminalReadersResponseDecoder, options)

  /**
   * <p>Retrieves a <code>Reader</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reader Wire parameter `reader`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTerminalReadersReaderWithResponse(
    request: JsonObject? = null,
    reader: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTerminalReadersReaderResponse> = executor.executeWithResponse<JsonObject?, GetTerminalReadersReaderResponse>(SdkExecutionRequest(getTerminalReadersReaderMetadata, baseUri, request, listOf(TerminalCodecs.GETTERMINALREADERSREADER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TerminalCodecs.getTerminalReadersReaderRequestCodecRegistry, GetTerminalReadersReaderResponseDecoder, options)

  /**
   * <p>To connect to a reader the Stripe Terminal SDK needs to retrieve a short-lived connection token from Stripe,
   * proxied through your server. On your backend, add an endpoint that creates and returns a connection token.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTerminalConnectionTokensWithResponse(request: InlineV1TerminalConnectionTokensPostRequestFormXa133cd51? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostTerminalConnectionTokensResponse> = executor.executeWithResponse<InlineV1TerminalConnectionTokensPostRequestFormXa133cd51?, PostTerminalConnectionTokensResponse>(SdkExecutionRequest(postTerminalConnectionTokensMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALCONNECTIONTOKENS_REQUEST_CODEC_ID), emptyList()), TerminalCodecs.postTerminalConnectionTokensRequestCodecRegistry, PostTerminalConnectionTokensResponseDecoder, options)

  /**
   * <p>Creates a new <code>Location</code> object.
   * For further details, including which address fields are required in each country, see the <a
   * href="/docs/terminal/fleet/locations">Manage locations</a> guide.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTerminalLocationsWithResponse(request: InlineV1TerminalLocationsPostRequestFormX2fb2d15d? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostTerminalLocationsResponse> = executor.executeWithResponse<InlineV1TerminalLocationsPostRequestFormX2fb2d15d?, PostTerminalLocationsResponse>(SdkExecutionRequest(postTerminalLocationsMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALLOCATIONS_REQUEST_CODEC_ID), emptyList()), TerminalCodecs.postTerminalLocationsRequestCodecRegistry, PostTerminalLocationsResponseDecoder, options)

  /**
   * <p>Creates a new <code>OnboardingLink</code> object that contains a redirect_url used for onboarding onto Tap to
   * Pay on iPhone.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTerminalOnboardingLinksWithResponse(request: InlineV1TerminalOnboardingLinksPostRequestFormXcee20784, options: CallOptions = CallOptions()): SdkResponseResult<PostTerminalOnboardingLinksResponse> = executor.executeWithResponse<InlineV1TerminalOnboardingLinksPostRequestFormXcee20784, PostTerminalOnboardingLinksResponse>(SdkExecutionRequest(postTerminalOnboardingLinksMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALONBOARDINGLINKS_REQUEST_CODEC_ID), emptyList()), TerminalCodecs.postTerminalOnboardingLinksRequestCodecRegistry, PostTerminalOnboardingLinksResponseDecoder, options)

  /**
   * <p>Creates a new <code>Reader</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTerminalReadersWithResponse(request: InlineV1TerminalReadersPostRequestFormX89ae8d1b, options: CallOptions = CallOptions()): SdkResponseResult<PostTerminalReadersResponse> = executor.executeWithResponse<InlineV1TerminalReadersPostRequestFormX89ae8d1b, PostTerminalReadersResponse>(SdkExecutionRequest(postTerminalReadersMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALREADERS_REQUEST_CODEC_ID), emptyList()), TerminalCodecs.postTerminalReadersRequestCodecRegistry, PostTerminalReadersResponseDecoder, options)

  /**
   * <p>Cancels the current reader action. See <a
   * href="/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven#programmatic-cancellation">P
   * rogrammatic Cancellation</a> for more details.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reader Wire parameter `reader`.
   * @param options Execution options.
   */
  public suspend fun postTerminalReadersReaderCancelActionWithResponse(
    request: InlineV1TerminalReadersCancelActionPostRequestFormX920448c6? = null,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTerminalReadersReaderCancelActionResponse> = executor.executeWithResponse<InlineV1TerminalReadersCancelActionPostRequestFormX920448c6?, PostTerminalReadersReaderCancelActionResponse>(SdkExecutionRequest(postTerminalReadersReaderCancelActionMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALREADERSREADERCANCELACTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TerminalCodecs.postTerminalReadersReaderCancelActionRequestCodecRegistry, PostTerminalReadersReaderCancelActionResponseDecoder, options)

  /**
   * <p>Initiates an <a href="/docs/terminal/features/collect-inputs">input collection flow</a> on a Reader to display
   * input forms and collect information from your customers.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reader Wire parameter `reader`.
   * @param options Execution options.
   */
  public suspend fun postTerminalReadersReaderCollectInputsWithResponse(
    request: InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTerminalReadersReaderCollectInputsResponse> = executor.executeWithResponse<InlineV1TerminalReadersCollectInputsPostRequestFormX870e1a8d, PostTerminalReadersReaderCollectInputsResponse>(SdkExecutionRequest(postTerminalReadersReaderCollectInputsMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALREADERSREADERCOLLECTINPUTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TerminalCodecs.postTerminalReadersReaderCollectInputsRequestCodecRegistry, PostTerminalReadersReaderCollectInputsResponseDecoder, options)

  /**
   * <p>Initiates a payment flow on a Reader and updates the PaymentIntent with card details before manual confirmation.
   * See <a
   * href="/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven&process=inspect#collect-a-pa
   * ymentmethod">Collecting a Payment method</a> for more details.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reader Wire parameter `reader`.
   * @param options Execution options.
   */
  public suspend fun postTerminalReadersReaderCollectPaymentMethodWithResponse(
    request: InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTerminalReadersReaderCollectPaymentMethodResponse> = executor.executeWithResponse<InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535, PostTerminalReadersReaderCollectPaymentMethodResponse>(SdkExecutionRequest(postTerminalReadersReaderCollectPaymentMethodMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALREADERSREADERCOLLECTPAYMENTMETHOD_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TerminalCodecs.postTerminalReadersReaderCollectPaymentMethodRequestCodecRegistry, PostTerminalReadersReaderCollectPaymentMethodResponseDecoder, options)

  /**
   * <p>Finalizes a payment on a Reader. See <a
   * href="/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven&process=inspect#confirm-the-
   * paymentintent">Confirming a Payment</a> for more details.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reader Wire parameter `reader`.
   * @param options Execution options.
   */
  public suspend fun postTerminalReadersReaderConfirmPaymentIntentWithResponse(
    request: InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTerminalReadersReaderConfirmPaymentIntentResponse> = executor.executeWithResponse<InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c, PostTerminalReadersReaderConfirmPaymentIntentResponse>(SdkExecutionRequest(postTerminalReadersReaderConfirmPaymentIntentMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALREADERSREADERCONFIRMPAYMENTINTENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TerminalCodecs.postTerminalReadersReaderConfirmPaymentIntentRequestCodecRegistry, PostTerminalReadersReaderConfirmPaymentIntentResponseDecoder, options)

  /**
   * <p>Initiates a payment flow on a Reader. See <a
   * href="/docs/terminal/payments/collect-card-payment?terminal-sdk-platform=server-driven&process=immediately#process-
   * payment">process the payment</a> for more details.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reader Wire parameter `reader`.
   * @param options Execution options.
   */
  public suspend fun postTerminalReadersReaderProcessPaymentIntentWithResponse(
    request: InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTerminalReadersReaderProcessPaymentIntentResponse> = executor.executeWithResponse<InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402, PostTerminalReadersReaderProcessPaymentIntentResponse>(SdkExecutionRequest(postTerminalReadersReaderProcessPaymentIntentMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALREADERSREADERPROCESSPAYMENTINTENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TerminalCodecs.postTerminalReadersReaderProcessPaymentIntentRequestCodecRegistry, PostTerminalReadersReaderProcessPaymentIntentResponseDecoder, options)

  /**
   * <p>Initiates a SetupIntent flow on a Reader. See <a
   * href="/docs/terminal/features/saving-payment-details/save-directly">Save directly without charging</a> for more
   * details.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reader Wire parameter `reader`.
   * @param options Execution options.
   */
  public suspend fun postTerminalReadersReaderProcessSetupIntentWithResponse(
    request: InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTerminalReadersReaderProcessSetupIntentResponse> = executor.executeWithResponse<InlineV1TerminalReadersProcessSetupIntentPostRequestFormXfa0fcb04, PostTerminalReadersReaderProcessSetupIntentResponse>(SdkExecutionRequest(postTerminalReadersReaderProcessSetupIntentMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALREADERSREADERPROCESSSETUPINTENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TerminalCodecs.postTerminalReadersReaderProcessSetupIntentRequestCodecRegistry, PostTerminalReadersReaderProcessSetupIntentResponseDecoder, options)

  /**
   * <p>Initiates an in-person refund on a Reader. See <a
   * href="/docs/terminal/payments/regional?integration-country=CA#refund-an-interac-payment">Refund an Interac
   * Payment</a> for more details.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reader Wire parameter `reader`.
   * @param options Execution options.
   */
  public suspend fun postTerminalReadersReaderRefundPaymentWithResponse(
    request: InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab? = null,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTerminalReadersReaderRefundPaymentResponse> = executor.executeWithResponse<InlineV1TerminalReadersRefundPaymentPostRequestFormXbdef3dab?, PostTerminalReadersReaderRefundPaymentResponse>(SdkExecutionRequest(postTerminalReadersReaderRefundPaymentMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALREADERSREADERREFUNDPAYMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TerminalCodecs.postTerminalReadersReaderRefundPaymentRequestCodecRegistry, PostTerminalReadersReaderRefundPaymentResponseDecoder, options)

  /**
   * <p>Sets the reader display to show <a href="/docs/terminal/features/display">cart details</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param reader Wire parameter `reader`.
   * @param options Execution options.
   */
  public suspend fun postTerminalReadersReaderSetReaderDisplayWithResponse(
    request: InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTerminalReadersReaderSetReaderDisplayResponse> = executor.executeWithResponse<InlineV1TerminalReadersSetReaderDisplayPostRequestFormXc9c269bc, PostTerminalReadersReaderSetReaderDisplayResponse>(SdkExecutionRequest(postTerminalReadersReaderSetReaderDisplayMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALREADERSREADERSETREADERDISPLAY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TerminalCodecs.postTerminalReadersReaderSetReaderDisplayRequestCodecRegistry, PostTerminalReadersReaderSetReaderDisplayResponseDecoder, options)

  /**
   * <p>Internal endpoint for terminal use to create a refund for a card_present or card charge.</p>
   *
   * <p>You can optionally refund only part of a charge.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTerminalRefundsWithResponse(request: InlineV1TerminalRefundsPostRequestFormX533386be? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostTerminalRefundsResponse> = executor.executeWithResponse<InlineV1TerminalRefundsPostRequestFormX533386be?, PostTerminalRefundsResponse>(SdkExecutionRequest(postTerminalRefundsMetadata, baseUri, request, listOf(TerminalCodecs.POSTTERMINALREFUNDS_REQUEST_CODEC_ID), emptyList()), TerminalCodecs.postTerminalRefundsRequestCodecRegistry, PostTerminalRefundsResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteTerminalConfigurationsConfiguration`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DeleteTerminalConfigurationsConfigurationResponse {
    public class SuccessJson(
      public val json: DeletedTerminalConfiguration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTerminalConfigurationsConfigurationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTerminalConfigurationsConfigurationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTerminalConfigurationsConfigurationResponse
  }

  private object DeleteTerminalConfigurationsConfigurationResponseDecoder : SdkResponseAlternativeDecoder<DeleteTerminalConfigurationsConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteTerminalConfigurationsConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteTerminalConfigurationsConfigurationResponse> = when {
      alternative.id == "DeleteTerminalConfigurationsConfiguration.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteTerminalConfigurationsConfigurationResponse.SuccessJson(
          json = TerminalCodecs.deleteTerminalConfigurationsConfigurationResponseCodecAlternative0Registry.select(listOf("DeleteTerminalConfigurationsConfiguration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteTerminalConfigurationsConfiguration.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteTerminalConfigurationsConfigurationResponse.DefaultJson(
          json = TerminalCodecs.deleteTerminalConfigurationsConfigurationResponseCodecAlternative1Registry.select(listOf("DeleteTerminalConfigurationsConfiguration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteTerminalConfigurationsConfigurationResponse = DeleteTerminalConfigurationsConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteTerminalLocationsLocation`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteTerminalLocationsLocationResponse {
    public class SuccessJson(
      public val json: DeletedTerminalLocation,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTerminalLocationsLocationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTerminalLocationsLocationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTerminalLocationsLocationResponse
  }

  private object DeleteTerminalLocationsLocationResponseDecoder : SdkResponseAlternativeDecoder<DeleteTerminalLocationsLocationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteTerminalLocationsLocationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteTerminalLocationsLocationResponse> = when {
      alternative.id == "DeleteTerminalLocationsLocation.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteTerminalLocationsLocationResponse.SuccessJson(
          json = TerminalCodecs.deleteTerminalLocationsLocationResponseCodecAlternative0Registry.select(listOf("DeleteTerminalLocationsLocation.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteTerminalLocationsLocation.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteTerminalLocationsLocationResponse.DefaultJson(
          json = TerminalCodecs.deleteTerminalLocationsLocationResponseCodecAlternative1Registry.select(listOf("DeleteTerminalLocationsLocation.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteTerminalLocationsLocationResponse = DeleteTerminalLocationsLocationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteTerminalReadersReader`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteTerminalReadersReaderResponse {
    public class SuccessJson(
      public val json: DeletedTerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTerminalReadersReaderResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTerminalReadersReaderResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTerminalReadersReaderResponse
  }

  private object DeleteTerminalReadersReaderResponseDecoder : SdkResponseAlternativeDecoder<DeleteTerminalReadersReaderResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteTerminalReadersReaderResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteTerminalReadersReaderResponse> = when {
      alternative.id == "DeleteTerminalReadersReader.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteTerminalReadersReaderResponse.SuccessJson(
          json = TerminalCodecs.deleteTerminalReadersReaderResponseCodecAlternative0Registry.select(listOf("DeleteTerminalReadersReader.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteTerminalReadersReader.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteTerminalReadersReaderResponse.DefaultJson(
          json = TerminalCodecs.deleteTerminalReadersReaderResponseCodecAlternative1Registry.select(listOf("DeleteTerminalReadersReader.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteTerminalReadersReaderResponse = DeleteTerminalReadersReaderResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTerminalConfigurations`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTerminalConfigurationsResponse {
    public class SuccessJson(
      public val json: InlineV1TerminalConfigurationsGetResponse200JsonXb465ea87,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalConfigurationsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalConfigurationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalConfigurationsResponse
  }

  private object GetTerminalConfigurationsResponseDecoder : SdkResponseAlternativeDecoder<GetTerminalConfigurationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTerminalConfigurationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTerminalConfigurationsResponse> = when {
      alternative.id == "GetTerminalConfigurations.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTerminalConfigurationsResponse.SuccessJson(
          json = TerminalCodecs.getTerminalConfigurationsResponseCodecAlternative0Registry.select(listOf("GetTerminalConfigurations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTerminalConfigurations.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTerminalConfigurationsResponse.DefaultJson(
          json = TerminalCodecs.getTerminalConfigurationsResponseCodecAlternative1Registry.select(listOf("GetTerminalConfigurations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTerminalConfigurationsResponse = GetTerminalConfigurationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTerminalConfigurationsConfiguration`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetTerminalConfigurationsConfigurationResponse {
    public class SuccessJson(
      public val json: InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalConfigurationsConfigurationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalConfigurationsConfigurationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalConfigurationsConfigurationResponse
  }

  private object GetTerminalConfigurationsConfigurationResponseDecoder : SdkResponseAlternativeDecoder<GetTerminalConfigurationsConfigurationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTerminalConfigurationsConfigurationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTerminalConfigurationsConfigurationResponse> = when {
      alternative.id == "GetTerminalConfigurationsConfiguration.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTerminalConfigurationsConfigurationResponse.SuccessJson(
          json = TerminalCodecs.getTerminalConfigurationsConfigurationResponseCodecAlternative0Registry.select(listOf("GetTerminalConfigurationsConfiguration.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTerminalConfigurationsConfiguration.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTerminalConfigurationsConfigurationResponse.DefaultJson(
          json = TerminalCodecs.getTerminalConfigurationsConfigurationResponseCodecAlternative1Registry.select(listOf("GetTerminalConfigurationsConfiguration.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTerminalConfigurationsConfigurationResponse = GetTerminalConfigurationsConfigurationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTerminalLocations`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetTerminalLocationsResponse {
    public class SuccessJson(
      public val json: InlineV1TerminalLocationsGetResponse200JsonX0ba0f556,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalLocationsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalLocationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalLocationsResponse
  }

  private object GetTerminalLocationsResponseDecoder : SdkResponseAlternativeDecoder<GetTerminalLocationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTerminalLocationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTerminalLocationsResponse> = when {
      alternative.id == "GetTerminalLocations.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTerminalLocationsResponse.SuccessJson(
          json = TerminalCodecs.getTerminalLocationsResponseCodecAlternative0Registry.select(listOf("GetTerminalLocations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTerminalLocations.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTerminalLocationsResponse.DefaultJson(
          json = TerminalCodecs.getTerminalLocationsResponseCodecAlternative1Registry.select(listOf("GetTerminalLocations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTerminalLocationsResponse = GetTerminalLocationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTerminalLocationsLocation`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTerminalLocationsLocationResponse {
    public class SuccessJson(
      public val json: InlineV1TerminalLocationsGetResponse200JsonX60b92cce,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalLocationsLocationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalLocationsLocationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalLocationsLocationResponse
  }

  private object GetTerminalLocationsLocationResponseDecoder : SdkResponseAlternativeDecoder<GetTerminalLocationsLocationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTerminalLocationsLocationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTerminalLocationsLocationResponse> = when {
      alternative.id == "GetTerminalLocationsLocation.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTerminalLocationsLocationResponse.SuccessJson(
          json = TerminalCodecs.getTerminalLocationsLocationResponseCodecAlternative0Registry.select(listOf("GetTerminalLocationsLocation.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTerminalLocationsLocation.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTerminalLocationsLocationResponse.DefaultJson(
          json = TerminalCodecs.getTerminalLocationsLocationResponseCodecAlternative1Registry.select(listOf("GetTerminalLocationsLocation.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTerminalLocationsLocationResponse = GetTerminalLocationsLocationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTerminalReaders`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetTerminalReadersResponse {
    public class SuccessJson(
      public val json: InlineV1TerminalReadersGetResponse200JsonX7ec8c9fd,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalReadersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalReadersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalReadersResponse
  }

  private object GetTerminalReadersResponseDecoder : SdkResponseAlternativeDecoder<GetTerminalReadersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTerminalReadersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTerminalReadersResponse> = when {
      alternative.id == "GetTerminalReaders.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTerminalReadersResponse.SuccessJson(
          json = TerminalCodecs.getTerminalReadersResponseCodecAlternative0Registry.select(listOf("GetTerminalReaders.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTerminalReaders.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTerminalReadersResponse.DefaultJson(
          json = TerminalCodecs.getTerminalReadersResponseCodecAlternative1Registry.select(listOf("GetTerminalReaders.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTerminalReadersResponse = GetTerminalReadersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTerminalReadersReader`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetTerminalReadersReaderResponse {
    public class SuccessJson(
      public val json: InlineV1TerminalReadersGetResponse200JsonXfb8527fc,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalReadersReaderResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalReadersReaderResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTerminalReadersReaderResponse
  }

  private object GetTerminalReadersReaderResponseDecoder : SdkResponseAlternativeDecoder<GetTerminalReadersReaderResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTerminalReadersReaderResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTerminalReadersReaderResponse> = when {
      alternative.id == "GetTerminalReadersReader.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTerminalReadersReaderResponse.SuccessJson(
          json = TerminalCodecs.getTerminalReadersReaderResponseCodecAlternative0Registry.select(listOf("GetTerminalReadersReader.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTerminalReadersReader.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTerminalReadersReaderResponse.DefaultJson(
          json = TerminalCodecs.getTerminalReadersReaderResponseCodecAlternative1Registry.select(listOf("GetTerminalReadersReader.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTerminalReadersReaderResponse = GetTerminalReadersReaderResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalConnectionTokens`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostTerminalConnectionTokensResponse {
    public class SuccessJson(
      public val json: TerminalConnectionToken,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalConnectionTokensResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalConnectionTokensResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalConnectionTokensResponse
  }

  private object PostTerminalConnectionTokensResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalConnectionTokensResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalConnectionTokensResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalConnectionTokensResponse> = when {
      alternative.id == "PostTerminalConnectionTokens.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalConnectionTokensResponse.SuccessJson(
          json = TerminalCodecs.postTerminalConnectionTokensResponseCodecAlternative0Registry.select(listOf("PostTerminalConnectionTokens.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalConnectionTokens.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalConnectionTokensResponse.DefaultJson(
          json = TerminalCodecs.postTerminalConnectionTokensResponseCodecAlternative1Registry.select(listOf("PostTerminalConnectionTokens.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalConnectionTokensResponse = PostTerminalConnectionTokensResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalLocations`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostTerminalLocationsResponse {
    public class SuccessJson(
      public val json: TerminalLocation,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalLocationsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalLocationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalLocationsResponse
  }

  private object PostTerminalLocationsResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalLocationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalLocationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalLocationsResponse> = when {
      alternative.id == "PostTerminalLocations.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalLocationsResponse.SuccessJson(
          json = TerminalCodecs.postTerminalLocationsResponseCodecAlternative0Registry.select(listOf("PostTerminalLocations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalLocations.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalLocationsResponse.DefaultJson(
          json = TerminalCodecs.postTerminalLocationsResponseCodecAlternative1Registry.select(listOf("PostTerminalLocations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalLocationsResponse = PostTerminalLocationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalOnboardingLinks`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostTerminalOnboardingLinksResponse {
    public class SuccessJson(
      public val json: TerminalOnboardingLink,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalOnboardingLinksResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalOnboardingLinksResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalOnboardingLinksResponse
  }

  private object PostTerminalOnboardingLinksResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalOnboardingLinksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalOnboardingLinksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalOnboardingLinksResponse> = when {
      alternative.id == "PostTerminalOnboardingLinks.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalOnboardingLinksResponse.SuccessJson(
          json = TerminalCodecs.postTerminalOnboardingLinksResponseCodecAlternative0Registry.select(listOf("PostTerminalOnboardingLinks.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalOnboardingLinks.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalOnboardingLinksResponse.DefaultJson(
          json = TerminalCodecs.postTerminalOnboardingLinksResponseCodecAlternative1Registry.select(listOf("PostTerminalOnboardingLinks.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalOnboardingLinksResponse = PostTerminalOnboardingLinksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalReaders`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostTerminalReadersResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersResponse
  }

  private object PostTerminalReadersResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalReadersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalReadersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalReadersResponse> = when {
      alternative.id == "PostTerminalReaders.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalReadersResponse.SuccessJson(
          json = TerminalCodecs.postTerminalReadersResponseCodecAlternative0Registry.select(listOf("PostTerminalReaders.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalReaders.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalReadersResponse.DefaultJson(
          json = TerminalCodecs.postTerminalReadersResponseCodecAlternative1Registry.select(listOf("PostTerminalReaders.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalReadersResponse = PostTerminalReadersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalReadersReaderCancelAction`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostTerminalReadersReaderCancelActionResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderCancelActionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderCancelActionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderCancelActionResponse
  }

  private object PostTerminalReadersReaderCancelActionResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalReadersReaderCancelActionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalReadersReaderCancelActionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalReadersReaderCancelActionResponse> = when {
      alternative.id == "PostTerminalReadersReaderCancelAction.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderCancelActionResponse.SuccessJson(
          json = TerminalCodecs.postTerminalReadersReaderCancelActionResponseCodecAlternative0Registry.select(listOf("PostTerminalReadersReaderCancelAction.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalReadersReaderCancelAction.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderCancelActionResponse.DefaultJson(
          json = TerminalCodecs.postTerminalReadersReaderCancelActionResponseCodecAlternative1Registry.select(listOf("PostTerminalReadersReaderCancelAction.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalReadersReaderCancelActionResponse = PostTerminalReadersReaderCancelActionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalReadersReaderCollectInputs`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTerminalReadersReaderCollectInputsResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderCollectInputsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderCollectInputsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderCollectInputsResponse
  }

  private object PostTerminalReadersReaderCollectInputsResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalReadersReaderCollectInputsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalReadersReaderCollectInputsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalReadersReaderCollectInputsResponse> = when {
      alternative.id == "PostTerminalReadersReaderCollectInputs.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderCollectInputsResponse.SuccessJson(
          json = TerminalCodecs.postTerminalReadersReaderCollectInputsResponseCodecAlternative0Registry.select(listOf("PostTerminalReadersReaderCollectInputs.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalReadersReaderCollectInputs.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderCollectInputsResponse.DefaultJson(
          json = TerminalCodecs.postTerminalReadersReaderCollectInputsResponseCodecAlternative1Registry.select(listOf("PostTerminalReadersReaderCollectInputs.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalReadersReaderCollectInputsResponse = PostTerminalReadersReaderCollectInputsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalReadersReaderCollectPaymentMethod`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTerminalReadersReaderCollectPaymentMethodResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderCollectPaymentMethodResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderCollectPaymentMethodResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderCollectPaymentMethodResponse
  }

  private object PostTerminalReadersReaderCollectPaymentMethodResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalReadersReaderCollectPaymentMethodResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalReadersReaderCollectPaymentMethodResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalReadersReaderCollectPaymentMethodResponse> = when {
      alternative.id == "PostTerminalReadersReaderCollectPaymentMethod.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderCollectPaymentMethodResponse.SuccessJson(
          json = TerminalCodecs.postTerminalReadersReaderCollectPaymentMethodResponseCodecAlternative0Registry.select(listOf("PostTerminalReadersReaderCollectPaymentMethod.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalReadersReaderCollectPaymentMethod.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderCollectPaymentMethodResponse.DefaultJson(
          json = TerminalCodecs.postTerminalReadersReaderCollectPaymentMethodResponseCodecAlternative1Registry.select(listOf("PostTerminalReadersReaderCollectPaymentMethod.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalReadersReaderCollectPaymentMethodResponse = PostTerminalReadersReaderCollectPaymentMethodResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalReadersReaderConfirmPaymentIntent`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTerminalReadersReaderConfirmPaymentIntentResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderConfirmPaymentIntentResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderConfirmPaymentIntentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderConfirmPaymentIntentResponse
  }

  private object PostTerminalReadersReaderConfirmPaymentIntentResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalReadersReaderConfirmPaymentIntentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalReadersReaderConfirmPaymentIntentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalReadersReaderConfirmPaymentIntentResponse> = when {
      alternative.id == "PostTerminalReadersReaderConfirmPaymentIntent.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderConfirmPaymentIntentResponse.SuccessJson(
          json = TerminalCodecs.postTerminalReadersReaderConfirmPaymentIntentResponseCodecAlternative0Registry.select(listOf("PostTerminalReadersReaderConfirmPaymentIntent.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalReadersReaderConfirmPaymentIntent.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderConfirmPaymentIntentResponse.DefaultJson(
          json = TerminalCodecs.postTerminalReadersReaderConfirmPaymentIntentResponseCodecAlternative1Registry.select(listOf("PostTerminalReadersReaderConfirmPaymentIntent.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalReadersReaderConfirmPaymentIntentResponse = PostTerminalReadersReaderConfirmPaymentIntentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalReadersReaderProcessPaymentIntent`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTerminalReadersReaderProcessPaymentIntentResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderProcessPaymentIntentResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderProcessPaymentIntentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderProcessPaymentIntentResponse
  }

  private object PostTerminalReadersReaderProcessPaymentIntentResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalReadersReaderProcessPaymentIntentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalReadersReaderProcessPaymentIntentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalReadersReaderProcessPaymentIntentResponse> = when {
      alternative.id == "PostTerminalReadersReaderProcessPaymentIntent.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderProcessPaymentIntentResponse.SuccessJson(
          json = TerminalCodecs.postTerminalReadersReaderProcessPaymentIntentResponseCodecAlternative0Registry.select(listOf("PostTerminalReadersReaderProcessPaymentIntent.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalReadersReaderProcessPaymentIntent.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderProcessPaymentIntentResponse.DefaultJson(
          json = TerminalCodecs.postTerminalReadersReaderProcessPaymentIntentResponseCodecAlternative1Registry.select(listOf("PostTerminalReadersReaderProcessPaymentIntent.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalReadersReaderProcessPaymentIntentResponse = PostTerminalReadersReaderProcessPaymentIntentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalReadersReaderProcessSetupIntent`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTerminalReadersReaderProcessSetupIntentResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderProcessSetupIntentResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderProcessSetupIntentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderProcessSetupIntentResponse
  }

  private object PostTerminalReadersReaderProcessSetupIntentResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalReadersReaderProcessSetupIntentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalReadersReaderProcessSetupIntentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalReadersReaderProcessSetupIntentResponse> = when {
      alternative.id == "PostTerminalReadersReaderProcessSetupIntent.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderProcessSetupIntentResponse.SuccessJson(
          json = TerminalCodecs.postTerminalReadersReaderProcessSetupIntentResponseCodecAlternative0Registry.select(listOf("PostTerminalReadersReaderProcessSetupIntent.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalReadersReaderProcessSetupIntent.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderProcessSetupIntentResponse.DefaultJson(
          json = TerminalCodecs.postTerminalReadersReaderProcessSetupIntentResponseCodecAlternative1Registry.select(listOf("PostTerminalReadersReaderProcessSetupIntent.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalReadersReaderProcessSetupIntentResponse = PostTerminalReadersReaderProcessSetupIntentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalReadersReaderRefundPayment`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTerminalReadersReaderRefundPaymentResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderRefundPaymentResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderRefundPaymentResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderRefundPaymentResponse
  }

  private object PostTerminalReadersReaderRefundPaymentResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalReadersReaderRefundPaymentResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalReadersReaderRefundPaymentResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalReadersReaderRefundPaymentResponse> = when {
      alternative.id == "PostTerminalReadersReaderRefundPayment.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderRefundPaymentResponse.SuccessJson(
          json = TerminalCodecs.postTerminalReadersReaderRefundPaymentResponseCodecAlternative0Registry.select(listOf("PostTerminalReadersReaderRefundPayment.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalReadersReaderRefundPayment.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderRefundPaymentResponse.DefaultJson(
          json = TerminalCodecs.postTerminalReadersReaderRefundPaymentResponseCodecAlternative1Registry.select(listOf("PostTerminalReadersReaderRefundPayment.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalReadersReaderRefundPaymentResponse = PostTerminalReadersReaderRefundPaymentResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalReadersReaderSetReaderDisplay`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTerminalReadersReaderSetReaderDisplayResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderSetReaderDisplayResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderSetReaderDisplayResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalReadersReaderSetReaderDisplayResponse
  }

  private object PostTerminalReadersReaderSetReaderDisplayResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalReadersReaderSetReaderDisplayResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalReadersReaderSetReaderDisplayResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalReadersReaderSetReaderDisplayResponse> = when {
      alternative.id == "PostTerminalReadersReaderSetReaderDisplay.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderSetReaderDisplayResponse.SuccessJson(
          json = TerminalCodecs.postTerminalReadersReaderSetReaderDisplayResponseCodecAlternative0Registry.select(listOf("PostTerminalReadersReaderSetReaderDisplay.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalReadersReaderSetReaderDisplay.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalReadersReaderSetReaderDisplayResponse.DefaultJson(
          json = TerminalCodecs.postTerminalReadersReaderSetReaderDisplayResponseCodecAlternative1Registry.select(listOf("PostTerminalReadersReaderSetReaderDisplay.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalReadersReaderSetReaderDisplayResponse = PostTerminalReadersReaderSetReaderDisplayResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTerminalRefunds`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostTerminalRefundsResponse {
    public class SuccessJson(
      public val json: JsonObject,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalRefundsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalRefundsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTerminalRefundsResponse
  }

  private object PostTerminalRefundsResponseDecoder : SdkResponseAlternativeDecoder<PostTerminalRefundsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTerminalRefundsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTerminalRefundsResponse> = when {
      alternative.id == "PostTerminalRefunds.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTerminalRefundsResponse.SuccessJson(
          json = TerminalCodecs.postTerminalRefundsResponseCodecAlternative0Registry.select(listOf("PostTerminalRefunds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTerminalRefunds.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTerminalRefundsResponse.DefaultJson(
          json = TerminalCodecs.postTerminalRefundsResponseCodecAlternative1Registry.select(listOf("PostTerminalRefunds.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTerminalRefundsResponse = PostTerminalRefundsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val deleteTerminalConfigurationsConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteTerminalConfigurationsConfiguration",
          method = "DELETE",
          path = "/v1/terminal/configurations/{configuration}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedTerminalConfiguration",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteTerminalConfigurationsConfiguration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteTerminalConfigurationsConfiguration.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val deleteTerminalLocationsLocationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteTerminalLocationsLocation",
          method = "DELETE",
          path = "/v1/terminal/locations/{location}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedTerminalLocation",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteTerminalLocationsLocation.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteTerminalLocationsLocation.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val deleteTerminalReadersReaderMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteTerminalReadersReader",
          method = "DELETE",
          path = "/v1/terminal/readers/{reader}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedTerminalReader",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteTerminalReadersReader.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteTerminalReadersReader.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val getTerminalConfigurationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTerminalConfigurations",
          method = "GET",
          path = "/v1/terminal/configurations",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TerminalConfigurationsGetResponse200JsonXb465ea87",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalConfigurations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalConfigurations.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val getTerminalConfigurationsConfigurationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTerminalConfigurationsConfiguration",
          method = "GET",
          path = "/v1/terminal/configurations/{configuration}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalConfigurationsConfiguration.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalConfigurationsConfiguration.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val getTerminalLocationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTerminalLocations",
          method = "GET",
          path = "/v1/terminal/locations",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TerminalLocationsGetResponse200JsonX0ba0f556",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalLocations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalLocations.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val getTerminalLocationsLocationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTerminalLocationsLocation",
          method = "GET",
          path = "/v1/terminal/locations/{location}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TerminalLocationsGetResponse200JsonX60b92cce",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalLocationsLocation.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalLocationsLocation.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val getTerminalReadersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTerminalReaders",
          method = "GET",
          path = "/v1/terminal/readers",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TerminalReadersGetResponse200JsonX7ec8c9fd",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalReaders.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalReaders.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val getTerminalReadersReaderMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTerminalReadersReader",
          method = "GET",
          path = "/v1/terminal/readers/{reader}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TerminalReadersGetResponse200JsonXfb8527fc",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalReadersReader.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTerminalReadersReader.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalConnectionTokensMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalConnectionTokens",
          method = "POST",
          path = "/v1/terminal/connection_tokens",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalConnectionToken",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalConnectionTokens.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalConnectionTokens.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalLocationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalLocations",
          method = "POST",
          path = "/v1/terminal/locations",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalLocation",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalLocations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalLocations.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalOnboardingLinksMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalOnboardingLinks",
          method = "POST",
          path = "/v1/terminal/onboarding_links",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalOnboardingLink",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalOnboardingLinks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalOnboardingLinks.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalReadersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalReaders",
          method = "POST",
          path = "/v1/terminal/readers",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalReader",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReaders.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReaders.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalReadersReaderCancelActionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalReadersReaderCancelAction",
          method = "POST",
          path = "/v1/terminal/readers/{reader}/cancel_action",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalReader",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderCancelAction.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderCancelAction.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalReadersReaderCollectInputsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalReadersReaderCollectInputs",
          method = "POST",
          path = "/v1/terminal/readers/{reader}/collect_inputs",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalReader",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderCollectInputs.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderCollectInputs.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalReadersReaderCollectPaymentMethodMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalReadersReaderCollectPaymentMethod",
          method = "POST",
          path = "/v1/terminal/readers/{reader}/collect_payment_method",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalReader",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderCollectPaymentMethod.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderCollectPaymentMethod.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalReadersReaderConfirmPaymentIntentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalReadersReaderConfirmPaymentIntent",
          method = "POST",
          path = "/v1/terminal/readers/{reader}/confirm_payment_intent",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalReader",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderConfirmPaymentIntent.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderConfirmPaymentIntent.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalReadersReaderProcessPaymentIntentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalReadersReaderProcessPaymentIntent",
          method = "POST",
          path = "/v1/terminal/readers/{reader}/process_payment_intent",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalReader",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderProcessPaymentIntent.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderProcessPaymentIntent.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalReadersReaderProcessSetupIntentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalReadersReaderProcessSetupIntent",
          method = "POST",
          path = "/v1/terminal/readers/{reader}/process_setup_intent",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalReader",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderProcessSetupIntent.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderProcessSetupIntent.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalReadersReaderRefundPaymentMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalReadersReaderRefundPayment",
          method = "POST",
          path = "/v1/terminal/readers/{reader}/refund_payment",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalReader",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderRefundPayment.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderRefundPayment.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalReadersReaderSetReaderDisplayMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalReadersReaderSetReaderDisplay",
          method = "POST",
          path = "/v1/terminal/readers/{reader}/set_reader_display",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TerminalReader",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderSetReaderDisplay.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalReadersReaderSetReaderDisplay.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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

    public val postTerminalRefundsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTerminalRefunds",
          method = "POST",
          path = "/v1/terminal/refunds",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "JsonObject",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalRefunds.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTerminalRefunds.response.alternative1",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "basicAuth", scopes = emptyList()),
            )),
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearerAuth", scopes = emptyList()),
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
