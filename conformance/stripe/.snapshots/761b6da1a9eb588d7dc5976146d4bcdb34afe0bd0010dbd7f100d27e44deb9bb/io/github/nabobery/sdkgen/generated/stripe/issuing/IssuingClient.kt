package io.github.nabobery.sdkgen.generated.stripe.issuing

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
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingAuthorizationsGetParameterX082aa6a5
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingAuthorizationsGetParameterXbba406ce
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingAuthorizationsGetResponse200JsonXdc7af0f5
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardholdersGetParameterX1038fed8
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardholdersGetParameterX77230d33
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardholdersGetParameterXfc80ad34
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardholdersGetResponse200JsonXd91625ec
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsGetParameterX6e0c501a
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsGetParameterX7cc26cc7
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsGetParameterXa4140d67
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsGetResponse200JsonXae2c2830
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingCardsPostRequestFormX3471430e
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesGetParameterX740fe819
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesGetParameterX942b23d5
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesGetResponse200JsonX0e75ecaa
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingDisputesSubmitPostRequestFormX7697e959
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingPersonalizationDesignsGetResponse200JsonX5613f0a8
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingPhysicalBundlesGetParameterX4e05f521
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingPhysicalBundlesGetParameterX9515a673
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingPhysicalBundlesGetResponse200JsonX264eca15
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingSettlementsPostRequestFormX9aded6c0
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingTokensGetParameterX07e41bca
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingTokensGetParameterXbba3215c
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingTokensGetResponse200JsonX690c260c
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingTokensPostRequestFormXcd376e94
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingTransactionsGetParameterX23f8f703
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingTransactionsGetParameterXfa98b053
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingTransactionsGetResponse200JsonXfcf7b92a
import io.github.nabobery.sdkgen.generated.stripe.InlineV1IssuingTransactionsPostRequestFormX560cbf35
import io.github.nabobery.sdkgen.generated.stripe.IssuingAuthorization
import io.github.nabobery.sdkgen.generated.stripe.IssuingCard
import io.github.nabobery.sdkgen.generated.stripe.IssuingCardholder
import io.github.nabobery.sdkgen.generated.stripe.IssuingDispute
import io.github.nabobery.sdkgen.generated.stripe.IssuingPersonalizationDesign
import io.github.nabobery.sdkgen.generated.stripe.IssuingPhysicalBundle
import io.github.nabobery.sdkgen.generated.stripe.IssuingSettlement
import io.github.nabobery.sdkgen.generated.stripe.IssuingToken
import io.github.nabobery.sdkgen.generated.stripe.IssuingTransaction
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object IssuingCodecs {
  internal const val GETISSUINGAUTHORIZATIONS_REQUEST_CODEC_ID: String =
      "GetIssuingAuthorizations.request"

  private val getIssuingAuthorizationsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingAuthorizationsFormCodec

  private val getIssuingAuthorizationsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1IssuingAuthorizationsGetResponse200JsonXdc7af0f5> =
      KotlinxSerializationCodec("GetIssuingAuthorizations.response.alternative0", InlineV1IssuingAuthorizationsGetResponse200JsonXdc7af0f5.Serializer, SdkJson)

  internal val getIssuingAuthorizationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1IssuingAuthorizationsGetResponse200JsonXdc7af0f5> =
      MediaTypeCodecRegistry.of(getIssuingAuthorizationsResponseCodecAlternative0Codec)

  private val getIssuingAuthorizationsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingAuthorizations.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingAuthorizationsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingAuthorizationsResponseCodecAlternative1Codec)

  internal val getIssuingAuthorizationsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingAuthorizationsRequestCodec)

  internal const val GETISSUINGAUTHORIZATIONSAUTHORIZATION_REQUEST_CODEC_ID: String =
      "GetIssuingAuthorizationsAuthorization.request"

  private val getIssuingAuthorizationsAuthorizationRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingAuthorizationsAuthorizationFormCodec

  private val getIssuingAuthorizationsAuthorizationResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingAuthorization> =
      KotlinxSerializationCodec("GetIssuingAuthorizationsAuthorization.response.alternative0", IssuingAuthorization.Serializer, SdkJson)

  internal val getIssuingAuthorizationsAuthorizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingAuthorization> =
      MediaTypeCodecRegistry.of(getIssuingAuthorizationsAuthorizationResponseCodecAlternative0Codec)

  private val getIssuingAuthorizationsAuthorizationResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingAuthorizationsAuthorization.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingAuthorizationsAuthorizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingAuthorizationsAuthorizationResponseCodecAlternative1Codec)

  internal val getIssuingAuthorizationsAuthorizationRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingAuthorizationsAuthorizationRequestCodec)

  internal const val GETISSUINGCARDHOLDERS_REQUEST_CODEC_ID: String =
      "GetIssuingCardholders.request"

  private val getIssuingCardholdersRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingCardholdersFormCodec

  private val getIssuingCardholdersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1IssuingCardholdersGetResponse200JsonXd91625ec> =
      KotlinxSerializationCodec("GetIssuingCardholders.response.alternative0", InlineV1IssuingCardholdersGetResponse200JsonXd91625ec.Serializer, SdkJson)

  internal val getIssuingCardholdersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1IssuingCardholdersGetResponse200JsonXd91625ec> =
      MediaTypeCodecRegistry.of(getIssuingCardholdersResponseCodecAlternative0Codec)

  private val getIssuingCardholdersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingCardholders.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingCardholdersResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(getIssuingCardholdersResponseCodecAlternative1Codec)

  internal val getIssuingCardholdersRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingCardholdersRequestCodec)

  internal const val GETISSUINGCARDHOLDERSCARDHOLDER_REQUEST_CODEC_ID: String =
      "GetIssuingCardholdersCardholder.request"

  private val getIssuingCardholdersCardholderRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingCardholdersCardholderFormCodec

  private val getIssuingCardholdersCardholderResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingCardholder> =
      KotlinxSerializationCodec("GetIssuingCardholdersCardholder.response.alternative0", IssuingCardholder.Serializer, SdkJson)

  internal val getIssuingCardholdersCardholderResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingCardholder> =
      MediaTypeCodecRegistry.of(getIssuingCardholdersCardholderResponseCodecAlternative0Codec)

  private val getIssuingCardholdersCardholderResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingCardholdersCardholder.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingCardholdersCardholderResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingCardholdersCardholderResponseCodecAlternative1Codec)

  internal val getIssuingCardholdersCardholderRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingCardholdersCardholderRequestCodec)

  internal const val GETISSUINGCARDS_REQUEST_CODEC_ID: String = "GetIssuingCards.request"

  private val getIssuingCardsRequestCodec: MediaTypeCodec<JsonObject?> = GetIssuingCardsFormCodec

  private val getIssuingCardsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1IssuingCardsGetResponse200JsonXae2c2830> =
      KotlinxSerializationCodec("GetIssuingCards.response.alternative0", InlineV1IssuingCardsGetResponse200JsonXae2c2830.Serializer, SdkJson)

  internal val getIssuingCardsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1IssuingCardsGetResponse200JsonXae2c2830> =
      MediaTypeCodecRegistry.of(getIssuingCardsResponseCodecAlternative0Codec)

  private val getIssuingCardsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingCards.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingCardsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingCardsResponseCodecAlternative1Codec)

  internal val getIssuingCardsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingCardsRequestCodec)

  internal const val GETISSUINGCARDSCARD_REQUEST_CODEC_ID: String = "GetIssuingCardsCard.request"

  private val getIssuingCardsCardRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingCardsCardFormCodec

  private val getIssuingCardsCardResponseCodecAlternative0Codec: MediaTypeCodec<IssuingCard> =
      KotlinxSerializationCodec("GetIssuingCardsCard.response.alternative0", IssuingCard.Serializer, SdkJson)

  internal val getIssuingCardsCardResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingCard> =
      MediaTypeCodecRegistry.of(getIssuingCardsCardResponseCodecAlternative0Codec)

  private val getIssuingCardsCardResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingCardsCard.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingCardsCardResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingCardsCardResponseCodecAlternative1Codec)

  internal val getIssuingCardsCardRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingCardsCardRequestCodec)

  internal const val GETISSUINGDISPUTES_REQUEST_CODEC_ID: String = "GetIssuingDisputes.request"

  private val getIssuingDisputesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingDisputesFormCodec

  private val getIssuingDisputesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1IssuingDisputesGetResponse200JsonX0e75ecaa> =
      KotlinxSerializationCodec("GetIssuingDisputes.response.alternative0", InlineV1IssuingDisputesGetResponse200JsonX0e75ecaa.Serializer, SdkJson)

  internal val getIssuingDisputesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1IssuingDisputesGetResponse200JsonX0e75ecaa> =
      MediaTypeCodecRegistry.of(getIssuingDisputesResponseCodecAlternative0Codec)

  private val getIssuingDisputesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingDisputes.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingDisputesResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingDisputesResponseCodecAlternative1Codec)

  internal val getIssuingDisputesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingDisputesRequestCodec)

  internal const val GETISSUINGDISPUTESDISPUTE_REQUEST_CODEC_ID: String =
      "GetIssuingDisputesDispute.request"

  private val getIssuingDisputesDisputeRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingDisputesDisputeFormCodec

  private val getIssuingDisputesDisputeResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingDispute> =
      KotlinxSerializationCodec("GetIssuingDisputesDispute.response.alternative0", IssuingDispute.Serializer, SdkJson)

  internal val getIssuingDisputesDisputeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingDispute> =
      MediaTypeCodecRegistry.of(getIssuingDisputesDisputeResponseCodecAlternative0Codec)

  private val getIssuingDisputesDisputeResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingDisputesDispute.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingDisputesDisputeResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingDisputesDisputeResponseCodecAlternative1Codec)

  internal val getIssuingDisputesDisputeRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingDisputesDisputeRequestCodec)

  internal const val GETISSUINGPERSONALIZATIONDESIGNS_REQUEST_CODEC_ID: String =
      "GetIssuingPersonalizationDesigns.request"

  private val getIssuingPersonalizationDesignsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingPersonalizationDesignsFormCodec

  private val getIssuingPersonalizationDesignsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1IssuingPersonalizationDesignsGetResponse200JsonX5613f0a8> =
      KotlinxSerializationCodec("GetIssuingPersonalizationDesigns.response.alternative0", InlineV1IssuingPersonalizationDesignsGetResponse200JsonX5613f0a8.Serializer, SdkJson)

  internal val getIssuingPersonalizationDesignsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1IssuingPersonalizationDesignsGetResponse200JsonX5613f0a8> =
      MediaTypeCodecRegistry.of(getIssuingPersonalizationDesignsResponseCodecAlternative0Codec)

  private val getIssuingPersonalizationDesignsResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetIssuingPersonalizationDesigns.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingPersonalizationDesignsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingPersonalizationDesignsResponseCodecAlternative1Codec)

  internal val getIssuingPersonalizationDesignsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingPersonalizationDesignsRequestCodec)

  internal const val GETISSUINGPERSONALIZATIONDESIGNSPERSONALIZATIONDESIGN_REQUEST_CODEC_ID: String
      = "GetIssuingPersonalizationDesignsPersonalizationDesign.request"

  private val getIssuingPersonalizationDesignsPersonalizationDesignRequestCodec:
      MediaTypeCodec<JsonObject?> = GetIssuingPersonalizationDesignsPersonalizationDesignFormCodec

  private val getIssuingPersonalizationDesignsPersonalizationDesignResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingPersonalizationDesign> =
      KotlinxSerializationCodec("GetIssuingPersonalizationDesignsPersonalizationDesign.response.alternative0", IssuingPersonalizationDesign.Serializer, SdkJson)

  internal val getIssuingPersonalizationDesignsPersonalizationDesignResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingPersonalizationDesign> =
      MediaTypeCodecRegistry.of(getIssuingPersonalizationDesignsPersonalizationDesignResponseCodecAlternative0Codec)

  private val getIssuingPersonalizationDesignsPersonalizationDesignResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingPersonalizationDesignsPersonalizationDesign.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingPersonalizationDesignsPersonalizationDesignResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingPersonalizationDesignsPersonalizationDesignResponseCodecAlternative1Codec)

  internal val getIssuingPersonalizationDesignsPersonalizationDesignRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingPersonalizationDesignsPersonalizationDesignRequestCodec)

  internal const val GETISSUINGPHYSICALBUNDLES_REQUEST_CODEC_ID: String =
      "GetIssuingPhysicalBundles.request"

  private val getIssuingPhysicalBundlesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingPhysicalBundlesFormCodec

  private val getIssuingPhysicalBundlesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1IssuingPhysicalBundlesGetResponse200JsonX264eca15> =
      KotlinxSerializationCodec("GetIssuingPhysicalBundles.response.alternative0", InlineV1IssuingPhysicalBundlesGetResponse200JsonX264eca15.Serializer, SdkJson)

  internal val getIssuingPhysicalBundlesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1IssuingPhysicalBundlesGetResponse200JsonX264eca15> =
      MediaTypeCodecRegistry.of(getIssuingPhysicalBundlesResponseCodecAlternative0Codec)

  private val getIssuingPhysicalBundlesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingPhysicalBundles.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingPhysicalBundlesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingPhysicalBundlesResponseCodecAlternative1Codec)

  internal val getIssuingPhysicalBundlesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingPhysicalBundlesRequestCodec)

  internal const val GETISSUINGPHYSICALBUNDLESPHYSICALBUNDLE_REQUEST_CODEC_ID: String =
      "GetIssuingPhysicalBundlesPhysicalBundle.request"

  private val getIssuingPhysicalBundlesPhysicalBundleRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingPhysicalBundlesPhysicalBundleFormCodec

  private val getIssuingPhysicalBundlesPhysicalBundleResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingPhysicalBundle> =
      KotlinxSerializationCodec("GetIssuingPhysicalBundlesPhysicalBundle.response.alternative0", IssuingPhysicalBundle.Serializer, SdkJson)

  internal val getIssuingPhysicalBundlesPhysicalBundleResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingPhysicalBundle> =
      MediaTypeCodecRegistry.of(getIssuingPhysicalBundlesPhysicalBundleResponseCodecAlternative0Codec)

  private val getIssuingPhysicalBundlesPhysicalBundleResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingPhysicalBundlesPhysicalBundle.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingPhysicalBundlesPhysicalBundleResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingPhysicalBundlesPhysicalBundleResponseCodecAlternative1Codec)

  internal val getIssuingPhysicalBundlesPhysicalBundleRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingPhysicalBundlesPhysicalBundleRequestCodec)

  internal const val GETISSUINGSETTLEMENTSSETTLEMENT_REQUEST_CODEC_ID: String =
      "GetIssuingSettlementsSettlement.request"

  private val getIssuingSettlementsSettlementRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingSettlementsSettlementFormCodec

  private val getIssuingSettlementsSettlementResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingSettlement> =
      KotlinxSerializationCodec("GetIssuingSettlementsSettlement.response.alternative0", IssuingSettlement.Serializer, SdkJson)

  internal val getIssuingSettlementsSettlementResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingSettlement> =
      MediaTypeCodecRegistry.of(getIssuingSettlementsSettlementResponseCodecAlternative0Codec)

  private val getIssuingSettlementsSettlementResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingSettlementsSettlement.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingSettlementsSettlementResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingSettlementsSettlementResponseCodecAlternative1Codec)

  internal val getIssuingSettlementsSettlementRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingSettlementsSettlementRequestCodec)

  internal const val GETISSUINGTOKENS_REQUEST_CODEC_ID: String = "GetIssuingTokens.request"

  private val getIssuingTokensRequestCodec: MediaTypeCodec<JsonObject?> = GetIssuingTokensFormCodec

  private val getIssuingTokensResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1IssuingTokensGetResponse200JsonX690c260c> =
      KotlinxSerializationCodec("GetIssuingTokens.response.alternative0", InlineV1IssuingTokensGetResponse200JsonX690c260c.Serializer, SdkJson)

  internal val getIssuingTokensResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1IssuingTokensGetResponse200JsonX690c260c> =
      MediaTypeCodecRegistry.of(getIssuingTokensResponseCodecAlternative0Codec)

  private val getIssuingTokensResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingTokens.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingTokensResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingTokensResponseCodecAlternative1Codec)

  internal val getIssuingTokensRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingTokensRequestCodec)

  internal const val GETISSUINGTOKENSTOKEN_REQUEST_CODEC_ID: String =
      "GetIssuingTokensToken.request"

  private val getIssuingTokensTokenRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingTokensTokenFormCodec

  private val getIssuingTokensTokenResponseCodecAlternative0Codec: MediaTypeCodec<IssuingToken> =
      KotlinxSerializationCodec("GetIssuingTokensToken.response.alternative0", IssuingToken.Serializer, SdkJson)

  internal val getIssuingTokensTokenResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingToken> =
      MediaTypeCodecRegistry.of(getIssuingTokensTokenResponseCodecAlternative0Codec)

  private val getIssuingTokensTokenResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingTokensToken.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingTokensTokenResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(getIssuingTokensTokenResponseCodecAlternative1Codec)

  internal val getIssuingTokensTokenRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingTokensTokenRequestCodec)

  internal const val GETISSUINGTRANSACTIONS_REQUEST_CODEC_ID: String =
      "GetIssuingTransactions.request"

  private val getIssuingTransactionsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingTransactionsFormCodec

  private val getIssuingTransactionsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1IssuingTransactionsGetResponse200JsonXfcf7b92a> =
      KotlinxSerializationCodec("GetIssuingTransactions.response.alternative0", InlineV1IssuingTransactionsGetResponse200JsonXfcf7b92a.Serializer, SdkJson)

  internal val getIssuingTransactionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1IssuingTransactionsGetResponse200JsonXfcf7b92a> =
      MediaTypeCodecRegistry.of(getIssuingTransactionsResponseCodecAlternative0Codec)

  private val getIssuingTransactionsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetIssuingTransactions.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingTransactionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingTransactionsResponseCodecAlternative1Codec)

  internal val getIssuingTransactionsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingTransactionsRequestCodec)

  internal const val GETISSUINGTRANSACTIONSTRANSACTION_REQUEST_CODEC_ID: String =
      "GetIssuingTransactionsTransaction.request"

  private val getIssuingTransactionsTransactionRequestCodec: MediaTypeCodec<JsonObject?> =
      GetIssuingTransactionsTransactionFormCodec

  private val getIssuingTransactionsTransactionResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingTransaction> =
      KotlinxSerializationCodec("GetIssuingTransactionsTransaction.response.alternative0", IssuingTransaction.Serializer, SdkJson)

  internal val getIssuingTransactionsTransactionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingTransaction> =
      MediaTypeCodecRegistry.of(getIssuingTransactionsTransactionResponseCodecAlternative0Codec)

  private val getIssuingTransactionsTransactionResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetIssuingTransactionsTransaction.response.alternative1", Error.Serializer, SdkJson)

  internal val getIssuingTransactionsTransactionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getIssuingTransactionsTransactionResponseCodecAlternative1Codec)

  internal val getIssuingTransactionsTransactionRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getIssuingTransactionsTransactionRequestCodec)

  internal const val POSTISSUINGAUTHORIZATIONSAUTHORIZATION_REQUEST_CODEC_ID: String =
      "PostIssuingAuthorizationsAuthorization.request"

  private val postIssuingAuthorizationsAuthorizationRequestCodec:
      MediaTypeCodec<InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5?> =
      PostIssuingAuthorizationsAuthorizationFormCodec

  private val postIssuingAuthorizationsAuthorizationResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingAuthorization> =
      KotlinxSerializationCodec("PostIssuingAuthorizationsAuthorization.response.alternative0", IssuingAuthorization.Serializer, SdkJson)

  internal val postIssuingAuthorizationsAuthorizationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingAuthorization> =
      MediaTypeCodecRegistry.of(postIssuingAuthorizationsAuthorizationResponseCodecAlternative0Codec)

  private val postIssuingAuthorizationsAuthorizationResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostIssuingAuthorizationsAuthorization.response.alternative1", Error.Serializer, SdkJson)

  internal val postIssuingAuthorizationsAuthorizationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postIssuingAuthorizationsAuthorizationResponseCodecAlternative1Codec)

  internal val postIssuingAuthorizationsAuthorizationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5?> =
      MediaTypeCodecRegistry.of(postIssuingAuthorizationsAuthorizationRequestCodec)

  internal const val POSTISSUINGAUTHORIZATIONSAUTHORIZATIONAPPROVE_REQUEST_CODEC_ID: String =
      "PostIssuingAuthorizationsAuthorizationApprove.request"

  private val postIssuingAuthorizationsAuthorizationApproveRequestCodec:
      MediaTypeCodec<InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4?> =
      PostIssuingAuthorizationsAuthorizationApproveFormCodec

  private val postIssuingAuthorizationsAuthorizationApproveResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingAuthorization> =
      KotlinxSerializationCodec("PostIssuingAuthorizationsAuthorizationApprove.response.alternative0", IssuingAuthorization.Serializer, SdkJson)

  internal val postIssuingAuthorizationsAuthorizationApproveResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingAuthorization> =
      MediaTypeCodecRegistry.of(postIssuingAuthorizationsAuthorizationApproveResponseCodecAlternative0Codec)

  private val postIssuingAuthorizationsAuthorizationApproveResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostIssuingAuthorizationsAuthorizationApprove.response.alternative1", Error.Serializer, SdkJson)

  internal val postIssuingAuthorizationsAuthorizationApproveResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postIssuingAuthorizationsAuthorizationApproveResponseCodecAlternative1Codec)

  internal val postIssuingAuthorizationsAuthorizationApproveRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4?> =
      MediaTypeCodecRegistry.of(postIssuingAuthorizationsAuthorizationApproveRequestCodec)

  internal const val POSTISSUINGAUTHORIZATIONSAUTHORIZATIONDECLINE_REQUEST_CODEC_ID: String =
      "PostIssuingAuthorizationsAuthorizationDecline.request"

  private val postIssuingAuthorizationsAuthorizationDeclineRequestCodec:
      MediaTypeCodec<InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca?> =
      PostIssuingAuthorizationsAuthorizationDeclineFormCodec

  private val postIssuingAuthorizationsAuthorizationDeclineResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingAuthorization> =
      KotlinxSerializationCodec("PostIssuingAuthorizationsAuthorizationDecline.response.alternative0", IssuingAuthorization.Serializer, SdkJson)

  internal val postIssuingAuthorizationsAuthorizationDeclineResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingAuthorization> =
      MediaTypeCodecRegistry.of(postIssuingAuthorizationsAuthorizationDeclineResponseCodecAlternative0Codec)

  private val postIssuingAuthorizationsAuthorizationDeclineResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostIssuingAuthorizationsAuthorizationDecline.response.alternative1", Error.Serializer, SdkJson)

  internal val postIssuingAuthorizationsAuthorizationDeclineResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postIssuingAuthorizationsAuthorizationDeclineResponseCodecAlternative1Codec)

  internal val postIssuingAuthorizationsAuthorizationDeclineRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca?> =
      MediaTypeCodecRegistry.of(postIssuingAuthorizationsAuthorizationDeclineRequestCodec)

  internal const val POSTISSUINGCARDSCARD_REQUEST_CODEC_ID: String = "PostIssuingCardsCard.request"

  private val postIssuingCardsCardRequestCodec:
      MediaTypeCodec<InlineV1IssuingCardsPostRequestFormX3471430e?> = PostIssuingCardsCardFormCodec

  private val postIssuingCardsCardResponseCodecAlternative0Codec: MediaTypeCodec<IssuingCard> =
      KotlinxSerializationCodec("PostIssuingCardsCard.response.alternative0", IssuingCard.Serializer, SdkJson)

  internal val postIssuingCardsCardResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingCard> =
      MediaTypeCodecRegistry.of(postIssuingCardsCardResponseCodecAlternative0Codec)

  private val postIssuingCardsCardResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostIssuingCardsCard.response.alternative1", Error.Serializer, SdkJson)

  internal val postIssuingCardsCardResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(postIssuingCardsCardResponseCodecAlternative1Codec)

  internal val postIssuingCardsCardRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IssuingCardsPostRequestFormX3471430e?> =
      MediaTypeCodecRegistry.of(postIssuingCardsCardRequestCodec)

  internal const val POSTISSUINGDISPUTESDISPUTESUBMIT_REQUEST_CODEC_ID: String =
      "PostIssuingDisputesDisputeSubmit.request"

  private val postIssuingDisputesDisputeSubmitRequestCodec:
      MediaTypeCodec<InlineV1IssuingDisputesSubmitPostRequestFormX7697e959?> =
      PostIssuingDisputesDisputeSubmitFormCodec

  private val postIssuingDisputesDisputeSubmitResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingDispute> =
      KotlinxSerializationCodec("PostIssuingDisputesDisputeSubmit.response.alternative0", IssuingDispute.Serializer, SdkJson)

  internal val postIssuingDisputesDisputeSubmitResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingDispute> =
      MediaTypeCodecRegistry.of(postIssuingDisputesDisputeSubmitResponseCodecAlternative0Codec)

  private val postIssuingDisputesDisputeSubmitResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostIssuingDisputesDisputeSubmit.response.alternative1", Error.Serializer, SdkJson)

  internal val postIssuingDisputesDisputeSubmitResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postIssuingDisputesDisputeSubmitResponseCodecAlternative1Codec)

  internal val postIssuingDisputesDisputeSubmitRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IssuingDisputesSubmitPostRequestFormX7697e959?> =
      MediaTypeCodecRegistry.of(postIssuingDisputesDisputeSubmitRequestCodec)

  internal const val POSTISSUINGSETTLEMENTSSETTLEMENT_REQUEST_CODEC_ID: String =
      "PostIssuingSettlementsSettlement.request"

  private val postIssuingSettlementsSettlementRequestCodec:
      MediaTypeCodec<InlineV1IssuingSettlementsPostRequestFormX9aded6c0?> =
      PostIssuingSettlementsSettlementFormCodec

  private val postIssuingSettlementsSettlementResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingSettlement> =
      KotlinxSerializationCodec("PostIssuingSettlementsSettlement.response.alternative0", IssuingSettlement.Serializer, SdkJson)

  internal val postIssuingSettlementsSettlementResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingSettlement> =
      MediaTypeCodecRegistry.of(postIssuingSettlementsSettlementResponseCodecAlternative0Codec)

  private val postIssuingSettlementsSettlementResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostIssuingSettlementsSettlement.response.alternative1", Error.Serializer, SdkJson)

  internal val postIssuingSettlementsSettlementResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postIssuingSettlementsSettlementResponseCodecAlternative1Codec)

  internal val postIssuingSettlementsSettlementRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IssuingSettlementsPostRequestFormX9aded6c0?> =
      MediaTypeCodecRegistry.of(postIssuingSettlementsSettlementRequestCodec)

  internal const val POSTISSUINGTOKENSTOKEN_REQUEST_CODEC_ID: String =
      "PostIssuingTokensToken.request"

  private val postIssuingTokensTokenRequestCodec:
      MediaTypeCodec<InlineV1IssuingTokensPostRequestFormXcd376e94> =
      PostIssuingTokensTokenFormCodec

  private val postIssuingTokensTokenResponseCodecAlternative0Codec: MediaTypeCodec<IssuingToken> =
      KotlinxSerializationCodec("PostIssuingTokensToken.response.alternative0", IssuingToken.Serializer, SdkJson)

  internal val postIssuingTokensTokenResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingToken> =
      MediaTypeCodecRegistry.of(postIssuingTokensTokenResponseCodecAlternative0Codec)

  private val postIssuingTokensTokenResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostIssuingTokensToken.response.alternative1", Error.Serializer, SdkJson)

  internal val postIssuingTokensTokenResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postIssuingTokensTokenResponseCodecAlternative1Codec)

  internal val postIssuingTokensTokenRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IssuingTokensPostRequestFormXcd376e94> =
      MediaTypeCodecRegistry.of(postIssuingTokensTokenRequestCodec)

  internal const val POSTISSUINGTRANSACTIONSTRANSACTION_REQUEST_CODEC_ID: String =
      "PostIssuingTransactionsTransaction.request"

  private val postIssuingTransactionsTransactionRequestCodec:
      MediaTypeCodec<InlineV1IssuingTransactionsPostRequestFormX560cbf35?> =
      PostIssuingTransactionsTransactionFormCodec

  private val postIssuingTransactionsTransactionResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingTransaction> =
      KotlinxSerializationCodec("PostIssuingTransactionsTransaction.response.alternative0", IssuingTransaction.Serializer, SdkJson)

  internal val postIssuingTransactionsTransactionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingTransaction> =
      MediaTypeCodecRegistry.of(postIssuingTransactionsTransactionResponseCodecAlternative0Codec)

  private val postIssuingTransactionsTransactionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostIssuingTransactionsTransaction.response.alternative1", Error.Serializer, SdkJson)

  internal val postIssuingTransactionsTransactionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postIssuingTransactionsTransactionResponseCodecAlternative1Codec)

  internal val postIssuingTransactionsTransactionRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1IssuingTransactionsPostRequestFormX560cbf35?> =
      MediaTypeCodecRegistry.of(postIssuingTransactionsTransactionRequestCodec)

  internal object GetIssuingAuthorizationsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingAuthorizations.request"

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

  internal object GetIssuingAuthorizationsAuthorizationFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingAuthorizationsAuthorization.request"

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

  internal object GetIssuingCardholdersFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingCardholders.request"

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

  internal object GetIssuingCardholdersCardholderFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingCardholdersCardholder.request"

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

  internal object GetIssuingCardsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingCards.request"

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

  internal object GetIssuingCardsCardFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingCardsCard.request"

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

  internal object GetIssuingDisputesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingDisputes.request"

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

  internal object GetIssuingDisputesDisputeFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingDisputesDispute.request"

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

  internal object GetIssuingPersonalizationDesignsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingPersonalizationDesigns.request"

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

  internal object GetIssuingPersonalizationDesignsPersonalizationDesignFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingPersonalizationDesignsPersonalizationDesign.request"

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

  internal object GetIssuingPhysicalBundlesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingPhysicalBundles.request"

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

  internal object GetIssuingPhysicalBundlesPhysicalBundleFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingPhysicalBundlesPhysicalBundle.request"

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

  internal object GetIssuingSettlementsSettlementFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingSettlementsSettlement.request"

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

  internal object GetIssuingTokensFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingTokens.request"

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

  internal object GetIssuingTokensTokenFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingTokensToken.request"

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

  internal object GetIssuingTransactionsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingTransactions.request"

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

  internal object GetIssuingTransactionsTransactionFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetIssuingTransactionsTransaction.request"

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

  internal object PostIssuingAuthorizationsAuthorizationFormCodec : MediaTypeCodec<InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5?> {
    override val id: String = "PostIssuingAuthorizationsAuthorization.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5?, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1IssuingAuthorizationsPostRequestFormMetadataAnyOf2X3f717ec1).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostIssuingAuthorizationsAuthorizationApproveFormCodec : MediaTypeCodec<InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4?> {
    override val id: String = "PostIssuingAuthorizationsAuthorizationApprove.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
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
          formValue0.inlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1IssuingAuthorizationsApprovePostRequestFormMetadataAnyOf2Xa79e56fa).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostIssuingAuthorizationsAuthorizationDeclineFormCodec : MediaTypeCodec<InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca?> {
    override val id: String = "PostIssuingAuthorizationsAuthorizationDecline.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca?, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataAnyOf2Xcd0baea7).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostIssuingCardsCardFormCodec : MediaTypeCodec<InlineV1IssuingCardsPostRequestFormX3471430e?> {
    override val id: String = "PostIssuingCardsCard.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IssuingCardsPostRequestFormX3471430e?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.cancellationReason?.let { formValue0 ->
        form.add("cancellation_reason", formValue0.value)
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
          formValue0.inlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1IssuingCardsPostRequestFormMetadataAnyOf2Xd06954e3).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.personalizationDesign?.let { formValue0 ->
        form.add("personalization_design", formValue0)
      }
      request.pin?.let { formValue0 ->
        formValue0.encryptedNumber?.let { formValue2 ->
          form.add("pin" + "[encrypted_number]", formValue2)
        }
      }
      request.shipping?.let { formValue0 ->
        form.add("shipping" + "[address]" + "[city]", formValue0.address.city)
        form.add("shipping" + "[address]" + "[country]", formValue0.address.country)
        form.add("shipping" + "[address]" + "[line1]", formValue0.address.line1)
        formValue0.address.line2?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[line2]", formValue3)
        }
        form.add("shipping" + "[address]" + "[postal_code]", formValue0.address.postalCode)
        formValue0.address.state?.let { formValue3 ->
          form.add("shipping" + "[address]" + "[state]", formValue3)
        }
        formValue0.addressValidation?.let { formValue2 ->
          form.add("shipping" + "[address_validation]" + "[mode]", formValue2.mode.value)
        }
        formValue0.customs?.let { formValue2 ->
          formValue2.eoriNumber?.let { formValue4 ->
            form.add("shipping" + "[customs]" + "[eori_number]", formValue4)
          }
        }
        form.add("shipping" + "[name]", formValue0.name)
        formValue0.phoneNumber?.let { formValue2 ->
          form.add("shipping" + "[phone_number]", formValue2)
        }
        formValue0.requireSignature?.let { formValue2 ->
          form.add("shipping" + "[require_signature]", formValue2.toString())
        }
        formValue0.service?.let { formValue2 ->
          form.add("shipping" + "[service]", formValue2.value)
        }
        formValue0.type?.let { formValue2 ->
          form.add("shipping" + "[type]", formValue2.value)
        }
      }
      request.spendingControls?.let { formValue0 ->
        formValue0.allowedCardPresences?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("spending_controls" + "[allowed_card_presences]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("spending_controls" + "[allowed_card_presences]" + "[" + formIndex3 + "]", formElement3.value)
            }
          }
        }
        formValue0.allowedCategories?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("spending_controls" + "[allowed_categories]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("spending_controls" + "[allowed_categories]" + "[" + formIndex3 + "]", formElement3.value)
            }
          }
        }
        formValue0.allowedMerchantCountries?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("spending_controls" + "[allowed_merchant_countries]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("spending_controls" + "[allowed_merchant_countries]" + "[" + formIndex3 + "]", formElement3)
            }
          }
        }
        formValue0.blockedCardPresences?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("spending_controls" + "[blocked_card_presences]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("spending_controls" + "[blocked_card_presences]" + "[" + formIndex3 + "]", formElement3.value)
            }
          }
        }
        formValue0.blockedCategories?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("spending_controls" + "[blocked_categories]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("spending_controls" + "[blocked_categories]" + "[" + formIndex3 + "]", formElement3.value)
            }
          }
        }
        formValue0.blockedMerchantCountries?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("spending_controls" + "[blocked_merchant_countries]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("spending_controls" + "[blocked_merchant_countries]" + "[" + formIndex3 + "]", formElement3)
            }
          }
        }
        formValue0.spendingLimits?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("spending_controls" + "[spending_limits]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              form.add("spending_controls" + "[spending_limits]" + "[" + formIndex3 + "]" + "[amount]", formElement3.amount.toString())
              formElement3.categories?.let { formValue5 ->
                if (formValue5.isEmpty()) {
                  form.add("spending_controls" + "[spending_limits]" + "[" + formIndex3 + "]" + "[categories]", "")
                } else {
                  formValue5.forEachIndexed { formIndex6, formElement6 ->
                    form.add("spending_controls" + "[spending_limits]" + "[" + formIndex3 + "]" + "[categories]" + "[" + formIndex6 + "]", formElement6.value)
                  }
                }
              }
              form.add("spending_controls" + "[spending_limits]" + "[" + formIndex3 + "]" + "[interval]", formElement3.interval.value)
            }
          }
        }
      }
      request.status?.let { formValue0 ->
        form.add("status", formValue0.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IssuingCardsPostRequestFormX3471430e? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostIssuingDisputesDisputeSubmitFormCodec : MediaTypeCodec<InlineV1IssuingDisputesSubmitPostRequestFormX7697e959?> {
    override val id: String = "PostIssuingDisputesDisputeSubmit.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IssuingDisputesSubmitPostRequestFormX7697e959?, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1IssuingDisputesSubmitPostRequestFormMetadataAnyOf2X02469bb2 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1IssuingDisputesSubmitPostRequestFormMetadataAnyOf2X02469bb2).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IssuingDisputesSubmitPostRequestFormX7697e959? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostIssuingSettlementsSettlementFormCodec : MediaTypeCodec<InlineV1IssuingSettlementsPostRequestFormX9aded6c0?> {
    override val id: String = "PostIssuingSettlementsSettlement.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IssuingSettlementsPostRequestFormX9aded6c0?, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IssuingSettlementsPostRequestFormX9aded6c0? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostIssuingTokensTokenFormCodec : MediaTypeCodec<InlineV1IssuingTokensPostRequestFormXcd376e94> {
    override val id: String = "PostIssuingTokensToken.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IssuingTokensPostRequestFormXcd376e94, mediaType: String): SdkRequestBody {
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
      form.add("status", request.status.value)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IssuingTokensPostRequestFormXcd376e94 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostIssuingTransactionsTransactionFormCodec : MediaTypeCodec<InlineV1IssuingTransactionsPostRequestFormX560cbf35?> {
    override val id: String = "PostIssuingTransactionsTransaction.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1IssuingTransactionsPostRequestFormX560cbf35?, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1IssuingTransactionsPostRequestFormX560cbf35? {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'issuing' group of Stripe API.
 */
public class IssuingClient(
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
      SdkExecutor(transport, authentication = this@IssuingClient.authentication)

  /**
   * <p>Returns a list of Issuing <code>Authorization</code> objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param card Only return authorizations that belong to the given card.
   * @param cardholder Only return authorizations that belong to the given cardholder.
   * @param created Only return authorizations that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return authorizations with the given status. One of `pending`, `closed`, or `reversed`.
   * @param options Execution options.
   */
  public suspend fun getIssuingAuthorizationsWithResponse(
    request: JsonObject? = null,
    card: String? = null,
    cardholder: String? = null,
    created: InlineV1IssuingAuthorizationsGetParameterXbba406ce? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1IssuingAuthorizationsGetParameterX082aa6a5? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingAuthorizationsResponse> = executor.executeWithResponse<JsonObject?, GetIssuingAuthorizationsResponse>(SdkExecutionRequest(getIssuingAuthorizationsMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGAUTHORIZATIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "card", values = card?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cardholder", values = cardholder?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuingCodecs.getIssuingAuthorizationsRequestCodecRegistry, GetIssuingAuthorizationsResponseDecoder, options)

  /**
   * <p>Retrieves an Issuing <code>Authorization</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param authorization Wire parameter `authorization`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getIssuingAuthorizationsAuthorizationWithResponse(
    request: JsonObject? = null,
    authorization: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingAuthorizationsAuthorizationResponse> = executor.executeWithResponse<JsonObject?, GetIssuingAuthorizationsAuthorizationResponse>(SdkExecutionRequest(getIssuingAuthorizationsAuthorizationMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGAUTHORIZATIONSAUTHORIZATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "authorization", values = listOf(authorization.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), IssuingCodecs.getIssuingAuthorizationsAuthorizationRequestCodecRegistry, GetIssuingAuthorizationsAuthorizationResponseDecoder, options)

  /**
   * <p>Returns a list of Issuing <code>Cardholder</code> objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return cardholders that were created during the given date interval.
   * @param email Only return cardholders that have the given email address.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param phoneNumber Only return cardholders that have the given phone number.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return cardholders that have the given status. One of `active`, `inactive`, or `blocked`.
   * @param type Only return cardholders that have the given type. One of `individual` or `company`.
   * @param options Execution options.
   */
  public suspend fun getIssuingCardholdersWithResponse(
    request: JsonObject? = null,
    created: InlineV1IssuingCardholdersGetParameterXfc80ad34? = null,
    email: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    phoneNumber: String? = null,
    startingAfter: String? = null,
    status: InlineV1IssuingCardholdersGetParameterX77230d33? = null,
    type: InlineV1IssuingCardholdersGetParameterX1038fed8? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingCardholdersResponse> = executor.executeWithResponse<JsonObject?, GetIssuingCardholdersResponse>(SdkExecutionRequest(getIssuingCardholdersMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGCARDHOLDERS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "email", values = email?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "phone_number", values = phoneNumber?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuingCodecs.getIssuingCardholdersRequestCodecRegistry, GetIssuingCardholdersResponseDecoder, options)

  /**
   * <p>Retrieves an Issuing <code>Cardholder</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param cardholder Wire parameter `cardholder`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getIssuingCardholdersCardholderWithResponse(
    request: JsonObject? = null,
    cardholder: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingCardholdersCardholderResponse> = executor.executeWithResponse<JsonObject?, GetIssuingCardholdersCardholderResponse>(SdkExecutionRequest(getIssuingCardholdersCardholderMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGCARDHOLDERSCARDHOLDER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "cardholder", values = listOf(cardholder.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), IssuingCodecs.getIssuingCardholdersCardholderRequestCodecRegistry, GetIssuingCardholdersCardholderResponseDecoder, options)

  /**
   * <p>Returns a list of Issuing <code>Card</code> objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param cardholder Only return cards belonging to the Cardholder with the provided ID.
   * @param created Only return cards that were issued during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expMonth Only return cards that have the given expiration month.
   * @param expYear Only return cards that have the given expiration year.
   * @param expand Specifies which fields in the response should be expanded.
   * @param last4 Only return cards that have the given last four digits.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param personalizationDesign Wire parameter `personalization_design`.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return cards that have the given status. One of `active`, `inactive`, or `canceled`.
   * @param type Only return cards that have the given type. One of `virtual` or `physical`.
   * @param options Execution options.
   */
  public suspend fun getIssuingCardsWithResponse(
    request: JsonObject? = null,
    cardholder: String? = null,
    created: InlineV1IssuingCardsGetParameterX6e0c501a? = null,
    endingBefore: String? = null,
    expMonth: Int? = null,
    expYear: Int? = null,
    expand: List<String>? = null,
    last4: String? = null,
    limit: Int? = null,
    personalizationDesign: String? = null,
    startingAfter: String? = null,
    status: InlineV1IssuingCardsGetParameterXa4140d67? = null,
    type: InlineV1IssuingCardsGetParameterX7cc26cc7? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingCardsResponse> = executor.executeWithResponse<JsonObject?, GetIssuingCardsResponse>(SdkExecutionRequest(getIssuingCardsMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGCARDS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cardholder", values = cardholder?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exp_month", values = expMonth?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "exp_year", values = expYear?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "last4", values = last4?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "personalization_design", values = personalizationDesign?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuingCodecs.getIssuingCardsRequestCodecRegistry, GetIssuingCardsResponseDecoder, options)

  /**
   * <p>Retrieves an Issuing <code>Card</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param card Wire parameter `card`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getIssuingCardsCardWithResponse(
    request: JsonObject? = null,
    card: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingCardsCardResponse> = executor.executeWithResponse<JsonObject?, GetIssuingCardsCardResponse>(SdkExecutionRequest(getIssuingCardsCardMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGCARDSCARD_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "card", values = listOf(card.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), IssuingCodecs.getIssuingCardsCardRequestCodecRegistry, GetIssuingCardsCardResponseDecoder, options)

  /**
   * <p>Returns a list of Issuing <code>Dispute</code> objects. The objects are sorted in descending order by creation
   * date, with the most recently created object appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return Issuing disputes that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Select Issuing disputes with the given status.
   * @param transaction Select the Issuing dispute for the given transaction.
   * @param options Execution options.
   */
  public suspend fun getIssuingDisputesWithResponse(
    request: JsonObject? = null,
    created: InlineV1IssuingDisputesGetParameterX942b23d5? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1IssuingDisputesGetParameterX740fe819? = null,
    transaction: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingDisputesResponse> = executor.executeWithResponse<JsonObject?, GetIssuingDisputesResponse>(SdkExecutionRequest(getIssuingDisputesMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGDISPUTES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "transaction", values = transaction?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuingCodecs.getIssuingDisputesRequestCodecRegistry, GetIssuingDisputesResponseDecoder, options)

  /**
   * <p>Retrieves an Issuing <code>Dispute</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param dispute Wire parameter `dispute`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getIssuingDisputesDisputeWithResponse(
    request: JsonObject? = null,
    dispute: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingDisputesDisputeResponse> = executor.executeWithResponse<JsonObject?, GetIssuingDisputesDisputeResponse>(SdkExecutionRequest(getIssuingDisputesDisputeMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGDISPUTESDISPUTE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "dispute", values = listOf(dispute.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), IssuingCodecs.getIssuingDisputesDisputeRequestCodecRegistry, GetIssuingDisputesDisputeResponseDecoder, options)

  /**
   * <p>Returns a list of personalization design objects. The objects are sorted in descending order by creation date,
   * with the most recently created object appearing first.</p>
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
   * @param lookupKeys Only return personalization designs with the given lookup keys.
   * @param preferences Only return personalization designs with the given preferences.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Only return personalization designs with the given status.
   * @param options Execution options.
   */
  public suspend fun getIssuingPersonalizationDesignsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    lookupKeys: List<String>? = null,
    preferences: InlineV1IssuingPersonalizationDesignsGetParameterX38a345c9? = null,
    startingAfter: String? = null,
    status: InlineV1IssuingPersonalizationDesignsGetParameterX3be6a9ce? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingPersonalizationDesignsResponse> = executor.executeWithResponse<JsonObject?, GetIssuingPersonalizationDesignsResponse>(SdkExecutionRequest(getIssuingPersonalizationDesignsMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGPERSONALIZATIONDESIGNS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    lookupKeys?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "lookup_keys" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "preferences[is_default]", values = preferences?.isDefault?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "preferences[is_platform_default]", values = preferences?.isPlatformDefault?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuingCodecs.getIssuingPersonalizationDesignsRequestCodecRegistry, GetIssuingPersonalizationDesignsResponseDecoder, options)

  /**
   * <p>Retrieves a personalization design object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param personalizationDesign Wire parameter `personalization_design`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getIssuingPersonalizationDesignsPersonalizationDesignWithResponse(
    request: JsonObject? = null,
    personalizationDesign: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingPersonalizationDesignsPersonalizationDesignResponse> = executor.executeWithResponse<JsonObject?, GetIssuingPersonalizationDesignsPersonalizationDesignResponse>(SdkExecutionRequest(getIssuingPersonalizationDesignsPersonalizationDesignMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGPERSONALIZATIONDESIGNSPERSONALIZATIONDESIGN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "personalization_design", values = listOf(personalizationDesign.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), IssuingCodecs.getIssuingPersonalizationDesignsPersonalizationDesignRequestCodecRegistry, GetIssuingPersonalizationDesignsPersonalizationDesignResponseDecoder, options)

  /**
   * <p>Returns a list of physical bundle objects. The objects are sorted in descending order by creation date, with the
   * most recently created object appearing first.</p>
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
   * @param status Only return physical bundles with the given status.
   * @param type Only return physical bundles with the given type.
   * @param options Execution options.
   */
  public suspend fun getIssuingPhysicalBundlesWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1IssuingPhysicalBundlesGetParameterX4e05f521? = null,
    type: InlineV1IssuingPhysicalBundlesGetParameterX9515a673? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingPhysicalBundlesResponse> = executor.executeWithResponse<JsonObject?, GetIssuingPhysicalBundlesResponse>(SdkExecutionRequest(getIssuingPhysicalBundlesMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGPHYSICALBUNDLES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuingCodecs.getIssuingPhysicalBundlesRequestCodecRegistry, GetIssuingPhysicalBundlesResponseDecoder, options)

  /**
   * <p>Retrieves a physical bundle object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param physicalBundle Wire parameter `physical_bundle`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getIssuingPhysicalBundlesPhysicalBundleWithResponse(
    request: JsonObject? = null,
    physicalBundle: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingPhysicalBundlesPhysicalBundleResponse> = executor.executeWithResponse<JsonObject?, GetIssuingPhysicalBundlesPhysicalBundleResponse>(SdkExecutionRequest(getIssuingPhysicalBundlesPhysicalBundleMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGPHYSICALBUNDLESPHYSICALBUNDLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "physical_bundle", values = listOf(physicalBundle.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), IssuingCodecs.getIssuingPhysicalBundlesPhysicalBundleRequestCodecRegistry, GetIssuingPhysicalBundlesPhysicalBundleResponseDecoder, options)

  /**
   * <p>Retrieves an Issuing <code>Settlement</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param settlement Wire parameter `settlement`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getIssuingSettlementsSettlementWithResponse(
    request: JsonObject? = null,
    settlement: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingSettlementsSettlementResponse> = executor.executeWithResponse<JsonObject?, GetIssuingSettlementsSettlementResponse>(SdkExecutionRequest(getIssuingSettlementsSettlementMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGSETTLEMENTSSETTLEMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "settlement", values = listOf(settlement.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), IssuingCodecs.getIssuingSettlementsSettlementRequestCodecRegistry, GetIssuingSettlementsSettlementResponseDecoder, options)

  /**
   * <p>Lists all Issuing <code>Token</code> objects for a given card.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param card The Issuing card identifier to list tokens for.
   * @param created Only return Issuing tokens that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param status Select Issuing tokens with the given status.
   * @param options Execution options.
   */
  public suspend fun getIssuingTokensWithResponse(
    request: JsonObject? = null,
    card: String,
    created: InlineV1IssuingTokensGetParameterX07e41bca? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1IssuingTokensGetParameterXbba3215c? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingTokensResponse> = executor.executeWithResponse<JsonObject?, GetIssuingTokensResponse>(SdkExecutionRequest(getIssuingTokensMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGTOKENS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "card", values = listOf(card.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuingCodecs.getIssuingTokensRequestCodecRegistry, GetIssuingTokensResponseDecoder, options)

  /**
   * <p>Retrieves an Issuing <code>Token</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param token Wire parameter `token`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getIssuingTokensTokenWithResponse(
    request: JsonObject? = null,
    token: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingTokensTokenResponse> = executor.executeWithResponse<JsonObject?, GetIssuingTokensTokenResponse>(SdkExecutionRequest(getIssuingTokensTokenMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGTOKENSTOKEN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "token", values = listOf(token.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), IssuingCodecs.getIssuingTokensTokenRequestCodecRegistry, GetIssuingTokensTokenResponseDecoder, options)

  /**
   * <p>Returns a list of Issuing <code>Transaction</code> objects. The objects are sorted in descending order by
   * creation date, with the most recently created object appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param card Only return transactions that belong to the given card.
   * @param cardholder Only return transactions that belong to the given cardholder.
   * @param created Only return transactions that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param type Only return transactions that have the given type. One of `capture` or `refund`.
   * @param options Execution options.
   */
  public suspend fun getIssuingTransactionsWithResponse(
    request: JsonObject? = null,
    card: String? = null,
    cardholder: String? = null,
    created: InlineV1IssuingTransactionsGetParameterX23f8f703? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    type: InlineV1IssuingTransactionsGetParameterXfa98b053? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingTransactionsResponse> = executor.executeWithResponse<JsonObject?, GetIssuingTransactionsResponse>(SdkExecutionRequest(getIssuingTransactionsMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGTRANSACTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "card", values = card?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "cardholder", values = cardholder?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
  }), IssuingCodecs.getIssuingTransactionsRequestCodecRegistry, GetIssuingTransactionsResponseDecoder, options)

  /**
   * <p>Retrieves an Issuing <code>Transaction</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param transaction Wire parameter `transaction`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getIssuingTransactionsTransactionWithResponse(
    request: JsonObject? = null,
    transaction: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetIssuingTransactionsTransactionResponse> = executor.executeWithResponse<JsonObject?, GetIssuingTransactionsTransactionResponse>(SdkExecutionRequest(getIssuingTransactionsTransactionMetadata, baseUri, request, listOf(IssuingCodecs.GETISSUINGTRANSACTIONSTRANSACTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transaction", values = listOf(transaction.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), IssuingCodecs.getIssuingTransactionsTransactionRequestCodecRegistry, GetIssuingTransactionsTransactionResponseDecoder, options)

  /**
   * <p>Updates the specified Issuing <code>Authorization</code> object by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param authorization Wire parameter `authorization`.
   * @param options Execution options.
   */
  public suspend fun postIssuingAuthorizationsAuthorizationWithResponse(
    request: InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5? = null,
    authorization: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostIssuingAuthorizationsAuthorizationResponse> = executor.executeWithResponse<InlineV1IssuingAuthorizationsPostRequestFormXe9d990a5?, PostIssuingAuthorizationsAuthorizationResponse>(SdkExecutionRequest(postIssuingAuthorizationsAuthorizationMetadata, baseUri, request, listOf(IssuingCodecs.POSTISSUINGAUTHORIZATIONSAUTHORIZATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "authorization", values = listOf(authorization.toString())))
  }), IssuingCodecs.postIssuingAuthorizationsAuthorizationRequestCodecRegistry, PostIssuingAuthorizationsAuthorizationResponseDecoder, options)

  /**
   * <p>[Deprecated] Approves a pending Issuing <code>Authorization</code> object. This request should be made within
   * the timeout window of the <a href="/docs/issuing/controls/real-time-authorizations">real-time authorization</a>
   * flow.
   * This method is deprecated. Instead, <a
   * href="/docs/issuing/controls/real-time-authorizations#authorization-handling">respond directly to the webhook
   * request to approve an authorization</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param authorization Wire parameter `authorization`.
   * @param options Execution options.
   */
  public suspend fun postIssuingAuthorizationsAuthorizationApproveWithResponse(
    request: InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4? = null,
    authorization: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostIssuingAuthorizationsAuthorizationApproveResponse> = executor.executeWithResponse<InlineV1IssuingAuthorizationsApprovePostRequestFormX50e66fe4?, PostIssuingAuthorizationsAuthorizationApproveResponse>(SdkExecutionRequest(postIssuingAuthorizationsAuthorizationApproveMetadata, baseUri, request, listOf(IssuingCodecs.POSTISSUINGAUTHORIZATIONSAUTHORIZATIONAPPROVE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "authorization", values = listOf(authorization.toString())))
  }), IssuingCodecs.postIssuingAuthorizationsAuthorizationApproveRequestCodecRegistry, PostIssuingAuthorizationsAuthorizationApproveResponseDecoder, options)

  /**
   * <p>[Deprecated] Declines a pending Issuing <code>Authorization</code> object. This request should be made within
   * the timeout window of the <a href="/docs/issuing/controls/real-time-authorizations">real time authorization</a>
   * flow.
   * This method is deprecated. Instead, <a
   * href="/docs/issuing/controls/real-time-authorizations#authorization-handling">respond directly to the webhook
   * request to decline an authorization</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param authorization Wire parameter `authorization`.
   * @param options Execution options.
   */
  public suspend fun postIssuingAuthorizationsAuthorizationDeclineWithResponse(
    request: InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca? = null,
    authorization: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostIssuingAuthorizationsAuthorizationDeclineResponse> = executor.executeWithResponse<InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca?, PostIssuingAuthorizationsAuthorizationDeclineResponse>(SdkExecutionRequest(postIssuingAuthorizationsAuthorizationDeclineMetadata, baseUri, request, listOf(IssuingCodecs.POSTISSUINGAUTHORIZATIONSAUTHORIZATIONDECLINE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "authorization", values = listOf(authorization.toString())))
  }), IssuingCodecs.postIssuingAuthorizationsAuthorizationDeclineRequestCodecRegistry, PostIssuingAuthorizationsAuthorizationDeclineResponseDecoder, options)

  /**
   * <p>Updates the specified Issuing <code>Card</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param card Wire parameter `card`.
   * @param options Execution options.
   */
  public suspend fun postIssuingCardsCardWithResponse(
    request: InlineV1IssuingCardsPostRequestFormX3471430e? = null,
    card: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostIssuingCardsCardResponse> = executor.executeWithResponse<InlineV1IssuingCardsPostRequestFormX3471430e?, PostIssuingCardsCardResponse>(SdkExecutionRequest(postIssuingCardsCardMetadata, baseUri, request, listOf(IssuingCodecs.POSTISSUINGCARDSCARD_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "card", values = listOf(card.toString())))
  }), IssuingCodecs.postIssuingCardsCardRequestCodecRegistry, PostIssuingCardsCardResponseDecoder, options)

  /**
   * <p>Submits an Issuing <code>Dispute</code> to the card network. Stripe validates that all evidence fields required
   * for the dispute’s reason are present. For more details, see <a
   * href="/docs/issuing/purchases/disputes#dispute-reasons-and-evidence">Dispute reasons and evidence</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param dispute Wire parameter `dispute`.
   * @param options Execution options.
   */
  public suspend fun postIssuingDisputesDisputeSubmitWithResponse(
    request: InlineV1IssuingDisputesSubmitPostRequestFormX7697e959? = null,
    dispute: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostIssuingDisputesDisputeSubmitResponse> = executor.executeWithResponse<InlineV1IssuingDisputesSubmitPostRequestFormX7697e959?, PostIssuingDisputesDisputeSubmitResponse>(SdkExecutionRequest(postIssuingDisputesDisputeSubmitMetadata, baseUri, request, listOf(IssuingCodecs.POSTISSUINGDISPUTESDISPUTESUBMIT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "dispute", values = listOf(dispute.toString())))
  }), IssuingCodecs.postIssuingDisputesDisputeSubmitRequestCodecRegistry, PostIssuingDisputesDisputeSubmitResponseDecoder, options)

  /**
   * <p>Updates the specified Issuing <code>Settlement</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param settlement Wire parameter `settlement`.
   * @param options Execution options.
   */
  public suspend fun postIssuingSettlementsSettlementWithResponse(
    request: InlineV1IssuingSettlementsPostRequestFormX9aded6c0? = null,
    settlement: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostIssuingSettlementsSettlementResponse> = executor.executeWithResponse<InlineV1IssuingSettlementsPostRequestFormX9aded6c0?, PostIssuingSettlementsSettlementResponse>(SdkExecutionRequest(postIssuingSettlementsSettlementMetadata, baseUri, request, listOf(IssuingCodecs.POSTISSUINGSETTLEMENTSSETTLEMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "settlement", values = listOf(settlement.toString())))
  }), IssuingCodecs.postIssuingSettlementsSettlementRequestCodecRegistry, PostIssuingSettlementsSettlementResponseDecoder, options)

  /**
   * <p>Attempts to update the specified Issuing <code>Token</code> object to the status specified.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param token Wire parameter `token`.
   * @param options Execution options.
   */
  public suspend fun postIssuingTokensTokenWithResponse(
    request: InlineV1IssuingTokensPostRequestFormXcd376e94,
    token: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostIssuingTokensTokenResponse> = executor.executeWithResponse<InlineV1IssuingTokensPostRequestFormXcd376e94, PostIssuingTokensTokenResponse>(SdkExecutionRequest(postIssuingTokensTokenMetadata, baseUri, request, listOf(IssuingCodecs.POSTISSUINGTOKENSTOKEN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "token", values = listOf(token.toString())))
  }), IssuingCodecs.postIssuingTokensTokenRequestCodecRegistry, PostIssuingTokensTokenResponseDecoder, options)

  /**
   * <p>Updates the specified Issuing <code>Transaction</code> object by setting the values of the parameters passed.
   * Any parameters not provided will be left unchanged.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param transaction Wire parameter `transaction`.
   * @param options Execution options.
   */
  public suspend fun postIssuingTransactionsTransactionWithResponse(
    request: InlineV1IssuingTransactionsPostRequestFormX560cbf35? = null,
    transaction: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostIssuingTransactionsTransactionResponse> = executor.executeWithResponse<InlineV1IssuingTransactionsPostRequestFormX560cbf35?, PostIssuingTransactionsTransactionResponse>(SdkExecutionRequest(postIssuingTransactionsTransactionMetadata, baseUri, request, listOf(IssuingCodecs.POSTISSUINGTRANSACTIONSTRANSACTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transaction", values = listOf(transaction.toString())))
  }), IssuingCodecs.postIssuingTransactionsTransactionRequestCodecRegistry, PostIssuingTransactionsTransactionResponseDecoder, options)

  /**
   * Typed response alternatives for `GetIssuingAuthorizations`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetIssuingAuthorizationsResponse {
    public class SuccessJson(
      public val json: InlineV1IssuingAuthorizationsGetResponse200JsonXdc7af0f5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingAuthorizationsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingAuthorizationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingAuthorizationsResponse
  }

  private object GetIssuingAuthorizationsResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingAuthorizationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingAuthorizationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingAuthorizationsResponse> = when {
      alternative.id == "GetIssuingAuthorizations.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingAuthorizationsResponse.SuccessJson(
          json = IssuingCodecs.getIssuingAuthorizationsResponseCodecAlternative0Registry.select(listOf("GetIssuingAuthorizations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingAuthorizations.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingAuthorizationsResponse.DefaultJson(
          json = IssuingCodecs.getIssuingAuthorizationsResponseCodecAlternative1Registry.select(listOf("GetIssuingAuthorizations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingAuthorizationsResponse = GetIssuingAuthorizationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingAuthorizationsAuthorization`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetIssuingAuthorizationsAuthorizationResponse {
    public class SuccessJson(
      public val json: IssuingAuthorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingAuthorizationsAuthorizationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingAuthorizationsAuthorizationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingAuthorizationsAuthorizationResponse
  }

  private object GetIssuingAuthorizationsAuthorizationResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingAuthorizationsAuthorizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingAuthorizationsAuthorizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingAuthorizationsAuthorizationResponse> = when {
      alternative.id == "GetIssuingAuthorizationsAuthorization.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingAuthorizationsAuthorizationResponse.SuccessJson(
          json = IssuingCodecs.getIssuingAuthorizationsAuthorizationResponseCodecAlternative0Registry.select(listOf("GetIssuingAuthorizationsAuthorization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingAuthorizationsAuthorization.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingAuthorizationsAuthorizationResponse.DefaultJson(
          json = IssuingCodecs.getIssuingAuthorizationsAuthorizationResponseCodecAlternative1Registry.select(listOf("GetIssuingAuthorizationsAuthorization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingAuthorizationsAuthorizationResponse = GetIssuingAuthorizationsAuthorizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingCardholders`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetIssuingCardholdersResponse {
    public class SuccessJson(
      public val json: InlineV1IssuingCardholdersGetResponse200JsonXd91625ec,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardholdersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardholdersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardholdersResponse
  }

  private object GetIssuingCardholdersResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingCardholdersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingCardholdersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingCardholdersResponse> = when {
      alternative.id == "GetIssuingCardholders.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingCardholdersResponse.SuccessJson(
          json = IssuingCodecs.getIssuingCardholdersResponseCodecAlternative0Registry.select(listOf("GetIssuingCardholders.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingCardholders.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingCardholdersResponse.DefaultJson(
          json = IssuingCodecs.getIssuingCardholdersResponseCodecAlternative1Registry.select(listOf("GetIssuingCardholders.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingCardholdersResponse = GetIssuingCardholdersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingCardholdersCardholder`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetIssuingCardholdersCardholderResponse {
    public class SuccessJson(
      public val json: IssuingCardholder,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardholdersCardholderResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardholdersCardholderResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardholdersCardholderResponse
  }

  private object GetIssuingCardholdersCardholderResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingCardholdersCardholderResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingCardholdersCardholderResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingCardholdersCardholderResponse> = when {
      alternative.id == "GetIssuingCardholdersCardholder.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingCardholdersCardholderResponse.SuccessJson(
          json = IssuingCodecs.getIssuingCardholdersCardholderResponseCodecAlternative0Registry.select(listOf("GetIssuingCardholdersCardholder.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingCardholdersCardholder.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingCardholdersCardholderResponse.DefaultJson(
          json = IssuingCodecs.getIssuingCardholdersCardholderResponseCodecAlternative1Registry.select(listOf("GetIssuingCardholdersCardholder.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingCardholdersCardholderResponse = GetIssuingCardholdersCardholderResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingCards`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetIssuingCardsResponse {
    public class SuccessJson(
      public val json: InlineV1IssuingCardsGetResponse200JsonXae2c2830,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardsResponse
  }

  private object GetIssuingCardsResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingCardsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingCardsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingCardsResponse> = when {
      alternative.id == "GetIssuingCards.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingCardsResponse.SuccessJson(
          json = IssuingCodecs.getIssuingCardsResponseCodecAlternative0Registry.select(listOf("GetIssuingCards.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingCards.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingCardsResponse.DefaultJson(
          json = IssuingCodecs.getIssuingCardsResponseCodecAlternative1Registry.select(listOf("GetIssuingCards.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingCardsResponse = GetIssuingCardsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingCardsCard`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetIssuingCardsCardResponse {
    public class SuccessJson(
      public val json: IssuingCard,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardsCardResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardsCardResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingCardsCardResponse
  }

  private object GetIssuingCardsCardResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingCardsCardResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingCardsCardResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingCardsCardResponse> = when {
      alternative.id == "GetIssuingCardsCard.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingCardsCardResponse.SuccessJson(
          json = IssuingCodecs.getIssuingCardsCardResponseCodecAlternative0Registry.select(listOf("GetIssuingCardsCard.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingCardsCard.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingCardsCardResponse.DefaultJson(
          json = IssuingCodecs.getIssuingCardsCardResponseCodecAlternative1Registry.select(listOf("GetIssuingCardsCard.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingCardsCardResponse = GetIssuingCardsCardResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingDisputes`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetIssuingDisputesResponse {
    public class SuccessJson(
      public val json: InlineV1IssuingDisputesGetResponse200JsonX0e75ecaa,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingDisputesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingDisputesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingDisputesResponse
  }

  private object GetIssuingDisputesResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingDisputesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingDisputesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingDisputesResponse> = when {
      alternative.id == "GetIssuingDisputes.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingDisputesResponse.SuccessJson(
          json = IssuingCodecs.getIssuingDisputesResponseCodecAlternative0Registry.select(listOf("GetIssuingDisputes.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingDisputes.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingDisputesResponse.DefaultJson(
          json = IssuingCodecs.getIssuingDisputesResponseCodecAlternative1Registry.select(listOf("GetIssuingDisputes.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingDisputesResponse = GetIssuingDisputesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingDisputesDispute`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetIssuingDisputesDisputeResponse {
    public class SuccessJson(
      public val json: IssuingDispute,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingDisputesDisputeResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingDisputesDisputeResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingDisputesDisputeResponse
  }

  private object GetIssuingDisputesDisputeResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingDisputesDisputeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingDisputesDisputeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingDisputesDisputeResponse> = when {
      alternative.id == "GetIssuingDisputesDispute.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingDisputesDisputeResponse.SuccessJson(
          json = IssuingCodecs.getIssuingDisputesDisputeResponseCodecAlternative0Registry.select(listOf("GetIssuingDisputesDispute.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingDisputesDispute.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingDisputesDisputeResponse.DefaultJson(
          json = IssuingCodecs.getIssuingDisputesDisputeResponseCodecAlternative1Registry.select(listOf("GetIssuingDisputesDispute.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingDisputesDisputeResponse = GetIssuingDisputesDisputeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingPersonalizationDesigns`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetIssuingPersonalizationDesignsResponse {
    public class SuccessJson(
      public val json: InlineV1IssuingPersonalizationDesignsGetResponse200JsonX5613f0a8,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPersonalizationDesignsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPersonalizationDesignsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPersonalizationDesignsResponse
  }

  private object GetIssuingPersonalizationDesignsResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingPersonalizationDesignsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingPersonalizationDesignsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingPersonalizationDesignsResponse> = when {
      alternative.id == "GetIssuingPersonalizationDesigns.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingPersonalizationDesignsResponse.SuccessJson(
          json = IssuingCodecs.getIssuingPersonalizationDesignsResponseCodecAlternative0Registry.select(listOf("GetIssuingPersonalizationDesigns.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingPersonalizationDesigns.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingPersonalizationDesignsResponse.DefaultJson(
          json = IssuingCodecs.getIssuingPersonalizationDesignsResponseCodecAlternative1Registry.select(listOf("GetIssuingPersonalizationDesigns.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingPersonalizationDesignsResponse = GetIssuingPersonalizationDesignsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingPersonalizationDesignsPersonalizationDesign`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface GetIssuingPersonalizationDesignsPersonalizationDesignResponse {
    public class SuccessJson(
      public val json: IssuingPersonalizationDesign,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPersonalizationDesignsPersonalizationDesignResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPersonalizationDesignsPersonalizationDesignResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPersonalizationDesignsPersonalizationDesignResponse
  }

  private object GetIssuingPersonalizationDesignsPersonalizationDesignResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingPersonalizationDesignsPersonalizationDesignResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingPersonalizationDesignsPersonalizationDesignResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingPersonalizationDesignsPersonalizationDesignResponse> = when {
      alternative.id == "GetIssuingPersonalizationDesignsPersonalizationDesign.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingPersonalizationDesignsPersonalizationDesignResponse.SuccessJson(
          json = IssuingCodecs.getIssuingPersonalizationDesignsPersonalizationDesignResponseCodecAlternative0Registry.select(listOf("GetIssuingPersonalizationDesignsPersonalizationDesign.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingPersonalizationDesignsPersonalizationDesign.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingPersonalizationDesignsPersonalizationDesignResponse.DefaultJson(
          json = IssuingCodecs.getIssuingPersonalizationDesignsPersonalizationDesignResponseCodecAlternative1Registry.select(listOf("GetIssuingPersonalizationDesignsPersonalizationDesign.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingPersonalizationDesignsPersonalizationDesignResponse = GetIssuingPersonalizationDesignsPersonalizationDesignResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingPhysicalBundles`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetIssuingPhysicalBundlesResponse {
    public class SuccessJson(
      public val json: InlineV1IssuingPhysicalBundlesGetResponse200JsonX264eca15,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPhysicalBundlesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPhysicalBundlesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPhysicalBundlesResponse
  }

  private object GetIssuingPhysicalBundlesResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingPhysicalBundlesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingPhysicalBundlesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingPhysicalBundlesResponse> = when {
      alternative.id == "GetIssuingPhysicalBundles.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingPhysicalBundlesResponse.SuccessJson(
          json = IssuingCodecs.getIssuingPhysicalBundlesResponseCodecAlternative0Registry.select(listOf("GetIssuingPhysicalBundles.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingPhysicalBundles.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingPhysicalBundlesResponse.DefaultJson(
          json = IssuingCodecs.getIssuingPhysicalBundlesResponseCodecAlternative1Registry.select(listOf("GetIssuingPhysicalBundles.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingPhysicalBundlesResponse = GetIssuingPhysicalBundlesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingPhysicalBundlesPhysicalBundle`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetIssuingPhysicalBundlesPhysicalBundleResponse {
    public class SuccessJson(
      public val json: IssuingPhysicalBundle,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPhysicalBundlesPhysicalBundleResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPhysicalBundlesPhysicalBundleResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingPhysicalBundlesPhysicalBundleResponse
  }

  private object GetIssuingPhysicalBundlesPhysicalBundleResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingPhysicalBundlesPhysicalBundleResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingPhysicalBundlesPhysicalBundleResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingPhysicalBundlesPhysicalBundleResponse> = when {
      alternative.id == "GetIssuingPhysicalBundlesPhysicalBundle.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingPhysicalBundlesPhysicalBundleResponse.SuccessJson(
          json = IssuingCodecs.getIssuingPhysicalBundlesPhysicalBundleResponseCodecAlternative0Registry.select(listOf("GetIssuingPhysicalBundlesPhysicalBundle.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingPhysicalBundlesPhysicalBundle.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingPhysicalBundlesPhysicalBundleResponse.DefaultJson(
          json = IssuingCodecs.getIssuingPhysicalBundlesPhysicalBundleResponseCodecAlternative1Registry.select(listOf("GetIssuingPhysicalBundlesPhysicalBundle.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingPhysicalBundlesPhysicalBundleResponse = GetIssuingPhysicalBundlesPhysicalBundleResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingSettlementsSettlement`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetIssuingSettlementsSettlementResponse {
    public class SuccessJson(
      public val json: IssuingSettlement,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingSettlementsSettlementResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingSettlementsSettlementResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingSettlementsSettlementResponse
  }

  private object GetIssuingSettlementsSettlementResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingSettlementsSettlementResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingSettlementsSettlementResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingSettlementsSettlementResponse> = when {
      alternative.id == "GetIssuingSettlementsSettlement.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingSettlementsSettlementResponse.SuccessJson(
          json = IssuingCodecs.getIssuingSettlementsSettlementResponseCodecAlternative0Registry.select(listOf("GetIssuingSettlementsSettlement.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingSettlementsSettlement.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingSettlementsSettlementResponse.DefaultJson(
          json = IssuingCodecs.getIssuingSettlementsSettlementResponseCodecAlternative1Registry.select(listOf("GetIssuingSettlementsSettlement.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingSettlementsSettlementResponse = GetIssuingSettlementsSettlementResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingTokens`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetIssuingTokensResponse {
    public class SuccessJson(
      public val json: InlineV1IssuingTokensGetResponse200JsonX690c260c,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTokensResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTokensResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTokensResponse
  }

  private object GetIssuingTokensResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingTokensResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingTokensResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingTokensResponse> = when {
      alternative.id == "GetIssuingTokens.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingTokensResponse.SuccessJson(
          json = IssuingCodecs.getIssuingTokensResponseCodecAlternative0Registry.select(listOf("GetIssuingTokens.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingTokens.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingTokensResponse.DefaultJson(
          json = IssuingCodecs.getIssuingTokensResponseCodecAlternative1Registry.select(listOf("GetIssuingTokens.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingTokensResponse = GetIssuingTokensResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingTokensToken`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetIssuingTokensTokenResponse {
    public class SuccessJson(
      public val json: IssuingToken,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTokensTokenResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTokensTokenResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTokensTokenResponse
  }

  private object GetIssuingTokensTokenResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingTokensTokenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingTokensTokenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingTokensTokenResponse> = when {
      alternative.id == "GetIssuingTokensToken.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingTokensTokenResponse.SuccessJson(
          json = IssuingCodecs.getIssuingTokensTokenResponseCodecAlternative0Registry.select(listOf("GetIssuingTokensToken.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingTokensToken.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingTokensTokenResponse.DefaultJson(
          json = IssuingCodecs.getIssuingTokensTokenResponseCodecAlternative1Registry.select(listOf("GetIssuingTokensToken.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingTokensTokenResponse = GetIssuingTokensTokenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingTransactions`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetIssuingTransactionsResponse {
    public class SuccessJson(
      public val json: InlineV1IssuingTransactionsGetResponse200JsonXfcf7b92a,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTransactionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTransactionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTransactionsResponse
  }

  private object GetIssuingTransactionsResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingTransactionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingTransactionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingTransactionsResponse> = when {
      alternative.id == "GetIssuingTransactions.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingTransactionsResponse.SuccessJson(
          json = IssuingCodecs.getIssuingTransactionsResponseCodecAlternative0Registry.select(listOf("GetIssuingTransactions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingTransactions.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingTransactionsResponse.DefaultJson(
          json = IssuingCodecs.getIssuingTransactionsResponseCodecAlternative1Registry.select(listOf("GetIssuingTransactions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingTransactionsResponse = GetIssuingTransactionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetIssuingTransactionsTransaction`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetIssuingTransactionsTransactionResponse {
    public class SuccessJson(
      public val json: IssuingTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTransactionsTransactionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTransactionsTransactionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetIssuingTransactionsTransactionResponse
  }

  private object GetIssuingTransactionsTransactionResponseDecoder : SdkResponseAlternativeDecoder<GetIssuingTransactionsTransactionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetIssuingTransactionsTransactionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetIssuingTransactionsTransactionResponse> = when {
      alternative.id == "GetIssuingTransactionsTransaction.response.alternative0" -> SdkResponseDecodeResult(
        value = GetIssuingTransactionsTransactionResponse.SuccessJson(
          json = IssuingCodecs.getIssuingTransactionsTransactionResponseCodecAlternative0Registry.select(listOf("GetIssuingTransactionsTransaction.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetIssuingTransactionsTransaction.response.alternative1" -> SdkResponseDecodeResult(
        value = GetIssuingTransactionsTransactionResponse.DefaultJson(
          json = IssuingCodecs.getIssuingTransactionsTransactionResponseCodecAlternative1Registry.select(listOf("GetIssuingTransactionsTransaction.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetIssuingTransactionsTransactionResponse = GetIssuingTransactionsTransactionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIssuingAuthorizationsAuthorization`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostIssuingAuthorizationsAuthorizationResponse {
    public class SuccessJson(
      public val json: IssuingAuthorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingAuthorizationsAuthorizationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingAuthorizationsAuthorizationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingAuthorizationsAuthorizationResponse
  }

  private object PostIssuingAuthorizationsAuthorizationResponseDecoder : SdkResponseAlternativeDecoder<PostIssuingAuthorizationsAuthorizationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIssuingAuthorizationsAuthorizationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIssuingAuthorizationsAuthorizationResponse> = when {
      alternative.id == "PostIssuingAuthorizationsAuthorization.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIssuingAuthorizationsAuthorizationResponse.SuccessJson(
          json = IssuingCodecs.postIssuingAuthorizationsAuthorizationResponseCodecAlternative0Registry.select(listOf("PostIssuingAuthorizationsAuthorization.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIssuingAuthorizationsAuthorization.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIssuingAuthorizationsAuthorizationResponse.DefaultJson(
          json = IssuingCodecs.postIssuingAuthorizationsAuthorizationResponseCodecAlternative1Registry.select(listOf("PostIssuingAuthorizationsAuthorization.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIssuingAuthorizationsAuthorizationResponse = PostIssuingAuthorizationsAuthorizationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIssuingAuthorizationsAuthorizationApprove`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostIssuingAuthorizationsAuthorizationApproveResponse {
    public class SuccessJson(
      public val json: IssuingAuthorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingAuthorizationsAuthorizationApproveResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingAuthorizationsAuthorizationApproveResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingAuthorizationsAuthorizationApproveResponse
  }

  private object PostIssuingAuthorizationsAuthorizationApproveResponseDecoder : SdkResponseAlternativeDecoder<PostIssuingAuthorizationsAuthorizationApproveResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIssuingAuthorizationsAuthorizationApproveResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIssuingAuthorizationsAuthorizationApproveResponse> = when {
      alternative.id == "PostIssuingAuthorizationsAuthorizationApprove.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIssuingAuthorizationsAuthorizationApproveResponse.SuccessJson(
          json = IssuingCodecs.postIssuingAuthorizationsAuthorizationApproveResponseCodecAlternative0Registry.select(listOf("PostIssuingAuthorizationsAuthorizationApprove.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIssuingAuthorizationsAuthorizationApprove.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIssuingAuthorizationsAuthorizationApproveResponse.DefaultJson(
          json = IssuingCodecs.postIssuingAuthorizationsAuthorizationApproveResponseCodecAlternative1Registry.select(listOf("PostIssuingAuthorizationsAuthorizationApprove.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIssuingAuthorizationsAuthorizationApproveResponse = PostIssuingAuthorizationsAuthorizationApproveResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIssuingAuthorizationsAuthorizationDecline`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostIssuingAuthorizationsAuthorizationDeclineResponse {
    public class SuccessJson(
      public val json: IssuingAuthorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingAuthorizationsAuthorizationDeclineResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingAuthorizationsAuthorizationDeclineResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingAuthorizationsAuthorizationDeclineResponse
  }

  private object PostIssuingAuthorizationsAuthorizationDeclineResponseDecoder : SdkResponseAlternativeDecoder<PostIssuingAuthorizationsAuthorizationDeclineResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIssuingAuthorizationsAuthorizationDeclineResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIssuingAuthorizationsAuthorizationDeclineResponse> = when {
      alternative.id == "PostIssuingAuthorizationsAuthorizationDecline.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIssuingAuthorizationsAuthorizationDeclineResponse.SuccessJson(
          json = IssuingCodecs.postIssuingAuthorizationsAuthorizationDeclineResponseCodecAlternative0Registry.select(listOf("PostIssuingAuthorizationsAuthorizationDecline.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIssuingAuthorizationsAuthorizationDecline.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIssuingAuthorizationsAuthorizationDeclineResponse.DefaultJson(
          json = IssuingCodecs.postIssuingAuthorizationsAuthorizationDeclineResponseCodecAlternative1Registry.select(listOf("PostIssuingAuthorizationsAuthorizationDecline.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIssuingAuthorizationsAuthorizationDeclineResponse = PostIssuingAuthorizationsAuthorizationDeclineResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIssuingCardsCard`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostIssuingCardsCardResponse {
    public class SuccessJson(
      public val json: IssuingCard,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingCardsCardResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingCardsCardResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingCardsCardResponse
  }

  private object PostIssuingCardsCardResponseDecoder : SdkResponseAlternativeDecoder<PostIssuingCardsCardResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIssuingCardsCardResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIssuingCardsCardResponse> = when {
      alternative.id == "PostIssuingCardsCard.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIssuingCardsCardResponse.SuccessJson(
          json = IssuingCodecs.postIssuingCardsCardResponseCodecAlternative0Registry.select(listOf("PostIssuingCardsCard.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIssuingCardsCard.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIssuingCardsCardResponse.DefaultJson(
          json = IssuingCodecs.postIssuingCardsCardResponseCodecAlternative1Registry.select(listOf("PostIssuingCardsCard.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIssuingCardsCardResponse = PostIssuingCardsCardResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIssuingDisputesDisputeSubmit`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostIssuingDisputesDisputeSubmitResponse {
    public class SuccessJson(
      public val json: IssuingDispute,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingDisputesDisputeSubmitResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingDisputesDisputeSubmitResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingDisputesDisputeSubmitResponse
  }

  private object PostIssuingDisputesDisputeSubmitResponseDecoder : SdkResponseAlternativeDecoder<PostIssuingDisputesDisputeSubmitResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIssuingDisputesDisputeSubmitResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIssuingDisputesDisputeSubmitResponse> = when {
      alternative.id == "PostIssuingDisputesDisputeSubmit.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIssuingDisputesDisputeSubmitResponse.SuccessJson(
          json = IssuingCodecs.postIssuingDisputesDisputeSubmitResponseCodecAlternative0Registry.select(listOf("PostIssuingDisputesDisputeSubmit.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIssuingDisputesDisputeSubmit.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIssuingDisputesDisputeSubmitResponse.DefaultJson(
          json = IssuingCodecs.postIssuingDisputesDisputeSubmitResponseCodecAlternative1Registry.select(listOf("PostIssuingDisputesDisputeSubmit.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIssuingDisputesDisputeSubmitResponse = PostIssuingDisputesDisputeSubmitResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIssuingSettlementsSettlement`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostIssuingSettlementsSettlementResponse {
    public class SuccessJson(
      public val json: IssuingSettlement,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingSettlementsSettlementResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingSettlementsSettlementResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingSettlementsSettlementResponse
  }

  private object PostIssuingSettlementsSettlementResponseDecoder : SdkResponseAlternativeDecoder<PostIssuingSettlementsSettlementResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIssuingSettlementsSettlementResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIssuingSettlementsSettlementResponse> = when {
      alternative.id == "PostIssuingSettlementsSettlement.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIssuingSettlementsSettlementResponse.SuccessJson(
          json = IssuingCodecs.postIssuingSettlementsSettlementResponseCodecAlternative0Registry.select(listOf("PostIssuingSettlementsSettlement.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIssuingSettlementsSettlement.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIssuingSettlementsSettlementResponse.DefaultJson(
          json = IssuingCodecs.postIssuingSettlementsSettlementResponseCodecAlternative1Registry.select(listOf("PostIssuingSettlementsSettlement.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIssuingSettlementsSettlementResponse = PostIssuingSettlementsSettlementResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIssuingTokensToken`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostIssuingTokensTokenResponse {
    public class SuccessJson(
      public val json: IssuingToken,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingTokensTokenResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingTokensTokenResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingTokensTokenResponse
  }

  private object PostIssuingTokensTokenResponseDecoder : SdkResponseAlternativeDecoder<PostIssuingTokensTokenResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIssuingTokensTokenResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIssuingTokensTokenResponse> = when {
      alternative.id == "PostIssuingTokensToken.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIssuingTokensTokenResponse.SuccessJson(
          json = IssuingCodecs.postIssuingTokensTokenResponseCodecAlternative0Registry.select(listOf("PostIssuingTokensToken.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIssuingTokensToken.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIssuingTokensTokenResponse.DefaultJson(
          json = IssuingCodecs.postIssuingTokensTokenResponseCodecAlternative1Registry.select(listOf("PostIssuingTokensToken.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIssuingTokensTokenResponse = PostIssuingTokensTokenResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostIssuingTransactionsTransaction`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostIssuingTransactionsTransactionResponse {
    public class SuccessJson(
      public val json: IssuingTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingTransactionsTransactionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingTransactionsTransactionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostIssuingTransactionsTransactionResponse
  }

  private object PostIssuingTransactionsTransactionResponseDecoder : SdkResponseAlternativeDecoder<PostIssuingTransactionsTransactionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostIssuingTransactionsTransactionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostIssuingTransactionsTransactionResponse> = when {
      alternative.id == "PostIssuingTransactionsTransaction.response.alternative0" -> SdkResponseDecodeResult(
        value = PostIssuingTransactionsTransactionResponse.SuccessJson(
          json = IssuingCodecs.postIssuingTransactionsTransactionResponseCodecAlternative0Registry.select(listOf("PostIssuingTransactionsTransaction.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostIssuingTransactionsTransaction.response.alternative1" -> SdkResponseDecodeResult(
        value = PostIssuingTransactionsTransactionResponse.DefaultJson(
          json = IssuingCodecs.postIssuingTransactionsTransactionResponseCodecAlternative1Registry.select(listOf("PostIssuingTransactionsTransaction.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostIssuingTransactionsTransactionResponse = PostIssuingTransactionsTransactionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getIssuingAuthorizationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingAuthorizations",
          method = "GET",
          path = "/v1/issuing/authorizations",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1IssuingAuthorizationsGetResponse200JsonXdc7af0f5",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingAuthorizations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingAuthorizations.response.alternative1",
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

    internal val getIssuingAuthorizationsAuthorizationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingAuthorizationsAuthorization",
          method = "GET",
          path = "/v1/issuing/authorizations/{authorization}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingAuthorization",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingAuthorizationsAuthorization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingAuthorizationsAuthorization.response.alternative1",
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

    internal val getIssuingCardholdersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingCardholders",
          method = "GET",
          path = "/v1/issuing/cardholders",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1IssuingCardholdersGetResponse200JsonXd91625ec",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingCardholders.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingCardholders.response.alternative1",
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

    internal val getIssuingCardholdersCardholderMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingCardholdersCardholder",
          method = "GET",
          path = "/v1/issuing/cardholders/{cardholder}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingCardholder",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingCardholdersCardholder.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingCardholdersCardholder.response.alternative1",
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

    internal val getIssuingCardsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingCards",
          method = "GET",
          path = "/v1/issuing/cards",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1IssuingCardsGetResponse200JsonXae2c2830",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingCards.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingCards.response.alternative1",
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

    internal val getIssuingCardsCardMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingCardsCard",
          method = "GET",
          path = "/v1/issuing/cards/{card}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingCard",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingCardsCard.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingCardsCard.response.alternative1",
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

    internal val getIssuingDisputesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingDisputes",
          method = "GET",
          path = "/v1/issuing/disputes",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1IssuingDisputesGetResponse200JsonX0e75ecaa",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingDisputes.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingDisputes.response.alternative1",
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

    internal val getIssuingDisputesDisputeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingDisputesDispute",
          method = "GET",
          path = "/v1/issuing/disputes/{dispute}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingDispute",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingDisputesDispute.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingDisputesDispute.response.alternative1",
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

    internal val getIssuingPersonalizationDesignsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingPersonalizationDesigns",
          method = "GET",
          path = "/v1/issuing/personalization_designs",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1IssuingPersonalizationDesignsGetResponse200JsonX5613f0a8",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingPersonalizationDesigns.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingPersonalizationDesigns.response.alternative1",
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

    internal val getIssuingPersonalizationDesignsPersonalizationDesignMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingPersonalizationDesignsPersonalizationDesign",
          method = "GET",
          path = "/v1/issuing/personalization_designs/{personalization_design}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingPersonalizationDesign",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingPersonalizationDesignsPersonalizationDesign.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingPersonalizationDesignsPersonalizationDesign.response.alternative1",
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

    internal val getIssuingPhysicalBundlesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingPhysicalBundles",
          method = "GET",
          path = "/v1/issuing/physical_bundles",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1IssuingPhysicalBundlesGetResponse200JsonX264eca15",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingPhysicalBundles.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingPhysicalBundles.response.alternative1",
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

    internal val getIssuingPhysicalBundlesPhysicalBundleMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingPhysicalBundlesPhysicalBundle",
          method = "GET",
          path = "/v1/issuing/physical_bundles/{physical_bundle}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingPhysicalBundle",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingPhysicalBundlesPhysicalBundle.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingPhysicalBundlesPhysicalBundle.response.alternative1",
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

    internal val getIssuingSettlementsSettlementMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingSettlementsSettlement",
          method = "GET",
          path = "/v1/issuing/settlements/{settlement}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingSettlement",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingSettlementsSettlement.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingSettlementsSettlement.response.alternative1",
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

    internal val getIssuingTokensMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingTokens",
          method = "GET",
          path = "/v1/issuing/tokens",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1IssuingTokensGetResponse200JsonX690c260c",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingTokens.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingTokens.response.alternative1",
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

    internal val getIssuingTokensTokenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingTokensToken",
          method = "GET",
          path = "/v1/issuing/tokens/{token}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingToken",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingTokensToken.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingTokensToken.response.alternative1",
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

    internal val getIssuingTransactionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingTransactions",
          method = "GET",
          path = "/v1/issuing/transactions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1IssuingTransactionsGetResponse200JsonXfcf7b92a",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingTransactions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingTransactions.response.alternative1",
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

    internal val getIssuingTransactionsTransactionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetIssuingTransactionsTransaction",
          method = "GET",
          path = "/v1/issuing/transactions/{transaction}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingTransactionsTransaction.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetIssuingTransactionsTransaction.response.alternative1",
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

    internal val postIssuingAuthorizationsAuthorizationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIssuingAuthorizationsAuthorization",
          method = "POST",
          path = "/v1/issuing/authorizations/{authorization}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingAuthorization",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingAuthorizationsAuthorization.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingAuthorizationsAuthorization.response.alternative1",
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

    internal val postIssuingAuthorizationsAuthorizationApproveMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIssuingAuthorizationsAuthorizationApprove",
          method = "POST",
          path = "/v1/issuing/authorizations/{authorization}/approve",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingAuthorization",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingAuthorizationsAuthorizationApprove.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingAuthorizationsAuthorizationApprove.response.alternative1",
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

    internal val postIssuingAuthorizationsAuthorizationDeclineMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIssuingAuthorizationsAuthorizationDecline",
          method = "POST",
          path = "/v1/issuing/authorizations/{authorization}/decline",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingAuthorization",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingAuthorizationsAuthorizationDecline.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingAuthorizationsAuthorizationDecline.response.alternative1",
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

    internal val postIssuingCardsCardMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIssuingCardsCard",
          method = "POST",
          path = "/v1/issuing/cards/{card}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingCard",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingCardsCard.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingCardsCard.response.alternative1",
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

    internal val postIssuingDisputesDisputeSubmitMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIssuingDisputesDisputeSubmit",
          method = "POST",
          path = "/v1/issuing/disputes/{dispute}/submit",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingDispute",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingDisputesDisputeSubmit.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingDisputesDisputeSubmit.response.alternative1",
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

    internal val postIssuingSettlementsSettlementMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIssuingSettlementsSettlement",
          method = "POST",
          path = "/v1/issuing/settlements/{settlement}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingSettlement",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingSettlementsSettlement.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingSettlementsSettlement.response.alternative1",
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

    internal val postIssuingTokensTokenMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIssuingTokensToken",
          method = "POST",
          path = "/v1/issuing/tokens/{token}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingToken",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingTokensToken.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingTokensToken.response.alternative1",
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

    internal val postIssuingTransactionsTransactionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostIssuingTransactionsTransaction",
          method = "POST",
          path = "/v1/issuing/transactions/{transaction}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "IssuingTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingTransactionsTransaction.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostIssuingTransactionsTransaction.response.alternative1",
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
