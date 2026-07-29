package com.nabobery.sdkgen.generated.stripe.testhelpers

import com.nabobery.sdkgen.generated.stripe.CustomerCashBalanceTransaction
import com.nabobery.sdkgen.generated.stripe.DeletedTestHelpersTestClock
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuing5c68PostRequestFormX09e6c7f0
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingAuthorizationsExpirePostRequestFormX5b791bc4
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingAuthorizationsReversePostRequestFormX74984127
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingCardsShippingDeliverPostRequestFormX06f85bdb
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingCardsShippingFailPostRequestFormXd5d72b89
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingCardsShippingSubmitPostRequestFormX66000cd1
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingPersonalizationDesignsActivatePostRequestFormX1bed6230
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingSettlementsCompletePostRequestFormXdb4c85f8
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuinge311PostRequestFormXcfa7bccb
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersRefundsExpirePostRequestFormX61f3ccc7
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTerminalReadersSucceedInputCollectionPostRequestFormXd7a037aa
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTerminalReadersTimeoutInputCollectionPostRequestFormX46db0f98
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTestClocksGetResponse200JsonX69bc70a1
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryInboundTransfersReturnPostRequestFormX9a417d70
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryInboundTransfersSucceedPostRequestFormXa4bdb9d0
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryOutboundPaymentsFailPostRequestFormXc4786d0e
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryOutboundPaymentsPostPostRequestFormX69073a6a
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryOutboundTransfersFailPostRequestFormXec775730
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryOutboundTransfersPostPostRequestFormX5c93bf15
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryOutboundTransfersPostRequestFormX171d8b92
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435
import com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormX53deac0e
import com.nabobery.sdkgen.generated.stripe.IssuingAuthorization
import com.nabobery.sdkgen.generated.stripe.IssuingCard
import com.nabobery.sdkgen.generated.stripe.IssuingPersonalizationDesign
import com.nabobery.sdkgen.generated.stripe.IssuingSettlement
import com.nabobery.sdkgen.generated.stripe.IssuingTransaction
import com.nabobery.sdkgen.generated.stripe.Refund
import com.nabobery.sdkgen.generated.stripe.SdkJson
import com.nabobery.sdkgen.generated.stripe.TerminalReader
import com.nabobery.sdkgen.generated.stripe.TestHelpersTestClock
import com.nabobery.sdkgen.generated.stripe.TreasuryInboundTransfer
import com.nabobery.sdkgen.generated.stripe.TreasuryOutboundPayment
import com.nabobery.sdkgen.generated.stripe.TreasuryOutboundTransfer
import com.nabobery.sdkgen.generated.stripe.TreasuryReceivedCredit
import com.nabobery.sdkgen.generated.stripe.TreasuryReceivedDebit
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
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject

public object TestHelpersCodecs {
  public const val DELETETESTHELPERSTESTCLOCKSTESTCLOCK_REQUEST_CODEC_ID: String =
      "DeleteTestHelpersTestClocksTestClock.request"

  private val deleteTestHelpersTestClocksTestClockRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteTestHelpersTestClocksTestClockFormCodec

  private val deleteTestHelpersTestClocksTestClockResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedTestHelpersTestClock> =
      KotlinxSerializationCodec("DeleteTestHelpersTestClocksTestClock.response.alternative0", DeletedTestHelpersTestClock.Serializer, SdkJson)

  public val deleteTestHelpersTestClocksTestClockResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedTestHelpersTestClock> =
      MediaTypeCodecRegistry.of(deleteTestHelpersTestClocksTestClockResponseCodecAlternative0Codec)

  private val deleteTestHelpersTestClocksTestClockResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteTestHelpersTestClocksTestClock.response.alternative1", Error.Serializer, SdkJson)

