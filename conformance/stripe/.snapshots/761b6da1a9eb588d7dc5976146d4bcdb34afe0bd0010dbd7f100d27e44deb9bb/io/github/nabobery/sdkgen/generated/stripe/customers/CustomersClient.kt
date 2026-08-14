package io.github.nabobery.sdkgen.generated.stripe.customers

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
import io.github.nabobery.sdkgen.generated.stripe.BankAccount
import io.github.nabobery.sdkgen.generated.stripe.Card
import io.github.nabobery.sdkgen.generated.stripe.CashBalance
import io.github.nabobery.sdkgen.generated.stripe.CustomerBalanceTransaction
import io.github.nabobery.sdkgen.generated.stripe.CustomerCashBalanceTransaction
import io.github.nabobery.sdkgen.generated.stripe.DeletedCustomer
import io.github.nabobery.sdkgen.generated.stripe.DeletedDiscount
import io.github.nabobery.sdkgen.generated.stripe.DeletedTaxId
import io.github.nabobery.sdkgen.generated.stripe.Discount
import io.github.nabobery.sdkgen.generated.stripe.Error
import io.github.nabobery.sdkgen.generated.stripe.FundingInstructions
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBalanceTransactionsGetResponse200JsonX861e0ca6
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBalanceTransactionsPostRequestFormXc8087361
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBankAccountsDeleteRequestFormX3bf869f9
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBankAccountsDeleteResponse200JsonXa03131e2
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBankAccountsGetResponse200JsonX8d3d4b93
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBankAccountsPostRequestFormX18e3bf43
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBankAccountsPostRequestFormX92af665f
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBankAccountsPostResponse200JsonXf5372d82
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersCardsDeleteRequestFormX02c14333
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersCardsGetResponse200JsonX1baae5ee
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersCardsPostRequestFormX545a6d22
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersCardsPostRequestFormX9790010b
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersCardsPostResponse200JsonXa7937916
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersCashBalancePostRequestFormX6eb72ec3
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersGetParameterX1f9558d2
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersGetResponse200JsonX44b62b7d
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersGetResponse200JsonX874ee250
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersPaymentMethodsGetParameterXcdd88ad7
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersPaymentMethodsGetParameterXf511dd8f
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersPaymentMethodsGetResponse200JsonX56b8707f
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSearchGetResponse200JsonX6ae66ad5
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSourcesDeleteRequestFormX1346ee63
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSourcesDeleteResponse200JsonXf22f4818
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSourcesGetResponse200JsonX5d75faf9
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSourcesPostRequestFormX2b7e12c1
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSourcesPostRequestFormX91b8f989
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSourcesPostResponse200JsonX6d2b1d0d
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSourcesVerifyPostRequestFormX329337c2
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsGetResponse200JsonX7fa17575
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersTaxIdsGetResponse200JsonX122b02ff
import io.github.nabobery.sdkgen.generated.stripe.InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc
import io.github.nabobery.sdkgen.generated.stripe.PaymentMethod
import io.github.nabobery.sdkgen.generated.stripe.PaymentSource
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import io.github.nabobery.sdkgen.generated.stripe.Subscription
import io.github.nabobery.sdkgen.generated.stripe.TaxId
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

internal object CustomersCodecs {
  internal const val DELETECUSTOMERSCUSTOMER_REQUEST_CODEC_ID: String =
      "DeleteCustomersCustomer.request"

  private val deleteCustomersCustomerRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteCustomersCustomerFormCodec

  private val deleteCustomersCustomerResponseCodecAlternative0Codec: MediaTypeCodec<DeletedCustomer>
      =
      KotlinxSerializationCodec("DeleteCustomersCustomer.response.alternative0", DeletedCustomer.Serializer, SdkJson)

  internal val deleteCustomersCustomerResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedCustomer> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerResponseCodecAlternative0Codec)

  private val deleteCustomersCustomerResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteCustomersCustomer.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteCustomersCustomerResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerResponseCodecAlternative1Codec)

  internal val deleteCustomersCustomerRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerRequestCodec)

  internal const val DELETECUSTOMERSCUSTOMERBANKACCOUNTSID_REQUEST_CODEC_ID: String =
      "DeleteCustomersCustomerBankAccountsId.request"

  private val deleteCustomersCustomerBankAccountsIdRequestCodec:
      MediaTypeCodec<InlineV1CustomersBankAccountsDeleteRequestFormX3bf869f9?> =
      DeleteCustomersCustomerBankAccountsIdFormCodec

  private val deleteCustomersCustomerBankAccountsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersBankAccountsDeleteResponse200JsonXa03131e2> =
      KotlinxSerializationCodec("DeleteCustomersCustomerBankAccountsId.response.alternative0", InlineV1CustomersBankAccountsDeleteResponse200JsonXa03131e2.Serializer, SdkJson)

  internal val deleteCustomersCustomerBankAccountsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersBankAccountsDeleteResponse200JsonXa03131e2> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerBankAccountsIdResponseCodecAlternative0Codec)

  private val deleteCustomersCustomerBankAccountsIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteCustomersCustomerBankAccountsId.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteCustomersCustomerBankAccountsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerBankAccountsIdResponseCodecAlternative1Codec)

  internal val deleteCustomersCustomerBankAccountsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersBankAccountsDeleteRequestFormX3bf869f9?> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerBankAccountsIdRequestCodec)

  internal const val DELETECUSTOMERSCUSTOMERCARDSID_REQUEST_CODEC_ID: String =
      "DeleteCustomersCustomerCardsId.request"

  private val deleteCustomersCustomerCardsIdRequestCodec:
      MediaTypeCodec<InlineV1CustomersCardsDeleteRequestFormX02c14333?> =
      DeleteCustomersCustomerCardsIdFormCodec

  private val deleteCustomersCustomerCardsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06> =
      KotlinxSerializationCodec("DeleteCustomersCustomerCardsId.response.alternative0", InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06.Serializer, SdkJson)

  internal val deleteCustomersCustomerCardsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerCardsIdResponseCodecAlternative0Codec)

  private val deleteCustomersCustomerCardsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteCustomersCustomerCardsId.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteCustomersCustomerCardsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerCardsIdResponseCodecAlternative1Codec)

  internal val deleteCustomersCustomerCardsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersCardsDeleteRequestFormX02c14333?> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerCardsIdRequestCodec)

  internal const val DELETECUSTOMERSCUSTOMERDISCOUNT_REQUEST_CODEC_ID: String =
      "DeleteCustomersCustomerDiscount.request"

  private val deleteCustomersCustomerDiscountRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteCustomersCustomerDiscountFormCodec

  private val deleteCustomersCustomerDiscountResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedDiscount> =
      KotlinxSerializationCodec("DeleteCustomersCustomerDiscount.response.alternative0", DeletedDiscount.Serializer, SdkJson)

  internal val deleteCustomersCustomerDiscountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedDiscount> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerDiscountResponseCodecAlternative0Codec)

  private val deleteCustomersCustomerDiscountResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteCustomersCustomerDiscount.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteCustomersCustomerDiscountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerDiscountResponseCodecAlternative1Codec)

  internal val deleteCustomersCustomerDiscountRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerDiscountRequestCodec)

  internal const val DELETECUSTOMERSCUSTOMERSOURCESID_REQUEST_CODEC_ID: String =
      "DeleteCustomersCustomerSourcesId.request"

  private val deleteCustomersCustomerSourcesIdRequestCodec:
      MediaTypeCodec<InlineV1CustomersSourcesDeleteRequestFormX1346ee63?> =
      DeleteCustomersCustomerSourcesIdFormCodec

  private val deleteCustomersCustomerSourcesIdResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersSourcesDeleteResponse200JsonXf22f4818> =
      KotlinxSerializationCodec("DeleteCustomersCustomerSourcesId.response.alternative0", InlineV1CustomersSourcesDeleteResponse200JsonXf22f4818.Serializer, SdkJson)

  internal val deleteCustomersCustomerSourcesIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersSourcesDeleteResponse200JsonXf22f4818> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerSourcesIdResponseCodecAlternative0Codec)

  private val deleteCustomersCustomerSourcesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("DeleteCustomersCustomerSourcesId.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteCustomersCustomerSourcesIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerSourcesIdResponseCodecAlternative1Codec)

  internal val deleteCustomersCustomerSourcesIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersSourcesDeleteRequestFormX1346ee63?> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerSourcesIdRequestCodec)

  internal const val DELETECUSTOMERSCUSTOMERSUBSCRIPTIONSSUBSCRIPTIONEXPOSEDID_REQUEST_CODEC_ID:
      String = "DeleteCustomersCustomerSubscriptionsSubscriptionExposedId.request"

  private val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdRequestCodec:
      MediaTypeCodec<InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08?> =
      DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdFormCodec

  private val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Codec:
      MediaTypeCodec<Subscription> =
      KotlinxSerializationCodec("DeleteCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative0", Subscription.Serializer, SdkJson)

  internal val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Subscription> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Codec)

  private val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Codec)

  internal val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08?> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerSubscriptionsSubscriptionExposedIdRequestCodec)

  internal const val DELETECUSTOMERSCUSTOMERSUBSCRIPTIONSSUBSCRIPTIONEXPOSEDIDDISCOUNT_REQUEST_CODEC_ID:
      String = "DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.request"

  private val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountRequestCodec:
      MediaTypeCodec<JsonObject?> =
      DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountFormCodec

  private val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedDiscount> =
      KotlinxSerializationCodec("DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative0", DeletedDiscount.Serializer, SdkJson)

  internal val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedDiscount> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Codec)

  private val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Codec)

  internal val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountRequestCodec)

  internal const val DELETECUSTOMERSCUSTOMERTAXIDSID_REQUEST_CODEC_ID: String =
      "DeleteCustomersCustomerTaxIdsId.request"

  private val deleteCustomersCustomerTaxIdsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteCustomersCustomerTaxIdsIdFormCodec

  private val deleteCustomersCustomerTaxIdsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedTaxId> =
      KotlinxSerializationCodec("DeleteCustomersCustomerTaxIdsId.response.alternative0", DeletedTaxId.Serializer, SdkJson)

  internal val deleteCustomersCustomerTaxIdsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedTaxId> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerTaxIdsIdResponseCodecAlternative0Codec)

  private val deleteCustomersCustomerTaxIdsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteCustomersCustomerTaxIdsId.response.alternative1", Error.Serializer, SdkJson)

  internal val deleteCustomersCustomerTaxIdsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerTaxIdsIdResponseCodecAlternative1Codec)

  internal val deleteCustomersCustomerTaxIdsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteCustomersCustomerTaxIdsIdRequestCodec)

  internal const val GETCUSTOMERS_REQUEST_CODEC_ID: String = "GetCustomers.request"

  private val getCustomersRequestCodec: MediaTypeCodec<JsonObject?> = GetCustomersFormCodec

  private val getCustomersResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersGetResponse200JsonX44b62b7d> =
      KotlinxSerializationCodec("GetCustomers.response.alternative0", InlineV1CustomersGetResponse200JsonX44b62b7d.Serializer, SdkJson)

  internal val getCustomersResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersGetResponse200JsonX44b62b7d> =
      MediaTypeCodecRegistry.of(getCustomersResponseCodecAlternative0Codec)

  private val getCustomersResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomers.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersResponseCodecAlternative1Codec)

  internal val getCustomersRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersRequestCodec)

  internal const val GETCUSTOMERSCUSTOMER_REQUEST_CODEC_ID: String = "GetCustomersCustomer.request"

  private val getCustomersCustomerRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerFormCodec

  private val getCustomersCustomerResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersGetResponse200JsonX874ee250> =
      KotlinxSerializationCodec("GetCustomersCustomer.response.alternative0", InlineV1CustomersGetResponse200JsonX874ee250.Serializer, SdkJson)

  internal val getCustomersCustomerResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersGetResponse200JsonX874ee250> =
      MediaTypeCodecRegistry.of(getCustomersCustomerResponseCodecAlternative0Codec)

  private val getCustomersCustomerResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomer.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(getCustomersCustomerResponseCodecAlternative1Codec)

  internal val getCustomersCustomerRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERBALANCETRANSACTIONS_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerBalanceTransactions.request"

  private val getCustomersCustomerBalanceTransactionsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerBalanceTransactionsFormCodec

  private val getCustomersCustomerBalanceTransactionsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersBalanceTransactionsGetResponse200JsonX861e0ca6> =
      KotlinxSerializationCodec("GetCustomersCustomerBalanceTransactions.response.alternative0", InlineV1CustomersBalanceTransactionsGetResponse200JsonX861e0ca6.Serializer, SdkJson)

  internal val getCustomersCustomerBalanceTransactionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersBalanceTransactionsGetResponse200JsonX861e0ca6> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBalanceTransactionsResponseCodecAlternative0Codec)

  private val getCustomersCustomerBalanceTransactionsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerBalanceTransactions.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerBalanceTransactionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBalanceTransactionsResponseCodecAlternative1Codec)

  internal val getCustomersCustomerBalanceTransactionsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBalanceTransactionsRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERBALANCETRANSACTIONSTRANSACTION_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerBalanceTransactionsTransaction.request"

  private val getCustomersCustomerBalanceTransactionsTransactionRequestCodec:
      MediaTypeCodec<JsonObject?> = GetCustomersCustomerBalanceTransactionsTransactionFormCodec

  private val getCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative0Codec:
      MediaTypeCodec<CustomerBalanceTransaction> =
      KotlinxSerializationCodec("GetCustomersCustomerBalanceTransactionsTransaction.response.alternative0", CustomerBalanceTransaction.Serializer, SdkJson)

  internal val getCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CustomerBalanceTransaction> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative0Codec)

  private val getCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerBalanceTransactionsTransaction.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative1Codec)

  internal val getCustomersCustomerBalanceTransactionsTransactionRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBalanceTransactionsTransactionRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERBANKACCOUNTS_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerBankAccounts.request"

  private val getCustomersCustomerBankAccountsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerBankAccountsFormCodec

  private val getCustomersCustomerBankAccountsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersBankAccountsGetResponse200JsonX8d3d4b93> =
      KotlinxSerializationCodec("GetCustomersCustomerBankAccounts.response.alternative0", InlineV1CustomersBankAccountsGetResponse200JsonX8d3d4b93.Serializer, SdkJson)

  internal val getCustomersCustomerBankAccountsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersBankAccountsGetResponse200JsonX8d3d4b93> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBankAccountsResponseCodecAlternative0Codec)

  private val getCustomersCustomerBankAccountsResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetCustomersCustomerBankAccounts.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerBankAccountsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBankAccountsResponseCodecAlternative1Codec)

  internal val getCustomersCustomerBankAccountsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBankAccountsRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERBANKACCOUNTSID_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerBankAccountsId.request"

  private val getCustomersCustomerBankAccountsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerBankAccountsIdFormCodec

  private val getCustomersCustomerBankAccountsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<BankAccount> =
      KotlinxSerializationCodec("GetCustomersCustomerBankAccountsId.response.alternative0", BankAccount.Serializer, SdkJson)

  internal val getCustomersCustomerBankAccountsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BankAccount> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBankAccountsIdResponseCodecAlternative0Codec)

  private val getCustomersCustomerBankAccountsIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerBankAccountsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerBankAccountsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBankAccountsIdResponseCodecAlternative1Codec)

  internal val getCustomersCustomerBankAccountsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerBankAccountsIdRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERCARDS_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerCards.request"

  private val getCustomersCustomerCardsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerCardsFormCodec

  private val getCustomersCustomerCardsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersCardsGetResponse200JsonX1baae5ee> =
      KotlinxSerializationCodec("GetCustomersCustomerCards.response.alternative0", InlineV1CustomersCardsGetResponse200JsonX1baae5ee.Serializer, SdkJson)

  internal val getCustomersCustomerCardsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersCardsGetResponse200JsonX1baae5ee> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCardsResponseCodecAlternative0Codec)

  private val getCustomersCustomerCardsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerCards.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerCardsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCardsResponseCodecAlternative1Codec)

  internal val getCustomersCustomerCardsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCardsRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERCARDSID_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerCardsId.request"

  private val getCustomersCustomerCardsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerCardsIdFormCodec

  private val getCustomersCustomerCardsIdResponseCodecAlternative0Codec: MediaTypeCodec<Card> =
      KotlinxSerializationCodec("GetCustomersCustomerCardsId.response.alternative0", Card.Serializer, SdkJson)

  internal val getCustomersCustomerCardsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Card> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCardsIdResponseCodecAlternative0Codec)

  private val getCustomersCustomerCardsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerCardsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerCardsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCardsIdResponseCodecAlternative1Codec)

  internal val getCustomersCustomerCardsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getCustomersCustomerCardsIdRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERCASHBALANCE_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerCashBalance.request"

  private val getCustomersCustomerCashBalanceRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerCashBalanceFormCodec

  private val getCustomersCustomerCashBalanceResponseCodecAlternative0Codec:
      MediaTypeCodec<CashBalance> =
      KotlinxSerializationCodec("GetCustomersCustomerCashBalance.response.alternative0", CashBalance.Serializer, SdkJson)

  internal val getCustomersCustomerCashBalanceResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CashBalance> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCashBalanceResponseCodecAlternative0Codec)

  private val getCustomersCustomerCashBalanceResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerCashBalance.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerCashBalanceResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCashBalanceResponseCodecAlternative1Codec)

  internal val getCustomersCustomerCashBalanceRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCashBalanceRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERCASHBALANCETRANSACTIONS_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerCashBalanceTransactions.request"

  private val getCustomersCustomerCashBalanceTransactionsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerCashBalanceTransactionsFormCodec

  private val getCustomersCustomerCashBalanceTransactionsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc> =
      KotlinxSerializationCodec("GetCustomersCustomerCashBalanceTransactions.response.alternative0", InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc.Serializer, SdkJson)

  internal val getCustomersCustomerCashBalanceTransactionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCashBalanceTransactionsResponseCodecAlternative0Codec)

  private val getCustomersCustomerCashBalanceTransactionsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerCashBalanceTransactions.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerCashBalanceTransactionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCashBalanceTransactionsResponseCodecAlternative1Codec)

  internal val getCustomersCustomerCashBalanceTransactionsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCashBalanceTransactionsRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERCASHBALANCETRANSACTIONSTRANSACTION_REQUEST_CODEC_ID: String
      = "GetCustomersCustomerCashBalanceTransactionsTransaction.request"

  private val getCustomersCustomerCashBalanceTransactionsTransactionRequestCodec:
      MediaTypeCodec<JsonObject?> = GetCustomersCustomerCashBalanceTransactionsTransactionFormCodec

  private val getCustomersCustomerCashBalanceTransactionsTransactionResponseCodecAlternative0Codec:
      MediaTypeCodec<CustomerCashBalanceTransaction> =
      KotlinxSerializationCodec("GetCustomersCustomerCashBalanceTransactionsTransaction.response.alternative0", CustomerCashBalanceTransaction.Serializer, SdkJson)

  internal val getCustomersCustomerCashBalanceTransactionsTransactionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CustomerCashBalanceTransaction> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCashBalanceTransactionsTransactionResponseCodecAlternative0Codec)

  private val getCustomersCustomerCashBalanceTransactionsTransactionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerCashBalanceTransactionsTransaction.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerCashBalanceTransactionsTransactionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCashBalanceTransactionsTransactionResponseCodecAlternative1Codec)

  internal val getCustomersCustomerCashBalanceTransactionsTransactionRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerCashBalanceTransactionsTransactionRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERDISCOUNT_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerDiscount.request"

  private val getCustomersCustomerDiscountRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerDiscountFormCodec

  private val getCustomersCustomerDiscountResponseCodecAlternative0Codec: MediaTypeCodec<Discount> =
      KotlinxSerializationCodec("GetCustomersCustomerDiscount.response.alternative0", Discount.Serializer, SdkJson)

  internal val getCustomersCustomerDiscountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Discount> =
      MediaTypeCodecRegistry.of(getCustomersCustomerDiscountResponseCodecAlternative0Codec)

  private val getCustomersCustomerDiscountResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerDiscount.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerDiscountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerDiscountResponseCodecAlternative1Codec)

  internal val getCustomersCustomerDiscountRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getCustomersCustomerDiscountRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERPAYMENTMETHODS_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerPaymentMethods.request"

  private val getCustomersCustomerPaymentMethodsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerPaymentMethodsFormCodec

  private val getCustomersCustomerPaymentMethodsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersPaymentMethodsGetResponse200JsonX56b8707f> =
      KotlinxSerializationCodec("GetCustomersCustomerPaymentMethods.response.alternative0", InlineV1CustomersPaymentMethodsGetResponse200JsonX56b8707f.Serializer, SdkJson)

  internal val getCustomersCustomerPaymentMethodsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersPaymentMethodsGetResponse200JsonX56b8707f> =
      MediaTypeCodecRegistry.of(getCustomersCustomerPaymentMethodsResponseCodecAlternative0Codec)

  private val getCustomersCustomerPaymentMethodsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerPaymentMethods.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerPaymentMethodsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerPaymentMethodsResponseCodecAlternative1Codec)

  internal val getCustomersCustomerPaymentMethodsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerPaymentMethodsRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERPAYMENTMETHODSPAYMENTMETHOD_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerPaymentMethodsPaymentMethod.request"

  private val getCustomersCustomerPaymentMethodsPaymentMethodRequestCodec:
      MediaTypeCodec<JsonObject?> = GetCustomersCustomerPaymentMethodsPaymentMethodFormCodec

  private val getCustomersCustomerPaymentMethodsPaymentMethodResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentMethod> =
      KotlinxSerializationCodec("GetCustomersCustomerPaymentMethodsPaymentMethod.response.alternative0", PaymentMethod.Serializer, SdkJson)

  internal val getCustomersCustomerPaymentMethodsPaymentMethodResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentMethod> =
      MediaTypeCodecRegistry.of(getCustomersCustomerPaymentMethodsPaymentMethodResponseCodecAlternative0Codec)

  private val getCustomersCustomerPaymentMethodsPaymentMethodResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerPaymentMethodsPaymentMethod.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerPaymentMethodsPaymentMethodResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerPaymentMethodsPaymentMethodResponseCodecAlternative1Codec)

  internal val getCustomersCustomerPaymentMethodsPaymentMethodRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerPaymentMethodsPaymentMethodRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERSOURCES_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerSources.request"

  private val getCustomersCustomerSourcesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerSourcesFormCodec

  private val getCustomersCustomerSourcesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersSourcesGetResponse200JsonX5d75faf9> =
      KotlinxSerializationCodec("GetCustomersCustomerSources.response.alternative0", InlineV1CustomersSourcesGetResponse200JsonX5d75faf9.Serializer, SdkJson)

  internal val getCustomersCustomerSourcesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersSourcesGetResponse200JsonX5d75faf9> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSourcesResponseCodecAlternative0Codec)

  private val getCustomersCustomerSourcesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerSources.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerSourcesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSourcesResponseCodecAlternative1Codec)

  internal val getCustomersCustomerSourcesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getCustomersCustomerSourcesRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERSOURCESID_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerSourcesId.request"

  private val getCustomersCustomerSourcesIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerSourcesIdFormCodec

  private val getCustomersCustomerSourcesIdResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentSource> =
      KotlinxSerializationCodec("GetCustomersCustomerSourcesId.response.alternative0", PaymentSource.Serializer, SdkJson)

  internal val getCustomersCustomerSourcesIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentSource> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSourcesIdResponseCodecAlternative0Codec)

  private val getCustomersCustomerSourcesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerSourcesId.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerSourcesIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSourcesIdResponseCodecAlternative1Codec)

  internal val getCustomersCustomerSourcesIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSourcesIdRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERSUBSCRIPTIONS_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerSubscriptions.request"

  private val getCustomersCustomerSubscriptionsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerSubscriptionsFormCodec

  private val getCustomersCustomerSubscriptionsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersSubscriptionsGetResponse200JsonX7fa17575> =
      KotlinxSerializationCodec("GetCustomersCustomerSubscriptions.response.alternative0", InlineV1CustomersSubscriptionsGetResponse200JsonX7fa17575.Serializer, SdkJson)

  internal val getCustomersCustomerSubscriptionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersSubscriptionsGetResponse200JsonX7fa17575> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSubscriptionsResponseCodecAlternative0Codec)

  private val getCustomersCustomerSubscriptionsResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetCustomersCustomerSubscriptions.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerSubscriptionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSubscriptionsResponseCodecAlternative1Codec)

  internal val getCustomersCustomerSubscriptionsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSubscriptionsRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERSUBSCRIPTIONSSUBSCRIPTIONEXPOSEDID_REQUEST_CODEC_ID: String
      = "GetCustomersCustomerSubscriptionsSubscriptionExposedId.request"

  private val getCustomersCustomerSubscriptionsSubscriptionExposedIdRequestCodec:
      MediaTypeCodec<JsonObject?> = GetCustomersCustomerSubscriptionsSubscriptionExposedIdFormCodec

  private val getCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Codec:
      MediaTypeCodec<Subscription> =
      KotlinxSerializationCodec("GetCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative0", Subscription.Serializer, SdkJson)

  internal val getCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Subscription> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Codec)

  private val getCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Codec)

  internal val getCustomersCustomerSubscriptionsSubscriptionExposedIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSubscriptionsSubscriptionExposedIdRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERSUBSCRIPTIONSSUBSCRIPTIONEXPOSEDIDDISCOUNT_REQUEST_CODEC_ID:
      String = "GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.request"

  private val getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountRequestCodec:
      MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountFormCodec

  private val getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Codec:
      MediaTypeCodec<Discount> =
      KotlinxSerializationCodec("GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative0", Discount.Serializer, SdkJson)

  internal val getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Discount> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Codec)

  private val getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Codec)

  internal val getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERTAXIDS_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerTaxIds.request"

  private val getCustomersCustomerTaxIdsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerTaxIdsFormCodec

  private val getCustomersCustomerTaxIdsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersTaxIdsGetResponse200JsonX122b02ff> =
      KotlinxSerializationCodec("GetCustomersCustomerTaxIds.response.alternative0", InlineV1CustomersTaxIdsGetResponse200JsonX122b02ff.Serializer, SdkJson)

  internal val getCustomersCustomerTaxIdsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersTaxIdsGetResponse200JsonX122b02ff> =
      MediaTypeCodecRegistry.of(getCustomersCustomerTaxIdsResponseCodecAlternative0Codec)

  private val getCustomersCustomerTaxIdsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerTaxIds.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerTaxIdsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerTaxIdsResponseCodecAlternative1Codec)

  internal val getCustomersCustomerTaxIdsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersCustomerTaxIdsRequestCodec)

  internal const val GETCUSTOMERSCUSTOMERTAXIDSID_REQUEST_CODEC_ID: String =
      "GetCustomersCustomerTaxIdsId.request"

  private val getCustomersCustomerTaxIdsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersCustomerTaxIdsIdFormCodec

  private val getCustomersCustomerTaxIdsIdResponseCodecAlternative0Codec: MediaTypeCodec<TaxId> =
      KotlinxSerializationCodec("GetCustomersCustomerTaxIdsId.response.alternative0", TaxId.Serializer, SdkJson)

  internal val getCustomersCustomerTaxIdsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TaxId> =
      MediaTypeCodecRegistry.of(getCustomersCustomerTaxIdsIdResponseCodecAlternative0Codec)

  private val getCustomersCustomerTaxIdsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersCustomerTaxIdsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersCustomerTaxIdsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersCustomerTaxIdsIdResponseCodecAlternative1Codec)

  internal val getCustomersCustomerTaxIdsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getCustomersCustomerTaxIdsIdRequestCodec)

  internal const val GETCUSTOMERSSEARCH_REQUEST_CODEC_ID: String = "GetCustomersSearch.request"

  private val getCustomersSearchRequestCodec: MediaTypeCodec<JsonObject?> =
      GetCustomersSearchFormCodec

  private val getCustomersSearchResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersSearchGetResponse200JsonX6ae66ad5> =
      KotlinxSerializationCodec("GetCustomersSearch.response.alternative0", InlineV1CustomersSearchGetResponse200JsonX6ae66ad5.Serializer, SdkJson)

  internal val getCustomersSearchResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersSearchGetResponse200JsonX6ae66ad5> =
      MediaTypeCodecRegistry.of(getCustomersSearchResponseCodecAlternative0Codec)

  private val getCustomersSearchResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetCustomersSearch.response.alternative1", Error.Serializer, SdkJson)

  internal val getCustomersSearchResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getCustomersSearchResponseCodecAlternative1Codec)

  internal val getCustomersSearchRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getCustomersSearchRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERBALANCETRANSACTIONS_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerBalanceTransactions.request"

  private val postCustomersCustomerBalanceTransactionsRequestCodec:
      MediaTypeCodec<InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d> =
      PostCustomersCustomerBalanceTransactionsFormCodec

  private val postCustomersCustomerBalanceTransactionsResponseCodecAlternative0Codec:
      MediaTypeCodec<CustomerBalanceTransaction> =
      KotlinxSerializationCodec("PostCustomersCustomerBalanceTransactions.response.alternative0", CustomerBalanceTransaction.Serializer, SdkJson)

  internal val postCustomersCustomerBalanceTransactionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CustomerBalanceTransaction> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBalanceTransactionsResponseCodecAlternative0Codec)

  private val postCustomersCustomerBalanceTransactionsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomersCustomerBalanceTransactions.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerBalanceTransactionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBalanceTransactionsResponseCodecAlternative1Codec)

  internal val postCustomersCustomerBalanceTransactionsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBalanceTransactionsRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERBALANCETRANSACTIONSTRANSACTION_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerBalanceTransactionsTransaction.request"

  private val postCustomersCustomerBalanceTransactionsTransactionRequestCodec:
      MediaTypeCodec<InlineV1CustomersBalanceTransactionsPostRequestFormXc8087361?> =
      PostCustomersCustomerBalanceTransactionsTransactionFormCodec

  private val postCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative0Codec:
      MediaTypeCodec<CustomerBalanceTransaction> =
      KotlinxSerializationCodec("PostCustomersCustomerBalanceTransactionsTransaction.response.alternative0", CustomerBalanceTransaction.Serializer, SdkJson)

  internal val postCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CustomerBalanceTransaction> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative0Codec)

  private val postCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomersCustomerBalanceTransactionsTransaction.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative1Codec)

  internal val postCustomersCustomerBalanceTransactionsTransactionRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersBalanceTransactionsPostRequestFormXc8087361?> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBalanceTransactionsTransactionRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERBANKACCOUNTS_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerBankAccounts.request"

  private val postCustomersCustomerBankAccountsRequestCodec:
      MediaTypeCodec<InlineV1CustomersBankAccountsPostRequestFormX18e3bf43?> =
      PostCustomersCustomerBankAccountsFormCodec

  private val postCustomersCustomerBankAccountsResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentSource> =
      KotlinxSerializationCodec("PostCustomersCustomerBankAccounts.response.alternative0", PaymentSource.Serializer, SdkJson)

  internal val postCustomersCustomerBankAccountsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentSource> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBankAccountsResponseCodecAlternative0Codec)

  private val postCustomersCustomerBankAccountsResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostCustomersCustomerBankAccounts.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerBankAccountsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBankAccountsResponseCodecAlternative1Codec)

  internal val postCustomersCustomerBankAccountsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersBankAccountsPostRequestFormX18e3bf43?> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBankAccountsRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERBANKACCOUNTSID_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerBankAccountsId.request"

  private val postCustomersCustomerBankAccountsIdRequestCodec:
      MediaTypeCodec<InlineV1CustomersBankAccountsPostRequestFormX92af665f?> =
      PostCustomersCustomerBankAccountsIdFormCodec

  private val postCustomersCustomerBankAccountsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersBankAccountsPostResponse200JsonXf5372d82> =
      KotlinxSerializationCodec("PostCustomersCustomerBankAccountsId.response.alternative0", InlineV1CustomersBankAccountsPostResponse200JsonXf5372d82.Serializer, SdkJson)

  internal val postCustomersCustomerBankAccountsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersBankAccountsPostResponse200JsonXf5372d82> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBankAccountsIdResponseCodecAlternative0Codec)

  private val postCustomersCustomerBankAccountsIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomersCustomerBankAccountsId.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerBankAccountsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBankAccountsIdResponseCodecAlternative1Codec)

  internal val postCustomersCustomerBankAccountsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersBankAccountsPostRequestFormX92af665f?> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBankAccountsIdRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERBANKACCOUNTSIDVERIFY_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerBankAccountsIdVerify.request"

  private val postCustomersCustomerBankAccountsIdVerifyRequestCodec:
      MediaTypeCodec<InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db?> =
      PostCustomersCustomerBankAccountsIdVerifyFormCodec

  private val postCustomersCustomerBankAccountsIdVerifyResponseCodecAlternative0Codec:
      MediaTypeCodec<BankAccount> =
      KotlinxSerializationCodec("PostCustomersCustomerBankAccountsIdVerify.response.alternative0", BankAccount.Serializer, SdkJson)

  internal val postCustomersCustomerBankAccountsIdVerifyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BankAccount> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBankAccountsIdVerifyResponseCodecAlternative0Codec)

  private val postCustomersCustomerBankAccountsIdVerifyResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomersCustomerBankAccountsIdVerify.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerBankAccountsIdVerifyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBankAccountsIdVerifyResponseCodecAlternative1Codec)

  internal val postCustomersCustomerBankAccountsIdVerifyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db?> =
      MediaTypeCodecRegistry.of(postCustomersCustomerBankAccountsIdVerifyRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERCARDS_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerCards.request"

  private val postCustomersCustomerCardsRequestCodec:
      MediaTypeCodec<InlineV1CustomersCardsPostRequestFormX545a6d22?> =
      PostCustomersCustomerCardsFormCodec

  private val postCustomersCustomerCardsResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentSource> =
      KotlinxSerializationCodec("PostCustomersCustomerCards.response.alternative0", PaymentSource.Serializer, SdkJson)

  internal val postCustomersCustomerCardsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentSource> =
      MediaTypeCodecRegistry.of(postCustomersCustomerCardsResponseCodecAlternative0Codec)

  private val postCustomersCustomerCardsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomersCustomerCards.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerCardsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerCardsResponseCodecAlternative1Codec)

  internal val postCustomersCustomerCardsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersCardsPostRequestFormX545a6d22?> =
      MediaTypeCodecRegistry.of(postCustomersCustomerCardsRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERCARDSID_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerCardsId.request"

  private val postCustomersCustomerCardsIdRequestCodec:
      MediaTypeCodec<InlineV1CustomersCardsPostRequestFormX9790010b?> =
      PostCustomersCustomerCardsIdFormCodec

  private val postCustomersCustomerCardsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersCardsPostResponse200JsonXa7937916> =
      KotlinxSerializationCodec("PostCustomersCustomerCardsId.response.alternative0", InlineV1CustomersCardsPostResponse200JsonXa7937916.Serializer, SdkJson)

  internal val postCustomersCustomerCardsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersCardsPostResponse200JsonXa7937916> =
      MediaTypeCodecRegistry.of(postCustomersCustomerCardsIdResponseCodecAlternative0Codec)

  private val postCustomersCustomerCardsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomersCustomerCardsId.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerCardsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerCardsIdResponseCodecAlternative1Codec)

  internal val postCustomersCustomerCardsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersCardsPostRequestFormX9790010b?> =
      MediaTypeCodecRegistry.of(postCustomersCustomerCardsIdRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERCASHBALANCE_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerCashBalance.request"

  private val postCustomersCustomerCashBalanceRequestCodec:
      MediaTypeCodec<InlineV1CustomersCashBalancePostRequestFormX6eb72ec3?> =
      PostCustomersCustomerCashBalanceFormCodec

  private val postCustomersCustomerCashBalanceResponseCodecAlternative0Codec:
      MediaTypeCodec<CashBalance> =
      KotlinxSerializationCodec("PostCustomersCustomerCashBalance.response.alternative0", CashBalance.Serializer, SdkJson)

  internal val postCustomersCustomerCashBalanceResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CashBalance> =
      MediaTypeCodecRegistry.of(postCustomersCustomerCashBalanceResponseCodecAlternative0Codec)

  private val postCustomersCustomerCashBalanceResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostCustomersCustomerCashBalance.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerCashBalanceResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerCashBalanceResponseCodecAlternative1Codec)

  internal val postCustomersCustomerCashBalanceRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersCashBalancePostRequestFormX6eb72ec3?> =
      MediaTypeCodecRegistry.of(postCustomersCustomerCashBalanceRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERFUNDINGINSTRUCTIONS_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerFundingInstructions.request"

  private val postCustomersCustomerFundingInstructionsRequestCodec:
      MediaTypeCodec<InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3> =
      PostCustomersCustomerFundingInstructionsFormCodec

  private val postCustomersCustomerFundingInstructionsResponseCodecAlternative0Codec:
      MediaTypeCodec<FundingInstructions> =
      KotlinxSerializationCodec("PostCustomersCustomerFundingInstructions.response.alternative0", FundingInstructions.Serializer, SdkJson)

  internal val postCustomersCustomerFundingInstructionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<FundingInstructions> =
      MediaTypeCodecRegistry.of(postCustomersCustomerFundingInstructionsResponseCodecAlternative0Codec)

  private val postCustomersCustomerFundingInstructionsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomersCustomerFundingInstructions.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerFundingInstructionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerFundingInstructionsResponseCodecAlternative1Codec)

  internal val postCustomersCustomerFundingInstructionsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3> =
      MediaTypeCodecRegistry.of(postCustomersCustomerFundingInstructionsRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERSOURCES_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerSources.request"

  private val postCustomersCustomerSourcesRequestCodec:
      MediaTypeCodec<InlineV1CustomersSourcesPostRequestFormX91b8f989?> =
      PostCustomersCustomerSourcesFormCodec

  private val postCustomersCustomerSourcesResponseCodecAlternative0Codec:
      MediaTypeCodec<PaymentSource> =
      KotlinxSerializationCodec("PostCustomersCustomerSources.response.alternative0", PaymentSource.Serializer, SdkJson)

  internal val postCustomersCustomerSourcesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<PaymentSource> =
      MediaTypeCodecRegistry.of(postCustomersCustomerSourcesResponseCodecAlternative0Codec)

  private val postCustomersCustomerSourcesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomersCustomerSources.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerSourcesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerSourcesResponseCodecAlternative1Codec)

  internal val postCustomersCustomerSourcesRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersSourcesPostRequestFormX91b8f989?> =
      MediaTypeCodecRegistry.of(postCustomersCustomerSourcesRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERSOURCESID_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerSourcesId.request"

  private val postCustomersCustomerSourcesIdRequestCodec:
      MediaTypeCodec<InlineV1CustomersSourcesPostRequestFormX2b7e12c1?> =
      PostCustomersCustomerSourcesIdFormCodec

  private val postCustomersCustomerSourcesIdResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1CustomersSourcesPostResponse200JsonX6d2b1d0d> =
      KotlinxSerializationCodec("PostCustomersCustomerSourcesId.response.alternative0", InlineV1CustomersSourcesPostResponse200JsonX6d2b1d0d.Serializer, SdkJson)

  internal val postCustomersCustomerSourcesIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1CustomersSourcesPostResponse200JsonX6d2b1d0d> =
      MediaTypeCodecRegistry.of(postCustomersCustomerSourcesIdResponseCodecAlternative0Codec)

  private val postCustomersCustomerSourcesIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomersCustomerSourcesId.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerSourcesIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerSourcesIdResponseCodecAlternative1Codec)

  internal val postCustomersCustomerSourcesIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersSourcesPostRequestFormX2b7e12c1?> =
      MediaTypeCodecRegistry.of(postCustomersCustomerSourcesIdRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERSOURCESIDVERIFY_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerSourcesIdVerify.request"

  private val postCustomersCustomerSourcesIdVerifyRequestCodec:
      MediaTypeCodec<InlineV1CustomersSourcesVerifyPostRequestFormX329337c2?> =
      PostCustomersCustomerSourcesIdVerifyFormCodec

  private val postCustomersCustomerSourcesIdVerifyResponseCodecAlternative0Codec:
      MediaTypeCodec<BankAccount> =
      KotlinxSerializationCodec("PostCustomersCustomerSourcesIdVerify.response.alternative0", BankAccount.Serializer, SdkJson)

  internal val postCustomersCustomerSourcesIdVerifyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BankAccount> =
      MediaTypeCodecRegistry.of(postCustomersCustomerSourcesIdVerifyResponseCodecAlternative0Codec)

  private val postCustomersCustomerSourcesIdVerifyResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomersCustomerSourcesIdVerify.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerSourcesIdVerifyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerSourcesIdVerifyResponseCodecAlternative1Codec)

  internal val postCustomersCustomerSourcesIdVerifyRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersSourcesVerifyPostRequestFormX329337c2?> =
      MediaTypeCodecRegistry.of(postCustomersCustomerSourcesIdVerifyRequestCodec)

  internal const val POSTCUSTOMERSCUSTOMERTAXIDS_REQUEST_CODEC_ID: String =
      "PostCustomersCustomerTaxIds.request"

  private val postCustomersCustomerTaxIdsRequestCodec:
      MediaTypeCodec<InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc> =
      PostCustomersCustomerTaxIdsFormCodec

  private val postCustomersCustomerTaxIdsResponseCodecAlternative0Codec: MediaTypeCodec<TaxId> =
      KotlinxSerializationCodec("PostCustomersCustomerTaxIds.response.alternative0", TaxId.Serializer, SdkJson)

  internal val postCustomersCustomerTaxIdsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TaxId> =
      MediaTypeCodecRegistry.of(postCustomersCustomerTaxIdsResponseCodecAlternative0Codec)

  private val postCustomersCustomerTaxIdsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostCustomersCustomerTaxIds.response.alternative1", Error.Serializer, SdkJson)

  internal val postCustomersCustomerTaxIdsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postCustomersCustomerTaxIdsResponseCodecAlternative1Codec)

  internal val postCustomersCustomerTaxIdsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc> =
      MediaTypeCodecRegistry.of(postCustomersCustomerTaxIdsRequestCodec)

  internal object DeleteCustomersCustomerFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteCustomersCustomer.request"

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

  internal object DeleteCustomersCustomerBankAccountsIdFormCodec : MediaTypeCodec<InlineV1CustomersBankAccountsDeleteRequestFormX3bf869f9?> {
    override val id: String = "DeleteCustomersCustomerBankAccountsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersBankAccountsDeleteRequestFormX3bf869f9?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersBankAccountsDeleteRequestFormX3bf869f9? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object DeleteCustomersCustomerCardsIdFormCodec : MediaTypeCodec<InlineV1CustomersCardsDeleteRequestFormX02c14333?> {
    override val id: String = "DeleteCustomersCustomerCardsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersCardsDeleteRequestFormX02c14333?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersCardsDeleteRequestFormX02c14333? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object DeleteCustomersCustomerDiscountFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteCustomersCustomerDiscount.request"

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

  internal object DeleteCustomersCustomerSourcesIdFormCodec : MediaTypeCodec<InlineV1CustomersSourcesDeleteRequestFormX1346ee63?> {
    override val id: String = "DeleteCustomersCustomerSourcesId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersSourcesDeleteRequestFormX1346ee63?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersSourcesDeleteRequestFormX1346ee63? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdFormCodec : MediaTypeCodec<InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08?> {
    override val id: String = "DeleteCustomersCustomerSubscriptionsSubscriptionExposedId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08?, mediaType: String): SdkRequestBody {
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
      request.invoiceNow?.let { formValue0 ->
        form.add("invoice_now", formValue0.toString())
      }
      request.prorate?.let { formValue0 ->
        form.add("prorate", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String =
        "DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.request"

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

  internal object DeleteCustomersCustomerTaxIdsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteCustomersCustomerTaxIdsId.request"

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

  internal object GetCustomersFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomers.request"

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

  internal object GetCustomersCustomerFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomer.request"

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

  internal object GetCustomersCustomerBalanceTransactionsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerBalanceTransactions.request"

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

  internal object GetCustomersCustomerBalanceTransactionsTransactionFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerBalanceTransactionsTransaction.request"

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

  internal object GetCustomersCustomerBankAccountsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerBankAccounts.request"

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

  internal object GetCustomersCustomerBankAccountsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerBankAccountsId.request"

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

  internal object GetCustomersCustomerCardsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerCards.request"

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

  internal object GetCustomersCustomerCardsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerCardsId.request"

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

  internal object GetCustomersCustomerCashBalanceFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerCashBalance.request"

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

  internal object GetCustomersCustomerCashBalanceTransactionsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerCashBalanceTransactions.request"

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

  internal object GetCustomersCustomerCashBalanceTransactionsTransactionFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerCashBalanceTransactionsTransaction.request"

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

  internal object GetCustomersCustomerDiscountFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerDiscount.request"

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

  internal object GetCustomersCustomerPaymentMethodsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerPaymentMethods.request"

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

  internal object GetCustomersCustomerPaymentMethodsPaymentMethodFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerPaymentMethodsPaymentMethod.request"

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

  internal object GetCustomersCustomerSourcesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerSources.request"

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

  internal object GetCustomersCustomerSourcesIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerSourcesId.request"

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

  internal object GetCustomersCustomerSubscriptionsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerSubscriptions.request"

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

  internal object GetCustomersCustomerSubscriptionsSubscriptionExposedIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerSubscriptionsSubscriptionExposedId.request"

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

  internal object GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String =
        "GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.request"

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

  internal object GetCustomersCustomerTaxIdsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerTaxIds.request"

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

  internal object GetCustomersCustomerTaxIdsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersCustomerTaxIdsId.request"

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

  internal object GetCustomersSearchFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetCustomersSearch.request"

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

  internal object PostCustomersCustomerBalanceTransactionsFormCodec : MediaTypeCodec<InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d> {
    override val id: String = "PostCustomersCustomerBalanceTransactions.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d, mediaType: String): SdkRequestBody {
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2Xa3df9f8e).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerBalanceTransactionsTransactionFormCodec : MediaTypeCodec<InlineV1CustomersBalanceTransactionsPostRequestFormXc8087361?> {
    override val id: String = "PostCustomersCustomerBalanceTransactionsTransaction.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersBalanceTransactionsPostRequestFormXc8087361?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
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
      request.metadata?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.branch1 != null -> {
            requireNotNull(formValue0.branch1).forEach { (formKey2, formMapValue2) ->
              val formPrimitive2 = formMapValue2 as? JsonPrimitive ?: error("Form map values encoded from a raw JSON object must be JSON primitives")
              form.add("metadata" + "[" + formKey2 + "]", formPrimitive2.content)
            }
          }
          formValue0.inlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1CustomersBalanceTransactionsPostRequestFormMetadataAnyOf2X9e435bb3).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersBalanceTransactionsPostRequestFormXc8087361? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerBankAccountsFormCodec : MediaTypeCodec<InlineV1CustomersBankAccountsPostRequestFormX18e3bf43?> {
    override val id: String = "PostCustomersCustomerBankAccounts.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersBankAccountsPostRequestFormX18e3bf43?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.alipayAccount?.let { formValue0 ->
        form.add("alipay_account", formValue0)
      }
      request.bankAccount?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596 != null -> {
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596).accountHolderName?.let { formValue3 ->
              form.add("bank_account" + "[account_holder_name]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596).accountHolderType?.let { formValue3 ->
              form.add("bank_account" + "[account_holder_type]", formValue3.value)
            }
            form.add("bank_account" + "[account_number]", requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596).accountNumber)
            form.add("bank_account" + "[country]", requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596).country)
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596).currency?.let { formValue3 ->
              form.add("bank_account" + "[currency]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596).objectValue?.let { formValue3 ->
              form.add("bank_account" + "[object]", formValue3.value)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormBankAccountAnyOf1X8ded6596).routingNumber?.let { formValue3 ->
              form.add("bank_account" + "[routing_number]", formValue3)
            }
          }
          formValue0.branch2 != null -> {
            form.add("bank_account", requireNotNull(formValue0.branch2))
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.card?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a != null -> {
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).addressCity?.let { formValue3 ->
              form.add("card" + "[address_city]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).addressCountry?.let { formValue3 ->
              form.add("card" + "[address_country]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).addressLine1?.let { formValue3 ->
              form.add("card" + "[address_line1]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).addressLine2?.let { formValue3 ->
              form.add("card" + "[address_line2]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).addressState?.let { formValue3 ->
              form.add("card" + "[address_state]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).addressZip?.let { formValue3 ->
              form.add("card" + "[address_zip]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).cvc?.let { formValue3 ->
              form.add("card" + "[cvc]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).encrypted?.let { formValue3 ->
              form.add("card" + "[encrypted]", formValue3)
            }
            form.add("card" + "[exp_month]", requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).expMonth.toString())
            form.add("card" + "[exp_year]", requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).expYear.toString())
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).metadata?.let { formValue3 ->
              formValue3.forEach { (formKey4, formMapValue4) ->
                form.add("card" + "[metadata]" + "[" + formKey4 + "]", formMapValue4)
              }
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).name?.let { formValue3 ->
              form.add("card" + "[name]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).networkToken?.let { formValue3 ->
              formValue3.number?.let { formValue5 ->
                form.add("card" + "[network_token]" + "[number]", formValue5)
              }
            }
            form.add("card" + "[number]", requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).number)
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).objectValue?.let { formValue3 ->
              form.add("card" + "[object]", formValue3.value)
            }
            requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormCardAnyOf1Xf394703a).swipeData?.let { formValue3 ->
              form.add("card" + "[swipe_data]", formValue3)
            }
          }
          formValue0.branch2 != null -> {
            form.add("card", requireNotNull(formValue0.branch2))
          }
          else -> {
            error("Form union value has no selected branch")
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
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.source?.let { formValue0 ->
        form.add("source", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersBankAccountsPostRequestFormX18e3bf43? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerBankAccountsIdFormCodec : MediaTypeCodec<InlineV1CustomersBankAccountsPostRequestFormX92af665f?> {
    override val id: String = "PostCustomersCustomerBankAccountsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersBankAccountsPostRequestFormX92af665f?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.accountHolderName?.let { formValue0 ->
        form.add("account_holder_name", formValue0)
      }
      request.accountHolderType?.let { formValue0 ->
        form.add("account_holder_type", formValue0.value)
      }
      request.addressCity?.let { formValue0 ->
        form.add("address_city", formValue0)
      }
      request.addressCountry?.let { formValue0 ->
        form.add("address_country", formValue0)
      }
      request.addressLine1?.let { formValue0 ->
        form.add("address_line1", formValue0)
      }
      request.addressLine2?.let { formValue0 ->
        form.add("address_line2", formValue0)
      }
      request.addressState?.let { formValue0 ->
        form.add("address_state", formValue0)
      }
      request.addressZip?.let { formValue0 ->
        form.add("address_zip", formValue0)
      }
      request.expMonth?.let { formValue0 ->
        form.add("exp_month", formValue0)
      }
      request.expYear?.let { formValue0 ->
        form.add("exp_year", formValue0)
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
          formValue0.inlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1CustomersBankAccountsPostRequestFormMetadataAnyOf2X29e4732c).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      request.owner?.let { formValue0 ->
        formValue0.address?.let { formValue2 ->
          formValue2.city?.let { formValue4 ->
            form.add("owner" + "[address]" + "[city]", formValue4)
          }
          formValue2.country?.let { formValue4 ->
            form.add("owner" + "[address]" + "[country]", formValue4)
          }
          formValue2.line1?.let { formValue4 ->
            form.add("owner" + "[address]" + "[line1]", formValue4)
          }
          formValue2.line2?.let { formValue4 ->
            form.add("owner" + "[address]" + "[line2]", formValue4)
          }
          formValue2.postalCode?.let { formValue4 ->
            form.add("owner" + "[address]" + "[postal_code]", formValue4)
          }
          formValue2.state?.let { formValue4 ->
            form.add("owner" + "[address]" + "[state]", formValue4)
          }
        }
        formValue0.email?.let { formValue2 ->
          form.add("owner" + "[email]", formValue2)
        }
        formValue0.name?.let { formValue2 ->
          form.add("owner" + "[name]", formValue2)
        }
        formValue0.phone?.let { formValue2 ->
          form.add("owner" + "[phone]", formValue2)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersBankAccountsPostRequestFormX92af665f? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerBankAccountsIdVerifyFormCodec : MediaTypeCodec<InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db?> {
    override val id: String = "PostCustomersCustomerBankAccountsIdVerify.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amounts?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("amounts", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("amounts" + "[" + formIndex1 + "]", formElement1.toString())
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
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerCardsFormCodec : MediaTypeCodec<InlineV1CustomersCardsPostRequestFormX545a6d22?> {
    override val id: String = "PostCustomersCustomerCards.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersCardsPostRequestFormX545a6d22?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.alipayAccount?.let { formValue0 ->
        form.add("alipay_account", formValue0)
      }
      request.bankAccount?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a != null -> {
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a).accountHolderName?.let { formValue3 ->
              form.add("bank_account" + "[account_holder_name]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a).accountHolderType?.let { formValue3 ->
              form.add("bank_account" + "[account_holder_type]", formValue3.value)
            }
            form.add("bank_account" + "[account_number]", requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a).accountNumber)
            form.add("bank_account" + "[country]", requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a).country)
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a).currency?.let { formValue3 ->
              form.add("bank_account" + "[currency]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a).objectValue?.let { formValue3 ->
              form.add("bank_account" + "[object]", formValue3.value)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormBankAccountAnyOf1X93f8721a).routingNumber?.let { formValue3 ->
              form.add("bank_account" + "[routing_number]", formValue3)
            }
          }
          formValue0.branch2 != null -> {
            form.add("bank_account", requireNotNull(formValue0.branch2))
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.card?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476 != null -> {
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).addressCity?.let { formValue3 ->
              form.add("card" + "[address_city]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).addressCountry?.let { formValue3 ->
              form.add("card" + "[address_country]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).addressLine1?.let { formValue3 ->
              form.add("card" + "[address_line1]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).addressLine2?.let { formValue3 ->
              form.add("card" + "[address_line2]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).addressState?.let { formValue3 ->
              form.add("card" + "[address_state]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).addressZip?.let { formValue3 ->
              form.add("card" + "[address_zip]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).cvc?.let { formValue3 ->
              form.add("card" + "[cvc]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).encrypted?.let { formValue3 ->
              form.add("card" + "[encrypted]", formValue3)
            }
            form.add("card" + "[exp_month]", requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).expMonth.toString())
            form.add("card" + "[exp_year]", requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).expYear.toString())
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).metadata?.let { formValue3 ->
              formValue3.forEach { (formKey4, formMapValue4) ->
                form.add("card" + "[metadata]" + "[" + formKey4 + "]", formMapValue4)
              }
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).name?.let { formValue3 ->
              form.add("card" + "[name]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).networkToken?.let { formValue3 ->
              formValue3.number?.let { formValue5 ->
                form.add("card" + "[network_token]" + "[number]", formValue5)
              }
            }
            form.add("card" + "[number]", requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).number)
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).objectValue?.let { formValue3 ->
              form.add("card" + "[object]", formValue3.value)
            }
            requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormCardAnyOf1X0e7c1476).swipeData?.let { formValue3 ->
              form.add("card" + "[swipe_data]", formValue3)
            }
          }
          formValue0.branch2 != null -> {
            form.add("card", requireNotNull(formValue0.branch2))
          }
          else -> {
            error("Form union value has no selected branch")
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
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.source?.let { formValue0 ->
        form.add("source", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersCardsPostRequestFormX545a6d22? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerCardsIdFormCodec : MediaTypeCodec<InlineV1CustomersCardsPostRequestFormX9790010b?> {
    override val id: String = "PostCustomersCustomerCardsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersCardsPostRequestFormX9790010b?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.accountHolderName?.let { formValue0 ->
        form.add("account_holder_name", formValue0)
      }
      request.accountHolderType?.let { formValue0 ->
        form.add("account_holder_type", formValue0.value)
      }
      request.addressCity?.let { formValue0 ->
        form.add("address_city", formValue0)
      }
      request.addressCountry?.let { formValue0 ->
        form.add("address_country", formValue0)
      }
      request.addressLine1?.let { formValue0 ->
        form.add("address_line1", formValue0)
      }
      request.addressLine2?.let { formValue0 ->
        form.add("address_line2", formValue0)
      }
      request.addressState?.let { formValue0 ->
        form.add("address_state", formValue0)
      }
      request.addressZip?.let { formValue0 ->
        form.add("address_zip", formValue0)
      }
      request.expMonth?.let { formValue0 ->
        form.add("exp_month", formValue0)
      }
      request.expYear?.let { formValue0 ->
        form.add("exp_year", formValue0)
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
          formValue0.inlineV1CustomersCardsPostRequestFormMetadataAnyOf2Xaf193fa1 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1CustomersCardsPostRequestFormMetadataAnyOf2Xaf193fa1).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      request.owner?.let { formValue0 ->
        formValue0.address?.let { formValue2 ->
          formValue2.city?.let { formValue4 ->
            form.add("owner" + "[address]" + "[city]", formValue4)
          }
          formValue2.country?.let { formValue4 ->
            form.add("owner" + "[address]" + "[country]", formValue4)
          }
          formValue2.line1?.let { formValue4 ->
            form.add("owner" + "[address]" + "[line1]", formValue4)
          }
          formValue2.line2?.let { formValue4 ->
            form.add("owner" + "[address]" + "[line2]", formValue4)
          }
          formValue2.postalCode?.let { formValue4 ->
            form.add("owner" + "[address]" + "[postal_code]", formValue4)
          }
          formValue2.state?.let { formValue4 ->
            form.add("owner" + "[address]" + "[state]", formValue4)
          }
        }
        formValue0.email?.let { formValue2 ->
          form.add("owner" + "[email]", formValue2)
        }
        formValue0.name?.let { formValue2 ->
          form.add("owner" + "[name]", formValue2)
        }
        formValue0.phone?.let { formValue2 ->
          form.add("owner" + "[phone]", formValue2)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersCardsPostRequestFormX9790010b? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerCashBalanceFormCodec : MediaTypeCodec<InlineV1CustomersCashBalancePostRequestFormX6eb72ec3?> {
    override val id: String = "PostCustomersCustomerCashBalance.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersCashBalancePostRequestFormX6eb72ec3?, mediaType: String): SdkRequestBody {
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
      request.settings?.let { formValue0 ->
        formValue0.reconciliationMode?.let { formValue2 ->
          form.add("settings" + "[reconciliation_mode]", formValue2.value)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersCashBalancePostRequestFormX6eb72ec3? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerFundingInstructionsFormCodec : MediaTypeCodec<InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3> {
    override val id: String = "PostCustomersCustomerFundingInstructions.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.bankTransfer.euBankTransfer?.let { formValue1 ->
        form.add("bank_transfer" + "[eu_bank_transfer]" + "[country]", formValue1.country)
      }
      request.bankTransfer.requestedAddressTypes?.let { formValue1 ->
        if (formValue1.isEmpty()) {
          form.add("bank_transfer" + "[requested_address_types]", "")
        } else {
          formValue1.forEachIndexed { formIndex2, formElement2 ->
            form.add("bank_transfer" + "[requested_address_types]" + "[" + formIndex2 + "]", formElement2.value)
          }
        }
      }
      form.add("bank_transfer" + "[type]", request.bankTransfer.type.value)
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
      form.add("funding_type", request.fundingType.value)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerSourcesFormCodec : MediaTypeCodec<InlineV1CustomersSourcesPostRequestFormX91b8f989?> {
    override val id: String = "PostCustomersCustomerSources.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersSourcesPostRequestFormX91b8f989?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.alipayAccount?.let { formValue0 ->
        form.add("alipay_account", formValue0)
      }
      request.bankAccount?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5 != null -> {
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5).accountHolderName?.let { formValue3 ->
              form.add("bank_account" + "[account_holder_name]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5).accountHolderType?.let { formValue3 ->
              form.add("bank_account" + "[account_holder_type]", formValue3.value)
            }
            form.add("bank_account" + "[account_number]", requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5).accountNumber)
            form.add("bank_account" + "[country]", requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5).country)
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5).currency?.let { formValue3 ->
              form.add("bank_account" + "[currency]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5).objectValue?.let { formValue3 ->
              form.add("bank_account" + "[object]", formValue3.value)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormBankAccountAnyOf1X65d8afb5).routingNumber?.let { formValue3 ->
              form.add("bank_account" + "[routing_number]", formValue3)
            }
          }
          formValue0.branch2 != null -> {
            form.add("bank_account", requireNotNull(formValue0.branch2))
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.card?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e != null -> {
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).addressCity?.let { formValue3 ->
              form.add("card" + "[address_city]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).addressCountry?.let { formValue3 ->
              form.add("card" + "[address_country]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).addressLine1?.let { formValue3 ->
              form.add("card" + "[address_line1]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).addressLine2?.let { formValue3 ->
              form.add("card" + "[address_line2]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).addressState?.let { formValue3 ->
              form.add("card" + "[address_state]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).addressZip?.let { formValue3 ->
              form.add("card" + "[address_zip]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).cvc?.let { formValue3 ->
              form.add("card" + "[cvc]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).encrypted?.let { formValue3 ->
              form.add("card" + "[encrypted]", formValue3)
            }
            form.add("card" + "[exp_month]", requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).expMonth.toString())
            form.add("card" + "[exp_year]", requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).expYear.toString())
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).metadata?.let { formValue3 ->
              formValue3.forEach { (formKey4, formMapValue4) ->
                form.add("card" + "[metadata]" + "[" + formKey4 + "]", formMapValue4)
              }
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).name?.let { formValue3 ->
              form.add("card" + "[name]", formValue3)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).networkToken?.let { formValue3 ->
              formValue3.number?.let { formValue5 ->
                form.add("card" + "[network_token]" + "[number]", formValue5)
              }
            }
            form.add("card" + "[number]", requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).number)
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).objectValue?.let { formValue3 ->
              form.add("card" + "[object]", formValue3.value)
            }
            requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormCardAnyOf1Xe829b03e).swipeData?.let { formValue3 ->
              form.add("card" + "[swipe_data]", formValue3)
            }
          }
          formValue0.branch2 != null -> {
            form.add("card", requireNotNull(formValue0.branch2))
          }
          else -> {
            error("Form union value has no selected branch")
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
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      request.source?.let { formValue0 ->
        form.add("source", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersSourcesPostRequestFormX91b8f989? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerSourcesIdFormCodec : MediaTypeCodec<InlineV1CustomersSourcesPostRequestFormX2b7e12c1?> {
    override val id: String = "PostCustomersCustomerSourcesId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersSourcesPostRequestFormX2b7e12c1?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.accountHolderName?.let { formValue0 ->
        form.add("account_holder_name", formValue0)
      }
      request.accountHolderType?.let { formValue0 ->
        form.add("account_holder_type", formValue0.value)
      }
      request.addressCity?.let { formValue0 ->
        form.add("address_city", formValue0)
      }
      request.addressCountry?.let { formValue0 ->
        form.add("address_country", formValue0)
      }
      request.addressLine1?.let { formValue0 ->
        form.add("address_line1", formValue0)
      }
      request.addressLine2?.let { formValue0 ->
        form.add("address_line2", formValue0)
      }
      request.addressState?.let { formValue0 ->
        form.add("address_state", formValue0)
      }
      request.addressZip?.let { formValue0 ->
        form.add("address_zip", formValue0)
      }
      request.expMonth?.let { formValue0 ->
        form.add("exp_month", formValue0)
      }
      request.expYear?.let { formValue0 ->
        form.add("exp_year", formValue0)
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
          formValue0.inlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1CustomersSourcesPostRequestFormMetadataAnyOf2X2fb79299).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      request.owner?.let { formValue0 ->
        formValue0.address?.let { formValue2 ->
          formValue2.city?.let { formValue4 ->
            form.add("owner" + "[address]" + "[city]", formValue4)
          }
          formValue2.country?.let { formValue4 ->
            form.add("owner" + "[address]" + "[country]", formValue4)
          }
          formValue2.line1?.let { formValue4 ->
            form.add("owner" + "[address]" + "[line1]", formValue4)
          }
          formValue2.line2?.let { formValue4 ->
            form.add("owner" + "[address]" + "[line2]", formValue4)
          }
          formValue2.postalCode?.let { formValue4 ->
            form.add("owner" + "[address]" + "[postal_code]", formValue4)
          }
          formValue2.state?.let { formValue4 ->
            form.add("owner" + "[address]" + "[state]", formValue4)
          }
        }
        formValue0.email?.let { formValue2 ->
          form.add("owner" + "[email]", formValue2)
        }
        formValue0.name?.let { formValue2 ->
          form.add("owner" + "[name]", formValue2)
        }
        formValue0.phone?.let { formValue2 ->
          form.add("owner" + "[phone]", formValue2)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersSourcesPostRequestFormX2b7e12c1? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerSourcesIdVerifyFormCodec : MediaTypeCodec<InlineV1CustomersSourcesVerifyPostRequestFormX329337c2?> {
    override val id: String = "PostCustomersCustomerSourcesIdVerify.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersSourcesVerifyPostRequestFormX329337c2?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.amounts?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("amounts", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("amounts" + "[" + formIndex1 + "]", formElement1.toString())
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
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersSourcesVerifyPostRequestFormX329337c2? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostCustomersCustomerTaxIdsFormCodec : MediaTypeCodec<InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc> {
    override val id: String = "PostCustomersCustomerTaxIds.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc, mediaType: String): SdkRequestBody {
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
      form.add("type", request.type.value)
      form.add("value", request.value)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'customers' group of Stripe API.
 */
public class CustomersClient(
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
      SdkExecutor(transport, authentication = this@CustomersClient.authentication)

  /**
   * <p>Permanently deletes a customer. It cannot be undone. Also immediately cancels any active subscriptions on the
   * customer.</p>
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
  public suspend fun deleteCustomersCustomerWithResponse(
    request: JsonObject? = null,
    customer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteCustomersCustomerResponse> = executor.executeWithResponse<JsonObject?, DeleteCustomersCustomerResponse>(SdkExecutionRequest(deleteCustomersCustomerMetadata, baseUri, request, listOf(CustomersCodecs.DELETECUSTOMERSCUSTOMER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
  }), CustomersCodecs.deleteCustomersCustomerRequestCodecRegistry, DeleteCustomersCustomerResponseDecoder, options)

  /**
   * <p>Delete a specified source for a given customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun deleteCustomersCustomerBankAccountsIdWithResponse(
    request: InlineV1CustomersBankAccountsDeleteRequestFormX3bf869f9? = null,
    customer: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteCustomersCustomerBankAccountsIdResponse> = executor.executeWithResponse<InlineV1CustomersBankAccountsDeleteRequestFormX3bf869f9?, DeleteCustomersCustomerBankAccountsIdResponse>(SdkExecutionRequest(deleteCustomersCustomerBankAccountsIdMetadata, baseUri, request, listOf(CustomersCodecs.DELETECUSTOMERSCUSTOMERBANKACCOUNTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), CustomersCodecs.deleteCustomersCustomerBankAccountsIdRequestCodecRegistry, DeleteCustomersCustomerBankAccountsIdResponseDecoder, options)

  /**
   * <p>Delete a specified source for a given customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun deleteCustomersCustomerCardsIdWithResponse(
    request: InlineV1CustomersCardsDeleteRequestFormX02c14333? = null,
    customer: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteCustomersCustomerCardsIdResponse> = executor.executeWithResponse<InlineV1CustomersCardsDeleteRequestFormX02c14333?, DeleteCustomersCustomerCardsIdResponse>(SdkExecutionRequest(deleteCustomersCustomerCardsIdMetadata, baseUri, request, listOf(CustomersCodecs.DELETECUSTOMERSCUSTOMERCARDSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), CustomersCodecs.deleteCustomersCustomerCardsIdRequestCodecRegistry, DeleteCustomersCustomerCardsIdResponseDecoder, options)

  /**
   * <p>Removes the currently applied discount on a customer.</p>
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
  public suspend fun deleteCustomersCustomerDiscountWithResponse(
    request: JsonObject? = null,
    customer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteCustomersCustomerDiscountResponse> = executor.executeWithResponse<JsonObject?, DeleteCustomersCustomerDiscountResponse>(SdkExecutionRequest(deleteCustomersCustomerDiscountMetadata, baseUri, request, listOf(CustomersCodecs.DELETECUSTOMERSCUSTOMERDISCOUNT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
  }), CustomersCodecs.deleteCustomersCustomerDiscountRequestCodecRegistry, DeleteCustomersCustomerDiscountResponseDecoder, options)

  /**
   * <p>Delete a specified source for a given customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun deleteCustomersCustomerSourcesIdWithResponse(
    request: InlineV1CustomersSourcesDeleteRequestFormX1346ee63? = null,
    customer: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteCustomersCustomerSourcesIdResponse> = executor.executeWithResponse<InlineV1CustomersSourcesDeleteRequestFormX1346ee63?, DeleteCustomersCustomerSourcesIdResponse>(SdkExecutionRequest(deleteCustomersCustomerSourcesIdMetadata, baseUri, request, listOf(CustomersCodecs.DELETECUSTOMERSCUSTOMERSOURCESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), CustomersCodecs.deleteCustomersCustomerSourcesIdRequestCodecRegistry, DeleteCustomersCustomerSourcesIdResponseDecoder, options)

  /**
   * <p>Cancels a customer’s subscription. If you set the <code>at_period_end</code> parameter to <code>true</code>, the
   * subscription will remain active until the end of the period, at which point it will be canceled and not renewed.
   * Otherwise, with the default <code>false</code> value, the subscription is terminated immediately. In either case,
   * the customer will not be charged again for the subscription.</p>
   *
   * <p>Note, however, that any pending invoice items that you’ve created will still be charged for at the end of the
   * period, unless manually <a href="/api/invoiceitems/delete">deleted</a>. If you’ve set the subscription to cancel at
   * the end of the period, any pending prorations will also be left in place and collected at the end of the period.
   * But if the subscription is set to cancel immediately, pending prorations will be removed.</p>
   *
   * <p>By default, upon subscription cancellation, Stripe will stop automatic collection of all finalized invoices for
   * the customer. This is intended to prevent unexpected payment attempts after the customer has canceled a
   * subscription. However, you can resume automatic collection of the invoices manually after subscription cancellation
   * to have us proceed. Or, you could check for unpaid invoices before allowing the customer to cancel the subscription
   * at all.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param subscriptionExposedId Wire parameter `subscription_exposed_id`.
   * @param options Execution options.
   */
  public suspend fun deleteCustomersCustomerSubscriptionsSubscriptionExposedIdWithResponse(
    request: InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08? = null,
    customer: String,
    subscriptionExposedId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse> = executor.executeWithResponse<InlineV1CustomersSubscriptionsDeleteRequestFormXb167fc08?, DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse>(SdkExecutionRequest(deleteCustomersCustomerSubscriptionsSubscriptionExposedIdMetadata, baseUri, request, listOf(CustomersCodecs.DELETECUSTOMERSCUSTOMERSUBSCRIPTIONSSUBSCRIPTIONEXPOSEDID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "subscription_exposed_id", values = listOf(subscriptionExposedId.toString())))
  }), CustomersCodecs.deleteCustomersCustomerSubscriptionsSubscriptionExposedIdRequestCodecRegistry, DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponseDecoder, options)

  /**
   * <p>Removes the currently applied discount on a customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param subscriptionExposedId Wire parameter `subscription_exposed_id`.
   * @param options Execution options.
   */
  public suspend fun deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountWithResponse(
    request: JsonObject? = null,
    customer: String,
    subscriptionExposedId: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse> = executor.executeWithResponse<JsonObject?, DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse>(SdkExecutionRequest(deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountMetadata, baseUri, request, listOf(CustomersCodecs.DELETECUSTOMERSCUSTOMERSUBSCRIPTIONSSUBSCRIPTIONEXPOSEDIDDISCOUNT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "subscription_exposed_id", values = listOf(subscriptionExposedId.toString())))
  }), CustomersCodecs.deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountRequestCodecRegistry, DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseDecoder, options)

  /**
   * <p>Deletes an existing <code>tax_id</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun deleteCustomersCustomerTaxIdsIdWithResponse(
    request: JsonObject? = null,
    customer: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteCustomersCustomerTaxIdsIdResponse> = executor.executeWithResponse<JsonObject?, DeleteCustomersCustomerTaxIdsIdResponse>(SdkExecutionRequest(deleteCustomersCustomerTaxIdsIdMetadata, baseUri, request, listOf(CustomersCodecs.DELETECUSTOMERSCUSTOMERTAXIDSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), CustomersCodecs.deleteCustomersCustomerTaxIdsIdRequestCodecRegistry, DeleteCustomersCustomerTaxIdsIdResponseDecoder, options)

  /**
   * <p>Returns a list of your customers. The customers are returned sorted by creation date, with the most recent
   * customers appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return customers that were created during the given date interval.
   * @param email A case-sensitive filter on the list based on the customer's `email` field. The value must be a string.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param testClock Provides a list of customers that are associated with the specified test clock. The response will
   * not include customers with test clocks if this parameter is not set.
   * @param options Execution options.
   */
  public suspend fun getCustomersWithResponse(
    request: JsonObject? = null,
    created: InlineV1CustomersGetParameterX1f9558d2? = null,
    email: String? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    testClock: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersResponse> = executor.executeWithResponse<JsonObject?, GetCustomersResponse>(SdkExecutionRequest(getCustomersMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERS_REQUEST_CODEC_ID), buildList {
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
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "test_clock", values = testClock?.let { listOf(it.toString()) }.orEmpty()))
  }), CustomersCodecs.getCustomersRequestCodecRegistry, GetCustomersResponseDecoder, options)

  /**
   * <p>Retrieves a Customer object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerWithResponse(
    request: JsonObject? = null,
    customer: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerResponse>(SdkExecutionRequest(getCustomersCustomerMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMER_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerRequestCodecRegistry, GetCustomersCustomerResponseDecoder, options)

  /**
   * <p>Returns a list of transactions that updated the customer’s <a
   * href="/docs/billing/customer/balance">balances</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param created Only return customer balance transactions that were created during the given date interval.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param invoice Only return transactions that are related to the specified invoice.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerBalanceTransactionsWithResponse(
    request: JsonObject? = null,
    customer: String,
    created: InlineV1CustomersBalanceTransactionsGetParameterX2d624a4a? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    invoice: String? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerBalanceTransactionsResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerBalanceTransactionsResponse>(SdkExecutionRequest(getCustomersCustomerBalanceTransactionsMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERBALANCETRANSACTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "created", values = created?.let { value ->
    val primitive = value.raw as? JsonPrimitive ?: error("Stripe-compatible deepObject scalar fallback requires a JSON primitive value")
    listOf(primitive.content)
    }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "invoice", values = invoice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), CustomersCodecs.getCustomersCustomerBalanceTransactionsRequestCodecRegistry, GetCustomersCustomerBalanceTransactionsResponseDecoder, options)

  /**
   * <p>Retrieves a specific customer balance transaction that updated the customer’s <a
   * href="/docs/billing/customer/balance">balances</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param transaction Wire parameter `transaction`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerBalanceTransactionsTransactionWithResponse(
    request: JsonObject? = null,
    customer: String,
    transaction: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerBalanceTransactionsTransactionResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerBalanceTransactionsTransactionResponse>(SdkExecutionRequest(getCustomersCustomerBalanceTransactionsTransactionMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERBALANCETRANSACTIONSTRANSACTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transaction", values = listOf(transaction.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerBalanceTransactionsTransactionRequestCodecRegistry, GetCustomersCustomerBalanceTransactionsTransactionResponseDecoder, options)

  /**
   * <p>You can see a list of the bank accounts belonging to a Customer. Note that the 10 most recent sources are always
   * available by default on the Customer. If you need more than those 10, you can use this API method and the
   * <code>limit</code> and <code>starting_after</code> parameters to page through additional bank accounts.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
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
  public suspend fun getCustomersCustomerBankAccountsWithResponse(
    request: JsonObject? = null,
    customer: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerBankAccountsResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerBankAccountsResponse>(SdkExecutionRequest(getCustomersCustomerBankAccountsMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERBANKACCOUNTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), CustomersCodecs.getCustomersCustomerBankAccountsRequestCodecRegistry, GetCustomersCustomerBankAccountsResponseDecoder, options)

  /**
   * <p>By default, you can see the 10 most recent sources stored on a Customer directly on the object, but you can also
   * retrieve details about a specific bank account stored on the Stripe account.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerBankAccountsIdWithResponse(
    request: JsonObject? = null,
    customer: String,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerBankAccountsIdResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerBankAccountsIdResponse>(SdkExecutionRequest(getCustomersCustomerBankAccountsIdMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERBANKACCOUNTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerBankAccountsIdRequestCodecRegistry, GetCustomersCustomerBankAccountsIdResponseDecoder, options)

  /**
   * <p>You can see a list of the cards belonging to a customer.
   * Note that the 10 most recent sources are always available on the <code>Customer</code> object.
   * If you need more than those 10, you can use this API method and the <code>limit</code> and
   * <code>starting_after</code> parameters to page through additional cards.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
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
  public suspend fun getCustomersCustomerCardsWithResponse(
    request: JsonObject? = null,
    customer: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerCardsResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerCardsResponse>(SdkExecutionRequest(getCustomersCustomerCardsMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERCARDS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), CustomersCodecs.getCustomersCustomerCardsRequestCodecRegistry, GetCustomersCustomerCardsResponseDecoder, options)

  /**
   * <p>You can always see the 10 most recent cards directly on a customer; this method lets you retrieve details about
   * a specific card stored on the customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerCardsIdWithResponse(
    request: JsonObject? = null,
    customer: String,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerCardsIdResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerCardsIdResponse>(SdkExecutionRequest(getCustomersCustomerCardsIdMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERCARDSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerCardsIdRequestCodecRegistry, GetCustomersCustomerCardsIdResponseDecoder, options)

  /**
   * <p>Retrieves a customer’s cash balance.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerCashBalanceWithResponse(
    request: JsonObject? = null,
    customer: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerCashBalanceResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerCashBalanceResponse>(SdkExecutionRequest(getCustomersCustomerCashBalanceMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERCASHBALANCE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerCashBalanceRequestCodecRegistry, GetCustomersCustomerCashBalanceResponseDecoder, options)

  /**
   * <p>Returns a list of transactions that modified the customer’s <a href="/docs/payments/customer-balance">cash
   * balance</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
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
  public suspend fun getCustomersCustomerCashBalanceTransactionsWithResponse(
    request: JsonObject? = null,
    customer: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerCashBalanceTransactionsResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerCashBalanceTransactionsResponse>(SdkExecutionRequest(getCustomersCustomerCashBalanceTransactionsMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERCASHBALANCETRANSACTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), CustomersCodecs.getCustomersCustomerCashBalanceTransactionsRequestCodecRegistry, GetCustomersCustomerCashBalanceTransactionsResponseDecoder, options)

  /**
   * <p>Retrieves a specific cash balance transaction, which updated the customer’s <a
   * href="/docs/payments/customer-balance">cash balance</a>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param transaction Wire parameter `transaction`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerCashBalanceTransactionsTransactionWithResponse(
    request: JsonObject? = null,
    customer: String,
    transaction: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerCashBalanceTransactionsTransactionResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerCashBalanceTransactionsTransactionResponse>(SdkExecutionRequest(getCustomersCustomerCashBalanceTransactionsTransactionMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERCASHBALANCETRANSACTIONSTRANSACTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transaction", values = listOf(transaction.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerCashBalanceTransactionsTransactionRequestCodecRegistry, GetCustomersCustomerCashBalanceTransactionsTransactionResponseDecoder, options)

  /**
   *
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerDiscountWithResponse(
    request: JsonObject? = null,
    customer: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerDiscountResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerDiscountResponse>(SdkExecutionRequest(getCustomersCustomerDiscountMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERDISCOUNT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerDiscountRequestCodecRegistry, GetCustomersCustomerDiscountResponseDecoder, options)

  /**
   * <p>Returns a list of PaymentMethods for a given Customer</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param allowRedisplay This field indicates whether this payment method can be shown again to its customer in a
   * checkout flow. Stripe products such as Checkout and Elements use this field to determine whether a payment method
   * can be shown as a saved payment method in a checkout flow.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param type An optional filter on the list, based on the object `type` field. Without the filter, the list includes
   * all current and future payment method types. If your integration expects only one type of payment method in the
   * response, make sure to provide a type value in the request.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerPaymentMethodsWithResponse(
    request: JsonObject? = null,
    customer: String,
    allowRedisplay: InlineV1CustomersPaymentMethodsGetParameterXcdd88ad7? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    type: InlineV1CustomersPaymentMethodsGetParameterXf511dd8f? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerPaymentMethodsResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerPaymentMethodsResponse>(SdkExecutionRequest(getCustomersCustomerPaymentMethodsMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERPAYMENTMETHODS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "allow_redisplay", values = allowRedisplay?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "type", values = type?.let { listOf(it.toString()) }.orEmpty()))
  }), CustomersCodecs.getCustomersCustomerPaymentMethodsRequestCodecRegistry, GetCustomersCustomerPaymentMethodsResponseDecoder, options)

  /**
   * <p>Retrieves a PaymentMethod object for a given Customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param paymentMethod Wire parameter `payment_method`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerPaymentMethodsPaymentMethodWithResponse(
    request: JsonObject? = null,
    customer: String,
    paymentMethod: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerPaymentMethodsPaymentMethodResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerPaymentMethodsPaymentMethodResponse>(SdkExecutionRequest(getCustomersCustomerPaymentMethodsPaymentMethodMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERPAYMENTMETHODSPAYMENTMETHOD_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "payment_method", values = listOf(paymentMethod.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerPaymentMethodsPaymentMethodRequestCodecRegistry, GetCustomersCustomerPaymentMethodsPaymentMethodResponseDecoder, options)

  /**
   * <p>List sources for a specified customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param objectValue Filter sources according to a particular object type.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerSourcesWithResponse(
    request: JsonObject? = null,
    customer: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    objectValue: String? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerSourcesResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerSourcesResponse>(SdkExecutionRequest(getCustomersCustomerSourcesMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERSOURCES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "object", values = objectValue?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), CustomersCodecs.getCustomersCustomerSourcesRequestCodecRegistry, GetCustomersCustomerSourcesResponseDecoder, options)

  /**
   * <p>Retrieve a specified source for a given customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerSourcesIdWithResponse(
    request: JsonObject? = null,
    customer: String,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerSourcesIdResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerSourcesIdResponse>(SdkExecutionRequest(getCustomersCustomerSourcesIdMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERSOURCESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerSourcesIdRequestCodecRegistry, GetCustomersCustomerSourcesIdResponseDecoder, options)

  /**
   * <p>You can see a list of the customer’s active subscriptions. Note that the 10 most recent active subscriptions are
   * always available by default on the customer object. If you need more than those 10, you can use the limit and
   * starting_after parameters to page through additional subscriptions.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
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
  public suspend fun getCustomersCustomerSubscriptionsWithResponse(
    request: JsonObject? = null,
    customer: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerSubscriptionsResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerSubscriptionsResponse>(SdkExecutionRequest(getCustomersCustomerSubscriptionsMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERSUBSCRIPTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), CustomersCodecs.getCustomersCustomerSubscriptionsRequestCodecRegistry, GetCustomersCustomerSubscriptionsResponseDecoder, options)

  /**
   * <p>Retrieves the subscription with the given ID.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param subscriptionExposedId Wire parameter `subscription_exposed_id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerSubscriptionsSubscriptionExposedIdWithResponse(
    request: JsonObject? = null,
    customer: String,
    subscriptionExposedId: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse>(SdkExecutionRequest(getCustomersCustomerSubscriptionsSubscriptionExposedIdMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERSUBSCRIPTIONSSUBSCRIPTIONEXPOSEDID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "subscription_exposed_id", values = listOf(subscriptionExposedId.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerSubscriptionsSubscriptionExposedIdRequestCodecRegistry, GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponseDecoder, options)

  /**
   *
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param subscriptionExposedId Wire parameter `subscription_exposed_id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountWithResponse(
    request: JsonObject? = null,
    customer: String,
    subscriptionExposedId: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse>(SdkExecutionRequest(getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERSUBSCRIPTIONSSUBSCRIPTIONEXPOSEDIDDISCOUNT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "subscription_exposed_id", values = listOf(subscriptionExposedId.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountRequestCodecRegistry, GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseDecoder, options)

  /**
   * <p>Returns a list of tax IDs for a customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
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
  public suspend fun getCustomersCustomerTaxIdsWithResponse(
    request: JsonObject? = null,
    customer: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerTaxIdsResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerTaxIdsResponse>(SdkExecutionRequest(getCustomersCustomerTaxIdsMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERTAXIDS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), CustomersCodecs.getCustomersCustomerTaxIdsRequestCodecRegistry, GetCustomersCustomerTaxIdsResponseDecoder, options)

  /**
   * <p>Retrieves the <code>tax_id</code> object with the given identifier.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getCustomersCustomerTaxIdsIdWithResponse(
    request: JsonObject? = null,
    customer: String,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersCustomerTaxIdsIdResponse> = executor.executeWithResponse<JsonObject?, GetCustomersCustomerTaxIdsIdResponse>(SdkExecutionRequest(getCustomersCustomerTaxIdsIdMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSCUSTOMERTAXIDSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), CustomersCodecs.getCustomersCustomerTaxIdsIdRequestCodecRegistry, GetCustomersCustomerTaxIdsIdResponseDecoder, options)

  /**
   * <p>Search for customers you’ve previously created using Stripe’s <a
   * href="/docs/search#search-query-language">Search Query Language</a>.
   * Don’t use search in read-after-write flows where strict consistency is necessary. Under normal operating
   * conditions, data is searchable in less than a minute. Occasionally, propagation of new or updated data can be up
   * to an hour behind during outages. Search functionality is not available to merchants in India.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param page A cursor for pagination across multiple pages of results. Don't include this parameter on the first
   * call. Use the next_page value returned in a previous response to request subsequent results.
   * @param query The search query string. See [search query
   * language](https://docs.stripe.com/search#search-query-language) and the list of supported [query fields for
   * customers](https://docs.stripe.com/search#query-fields-for-customers).
   * @param options Execution options.
   */
  public suspend fun getCustomersSearchWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    page: String? = null,
    query: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetCustomersSearchResponse> = executor.executeWithResponse<JsonObject?, GetCustomersSearchResponse>(SdkExecutionRequest(getCustomersSearchMetadata, baseUri, request, listOf(CustomersCodecs.GETCUSTOMERSSEARCH_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "query", values = listOf(query.toString())))
  }), CustomersCodecs.getCustomersSearchRequestCodecRegistry, GetCustomersSearchResponseDecoder, options)

  /**
   * <p>Creates an immutable transaction that updates the customer’s credit <a
   * href="/docs/billing/customer/balance">balance</a>.</p>
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
  public suspend fun postCustomersCustomerBalanceTransactionsWithResponse(
    request: InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d,
    customer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerBalanceTransactionsResponse> = executor.executeWithResponse<InlineV1CustomersBalanceTransactionsPostRequestFormX635abb1d, PostCustomersCustomerBalanceTransactionsResponse>(SdkExecutionRequest(postCustomersCustomerBalanceTransactionsMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERBALANCETRANSACTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
  }), CustomersCodecs.postCustomersCustomerBalanceTransactionsRequestCodecRegistry, PostCustomersCustomerBalanceTransactionsResponseDecoder, options)

  /**
   * <p>Most credit balance transaction fields are immutable, but you may update its <code>description</code> and
   * <code>metadata</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param transaction Wire parameter `transaction`.
   * @param options Execution options.
   */
  public suspend fun postCustomersCustomerBalanceTransactionsTransactionWithResponse(
    request: InlineV1CustomersBalanceTransactionsPostRequestFormXc8087361? = null,
    customer: String,
    transaction: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerBalanceTransactionsTransactionResponse> = executor.executeWithResponse<InlineV1CustomersBalanceTransactionsPostRequestFormXc8087361?, PostCustomersCustomerBalanceTransactionsTransactionResponse>(SdkExecutionRequest(postCustomersCustomerBalanceTransactionsTransactionMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERBALANCETRANSACTIONSTRANSACTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transaction", values = listOf(transaction.toString())))
  }), CustomersCodecs.postCustomersCustomerBalanceTransactionsTransactionRequestCodecRegistry, PostCustomersCustomerBalanceTransactionsTransactionResponseDecoder, options)

  /**
   * <p>When you create a new credit card, you must specify a customer or recipient on which to create it.</p>
   *
   * <p>If the card’s owner has no default card, then the new card will become the default.
   * However, if the owner already has a default, then it will not change.
   * To change the default, you should <a href="/api/customers/update">update the customer</a> to have a new
   * <code>default_source</code>.</p>
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
  public suspend fun postCustomersCustomerBankAccountsWithResponse(
    request: InlineV1CustomersBankAccountsPostRequestFormX18e3bf43? = null,
    customer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerBankAccountsResponse> = executor.executeWithResponse<InlineV1CustomersBankAccountsPostRequestFormX18e3bf43?, PostCustomersCustomerBankAccountsResponse>(SdkExecutionRequest(postCustomersCustomerBankAccountsMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERBANKACCOUNTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
  }), CustomersCodecs.postCustomersCustomerBankAccountsRequestCodecRegistry, PostCustomersCustomerBankAccountsResponseDecoder, options)

  /**
   * <p>Update a specified source for a given customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postCustomersCustomerBankAccountsIdWithResponse(
    request: InlineV1CustomersBankAccountsPostRequestFormX92af665f? = null,
    customer: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerBankAccountsIdResponse> = executor.executeWithResponse<InlineV1CustomersBankAccountsPostRequestFormX92af665f?, PostCustomersCustomerBankAccountsIdResponse>(SdkExecutionRequest(postCustomersCustomerBankAccountsIdMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERBANKACCOUNTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), CustomersCodecs.postCustomersCustomerBankAccountsIdRequestCodecRegistry, PostCustomersCustomerBankAccountsIdResponseDecoder, options)

  /**
   * <p>Verify a specified bank account for a given customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postCustomersCustomerBankAccountsIdVerifyWithResponse(
    request: InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db? = null,
    customer: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerBankAccountsIdVerifyResponse> = executor.executeWithResponse<InlineV1CustomersBankAccountsVerifyPostRequestFormXec8066db?, PostCustomersCustomerBankAccountsIdVerifyResponse>(SdkExecutionRequest(postCustomersCustomerBankAccountsIdVerifyMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERBANKACCOUNTSIDVERIFY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), CustomersCodecs.postCustomersCustomerBankAccountsIdVerifyRequestCodecRegistry, PostCustomersCustomerBankAccountsIdVerifyResponseDecoder, options)

  /**
   * <p>When you create a new credit card, you must specify a customer or recipient on which to create it.</p>
   *
   * <p>If the card’s owner has no default card, then the new card will become the default.
   * However, if the owner already has a default, then it will not change.
   * To change the default, you should <a href="/api/customers/update">update the customer</a> to have a new
   * <code>default_source</code>.</p>
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
  public suspend fun postCustomersCustomerCardsWithResponse(
    request: InlineV1CustomersCardsPostRequestFormX545a6d22? = null,
    customer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerCardsResponse> = executor.executeWithResponse<InlineV1CustomersCardsPostRequestFormX545a6d22?, PostCustomersCustomerCardsResponse>(SdkExecutionRequest(postCustomersCustomerCardsMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERCARDS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
  }), CustomersCodecs.postCustomersCustomerCardsRequestCodecRegistry, PostCustomersCustomerCardsResponseDecoder, options)

  /**
   * <p>Update a specified source for a given customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postCustomersCustomerCardsIdWithResponse(
    request: InlineV1CustomersCardsPostRequestFormX9790010b? = null,
    customer: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerCardsIdResponse> = executor.executeWithResponse<InlineV1CustomersCardsPostRequestFormX9790010b?, PostCustomersCustomerCardsIdResponse>(SdkExecutionRequest(postCustomersCustomerCardsIdMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERCARDSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), CustomersCodecs.postCustomersCustomerCardsIdRequestCodecRegistry, PostCustomersCustomerCardsIdResponseDecoder, options)

  /**
   * <p>Changes the settings on a customer’s cash balance.</p>
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
  public suspend fun postCustomersCustomerCashBalanceWithResponse(
    request: InlineV1CustomersCashBalancePostRequestFormX6eb72ec3? = null,
    customer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerCashBalanceResponse> = executor.executeWithResponse<InlineV1CustomersCashBalancePostRequestFormX6eb72ec3?, PostCustomersCustomerCashBalanceResponse>(SdkExecutionRequest(postCustomersCustomerCashBalanceMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERCASHBALANCE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
  }), CustomersCodecs.postCustomersCustomerCashBalanceRequestCodecRegistry, PostCustomersCustomerCashBalanceResponseDecoder, options)

  /**
   * <p>Retrieve funding instructions for a customer cash balance. If funding instructions do not yet exist for the
   * customer, new
   * funding instructions will be created. If funding instructions have already been created for a given customer, the
   * same
   * funding instructions will be retrieved. In other words, we will return the same funding instructions each time.</p>
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
  public suspend fun postCustomersCustomerFundingInstructionsWithResponse(
    request: InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3,
    customer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerFundingInstructionsResponse> = executor.executeWithResponse<InlineV1CustomersFundingInstructionsPostRequestFormXfdc747a3, PostCustomersCustomerFundingInstructionsResponse>(SdkExecutionRequest(postCustomersCustomerFundingInstructionsMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERFUNDINGINSTRUCTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
  }), CustomersCodecs.postCustomersCustomerFundingInstructionsRequestCodecRegistry, PostCustomersCustomerFundingInstructionsResponseDecoder, options)

  /**
   * <p>When you create a new credit card, you must specify a customer or recipient on which to create it.</p>
   *
   * <p>If the card’s owner has no default card, then the new card will become the default.
   * However, if the owner already has a default, then it will not change.
   * To change the default, you should <a href="/api/customers/update">update the customer</a> to have a new
   * <code>default_source</code>.</p>
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
  public suspend fun postCustomersCustomerSourcesWithResponse(
    request: InlineV1CustomersSourcesPostRequestFormX91b8f989? = null,
    customer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerSourcesResponse> = executor.executeWithResponse<InlineV1CustomersSourcesPostRequestFormX91b8f989?, PostCustomersCustomerSourcesResponse>(SdkExecutionRequest(postCustomersCustomerSourcesMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERSOURCES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
  }), CustomersCodecs.postCustomersCustomerSourcesRequestCodecRegistry, PostCustomersCustomerSourcesResponseDecoder, options)

  /**
   * <p>Update a specified source for a given customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postCustomersCustomerSourcesIdWithResponse(
    request: InlineV1CustomersSourcesPostRequestFormX2b7e12c1? = null,
    customer: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerSourcesIdResponse> = executor.executeWithResponse<InlineV1CustomersSourcesPostRequestFormX2b7e12c1?, PostCustomersCustomerSourcesIdResponse>(SdkExecutionRequest(postCustomersCustomerSourcesIdMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERSOURCESID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), CustomersCodecs.postCustomersCustomerSourcesIdRequestCodecRegistry, PostCustomersCustomerSourcesIdResponseDecoder, options)

  /**
   * <p>Verify a specified bank account for a given customer.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param customer Wire parameter `customer`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postCustomersCustomerSourcesIdVerifyWithResponse(
    request: InlineV1CustomersSourcesVerifyPostRequestFormX329337c2? = null,
    customer: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerSourcesIdVerifyResponse> = executor.executeWithResponse<InlineV1CustomersSourcesVerifyPostRequestFormX329337c2?, PostCustomersCustomerSourcesIdVerifyResponse>(SdkExecutionRequest(postCustomersCustomerSourcesIdVerifyMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERSOURCESIDVERIFY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), CustomersCodecs.postCustomersCustomerSourcesIdVerifyRequestCodecRegistry, PostCustomersCustomerSourcesIdVerifyResponseDecoder, options)

  /**
   * <p>Creates a new <code>tax_id</code> object for a customer.</p>
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
  public suspend fun postCustomersCustomerTaxIdsWithResponse(
    request: InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc,
    customer: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostCustomersCustomerTaxIdsResponse> = executor.executeWithResponse<InlineV1CustomersTaxIdsPostRequestFormX03c5a0dc, PostCustomersCustomerTaxIdsResponse>(SdkExecutionRequest(postCustomersCustomerTaxIdsMetadata, baseUri, request, listOf(CustomersCodecs.POSTCUSTOMERSCUSTOMERTAXIDS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "customer", values = listOf(customer.toString())))
  }), CustomersCodecs.postCustomersCustomerTaxIdsRequestCodecRegistry, PostCustomersCustomerTaxIdsResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteCustomersCustomer`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface DeleteCustomersCustomerResponse {
    public class SuccessJson(
      public val json: DeletedCustomer,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerResponse
  }

  private object DeleteCustomersCustomerResponseDecoder : SdkResponseAlternativeDecoder<DeleteCustomersCustomerResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteCustomersCustomerResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteCustomersCustomerResponse> = when {
      alternative.id == "DeleteCustomersCustomer.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerResponse.SuccessJson(
          json = CustomersCodecs.deleteCustomersCustomerResponseCodecAlternative0Registry.select(listOf("DeleteCustomersCustomer.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteCustomersCustomer.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerResponse.DefaultJson(
          json = CustomersCodecs.deleteCustomersCustomerResponseCodecAlternative1Registry.select(listOf("DeleteCustomersCustomer.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteCustomersCustomerResponse = DeleteCustomersCustomerResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteCustomersCustomerBankAccountsId`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface DeleteCustomersCustomerBankAccountsIdResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersBankAccountsDeleteResponse200JsonXa03131e2,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerBankAccountsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerBankAccountsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerBankAccountsIdResponse
  }

  private object DeleteCustomersCustomerBankAccountsIdResponseDecoder : SdkResponseAlternativeDecoder<DeleteCustomersCustomerBankAccountsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteCustomersCustomerBankAccountsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteCustomersCustomerBankAccountsIdResponse> = when {
      alternative.id == "DeleteCustomersCustomerBankAccountsId.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerBankAccountsIdResponse.SuccessJson(
          json = CustomersCodecs.deleteCustomersCustomerBankAccountsIdResponseCodecAlternative0Registry.select(listOf("DeleteCustomersCustomerBankAccountsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteCustomersCustomerBankAccountsId.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerBankAccountsIdResponse.DefaultJson(
          json = CustomersCodecs.deleteCustomersCustomerBankAccountsIdResponseCodecAlternative1Registry.select(listOf("DeleteCustomersCustomerBankAccountsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteCustomersCustomerBankAccountsIdResponse = DeleteCustomersCustomerBankAccountsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteCustomersCustomerCardsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteCustomersCustomerCardsIdResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerCardsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerCardsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerCardsIdResponse
  }

  private object DeleteCustomersCustomerCardsIdResponseDecoder : SdkResponseAlternativeDecoder<DeleteCustomersCustomerCardsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteCustomersCustomerCardsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteCustomersCustomerCardsIdResponse> = when {
      alternative.id == "DeleteCustomersCustomerCardsId.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerCardsIdResponse.SuccessJson(
          json = CustomersCodecs.deleteCustomersCustomerCardsIdResponseCodecAlternative0Registry.select(listOf("DeleteCustomersCustomerCardsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteCustomersCustomerCardsId.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerCardsIdResponse.DefaultJson(
          json = CustomersCodecs.deleteCustomersCustomerCardsIdResponseCodecAlternative1Registry.select(listOf("DeleteCustomersCustomerCardsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteCustomersCustomerCardsIdResponse = DeleteCustomersCustomerCardsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteCustomersCustomerDiscount`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteCustomersCustomerDiscountResponse {
    public class SuccessJson(
      public val json: DeletedDiscount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerDiscountResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerDiscountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerDiscountResponse
  }

  private object DeleteCustomersCustomerDiscountResponseDecoder : SdkResponseAlternativeDecoder<DeleteCustomersCustomerDiscountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteCustomersCustomerDiscountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteCustomersCustomerDiscountResponse> = when {
      alternative.id == "DeleteCustomersCustomerDiscount.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerDiscountResponse.SuccessJson(
          json = CustomersCodecs.deleteCustomersCustomerDiscountResponseCodecAlternative0Registry.select(listOf("DeleteCustomersCustomerDiscount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteCustomersCustomerDiscount.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerDiscountResponse.DefaultJson(
          json = CustomersCodecs.deleteCustomersCustomerDiscountResponseCodecAlternative1Registry.select(listOf("DeleteCustomersCustomerDiscount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteCustomersCustomerDiscountResponse = DeleteCustomersCustomerDiscountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteCustomersCustomerSourcesId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteCustomersCustomerSourcesIdResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersSourcesDeleteResponse200JsonXf22f4818,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerSourcesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerSourcesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerSourcesIdResponse
  }

  private object DeleteCustomersCustomerSourcesIdResponseDecoder : SdkResponseAlternativeDecoder<DeleteCustomersCustomerSourcesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteCustomersCustomerSourcesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteCustomersCustomerSourcesIdResponse> = when {
      alternative.id == "DeleteCustomersCustomerSourcesId.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerSourcesIdResponse.SuccessJson(
          json = CustomersCodecs.deleteCustomersCustomerSourcesIdResponseCodecAlternative0Registry.select(listOf("DeleteCustomersCustomerSourcesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteCustomersCustomerSourcesId.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerSourcesIdResponse.DefaultJson(
          json = CustomersCodecs.deleteCustomersCustomerSourcesIdResponseCodecAlternative1Registry.select(listOf("DeleteCustomersCustomerSourcesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteCustomersCustomerSourcesIdResponse = DeleteCustomersCustomerSourcesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteCustomersCustomerSubscriptionsSubscriptionExposedId`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse {
    public class SuccessJson(
      public val json: Subscription,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse
  }

  private object DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponseDecoder : SdkResponseAlternativeDecoder<DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse> = when {
      alternative.id == "DeleteCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse.SuccessJson(
          json = CustomersCodecs.deleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Registry.select(listOf("DeleteCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse.DefaultJson(
          json = CustomersCodecs.deleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Registry.select(listOf("DeleteCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse = DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse {
    public class SuccessJson(
      public val json: DeletedDiscount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse
  }

  private object DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseDecoder : SdkResponseAlternativeDecoder<DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse> = when {
      alternative.id == "DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse.SuccessJson(
          json = CustomersCodecs.deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Registry.select(listOf("DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse.DefaultJson(
          json = CustomersCodecs.deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Registry.select(listOf("DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse = DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteCustomersCustomerTaxIdsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteCustomersCustomerTaxIdsIdResponse {
    public class SuccessJson(
      public val json: DeletedTaxId,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerTaxIdsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerTaxIdsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteCustomersCustomerTaxIdsIdResponse
  }

  private object DeleteCustomersCustomerTaxIdsIdResponseDecoder : SdkResponseAlternativeDecoder<DeleteCustomersCustomerTaxIdsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteCustomersCustomerTaxIdsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteCustomersCustomerTaxIdsIdResponse> = when {
      alternative.id == "DeleteCustomersCustomerTaxIdsId.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerTaxIdsIdResponse.SuccessJson(
          json = CustomersCodecs.deleteCustomersCustomerTaxIdsIdResponseCodecAlternative0Registry.select(listOf("DeleteCustomersCustomerTaxIdsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteCustomersCustomerTaxIdsId.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteCustomersCustomerTaxIdsIdResponse.DefaultJson(
          json = CustomersCodecs.deleteCustomersCustomerTaxIdsIdResponseCodecAlternative1Registry.select(listOf("DeleteCustomersCustomerTaxIdsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteCustomersCustomerTaxIdsIdResponse = DeleteCustomersCustomerTaxIdsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomers`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetCustomersResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersGetResponse200JsonX44b62b7d,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersResponse
  }

  private object GetCustomersResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersResponse> = when {
      alternative.id == "GetCustomers.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersResponse.SuccessJson(
          json = CustomersCodecs.getCustomersResponseCodecAlternative0Registry.select(listOf("GetCustomers.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomers.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersResponse.DefaultJson(
          json = CustomersCodecs.getCustomersResponseCodecAlternative1Registry.select(listOf("GetCustomers.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersResponse = GetCustomersResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomer`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetCustomersCustomerResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersGetResponse200JsonX874ee250,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerResponse
  }

  private object GetCustomersCustomerResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerResponse> = when {
      alternative.id == "GetCustomersCustomer.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomer.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomer.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomer.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerResponse = GetCustomersCustomerResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerBalanceTransactions`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetCustomersCustomerBalanceTransactionsResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersBalanceTransactionsGetResponse200JsonX861e0ca6,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBalanceTransactionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBalanceTransactionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBalanceTransactionsResponse
  }

  private object GetCustomersCustomerBalanceTransactionsResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerBalanceTransactionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerBalanceTransactionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerBalanceTransactionsResponse> = when {
      alternative.id == "GetCustomersCustomerBalanceTransactions.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerBalanceTransactionsResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerBalanceTransactionsResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerBalanceTransactions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerBalanceTransactions.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerBalanceTransactionsResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerBalanceTransactionsResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerBalanceTransactions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerBalanceTransactionsResponse = GetCustomersCustomerBalanceTransactionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerBalanceTransactionsTransaction`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface GetCustomersCustomerBalanceTransactionsTransactionResponse {
    public class SuccessJson(
      public val json: CustomerBalanceTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBalanceTransactionsTransactionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBalanceTransactionsTransactionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBalanceTransactionsTransactionResponse
  }

  private object GetCustomersCustomerBalanceTransactionsTransactionResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerBalanceTransactionsTransactionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerBalanceTransactionsTransactionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerBalanceTransactionsTransactionResponse> = when {
      alternative.id == "GetCustomersCustomerBalanceTransactionsTransaction.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerBalanceTransactionsTransactionResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerBalanceTransactionsTransaction.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerBalanceTransactionsTransaction.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerBalanceTransactionsTransactionResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerBalanceTransactionsTransaction.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerBalanceTransactionsTransactionResponse = GetCustomersCustomerBalanceTransactionsTransactionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerBankAccounts`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetCustomersCustomerBankAccountsResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersBankAccountsGetResponse200JsonX8d3d4b93,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBankAccountsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBankAccountsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBankAccountsResponse
  }

  private object GetCustomersCustomerBankAccountsResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerBankAccountsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerBankAccountsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerBankAccountsResponse> = when {
      alternative.id == "GetCustomersCustomerBankAccounts.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerBankAccountsResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerBankAccountsResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerBankAccounts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerBankAccounts.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerBankAccountsResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerBankAccountsResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerBankAccounts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerBankAccountsResponse = GetCustomersCustomerBankAccountsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerBankAccountsId`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetCustomersCustomerBankAccountsIdResponse {
    public class SuccessJson(
      public val json: BankAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBankAccountsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBankAccountsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerBankAccountsIdResponse
  }

  private object GetCustomersCustomerBankAccountsIdResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerBankAccountsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerBankAccountsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerBankAccountsIdResponse> = when {
      alternative.id == "GetCustomersCustomerBankAccountsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerBankAccountsIdResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerBankAccountsIdResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerBankAccountsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerBankAccountsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerBankAccountsIdResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerBankAccountsIdResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerBankAccountsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerBankAccountsIdResponse = GetCustomersCustomerBankAccountsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerCards`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetCustomersCustomerCardsResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersCardsGetResponse200JsonX1baae5ee,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCardsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCardsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCardsResponse
  }

  private object GetCustomersCustomerCardsResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerCardsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerCardsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerCardsResponse> = when {
      alternative.id == "GetCustomersCustomerCards.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerCardsResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerCardsResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerCards.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerCards.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerCardsResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerCardsResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerCards.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerCardsResponse = GetCustomersCustomerCardsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerCardsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetCustomersCustomerCardsIdResponse {
    public class SuccessJson(
      public val json: Card,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCardsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCardsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCardsIdResponse
  }

  private object GetCustomersCustomerCardsIdResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerCardsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerCardsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerCardsIdResponse> = when {
      alternative.id == "GetCustomersCustomerCardsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerCardsIdResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerCardsIdResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerCardsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerCardsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerCardsIdResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerCardsIdResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerCardsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerCardsIdResponse = GetCustomersCustomerCardsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerCashBalance`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetCustomersCustomerCashBalanceResponse {
    public class SuccessJson(
      public val json: CashBalance,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCashBalanceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCashBalanceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCashBalanceResponse
  }

  private object GetCustomersCustomerCashBalanceResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerCashBalanceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerCashBalanceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerCashBalanceResponse> = when {
      alternative.id == "GetCustomersCustomerCashBalance.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerCashBalanceResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerCashBalanceResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerCashBalance.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerCashBalance.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerCashBalanceResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerCashBalanceResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerCashBalance.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerCashBalanceResponse = GetCustomersCustomerCashBalanceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerCashBalanceTransactions`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetCustomersCustomerCashBalanceTransactionsResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCashBalanceTransactionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCashBalanceTransactionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCashBalanceTransactionsResponse
  }

  private object GetCustomersCustomerCashBalanceTransactionsResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerCashBalanceTransactionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerCashBalanceTransactionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerCashBalanceTransactionsResponse> = when {
      alternative.id == "GetCustomersCustomerCashBalanceTransactions.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerCashBalanceTransactionsResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerCashBalanceTransactionsResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerCashBalanceTransactions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerCashBalanceTransactions.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerCashBalanceTransactionsResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerCashBalanceTransactionsResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerCashBalanceTransactions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerCashBalanceTransactionsResponse = GetCustomersCustomerCashBalanceTransactionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerCashBalanceTransactionsTransaction`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface GetCustomersCustomerCashBalanceTransactionsTransactionResponse {
    public class SuccessJson(
      public val json: CustomerCashBalanceTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCashBalanceTransactionsTransactionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCashBalanceTransactionsTransactionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerCashBalanceTransactionsTransactionResponse
  }

  private object GetCustomersCustomerCashBalanceTransactionsTransactionResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerCashBalanceTransactionsTransactionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerCashBalanceTransactionsTransactionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerCashBalanceTransactionsTransactionResponse> = when {
      alternative.id == "GetCustomersCustomerCashBalanceTransactionsTransaction.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerCashBalanceTransactionsTransactionResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerCashBalanceTransactionsTransactionResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerCashBalanceTransactionsTransaction.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerCashBalanceTransactionsTransaction.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerCashBalanceTransactionsTransactionResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerCashBalanceTransactionsTransactionResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerCashBalanceTransactionsTransaction.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerCashBalanceTransactionsTransactionResponse = GetCustomersCustomerCashBalanceTransactionsTransactionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerDiscount`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetCustomersCustomerDiscountResponse {
    public class SuccessJson(
      public val json: Discount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerDiscountResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerDiscountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerDiscountResponse
  }

  private object GetCustomersCustomerDiscountResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerDiscountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerDiscountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerDiscountResponse> = when {
      alternative.id == "GetCustomersCustomerDiscount.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerDiscountResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerDiscountResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerDiscount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerDiscount.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerDiscountResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerDiscountResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerDiscount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerDiscountResponse = GetCustomersCustomerDiscountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerPaymentMethods`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetCustomersCustomerPaymentMethodsResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersPaymentMethodsGetResponse200JsonX56b8707f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerPaymentMethodsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerPaymentMethodsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerPaymentMethodsResponse
  }

  private object GetCustomersCustomerPaymentMethodsResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerPaymentMethodsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerPaymentMethodsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerPaymentMethodsResponse> = when {
      alternative.id == "GetCustomersCustomerPaymentMethods.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerPaymentMethodsResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerPaymentMethodsResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerPaymentMethods.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerPaymentMethods.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerPaymentMethodsResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerPaymentMethodsResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerPaymentMethods.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerPaymentMethodsResponse = GetCustomersCustomerPaymentMethodsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerPaymentMethodsPaymentMethod`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetCustomersCustomerPaymentMethodsPaymentMethodResponse {
    public class SuccessJson(
      public val json: PaymentMethod,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerPaymentMethodsPaymentMethodResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerPaymentMethodsPaymentMethodResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerPaymentMethodsPaymentMethodResponse
  }

  private object GetCustomersCustomerPaymentMethodsPaymentMethodResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerPaymentMethodsPaymentMethodResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerPaymentMethodsPaymentMethodResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerPaymentMethodsPaymentMethodResponse> = when {
      alternative.id == "GetCustomersCustomerPaymentMethodsPaymentMethod.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerPaymentMethodsPaymentMethodResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerPaymentMethodsPaymentMethodResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerPaymentMethodsPaymentMethod.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerPaymentMethodsPaymentMethod.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerPaymentMethodsPaymentMethodResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerPaymentMethodsPaymentMethodResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerPaymentMethodsPaymentMethod.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerPaymentMethodsPaymentMethodResponse = GetCustomersCustomerPaymentMethodsPaymentMethodResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerSources`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetCustomersCustomerSourcesResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersSourcesGetResponse200JsonX5d75faf9,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSourcesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSourcesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSourcesResponse
  }

  private object GetCustomersCustomerSourcesResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerSourcesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerSourcesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerSourcesResponse> = when {
      alternative.id == "GetCustomersCustomerSources.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerSourcesResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerSourcesResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerSources.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerSources.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerSourcesResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerSourcesResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerSources.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerSourcesResponse = GetCustomersCustomerSourcesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerSourcesId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetCustomersCustomerSourcesIdResponse {
    public class SuccessJson(
      public val json: PaymentSource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSourcesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSourcesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSourcesIdResponse
  }

  private object GetCustomersCustomerSourcesIdResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerSourcesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerSourcesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerSourcesIdResponse> = when {
      alternative.id == "GetCustomersCustomerSourcesId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerSourcesIdResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerSourcesIdResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerSourcesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerSourcesId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerSourcesIdResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerSourcesIdResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerSourcesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerSourcesIdResponse = GetCustomersCustomerSourcesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerSubscriptions`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetCustomersCustomerSubscriptionsResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersSubscriptionsGetResponse200JsonX7fa17575,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSubscriptionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSubscriptionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSubscriptionsResponse
  }

  private object GetCustomersCustomerSubscriptionsResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerSubscriptionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerSubscriptionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerSubscriptionsResponse> = when {
      alternative.id == "GetCustomersCustomerSubscriptions.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerSubscriptionsResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerSubscriptionsResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerSubscriptions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerSubscriptions.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerSubscriptionsResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerSubscriptionsResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerSubscriptions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerSubscriptionsResponse = GetCustomersCustomerSubscriptionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerSubscriptionsSubscriptionExposedId`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse {
    public class SuccessJson(
      public val json: Subscription,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse
  }

  private object GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse> = when {
      alternative.id == "GetCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerSubscriptionsSubscriptionExposedIdResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse = GetCustomersCustomerSubscriptionsSubscriptionExposedIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse {
    public class SuccessJson(
      public val json: Discount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse
  }

  private object GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse> = when {
      alternative.id == "GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse = GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerTaxIds`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetCustomersCustomerTaxIdsResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersTaxIdsGetResponse200JsonX122b02ff,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerTaxIdsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerTaxIdsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerTaxIdsResponse
  }

  private object GetCustomersCustomerTaxIdsResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerTaxIdsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerTaxIdsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerTaxIdsResponse> = when {
      alternative.id == "GetCustomersCustomerTaxIds.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerTaxIdsResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerTaxIdsResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerTaxIds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerTaxIds.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerTaxIdsResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerTaxIdsResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerTaxIds.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerTaxIdsResponse = GetCustomersCustomerTaxIdsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersCustomerTaxIdsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetCustomersCustomerTaxIdsIdResponse {
    public class SuccessJson(
      public val json: TaxId,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerTaxIdsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerTaxIdsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersCustomerTaxIdsIdResponse
  }

  private object GetCustomersCustomerTaxIdsIdResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersCustomerTaxIdsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersCustomerTaxIdsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersCustomerTaxIdsIdResponse> = when {
      alternative.id == "GetCustomersCustomerTaxIdsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerTaxIdsIdResponse.SuccessJson(
          json = CustomersCodecs.getCustomersCustomerTaxIdsIdResponseCodecAlternative0Registry.select(listOf("GetCustomersCustomerTaxIdsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersCustomerTaxIdsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersCustomerTaxIdsIdResponse.DefaultJson(
          json = CustomersCodecs.getCustomersCustomerTaxIdsIdResponseCodecAlternative1Registry.select(listOf("GetCustomersCustomerTaxIdsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersCustomerTaxIdsIdResponse = GetCustomersCustomerTaxIdsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetCustomersSearch`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetCustomersSearchResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersSearchGetResponse200JsonX6ae66ad5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersSearchResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersSearchResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetCustomersSearchResponse
  }

  private object GetCustomersSearchResponseDecoder : SdkResponseAlternativeDecoder<GetCustomersSearchResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetCustomersSearchResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetCustomersSearchResponse> = when {
      alternative.id == "GetCustomersSearch.response.alternative0" -> SdkResponseDecodeResult(
        value = GetCustomersSearchResponse.SuccessJson(
          json = CustomersCodecs.getCustomersSearchResponseCodecAlternative0Registry.select(listOf("GetCustomersSearch.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetCustomersSearch.response.alternative1" -> SdkResponseDecodeResult(
        value = GetCustomersSearchResponse.DefaultJson(
          json = CustomersCodecs.getCustomersSearchResponseCodecAlternative1Registry.select(listOf("GetCustomersSearch.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetCustomersSearchResponse = GetCustomersSearchResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerBalanceTransactions`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostCustomersCustomerBalanceTransactionsResponse {
    public class SuccessJson(
      public val json: CustomerBalanceTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBalanceTransactionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBalanceTransactionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBalanceTransactionsResponse
  }

  private object PostCustomersCustomerBalanceTransactionsResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerBalanceTransactionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerBalanceTransactionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerBalanceTransactionsResponse> = when {
      alternative.id == "PostCustomersCustomerBalanceTransactions.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerBalanceTransactionsResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerBalanceTransactionsResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerBalanceTransactions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerBalanceTransactions.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerBalanceTransactionsResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerBalanceTransactionsResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerBalanceTransactions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerBalanceTransactionsResponse = PostCustomersCustomerBalanceTransactionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerBalanceTransactionsTransaction`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface PostCustomersCustomerBalanceTransactionsTransactionResponse {
    public class SuccessJson(
      public val json: CustomerBalanceTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBalanceTransactionsTransactionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBalanceTransactionsTransactionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBalanceTransactionsTransactionResponse
  }

  private object PostCustomersCustomerBalanceTransactionsTransactionResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerBalanceTransactionsTransactionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerBalanceTransactionsTransactionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerBalanceTransactionsTransactionResponse> = when {
      alternative.id == "PostCustomersCustomerBalanceTransactionsTransaction.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerBalanceTransactionsTransactionResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerBalanceTransactionsTransaction.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerBalanceTransactionsTransaction.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerBalanceTransactionsTransactionResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerBalanceTransactionsTransactionResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerBalanceTransactionsTransaction.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerBalanceTransactionsTransactionResponse = PostCustomersCustomerBalanceTransactionsTransactionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerBankAccounts`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostCustomersCustomerBankAccountsResponse {
    public class SuccessJson(
      public val json: PaymentSource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBankAccountsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBankAccountsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBankAccountsResponse
  }

  private object PostCustomersCustomerBankAccountsResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerBankAccountsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerBankAccountsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerBankAccountsResponse> = when {
      alternative.id == "PostCustomersCustomerBankAccounts.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerBankAccountsResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerBankAccountsResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerBankAccounts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerBankAccounts.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerBankAccountsResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerBankAccountsResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerBankAccounts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerBankAccountsResponse = PostCustomersCustomerBankAccountsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerBankAccountsId`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostCustomersCustomerBankAccountsIdResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersBankAccountsPostResponse200JsonXf5372d82,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBankAccountsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBankAccountsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBankAccountsIdResponse
  }

  private object PostCustomersCustomerBankAccountsIdResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerBankAccountsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerBankAccountsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerBankAccountsIdResponse> = when {
      alternative.id == "PostCustomersCustomerBankAccountsId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerBankAccountsIdResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerBankAccountsIdResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerBankAccountsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerBankAccountsId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerBankAccountsIdResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerBankAccountsIdResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerBankAccountsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerBankAccountsIdResponse = PostCustomersCustomerBankAccountsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerBankAccountsIdVerify`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostCustomersCustomerBankAccountsIdVerifyResponse {
    public class SuccessJson(
      public val json: BankAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBankAccountsIdVerifyResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBankAccountsIdVerifyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerBankAccountsIdVerifyResponse
  }

  private object PostCustomersCustomerBankAccountsIdVerifyResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerBankAccountsIdVerifyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerBankAccountsIdVerifyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerBankAccountsIdVerifyResponse> = when {
      alternative.id == "PostCustomersCustomerBankAccountsIdVerify.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerBankAccountsIdVerifyResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerBankAccountsIdVerifyResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerBankAccountsIdVerify.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerBankAccountsIdVerify.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerBankAccountsIdVerifyResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerBankAccountsIdVerifyResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerBankAccountsIdVerify.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerBankAccountsIdVerifyResponse = PostCustomersCustomerBankAccountsIdVerifyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerCards`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostCustomersCustomerCardsResponse {
    public class SuccessJson(
      public val json: PaymentSource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerCardsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerCardsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerCardsResponse
  }

  private object PostCustomersCustomerCardsResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerCardsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerCardsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerCardsResponse> = when {
      alternative.id == "PostCustomersCustomerCards.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerCardsResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerCardsResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerCards.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerCards.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerCardsResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerCardsResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerCards.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerCardsResponse = PostCustomersCustomerCardsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerCardsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostCustomersCustomerCardsIdResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersCardsPostResponse200JsonXa7937916,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerCardsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerCardsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerCardsIdResponse
  }

  private object PostCustomersCustomerCardsIdResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerCardsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerCardsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerCardsIdResponse> = when {
      alternative.id == "PostCustomersCustomerCardsId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerCardsIdResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerCardsIdResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerCardsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerCardsId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerCardsIdResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerCardsIdResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerCardsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerCardsIdResponse = PostCustomersCustomerCardsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerCashBalance`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostCustomersCustomerCashBalanceResponse {
    public class SuccessJson(
      public val json: CashBalance,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerCashBalanceResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerCashBalanceResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerCashBalanceResponse
  }

  private object PostCustomersCustomerCashBalanceResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerCashBalanceResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerCashBalanceResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerCashBalanceResponse> = when {
      alternative.id == "PostCustomersCustomerCashBalance.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerCashBalanceResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerCashBalanceResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerCashBalance.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerCashBalance.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerCashBalanceResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerCashBalanceResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerCashBalance.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerCashBalanceResponse = PostCustomersCustomerCashBalanceResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerFundingInstructions`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostCustomersCustomerFundingInstructionsResponse {
    public class SuccessJson(
      public val json: FundingInstructions,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerFundingInstructionsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerFundingInstructionsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerFundingInstructionsResponse
  }

  private object PostCustomersCustomerFundingInstructionsResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerFundingInstructionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerFundingInstructionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerFundingInstructionsResponse> = when {
      alternative.id == "PostCustomersCustomerFundingInstructions.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerFundingInstructionsResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerFundingInstructionsResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerFundingInstructions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerFundingInstructions.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerFundingInstructionsResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerFundingInstructionsResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerFundingInstructions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerFundingInstructionsResponse = PostCustomersCustomerFundingInstructionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerSources`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostCustomersCustomerSourcesResponse {
    public class SuccessJson(
      public val json: PaymentSource,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerSourcesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerSourcesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerSourcesResponse
  }

  private object PostCustomersCustomerSourcesResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerSourcesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerSourcesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerSourcesResponse> = when {
      alternative.id == "PostCustomersCustomerSources.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerSourcesResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerSourcesResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerSources.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerSources.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerSourcesResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerSourcesResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerSources.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerSourcesResponse = PostCustomersCustomerSourcesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerSourcesId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostCustomersCustomerSourcesIdResponse {
    public class SuccessJson(
      public val json: InlineV1CustomersSourcesPostResponse200JsonX6d2b1d0d,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerSourcesIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerSourcesIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerSourcesIdResponse
  }

  private object PostCustomersCustomerSourcesIdResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerSourcesIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerSourcesIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerSourcesIdResponse> = when {
      alternative.id == "PostCustomersCustomerSourcesId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerSourcesIdResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerSourcesIdResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerSourcesId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerSourcesId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerSourcesIdResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerSourcesIdResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerSourcesId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerSourcesIdResponse = PostCustomersCustomerSourcesIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerSourcesIdVerify`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostCustomersCustomerSourcesIdVerifyResponse {
    public class SuccessJson(
      public val json: BankAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerSourcesIdVerifyResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerSourcesIdVerifyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerSourcesIdVerifyResponse
  }

  private object PostCustomersCustomerSourcesIdVerifyResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerSourcesIdVerifyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerSourcesIdVerifyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerSourcesIdVerifyResponse> = when {
      alternative.id == "PostCustomersCustomerSourcesIdVerify.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerSourcesIdVerifyResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerSourcesIdVerifyResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerSourcesIdVerify.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerSourcesIdVerify.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerSourcesIdVerifyResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerSourcesIdVerifyResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerSourcesIdVerify.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerSourcesIdVerifyResponse = PostCustomersCustomerSourcesIdVerifyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostCustomersCustomerTaxIds`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostCustomersCustomerTaxIdsResponse {
    public class SuccessJson(
      public val json: TaxId,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerTaxIdsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerTaxIdsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostCustomersCustomerTaxIdsResponse
  }

  private object PostCustomersCustomerTaxIdsResponseDecoder : SdkResponseAlternativeDecoder<PostCustomersCustomerTaxIdsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostCustomersCustomerTaxIdsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostCustomersCustomerTaxIdsResponse> = when {
      alternative.id == "PostCustomersCustomerTaxIds.response.alternative0" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerTaxIdsResponse.SuccessJson(
          json = CustomersCodecs.postCustomersCustomerTaxIdsResponseCodecAlternative0Registry.select(listOf("PostCustomersCustomerTaxIds.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostCustomersCustomerTaxIds.response.alternative1" -> SdkResponseDecodeResult(
        value = PostCustomersCustomerTaxIdsResponse.DefaultJson(
          json = CustomersCodecs.postCustomersCustomerTaxIdsResponseCodecAlternative1Registry.select(listOf("PostCustomersCustomerTaxIds.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostCustomersCustomerTaxIdsResponse = PostCustomersCustomerTaxIdsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val deleteCustomersCustomerMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteCustomersCustomer",
          method = "DELETE",
          path = "/v1/customers/{customer}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedCustomer",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomer.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomer.response.alternative1",
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

    internal val deleteCustomersCustomerBankAccountsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteCustomersCustomerBankAccountsId",
          method = "DELETE",
          path = "/v1/customers/{customer}/bank_accounts/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersBankAccountsDeleteResponse200JsonXa03131e2",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerBankAccountsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerBankAccountsId.response.alternative1",
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

    internal val deleteCustomersCustomerCardsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteCustomersCustomerCardsId",
          method = "DELETE",
          path = "/v1/customers/{customer}/cards/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersCardsDeleteResponse200JsonX5f1f6a06",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerCardsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerCardsId.response.alternative1",
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

    internal val deleteCustomersCustomerDiscountMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteCustomersCustomerDiscount",
          method = "DELETE",
          path = "/v1/customers/{customer}/discount",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedDiscount",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerDiscount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerDiscount.response.alternative1",
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

    internal val deleteCustomersCustomerSourcesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteCustomersCustomerSourcesId",
          method = "DELETE",
          path = "/v1/customers/{customer}/sources/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersSourcesDeleteResponse200JsonXf22f4818",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerSourcesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerSourcesId.response.alternative1",
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

    internal val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteCustomersCustomerSubscriptionsSubscriptionExposedId",
          method = "DELETE",
          path = "/v1/customers/{customer}/subscriptions/{subscription_exposed_id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Subscription",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative1",
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

    internal val deleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount",
          method = "DELETE",
          path = "/v1/customers/{customer}/subscriptions/{subscription_exposed_id}/discount",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedDiscount",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative1",
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

    internal val deleteCustomersCustomerTaxIdsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteCustomersCustomerTaxIdsId",
          method = "DELETE",
          path = "/v1/customers/{customer}/tax_ids/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedTaxId",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerTaxIdsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteCustomersCustomerTaxIdsId.response.alternative1",
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

    internal val getCustomersMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomers",
          method = "GET",
          path = "/v1/customers",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersGetResponse200JsonX44b62b7d",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomers.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomers.response.alternative1",
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

    internal val getCustomersCustomerMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomer",
          method = "GET",
          path = "/v1/customers/{customer}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersGetResponse200JsonX874ee250",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomer.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomer.response.alternative1",
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

    internal val getCustomersCustomerBalanceTransactionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerBalanceTransactions",
          method = "GET",
          path = "/v1/customers/{customer}/balance_transactions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersBalanceTransactionsGetResponse200JsonX861e0ca6",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerBalanceTransactions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerBalanceTransactions.response.alternative1",
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

    internal val getCustomersCustomerBalanceTransactionsTransactionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerBalanceTransactionsTransaction",
          method = "GET",
          path = "/v1/customers/{customer}/balance_transactions/{transaction}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CustomerBalanceTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerBalanceTransactionsTransaction.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerBalanceTransactionsTransaction.response.alternative1",
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

    internal val getCustomersCustomerBankAccountsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerBankAccounts",
          method = "GET",
          path = "/v1/customers/{customer}/bank_accounts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersBankAccountsGetResponse200JsonX8d3d4b93",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerBankAccounts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerBankAccounts.response.alternative1",
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

    internal val getCustomersCustomerBankAccountsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerBankAccountsId",
          method = "GET",
          path = "/v1/customers/{customer}/bank_accounts/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BankAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerBankAccountsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerBankAccountsId.response.alternative1",
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

    internal val getCustomersCustomerCardsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerCards",
          method = "GET",
          path = "/v1/customers/{customer}/cards",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersCardsGetResponse200JsonX1baae5ee",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerCards.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerCards.response.alternative1",
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

    internal val getCustomersCustomerCardsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerCardsId",
          method = "GET",
          path = "/v1/customers/{customer}/cards/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Card",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerCardsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerCardsId.response.alternative1",
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

    internal val getCustomersCustomerCashBalanceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerCashBalance",
          method = "GET",
          path = "/v1/customers/{customer}/cash_balance",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CashBalance",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerCashBalance.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerCashBalance.response.alternative1",
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

    internal val getCustomersCustomerCashBalanceTransactionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerCashBalanceTransactions",
          method = "GET",
          path = "/v1/customers/{customer}/cash_balance_transactions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersCashBalanceTransactionsGetResponse200JsonXfdde60bc",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerCashBalanceTransactions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerCashBalanceTransactions.response.alternative1",
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

    internal val getCustomersCustomerCashBalanceTransactionsTransactionMetadata: OperationMetadata
        by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerCashBalanceTransactionsTransaction",
          method = "GET",
          path = "/v1/customers/{customer}/cash_balance_transactions/{transaction}",
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
              id = "GetCustomersCustomerCashBalanceTransactionsTransaction.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerCashBalanceTransactionsTransaction.response.alternative1",
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

    internal val getCustomersCustomerDiscountMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerDiscount",
          method = "GET",
          path = "/v1/customers/{customer}/discount",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Discount",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerDiscount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerDiscount.response.alternative1",
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

    internal val getCustomersCustomerPaymentMethodsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerPaymentMethods",
          method = "GET",
          path = "/v1/customers/{customer}/payment_methods",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersPaymentMethodsGetResponse200JsonX56b8707f",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerPaymentMethods.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerPaymentMethods.response.alternative1",
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

    internal val getCustomersCustomerPaymentMethodsPaymentMethodMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerPaymentMethodsPaymentMethod",
          method = "GET",
          path = "/v1/customers/{customer}/payment_methods/{payment_method}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentMethod",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerPaymentMethodsPaymentMethod.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerPaymentMethodsPaymentMethod.response.alternative1",
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

    internal val getCustomersCustomerSourcesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerSources",
          method = "GET",
          path = "/v1/customers/{customer}/sources",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersSourcesGetResponse200JsonX5d75faf9",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerSources.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerSources.response.alternative1",
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

    internal val getCustomersCustomerSourcesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerSourcesId",
          method = "GET",
          path = "/v1/customers/{customer}/sources/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentSource",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerSourcesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerSourcesId.response.alternative1",
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

    internal val getCustomersCustomerSubscriptionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerSubscriptions",
          method = "GET",
          path = "/v1/customers/{customer}/subscriptions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersSubscriptionsGetResponse200JsonX7fa17575",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerSubscriptions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerSubscriptions.response.alternative1",
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

    internal val getCustomersCustomerSubscriptionsSubscriptionExposedIdMetadata: OperationMetadata
        by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerSubscriptionsSubscriptionExposedId",
          method = "GET",
          path = "/v1/customers/{customer}/subscriptions/{subscription_exposed_id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Subscription",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerSubscriptionsSubscriptionExposedId.response.alternative1",
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

    internal val getCustomersCustomerSubscriptionsSubscriptionExposedIdDiscountMetadata:
        OperationMetadata by lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount",
          method = "GET",
          path = "/v1/customers/{customer}/subscriptions/{subscription_exposed_id}/discount",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Discount",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerSubscriptionsSubscriptionExposedIdDiscount.response.alternative1",
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

    internal val getCustomersCustomerTaxIdsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerTaxIds",
          method = "GET",
          path = "/v1/customers/{customer}/tax_ids",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersTaxIdsGetResponse200JsonX122b02ff",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerTaxIds.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerTaxIds.response.alternative1",
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

    internal val getCustomersCustomerTaxIdsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersCustomerTaxIdsId",
          method = "GET",
          path = "/v1/customers/{customer}/tax_ids/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxId",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerTaxIdsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersCustomerTaxIdsId.response.alternative1",
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

    internal val getCustomersSearchMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetCustomersSearch",
          method = "GET",
          path = "/v1/customers/search",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersSearchGetResponse200JsonX6ae66ad5",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersSearch.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetCustomersSearch.response.alternative1",
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

    internal val postCustomersCustomerBalanceTransactionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerBalanceTransactions",
          method = "POST",
          path = "/v1/customers/{customer}/balance_transactions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CustomerBalanceTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerBalanceTransactions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerBalanceTransactions.response.alternative1",
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

    internal val postCustomersCustomerBalanceTransactionsTransactionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerBalanceTransactionsTransaction",
          method = "POST",
          path = "/v1/customers/{customer}/balance_transactions/{transaction}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CustomerBalanceTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerBalanceTransactionsTransaction.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerBalanceTransactionsTransaction.response.alternative1",
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

    internal val postCustomersCustomerBankAccountsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerBankAccounts",
          method = "POST",
          path = "/v1/customers/{customer}/bank_accounts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentSource",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerBankAccounts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerBankAccounts.response.alternative1",
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

    internal val postCustomersCustomerBankAccountsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerBankAccountsId",
          method = "POST",
          path = "/v1/customers/{customer}/bank_accounts/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersBankAccountsPostResponse200JsonXf5372d82",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerBankAccountsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerBankAccountsId.response.alternative1",
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

    internal val postCustomersCustomerBankAccountsIdVerifyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerBankAccountsIdVerify",
          method = "POST",
          path = "/v1/customers/{customer}/bank_accounts/{id}/verify",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BankAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerBankAccountsIdVerify.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerBankAccountsIdVerify.response.alternative1",
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

    internal val postCustomersCustomerCardsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerCards",
          method = "POST",
          path = "/v1/customers/{customer}/cards",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentSource",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerCards.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerCards.response.alternative1",
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

    internal val postCustomersCustomerCardsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerCardsId",
          method = "POST",
          path = "/v1/customers/{customer}/cards/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersCardsPostResponse200JsonXa7937916",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerCardsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerCardsId.response.alternative1",
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

    internal val postCustomersCustomerCashBalanceMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerCashBalance",
          method = "POST",
          path = "/v1/customers/{customer}/cash_balance",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CashBalance",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerCashBalance.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerCashBalance.response.alternative1",
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

    internal val postCustomersCustomerFundingInstructionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerFundingInstructions",
          method = "POST",
          path = "/v1/customers/{customer}/funding_instructions",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "FundingInstructions",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerFundingInstructions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerFundingInstructions.response.alternative1",
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

    internal val postCustomersCustomerSourcesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerSources",
          method = "POST",
          path = "/v1/customers/{customer}/sources",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentSource",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerSources.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerSources.response.alternative1",
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

    internal val postCustomersCustomerSourcesIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerSourcesId",
          method = "POST",
          path = "/v1/customers/{customer}/sources/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1CustomersSourcesPostResponse200JsonX6d2b1d0d",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerSourcesId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerSourcesId.response.alternative1",
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

    internal val postCustomersCustomerSourcesIdVerifyMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerSourcesIdVerify",
          method = "POST",
          path = "/v1/customers/{customer}/sources/{id}/verify",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BankAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerSourcesIdVerify.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerSourcesIdVerify.response.alternative1",
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

    internal val postCustomersCustomerTaxIdsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostCustomersCustomerTaxIds",
          method = "POST",
          path = "/v1/customers/{customer}/tax_ids",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxId",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerTaxIds.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostCustomersCustomerTaxIds.response.alternative1",
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