  public val deleteTestHelpersTestClocksTestClockResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteTestHelpersTestClocksTestClockResponseCodecAlternative1Codec)

  public val deleteTestHelpersTestClocksTestClockRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteTestHelpersTestClocksTestClockRequestCodec)

  public const val GETTESTHELPERSTESTCLOCKS_REQUEST_CODEC_ID: String =
      "GetTestHelpersTestClocks.request"

  private val getTestHelpersTestClocksRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTestHelpersTestClocksFormCodec

  private val getTestHelpersTestClocksResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TestHelpersTestClocksGetResponse200JsonX69bc70a1> =
      KotlinxSerializationCodec("GetTestHelpersTestClocks.response.alternative0", InlineV1TestHelpersTestClocksGetResponse200JsonX69bc70a1.Serializer, SdkJson)

  public val getTestHelpersTestClocksResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTestClocksGetResponse200JsonX69bc70a1> =
      MediaTypeCodecRegistry.of(getTestHelpersTestClocksResponseCodecAlternative0Codec)

  private val getTestHelpersTestClocksResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTestHelpersTestClocks.response.alternative1", Error.Serializer, SdkJson)

  public val getTestHelpersTestClocksResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTestHelpersTestClocksResponseCodecAlternative1Codec)

  public val getTestHelpersTestClocksRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTestHelpersTestClocksRequestCodec)

  public const val GETTESTHELPERSTESTCLOCKSTESTCLOCK_REQUEST_CODEC_ID: String =
      "GetTestHelpersTestClocksTestClock.request"

  private val getTestHelpersTestClocksTestClockRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTestHelpersTestClocksTestClockFormCodec

  private val getTestHelpersTestClocksTestClockResponseCodecAlternative0Codec:
      MediaTypeCodec<TestHelpersTestClock> =
      KotlinxSerializationCodec("GetTestHelpersTestClocksTestClock.response.alternative0", TestHelpersTestClock.Serializer, SdkJson)

  public val getTestHelpersTestClocksTestClockResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TestHelpersTestClock> =
      MediaTypeCodecRegistry.of(getTestHelpersTestClocksTestClockResponseCodecAlternative0Codec)

  private val getTestHelpersTestClocksTestClockResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetTestHelpersTestClocksTestClock.response.alternative1", Error.Serializer, SdkJson)

  public val getTestHelpersTestClocksTestClockResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTestHelpersTestClocksTestClockResponseCodecAlternative1Codec)

  public val getTestHelpersTestClocksTestClockRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTestHelpersTestClocksTestClockRequestCodec)

  public const val POSTTESTHELPERSCUSTOMERSCUSTOMERFUNDCASHBALANCE_REQUEST_CODEC_ID: String =
      "PostTestHelpersCustomersCustomerFundCashBalance.request"

  private val postTestHelpersCustomersCustomerFundCashBalanceRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8> =
      PostTestHelpersCustomersCustomerFundCashBalanceFormCodec

  private val postTestHelpersCustomersCustomerFundCashBalanceResponseCodecAlternative0Codec:
      MediaTypeCodec<CustomerCashBalanceTransaction> =
      KotlinxSerializationCodec("PostTestHelpersCustomersCustomerFundCashBalance.response.alternative0", CustomerCashBalanceTransaction.Serializer, SdkJson)

  public val postTestHelpersCustomersCustomerFundCashBalanceResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CustomerCashBalanceTransaction> =
      MediaTypeCodecRegistry.of(postTestHelpersCustomersCustomerFundCashBalanceResponseCodecAlternative0Codec)

  private val postTestHelpersCustomersCustomerFundCashBalanceResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersCustomersCustomerFundCashBalance.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersCustomersCustomerFundCashBalanceResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersCustomersCustomerFundCashBalanceResponseCodecAlternative1Codec)

  public val postTestHelpersCustomersCustomerFundCashBalanceRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8> =
      MediaTypeCodecRegistry.of(postTestHelpersCustomersCustomerFundCashBalanceRequestCodec)

  public const val POSTTESTHELPERSISSUINGAUTHORIZATIONS_REQUEST_CODEC_ID: String =
      "PostTestHelpersIssuingAuthorizations.request"

  private val postTestHelpersIssuingAuthorizationsRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481> =
      PostTestHelpersIssuingAuthorizationsFormCodec

  private val postTestHelpersIssuingAuthorizationsResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingAuthorization> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizations.response.alternative0", IssuingAuthorization.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingAuthorization> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingAuthorizationsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizations.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingAuthorizationsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsRequestCodec)

  public const val POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONCAPTURE_REQUEST_CODEC_ID: String
      = "PostTestHelpersIssuingAuthorizationsAuthorizationCapture.request"

  private val postTestHelpersIssuingAuthorizationsAuthorizationCaptureRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663?> =
      PostTestHelpersIssuingAuthorizationsAuthorizationCaptureFormCodec

  private val postTestHelpersIssuingAuthorizationsAuthorizationCaptureResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingAuthorization> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationCapture.response.alternative0", IssuingAuthorization.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationCaptureResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingAuthorization> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationCaptureResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingAuthorizationsAuthorizationCaptureResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationCapture.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationCaptureResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationCaptureResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingAuthorizationsAuthorizationCaptureRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663?>
      =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationCaptureRequestCodec)

  public const val POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONEXPIRE_REQUEST_CODEC_ID: String
      = "PostTestHelpersIssuingAuthorizationsAuthorizationExpire.request"

  private val postTestHelpersIssuingAuthorizationsAuthorizationExpireRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsExpirePostRequestFormX5b791bc4?> =
      PostTestHelpersIssuingAuthorizationsAuthorizationExpireFormCodec

  private val postTestHelpersIssuingAuthorizationsAuthorizationExpireResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingAuthorization> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationExpire.response.alternative0", IssuingAuthorization.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationExpireResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingAuthorization> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationExpireResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingAuthorizationsAuthorizationExpireResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationExpire.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationExpireResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationExpireResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingAuthorizationsAuthorizationExpireRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingAuthorizationsExpirePostRequestFormX5b791bc4?>
      =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationExpireRequestCodec)

  public const val POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONFINALIZEAMOUNT_REQUEST_CODEC_ID:
      String = "PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount.request"

  private val postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04>
      = PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountFormCodec

  private val postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingAuthorization> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount.response.alternative0", IssuingAuthorization.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingAuthorization> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04>
      =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountRequestCodec)

  public const val POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONFRAUDCHALLENGESRESPOND_REQUEST_CODEC_ID:
      String = "PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond.request"

  private val postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuinge311PostRequestFormXcfa7bccb> =
      PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondFormCodec

  private val postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingAuthorization> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond.response.alternative0", IssuingAuthorization.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingAuthorization> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuinge311PostRequestFormXcfa7bccb> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondRequestCodec)

  public const val POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONINCREMENT_REQUEST_CODEC_ID:
      String = "PostTestHelpersIssuingAuthorizationsAuthorizationIncrement.request"

  private val postTestHelpersIssuingAuthorizationsAuthorizationIncrementRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113> =
      PostTestHelpersIssuingAuthorizationsAuthorizationIncrementFormCodec

  private val postTestHelpersIssuingAuthorizationsAuthorizationIncrementResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingAuthorization> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationIncrement.response.alternative0", IssuingAuthorization.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationIncrementResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingAuthorization> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationIncrementResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingAuthorizationsAuthorizationIncrementResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationIncrement.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationIncrementResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationIncrementResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingAuthorizationsAuthorizationIncrementRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113>
      =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationIncrementRequestCodec)

  public const val POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONREVERSE_REQUEST_CODEC_ID: String
      = "PostTestHelpersIssuingAuthorizationsAuthorizationReverse.request"

  private val postTestHelpersIssuingAuthorizationsAuthorizationReverseRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsReversePostRequestFormX74984127?> =
      PostTestHelpersIssuingAuthorizationsAuthorizationReverseFormCodec

  private val postTestHelpersIssuingAuthorizationsAuthorizationReverseResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingAuthorization> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationReverse.response.alternative0", IssuingAuthorization.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationReverseResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingAuthorization> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationReverseResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingAuthorizationsAuthorizationReverseResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingAuthorizationsAuthorizationReverse.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingAuthorizationsAuthorizationReverseResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationReverseResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingAuthorizationsAuthorizationReverseRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingAuthorizationsReversePostRequestFormX74984127?>
      =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingAuthorizationsAuthorizationReverseRequestCodec)

  public const val POSTTESTHELPERSISSUINGCARDSCARDSHIPPINGDELIVER_REQUEST_CODEC_ID: String =
      "PostTestHelpersIssuingCardsCardShippingDeliver.request"

  private val postTestHelpersIssuingCardsCardShippingDeliverRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingCardsShippingDeliverPostRequestFormX06f85bdb?> =
      PostTestHelpersIssuingCardsCardShippingDeliverFormCodec

  private val postTestHelpersIssuingCardsCardShippingDeliverResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingCard> =
      KotlinxSerializationCodec("PostTestHelpersIssuingCardsCardShippingDeliver.response.alternative0", IssuingCard.Serializer, SdkJson)

  public val postTestHelpersIssuingCardsCardShippingDeliverResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingCard> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingDeliverResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingCardsCardShippingDeliverResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingCardsCardShippingDeliver.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingCardsCardShippingDeliverResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingDeliverResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingCardsCardShippingDeliverRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingCardsShippingDeliverPostRequestFormX06f85bdb?>
      = MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingDeliverRequestCodec)

  public const val POSTTESTHELPERSISSUINGCARDSCARDSHIPPINGFAIL_REQUEST_CODEC_ID: String =
      "PostTestHelpersIssuingCardsCardShippingFail.request"

  private val postTestHelpersIssuingCardsCardShippingFailRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingCardsShippingFailPostRequestFormXd5d72b89?> =
      PostTestHelpersIssuingCardsCardShippingFailFormCodec

  private val postTestHelpersIssuingCardsCardShippingFailResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingCard> =
      KotlinxSerializationCodec("PostTestHelpersIssuingCardsCardShippingFail.response.alternative0", IssuingCard.Serializer, SdkJson)

  public val postTestHelpersIssuingCardsCardShippingFailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingCard> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingFailResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingCardsCardShippingFailResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingCardsCardShippingFail.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingCardsCardShippingFailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingFailResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingCardsCardShippingFailRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingCardsShippingFailPostRequestFormXd5d72b89?> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingFailRequestCodec)

  public const val POSTTESTHELPERSISSUINGCARDSCARDSHIPPINGRETURN_REQUEST_CODEC_ID: String =
      "PostTestHelpersIssuingCardsCardShippingReturn.request"

  private val postTestHelpersIssuingCardsCardShippingReturnRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f?> =
      PostTestHelpersIssuingCardsCardShippingReturnFormCodec

  private val postTestHelpersIssuingCardsCardShippingReturnResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingCard> =
      KotlinxSerializationCodec("PostTestHelpersIssuingCardsCardShippingReturn.response.alternative0", IssuingCard.Serializer, SdkJson)

  public val postTestHelpersIssuingCardsCardShippingReturnResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingCard> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingReturnResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingCardsCardShippingReturnResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingCardsCardShippingReturn.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingCardsCardShippingReturnResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingReturnResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingCardsCardShippingReturnRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f?>
      = MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingReturnRequestCodec)

  public const val POSTTESTHELPERSISSUINGCARDSCARDSHIPPINGSHIP_REQUEST_CODEC_ID: String =
      "PostTestHelpersIssuingCardsCardShippingShip.request"

  private val postTestHelpersIssuingCardsCardShippingShipRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c?> =
      PostTestHelpersIssuingCardsCardShippingShipFormCodec

  private val postTestHelpersIssuingCardsCardShippingShipResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingCard> =
      KotlinxSerializationCodec("PostTestHelpersIssuingCardsCardShippingShip.response.alternative0", IssuingCard.Serializer, SdkJson)

  public val postTestHelpersIssuingCardsCardShippingShipResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingCard> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingShipResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingCardsCardShippingShipResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingCardsCardShippingShip.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingCardsCardShippingShipResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingShipResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingCardsCardShippingShipRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c?> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingShipRequestCodec)

  public const val POSTTESTHELPERSISSUINGCARDSCARDSHIPPINGSUBMIT_REQUEST_CODEC_ID: String =
      "PostTestHelpersIssuingCardsCardShippingSubmit.request"

  private val postTestHelpersIssuingCardsCardShippingSubmitRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingCardsShippingSubmitPostRequestFormX66000cd1?> =
      PostTestHelpersIssuingCardsCardShippingSubmitFormCodec

  private val postTestHelpersIssuingCardsCardShippingSubmitResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingCard> =
      KotlinxSerializationCodec("PostTestHelpersIssuingCardsCardShippingSubmit.response.alternative0", IssuingCard.Serializer, SdkJson)

  public val postTestHelpersIssuingCardsCardShippingSubmitResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingCard> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingSubmitResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingCardsCardShippingSubmitResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingCardsCardShippingSubmit.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingCardsCardShippingSubmitResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingSubmitResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingCardsCardShippingSubmitRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingCardsShippingSubmitPostRequestFormX66000cd1?>
      = MediaTypeCodecRegistry.of(postTestHelpersIssuingCardsCardShippingSubmitRequestCodec)

  public const val POSTTESTHELPERSISSUINGPERSONALIZATIONDESIGNSPERSONALIZATIONDESIGNACTIVATE_REQUEST_CODEC_ID:
      String = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate.request"

  private val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingPersonalizationDesignsActivatePostRequestFormX1bed6230?>
      = PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateFormCodec

  private val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingPersonalizationDesign> =
      KotlinxSerializationCodec("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate.response.alternative0", IssuingPersonalizationDesign.Serializer, SdkJson)

  public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingPersonalizationDesign> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingPersonalizationDesignsActivatePostRequestFormX1bed6230?>
      =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateRequestCodec)

  public const val POSTTESTHELPERSISSUINGPERSONALIZATIONDESIGNSPERSONALIZATIONDESIGNDEACTIVATE_REQUEST_CODEC_ID:
      String = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate.request"

  private val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuing5c68PostRequestFormX09e6c7f0?> =
      PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateFormCodec

  private val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingPersonalizationDesign> =
      KotlinxSerializationCodec("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate.response.alternative0", IssuingPersonalizationDesign.Serializer, SdkJson)

  public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingPersonalizationDesign> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuing5c68PostRequestFormX09e6c7f0?> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateRequestCodec)

  public const val POSTTESTHELPERSISSUINGPERSONALIZATIONDESIGNSPERSONALIZATIONDESIGNREJECT_REQUEST_CODEC_ID:
      String = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject.request"

  private val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6>
      = PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectFormCodec

  private val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingPersonalizationDesign> =
      KotlinxSerializationCodec("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject.response.alternative0", IssuingPersonalizationDesign.Serializer, SdkJson)

  public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingPersonalizationDesign> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6>
      =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectRequestCodec)

  public const val POSTTESTHELPERSISSUINGSETTLEMENTS_REQUEST_CODEC_ID: String =
      "PostTestHelpersIssuingSettlements.request"

  private val postTestHelpersIssuingSettlementsRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236> =
      PostTestHelpersIssuingSettlementsFormCodec

  private val postTestHelpersIssuingSettlementsResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingSettlement> =
      KotlinxSerializationCodec("PostTestHelpersIssuingSettlements.response.alternative0", IssuingSettlement.Serializer, SdkJson)

  public val postTestHelpersIssuingSettlementsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingSettlement> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingSettlementsResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingSettlementsResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostTestHelpersIssuingSettlements.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingSettlementsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingSettlementsResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingSettlementsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingSettlementsRequestCodec)

  public const val POSTTESTHELPERSISSUINGSETTLEMENTSSETTLEMENTCOMPLETE_REQUEST_CODEC_ID: String =
      "PostTestHelpersIssuingSettlementsSettlementComplete.request"

  private val postTestHelpersIssuingSettlementsSettlementCompleteRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingSettlementsCompletePostRequestFormXdb4c85f8?> =
      PostTestHelpersIssuingSettlementsSettlementCompleteFormCodec

  private val postTestHelpersIssuingSettlementsSettlementCompleteResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingSettlement> =
      KotlinxSerializationCodec("PostTestHelpersIssuingSettlementsSettlementComplete.response.alternative0", IssuingSettlement.Serializer, SdkJson)

  public val postTestHelpersIssuingSettlementsSettlementCompleteResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingSettlement> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingSettlementsSettlementCompleteResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingSettlementsSettlementCompleteResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingSettlementsSettlementComplete.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingSettlementsSettlementCompleteResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingSettlementsSettlementCompleteResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingSettlementsSettlementCompleteRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingSettlementsCompletePostRequestFormXdb4c85f8?>
      = MediaTypeCodecRegistry.of(postTestHelpersIssuingSettlementsSettlementCompleteRequestCodec)

  public const val POSTTESTHELPERSISSUINGTRANSACTIONSCREATEFORCECAPTURE_REQUEST_CODEC_ID: String =
      "PostTestHelpersIssuingTransactionsCreateForceCapture.request"

  private val postTestHelpersIssuingTransactionsCreateForceCaptureRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4>
      = PostTestHelpersIssuingTransactionsCreateForceCaptureFormCodec

  private val postTestHelpersIssuingTransactionsCreateForceCaptureResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingTransaction> =
      KotlinxSerializationCodec("PostTestHelpersIssuingTransactionsCreateForceCapture.response.alternative0", IssuingTransaction.Serializer, SdkJson)

  public val postTestHelpersIssuingTransactionsCreateForceCaptureResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingTransaction> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingTransactionsCreateForceCaptureResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingTransactionsCreateForceCaptureResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingTransactionsCreateForceCapture.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingTransactionsCreateForceCaptureResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingTransactionsCreateForceCaptureResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingTransactionsCreateForceCaptureRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4>
      = MediaTypeCodecRegistry.of(postTestHelpersIssuingTransactionsCreateForceCaptureRequestCodec)

  public const val POSTTESTHELPERSISSUINGTRANSACTIONSCREATEUNLINKEDREFUND_REQUEST_CODEC_ID: String =
      "PostTestHelpersIssuingTransactionsCreateUnlinkedRefund.request"

  private val postTestHelpersIssuingTransactionsCreateUnlinkedRefundRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93> =
      PostTestHelpersIssuingTransactionsCreateUnlinkedRefundFormCodec

  private val postTestHelpersIssuingTransactionsCreateUnlinkedRefundResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingTransaction> =
      KotlinxSerializationCodec("PostTestHelpersIssuingTransactionsCreateUnlinkedRefund.response.alternative0", IssuingTransaction.Serializer, SdkJson)

  public val postTestHelpersIssuingTransactionsCreateUnlinkedRefundResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingTransaction> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingTransactionsCreateUnlinkedRefundResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingTransactionsCreateUnlinkedRefundResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingTransactionsCreateUnlinkedRefund.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingTransactionsCreateUnlinkedRefundResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingTransactionsCreateUnlinkedRefundResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingTransactionsCreateUnlinkedRefundRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingTransactionsCreateUnlinkedRefundRequestCodec)

  public const val POSTTESTHELPERSISSUINGTRANSACTIONSTRANSACTIONREFUND_REQUEST_CODEC_ID: String =
      "PostTestHelpersIssuingTransactionsTransactionRefund.request"

  private val postTestHelpersIssuingTransactionsTransactionRefundRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a?> =
      PostTestHelpersIssuingTransactionsTransactionRefundFormCodec

  private val postTestHelpersIssuingTransactionsTransactionRefundResponseCodecAlternative0Codec:
      MediaTypeCodec<IssuingTransaction> =
      KotlinxSerializationCodec("PostTestHelpersIssuingTransactionsTransactionRefund.response.alternative0", IssuingTransaction.Serializer, SdkJson)

  public val postTestHelpersIssuingTransactionsTransactionRefundResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<IssuingTransaction> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingTransactionsTransactionRefundResponseCodecAlternative0Codec)

  private val postTestHelpersIssuingTransactionsTransactionRefundResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersIssuingTransactionsTransactionRefund.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersIssuingTransactionsTransactionRefundResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersIssuingTransactionsTransactionRefundResponseCodecAlternative1Codec)

  public val postTestHelpersIssuingTransactionsTransactionRefundRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a?>
      = MediaTypeCodecRegistry.of(postTestHelpersIssuingTransactionsTransactionRefundRequestCodec)

  public const val POSTTESTHELPERSREFUNDSREFUNDEXPIRE_REQUEST_CODEC_ID: String =
      "PostTestHelpersRefundsRefundExpire.request"

  private val postTestHelpersRefundsRefundExpireRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersRefundsExpirePostRequestFormX61f3ccc7?> =
      PostTestHelpersRefundsRefundExpireFormCodec

  private val postTestHelpersRefundsRefundExpireResponseCodecAlternative0Codec:
      MediaTypeCodec<Refund> =
      KotlinxSerializationCodec("PostTestHelpersRefundsRefundExpire.response.alternative0", Refund.Serializer, SdkJson)

  public val postTestHelpersRefundsRefundExpireResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Refund> =
      MediaTypeCodecRegistry.of(postTestHelpersRefundsRefundExpireResponseCodecAlternative0Codec)

  private val postTestHelpersRefundsRefundExpireResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersRefundsRefundExpire.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersRefundsRefundExpireResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersRefundsRefundExpireResponseCodecAlternative1Codec)

  public val postTestHelpersRefundsRefundExpireRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersRefundsExpirePostRequestFormX61f3ccc7?> =
      MediaTypeCodecRegistry.of(postTestHelpersRefundsRefundExpireRequestCodec)

  public const val POSTTESTHELPERSTERMINALREADERSREADERPRESENTPAYMENTMETHOD_REQUEST_CODEC_ID: String
      = "PostTestHelpersTerminalReadersReaderPresentPaymentMethod.request"

  private val postTestHelpersTerminalReadersReaderPresentPaymentMethodRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa?>
      = PostTestHelpersTerminalReadersReaderPresentPaymentMethodFormCodec

  private val postTestHelpersTerminalReadersReaderPresentPaymentMethodResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTestHelpersTerminalReadersReaderPresentPaymentMethod.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTestHelpersTerminalReadersReaderPresentPaymentMethodResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTestHelpersTerminalReadersReaderPresentPaymentMethodResponseCodecAlternative0Codec)

  private val postTestHelpersTerminalReadersReaderPresentPaymentMethodResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTerminalReadersReaderPresentPaymentMethod.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTerminalReadersReaderPresentPaymentMethodResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTerminalReadersReaderPresentPaymentMethodResponseCodecAlternative1Codec)

  public val postTestHelpersTerminalReadersReaderPresentPaymentMethodRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa?>
      =
      MediaTypeCodecRegistry.of(postTestHelpersTerminalReadersReaderPresentPaymentMethodRequestCodec)

  public const val POSTTESTHELPERSTERMINALREADERSREADERSUCCEEDINPUTCOLLECTION_REQUEST_CODEC_ID:
      String = "PostTestHelpersTerminalReadersReaderSucceedInputCollection.request"

  private val postTestHelpersTerminalReadersReaderSucceedInputCollectionRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTerminalReadersSucceedInputCollectionPostRequestFormXd7a037aa?>
      = PostTestHelpersTerminalReadersReaderSucceedInputCollectionFormCodec

  private val postTestHelpersTerminalReadersReaderSucceedInputCollectionResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTestHelpersTerminalReadersReaderSucceedInputCollection.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTestHelpersTerminalReadersReaderSucceedInputCollectionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTestHelpersTerminalReadersReaderSucceedInputCollectionResponseCodecAlternative0Codec)

  private val postTestHelpersTerminalReadersReaderSucceedInputCollectionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTerminalReadersReaderSucceedInputCollection.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTerminalReadersReaderSucceedInputCollectionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTerminalReadersReaderSucceedInputCollectionResponseCodecAlternative1Codec)

  public val postTestHelpersTerminalReadersReaderSucceedInputCollectionRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTerminalReadersSucceedInputCollectionPostRequestFormXd7a037aa?>
      =
      MediaTypeCodecRegistry.of(postTestHelpersTerminalReadersReaderSucceedInputCollectionRequestCodec)

  public const val POSTTESTHELPERSTERMINALREADERSREADERTIMEOUTINPUTCOLLECTION_REQUEST_CODEC_ID:
      String = "PostTestHelpersTerminalReadersReaderTimeoutInputCollection.request"

  private val postTestHelpersTerminalReadersReaderTimeoutInputCollectionRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTerminalReadersTimeoutInputCollectionPostRequestFormX46db0f98?>
      = PostTestHelpersTerminalReadersReaderTimeoutInputCollectionFormCodec

  private val postTestHelpersTerminalReadersReaderTimeoutInputCollectionResponseCodecAlternative0Codec:
      MediaTypeCodec<TerminalReader> =
      KotlinxSerializationCodec("PostTestHelpersTerminalReadersReaderTimeoutInputCollection.response.alternative0", TerminalReader.Serializer, SdkJson)

  public val postTestHelpersTerminalReadersReaderTimeoutInputCollectionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TerminalReader> =
      MediaTypeCodecRegistry.of(postTestHelpersTerminalReadersReaderTimeoutInputCollectionResponseCodecAlternative0Codec)

  private val postTestHelpersTerminalReadersReaderTimeoutInputCollectionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTerminalReadersReaderTimeoutInputCollection.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTerminalReadersReaderTimeoutInputCollectionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTerminalReadersReaderTimeoutInputCollectionResponseCodecAlternative1Codec)

  public val postTestHelpersTerminalReadersReaderTimeoutInputCollectionRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTerminalReadersTimeoutInputCollectionPostRequestFormX46db0f98?>
      =
      MediaTypeCodecRegistry.of(postTestHelpersTerminalReadersReaderTimeoutInputCollectionRequestCodec)

  public const val POSTTESTHELPERSTESTCLOCKS_REQUEST_CODEC_ID: String =
      "PostTestHelpersTestClocks.request"

  private val postTestHelpersTestClocksRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f> =
      PostTestHelpersTestClocksFormCodec

  private val postTestHelpersTestClocksResponseCodecAlternative0Codec:
      MediaTypeCodec<TestHelpersTestClock> =
      KotlinxSerializationCodec("PostTestHelpersTestClocks.response.alternative0", TestHelpersTestClock.Serializer, SdkJson)

  public val postTestHelpersTestClocksResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TestHelpersTestClock> =
      MediaTypeCodecRegistry.of(postTestHelpersTestClocksResponseCodecAlternative0Codec)

  private val postTestHelpersTestClocksResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTestClocks.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTestClocksResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTestClocksResponseCodecAlternative1Codec)

  public val postTestHelpersTestClocksRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f> =
      MediaTypeCodecRegistry.of(postTestHelpersTestClocksRequestCodec)

  public const val POSTTESTHELPERSTESTCLOCKSTESTCLOCKADVANCE_REQUEST_CODEC_ID: String =
      "PostTestHelpersTestClocksTestClockAdvance.request"

  private val postTestHelpersTestClocksTestClockAdvanceRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4> =
      PostTestHelpersTestClocksTestClockAdvanceFormCodec

  private val postTestHelpersTestClocksTestClockAdvanceResponseCodecAlternative0Codec:
      MediaTypeCodec<TestHelpersTestClock> =
      KotlinxSerializationCodec("PostTestHelpersTestClocksTestClockAdvance.response.alternative0", TestHelpersTestClock.Serializer, SdkJson)

  public val postTestHelpersTestClocksTestClockAdvanceResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TestHelpersTestClock> =
      MediaTypeCodecRegistry.of(postTestHelpersTestClocksTestClockAdvanceResponseCodecAlternative0Codec)

  private val postTestHelpersTestClocksTestClockAdvanceResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTestClocksTestClockAdvance.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTestClocksTestClockAdvanceResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTestClocksTestClockAdvanceResponseCodecAlternative1Codec)

  public val postTestHelpersTestClocksTestClockAdvanceRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4> =
      MediaTypeCodecRegistry.of(postTestHelpersTestClocksTestClockAdvanceRequestCodec)

  public const val POSTTESTHELPERSTREASURYINBOUNDTRANSFERSIDFAIL_REQUEST_CODEC_ID: String =
      "PostTestHelpersTreasuryInboundTransfersIdFail.request"

  private val postTestHelpersTreasuryInboundTransfersIdFailRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb?> =
      PostTestHelpersTreasuryInboundTransfersIdFailFormCodec

  private val postTestHelpersTreasuryInboundTransfersIdFailResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryInboundTransfer> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryInboundTransfersIdFail.response.alternative0", TreasuryInboundTransfer.Serializer, SdkJson)

  public val postTestHelpersTreasuryInboundTransfersIdFailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryInboundTransfer> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryInboundTransfersIdFailResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryInboundTransfersIdFailResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryInboundTransfersIdFail.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryInboundTransfersIdFailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryInboundTransfersIdFailResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryInboundTransfersIdFailRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb?>
      = MediaTypeCodecRegistry.of(postTestHelpersTreasuryInboundTransfersIdFailRequestCodec)

  public const val POSTTESTHELPERSTREASURYINBOUNDTRANSFERSIDRETURN_REQUEST_CODEC_ID: String =
      "PostTestHelpersTreasuryInboundTransfersIdReturn.request"

  private val postTestHelpersTreasuryInboundTransfersIdReturnRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryInboundTransfersReturnPostRequestFormX9a417d70?> =
      PostTestHelpersTreasuryInboundTransfersIdReturnFormCodec

  private val postTestHelpersTreasuryInboundTransfersIdReturnResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryInboundTransfer> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryInboundTransfersIdReturn.response.alternative0", TreasuryInboundTransfer.Serializer, SdkJson)

  public val postTestHelpersTreasuryInboundTransfersIdReturnResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryInboundTransfer> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryInboundTransfersIdReturnResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryInboundTransfersIdReturnResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryInboundTransfersIdReturn.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryInboundTransfersIdReturnResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryInboundTransfersIdReturnResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryInboundTransfersIdReturnRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryInboundTransfersReturnPostRequestFormX9a417d70?>
      = MediaTypeCodecRegistry.of(postTestHelpersTreasuryInboundTransfersIdReturnRequestCodec)

  public const val POSTTESTHELPERSTREASURYINBOUNDTRANSFERSIDSUCCEED_REQUEST_CODEC_ID: String =
      "PostTestHelpersTreasuryInboundTransfersIdSucceed.request"

  private val postTestHelpersTreasuryInboundTransfersIdSucceedRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryInboundTransfersSucceedPostRequestFormXa4bdb9d0?> =
      PostTestHelpersTreasuryInboundTransfersIdSucceedFormCodec

  private val postTestHelpersTreasuryInboundTransfersIdSucceedResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryInboundTransfer> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryInboundTransfersIdSucceed.response.alternative0", TreasuryInboundTransfer.Serializer, SdkJson)

  public val postTestHelpersTreasuryInboundTransfersIdSucceedResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryInboundTransfer> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryInboundTransfersIdSucceedResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryInboundTransfersIdSucceedResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryInboundTransfersIdSucceed.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryInboundTransfersIdSucceedResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryInboundTransfersIdSucceedResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryInboundTransfersIdSucceedRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryInboundTransfersSucceedPostRequestFormXa4bdb9d0?>
      = MediaTypeCodecRegistry.of(postTestHelpersTreasuryInboundTransfersIdSucceedRequestCodec)

  public const val POSTTESTHELPERSTREASURYOUTBOUNDPAYMENTSID_REQUEST_CODEC_ID: String =
      "PostTestHelpersTreasuryOutboundPaymentsId.request"

  private val postTestHelpersTreasuryOutboundPaymentsIdRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913> =
      PostTestHelpersTreasuryOutboundPaymentsIdFormCodec

  private val postTestHelpersTreasuryOutboundPaymentsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundPayment> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundPaymentsId.response.alternative0", TreasuryOutboundPayment.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundPaymentsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundPayment> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryOutboundPaymentsIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundPaymentsId.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundPaymentsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryOutboundPaymentsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdRequestCodec)

  public const val POSTTESTHELPERSTREASURYOUTBOUNDPAYMENTSIDFAIL_REQUEST_CODEC_ID: String =
      "PostTestHelpersTreasuryOutboundPaymentsIdFail.request"

  private val postTestHelpersTreasuryOutboundPaymentsIdFailRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundPaymentsFailPostRequestFormXc4786d0e?> =
      PostTestHelpersTreasuryOutboundPaymentsIdFailFormCodec

  private val postTestHelpersTreasuryOutboundPaymentsIdFailResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundPayment> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundPaymentsIdFail.response.alternative0", TreasuryOutboundPayment.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundPaymentsIdFailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundPayment> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdFailResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryOutboundPaymentsIdFailResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundPaymentsIdFail.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundPaymentsIdFailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdFailResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryOutboundPaymentsIdFailRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryOutboundPaymentsFailPostRequestFormXc4786d0e?>
      = MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdFailRequestCodec)

  public const val POSTTESTHELPERSTREASURYOUTBOUNDPAYMENTSIDPOST_REQUEST_CODEC_ID: String =
      "PostTestHelpersTreasuryOutboundPaymentsIdPost.request"

  private val postTestHelpersTreasuryOutboundPaymentsIdPostRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundPaymentsPostPostRequestFormX69073a6a?> =
      PostTestHelpersTreasuryOutboundPaymentsIdPostFormCodec

  private val postTestHelpersTreasuryOutboundPaymentsIdPostResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundPayment> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundPaymentsIdPost.response.alternative0", TreasuryOutboundPayment.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundPaymentsIdPostResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundPayment> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdPostResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryOutboundPaymentsIdPostResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundPaymentsIdPost.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundPaymentsIdPostResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdPostResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryOutboundPaymentsIdPostRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryOutboundPaymentsPostPostRequestFormX69073a6a?>
      = MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdPostRequestCodec)

  public const val POSTTESTHELPERSTREASURYOUTBOUNDPAYMENTSIDRETURN_REQUEST_CODEC_ID: String =
      "PostTestHelpersTreasuryOutboundPaymentsIdReturn.request"

  private val postTestHelpersTreasuryOutboundPaymentsIdReturnRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d?> =
      PostTestHelpersTreasuryOutboundPaymentsIdReturnFormCodec

  private val postTestHelpersTreasuryOutboundPaymentsIdReturnResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundPayment> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundPaymentsIdReturn.response.alternative0", TreasuryOutboundPayment.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundPaymentsIdReturnResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundPayment> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdReturnResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryOutboundPaymentsIdReturnResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundPaymentsIdReturn.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundPaymentsIdReturnResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdReturnResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryOutboundPaymentsIdReturnRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d?>
      = MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundPaymentsIdReturnRequestCodec)

  public const val POSTTESTHELPERSTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFER_REQUEST_CODEC_ID: String
      = "PostTestHelpersTreasuryOutboundTransfersOutboundTransfer.request"

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundTransfersPostRequestFormX171d8b92> =
      PostTestHelpersTreasuryOutboundTransfersOutboundTransferFormCodec

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundTransfer> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundTransfersOutboundTransfer.response.alternative0", TreasuryOutboundTransfer.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundTransfer> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundTransfersOutboundTransfer.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryOutboundTransfersPostRequestFormX171d8b92> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferRequestCodec)

  public const val POSTTESTHELPERSTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFERFAIL_REQUEST_CODEC_ID:
      String = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail.request"

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferFailRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundTransfersFailPostRequestFormXec775730?> =
      PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailFormCodec

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundTransfer> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail.response.alternative0", TreasuryOutboundTransfer.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundTransfer> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferFailRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryOutboundTransfersFailPostRequestFormXec775730?>
      =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferFailRequestCodec)

  public const val POSTTESTHELPERSTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFERPOST_REQUEST_CODEC_ID:
      String = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost.request"

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferPostRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundTransfersPostPostRequestFormX5c93bf15?> =
      PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostFormCodec

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundTransfer> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost.response.alternative0", TreasuryOutboundTransfer.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundTransfer> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferPostRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryOutboundTransfersPostPostRequestFormX5c93bf15?>
      =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferPostRequestCodec)

  public const val POSTTESTHELPERSTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFERRETURN_REQUEST_CODEC_ID:
      String = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn.request"

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e?> =
      PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnFormCodec

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryOutboundTransfer> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn.response.alternative0", TreasuryOutboundTransfer.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryOutboundTransfer> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e?>
      =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnRequestCodec)

  public const val POSTTESTHELPERSTREASURYRECEIVEDCREDITS_REQUEST_CODEC_ID: String =
      "PostTestHelpersTreasuryReceivedCredits.request"

  private val postTestHelpersTreasuryReceivedCreditsRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435> =
      PostTestHelpersTreasuryReceivedCreditsFormCodec

  private val postTestHelpersTreasuryReceivedCreditsResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryReceivedCredit> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryReceivedCredits.response.alternative0", TreasuryReceivedCredit.Serializer, SdkJson)

  public val postTestHelpersTreasuryReceivedCreditsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryReceivedCredit> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryReceivedCreditsResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryReceivedCreditsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryReceivedCredits.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryReceivedCreditsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryReceivedCreditsResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryReceivedCreditsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryReceivedCreditsRequestCodec)

  public const val POSTTESTHELPERSTREASURYRECEIVEDDEBITS_REQUEST_CODEC_ID: String =
      "PostTestHelpersTreasuryReceivedDebits.request"

  private val postTestHelpersTreasuryReceivedDebitsRequestCodec:
      MediaTypeCodec<InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormX53deac0e> =
      PostTestHelpersTreasuryReceivedDebitsFormCodec

  private val postTestHelpersTreasuryReceivedDebitsResponseCodecAlternative0Codec:
      MediaTypeCodec<TreasuryReceivedDebit> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryReceivedDebits.response.alternative0", TreasuryReceivedDebit.Serializer, SdkJson)

  public val postTestHelpersTreasuryReceivedDebitsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TreasuryReceivedDebit> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryReceivedDebitsResponseCodecAlternative0Codec)

  private val postTestHelpersTreasuryReceivedDebitsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTestHelpersTreasuryReceivedDebits.response.alternative1", Error.Serializer, SdkJson)

  public val postTestHelpersTreasuryReceivedDebitsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryReceivedDebitsResponseCodecAlternative1Codec)

  public val postTestHelpersTreasuryReceivedDebitsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormX53deac0e> =
      MediaTypeCodecRegistry.of(postTestHelpersTreasuryReceivedDebitsRequestCodec)

  public object DeleteTestHelpersTestClocksTestClockFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteTestHelpersTestClocksTestClock.request"

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

  public object GetTestHelpersTestClocksFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTestHelpersTestClocks.request"

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

  public object GetTestHelpersTestClocksTestClockFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTestHelpersTestClocksTestClock.request"

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

  public object PostTestHelpersCustomersCustomerFundCashBalanceFormCodec : MediaTypeCodec<InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8> {
    override val id: String = "PostTestHelpersCustomersCustomerFundCashBalance.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("amount", request.amount.toString())
      form.add("currency", request.currency)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.reference?.let { formValue0 ->
        form.add("reference", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingAuthorizationsFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481> {
    override val id: String = "PostTestHelpersIssuingAuthorizations.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amount?.let { formValue0 ->
        form.add("amount", formValue0.toString())
      }
      request.amountDetails?.let { formValue0 ->
        formValue0.atmFee?.let { formValue2 ->
          form.add("amount_details" + "[atm_fee]", formValue2.toString())
        }
        formValue0.cashbackAmount?.let { formValue2 ->
          form.add("amount_details" + "[cashback_amount]", formValue2.toString())
        }
      }
      request.authorizationMethod?.let { formValue0 ->
        form.add("authorization_method", formValue0.value)
      }
      form.add("card", request.card)
      request.currency?.let { formValue0 ->
        form.add("currency", formValue0)
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
      request.fleet?.let { formValue0 ->
        formValue0.cardholderPromptData?.let { formValue2 ->
          formValue2.driverId?.let { formValue4 ->
            form.add("fleet" + "[cardholder_prompt_data]" + "[driver_id]", formValue4)
          }
          formValue2.odometer?.let { formValue4 ->
            form.add("fleet" + "[cardholder_prompt_data]" + "[odometer]", formValue4.toString())
          }
          formValue2.unspecifiedId?.let { formValue4 ->
            form.add("fleet" + "[cardholder_prompt_data]" + "[unspecified_id]", formValue4)
          }
          formValue2.userId?.let { formValue4 ->
            form.add("fleet" + "[cardholder_prompt_data]" + "[user_id]", formValue4)
          }
          formValue2.vehicleNumber?.let { formValue4 ->
            form.add("fleet" + "[cardholder_prompt_data]" + "[vehicle_number]", formValue4)
          }
        }
        formValue0.purchaseType?.let { formValue2 ->
          form.add("fleet" + "[purchase_type]", formValue2.value)
        }
        formValue0.reportedBreakdown?.let { formValue2 ->
          formValue2.fuel?.let { formValue4 ->
            formValue4.grossAmountDecimal?.let { formValue6 ->
              form.add("fleet" + "[reported_breakdown]" + "[fuel]" + "[gross_amount_decimal]", formValue6)
            }
          }
          formValue2.nonFuel?.let { formValue4 ->
            formValue4.grossAmountDecimal?.let { formValue6 ->
              form.add("fleet" + "[reported_breakdown]" + "[non_fuel]" + "[gross_amount_decimal]", formValue6)
            }
          }
          formValue2.tax?.let { formValue4 ->
            formValue4.localAmountDecimal?.let { formValue6 ->
              form.add("fleet" + "[reported_breakdown]" + "[tax]" + "[local_amount_decimal]", formValue6)
            }
            formValue4.nationalAmountDecimal?.let { formValue6 ->
              form.add("fleet" + "[reported_breakdown]" + "[tax]" + "[national_amount_decimal]", formValue6)
            }
          }
        }
        formValue0.serviceType?.let { formValue2 ->
          form.add("fleet" + "[service_type]", formValue2.value)
        }
      }
      request.fraudDisputabilityLikelihood?.let { formValue0 ->
        form.add("fraud_disputability_likelihood", formValue0.value)
      }
      request.fuel?.let { formValue0 ->
        formValue0.industryProductCode?.let { formValue2 ->
          form.add("fuel" + "[industry_product_code]", formValue2)
        }
        formValue0.quantityDecimal?.let { formValue2 ->
          form.add("fuel" + "[quantity_decimal]", formValue2)
        }
        formValue0.type?.let { formValue2 ->
          form.add("fuel" + "[type]", formValue2.value)
        }
        formValue0.unit?.let { formValue2 ->
          form.add("fuel" + "[unit]", formValue2.value)
        }
        formValue0.unitCostDecimal?.let { formValue2 ->
          form.add("fuel" + "[unit_cost_decimal]", formValue2)
        }
      }
      request.isAmountControllable?.let { formValue0 ->
        form.add("is_amount_controllable", formValue0.toString())
      }
      request.merchantAmount?.let { formValue0 ->
        form.add("merchant_amount", formValue0.toString())
      }
      request.merchantCurrency?.let { formValue0 ->
        form.add("merchant_currency", formValue0)
      }
      request.merchantData?.let { formValue0 ->
        formValue0.category?.let { formValue2 ->
          form.add("merchant_data" + "[category]", formValue2.value)
        }
        formValue0.city?.let { formValue2 ->
          form.add("merchant_data" + "[city]", formValue2)
        }
        formValue0.country?.let { formValue2 ->
          form.add("merchant_data" + "[country]", formValue2)
        }
        formValue0.name?.let { formValue2 ->
          form.add("merchant_data" + "[name]", formValue2)
        }
        formValue0.networkId?.let { formValue2 ->
          form.add("merchant_data" + "[network_id]", formValue2)
        }
        formValue0.postalCode?.let { formValue2 ->
          form.add("merchant_data" + "[postal_code]", formValue2)
        }
        formValue0.state?.let { formValue2 ->
          form.add("merchant_data" + "[state]", formValue2)
        }
        formValue0.terminalId?.let { formValue2 ->
          form.add("merchant_data" + "[terminal_id]", formValue2)
        }
        formValue0.url?.let { formValue2 ->
          form.add("merchant_data" + "[url]", formValue2)
        }
      }
      request.networkData?.let { formValue0 ->
        formValue0.acquiringInstitutionId?.let { formValue2 ->
          form.add("network_data" + "[acquiring_institution_id]", formValue2)
        }
      }
      request.riskAssessment?.let { formValue0 ->
        formValue0.cardTestingRisk?.let { formValue2 ->
          formValue2.invalidAccountNumberDeclineRatePastHour?.let { formValue4 ->
            form.add("risk_assessment" + "[card_testing_risk]" + "[invalid_account_number_decline_rate_past_hour]", formValue4.toString())
          }
          formValue2.invalidCredentialsDeclineRatePastHour?.let { formValue4 ->
            form.add("risk_assessment" + "[card_testing_risk]" + "[invalid_credentials_decline_rate_past_hour]", formValue4.toString())
          }
          form.add("risk_assessment" + "[card_testing_risk]" + "[level]", formValue2.level.value)
        }
        formValue0.fraudRisk?.let { formValue2 ->
          form.add("risk_assessment" + "[fraud_risk]" + "[level]", formValue2.level.value)
          formValue2.score?.let { formValue4 ->
            form.add("risk_assessment" + "[fraud_risk]" + "[score]", formValue4)
          }
        }
        formValue0.merchantDisputeRisk?.let { formValue2 ->
          formValue2.disputeRate?.let { formValue4 ->
            form.add("risk_assessment" + "[merchant_dispute_risk]" + "[dispute_rate]", formValue4.toString())
          }
          form.add("risk_assessment" + "[merchant_dispute_risk]" + "[level]", formValue2.level.value)
        }
      }
      request.verificationData?.let { formValue0 ->
        formValue0.addressLine1Check?.let { formValue2 ->
          form.add("verification_data" + "[address_line1_check]", formValue2.value)
        }
        formValue0.addressPostalCodeCheck?.let { formValue2 ->
          form.add("verification_data" + "[address_postal_code_check]", formValue2.value)
        }
        formValue0.authenticationExemption?.let { formValue2 ->
          form.add("verification_data" + "[authentication_exemption]" + "[claimed_by]", formValue2.claimedBy.value)
          form.add("verification_data" + "[authentication_exemption]" + "[type]", formValue2.type.value)
        }
        formValue0.cvcCheck?.let { formValue2 ->
          form.add("verification_data" + "[cvc_check]", formValue2.value)
        }
        formValue0.expiryCheck?.let { formValue2 ->
          form.add("verification_data" + "[expiry_check]", formValue2.value)
        }
        formValue0.threeDSecure?.let { formValue2 ->
          form.add("verification_data" + "[three_d_secure]" + "[result]", formValue2.result.value)
        }
      }
      request.wallet?.let { formValue0 ->
        form.add("wallet", formValue0.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingAuthorizationsAuthorizationCaptureFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663?> {
    override val id: String = "PostTestHelpersIssuingAuthorizationsAuthorizationCapture.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.captureAmount?.let { formValue0 ->
        form.add("capture_amount", formValue0.toString())
      }
      request.closeAuthorization?.let { formValue0 ->
        form.add("close_authorization", formValue0.toString())
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
      request.purchaseDetails?.let { formValue0 ->
        formValue0.fleet?.let { formValue2 ->
          formValue2.cardholderPromptData?.let { formValue4 ->
            formValue4.driverId?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[driver_id]", formValue6)
            }
            formValue4.odometer?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[odometer]", formValue6.toString())
            }
            formValue4.unspecifiedId?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[unspecified_id]", formValue6)
            }
            formValue4.userId?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[user_id]", formValue6)
            }
            formValue4.vehicleNumber?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[vehicle_number]", formValue6)
            }
          }
          formValue2.purchaseType?.let { formValue4 ->
            form.add("purchase_details" + "[fleet]" + "[purchase_type]", formValue4.value)
          }
          formValue2.reportedBreakdown?.let { formValue4 ->
            formValue4.fuel?.let { formValue6 ->
              formValue6.grossAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[fuel]" + "[gross_amount_decimal]", formValue8)
              }
            }
            formValue4.nonFuel?.let { formValue6 ->
              formValue6.grossAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[non_fuel]" + "[gross_amount_decimal]", formValue8)
              }
            }
            formValue4.tax?.let { formValue6 ->
              formValue6.localAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[tax]" + "[local_amount_decimal]", formValue8)
              }
              formValue6.nationalAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[tax]" + "[national_amount_decimal]", formValue8)
              }
            }
          }
          formValue2.serviceType?.let { formValue4 ->
            form.add("purchase_details" + "[fleet]" + "[service_type]", formValue4.value)
          }
        }
        formValue0.flight?.let { formValue2 ->
          formValue2.departureAt?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[departure_at]", formValue4.toString())
          }
          formValue2.passengerName?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[passenger_name]", formValue4)
          }
          formValue2.refundable?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[refundable]", formValue4.toString())
          }
          formValue2.segments?.let { formValue4 ->
            if (formValue4.isEmpty()) {
              form.add("purchase_details" + "[flight]" + "[segments]", "")
            } else {
              formValue4.forEachIndexed { formIndex5, formElement5 ->
                formElement5.arrivalAirportCode?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[arrival_airport_code]", formValue7)
                }
                formElement5.carrier?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[carrier]", formValue7)
                }
                formElement5.departureAirportCode?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[departure_airport_code]", formValue7)
                }
                formElement5.flightNumber?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[flight_number]", formValue7)
                }
                formElement5.serviceClass?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[service_class]", formValue7)
                }
                formElement5.stopoverAllowed?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[stopover_allowed]", formValue7.toString())
                }
              }
            }
          }
          formValue2.travelAgency?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[travel_agency]", formValue4)
          }
        }
        formValue0.fuel?.let { formValue2 ->
          formValue2.industryProductCode?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[industry_product_code]", formValue4)
          }
          formValue2.quantityDecimal?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[quantity_decimal]", formValue4)
          }
          formValue2.type?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[type]", formValue4.value)
          }
          formValue2.unit?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[unit]", formValue4.value)
          }
          formValue2.unitCostDecimal?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[unit_cost_decimal]", formValue4)
          }
        }
        formValue0.lodging?.let { formValue2 ->
          formValue2.checkInAt?.let { formValue4 ->
            form.add("purchase_details" + "[lodging]" + "[check_in_at]", formValue4.toString())
          }
          formValue2.nights?.let { formValue4 ->
            form.add("purchase_details" + "[lodging]" + "[nights]", formValue4.toString())
          }
        }
        formValue0.receipt?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("purchase_details" + "[receipt]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              formElement3.description?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[description]", formValue5)
              }
              formElement3.quantity?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[quantity]", formValue5)
              }
              formElement3.total?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[total]", formValue5.toString())
              }
              formElement3.unitCost?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[unit_cost]", formValue5.toString())
              }
            }
          }
        }
        formValue0.reference?.let { formValue2 ->
          form.add("purchase_details" + "[reference]", formValue2)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingAuthorizationsAuthorizationExpireFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsExpirePostRequestFormX5b791bc4?> {
    override val id: String = "PostTestHelpersIssuingAuthorizationsAuthorizationExpire.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingAuthorizationsExpirePostRequestFormX5b791bc4?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingAuthorizationsExpirePostRequestFormX5b791bc4? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04> {
    override val id: String =
        "PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04, mediaType: String): SdkRequestBody {
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
      form.add("final_amount", request.finalAmount.toString())
      request.fleet?.let { formValue0 ->
        formValue0.cardholderPromptData?.let { formValue2 ->
          formValue2.driverId?.let { formValue4 ->
            form.add("fleet" + "[cardholder_prompt_data]" + "[driver_id]", formValue4)
          }
          formValue2.odometer?.let { formValue4 ->
            form.add("fleet" + "[cardholder_prompt_data]" + "[odometer]", formValue4.toString())
          }
          formValue2.unspecifiedId?.let { formValue4 ->
            form.add("fleet" + "[cardholder_prompt_data]" + "[unspecified_id]", formValue4)
          }
          formValue2.userId?.let { formValue4 ->
            form.add("fleet" + "[cardholder_prompt_data]" + "[user_id]", formValue4)
          }
          formValue2.vehicleNumber?.let { formValue4 ->
            form.add("fleet" + "[cardholder_prompt_data]" + "[vehicle_number]", formValue4)
          }
        }
        formValue0.purchaseType?.let { formValue2 ->
          form.add("fleet" + "[purchase_type]", formValue2.value)
        }
        formValue0.reportedBreakdown?.let { formValue2 ->
          formValue2.fuel?.let { formValue4 ->
            formValue4.grossAmountDecimal?.let { formValue6 ->
              form.add("fleet" + "[reported_breakdown]" + "[fuel]" + "[gross_amount_decimal]", formValue6)
            }
          }
          formValue2.nonFuel?.let { formValue4 ->
            formValue4.grossAmountDecimal?.let { formValue6 ->
              form.add("fleet" + "[reported_breakdown]" + "[non_fuel]" + "[gross_amount_decimal]", formValue6)
            }
          }
          formValue2.tax?.let { formValue4 ->
            formValue4.localAmountDecimal?.let { formValue6 ->
              form.add("fleet" + "[reported_breakdown]" + "[tax]" + "[local_amount_decimal]", formValue6)
            }
            formValue4.nationalAmountDecimal?.let { formValue6 ->
              form.add("fleet" + "[reported_breakdown]" + "[tax]" + "[national_amount_decimal]", formValue6)
            }
          }
        }
        formValue0.serviceType?.let { formValue2 ->
          form.add("fleet" + "[service_type]", formValue2.value)
        }
      }
      request.fuel?.let { formValue0 ->
        formValue0.industryProductCode?.let { formValue2 ->
          form.add("fuel" + "[industry_product_code]", formValue2)
        }
        formValue0.quantityDecimal?.let { formValue2 ->
          form.add("fuel" + "[quantity_decimal]", formValue2)
        }
        formValue0.type?.let { formValue2 ->
          form.add("fuel" + "[type]", formValue2.value)
        }
        formValue0.unit?.let { formValue2 ->
          form.add("fuel" + "[unit]", formValue2.value)
        }
        formValue0.unitCostDecimal?.let { formValue2 ->
          form.add("fuel" + "[unit_cost_decimal]", formValue2)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuinge311PostRequestFormXcfa7bccb> {
    override val id: String =
        "PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuinge311PostRequestFormXcfa7bccb, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("confirmed", request.confirmed.toString())
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuinge311PostRequestFormXcfa7bccb {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingAuthorizationsAuthorizationIncrementFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113> {
    override val id: String = "PostTestHelpersIssuingAuthorizationsAuthorizationIncrement.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113, mediaType: String): SdkRequestBody {
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
      form.add("increment_amount", request.incrementAmount.toString())
      request.isAmountControllable?.let { formValue0 ->
        form.add("is_amount_controllable", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingAuthorizationsAuthorizationReverseFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingAuthorizationsReversePostRequestFormX74984127?> {
    override val id: String = "PostTestHelpersIssuingAuthorizationsAuthorizationReverse.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingAuthorizationsReversePostRequestFormX74984127?, mediaType: String): SdkRequestBody {
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
      request.reverseAmount?.let { formValue0 ->
        form.add("reverse_amount", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingAuthorizationsReversePostRequestFormX74984127? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingCardsCardShippingDeliverFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingCardsShippingDeliverPostRequestFormX06f85bdb?> {
    override val id: String = "PostTestHelpersIssuingCardsCardShippingDeliver.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingCardsShippingDeliverPostRequestFormX06f85bdb?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingCardsShippingDeliverPostRequestFormX06f85bdb? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingCardsCardShippingFailFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingCardsShippingFailPostRequestFormXd5d72b89?> {
    override val id: String = "PostTestHelpersIssuingCardsCardShippingFail.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingCardsShippingFailPostRequestFormXd5d72b89?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingCardsShippingFailPostRequestFormXd5d72b89? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingCardsCardShippingReturnFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f?> {
    override val id: String = "PostTestHelpersIssuingCardsCardShippingReturn.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingCardsCardShippingShipFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c?> {
    override val id: String = "PostTestHelpersIssuingCardsCardShippingShip.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingCardsCardShippingSubmitFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingCardsShippingSubmitPostRequestFormX66000cd1?> {
    override val id: String = "PostTestHelpersIssuingCardsCardShippingSubmit.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingCardsShippingSubmitPostRequestFormX66000cd1?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingCardsShippingSubmitPostRequestFormX66000cd1? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingPersonalizationDesignsActivatePostRequestFormX1bed6230?> {
    override val id: String =
        "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingPersonalizationDesignsActivatePostRequestFormX1bed6230?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingPersonalizationDesignsActivatePostRequestFormX1bed6230? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuing5c68PostRequestFormX09e6c7f0?> {
    override val id: String =
        "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuing5c68PostRequestFormX09e6c7f0?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuing5c68PostRequestFormX09e6c7f0? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6> {
    override val id: String =
        "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6, mediaType: String): SdkRequestBody {
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
      request.rejectionReasons.cardLogo?.let { formValue1 ->
        if (formValue1.isEmpty()) {
          form.add("rejection_reasons" + "[card_logo]", "")
        } else {
          formValue1.forEachIndexed { formIndex2, formElement2 ->
            form.add("rejection_reasons" + "[card_logo]" + "[" + formIndex2 + "]", formElement2.value)
          }
        }
      }
      request.rejectionReasons.carrierText?.let { formValue1 ->
        if (formValue1.isEmpty()) {
          form.add("rejection_reasons" + "[carrier_text]", "")
        } else {
          formValue1.forEachIndexed { formIndex2, formElement2 ->
            form.add("rejection_reasons" + "[carrier_text]" + "[" + formIndex2 + "]", formElement2.value)
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingSettlementsFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236> {
    override val id: String = "PostTestHelpersIssuingSettlements.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("bin", request.bin)
      form.add("clearing_date", request.clearingDate.toString())
      form.add("currency", request.currency)
      request.expand?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("expand", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("expand" + "[" + formIndex1 + "]", formElement1)
          }
        }
      }
      request.interchangeFeesAmount?.let { formValue0 ->
        form.add("interchange_fees_amount", formValue0.toString())
      }
      form.add("net_total_amount", request.netTotalAmount.toString())
      request.network?.let { formValue0 ->
        form.add("network", formValue0.value)
      }
      request.networkSettlementIdentifier?.let { formValue0 ->
        form.add("network_settlement_identifier", formValue0)
      }
      request.transactionAmount?.let { formValue0 ->
        form.add("transaction_amount", formValue0.toString())
      }
      request.transactionCount?.let { formValue0 ->
        form.add("transaction_count", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingSettlementsSettlementCompleteFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingSettlementsCompletePostRequestFormXdb4c85f8?> {
    override val id: String = "PostTestHelpersIssuingSettlementsSettlementComplete.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingSettlementsCompletePostRequestFormXdb4c85f8?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingSettlementsCompletePostRequestFormXdb4c85f8? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingTransactionsCreateForceCaptureFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4> {
    override val id: String = "PostTestHelpersIssuingTransactionsCreateForceCapture.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("amount", request.amount.toString())
      form.add("card", request.card)
      request.currency?.let { formValue0 ->
        form.add("currency", formValue0)
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
      request.merchantData?.let { formValue0 ->
        formValue0.category?.let { formValue2 ->
          form.add("merchant_data" + "[category]", formValue2.value)
        }
        formValue0.city?.let { formValue2 ->
          form.add("merchant_data" + "[city]", formValue2)
        }
        formValue0.country?.let { formValue2 ->
          form.add("merchant_data" + "[country]", formValue2)
        }
        formValue0.name?.let { formValue2 ->
          form.add("merchant_data" + "[name]", formValue2)
        }
        formValue0.networkId?.let { formValue2 ->
          form.add("merchant_data" + "[network_id]", formValue2)
        }
        formValue0.postalCode?.let { formValue2 ->
          form.add("merchant_data" + "[postal_code]", formValue2)
        }
        formValue0.state?.let { formValue2 ->
          form.add("merchant_data" + "[state]", formValue2)
        }
        formValue0.terminalId?.let { formValue2 ->
          form.add("merchant_data" + "[terminal_id]", formValue2)
        }
        formValue0.url?.let { formValue2 ->
          form.add("merchant_data" + "[url]", formValue2)
        }
      }
      request.purchaseDetails?.let { formValue0 ->
        formValue0.fleet?.let { formValue2 ->
          formValue2.cardholderPromptData?.let { formValue4 ->
            formValue4.driverId?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[driver_id]", formValue6)
            }
            formValue4.odometer?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[odometer]", formValue6.toString())
            }
            formValue4.unspecifiedId?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[unspecified_id]", formValue6)
            }
            formValue4.userId?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[user_id]", formValue6)
            }
            formValue4.vehicleNumber?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[vehicle_number]", formValue6)
            }
          }
          formValue2.purchaseType?.let { formValue4 ->
            form.add("purchase_details" + "[fleet]" + "[purchase_type]", formValue4.value)
          }
          formValue2.reportedBreakdown?.let { formValue4 ->
            formValue4.fuel?.let { formValue6 ->
              formValue6.grossAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[fuel]" + "[gross_amount_decimal]", formValue8)
              }
            }
            formValue4.nonFuel?.let { formValue6 ->
              formValue6.grossAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[non_fuel]" + "[gross_amount_decimal]", formValue8)
              }
            }
            formValue4.tax?.let { formValue6 ->
              formValue6.localAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[tax]" + "[local_amount_decimal]", formValue8)
              }
              formValue6.nationalAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[tax]" + "[national_amount_decimal]", formValue8)
              }
            }
          }
          formValue2.serviceType?.let { formValue4 ->
            form.add("purchase_details" + "[fleet]" + "[service_type]", formValue4.value)
          }
        }
        formValue0.flight?.let { formValue2 ->
          formValue2.departureAt?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[departure_at]", formValue4.toString())
          }
          formValue2.passengerName?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[passenger_name]", formValue4)
          }
          formValue2.refundable?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[refundable]", formValue4.toString())
          }
          formValue2.segments?.let { formValue4 ->
            if (formValue4.isEmpty()) {
              form.add("purchase_details" + "[flight]" + "[segments]", "")
            } else {
              formValue4.forEachIndexed { formIndex5, formElement5 ->
                formElement5.arrivalAirportCode?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[arrival_airport_code]", formValue7)
                }
                formElement5.carrier?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[carrier]", formValue7)
                }
                formElement5.departureAirportCode?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[departure_airport_code]", formValue7)
                }
                formElement5.flightNumber?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[flight_number]", formValue7)
                }
                formElement5.serviceClass?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[service_class]", formValue7)
                }
                formElement5.stopoverAllowed?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[stopover_allowed]", formValue7.toString())
                }
              }
            }
          }
          formValue2.travelAgency?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[travel_agency]", formValue4)
          }
        }
        formValue0.fuel?.let { formValue2 ->
          formValue2.industryProductCode?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[industry_product_code]", formValue4)
          }
          formValue2.quantityDecimal?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[quantity_decimal]", formValue4)
          }
          formValue2.type?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[type]", formValue4.value)
          }
          formValue2.unit?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[unit]", formValue4.value)
          }
          formValue2.unitCostDecimal?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[unit_cost_decimal]", formValue4)
          }
        }
        formValue0.lodging?.let { formValue2 ->
          formValue2.checkInAt?.let { formValue4 ->
            form.add("purchase_details" + "[lodging]" + "[check_in_at]", formValue4.toString())
          }
          formValue2.nights?.let { formValue4 ->
            form.add("purchase_details" + "[lodging]" + "[nights]", formValue4.toString())
          }
        }
        formValue0.receipt?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("purchase_details" + "[receipt]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              formElement3.description?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[description]", formValue5)
              }
              formElement3.quantity?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[quantity]", formValue5)
              }
              formElement3.total?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[total]", formValue5.toString())
              }
              formElement3.unitCost?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[unit_cost]", formValue5.toString())
              }
            }
          }
        }
        formValue0.reference?.let { formValue2 ->
          form.add("purchase_details" + "[reference]", formValue2)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingTransactionsCreateUnlinkedRefundFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93> {
    override val id: String = "PostTestHelpersIssuingTransactionsCreateUnlinkedRefund.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("amount", request.amount.toString())
      form.add("card", request.card)
      request.currency?.let { formValue0 ->
        form.add("currency", formValue0)
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
      request.merchantData?.let { formValue0 ->
        formValue0.category?.let { formValue2 ->
          form.add("merchant_data" + "[category]", formValue2.value)
        }
        formValue0.city?.let { formValue2 ->
          form.add("merchant_data" + "[city]", formValue2)
        }
        formValue0.country?.let { formValue2 ->
          form.add("merchant_data" + "[country]", formValue2)
        }
        formValue0.name?.let { formValue2 ->
          form.add("merchant_data" + "[name]", formValue2)
        }
        formValue0.networkId?.let { formValue2 ->
          form.add("merchant_data" + "[network_id]", formValue2)
        }
        formValue0.postalCode?.let { formValue2 ->
          form.add("merchant_data" + "[postal_code]", formValue2)
        }
        formValue0.state?.let { formValue2 ->
          form.add("merchant_data" + "[state]", formValue2)
        }
        formValue0.terminalId?.let { formValue2 ->
          form.add("merchant_data" + "[terminal_id]", formValue2)
        }
        formValue0.url?.let { formValue2 ->
          form.add("merchant_data" + "[url]", formValue2)
        }
      }
      request.purchaseDetails?.let { formValue0 ->
        formValue0.fleet?.let { formValue2 ->
          formValue2.cardholderPromptData?.let { formValue4 ->
            formValue4.driverId?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[driver_id]", formValue6)
            }
            formValue4.odometer?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[odometer]", formValue6.toString())
            }
            formValue4.unspecifiedId?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[unspecified_id]", formValue6)
            }
            formValue4.userId?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[user_id]", formValue6)
            }
            formValue4.vehicleNumber?.let { formValue6 ->
              form.add("purchase_details" + "[fleet]" + "[cardholder_prompt_data]" + "[vehicle_number]", formValue6)
            }
          }
          formValue2.purchaseType?.let { formValue4 ->
            form.add("purchase_details" + "[fleet]" + "[purchase_type]", formValue4.value)
          }
          formValue2.reportedBreakdown?.let { formValue4 ->
            formValue4.fuel?.let { formValue6 ->
              formValue6.grossAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[fuel]" + "[gross_amount_decimal]", formValue8)
              }
            }
            formValue4.nonFuel?.let { formValue6 ->
              formValue6.grossAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[non_fuel]" + "[gross_amount_decimal]", formValue8)
              }
            }
            formValue4.tax?.let { formValue6 ->
              formValue6.localAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[tax]" + "[local_amount_decimal]", formValue8)
              }
              formValue6.nationalAmountDecimal?.let { formValue8 ->
                form.add("purchase_details" + "[fleet]" + "[reported_breakdown]" + "[tax]" + "[national_amount_decimal]", formValue8)
              }
            }
          }
          formValue2.serviceType?.let { formValue4 ->
            form.add("purchase_details" + "[fleet]" + "[service_type]", formValue4.value)
          }
        }
        formValue0.flight?.let { formValue2 ->
          formValue2.departureAt?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[departure_at]", formValue4.toString())
          }
          formValue2.passengerName?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[passenger_name]", formValue4)
          }
          formValue2.refundable?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[refundable]", formValue4.toString())
          }
          formValue2.segments?.let { formValue4 ->
            if (formValue4.isEmpty()) {
              form.add("purchase_details" + "[flight]" + "[segments]", "")
            } else {
              formValue4.forEachIndexed { formIndex5, formElement5 ->
                formElement5.arrivalAirportCode?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[arrival_airport_code]", formValue7)
                }
                formElement5.carrier?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[carrier]", formValue7)
                }
                formElement5.departureAirportCode?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[departure_airport_code]", formValue7)
                }
                formElement5.flightNumber?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[flight_number]", formValue7)
                }
                formElement5.serviceClass?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[service_class]", formValue7)
                }
                formElement5.stopoverAllowed?.let { formValue7 ->
                  form.add("purchase_details" + "[flight]" + "[segments]" + "[" + formIndex5 + "]" + "[stopover_allowed]", formValue7.toString())
                }
              }
            }
          }
          formValue2.travelAgency?.let { formValue4 ->
            form.add("purchase_details" + "[flight]" + "[travel_agency]", formValue4)
          }
        }
        formValue0.fuel?.let { formValue2 ->
          formValue2.industryProductCode?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[industry_product_code]", formValue4)
          }
          formValue2.quantityDecimal?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[quantity_decimal]", formValue4)
          }
          formValue2.type?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[type]", formValue4.value)
          }
          formValue2.unit?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[unit]", formValue4.value)
          }
          formValue2.unitCostDecimal?.let { formValue4 ->
            form.add("purchase_details" + "[fuel]" + "[unit_cost_decimal]", formValue4)
          }
        }
        formValue0.lodging?.let { formValue2 ->
          formValue2.checkInAt?.let { formValue4 ->
            form.add("purchase_details" + "[lodging]" + "[check_in_at]", formValue4.toString())
          }
          formValue2.nights?.let { formValue4 ->
            form.add("purchase_details" + "[lodging]" + "[nights]", formValue4.toString())
          }
        }
        formValue0.receipt?.let { formValue2 ->
          if (formValue2.isEmpty()) {
            form.add("purchase_details" + "[receipt]", "")
          } else {
            formValue2.forEachIndexed { formIndex3, formElement3 ->
              formElement3.description?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[description]", formValue5)
              }
              formElement3.quantity?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[quantity]", formValue5)
              }
              formElement3.total?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[total]", formValue5.toString())
              }
              formElement3.unitCost?.let { formValue5 ->
                form.add("purchase_details" + "[receipt]" + "[" + formIndex3 + "]" + "[unit_cost]", formValue5.toString())
              }
            }
          }
        }
        formValue0.reference?.let { formValue2 ->
          form.add("purchase_details" + "[reference]", formValue2)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersIssuingTransactionsTransactionRefundFormCodec : MediaTypeCodec<InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a?> {
    override val id: String = "PostTestHelpersIssuingTransactionsTransactionRefund.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a?, mediaType: String): SdkRequestBody {
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
      request.refundAmount?.let { formValue0 ->
        form.add("refund_amount", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersRefundsRefundExpireFormCodec : MediaTypeCodec<InlineV1TestHelpersRefundsExpirePostRequestFormX61f3ccc7?> {
    override val id: String = "PostTestHelpersRefundsRefundExpire.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersRefundsExpirePostRequestFormX61f3ccc7?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersRefundsExpirePostRequestFormX61f3ccc7? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTerminalReadersReaderPresentPaymentMethodFormCodec : MediaTypeCodec<InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa?> {
    override val id: String = "PostTestHelpersTerminalReadersReaderPresentPaymentMethod.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amountTip?.let { formValue0 ->
        form.add("amount_tip", formValue0.toString())
      }
      request.card?.let { formValue0 ->
        formValue0.cvc?.let { formValue2 ->
          form.add("card" + "[cvc]", formValue2)
        }
        form.add("card" + "[exp_month]", formValue0.expMonth.toString())
        form.add("card" + "[exp_year]", formValue0.expYear.toString())
        form.add("card" + "[number]", formValue0.number)
      }
      request.cardPresent?.let { formValue0 ->
        formValue0.number?.let { formValue2 ->
          form.add("card_present" + "[number]", formValue2)
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
      request.interacPresent?.let { formValue0 ->
        formValue0.number?.let { formValue2 ->
          form.add("interac_present" + "[number]", formValue2)
        }
      }
      request.type?.let { formValue0 ->
        form.add("type", formValue0.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTerminalReadersReaderSucceedInputCollectionFormCodec : MediaTypeCodec<InlineV1TestHelpersTerminalReadersSucceedInputCollectionPostRequestFormXd7a037aa?> {
    override val id: String = "PostTestHelpersTerminalReadersReaderSucceedInputCollection.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTerminalReadersSucceedInputCollectionPostRequestFormXd7a037aa?, mediaType: String): SdkRequestBody {
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
      request.skipNonRequiredInputs?.let { formValue0 ->
        form.add("skip_non_required_inputs", formValue0.value)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTerminalReadersSucceedInputCollectionPostRequestFormXd7a037aa? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTerminalReadersReaderTimeoutInputCollectionFormCodec : MediaTypeCodec<InlineV1TestHelpersTerminalReadersTimeoutInputCollectionPostRequestFormX46db0f98?> {
    override val id: String = "PostTestHelpersTerminalReadersReaderTimeoutInputCollection.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTerminalReadersTimeoutInputCollectionPostRequestFormX46db0f98?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTerminalReadersTimeoutInputCollectionPostRequestFormX46db0f98? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTestClocksFormCodec : MediaTypeCodec<InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f> {
    override val id: String = "PostTestHelpersTestClocks.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.customer?.let { formValue0 ->
        form.add("customer", formValue0)
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
      form.add("frozen_time", request.frozenTime.toString())
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTestClocksTestClockAdvanceFormCodec : MediaTypeCodec<InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4> {
    override val id: String = "PostTestHelpersTestClocksTestClockAdvance.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4, mediaType: String): SdkRequestBody {
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
      form.add("frozen_time", request.frozenTime.toString())
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryInboundTransfersIdFailFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb?> {
    override val id: String = "PostTestHelpersTreasuryInboundTransfersIdFail.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb?, mediaType: String): SdkRequestBody {
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
      request.failureDetails?.let { formValue0 ->
        formValue0.code?.let { formValue2 ->
          form.add("failure_details" + "[code]", formValue2.value)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryInboundTransfersIdReturnFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryInboundTransfersReturnPostRequestFormX9a417d70?> {
    override val id: String = "PostTestHelpersTreasuryInboundTransfersIdReturn.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryInboundTransfersReturnPostRequestFormX9a417d70?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryInboundTransfersReturnPostRequestFormX9a417d70? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryInboundTransfersIdSucceedFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryInboundTransfersSucceedPostRequestFormXa4bdb9d0?> {
    override val id: String = "PostTestHelpersTreasuryInboundTransfersIdSucceed.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryInboundTransfersSucceedPostRequestFormXa4bdb9d0?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryInboundTransfersSucceedPostRequestFormXa4bdb9d0? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryOutboundPaymentsIdFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913> {
    override val id: String = "PostTestHelpersTreasuryOutboundPaymentsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913, mediaType: String): SdkRequestBody {
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
      request.trackingDetails.ach?.let { formValue1 ->
        form.add("tracking_details" + "[ach]" + "[trace_id]", formValue1.traceId)
      }
      form.add("tracking_details" + "[type]", request.trackingDetails.type.value)
      request.trackingDetails.usDomesticWire?.let { formValue1 ->
        formValue1.chips?.let { formValue3 ->
          form.add("tracking_details" + "[us_domestic_wire]" + "[chips]", formValue3)
        }
        formValue1.imad?.let { formValue3 ->
          form.add("tracking_details" + "[us_domestic_wire]" + "[imad]", formValue3)
        }
        formValue1.omad?.let { formValue3 ->
          form.add("tracking_details" + "[us_domestic_wire]" + "[omad]", formValue3)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryOutboundPaymentsIdFailFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundPaymentsFailPostRequestFormXc4786d0e?> {
    override val id: String = "PostTestHelpersTreasuryOutboundPaymentsIdFail.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryOutboundPaymentsFailPostRequestFormXc4786d0e?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryOutboundPaymentsFailPostRequestFormXc4786d0e? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryOutboundPaymentsIdPostFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundPaymentsPostPostRequestFormX69073a6a?> {
    override val id: String = "PostTestHelpersTreasuryOutboundPaymentsIdPost.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryOutboundPaymentsPostPostRequestFormX69073a6a?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryOutboundPaymentsPostPostRequestFormX69073a6a? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryOutboundPaymentsIdReturnFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d?> {
    override val id: String = "PostTestHelpersTreasuryOutboundPaymentsIdReturn.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d?, mediaType: String): SdkRequestBody {
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
      request.returnedDetails?.let { formValue0 ->
        formValue0.code?.let { formValue2 ->
          form.add("returned_details" + "[code]", formValue2.value)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryOutboundTransfersOutboundTransferFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundTransfersPostRequestFormX171d8b92> {
    override val id: String = "PostTestHelpersTreasuryOutboundTransfersOutboundTransfer.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryOutboundTransfersPostRequestFormX171d8b92, mediaType: String): SdkRequestBody {
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
      request.trackingDetails.ach?.let { formValue1 ->
        form.add("tracking_details" + "[ach]" + "[trace_id]", formValue1.traceId)
      }
      form.add("tracking_details" + "[type]", request.trackingDetails.type.value)
      request.trackingDetails.usDomesticWire?.let { formValue1 ->
        formValue1.chips?.let { formValue3 ->
          form.add("tracking_details" + "[us_domestic_wire]" + "[chips]", formValue3)
        }
        formValue1.imad?.let { formValue3 ->
          form.add("tracking_details" + "[us_domestic_wire]" + "[imad]", formValue3)
        }
        formValue1.omad?.let { formValue3 ->
          form.add("tracking_details" + "[us_domestic_wire]" + "[omad]", formValue3)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryOutboundTransfersPostRequestFormX171d8b92 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundTransfersFailPostRequestFormXec775730?> {
    override val id: String = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryOutboundTransfersFailPostRequestFormXec775730?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryOutboundTransfersFailPostRequestFormXec775730? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundTransfersPostPostRequestFormX5c93bf15?> {
    override val id: String = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryOutboundTransfersPostPostRequestFormX5c93bf15?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryOutboundTransfersPostPostRequestFormX5c93bf15? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e?> {
    override val id: String =
        "PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e?, mediaType: String): SdkRequestBody {
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
      request.returnedDetails?.let { formValue0 ->
        formValue0.code?.let { formValue2 ->
          form.add("returned_details" + "[code]", formValue2.value)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryReceivedCreditsFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435> {
    override val id: String = "PostTestHelpersTreasuryReceivedCredits.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("amount", request.amount.toString())
      form.add("currency", request.currency)
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
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
      form.add("financial_account", request.financialAccount)
      request.initiatingPaymentMethodDetails?.let { formValue0 ->
        form.add("initiating_payment_method_details" + "[type]", formValue0.type.value)
        formValue0.usBankAccount?.let { formValue2 ->
          formValue2.accountHolderName?.let { formValue4 ->
            form.add("initiating_payment_method_details" + "[us_bank_account]" + "[account_holder_name]", formValue4)
          }
          formValue2.accountNumber?.let { formValue4 ->
            form.add("initiating_payment_method_details" + "[us_bank_account]" + "[account_number]", formValue4)
          }
          formValue2.routingNumber?.let { formValue4 ->
            form.add("initiating_payment_method_details" + "[us_bank_account]" + "[routing_number]", formValue4)
          }
        }
      }
      form.add("network", request.network.value)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostTestHelpersTreasuryReceivedDebitsFormCodec : MediaTypeCodec<InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormX53deac0e> {
    override val id: String = "PostTestHelpersTreasuryReceivedDebits.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormX53deac0e, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("amount", request.amount.toString())
      form.add("currency", request.currency)
      request.description?.let { formValue0 ->
        form.add("description", formValue0)
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
      form.add("financial_account", request.financialAccount)
      request.initiatingPaymentMethodDetails?.let { formValue0 ->
        form.add("initiating_payment_method_details" + "[type]", formValue0.type.value)
        formValue0.usBankAccount?.let { formValue2 ->
          formValue2.accountHolderName?.let { formValue4 ->
            form.add("initiating_payment_method_details" + "[us_bank_account]" + "[account_holder_name]", formValue4)
          }
          formValue2.accountNumber?.let { formValue4 ->
            form.add("initiating_payment_method_details" + "[us_bank_account]" + "[account_number]", formValue4)
          }
          formValue2.routingNumber?.let { formValue4 ->
            form.add("initiating_payment_method_details" + "[us_bank_account]" + "[routing_number]", formValue4)
          }
        }
      }
      form.add("network", request.network.value)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormX53deac0e {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'test_helpers' group of Stripe API.
 */
public class TestHelpersClient(
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
      SdkExecutor(transport, authentication = this@TestHelpersClient.authentication)

  /**
   * <p>Deletes a test clock.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param testClock Wire parameter `test_clock`.
   * @param options Execution options.
   */
  public suspend fun deleteTestHelpersTestClocksTestClockWithResponse(
    request: JsonObject? = null,
    testClock: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteTestHelpersTestClocksTestClockResponse> = executor.executeWithResponse<JsonObject?, DeleteTestHelpersTestClocksTestClockResponse>(SdkExecutionRequest(deleteTestHelpersTestClocksTestClockMetadata, baseUri, request, listOf(TestHelpersCodecs.DELETETESTHELPERSTESTCLOCKSTESTCLOCK_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "test_clock", values = listOf(testClock.toString())))
  }), TestHelpersCodecs.deleteTestHelpersTestClocksTestClockRequestCodecRegistry, DeleteTestHelpersTestClocksTestClockResponseDecoder, options)

  /**
   * <p>Returns a list of your test clocks.</p>
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
  public suspend fun getTestHelpersTestClocksWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTestHelpersTestClocksResponse> = executor.executeWithResponse<JsonObject?, GetTestHelpersTestClocksResponse>(SdkExecutionRequest(getTestHelpersTestClocksMetadata, baseUri, request, listOf(TestHelpersCodecs.GETTESTHELPERSTESTCLOCKS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), TestHelpersCodecs.getTestHelpersTestClocksRequestCodecRegistry, GetTestHelpersTestClocksResponseDecoder, options)

  /**
   * <p>Retrieves a test clock.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param testClock Wire parameter `test_clock`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTestHelpersTestClocksTestClockWithResponse(
    request: JsonObject? = null,
    testClock: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTestHelpersTestClocksTestClockResponse> = executor.executeWithResponse<JsonObject?, GetTestHelpersTestClocksTestClockResponse>(SdkExecutionRequest(getTestHelpersTestClocksTestClockMetadata, baseUri, request, listOf(TestHelpersCodecs.GETTESTHELPERSTESTCLOCKSTESTCLOCK_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "test_clock", values = listOf(testClock.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TestHelpersCodecs.getTestHelpersTestClocksTestClockRequestCodecRegistry, GetTestHelpersTestClocksTestClockResponseDecoder, options)

  /**
   * <p>Create an incoming testmode bank transfer</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersCustomersCustomerFundCashBalanceWithResponse(
    request: InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8,
    customer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersCustomersCustomerFundCashBalanceResponse> = executor.executeWithResponse<InlineV1TestHelpersCustomersFundCashBalancePostRequestFormX455b73c8, PostTestHelpersCustomersCustomerFundCashBalanceResponse>(SdkExecutionRequest(postTestHelpersCustomersCustomerFundCashBalanceMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSCUSTOMERSCUSTOMERFUNDCASHBALANCE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
  }), TestHelpersCodecs.postTestHelpersCustomersCustomerFundCashBalanceRequestCodecRegistry, PostTestHelpersCustomersCustomerFundCashBalanceResponseDecoder, options)

  /**
   * <p>Create a test-mode authorization.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersIssuingAuthorizationsWithResponse(request: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481, options: CallOptions = CallOptions()): SdkResponseResult<PostTestHelpersIssuingAuthorizationsResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormXc6cf0481, PostTestHelpersIssuingAuthorizationsResponse>(SdkExecutionRequest(postTestHelpersIssuingAuthorizationsMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGAUTHORIZATIONS_REQUEST_CODEC_ID), emptyList()), TestHelpersCodecs.postTestHelpersIssuingAuthorizationsRequestCodecRegistry, PostTestHelpersIssuingAuthorizationsResponseDecoder, options)

  /**
   * <p>Capture a test-mode authorization.</p>
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
  public suspend fun postTestHelpersIssuingAuthorizationsAuthorizationCaptureWithResponse(
    request: InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663? = null,
    authorization: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingAuthorizationsCapturePostRequestFormX9bdf0663?, PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse>(SdkExecutionRequest(postTestHelpersIssuingAuthorizationsAuthorizationCaptureMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONCAPTURE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "authorization", values = listOf(authorization.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationCaptureRequestCodecRegistry, PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponseDecoder, options)

  /**
   * <p>Expire a test-mode Authorization.</p>
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
  public suspend fun postTestHelpersIssuingAuthorizationsAuthorizationExpireWithResponse(
    request: InlineV1TestHelpersIssuingAuthorizationsExpirePostRequestFormX5b791bc4? = null,
    authorization: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingAuthorizationsExpirePostRequestFormX5b791bc4?, PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse>(SdkExecutionRequest(postTestHelpersIssuingAuthorizationsAuthorizationExpireMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONEXPIRE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "authorization", values = listOf(authorization.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationExpireRequestCodecRegistry, PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponseDecoder, options)

  /**
   * <p>Finalize the amount on an Authorization prior to capture, when the initial authorization was for an estimated
   * amount.</p>
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
  public suspend fun postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountWithResponse(
    request: InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04,
    authorization: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingAuthorizationsFinalizeAmountPostRequestFormXffccad04, PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse>(SdkExecutionRequest(postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONFINALIZEAMOUNT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "authorization", values = listOf(authorization.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountRequestCodecRegistry, PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponseDecoder, options)

  /**
   * <p>Respond to a fraud challenge on a testmode Issuing authorization, simulating either a confirmation of fraud or a
   * correction of legitimacy.</p>
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
  public suspend fun postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondWithResponse(
    request: InlineV1TestHelpersIssuinge311PostRequestFormXcfa7bccb,
    authorization: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuinge311PostRequestFormXcfa7bccb, PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse>(SdkExecutionRequest(postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONFRAUDCHALLENGESRESPOND_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "authorization", values = listOf(authorization.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondRequestCodecRegistry, PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponseDecoder, options)

  /**
   * <p>Increment a test-mode Authorization.</p>
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
  public suspend fun postTestHelpersIssuingAuthorizationsAuthorizationIncrementWithResponse(
    request: InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113,
    authorization: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113, PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse>(SdkExecutionRequest(postTestHelpersIssuingAuthorizationsAuthorizationIncrementMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONINCREMENT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "authorization", values = listOf(authorization.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationIncrementRequestCodecRegistry, PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponseDecoder, options)

  /**
   * <p>Reverse a test-mode Authorization.</p>
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
  public suspend fun postTestHelpersIssuingAuthorizationsAuthorizationReverseWithResponse(
    request: InlineV1TestHelpersIssuingAuthorizationsReversePostRequestFormX74984127? = null,
    authorization: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingAuthorizationsReversePostRequestFormX74984127?, PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse>(SdkExecutionRequest(postTestHelpersIssuingAuthorizationsAuthorizationReverseMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGAUTHORIZATIONSAUTHORIZATIONREVERSE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "authorization", values = listOf(authorization.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationReverseRequestCodecRegistry, PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponseDecoder, options)

  /**
   * <p>Updates the shipping status of the specified Issuing <code>Card</code> object to <code>delivered</code>.</p>
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
  public suspend fun postTestHelpersIssuingCardsCardShippingDeliverWithResponse(
    request: InlineV1TestHelpersIssuingCardsShippingDeliverPostRequestFormX06f85bdb? = null,
    card: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingCardsCardShippingDeliverResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingCardsShippingDeliverPostRequestFormX06f85bdb?, PostTestHelpersIssuingCardsCardShippingDeliverResponse>(SdkExecutionRequest(postTestHelpersIssuingCardsCardShippingDeliverMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGCARDSCARDSHIPPINGDELIVER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "card", values = listOf(card.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingDeliverRequestCodecRegistry, PostTestHelpersIssuingCardsCardShippingDeliverResponseDecoder, options)

  /**
   * <p>Updates the shipping status of the specified Issuing <code>Card</code> object to <code>failure</code>.</p>
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
  public suspend fun postTestHelpersIssuingCardsCardShippingFailWithResponse(
    request: InlineV1TestHelpersIssuingCardsShippingFailPostRequestFormXd5d72b89? = null,
    card: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingCardsCardShippingFailResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingCardsShippingFailPostRequestFormXd5d72b89?, PostTestHelpersIssuingCardsCardShippingFailResponse>(SdkExecutionRequest(postTestHelpersIssuingCardsCardShippingFailMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGCARDSCARDSHIPPINGFAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "card", values = listOf(card.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingFailRequestCodecRegistry, PostTestHelpersIssuingCardsCardShippingFailResponseDecoder, options)

  /**
   * <p>Updates the shipping status of the specified Issuing <code>Card</code> object to <code>returned</code>.</p>
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
  public suspend fun postTestHelpersIssuingCardsCardShippingReturnWithResponse(
    request: InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f? = null,
    card: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingCardsCardShippingReturnResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingCardsShippingReturnPostRequestFormX3dbb032f?, PostTestHelpersIssuingCardsCardShippingReturnResponse>(SdkExecutionRequest(postTestHelpersIssuingCardsCardShippingReturnMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGCARDSCARDSHIPPINGRETURN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "card", values = listOf(card.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingReturnRequestCodecRegistry, PostTestHelpersIssuingCardsCardShippingReturnResponseDecoder, options)

  /**
   * <p>Updates the shipping status of the specified Issuing <code>Card</code> object to <code>shipped</code>.</p>
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
  public suspend fun postTestHelpersIssuingCardsCardShippingShipWithResponse(
    request: InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c? = null,
    card: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingCardsCardShippingShipResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c?, PostTestHelpersIssuingCardsCardShippingShipResponse>(SdkExecutionRequest(postTestHelpersIssuingCardsCardShippingShipMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGCARDSCARDSHIPPINGSHIP_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "card", values = listOf(card.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingShipRequestCodecRegistry, PostTestHelpersIssuingCardsCardShippingShipResponseDecoder, options)

  /**
   * <p>Updates the shipping status of the specified Issuing <code>Card</code> object to <code>submitted</code>. This
   * method requires Stripe Version ‘2024-09-30.acacia’ or later.</p>
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
  public suspend fun postTestHelpersIssuingCardsCardShippingSubmitWithResponse(
    request: InlineV1TestHelpersIssuingCardsShippingSubmitPostRequestFormX66000cd1? = null,
    card: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingCardsCardShippingSubmitResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingCardsShippingSubmitPostRequestFormX66000cd1?, PostTestHelpersIssuingCardsCardShippingSubmitResponse>(SdkExecutionRequest(postTestHelpersIssuingCardsCardShippingSubmitMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGCARDSCARDSHIPPINGSUBMIT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "card", values = listOf(card.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingSubmitRequestCodecRegistry, PostTestHelpersIssuingCardsCardShippingSubmitResponseDecoder, options)

  /**
   * <p>Updates the <code>status</code> of the specified testmode personalization design object to
   * <code>active</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param personalizationDesign Wire parameter `personalization_design`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateWithResponse(
    request: InlineV1TestHelpersIssuingPersonalizationDesignsActivatePostRequestFormX1bed6230? = null,
    personalizationDesign: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingPersonalizationDesignsActivatePostRequestFormX1bed6230?, PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse>(SdkExecutionRequest(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGPERSONALIZATIONDESIGNSPERSONALIZATIONDESIGNACTIVATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "personalization_design", values = listOf(personalizationDesign.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateRequestCodecRegistry, PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponseDecoder, options)

  /**
   * <p>Updates the <code>status</code> of the specified testmode personalization design object to
   * <code>inactive</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param personalizationDesign Wire parameter `personalization_design`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateWithResponse(
    request: InlineV1TestHelpersIssuing5c68PostRequestFormX09e6c7f0? = null,
    personalizationDesign: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuing5c68PostRequestFormX09e6c7f0?, PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse>(SdkExecutionRequest(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGPERSONALIZATIONDESIGNSPERSONALIZATIONDESIGNDEACTIVATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "personalization_design", values = listOf(personalizationDesign.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateRequestCodecRegistry, PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponseDecoder, options)

  /**
   * <p>Updates the <code>status</code> of the specified testmode personalization design object to
   * <code>rejected</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param personalizationDesign Wire parameter `personalization_design`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectWithResponse(
    request: InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6,
    personalizationDesign: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingPersonalizationDesignsRejectPostRequestFormX2a2b7bf6, PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse>(SdkExecutionRequest(postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGPERSONALIZATIONDESIGNSPERSONALIZATIONDESIGNREJECT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "personalization_design", values = listOf(personalizationDesign.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectRequestCodecRegistry, PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponseDecoder, options)

  /**
   * <p>Allows the user to create an Issuing settlement.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersIssuingSettlementsWithResponse(request: InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236, options: CallOptions = CallOptions()): SdkResponseResult<PostTestHelpersIssuingSettlementsResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingSettlementsPostRequestFormXa1655236, PostTestHelpersIssuingSettlementsResponse>(SdkExecutionRequest(postTestHelpersIssuingSettlementsMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGSETTLEMENTS_REQUEST_CODEC_ID), emptyList()), TestHelpersCodecs.postTestHelpersIssuingSettlementsRequestCodecRegistry, PostTestHelpersIssuingSettlementsResponseDecoder, options)

  /**
   * <p>Allows the user to mark an Issuing settlement as complete.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param settlement The settlement token to mark as complete.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersIssuingSettlementsSettlementCompleteWithResponse(
    request: InlineV1TestHelpersIssuingSettlementsCompletePostRequestFormXdb4c85f8? = null,
    settlement: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingSettlementsSettlementCompleteResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingSettlementsCompletePostRequestFormXdb4c85f8?, PostTestHelpersIssuingSettlementsSettlementCompleteResponse>(SdkExecutionRequest(postTestHelpersIssuingSettlementsSettlementCompleteMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGSETTLEMENTSSETTLEMENTCOMPLETE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "settlement", values = listOf(settlement.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingSettlementsSettlementCompleteRequestCodecRegistry, PostTestHelpersIssuingSettlementsSettlementCompleteResponseDecoder, options)

  /**
   * <p>Allows the user to capture an arbitrary amount, also known as a forced capture.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersIssuingTransactionsCreateForceCaptureWithResponse(request: InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4, options: CallOptions = CallOptions()): SdkResponseResult<PostTestHelpersIssuingTransactionsCreateForceCaptureResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingTransactionsCreateForceCapturePostRequestFormXba4feab4, PostTestHelpersIssuingTransactionsCreateForceCaptureResponse>(SdkExecutionRequest(postTestHelpersIssuingTransactionsCreateForceCaptureMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGTRANSACTIONSCREATEFORCECAPTURE_REQUEST_CODEC_ID), emptyList()), TestHelpersCodecs.postTestHelpersIssuingTransactionsCreateForceCaptureRequestCodecRegistry, PostTestHelpersIssuingTransactionsCreateForceCaptureResponseDecoder, options)

  /**
   * <p>Allows the user to refund an arbitrary amount, also known as a unlinked refund.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersIssuingTransactionsCreateUnlinkedRefundWithResponse(request: InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93, options: CallOptions = CallOptions()): SdkResponseResult<PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingc1dfPostRequestFormX2856db93, PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse>(SdkExecutionRequest(postTestHelpersIssuingTransactionsCreateUnlinkedRefundMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGTRANSACTIONSCREATEUNLINKEDREFUND_REQUEST_CODEC_ID), emptyList()), TestHelpersCodecs.postTestHelpersIssuingTransactionsCreateUnlinkedRefundRequestCodecRegistry, PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponseDecoder, options)

  /**
   * <p>Refund a test-mode Transaction.</p>
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
  public suspend fun postTestHelpersIssuingTransactionsTransactionRefundWithResponse(
    request: InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a? = null,
    transaction: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersIssuingTransactionsTransactionRefundResponse> = executor.executeWithResponse<InlineV1TestHelpersIssuingTransactionsRefundPostRequestFormXdc61b83a?, PostTestHelpersIssuingTransactionsTransactionRefundResponse>(SdkExecutionRequest(postTestHelpersIssuingTransactionsTransactionRefundMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSISSUINGTRANSACTIONSTRANSACTIONREFUND_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transaction", values = listOf(transaction.toString())))
  }), TestHelpersCodecs.postTestHelpersIssuingTransactionsTransactionRefundRequestCodecRegistry, PostTestHelpersIssuingTransactionsTransactionRefundResponseDecoder, options)

  /**
   * <p>Expire a refund with a status of <code>requires_action</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param refund Wire parameter `refund`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersRefundsRefundExpireWithResponse(
    request: InlineV1TestHelpersRefundsExpirePostRequestFormX61f3ccc7? = null,
    refund: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersRefundsRefundExpireResponse> = executor.executeWithResponse<InlineV1TestHelpersRefundsExpirePostRequestFormX61f3ccc7?, PostTestHelpersRefundsRefundExpireResponse>(SdkExecutionRequest(postTestHelpersRefundsRefundExpireMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSREFUNDSREFUNDEXPIRE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "refund", values = listOf(refund.toString())))
  }), TestHelpersCodecs.postTestHelpersRefundsRefundExpireRequestCodecRegistry, PostTestHelpersRefundsRefundExpireResponseDecoder, options)

  /**
   * <p>Presents a payment method on a simulated reader. Can be used to simulate accepting a payment, saving a card or
   * refunding a transaction.</p>
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
  public suspend fun postTestHelpersTerminalReadersReaderPresentPaymentMethodWithResponse(
    request: InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa? = null,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse> = executor.executeWithResponse<InlineV1TestHelpersTerminalReadersPresentPaymentMethodPostRequestFormXc9c11aaa?, PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse>(SdkExecutionRequest(postTestHelpersTerminalReadersReaderPresentPaymentMethodMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTERMINALREADERSREADERPRESENTPAYMENTMETHOD_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TestHelpersCodecs.postTestHelpersTerminalReadersReaderPresentPaymentMethodRequestCodecRegistry, PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponseDecoder, options)

  /**
   * <p>Use this endpoint to trigger a successful input collection on a simulated reader.</p>
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
  public suspend fun postTestHelpersTerminalReadersReaderSucceedInputCollectionWithResponse(
    request: InlineV1TestHelpersTerminalReadersSucceedInputCollectionPostRequestFormXd7a037aa? = null,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse> = executor.executeWithResponse<InlineV1TestHelpersTerminalReadersSucceedInputCollectionPostRequestFormXd7a037aa?, PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse>(SdkExecutionRequest(postTestHelpersTerminalReadersReaderSucceedInputCollectionMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTERMINALREADERSREADERSUCCEEDINPUTCOLLECTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TestHelpersCodecs.postTestHelpersTerminalReadersReaderSucceedInputCollectionRequestCodecRegistry, PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponseDecoder, options)

  /**
   * <p>Use this endpoint to complete an input collection with a timeout error on a simulated reader.</p>
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
  public suspend fun postTestHelpersTerminalReadersReaderTimeoutInputCollectionWithResponse(
    request: InlineV1TestHelpersTerminalReadersTimeoutInputCollectionPostRequestFormX46db0f98? = null,
    reader: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse> = executor.executeWithResponse<InlineV1TestHelpersTerminalReadersTimeoutInputCollectionPostRequestFormX46db0f98?, PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse>(SdkExecutionRequest(postTestHelpersTerminalReadersReaderTimeoutInputCollectionMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTERMINALREADERSREADERTIMEOUTINPUTCOLLECTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "reader", values = listOf(reader.toString())))
  }), TestHelpersCodecs.postTestHelpersTerminalReadersReaderTimeoutInputCollectionRequestCodecRegistry, PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponseDecoder, options)

  /**
   * <p>Creates a new test clock that can be attached to new customers and quotes.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTestClocksWithResponse(request: InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f, options: CallOptions = CallOptions()): SdkResponseResult<PostTestHelpersTestClocksResponse> = executor.executeWithResponse<InlineV1TestHelpersTestClocksPostRequestFormX1ecbd05f, PostTestHelpersTestClocksResponse>(SdkExecutionRequest(postTestHelpersTestClocksMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTESTCLOCKS_REQUEST_CODEC_ID), emptyList()), TestHelpersCodecs.postTestHelpersTestClocksRequestCodecRegistry, PostTestHelpersTestClocksResponseDecoder, options)

  /**
   * <p>Starts advancing a test clock to a specified time in the future. Advancement is done when status changes to
   * <code>Ready</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param testClock Wire parameter `test_clock`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTestClocksTestClockAdvanceWithResponse(
    request: InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4,
    testClock: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTestClocksTestClockAdvanceResponse> = executor.executeWithResponse<InlineV1TestHelpersTestClocksAdvancePostRequestFormX6bf15ae4, PostTestHelpersTestClocksTestClockAdvanceResponse>(SdkExecutionRequest(postTestHelpersTestClocksTestClockAdvanceMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTESTCLOCKSTESTCLOCKADVANCE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "test_clock", values = listOf(testClock.toString())))
  }), TestHelpersCodecs.postTestHelpersTestClocksTestClockAdvanceRequestCodecRegistry, PostTestHelpersTestClocksTestClockAdvanceResponseDecoder, options)

  /**
   * <p>Transitions a test mode created InboundTransfer to the <code>failed</code> status. The InboundTransfer must
   * already be in the <code>processing</code> state.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryInboundTransfersIdFailWithResponse(
    request: InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTreasuryInboundTransfersIdFailResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb?, PostTestHelpersTreasuryInboundTransfersIdFailResponse>(SdkExecutionRequest(postTestHelpersTreasuryInboundTransfersIdFailMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYINBOUNDTRANSFERSIDFAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), TestHelpersCodecs.postTestHelpersTreasuryInboundTransfersIdFailRequestCodecRegistry, PostTestHelpersTreasuryInboundTransfersIdFailResponseDecoder, options)

  /**
   * <p>Marks the test mode InboundTransfer object as returned and links the InboundTransfer to a ReceivedDebit. The
   * InboundTransfer must already be in the <code>succeeded</code> state.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryInboundTransfersIdReturnWithResponse(
    request: InlineV1TestHelpersTreasuryInboundTransfersReturnPostRequestFormX9a417d70? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTreasuryInboundTransfersIdReturnResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryInboundTransfersReturnPostRequestFormX9a417d70?, PostTestHelpersTreasuryInboundTransfersIdReturnResponse>(SdkExecutionRequest(postTestHelpersTreasuryInboundTransfersIdReturnMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYINBOUNDTRANSFERSIDRETURN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), TestHelpersCodecs.postTestHelpersTreasuryInboundTransfersIdReturnRequestCodecRegistry, PostTestHelpersTreasuryInboundTransfersIdReturnResponseDecoder, options)

  /**
   * <p>Transitions a test mode created InboundTransfer to the <code>succeeded</code> status. The InboundTransfer must
   * already be in the <code>processing</code> state.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryInboundTransfersIdSucceedWithResponse(
    request: InlineV1TestHelpersTreasuryInboundTransfersSucceedPostRequestFormXa4bdb9d0? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTreasuryInboundTransfersIdSucceedResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryInboundTransfersSucceedPostRequestFormXa4bdb9d0?, PostTestHelpersTreasuryInboundTransfersIdSucceedResponse>(SdkExecutionRequest(postTestHelpersTreasuryInboundTransfersIdSucceedMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYINBOUNDTRANSFERSIDSUCCEED_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), TestHelpersCodecs.postTestHelpersTreasuryInboundTransfersIdSucceedRequestCodecRegistry, PostTestHelpersTreasuryInboundTransfersIdSucceedResponseDecoder, options)

  /**
   * <p>Updates a test mode created OutboundPayment with tracking details. The OutboundPayment must not be cancelable,
   * and cannot be in the <code>canceled</code> or <code>failed</code> states.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryOutboundPaymentsIdWithResponse(
    request: InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTreasuryOutboundPaymentsIdResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913, PostTestHelpersTreasuryOutboundPaymentsIdResponse>(SdkExecutionRequest(postTestHelpersTreasuryOutboundPaymentsIdMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYOUTBOUNDPAYMENTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdRequestCodecRegistry, PostTestHelpersTreasuryOutboundPaymentsIdResponseDecoder, options)

  /**
   * <p>Transitions a test mode created OutboundPayment to the <code>failed</code> status. The OutboundPayment must
   * already be in the <code>processing</code> state.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryOutboundPaymentsIdFailWithResponse(
    request: InlineV1TestHelpersTreasuryOutboundPaymentsFailPostRequestFormXc4786d0e? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTreasuryOutboundPaymentsIdFailResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryOutboundPaymentsFailPostRequestFormXc4786d0e?, PostTestHelpersTreasuryOutboundPaymentsIdFailResponse>(SdkExecutionRequest(postTestHelpersTreasuryOutboundPaymentsIdFailMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYOUTBOUNDPAYMENTSIDFAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdFailRequestCodecRegistry, PostTestHelpersTreasuryOutboundPaymentsIdFailResponseDecoder, options)

  /**
   * <p>Transitions a test mode created OutboundPayment to the <code>posted</code> status. The OutboundPayment must
   * already be in the <code>processing</code> state.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryOutboundPaymentsIdPostWithResponse(
    request: InlineV1TestHelpersTreasuryOutboundPaymentsPostPostRequestFormX69073a6a? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTreasuryOutboundPaymentsIdPostResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryOutboundPaymentsPostPostRequestFormX69073a6a?, PostTestHelpersTreasuryOutboundPaymentsIdPostResponse>(SdkExecutionRequest(postTestHelpersTreasuryOutboundPaymentsIdPostMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYOUTBOUNDPAYMENTSIDPOST_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdPostRequestCodecRegistry, PostTestHelpersTreasuryOutboundPaymentsIdPostResponseDecoder, options)

  /**
   * <p>Transitions a test mode created OutboundPayment to the <code>returned</code> status. The OutboundPayment must
   * already be in the <code>processing</code> state.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryOutboundPaymentsIdReturnWithResponse(
    request: InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d? = null,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d?, PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse>(SdkExecutionRequest(postTestHelpersTreasuryOutboundPaymentsIdReturnMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYOUTBOUNDPAYMENTSIDRETURN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdReturnRequestCodecRegistry, PostTestHelpersTreasuryOutboundPaymentsIdReturnResponseDecoder, options)

  /**
   * <p>Updates a test mode created OutboundTransfer with tracking details. The OutboundTransfer must not be cancelable,
   * and cannot be in the <code>canceled</code> or <code>failed</code> states.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param outboundTransfer Wire parameter `outbound_transfer`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryOutboundTransfersOutboundTransferWithResponse(
    request: InlineV1TestHelpersTreasuryOutboundTransfersPostRequestFormX171d8b92,
    outboundTransfer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryOutboundTransfersPostRequestFormX171d8b92, PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse>(SdkExecutionRequest(postTestHelpersTreasuryOutboundTransfersOutboundTransferMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "outbound_transfer", values = listOf(outboundTransfer.toString())))
  }), TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferRequestCodecRegistry, PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponseDecoder, options)

  /**
   * <p>Transitions a test mode created OutboundTransfer to the <code>failed</code> status. The OutboundTransfer must
   * already be in the <code>processing</code> state.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param outboundTransfer Wire parameter `outbound_transfer`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryOutboundTransfersOutboundTransferFailWithResponse(
    request: InlineV1TestHelpersTreasuryOutboundTransfersFailPostRequestFormXec775730? = null,
    outboundTransfer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryOutboundTransfersFailPostRequestFormXec775730?, PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse>(SdkExecutionRequest(postTestHelpersTreasuryOutboundTransfersOutboundTransferFailMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFERFAIL_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "outbound_transfer", values = listOf(outboundTransfer.toString())))
  }), TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferFailRequestCodecRegistry, PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponseDecoder, options)

  /**
   * <p>Transitions a test mode created OutboundTransfer to the <code>posted</code> status. The OutboundTransfer must
   * already be in the <code>processing</code> state.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param outboundTransfer Wire parameter `outbound_transfer`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryOutboundTransfersOutboundTransferPostWithResponse(
    request: InlineV1TestHelpersTreasuryOutboundTransfersPostPostRequestFormX5c93bf15? = null,
    outboundTransfer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryOutboundTransfersPostPostRequestFormX5c93bf15?, PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse>(SdkExecutionRequest(postTestHelpersTreasuryOutboundTransfersOutboundTransferPostMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFERPOST_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "outbound_transfer", values = listOf(outboundTransfer.toString())))
  }), TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferPostRequestCodecRegistry, PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponseDecoder, options)

  /**
   * <p>Transitions a test mode created OutboundTransfer to the <code>returned</code> status. The OutboundTransfer must
   * already be in the <code>processing</code> state.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param outboundTransfer Wire parameter `outbound_transfer`.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnWithResponse(
    request: InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e? = null,
    outboundTransfer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e?, PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse>(SdkExecutionRequest(postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYOUTBOUNDTRANSFERSOUTBOUNDTRANSFERRETURN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "outbound_transfer", values = listOf(outboundTransfer.toString())))
  }), TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnRequestCodecRegistry, PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponseDecoder, options)

  /**
   * <p>Use this endpoint to simulate a test mode ReceivedCredit initiated by a third party. In live mode, you can’t
   * directly create ReceivedCredits initiated by third parties.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryReceivedCreditsWithResponse(request: InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435, options: CallOptions = CallOptions()): SdkResponseResult<PostTestHelpersTreasuryReceivedCreditsResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryReceivedCreditsPostRequestFormX388af435, PostTestHelpersTreasuryReceivedCreditsResponse>(SdkExecutionRequest(postTestHelpersTreasuryReceivedCreditsMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYRECEIVEDCREDITS_REQUEST_CODEC_ID), emptyList()), TestHelpersCodecs.postTestHelpersTreasuryReceivedCreditsRequestCodecRegistry, PostTestHelpersTreasuryReceivedCreditsResponseDecoder, options)

  /**
   * <p>Use this endpoint to simulate a test mode ReceivedDebit initiated by a third party. In live mode, you can’t
   * directly create ReceivedDebits initiated by third parties.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTestHelpersTreasuryReceivedDebitsWithResponse(request: InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormX53deac0e, options: CallOptions = CallOptions()): SdkResponseResult<PostTestHelpersTreasuryReceivedDebitsResponse> = executor.executeWithResponse<InlineV1TestHelpersTreasuryReceivedDebitsPostRequestFormX53deac0e, PostTestHelpersTreasuryReceivedDebitsResponse>(SdkExecutionRequest(postTestHelpersTreasuryReceivedDebitsMetadata, baseUri, request, listOf(TestHelpersCodecs.POSTTESTHELPERSTREASURYRECEIVEDDEBITS_REQUEST_CODEC_ID), emptyList()), TestHelpersCodecs.postTestHelpersTreasuryReceivedDebitsRequestCodecRegistry, PostTestHelpersTreasuryReceivedDebitsResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteTestHelpersTestClocksTestClock`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface DeleteTestHelpersTestClocksTestClockResponse {
    public class SuccessJson(
      public val json: DeletedTestHelpersTestClock,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTestHelpersTestClocksTestClockResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTestHelpersTestClocksTestClockResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteTestHelpersTestClocksTestClockResponse
  }

  private object DeleteTestHelpersTestClocksTestClockResponseDecoder : SdkResponseAlternativeDecoder<DeleteTestHelpersTestClocksTestClockResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteTestHelpersTestClocksTestClockResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteTestHelpersTestClocksTestClockResponse> = when {
      alternative.id == "DeleteTestHelpersTestClocksTestClock.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteTestHelpersTestClocksTestClockResponse.SuccessJson(
          json = TestHelpersCodecs.deleteTestHelpersTestClocksTestClockResponseCodecAlternative0Registry.select(listOf("DeleteTestHelpersTestClocksTestClock.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteTestHelpersTestClocksTestClock.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteTestHelpersTestClocksTestClockResponse.DefaultJson(
          json = TestHelpersCodecs.deleteTestHelpersTestClocksTestClockResponseCodecAlternative1Registry.select(listOf("DeleteTestHelpersTestClocksTestClock.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteTestHelpersTestClocksTestClockResponse = DeleteTestHelpersTestClocksTestClockResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTestHelpersTestClocks`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetTestHelpersTestClocksResponse {
    public class SuccessJson(
      public val json: InlineV1TestHelpersTestClocksGetResponse200JsonX69bc70a1,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTestHelpersTestClocksResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTestHelpersTestClocksResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTestHelpersTestClocksResponse
  }

  private object GetTestHelpersTestClocksResponseDecoder : SdkResponseAlternativeDecoder<GetTestHelpersTestClocksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTestHelpersTestClocksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTestHelpersTestClocksResponse> = when {
      alternative.id == "GetTestHelpersTestClocks.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTestHelpersTestClocksResponse.SuccessJson(
          json = TestHelpersCodecs.getTestHelpersTestClocksResponseCodecAlternative0Registry.select(listOf("GetTestHelpersTestClocks.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTestHelpersTestClocks.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTestHelpersTestClocksResponse.DefaultJson(
          json = TestHelpersCodecs.getTestHelpersTestClocksResponseCodecAlternative1Registry.select(listOf("GetTestHelpersTestClocks.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTestHelpersTestClocksResponse = GetTestHelpersTestClocksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTestHelpersTestClocksTestClock`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetTestHelpersTestClocksTestClockResponse {
    public class SuccessJson(
      public val json: TestHelpersTestClock,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTestHelpersTestClocksTestClockResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTestHelpersTestClocksTestClockResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTestHelpersTestClocksTestClockResponse
  }

  private object GetTestHelpersTestClocksTestClockResponseDecoder : SdkResponseAlternativeDecoder<GetTestHelpersTestClocksTestClockResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTestHelpersTestClocksTestClockResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTestHelpersTestClocksTestClockResponse> = when {
      alternative.id == "GetTestHelpersTestClocksTestClock.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTestHelpersTestClocksTestClockResponse.SuccessJson(
          json = TestHelpersCodecs.getTestHelpersTestClocksTestClockResponseCodecAlternative0Registry.select(listOf("GetTestHelpersTestClocksTestClock.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTestHelpersTestClocksTestClock.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTestHelpersTestClocksTestClockResponse.DefaultJson(
          json = TestHelpersCodecs.getTestHelpersTestClocksTestClockResponseCodecAlternative1Registry.select(listOf("GetTestHelpersTestClocksTestClock.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTestHelpersTestClocksTestClockResponse = GetTestHelpersTestClocksTestClockResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersCustomersCustomerFundCashBalance`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersCustomersCustomerFundCashBalanceResponse {
    public class SuccessJson(
      public val json: CustomerCashBalanceTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersCustomersCustomerFundCashBalanceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersCustomersCustomerFundCashBalanceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersCustomersCustomerFundCashBalanceResponse
  }

  private object PostTestHelpersCustomersCustomerFundCashBalanceResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersCustomersCustomerFundCashBalanceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersCustomersCustomerFundCashBalanceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersCustomersCustomerFundCashBalanceResponse> = when {
      alternative.id == "PostTestHelpersCustomersCustomerFundCashBalance.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersCustomersCustomerFundCashBalanceResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersCustomersCustomerFundCashBalanceResponseCodecAlternative0Registry.select(listOf("PostTestHelpersCustomersCustomerFundCashBalance.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersCustomersCustomerFundCashBalance.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersCustomersCustomerFundCashBalanceResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersCustomersCustomerFundCashBalanceResponseCodecAlternative1Registry.select(listOf("PostTestHelpersCustomersCustomerFundCashBalance.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersCustomersCustomerFundCashBalanceResponse = PostTestHelpersCustomersCustomerFundCashBalanceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingAuthorizations`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostTestHelpersIssuingAuthorizationsResponse {
    public class SuccessJson(
      public val json: IssuingAuthorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsResponse
  }

  private object PostTestHelpersIssuingAuthorizationsResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingAuthorizationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingAuthorizationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingAuthorizationsResponse> = when {
      alternative.id == "PostTestHelpersIssuingAuthorizations.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingAuthorizations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingAuthorizations.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingAuthorizations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingAuthorizationsResponse = PostTestHelpersIssuingAuthorizationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingAuthorizationsAuthorizationCapture`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse {
    public class SuccessJson(
      public val json: IssuingAuthorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse
  }

  private object PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse> = when {
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationCapture.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationCaptureResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationCapture.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationCapture.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationCaptureResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationCapture.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse = PostTestHelpersIssuingAuthorizationsAuthorizationCaptureResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingAuthorizationsAuthorizationExpire`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse {
    public class SuccessJson(
      public val json: IssuingAuthorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse
  }

  private object PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse> = when {
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationExpire.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationExpireResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationExpire.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationExpire.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationExpireResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationExpire.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse = PostTestHelpersIssuingAuthorizationsAuthorizationExpireResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse {
    public class SuccessJson(
      public val json: IssuingAuthorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse
  }

  private object PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse> = when {
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse = PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond`.
   * Non-success alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse {
    public class SuccessJson(
      public val json: IssuingAuthorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse
  }

  private object PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse> = when {
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse = PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingAuthorizationsAuthorizationIncrement`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse {
    public class SuccessJson(
      public val json: IssuingAuthorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse
  }

  private object PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse> = when {
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationIncrement.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationIncrementResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationIncrement.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationIncrement.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationIncrementResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationIncrement.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse = PostTestHelpersIssuingAuthorizationsAuthorizationIncrementResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingAuthorizationsAuthorizationReverse`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse {
    public class SuccessJson(
      public val json: IssuingAuthorization,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse
  }

  private object PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse> = when {
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationReverse.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationReverseResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationReverse.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingAuthorizationsAuthorizationReverse.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingAuthorizationsAuthorizationReverseResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingAuthorizationsAuthorizationReverse.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse = PostTestHelpersIssuingAuthorizationsAuthorizationReverseResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingCardsCardShippingDeliver`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersIssuingCardsCardShippingDeliverResponse {
    public class SuccessJson(
      public val json: IssuingCard,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingDeliverResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingDeliverResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingDeliverResponse
  }

  private object PostTestHelpersIssuingCardsCardShippingDeliverResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingCardsCardShippingDeliverResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingCardsCardShippingDeliverResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingCardsCardShippingDeliverResponse> = when {
      alternative.id == "PostTestHelpersIssuingCardsCardShippingDeliver.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingCardsCardShippingDeliverResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingDeliverResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingCardsCardShippingDeliver.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingCardsCardShippingDeliver.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingCardsCardShippingDeliverResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingDeliverResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingCardsCardShippingDeliver.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingCardsCardShippingDeliverResponse = PostTestHelpersIssuingCardsCardShippingDeliverResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingCardsCardShippingFail`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersIssuingCardsCardShippingFailResponse {
    public class SuccessJson(
      public val json: IssuingCard,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingFailResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingFailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingFailResponse
  }

  private object PostTestHelpersIssuingCardsCardShippingFailResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingCardsCardShippingFailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingCardsCardShippingFailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingCardsCardShippingFailResponse> = when {
      alternative.id == "PostTestHelpersIssuingCardsCardShippingFail.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingCardsCardShippingFailResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingFailResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingCardsCardShippingFail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingCardsCardShippingFail.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingCardsCardShippingFailResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingFailResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingCardsCardShippingFail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingCardsCardShippingFailResponse = PostTestHelpersIssuingCardsCardShippingFailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingCardsCardShippingReturn`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersIssuingCardsCardShippingReturnResponse {
    public class SuccessJson(
      public val json: IssuingCard,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingReturnResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingReturnResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingReturnResponse
  }

  private object PostTestHelpersIssuingCardsCardShippingReturnResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingCardsCardShippingReturnResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingCardsCardShippingReturnResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingCardsCardShippingReturnResponse> = when {
      alternative.id == "PostTestHelpersIssuingCardsCardShippingReturn.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingCardsCardShippingReturnResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingReturnResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingCardsCardShippingReturn.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingCardsCardShippingReturn.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingCardsCardShippingReturnResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingReturnResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingCardsCardShippingReturn.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingCardsCardShippingReturnResponse = PostTestHelpersIssuingCardsCardShippingReturnResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingCardsCardShippingShip`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersIssuingCardsCardShippingShipResponse {
    public class SuccessJson(
      public val json: IssuingCard,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingShipResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingShipResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingShipResponse
  }

  private object PostTestHelpersIssuingCardsCardShippingShipResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingCardsCardShippingShipResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingCardsCardShippingShipResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingCardsCardShippingShipResponse> = when {
      alternative.id == "PostTestHelpersIssuingCardsCardShippingShip.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingCardsCardShippingShipResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingShipResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingCardsCardShippingShip.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingCardsCardShippingShip.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingCardsCardShippingShipResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingShipResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingCardsCardShippingShip.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingCardsCardShippingShipResponse = PostTestHelpersIssuingCardsCardShippingShipResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingCardsCardShippingSubmit`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersIssuingCardsCardShippingSubmitResponse {
    public class SuccessJson(
      public val json: IssuingCard,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingSubmitResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingSubmitResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingCardsCardShippingSubmitResponse
  }

  private object PostTestHelpersIssuingCardsCardShippingSubmitResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingCardsCardShippingSubmitResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingCardsCardShippingSubmitResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingCardsCardShippingSubmitResponse> = when {
      alternative.id == "PostTestHelpersIssuingCardsCardShippingSubmit.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingCardsCardShippingSubmitResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingSubmitResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingCardsCardShippingSubmit.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingCardsCardShippingSubmit.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingCardsCardShippingSubmitResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingCardsCardShippingSubmitResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingCardsCardShippingSubmit.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingCardsCardShippingSubmitResponse = PostTestHelpersIssuingCardsCardShippingSubmitResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate`.
   * Non-success alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse {
    public class SuccessJson(
      public val json: IssuingPersonalizationDesign,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse
  }

  private object PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse> = when {
      alternative.id == "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse = PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate`.
   * Non-success alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse {
    public class SuccessJson(
      public val json: IssuingPersonalizationDesign,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse
  }

  private object PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse> = when {
      alternative.id == "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse = PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject`.
   * Non-success alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse {
    public class SuccessJson(
      public val json: IssuingPersonalizationDesign,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse
  }

  private object PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse> = when {
      alternative.id == "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse = PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingSettlements`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostTestHelpersIssuingSettlementsResponse {
    public class SuccessJson(
      public val json: IssuingSettlement,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingSettlementsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingSettlementsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingSettlementsResponse
  }

  private object PostTestHelpersIssuingSettlementsResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingSettlementsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingSettlementsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingSettlementsResponse> = when {
      alternative.id == "PostTestHelpersIssuingSettlements.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingSettlementsResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingSettlementsResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingSettlements.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingSettlements.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingSettlementsResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingSettlementsResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingSettlements.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingSettlementsResponse = PostTestHelpersIssuingSettlementsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingSettlementsSettlementComplete`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingSettlementsSettlementCompleteResponse {
    public class SuccessJson(
      public val json: IssuingSettlement,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingSettlementsSettlementCompleteResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingSettlementsSettlementCompleteResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingSettlementsSettlementCompleteResponse
  }

  private object PostTestHelpersIssuingSettlementsSettlementCompleteResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingSettlementsSettlementCompleteResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingSettlementsSettlementCompleteResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingSettlementsSettlementCompleteResponse> = when {
      alternative.id == "PostTestHelpersIssuingSettlementsSettlementComplete.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingSettlementsSettlementCompleteResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingSettlementsSettlementCompleteResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingSettlementsSettlementComplete.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingSettlementsSettlementComplete.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingSettlementsSettlementCompleteResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingSettlementsSettlementCompleteResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingSettlementsSettlementComplete.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingSettlementsSettlementCompleteResponse = PostTestHelpersIssuingSettlementsSettlementCompleteResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingTransactionsCreateForceCapture`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingTransactionsCreateForceCaptureResponse {
    public class SuccessJson(
      public val json: IssuingTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingTransactionsCreateForceCaptureResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingTransactionsCreateForceCaptureResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingTransactionsCreateForceCaptureResponse
  }

  private object PostTestHelpersIssuingTransactionsCreateForceCaptureResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingTransactionsCreateForceCaptureResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingTransactionsCreateForceCaptureResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingTransactionsCreateForceCaptureResponse> = when {
      alternative.id == "PostTestHelpersIssuingTransactionsCreateForceCapture.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingTransactionsCreateForceCaptureResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingTransactionsCreateForceCaptureResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingTransactionsCreateForceCapture.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingTransactionsCreateForceCapture.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingTransactionsCreateForceCaptureResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingTransactionsCreateForceCaptureResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingTransactionsCreateForceCapture.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingTransactionsCreateForceCaptureResponse = PostTestHelpersIssuingTransactionsCreateForceCaptureResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingTransactionsCreateUnlinkedRefund`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse {
    public class SuccessJson(
      public val json: IssuingTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse
  }

  private object PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse> = when {
      alternative.id == "PostTestHelpersIssuingTransactionsCreateUnlinkedRefund.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingTransactionsCreateUnlinkedRefundResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingTransactionsCreateUnlinkedRefund.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingTransactionsCreateUnlinkedRefund.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingTransactionsCreateUnlinkedRefundResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingTransactionsCreateUnlinkedRefund.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse = PostTestHelpersIssuingTransactionsCreateUnlinkedRefundResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersIssuingTransactionsTransactionRefund`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostTestHelpersIssuingTransactionsTransactionRefundResponse {
    public class SuccessJson(
      public val json: IssuingTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingTransactionsTransactionRefundResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingTransactionsTransactionRefundResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersIssuingTransactionsTransactionRefundResponse
  }

  private object PostTestHelpersIssuingTransactionsTransactionRefundResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersIssuingTransactionsTransactionRefundResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersIssuingTransactionsTransactionRefundResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersIssuingTransactionsTransactionRefundResponse> = when {
      alternative.id == "PostTestHelpersIssuingTransactionsTransactionRefund.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingTransactionsTransactionRefundResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersIssuingTransactionsTransactionRefundResponseCodecAlternative0Registry.select(listOf("PostTestHelpersIssuingTransactionsTransactionRefund.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersIssuingTransactionsTransactionRefund.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersIssuingTransactionsTransactionRefundResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersIssuingTransactionsTransactionRefundResponseCodecAlternative1Registry.select(listOf("PostTestHelpersIssuingTransactionsTransactionRefund.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersIssuingTransactionsTransactionRefundResponse = PostTestHelpersIssuingTransactionsTransactionRefundResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersRefundsRefundExpire`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostTestHelpersRefundsRefundExpireResponse {
    public class SuccessJson(
      public val json: Refund,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersRefundsRefundExpireResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersRefundsRefundExpireResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersRefundsRefundExpireResponse
  }

  private object PostTestHelpersRefundsRefundExpireResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersRefundsRefundExpireResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersRefundsRefundExpireResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersRefundsRefundExpireResponse> = when {
      alternative.id == "PostTestHelpersRefundsRefundExpire.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersRefundsRefundExpireResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersRefundsRefundExpireResponseCodecAlternative0Registry.select(listOf("PostTestHelpersRefundsRefundExpire.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersRefundsRefundExpire.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersRefundsRefundExpireResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersRefundsRefundExpireResponseCodecAlternative1Registry.select(listOf("PostTestHelpersRefundsRefundExpire.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersRefundsRefundExpireResponse = PostTestHelpersRefundsRefundExpireResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTerminalReadersReaderPresentPaymentMethod`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse
  }

  private object PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse> = when {
      alternative.id == "PostTestHelpersTerminalReadersReaderPresentPaymentMethod.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTerminalReadersReaderPresentPaymentMethodResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTerminalReadersReaderPresentPaymentMethod.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTerminalReadersReaderPresentPaymentMethod.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTerminalReadersReaderPresentPaymentMethodResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTerminalReadersReaderPresentPaymentMethod.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse = PostTestHelpersTerminalReadersReaderPresentPaymentMethodResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTerminalReadersReaderSucceedInputCollection`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse
  }

  private object PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse> = when {
      alternative.id == "PostTestHelpersTerminalReadersReaderSucceedInputCollection.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTerminalReadersReaderSucceedInputCollectionResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTerminalReadersReaderSucceedInputCollection.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTerminalReadersReaderSucceedInputCollection.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTerminalReadersReaderSucceedInputCollectionResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTerminalReadersReaderSucceedInputCollection.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse = PostTestHelpersTerminalReadersReaderSucceedInputCollectionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTerminalReadersReaderTimeoutInputCollection`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse {
    public class SuccessJson(
      public val json: TerminalReader,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse
  }

  private object PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse> = when {
      alternative.id == "PostTestHelpersTerminalReadersReaderTimeoutInputCollection.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTerminalReadersReaderTimeoutInputCollectionResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTerminalReadersReaderTimeoutInputCollection.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTerminalReadersReaderTimeoutInputCollection.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTerminalReadersReaderTimeoutInputCollectionResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTerminalReadersReaderTimeoutInputCollection.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse = PostTestHelpersTerminalReadersReaderTimeoutInputCollectionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTestClocks`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostTestHelpersTestClocksResponse {
    public class SuccessJson(
      public val json: TestHelpersTestClock,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTestClocksResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTestClocksResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTestClocksResponse
  }

  private object PostTestHelpersTestClocksResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTestClocksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTestClocksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTestClocksResponse> = when {
      alternative.id == "PostTestHelpersTestClocks.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTestClocksResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTestClocksResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTestClocks.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTestClocks.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTestClocksResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTestClocksResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTestClocks.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTestClocksResponse = PostTestHelpersTestClocksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTestClocksTestClockAdvance`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersTestClocksTestClockAdvanceResponse {
    public class SuccessJson(
      public val json: TestHelpersTestClock,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTestClocksTestClockAdvanceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTestClocksTestClockAdvanceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTestClocksTestClockAdvanceResponse
  }

  private object PostTestHelpersTestClocksTestClockAdvanceResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTestClocksTestClockAdvanceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTestClocksTestClockAdvanceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTestClocksTestClockAdvanceResponse> = when {
      alternative.id == "PostTestHelpersTestClocksTestClockAdvance.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTestClocksTestClockAdvanceResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTestClocksTestClockAdvanceResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTestClocksTestClockAdvance.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTestClocksTestClockAdvance.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTestClocksTestClockAdvanceResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTestClocksTestClockAdvanceResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTestClocksTestClockAdvance.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTestClocksTestClockAdvanceResponse = PostTestHelpersTestClocksTestClockAdvanceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryInboundTransfersIdFail`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryInboundTransfersIdFailResponse {
    public class SuccessJson(
      public val json: TreasuryInboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryInboundTransfersIdFailResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryInboundTransfersIdFailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryInboundTransfersIdFailResponse
  }

  private object PostTestHelpersTreasuryInboundTransfersIdFailResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryInboundTransfersIdFailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryInboundTransfersIdFailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryInboundTransfersIdFailResponse> = when {
      alternative.id == "PostTestHelpersTreasuryInboundTransfersIdFail.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryInboundTransfersIdFailResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryInboundTransfersIdFailResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryInboundTransfersIdFail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryInboundTransfersIdFail.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryInboundTransfersIdFailResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryInboundTransfersIdFailResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryInboundTransfersIdFail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryInboundTransfersIdFailResponse = PostTestHelpersTreasuryInboundTransfersIdFailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryInboundTransfersIdReturn`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryInboundTransfersIdReturnResponse {
    public class SuccessJson(
      public val json: TreasuryInboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryInboundTransfersIdReturnResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryInboundTransfersIdReturnResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryInboundTransfersIdReturnResponse
  }

  private object PostTestHelpersTreasuryInboundTransfersIdReturnResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryInboundTransfersIdReturnResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryInboundTransfersIdReturnResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryInboundTransfersIdReturnResponse> = when {
      alternative.id == "PostTestHelpersTreasuryInboundTransfersIdReturn.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryInboundTransfersIdReturnResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryInboundTransfersIdReturnResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryInboundTransfersIdReturn.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryInboundTransfersIdReturn.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryInboundTransfersIdReturnResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryInboundTransfersIdReturnResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryInboundTransfersIdReturn.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryInboundTransfersIdReturnResponse = PostTestHelpersTreasuryInboundTransfersIdReturnResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryInboundTransfersIdSucceed`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryInboundTransfersIdSucceedResponse {
    public class SuccessJson(
      public val json: TreasuryInboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryInboundTransfersIdSucceedResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryInboundTransfersIdSucceedResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryInboundTransfersIdSucceedResponse
  }

  private object PostTestHelpersTreasuryInboundTransfersIdSucceedResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryInboundTransfersIdSucceedResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryInboundTransfersIdSucceedResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryInboundTransfersIdSucceedResponse> = when {
      alternative.id == "PostTestHelpersTreasuryInboundTransfersIdSucceed.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryInboundTransfersIdSucceedResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryInboundTransfersIdSucceedResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryInboundTransfersIdSucceed.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryInboundTransfersIdSucceed.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryInboundTransfersIdSucceedResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryInboundTransfersIdSucceedResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryInboundTransfersIdSucceed.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryInboundTransfersIdSucceedResponse = PostTestHelpersTreasuryInboundTransfersIdSucceedResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryOutboundPaymentsId`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryOutboundPaymentsIdResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundPayment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdResponse
  }

  private object PostTestHelpersTreasuryOutboundPaymentsIdResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryOutboundPaymentsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryOutboundPaymentsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryOutboundPaymentsIdResponse> = when {
      alternative.id == "PostTestHelpersTreasuryOutboundPaymentsId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundPaymentsIdResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryOutboundPaymentsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryOutboundPaymentsId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundPaymentsIdResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryOutboundPaymentsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryOutboundPaymentsIdResponse = PostTestHelpersTreasuryOutboundPaymentsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryOutboundPaymentsIdFail`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryOutboundPaymentsIdFailResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundPayment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdFailResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdFailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdFailResponse
  }

  private object PostTestHelpersTreasuryOutboundPaymentsIdFailResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryOutboundPaymentsIdFailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryOutboundPaymentsIdFailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryOutboundPaymentsIdFailResponse> = when {
      alternative.id == "PostTestHelpersTreasuryOutboundPaymentsIdFail.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundPaymentsIdFailResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdFailResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryOutboundPaymentsIdFail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryOutboundPaymentsIdFail.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundPaymentsIdFailResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdFailResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryOutboundPaymentsIdFail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryOutboundPaymentsIdFailResponse = PostTestHelpersTreasuryOutboundPaymentsIdFailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryOutboundPaymentsIdPost`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryOutboundPaymentsIdPostResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundPayment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdPostResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdPostResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdPostResponse
  }

  private object PostTestHelpersTreasuryOutboundPaymentsIdPostResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryOutboundPaymentsIdPostResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryOutboundPaymentsIdPostResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryOutboundPaymentsIdPostResponse> = when {
      alternative.id == "PostTestHelpersTreasuryOutboundPaymentsIdPost.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundPaymentsIdPostResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdPostResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryOutboundPaymentsIdPost.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryOutboundPaymentsIdPost.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundPaymentsIdPostResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdPostResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryOutboundPaymentsIdPost.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryOutboundPaymentsIdPostResponse = PostTestHelpersTreasuryOutboundPaymentsIdPostResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryOutboundPaymentsIdReturn`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundPayment,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse
  }

  private object PostTestHelpersTreasuryOutboundPaymentsIdReturnResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse> = when {
      alternative.id == "PostTestHelpersTreasuryOutboundPaymentsIdReturn.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdReturnResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryOutboundPaymentsIdReturn.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryOutboundPaymentsIdReturn.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundPaymentsIdReturnResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryOutboundPaymentsIdReturn.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse = PostTestHelpersTreasuryOutboundPaymentsIdReturnResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryOutboundTransfersOutboundTransfer`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse
  }

  private object PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse> = when {
      alternative.id == "PostTestHelpersTreasuryOutboundTransfersOutboundTransfer.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryOutboundTransfersOutboundTransfer.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryOutboundTransfersOutboundTransfer.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryOutboundTransfersOutboundTransfer.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse = PostTestHelpersTreasuryOutboundTransfersOutboundTransferResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse
  }

  private object PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse> = when {
      alternative.id == "PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse = PostTestHelpersTreasuryOutboundTransfersOutboundTransferFailResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse
  }

  private object PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse> = when {
      alternative.id == "PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse = PostTestHelpersTreasuryOutboundTransfersOutboundTransferPostResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse {
    public class SuccessJson(
      public val json: TreasuryOutboundTransfer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse
  }

  private object PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse> = when {
      alternative.id == "PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse = PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturnResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryReceivedCredits`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTestHelpersTreasuryReceivedCreditsResponse {
    public class SuccessJson(
      public val json: TreasuryReceivedCredit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryReceivedCreditsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryReceivedCreditsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryReceivedCreditsResponse
  }

  private object PostTestHelpersTreasuryReceivedCreditsResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryReceivedCreditsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryReceivedCreditsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryReceivedCreditsResponse> = when {
      alternative.id == "PostTestHelpersTreasuryReceivedCredits.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryReceivedCreditsResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryReceivedCreditsResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryReceivedCredits.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryReceivedCredits.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryReceivedCreditsResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryReceivedCreditsResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryReceivedCredits.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryReceivedCreditsResponse = PostTestHelpersTreasuryReceivedCreditsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTestHelpersTreasuryReceivedDebits`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostTestHelpersTreasuryReceivedDebitsResponse {
    public class SuccessJson(
      public val json: TreasuryReceivedDebit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryReceivedDebitsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryReceivedDebitsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTestHelpersTreasuryReceivedDebitsResponse
  }

  private object PostTestHelpersTreasuryReceivedDebitsResponseDecoder : SdkResponseAlternativeDecoder<PostTestHelpersTreasuryReceivedDebitsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTestHelpersTreasuryReceivedDebitsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTestHelpersTreasuryReceivedDebitsResponse> = when {
      alternative.id == "PostTestHelpersTreasuryReceivedDebits.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryReceivedDebitsResponse.SuccessJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryReceivedDebitsResponseCodecAlternative0Registry.select(listOf("PostTestHelpersTreasuryReceivedDebits.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTestHelpersTreasuryReceivedDebits.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTestHelpersTreasuryReceivedDebitsResponse.DefaultJson(
          json = TestHelpersCodecs.postTestHelpersTreasuryReceivedDebitsResponseCodecAlternative1Registry.select(listOf("PostTestHelpersTreasuryReceivedDebits.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTestHelpersTreasuryReceivedDebitsResponse = PostTestHelpersTreasuryReceivedDebitsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val deleteTestHelpersTestClocksTestClockMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteTestHelpersTestClocksTestClock",
          method = "DELETE",
          path = "/v1/test_helpers/test_clocks/{test_clock}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedTestHelpersTestClock",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteTestHelpersTestClocksTestClock.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteTestHelpersTestClocksTestClock.response.alternative1",
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

    public val getTestHelpersTestClocksMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTestHelpersTestClocks",
          method = "GET",
          path = "/v1/test_helpers/test_clocks",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TestHelpersTestClocksGetResponse200JsonX69bc70a1",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTestHelpersTestClocks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTestHelpersTestClocks.response.alternative1",
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

    public val getTestHelpersTestClocksTestClockMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTestHelpersTestClocksTestClock",
          method = "GET",
          path = "/v1/test_helpers/test_clocks/{test_clock}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TestHelpersTestClock",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTestHelpersTestClocksTestClock.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTestHelpersTestClocksTestClock.response.alternative1",
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

    public val postTestHelpersCustomersCustomerFundCashBalanceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersCustomersCustomerFundCashBalance",
          method = "POST",
          path = "/v1/test_helpers/customers/{customer}/fund_cash_balance",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CustomerCashBalanceTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersCustomersCustomerFundCashBalance.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersCustomersCustomerFundCashBalance.response.alternative1",
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

    public val postTestHelpersIssuingAuthorizationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingAuthorizations",
          method = "POST",
          path = "/v1/test_helpers/issuing/authorizations",
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
              id = "PostTestHelpersIssuingAuthorizations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingAuthorizations.response.alternative1",
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

    public val postTestHelpersIssuingAuthorizationsAuthorizationCaptureMetadata: OperationMetadata
        by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingAuthorizationsAuthorizationCapture",
          method = "POST",
          path = "/v1/test_helpers/issuing/authorizations/{authorization}/capture",
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
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationCapture.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationCapture.response.alternative1",
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

    public val postTestHelpersIssuingAuthorizationsAuthorizationExpireMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingAuthorizationsAuthorizationExpire",
          method = "POST",
          path = "/v1/test_helpers/issuing/authorizations/{authorization}/expire",
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
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationExpire.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationExpire.response.alternative1",
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

    public val postTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmountMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount",
          method = "POST",
          path = "/v1/test_helpers/issuing/authorizations/{authorization}/finalize_amount",
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
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationFinalizeAmount.response.alternative1",
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

    public val postTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespondMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond",
          method = "POST",
          path = "/v1/test_helpers/issuing/authorizations/{authorization}/fraud_challenges/respond",
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
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationFraudChallengesRespond.response.alternative1",
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

    public val postTestHelpersIssuingAuthorizationsAuthorizationIncrementMetadata: OperationMetadata
        by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingAuthorizationsAuthorizationIncrement",
          method = "POST",
          path = "/v1/test_helpers/issuing/authorizations/{authorization}/increment",
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
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationIncrement.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationIncrement.response.alternative1",
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

    public val postTestHelpersIssuingAuthorizationsAuthorizationReverseMetadata: OperationMetadata
        by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingAuthorizationsAuthorizationReverse",
          method = "POST",
          path = "/v1/test_helpers/issuing/authorizations/{authorization}/reverse",
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
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationReverse.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingAuthorizationsAuthorizationReverse.response.alternative1",
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

    public val postTestHelpersIssuingCardsCardShippingDeliverMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingCardsCardShippingDeliver",
          method = "POST",
          path = "/v1/test_helpers/issuing/cards/{card}/shipping/deliver",
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
              id = "PostTestHelpersIssuingCardsCardShippingDeliver.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingCardsCardShippingDeliver.response.alternative1",
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

    public val postTestHelpersIssuingCardsCardShippingFailMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingCardsCardShippingFail",
          method = "POST",
          path = "/v1/test_helpers/issuing/cards/{card}/shipping/fail",
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
              id = "PostTestHelpersIssuingCardsCardShippingFail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingCardsCardShippingFail.response.alternative1",
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

    public val postTestHelpersIssuingCardsCardShippingReturnMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingCardsCardShippingReturn",
          method = "POST",
          path = "/v1/test_helpers/issuing/cards/{card}/shipping/return",
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
              id = "PostTestHelpersIssuingCardsCardShippingReturn.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingCardsCardShippingReturn.response.alternative1",
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

    public val postTestHelpersIssuingCardsCardShippingShipMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingCardsCardShippingShip",
          method = "POST",
          path = "/v1/test_helpers/issuing/cards/{card}/shipping/ship",
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
              id = "PostTestHelpersIssuingCardsCardShippingShip.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingCardsCardShippingShip.response.alternative1",
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

    public val postTestHelpersIssuingCardsCardShippingSubmitMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingCardsCardShippingSubmit",
          method = "POST",
          path = "/v1/test_helpers/issuing/cards/{card}/shipping/submit",
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
              id = "PostTestHelpersIssuingCardsCardShippingSubmit.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingCardsCardShippingSubmit.response.alternative1",
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

    public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivateMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate",
          method = "POST",
          path = "/v1/test_helpers/issuing/personalization_designs/{personalization_design}/activate",
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
              id = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignActivate.response.alternative1",
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

    public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivateMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate",
          method = "POST",
          path = "/v1/test_helpers/issuing/personalization_designs/{personalization_design}/deactivate",
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
              id = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignDeactivate.response.alternative1",
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

    public val postTestHelpersIssuingPersonalizationDesignsPersonalizationDesignRejectMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject",
          method = "POST",
          path = "/v1/test_helpers/issuing/personalization_designs/{personalization_design}/reject",
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
              id = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingPersonalizationDesignsPersonalizationDesignReject.response.alternative1",
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

    public val postTestHelpersIssuingSettlementsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingSettlements",
          method = "POST",
          path = "/v1/test_helpers/issuing/settlements",
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
              id = "PostTestHelpersIssuingSettlements.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingSettlements.response.alternative1",
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

    public val postTestHelpersIssuingSettlementsSettlementCompleteMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingSettlementsSettlementComplete",
          method = "POST",
          path = "/v1/test_helpers/issuing/settlements/{settlement}/complete",
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
              id = "PostTestHelpersIssuingSettlementsSettlementComplete.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingSettlementsSettlementComplete.response.alternative1",
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

    public val postTestHelpersIssuingTransactionsCreateForceCaptureMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingTransactionsCreateForceCapture",
          method = "POST",
          path = "/v1/test_helpers/issuing/transactions/create_force_capture",
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
              id = "PostTestHelpersIssuingTransactionsCreateForceCapture.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingTransactionsCreateForceCapture.response.alternative1",
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

    public val postTestHelpersIssuingTransactionsCreateUnlinkedRefundMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingTransactionsCreateUnlinkedRefund",
          method = "POST",
          path = "/v1/test_helpers/issuing/transactions/create_unlinked_refund",
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
              id = "PostTestHelpersIssuingTransactionsCreateUnlinkedRefund.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingTransactionsCreateUnlinkedRefund.response.alternative1",
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

    public val postTestHelpersIssuingTransactionsTransactionRefundMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersIssuingTransactionsTransactionRefund",
          method = "POST",
          path = "/v1/test_helpers/issuing/transactions/{transaction}/refund",
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
              id = "PostTestHelpersIssuingTransactionsTransactionRefund.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersIssuingTransactionsTransactionRefund.response.alternative1",
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

    public val postTestHelpersRefundsRefundExpireMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersRefundsRefundExpire",
          method = "POST",
          path = "/v1/test_helpers/refunds/{refund}/expire",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Refund",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersRefundsRefundExpire.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersRefundsRefundExpire.response.alternative1",
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

    public val postTestHelpersTerminalReadersReaderPresentPaymentMethodMetadata: OperationMetadata
        by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTerminalReadersReaderPresentPaymentMethod",
          method = "POST",
          path = "/v1/test_helpers/terminal/readers/{reader}/present_payment_method",
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
              id = "PostTestHelpersTerminalReadersReaderPresentPaymentMethod.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTerminalReadersReaderPresentPaymentMethod.response.alternative1",
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

    public val postTestHelpersTerminalReadersReaderSucceedInputCollectionMetadata: OperationMetadata
        by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTerminalReadersReaderSucceedInputCollection",
          method = "POST",
          path = "/v1/test_helpers/terminal/readers/{reader}/succeed_input_collection",
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
              id = "PostTestHelpersTerminalReadersReaderSucceedInputCollection.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTerminalReadersReaderSucceedInputCollection.response.alternative1",
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

    public val postTestHelpersTerminalReadersReaderTimeoutInputCollectionMetadata: OperationMetadata
        by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTerminalReadersReaderTimeoutInputCollection",
          method = "POST",
          path = "/v1/test_helpers/terminal/readers/{reader}/timeout_input_collection",
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
              id = "PostTestHelpersTerminalReadersReaderTimeoutInputCollection.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTerminalReadersReaderTimeoutInputCollection.response.alternative1",
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

    public val postTestHelpersTestClocksMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTestClocks",
          method = "POST",
          path = "/v1/test_helpers/test_clocks",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TestHelpersTestClock",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTestClocks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTestClocks.response.alternative1",
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

    public val postTestHelpersTestClocksTestClockAdvanceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTestClocksTestClockAdvance",
          method = "POST",
          path = "/v1/test_helpers/test_clocks/{test_clock}/advance",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TestHelpersTestClock",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTestClocksTestClockAdvance.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTestClocksTestClockAdvance.response.alternative1",
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

    public val postTestHelpersTreasuryInboundTransfersIdFailMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryInboundTransfersIdFail",
          method = "POST",
          path = "/v1/test_helpers/treasury/inbound_transfers/{id}/fail",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryInboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryInboundTransfersIdFail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryInboundTransfersIdFail.response.alternative1",
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

    public val postTestHelpersTreasuryInboundTransfersIdReturnMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryInboundTransfersIdReturn",
          method = "POST",
          path = "/v1/test_helpers/treasury/inbound_transfers/{id}/return",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryInboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryInboundTransfersIdReturn.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryInboundTransfersIdReturn.response.alternative1",
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

    public val postTestHelpersTreasuryInboundTransfersIdSucceedMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryInboundTransfersIdSucceed",
          method = "POST",
          path = "/v1/test_helpers/treasury/inbound_transfers/{id}/succeed",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryInboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryInboundTransfersIdSucceed.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryInboundTransfersIdSucceed.response.alternative1",
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

    public val postTestHelpersTreasuryOutboundPaymentsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryOutboundPaymentsId",
          method = "POST",
          path = "/v1/test_helpers/treasury/outbound_payments/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundPayment",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundPaymentsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundPaymentsId.response.alternative1",
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

    public val postTestHelpersTreasuryOutboundPaymentsIdFailMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryOutboundPaymentsIdFail",
          method = "POST",
          path = "/v1/test_helpers/treasury/outbound_payments/{id}/fail",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundPayment",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundPaymentsIdFail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundPaymentsIdFail.response.alternative1",
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

    public val postTestHelpersTreasuryOutboundPaymentsIdPostMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryOutboundPaymentsIdPost",
          method = "POST",
          path = "/v1/test_helpers/treasury/outbound_payments/{id}/post",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundPayment",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundPaymentsIdPost.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundPaymentsIdPost.response.alternative1",
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

    public val postTestHelpersTreasuryOutboundPaymentsIdReturnMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryOutboundPaymentsIdReturn",
          method = "POST",
          path = "/v1/test_helpers/treasury/outbound_payments/{id}/return",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundPayment",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundPaymentsIdReturn.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundPaymentsIdReturn.response.alternative1",
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

    public val postTestHelpersTreasuryOutboundTransfersOutboundTransferMetadata: OperationMetadata
        by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryOutboundTransfersOutboundTransfer",
          method = "POST",
          path = "/v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundTransfersOutboundTransfer.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundTransfersOutboundTransfer.response.alternative1",
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

    public val postTestHelpersTreasuryOutboundTransfersOutboundTransferFailMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail",
          method = "POST",
          path = "/v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}/fail",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferFail.response.alternative1",
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

    public val postTestHelpersTreasuryOutboundTransfersOutboundTransferPostMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost",
          method = "POST",
          path = "/v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}/post",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferPost.response.alternative1",
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

    public val postTestHelpersTreasuryOutboundTransfersOutboundTransferReturnMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn",
          method = "POST",
          path = "/v1/test_helpers/treasury/outbound_transfers/{outbound_transfer}/return",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryOutboundTransfer",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryOutboundTransfersOutboundTransferReturn.response.alternative1",
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

    public val postTestHelpersTreasuryReceivedCreditsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryReceivedCredits",
          method = "POST",
          path = "/v1/test_helpers/treasury/received_credits",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryReceivedCredit",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryReceivedCredits.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryReceivedCredits.response.alternative1",
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

    public val postTestHelpersTreasuryReceivedDebitsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTestHelpersTreasuryReceivedDebits",
          method = "POST",
          path = "/v1/test_helpers/treasury/received_debits",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TreasuryReceivedDebit",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryReceivedDebits.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTestHelpersTreasuryReceivedDebits.response.alternative1",
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
