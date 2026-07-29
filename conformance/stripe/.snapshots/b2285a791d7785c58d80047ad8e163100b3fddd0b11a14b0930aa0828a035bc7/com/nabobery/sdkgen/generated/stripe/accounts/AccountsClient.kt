package com.nabobery.sdkgen.generated.stripe.accounts

import com.nabobery.sdkgen.generated.stripe.Account
import com.nabobery.sdkgen.generated.stripe.Capability
import com.nabobery.sdkgen.generated.stripe.DeletedAccount
import com.nabobery.sdkgen.generated.stripe.DeletedExternalAccount
import com.nabobery.sdkgen.generated.stripe.DeletedPerson
import com.nabobery.sdkgen.generated.stripe.Error
import com.nabobery.sdkgen.generated.stripe.ExternalAccount
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsBankAccountsPostRequestFormX16c7f6ea
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsBankAccountsPostRequestFormX8a64f5af
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsCapabilitiesGetResponse200JsonX87f9b592
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsCapabilitiesPostRequestFormX67548eb6
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsExternalAccountsGetParameterX44f2e643
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsExternalAccountsPostRequestFormX94e22b62
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsExternalAccountsPostRequestFormXe2d4c120
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsGetParameterXaa6c7ce8
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsGetResponse200JsonX1b6b3724
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsLoginLinksPostRequestFormX852839ba
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeopleGetParameterX0eeaf8d2
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPeopleGetResponse200JsonX4b2e5b26
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPersonsGetParameterX9889ba8f
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPersonsGetResponse200JsonXe630747d
import com.nabobery.sdkgen.generated.stripe.InlineV1AccountsRejectPostRequestFormXdb22fec1
import com.nabobery.sdkgen.generated.stripe.LoginLink
import com.nabobery.sdkgen.generated.stripe.Person
import com.nabobery.sdkgen.generated.stripe.SdkJson
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
import kotlinx.serialization.json.JsonPrimitive

public object AccountsCodecs {
  public const val DELETEACCOUNTSACCOUNT_REQUEST_CODEC_ID: String = "DeleteAccountsAccount.request"

  private val deleteAccountsAccountRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteAccountsAccountFormCodec

  private val deleteAccountsAccountResponseCodecAlternative0Codec: MediaTypeCodec<DeletedAccount> =
      KotlinxSerializationCodec("DeleteAccountsAccount.response.alternative0", DeletedAccount.Serializer, SdkJson)

  public val deleteAccountsAccountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedAccount> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountResponseCodecAlternative0Codec)

  private val deleteAccountsAccountResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteAccountsAccount.response.alternative1", Error.Serializer, SdkJson)

  public val deleteAccountsAccountResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountResponseCodecAlternative1Codec)

  public val deleteAccountsAccountRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountRequestCodec)

  public const val DELETEACCOUNTSACCOUNTBANKACCOUNTSID_REQUEST_CODEC_ID: String =
      "DeleteAccountsAccountBankAccountsId.request"

  private val deleteAccountsAccountBankAccountsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteAccountsAccountBankAccountsIdFormCodec

  private val deleteAccountsAccountBankAccountsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedExternalAccount> =
      KotlinxSerializationCodec("DeleteAccountsAccountBankAccountsId.response.alternative0", DeletedExternalAccount.Serializer, SdkJson)

  public val deleteAccountsAccountBankAccountsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedExternalAccount> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountBankAccountsIdResponseCodecAlternative0Codec)

  private val deleteAccountsAccountBankAccountsIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteAccountsAccountBankAccountsId.response.alternative1", Error.Serializer, SdkJson)

  public val deleteAccountsAccountBankAccountsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountBankAccountsIdResponseCodecAlternative1Codec)

  public val deleteAccountsAccountBankAccountsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountBankAccountsIdRequestCodec)

  public const val DELETEACCOUNTSACCOUNTEXTERNALACCOUNTSID_REQUEST_CODEC_ID: String =
      "DeleteAccountsAccountExternalAccountsId.request"

  private val deleteAccountsAccountExternalAccountsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteAccountsAccountExternalAccountsIdFormCodec

  private val deleteAccountsAccountExternalAccountsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedExternalAccount> =
      KotlinxSerializationCodec("DeleteAccountsAccountExternalAccountsId.response.alternative0", DeletedExternalAccount.Serializer, SdkJson)

  public val deleteAccountsAccountExternalAccountsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedExternalAccount> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountExternalAccountsIdResponseCodecAlternative0Codec)

  private val deleteAccountsAccountExternalAccountsIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteAccountsAccountExternalAccountsId.response.alternative1", Error.Serializer, SdkJson)

  public val deleteAccountsAccountExternalAccountsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountExternalAccountsIdResponseCodecAlternative1Codec)

  public val deleteAccountsAccountExternalAccountsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountExternalAccountsIdRequestCodec)

  public const val DELETEACCOUNTSACCOUNTPEOPLEPERSON_REQUEST_CODEC_ID: String =
      "DeleteAccountsAccountPeoplePerson.request"

  private val deleteAccountsAccountPeoplePersonRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteAccountsAccountPeoplePersonFormCodec

  private val deleteAccountsAccountPeoplePersonResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedPerson> =
      KotlinxSerializationCodec("DeleteAccountsAccountPeoplePerson.response.alternative0", DeletedPerson.Serializer, SdkJson)

  public val deleteAccountsAccountPeoplePersonResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedPerson> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountPeoplePersonResponseCodecAlternative0Codec)

  private val deleteAccountsAccountPeoplePersonResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("DeleteAccountsAccountPeoplePerson.response.alternative1", Error.Serializer, SdkJson)

  public val deleteAccountsAccountPeoplePersonResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountPeoplePersonResponseCodecAlternative1Codec)

  public val deleteAccountsAccountPeoplePersonRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountPeoplePersonRequestCodec)

  public const val DELETEACCOUNTSACCOUNTPERSONSPERSON_REQUEST_CODEC_ID: String =
      "DeleteAccountsAccountPersonsPerson.request"

  private val deleteAccountsAccountPersonsPersonRequestCodec: MediaTypeCodec<JsonObject?> =
      DeleteAccountsAccountPersonsPersonFormCodec

  private val deleteAccountsAccountPersonsPersonResponseCodecAlternative0Codec:
      MediaTypeCodec<DeletedPerson> =
      KotlinxSerializationCodec("DeleteAccountsAccountPersonsPerson.response.alternative0", DeletedPerson.Serializer, SdkJson)

  public val deleteAccountsAccountPersonsPersonResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeletedPerson> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountPersonsPersonResponseCodecAlternative0Codec)

  private val deleteAccountsAccountPersonsPersonResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("DeleteAccountsAccountPersonsPerson.response.alternative1", Error.Serializer, SdkJson)

  public val deleteAccountsAccountPersonsPersonResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountPersonsPersonResponseCodecAlternative1Codec)

  public val deleteAccountsAccountPersonsPersonRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(deleteAccountsAccountPersonsPersonRequestCodec)

  public const val GETACCOUNTS_REQUEST_CODEC_ID: String = "GetAccounts.request"

  private val getAccountsRequestCodec: MediaTypeCodec<JsonObject?> = GetAccountsFormCodec

  private val getAccountsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1AccountsGetResponse200JsonX1b6b3724> =
      KotlinxSerializationCodec("GetAccounts.response.alternative0", InlineV1AccountsGetResponse200JsonX1b6b3724.Serializer, SdkJson)

  public val getAccountsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1AccountsGetResponse200JsonX1b6b3724> =
      MediaTypeCodecRegistry.of(getAccountsResponseCodecAlternative0Codec)

  private val getAccountsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAccounts.response.alternative1", Error.Serializer, SdkJson)

  public val getAccountsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAccountsResponseCodecAlternative1Codec)

  public val getAccountsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getAccountsRequestCodec)

  public const val GETACCOUNTSACCOUNT_REQUEST_CODEC_ID: String = "GetAccountsAccount.request"

  private val getAccountsAccountRequestCodec: MediaTypeCodec<JsonObject?> =
      GetAccountsAccountFormCodec

  private val getAccountsAccountResponseCodecAlternative0Codec: MediaTypeCodec<Account> =
      KotlinxSerializationCodec("GetAccountsAccount.response.alternative0", Account.Serializer, SdkJson)

  public val getAccountsAccountResponseCodecAlternative0Registry: MediaTypeCodecRegistry<Account> =
      MediaTypeCodecRegistry.of(getAccountsAccountResponseCodecAlternative0Codec)

  private val getAccountsAccountResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAccountsAccount.response.alternative1", Error.Serializer, SdkJson)

  public val getAccountsAccountResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAccountsAccountResponseCodecAlternative1Codec)

  public val getAccountsAccountRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getAccountsAccountRequestCodec)

  public const val GETACCOUNTSACCOUNTBANKACCOUNTSID_REQUEST_CODEC_ID: String =
      "GetAccountsAccountBankAccountsId.request"

  private val getAccountsAccountBankAccountsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetAccountsAccountBankAccountsIdFormCodec

  private val getAccountsAccountBankAccountsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<ExternalAccount> =
      KotlinxSerializationCodec("GetAccountsAccountBankAccountsId.response.alternative0", ExternalAccount.Serializer, SdkJson)

  public val getAccountsAccountBankAccountsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ExternalAccount> =
      MediaTypeCodecRegistry.of(getAccountsAccountBankAccountsIdResponseCodecAlternative0Codec)

  private val getAccountsAccountBankAccountsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("GetAccountsAccountBankAccountsId.response.alternative1", Error.Serializer, SdkJson)

  public val getAccountsAccountBankAccountsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAccountsAccountBankAccountsIdResponseCodecAlternative1Codec)

  public val getAccountsAccountBankAccountsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getAccountsAccountBankAccountsIdRequestCodec)

  public const val GETACCOUNTSACCOUNTCAPABILITIES_REQUEST_CODEC_ID: String =
      "GetAccountsAccountCapabilities.request"

  private val getAccountsAccountCapabilitiesRequestCodec: MediaTypeCodec<JsonObject?> =
      GetAccountsAccountCapabilitiesFormCodec

  private val getAccountsAccountCapabilitiesResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1AccountsCapabilitiesGetResponse200JsonX87f9b592> =
      KotlinxSerializationCodec("GetAccountsAccountCapabilities.response.alternative0", InlineV1AccountsCapabilitiesGetResponse200JsonX87f9b592.Serializer, SdkJson)

  public val getAccountsAccountCapabilitiesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1AccountsCapabilitiesGetResponse200JsonX87f9b592> =
      MediaTypeCodecRegistry.of(getAccountsAccountCapabilitiesResponseCodecAlternative0Codec)

  private val getAccountsAccountCapabilitiesResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAccountsAccountCapabilities.response.alternative1", Error.Serializer, SdkJson)

  public val getAccountsAccountCapabilitiesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAccountsAccountCapabilitiesResponseCodecAlternative1Codec)

  public val getAccountsAccountCapabilitiesRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getAccountsAccountCapabilitiesRequestCodec)

  public const val GETACCOUNTSACCOUNTCAPABILITIESCAPABILITY_REQUEST_CODEC_ID: String =
      "GetAccountsAccountCapabilitiesCapability.request"

  private val getAccountsAccountCapabilitiesCapabilityRequestCodec: MediaTypeCodec<JsonObject?> =
      GetAccountsAccountCapabilitiesCapabilityFormCodec

  private val getAccountsAccountCapabilitiesCapabilityResponseCodecAlternative0Codec:
      MediaTypeCodec<Capability> =
      KotlinxSerializationCodec("GetAccountsAccountCapabilitiesCapability.response.alternative0", Capability.Serializer, SdkJson)

  public val getAccountsAccountCapabilitiesCapabilityResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Capability> =
      MediaTypeCodecRegistry.of(getAccountsAccountCapabilitiesCapabilityResponseCodecAlternative0Codec)

  private val getAccountsAccountCapabilitiesCapabilityResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAccountsAccountCapabilitiesCapability.response.alternative1", Error.Serializer, SdkJson)

  public val getAccountsAccountCapabilitiesCapabilityResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAccountsAccountCapabilitiesCapabilityResponseCodecAlternative1Codec)

  public val getAccountsAccountCapabilitiesCapabilityRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getAccountsAccountCapabilitiesCapabilityRequestCodec)

  public const val GETACCOUNTSACCOUNTEXTERNALACCOUNTS_REQUEST_CODEC_ID: String =
      "GetAccountsAccountExternalAccounts.request"

  private val getAccountsAccountExternalAccountsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetAccountsAccountExternalAccountsFormCodec

  private val getAccountsAccountExternalAccountsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b> =
      KotlinxSerializationCodec("GetAccountsAccountExternalAccounts.response.alternative0", InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b.Serializer, SdkJson)

  public val getAccountsAccountExternalAccountsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b> =
      MediaTypeCodecRegistry.of(getAccountsAccountExternalAccountsResponseCodecAlternative0Codec)

  private val getAccountsAccountExternalAccountsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAccountsAccountExternalAccounts.response.alternative1", Error.Serializer, SdkJson)

  public val getAccountsAccountExternalAccountsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAccountsAccountExternalAccountsResponseCodecAlternative1Codec)

  public val getAccountsAccountExternalAccountsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getAccountsAccountExternalAccountsRequestCodec)

  public const val GETACCOUNTSACCOUNTEXTERNALACCOUNTSID_REQUEST_CODEC_ID: String =
      "GetAccountsAccountExternalAccountsId.request"

  private val getAccountsAccountExternalAccountsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetAccountsAccountExternalAccountsIdFormCodec

  private val getAccountsAccountExternalAccountsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<ExternalAccount> =
      KotlinxSerializationCodec("GetAccountsAccountExternalAccountsId.response.alternative0", ExternalAccount.Serializer, SdkJson)

  public val getAccountsAccountExternalAccountsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ExternalAccount> =
      MediaTypeCodecRegistry.of(getAccountsAccountExternalAccountsIdResponseCodecAlternative0Codec)

  private val getAccountsAccountExternalAccountsIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAccountsAccountExternalAccountsId.response.alternative1", Error.Serializer, SdkJson)

  public val getAccountsAccountExternalAccountsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAccountsAccountExternalAccountsIdResponseCodecAlternative1Codec)

  public val getAccountsAccountExternalAccountsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getAccountsAccountExternalAccountsIdRequestCodec)

  public const val GETACCOUNTSACCOUNTPEOPLE_REQUEST_CODEC_ID: String =
      "GetAccountsAccountPeople.request"

  private val getAccountsAccountPeopleRequestCodec: MediaTypeCodec<JsonObject?> =
      GetAccountsAccountPeopleFormCodec

  private val getAccountsAccountPeopleResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1AccountsPeopleGetResponse200JsonX4b2e5b26> =
      KotlinxSerializationCodec("GetAccountsAccountPeople.response.alternative0", InlineV1AccountsPeopleGetResponse200JsonX4b2e5b26.Serializer, SdkJson)

  public val getAccountsAccountPeopleResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1AccountsPeopleGetResponse200JsonX4b2e5b26> =
      MediaTypeCodecRegistry.of(getAccountsAccountPeopleResponseCodecAlternative0Codec)

  private val getAccountsAccountPeopleResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAccountsAccountPeople.response.alternative1", Error.Serializer, SdkJson)

  public val getAccountsAccountPeopleResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAccountsAccountPeopleResponseCodecAlternative1Codec)

  public val getAccountsAccountPeopleRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getAccountsAccountPeopleRequestCodec)

  public const val GETACCOUNTSACCOUNTPEOPLEPERSON_REQUEST_CODEC_ID: String =
      "GetAccountsAccountPeoplePerson.request"

  private val getAccountsAccountPeoplePersonRequestCodec: MediaTypeCodec<JsonObject?> =
      GetAccountsAccountPeoplePersonFormCodec

  private val getAccountsAccountPeoplePersonResponseCodecAlternative0Codec: MediaTypeCodec<Person> =
      KotlinxSerializationCodec("GetAccountsAccountPeoplePerson.response.alternative0", Person.Serializer, SdkJson)

  public val getAccountsAccountPeoplePersonResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Person> =
      MediaTypeCodecRegistry.of(getAccountsAccountPeoplePersonResponseCodecAlternative0Codec)

  private val getAccountsAccountPeoplePersonResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAccountsAccountPeoplePerson.response.alternative1", Error.Serializer, SdkJson)

  public val getAccountsAccountPeoplePersonResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAccountsAccountPeoplePersonResponseCodecAlternative1Codec)

  public val getAccountsAccountPeoplePersonRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?>
      = MediaTypeCodecRegistry.of(getAccountsAccountPeoplePersonRequestCodec)

  public const val GETACCOUNTSACCOUNTPERSONS_REQUEST_CODEC_ID: String =
      "GetAccountsAccountPersons.request"

  private val getAccountsAccountPersonsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetAccountsAccountPersonsFormCodec

  private val getAccountsAccountPersonsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1AccountsPersonsGetResponse200JsonXe630747d> =
      KotlinxSerializationCodec("GetAccountsAccountPersons.response.alternative0", InlineV1AccountsPersonsGetResponse200JsonXe630747d.Serializer, SdkJson)

  public val getAccountsAccountPersonsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1AccountsPersonsGetResponse200JsonXe630747d> =
      MediaTypeCodecRegistry.of(getAccountsAccountPersonsResponseCodecAlternative0Codec)

  private val getAccountsAccountPersonsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAccountsAccountPersons.response.alternative1", Error.Serializer, SdkJson)

  public val getAccountsAccountPersonsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAccountsAccountPersonsResponseCodecAlternative1Codec)

  public val getAccountsAccountPersonsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getAccountsAccountPersonsRequestCodec)

  public const val GETACCOUNTSACCOUNTPERSONSPERSON_REQUEST_CODEC_ID: String =
      "GetAccountsAccountPersonsPerson.request"

  private val getAccountsAccountPersonsPersonRequestCodec: MediaTypeCodec<JsonObject?> =
      GetAccountsAccountPersonsPersonFormCodec

  private val getAccountsAccountPersonsPersonResponseCodecAlternative0Codec: MediaTypeCodec<Person>
      =
      KotlinxSerializationCodec("GetAccountsAccountPersonsPerson.response.alternative0", Person.Serializer, SdkJson)

  public val getAccountsAccountPersonsPersonResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Person> =
      MediaTypeCodecRegistry.of(getAccountsAccountPersonsPersonResponseCodecAlternative0Codec)

  private val getAccountsAccountPersonsPersonResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetAccountsAccountPersonsPerson.response.alternative1", Error.Serializer, SdkJson)

  public val getAccountsAccountPersonsPersonResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getAccountsAccountPersonsPersonResponseCodecAlternative1Codec)

  public val getAccountsAccountPersonsPersonRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getAccountsAccountPersonsPersonRequestCodec)

  public const val POSTACCOUNTSACCOUNTBANKACCOUNTS_REQUEST_CODEC_ID: String =
      "PostAccountsAccountBankAccounts.request"

  private val postAccountsAccountBankAccountsRequestCodec:
      MediaTypeCodec<InlineV1AccountsBankAccountsPostRequestFormX8a64f5af?> =
      PostAccountsAccountBankAccountsFormCodec

  private val postAccountsAccountBankAccountsResponseCodecAlternative0Codec:
      MediaTypeCodec<ExternalAccount> =
      KotlinxSerializationCodec("PostAccountsAccountBankAccounts.response.alternative0", ExternalAccount.Serializer, SdkJson)

  public val postAccountsAccountBankAccountsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ExternalAccount> =
      MediaTypeCodecRegistry.of(postAccountsAccountBankAccountsResponseCodecAlternative0Codec)

  private val postAccountsAccountBankAccountsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostAccountsAccountBankAccounts.response.alternative1", Error.Serializer, SdkJson)

  public val postAccountsAccountBankAccountsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postAccountsAccountBankAccountsResponseCodecAlternative1Codec)

  public val postAccountsAccountBankAccountsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1AccountsBankAccountsPostRequestFormX8a64f5af?> =
      MediaTypeCodecRegistry.of(postAccountsAccountBankAccountsRequestCodec)

  public const val POSTACCOUNTSACCOUNTBANKACCOUNTSID_REQUEST_CODEC_ID: String =
      "PostAccountsAccountBankAccountsId.request"

  private val postAccountsAccountBankAccountsIdRequestCodec:
      MediaTypeCodec<InlineV1AccountsBankAccountsPostRequestFormX16c7f6ea?> =
      PostAccountsAccountBankAccountsIdFormCodec

  private val postAccountsAccountBankAccountsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<ExternalAccount> =
      KotlinxSerializationCodec("PostAccountsAccountBankAccountsId.response.alternative0", ExternalAccount.Serializer, SdkJson)

  public val postAccountsAccountBankAccountsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ExternalAccount> =
      MediaTypeCodecRegistry.of(postAccountsAccountBankAccountsIdResponseCodecAlternative0Codec)

  private val postAccountsAccountBankAccountsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostAccountsAccountBankAccountsId.response.alternative1", Error.Serializer, SdkJson)

  public val postAccountsAccountBankAccountsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postAccountsAccountBankAccountsIdResponseCodecAlternative1Codec)

  public val postAccountsAccountBankAccountsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1AccountsBankAccountsPostRequestFormX16c7f6ea?> =
      MediaTypeCodecRegistry.of(postAccountsAccountBankAccountsIdRequestCodec)

  public const val POSTACCOUNTSACCOUNTCAPABILITIESCAPABILITY_REQUEST_CODEC_ID: String =
      "PostAccountsAccountCapabilitiesCapability.request"

  private val postAccountsAccountCapabilitiesCapabilityRequestCodec:
      MediaTypeCodec<InlineV1AccountsCapabilitiesPostRequestFormX67548eb6?> =
      PostAccountsAccountCapabilitiesCapabilityFormCodec

  private val postAccountsAccountCapabilitiesCapabilityResponseCodecAlternative0Codec:
      MediaTypeCodec<Capability> =
      KotlinxSerializationCodec("PostAccountsAccountCapabilitiesCapability.response.alternative0", Capability.Serializer, SdkJson)

  public val postAccountsAccountCapabilitiesCapabilityResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Capability> =
      MediaTypeCodecRegistry.of(postAccountsAccountCapabilitiesCapabilityResponseCodecAlternative0Codec)

  private val postAccountsAccountCapabilitiesCapabilityResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostAccountsAccountCapabilitiesCapability.response.alternative1", Error.Serializer, SdkJson)

  public val postAccountsAccountCapabilitiesCapabilityResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postAccountsAccountCapabilitiesCapabilityResponseCodecAlternative1Codec)

  public val postAccountsAccountCapabilitiesCapabilityRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1AccountsCapabilitiesPostRequestFormX67548eb6?> =
      MediaTypeCodecRegistry.of(postAccountsAccountCapabilitiesCapabilityRequestCodec)

  public const val POSTACCOUNTSACCOUNTEXTERNALACCOUNTS_REQUEST_CODEC_ID: String =
      "PostAccountsAccountExternalAccounts.request"

  private val postAccountsAccountExternalAccountsRequestCodec:
      MediaTypeCodec<InlineV1AccountsExternalAccountsPostRequestFormXe2d4c120?> =
      PostAccountsAccountExternalAccountsFormCodec

  private val postAccountsAccountExternalAccountsResponseCodecAlternative0Codec:
      MediaTypeCodec<ExternalAccount> =
      KotlinxSerializationCodec("PostAccountsAccountExternalAccounts.response.alternative0", ExternalAccount.Serializer, SdkJson)

  public val postAccountsAccountExternalAccountsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ExternalAccount> =
      MediaTypeCodecRegistry.of(postAccountsAccountExternalAccountsResponseCodecAlternative0Codec)

  private val postAccountsAccountExternalAccountsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostAccountsAccountExternalAccounts.response.alternative1", Error.Serializer, SdkJson)

  public val postAccountsAccountExternalAccountsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postAccountsAccountExternalAccountsResponseCodecAlternative1Codec)

  public val postAccountsAccountExternalAccountsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1AccountsExternalAccountsPostRequestFormXe2d4c120?> =
      MediaTypeCodecRegistry.of(postAccountsAccountExternalAccountsRequestCodec)

  public const val POSTACCOUNTSACCOUNTEXTERNALACCOUNTSID_REQUEST_CODEC_ID: String =
      "PostAccountsAccountExternalAccountsId.request"

  private val postAccountsAccountExternalAccountsIdRequestCodec:
      MediaTypeCodec<InlineV1AccountsExternalAccountsPostRequestFormX94e22b62?> =
      PostAccountsAccountExternalAccountsIdFormCodec

  private val postAccountsAccountExternalAccountsIdResponseCodecAlternative0Codec:
      MediaTypeCodec<ExternalAccount> =
      KotlinxSerializationCodec("PostAccountsAccountExternalAccountsId.response.alternative0", ExternalAccount.Serializer, SdkJson)

  public val postAccountsAccountExternalAccountsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ExternalAccount> =
      MediaTypeCodecRegistry.of(postAccountsAccountExternalAccountsIdResponseCodecAlternative0Codec)

  private val postAccountsAccountExternalAccountsIdResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostAccountsAccountExternalAccountsId.response.alternative1", Error.Serializer, SdkJson)

  public val postAccountsAccountExternalAccountsIdResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postAccountsAccountExternalAccountsIdResponseCodecAlternative1Codec)

  public val postAccountsAccountExternalAccountsIdRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1AccountsExternalAccountsPostRequestFormX94e22b62?> =
      MediaTypeCodecRegistry.of(postAccountsAccountExternalAccountsIdRequestCodec)

  public const val POSTACCOUNTSACCOUNTLOGINLINKS_REQUEST_CODEC_ID: String =
      "PostAccountsAccountLoginLinks.request"

  private val postAccountsAccountLoginLinksRequestCodec:
      MediaTypeCodec<InlineV1AccountsLoginLinksPostRequestFormX852839ba?> =
      PostAccountsAccountLoginLinksFormCodec

  private val postAccountsAccountLoginLinksResponseCodecAlternative0Codec: MediaTypeCodec<LoginLink>
      =
      KotlinxSerializationCodec("PostAccountsAccountLoginLinks.response.alternative0", LoginLink.Serializer, SdkJson)

  public val postAccountsAccountLoginLinksResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<LoginLink> =
      MediaTypeCodecRegistry.of(postAccountsAccountLoginLinksResponseCodecAlternative0Codec)

  private val postAccountsAccountLoginLinksResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostAccountsAccountLoginLinks.response.alternative1", Error.Serializer, SdkJson)

  public val postAccountsAccountLoginLinksResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postAccountsAccountLoginLinksResponseCodecAlternative1Codec)

  public val postAccountsAccountLoginLinksRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1AccountsLoginLinksPostRequestFormX852839ba?> =
      MediaTypeCodecRegistry.of(postAccountsAccountLoginLinksRequestCodec)

  public const val POSTACCOUNTSACCOUNTREJECT_REQUEST_CODEC_ID: String =
      "PostAccountsAccountReject.request"

  private val postAccountsAccountRejectRequestCodec:
      MediaTypeCodec<InlineV1AccountsRejectPostRequestFormXdb22fec1> =
      PostAccountsAccountRejectFormCodec

  private val postAccountsAccountRejectResponseCodecAlternative0Codec: MediaTypeCodec<Account> =
      KotlinxSerializationCodec("PostAccountsAccountReject.response.alternative0", Account.Serializer, SdkJson)

  public val postAccountsAccountRejectResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Account> =
      MediaTypeCodecRegistry.of(postAccountsAccountRejectResponseCodecAlternative0Codec)

  private val postAccountsAccountRejectResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostAccountsAccountReject.response.alternative1", Error.Serializer, SdkJson)

  public val postAccountsAccountRejectResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postAccountsAccountRejectResponseCodecAlternative1Codec)

  public val postAccountsAccountRejectRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1AccountsRejectPostRequestFormXdb22fec1> =
      MediaTypeCodecRegistry.of(postAccountsAccountRejectRequestCodec)

  public object DeleteAccountsAccountFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteAccountsAccount.request"

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

  public object DeleteAccountsAccountBankAccountsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteAccountsAccountBankAccountsId.request"

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

  public object DeleteAccountsAccountExternalAccountsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteAccountsAccountExternalAccountsId.request"

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

  public object DeleteAccountsAccountPeoplePersonFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteAccountsAccountPeoplePerson.request"

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

  public object DeleteAccountsAccountPersonsPersonFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "DeleteAccountsAccountPersonsPerson.request"

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

  public object GetAccountsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAccounts.request"

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

  public object GetAccountsAccountFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAccountsAccount.request"

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

  public object GetAccountsAccountBankAccountsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAccountsAccountBankAccountsId.request"

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

  public object GetAccountsAccountCapabilitiesFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAccountsAccountCapabilities.request"

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

  public object GetAccountsAccountCapabilitiesCapabilityFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAccountsAccountCapabilitiesCapability.request"

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

  public object GetAccountsAccountExternalAccountsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAccountsAccountExternalAccounts.request"

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

  public object GetAccountsAccountExternalAccountsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAccountsAccountExternalAccountsId.request"

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

  public object GetAccountsAccountPeopleFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAccountsAccountPeople.request"

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

  public object GetAccountsAccountPeoplePersonFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAccountsAccountPeoplePerson.request"

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

  public object GetAccountsAccountPersonsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAccountsAccountPersons.request"

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

  public object GetAccountsAccountPersonsPersonFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetAccountsAccountPersonsPerson.request"

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

  public object PostAccountsAccountBankAccountsFormCodec : MediaTypeCodec<InlineV1AccountsBankAccountsPostRequestFormX8a64f5af?> {
    override val id: String = "PostAccountsAccountBankAccounts.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1AccountsBankAccountsPostRequestFormX8a64f5af?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.bankAccount?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e != null -> {
            requireNotNull(formValue0.inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e).accountHolderName?.let { formValue3 ->
              form.add("bank_account" + "[account_holder_name]", formValue3)
            }
            requireNotNull(formValue0.inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e).accountHolderType?.let { formValue3 ->
              form.add("bank_account" + "[account_holder_type]", formValue3.value)
            }
            form.add("bank_account" + "[account_number]", requireNotNull(formValue0.inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e).accountNumber)
            requireNotNull(formValue0.inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e).accountType?.let { formValue3 ->
              form.add("bank_account" + "[account_type]", formValue3.value)
            }
            form.add("bank_account" + "[country]", requireNotNull(formValue0.inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e).country)
            requireNotNull(formValue0.inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e).currency?.let { formValue3 ->
              form.add("bank_account" + "[currency]", formValue3)
            }
            requireNotNull(formValue0.inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e).documents?.let { formValue3 ->
              formValue3.bankAccountOwnershipVerification?.let { formValue5 ->
                formValue5.files?.let { formValue7 ->
                  if (formValue7.isEmpty()) {
                    form.add("bank_account" + "[documents]" + "[bank_account_ownership_verification]" + "[files]", "")
                  } else {
                    formValue7.forEachIndexed { formIndex8, formElement8 ->
                      form.add("bank_account" + "[documents]" + "[bank_account_ownership_verification]" + "[files]" + "[" + formIndex8 + "]", formElement8)
                    }
                  }
                }
              }
            }
            requireNotNull(formValue0.inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e).objectValue?.let { formValue3 ->
              form.add("bank_account" + "[object]", formValue3.value)
            }
            requireNotNull(formValue0.inlineV1AccountsBankAccountsPostRequestFormBankAccountAnyOf1X21285d7e).routingNumber?.let { formValue3 ->
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
      request.defaultForCurrency?.let { formValue0 ->
        form.add("default_for_currency", formValue0.toString())
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
      request.externalAccount?.let { formValue0 ->
        form.add("external_account", formValue0)
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1AccountsBankAccountsPostRequestFormX8a64f5af? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostAccountsAccountBankAccountsIdFormCodec : MediaTypeCodec<InlineV1AccountsBankAccountsPostRequestFormX16c7f6ea?> {
    override val id: String = "PostAccountsAccountBankAccountsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1AccountsBankAccountsPostRequestFormX16c7f6ea?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.accountHolderName?.let { formValue0 ->
        form.add("account_holder_name", formValue0)
      }
      request.accountHolderType?.let { formValue0 ->
        form.add("account_holder_type", formValue0.value)
      }
      request.accountType?.let { formValue0 ->
        form.add("account_type", formValue0.value)
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
      request.defaultForCurrency?.let { formValue0 ->
        form.add("default_for_currency", formValue0.toString())
      }
      request.documents?.let { formValue0 ->
        formValue0.bankAccountOwnershipVerification?.let { formValue2 ->
          formValue2.files?.let { formValue4 ->
            if (formValue4.isEmpty()) {
              form.add("documents" + "[bank_account_ownership_verification]" + "[files]", "")
            } else {
              formValue4.forEachIndexed { formIndex5, formElement5 ->
                form.add("documents" + "[bank_account_ownership_verification]" + "[files]" + "[" + formIndex5 + "]", formElement5)
              }
            }
          }
        }
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
          formValue0.inlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1AccountsBankAccountsPostRequestFormMetadataAnyOf2Xa97b0a49).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1AccountsBankAccountsPostRequestFormX16c7f6ea? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostAccountsAccountCapabilitiesCapabilityFormCodec : MediaTypeCodec<InlineV1AccountsCapabilitiesPostRequestFormX67548eb6?> {
    override val id: String = "PostAccountsAccountCapabilitiesCapability.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1AccountsCapabilitiesPostRequestFormX67548eb6?, mediaType: String): SdkRequestBody {
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
      request.requested?.let { formValue0 ->
        form.add("requested", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1AccountsCapabilitiesPostRequestFormX67548eb6? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostAccountsAccountExternalAccountsFormCodec : MediaTypeCodec<InlineV1AccountsExternalAccountsPostRequestFormXe2d4c120?> {
    override val id: String = "PostAccountsAccountExternalAccounts.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1AccountsExternalAccountsPostRequestFormXe2d4c120?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.bankAccount?.let { formValue0 ->
        require(formValue0.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
        when {
          formValue0.inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4 != null -> {
            requireNotNull(formValue0.inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4).accountHolderName?.let { formValue3 ->
              form.add("bank_account" + "[account_holder_name]", formValue3)
            }
            requireNotNull(formValue0.inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4).accountHolderType?.let { formValue3 ->
              form.add("bank_account" + "[account_holder_type]", formValue3.value)
            }
            form.add("bank_account" + "[account_number]", requireNotNull(formValue0.inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4).accountNumber)
            requireNotNull(formValue0.inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4).accountType?.let { formValue3 ->
              form.add("bank_account" + "[account_type]", formValue3.value)
            }
            form.add("bank_account" + "[country]", requireNotNull(formValue0.inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4).country)
            requireNotNull(formValue0.inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4).currency?.let { formValue3 ->
              form.add("bank_account" + "[currency]", formValue3)
            }
            requireNotNull(formValue0.inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4).documents?.let { formValue3 ->
              formValue3.bankAccountOwnershipVerification?.let { formValue5 ->
                formValue5.files?.let { formValue7 ->
                  if (formValue7.isEmpty()) {
                    form.add("bank_account" + "[documents]" + "[bank_account_ownership_verification]" + "[files]", "")
                  } else {
                    formValue7.forEachIndexed { formIndex8, formElement8 ->
                      form.add("bank_account" + "[documents]" + "[bank_account_ownership_verification]" + "[files]" + "[" + formIndex8 + "]", formElement8)
                    }
                  }
                }
              }
            }
            requireNotNull(formValue0.inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4).objectValue?.let { formValue3 ->
              form.add("bank_account" + "[object]", formValue3.value)
            }
            requireNotNull(formValue0.inlineV1AccountsExternalAccountsPostRequestFormBankAccountAnyOf1X615b9fc4).routingNumber?.let { formValue3 ->
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
      request.defaultForCurrency?.let { formValue0 ->
        form.add("default_for_currency", formValue0.toString())
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
      request.externalAccount?.let { formValue0 ->
        form.add("external_account", formValue0)
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1AccountsExternalAccountsPostRequestFormXe2d4c120? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostAccountsAccountExternalAccountsIdFormCodec : MediaTypeCodec<InlineV1AccountsExternalAccountsPostRequestFormX94e22b62?> {
    override val id: String = "PostAccountsAccountExternalAccountsId.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1AccountsExternalAccountsPostRequestFormX94e22b62?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.accountHolderName?.let { formValue0 ->
        form.add("account_holder_name", formValue0)
      }
      request.accountHolderType?.let { formValue0 ->
        form.add("account_holder_type", formValue0.value)
      }
      request.accountType?.let { formValue0 ->
        form.add("account_type", formValue0.value)
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
      request.defaultForCurrency?.let { formValue0 ->
        form.add("default_for_currency", formValue0.toString())
      }
      request.documents?.let { formValue0 ->
        formValue0.bankAccountOwnershipVerification?.let { formValue2 ->
          formValue2.files?.let { formValue4 ->
            if (formValue4.isEmpty()) {
              form.add("documents" + "[bank_account_ownership_verification]" + "[files]", "")
            } else {
              formValue4.forEachIndexed { formIndex5, formElement5 ->
                form.add("documents" + "[bank_account_ownership_verification]" + "[files]" + "[" + formIndex5 + "]", formElement5)
              }
            }
          }
        }
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
          formValue0.inlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92 != null -> {
            form.add("metadata", requireNotNull(formValue0.inlineV1AccountsExternalAccountsPostRequestFormMetadataAnyOf2X4aa2db92).value)
          }
          else -> {
            error("Form union value has no selected branch")
          }
        }
      }
      request.name?.let { formValue0 ->
        form.add("name", formValue0)
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1AccountsExternalAccountsPostRequestFormX94e22b62? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostAccountsAccountLoginLinksFormCodec : MediaTypeCodec<InlineV1AccountsLoginLinksPostRequestFormX852839ba?> {
    override val id: String = "PostAccountsAccountLoginLinks.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1AccountsLoginLinksPostRequestFormX852839ba?, mediaType: String): SdkRequestBody {
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

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1AccountsLoginLinksPostRequestFormX852839ba? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  public object PostAccountsAccountRejectFormCodec : MediaTypeCodec<InlineV1AccountsRejectPostRequestFormXdb22fec1> {
    override val id: String = "PostAccountsAccountReject.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1AccountsRejectPostRequestFormXdb22fec1, mediaType: String): SdkRequestBody {
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
      form.add("reason", request.reason)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1AccountsRejectPostRequestFormXdb22fec1 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'accounts' group of Stripe API.
 */
public class AccountsClient(
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
      SdkExecutor(transport, authentication = this@AccountsClient.authentication)

  /**
   * <p>With <a href="/connect">Connect</a>, you can delete accounts you manage.</p>
   *
   * <p>Test-mode accounts can be deleted at any time.</p>
   *
   * <p>Live-mode accounts that have access to the standard dashboard and Stripe is responsible for negative account
   * balances cannot be deleted, which includes Standard accounts. All other Live-mode accounts, can be deleted when all
   * <a href="/api/balance/balance_object">balances</a> are zero.</p>
   *
   * <p>If you want to delete your own account, use the <a href="https://dashboard.stripe.com/settings/account">account
   * information tab in your account settings</a> instead.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param options Execution options.
   */
  public suspend fun deleteAccountsAccountWithResponse(
    request: JsonObject? = null,
    account: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteAccountsAccountResponse> = executor.executeWithResponse<JsonObject?, DeleteAccountsAccountResponse>(SdkExecutionRequest(deleteAccountsAccountMetadata, baseUri, request, listOf(AccountsCodecs.DELETEACCOUNTSACCOUNT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
  }), AccountsCodecs.deleteAccountsAccountRequestCodecRegistry, DeleteAccountsAccountResponseDecoder, options)

  /**
   * <p>Delete a specified external account for a given account.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param id Unique identifier for the external account to be deleted.
   * @param options Execution options.
   */
  public suspend fun deleteAccountsAccountBankAccountsIdWithResponse(
    request: JsonObject? = null,
    account: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteAccountsAccountBankAccountsIdResponse> = executor.executeWithResponse<JsonObject?, DeleteAccountsAccountBankAccountsIdResponse>(SdkExecutionRequest(deleteAccountsAccountBankAccountsIdMetadata, baseUri, request, listOf(AccountsCodecs.DELETEACCOUNTSACCOUNTBANKACCOUNTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), AccountsCodecs.deleteAccountsAccountBankAccountsIdRequestCodecRegistry, DeleteAccountsAccountBankAccountsIdResponseDecoder, options)

  /**
   * <p>Delete a specified external account for a given account.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param id Unique identifier for the external account to be deleted.
   * @param options Execution options.
   */
  public suspend fun deleteAccountsAccountExternalAccountsIdWithResponse(
    request: JsonObject? = null,
    account: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteAccountsAccountExternalAccountsIdResponse> = executor.executeWithResponse<JsonObject?, DeleteAccountsAccountExternalAccountsIdResponse>(SdkExecutionRequest(deleteAccountsAccountExternalAccountsIdMetadata, baseUri, request, listOf(AccountsCodecs.DELETEACCOUNTSACCOUNTEXTERNALACCOUNTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), AccountsCodecs.deleteAccountsAccountExternalAccountsIdRequestCodecRegistry, DeleteAccountsAccountExternalAccountsIdResponseDecoder, options)

  /**
   * <p>Deletes an existing person’s relationship to the account’s legal entity. Any person with a relationship for an
   * account can be deleted through the API, except if the person is the <code>account_opener</code>. If your
   * integration is using the <code>executive</code> parameter, you cannot delete the only verified
   * <code>executive</code> on file.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param person Wire parameter `person`.
   * @param options Execution options.
   */
  public suspend fun deleteAccountsAccountPeoplePersonWithResponse(
    request: JsonObject? = null,
    account: String,
    person: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteAccountsAccountPeoplePersonResponse> = executor.executeWithResponse<JsonObject?, DeleteAccountsAccountPeoplePersonResponse>(SdkExecutionRequest(deleteAccountsAccountPeoplePersonMetadata, baseUri, request, listOf(AccountsCodecs.DELETEACCOUNTSACCOUNTPEOPLEPERSON_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "person", values = listOf(person.toString())))
  }), AccountsCodecs.deleteAccountsAccountPeoplePersonRequestCodecRegistry, DeleteAccountsAccountPeoplePersonResponseDecoder, options)

  /**
   * <p>Deletes an existing person’s relationship to the account’s legal entity. Any person with a relationship for an
   * account can be deleted through the API, except if the person is the <code>account_opener</code>. If your
   * integration is using the <code>executive</code> parameter, you cannot delete the only verified
   * <code>executive</code> on file.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param person Wire parameter `person`.
   * @param options Execution options.
   */
  public suspend fun deleteAccountsAccountPersonsPersonWithResponse(
    request: JsonObject? = null,
    account: String,
    person: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteAccountsAccountPersonsPersonResponse> = executor.executeWithResponse<JsonObject?, DeleteAccountsAccountPersonsPersonResponse>(SdkExecutionRequest(deleteAccountsAccountPersonsPersonMetadata, baseUri, request, listOf(AccountsCodecs.DELETEACCOUNTSACCOUNTPERSONSPERSON_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "person", values = listOf(person.toString())))
  }), AccountsCodecs.deleteAccountsAccountPersonsPersonRequestCodecRegistry, DeleteAccountsAccountPersonsPersonResponseDecoder, options)

  /**
   * <p>Returns a list of accounts connected to your platform via <a href="/docs/connect">Connect</a>. If you’re not a
   * platform, the list is empty.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param created Only return connected accounts that were created during the given date interval.
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
  public suspend fun getAccountsWithResponse(
    request: JsonObject? = null,
    created: InlineV1AccountsGetParameterXaa6c7ce8? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAccountsResponse> = executor.executeWithResponse<JsonObject?, GetAccountsResponse>(SdkExecutionRequest(getAccountsMetadata, baseUri, request, listOf(AccountsCodecs.GETACCOUNTS_REQUEST_CODEC_ID), buildList {
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
  }), AccountsCodecs.getAccountsRequestCodecRegistry, GetAccountsResponseDecoder, options)

  /**
   * <p>Retrieves the details of an account.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getAccountsAccountWithResponse(
    request: JsonObject? = null,
    account: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAccountsAccountResponse> = executor.executeWithResponse<JsonObject?, GetAccountsAccountResponse>(SdkExecutionRequest(getAccountsAccountMetadata, baseUri, request, listOf(AccountsCodecs.GETACCOUNTSACCOUNT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), AccountsCodecs.getAccountsAccountRequestCodecRegistry, GetAccountsAccountResponseDecoder, options)

  /**
   * <p>Retrieve a specified external account for a given account.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param id Unique identifier for the external account to be retrieved.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getAccountsAccountBankAccountsIdWithResponse(
    request: JsonObject? = null,
    account: String,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAccountsAccountBankAccountsIdResponse> = executor.executeWithResponse<JsonObject?, GetAccountsAccountBankAccountsIdResponse>(SdkExecutionRequest(getAccountsAccountBankAccountsIdMetadata, baseUri, request, listOf(AccountsCodecs.GETACCOUNTSACCOUNTBANKACCOUNTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), AccountsCodecs.getAccountsAccountBankAccountsIdRequestCodecRegistry, GetAccountsAccountBankAccountsIdResponseDecoder, options)

  /**
   * <p>Returns a list of capabilities associated with the account. The capabilities are returned sorted by creation
   * date, with the most recent capability appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getAccountsAccountCapabilitiesWithResponse(
    request: JsonObject? = null,
    account: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAccountsAccountCapabilitiesResponse> = executor.executeWithResponse<JsonObject?, GetAccountsAccountCapabilitiesResponse>(SdkExecutionRequest(getAccountsAccountCapabilitiesMetadata, baseUri, request, listOf(AccountsCodecs.GETACCOUNTSACCOUNTCAPABILITIES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), AccountsCodecs.getAccountsAccountCapabilitiesRequestCodecRegistry, GetAccountsAccountCapabilitiesResponseDecoder, options)

  /**
   * <p>Retrieves information about the specified Account Capability.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param capability Wire parameter `capability`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getAccountsAccountCapabilitiesCapabilityWithResponse(
    request: JsonObject? = null,
    account: String,
    capability: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAccountsAccountCapabilitiesCapabilityResponse> = executor.executeWithResponse<JsonObject?, GetAccountsAccountCapabilitiesCapabilityResponse>(SdkExecutionRequest(getAccountsAccountCapabilitiesCapabilityMetadata, baseUri, request, listOf(AccountsCodecs.GETACCOUNTSACCOUNTCAPABILITIESCAPABILITY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "capability", values = listOf(capability.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), AccountsCodecs.getAccountsAccountCapabilitiesCapabilityRequestCodecRegistry, GetAccountsAccountCapabilitiesCapabilityResponseDecoder, options)

  /**
   * <p>List external accounts for an account.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param objectValue Filter external accounts according to a particular object type.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getAccountsAccountExternalAccountsWithResponse(
    request: JsonObject? = null,
    account: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    objectValue: InlineV1AccountsExternalAccountsGetParameterX44f2e643? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAccountsAccountExternalAccountsResponse> = executor.executeWithResponse<JsonObject?, GetAccountsAccountExternalAccountsResponse>(SdkExecutionRequest(getAccountsAccountExternalAccountsMetadata, baseUri, request, listOf(AccountsCodecs.GETACCOUNTSACCOUNTEXTERNALACCOUNTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "object", values = objectValue?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), AccountsCodecs.getAccountsAccountExternalAccountsRequestCodecRegistry, GetAccountsAccountExternalAccountsResponseDecoder, options)

  /**
   * <p>Retrieve a specified external account for a given account.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param id Unique identifier for the external account to be retrieved.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getAccountsAccountExternalAccountsIdWithResponse(
    request: JsonObject? = null,
    account: String,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAccountsAccountExternalAccountsIdResponse> = executor.executeWithResponse<JsonObject?, GetAccountsAccountExternalAccountsIdResponse>(SdkExecutionRequest(getAccountsAccountExternalAccountsIdMetadata, baseUri, request, listOf(AccountsCodecs.GETACCOUNTSACCOUNTEXTERNALACCOUNTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), AccountsCodecs.getAccountsAccountExternalAccountsIdRequestCodecRegistry, GetAccountsAccountExternalAccountsIdResponseDecoder, options)

  /**
   * <p>Returns a list of people associated with the account’s legal entity. The people are returned sorted by creation
   * date, with the most recent people appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param relationship Filters on the list of people returned based on the person's relationship to the account's
   * company.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getAccountsAccountPeopleWithResponse(
    request: JsonObject? = null,
    account: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    relationship: InlineV1AccountsPeopleGetParameterX0eeaf8d2? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAccountsAccountPeopleResponse> = executor.executeWithResponse<JsonObject?, GetAccountsAccountPeopleResponse>(SdkExecutionRequest(getAccountsAccountPeopleMetadata, baseUri, request, listOf(AccountsCodecs.GETACCOUNTSACCOUNTPEOPLE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[authorizer]", values = relationship?.authorizer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[director]", values = relationship?.director?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[executive]", values = relationship?.executive?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[legal_guardian]", values = relationship?.legalGuardian?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[owner]", values = relationship?.owner?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[representative]", values = relationship?.representative?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), AccountsCodecs.getAccountsAccountPeopleRequestCodecRegistry, GetAccountsAccountPeopleResponseDecoder, options)

  /**
   * <p>Retrieves an existing person.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param person Wire parameter `person`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getAccountsAccountPeoplePersonWithResponse(
    request: JsonObject? = null,
    account: String,
    person: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAccountsAccountPeoplePersonResponse> = executor.executeWithResponse<JsonObject?, GetAccountsAccountPeoplePersonResponse>(SdkExecutionRequest(getAccountsAccountPeoplePersonMetadata, baseUri, request, listOf(AccountsCodecs.GETACCOUNTSACCOUNTPEOPLEPERSON_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "person", values = listOf(person.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), AccountsCodecs.getAccountsAccountPeoplePersonRequestCodecRegistry, GetAccountsAccountPeoplePersonResponseDecoder, options)

  /**
   * <p>Returns a list of people associated with the account’s legal entity. The people are returned sorted by creation
   * date, with the most recent people appearing first.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param endingBefore A cursor for use in pagination. `ending_before` is an object ID that defines your place in the
   * list. For instance, if you make a list request and receive 100 objects, starting with `obj_bar`, your subsequent
   * call can include `ending_before=obj_bar` in order to fetch the previous page of the list.
   * @param expand Specifies which fields in the response should be expanded.
   * @param limit A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is
   * 10.
   * @param relationship Filters on the list of people returned based on the person's relationship to the account's
   * company.
   * @param startingAfter A cursor for use in pagination. `starting_after` is an object ID that defines your place in
   * the list. For instance, if you make a list request and receive 100 objects, ending with `obj_foo`, your subsequent
   * call can include `starting_after=obj_foo` in order to fetch the next page of the list.
   * @param options Execution options.
   */
  public suspend fun getAccountsAccountPersonsWithResponse(
    request: JsonObject? = null,
    account: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    relationship: InlineV1AccountsPersonsGetParameterX9889ba8f? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAccountsAccountPersonsResponse> = executor.executeWithResponse<JsonObject?, GetAccountsAccountPersonsResponse>(SdkExecutionRequest(getAccountsAccountPersonsMetadata, baseUri, request, listOf(AccountsCodecs.GETACCOUNTSACCOUNTPERSONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[authorizer]", values = relationship?.authorizer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[director]", values = relationship?.director?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[executive]", values = relationship?.executive?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[legal_guardian]", values = relationship?.legalGuardian?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[owner]", values = relationship?.owner?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "relationship[representative]", values = relationship?.representative?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), AccountsCodecs.getAccountsAccountPersonsRequestCodecRegistry, GetAccountsAccountPersonsResponseDecoder, options)

  /**
   * <p>Retrieves an existing person.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param person Wire parameter `person`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getAccountsAccountPersonsPersonWithResponse(
    request: JsonObject? = null,
    account: String,
    person: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAccountsAccountPersonsPersonResponse> = executor.executeWithResponse<JsonObject?, GetAccountsAccountPersonsPersonResponse>(SdkExecutionRequest(getAccountsAccountPersonsPersonMetadata, baseUri, request, listOf(AccountsCodecs.GETACCOUNTSACCOUNTPERSONSPERSON_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "person", values = listOf(person.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), AccountsCodecs.getAccountsAccountPersonsPersonRequestCodecRegistry, GetAccountsAccountPersonsPersonResponseDecoder, options)

  /**
   * <p>Create an external account for a given account.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param options Execution options.
   */
  public suspend fun postAccountsAccountBankAccountsWithResponse(
    request: InlineV1AccountsBankAccountsPostRequestFormX8a64f5af? = null,
    account: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostAccountsAccountBankAccountsResponse> = executor.executeWithResponse<InlineV1AccountsBankAccountsPostRequestFormX8a64f5af?, PostAccountsAccountBankAccountsResponse>(SdkExecutionRequest(postAccountsAccountBankAccountsMetadata, baseUri, request, listOf(AccountsCodecs.POSTACCOUNTSACCOUNTBANKACCOUNTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
  }), AccountsCodecs.postAccountsAccountBankAccountsRequestCodecRegistry, PostAccountsAccountBankAccountsResponseDecoder, options)

  /**
   * <p>Updates the metadata, account holder name, account holder type of a bank account belonging to
   * a connected account and optionally sets it as the default for its currency. Other bank account
   * details are not editable by design.</p>
   *
   * <p>You can only update bank accounts when <a
   * href="/api/accounts/object#account_object-controller-requirement_collection">account.controller.requirement_collect
   * ion</a> is <code>application</code>, which includes <a href="/connect/custom-accounts">Custom accounts</a>.</p>
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postAccountsAccountBankAccountsIdWithResponse(
    request: InlineV1AccountsBankAccountsPostRequestFormX16c7f6ea? = null,
    account: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostAccountsAccountBankAccountsIdResponse> = executor.executeWithResponse<InlineV1AccountsBankAccountsPostRequestFormX16c7f6ea?, PostAccountsAccountBankAccountsIdResponse>(SdkExecutionRequest(postAccountsAccountBankAccountsIdMetadata, baseUri, request, listOf(AccountsCodecs.POSTACCOUNTSACCOUNTBANKACCOUNTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), AccountsCodecs.postAccountsAccountBankAccountsIdRequestCodecRegistry, PostAccountsAccountBankAccountsIdResponseDecoder, options)

  /**
   * <p>Updates an existing Account Capability. Request or remove a capability by updating its <code>requested</code>
   * parameter.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param capability Wire parameter `capability`.
   * @param options Execution options.
   */
  public suspend fun postAccountsAccountCapabilitiesCapabilityWithResponse(
    request: InlineV1AccountsCapabilitiesPostRequestFormX67548eb6? = null,
    account: String,
    capability: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostAccountsAccountCapabilitiesCapabilityResponse> = executor.executeWithResponse<InlineV1AccountsCapabilitiesPostRequestFormX67548eb6?, PostAccountsAccountCapabilitiesCapabilityResponse>(SdkExecutionRequest(postAccountsAccountCapabilitiesCapabilityMetadata, baseUri, request, listOf(AccountsCodecs.POSTACCOUNTSACCOUNTCAPABILITIESCAPABILITY_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "capability", values = listOf(capability.toString())))
  }), AccountsCodecs.postAccountsAccountCapabilitiesCapabilityRequestCodecRegistry, PostAccountsAccountCapabilitiesCapabilityResponseDecoder, options)

  /**
   * <p>Create an external account for a given account.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param options Execution options.
   */
  public suspend fun postAccountsAccountExternalAccountsWithResponse(
    request: InlineV1AccountsExternalAccountsPostRequestFormXe2d4c120? = null,
    account: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostAccountsAccountExternalAccountsResponse> = executor.executeWithResponse<InlineV1AccountsExternalAccountsPostRequestFormXe2d4c120?, PostAccountsAccountExternalAccountsResponse>(SdkExecutionRequest(postAccountsAccountExternalAccountsMetadata, baseUri, request, listOf(AccountsCodecs.POSTACCOUNTSACCOUNTEXTERNALACCOUNTS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
  }), AccountsCodecs.postAccountsAccountExternalAccountsRequestCodecRegistry, PostAccountsAccountExternalAccountsResponseDecoder, options)

  /**
   * <p>Updates the metadata, account holder name, account holder type of a bank account belonging to
   * a connected account and optionally sets it as the default for its currency. Other bank account
   * details are not editable by design.</p>
   *
   * <p>You can only update bank accounts when <a
   * href="/api/accounts/object#account_object-controller-requirement_collection">account.controller.requirement_collect
   * ion</a> is <code>application</code>, which includes <a href="/connect/custom-accounts">Custom accounts</a>.</p>
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param id Wire parameter `id`.
   * @param options Execution options.
   */
  public suspend fun postAccountsAccountExternalAccountsIdWithResponse(
    request: InlineV1AccountsExternalAccountsPostRequestFormX94e22b62? = null,
    account: String,
    id: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostAccountsAccountExternalAccountsIdResponse> = executor.executeWithResponse<InlineV1AccountsExternalAccountsPostRequestFormX94e22b62?, PostAccountsAccountExternalAccountsIdResponse>(SdkExecutionRequest(postAccountsAccountExternalAccountsIdMetadata, baseUri, request, listOf(AccountsCodecs.POSTACCOUNTSACCOUNTEXTERNALACCOUNTSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
  }), AccountsCodecs.postAccountsAccountExternalAccountsIdRequestCodecRegistry, PostAccountsAccountExternalAccountsIdResponseDecoder, options)

  /**
   * <p>Creates a login link for a connected account to access the Express Dashboard.</p>
   *
   * <p><strong>You can only create login links for accounts that use the <a href="/connect/express-dashboard">Express
   * Dashboard</a> and are connected to your platform</strong>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param options Execution options.
   */
  public suspend fun postAccountsAccountLoginLinksWithResponse(
    request: InlineV1AccountsLoginLinksPostRequestFormX852839ba? = null,
    account: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostAccountsAccountLoginLinksResponse> = executor.executeWithResponse<InlineV1AccountsLoginLinksPostRequestFormX852839ba?, PostAccountsAccountLoginLinksResponse>(SdkExecutionRequest(postAccountsAccountLoginLinksMetadata, baseUri, request, listOf(AccountsCodecs.POSTACCOUNTSACCOUNTLOGINLINKS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
  }), AccountsCodecs.postAccountsAccountLoginLinksRequestCodecRegistry, PostAccountsAccountLoginLinksResponseDecoder, options)

  /**
   * <p>With <a href="/connect">Connect</a>, you can reject accounts that you have flagged as suspicious.</p>
   *
   * <p>Only accounts where your platform is liable for negative account balances, which includes Custom and Express
   * accounts, can be rejected. Test-mode accounts can be rejected at any time. Live-mode accounts can only be rejected
   * after all balances are zero.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param account Wire parameter `account`.
   * @param options Execution options.
   */
  public suspend fun postAccountsAccountRejectWithResponse(
    request: InlineV1AccountsRejectPostRequestFormXdb22fec1,
    account: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<PostAccountsAccountRejectResponse> = executor.executeWithResponse<InlineV1AccountsRejectPostRequestFormXdb22fec1, PostAccountsAccountRejectResponse>(SdkExecutionRequest(postAccountsAccountRejectMetadata, baseUri, request, listOf(AccountsCodecs.POSTACCOUNTSACCOUNTREJECT_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "account", values = listOf(account.toString())))
  }), AccountsCodecs.postAccountsAccountRejectRequestCodecRegistry, PostAccountsAccountRejectResponseDecoder, options)

  /**
   * Typed response alternatives for `DeleteAccountsAccount`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface DeleteAccountsAccountResponse {
    public class SuccessJson(
      public val json: DeletedAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountResponse
  }

  private object DeleteAccountsAccountResponseDecoder : SdkResponseAlternativeDecoder<DeleteAccountsAccountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteAccountsAccountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteAccountsAccountResponse> = when {
      alternative.id == "DeleteAccountsAccount.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteAccountsAccountResponse.SuccessJson(
          json = AccountsCodecs.deleteAccountsAccountResponseCodecAlternative0Registry.select(listOf("DeleteAccountsAccount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteAccountsAccount.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteAccountsAccountResponse.DefaultJson(
          json = AccountsCodecs.deleteAccountsAccountResponseCodecAlternative1Registry.select(listOf("DeleteAccountsAccount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteAccountsAccountResponse = DeleteAccountsAccountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteAccountsAccountBankAccountsId`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface DeleteAccountsAccountBankAccountsIdResponse {
    public class SuccessJson(
      public val json: DeletedExternalAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountBankAccountsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountBankAccountsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountBankAccountsIdResponse
  }

  private object DeleteAccountsAccountBankAccountsIdResponseDecoder : SdkResponseAlternativeDecoder<DeleteAccountsAccountBankAccountsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteAccountsAccountBankAccountsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteAccountsAccountBankAccountsIdResponse> = when {
      alternative.id == "DeleteAccountsAccountBankAccountsId.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteAccountsAccountBankAccountsIdResponse.SuccessJson(
          json = AccountsCodecs.deleteAccountsAccountBankAccountsIdResponseCodecAlternative0Registry.select(listOf("DeleteAccountsAccountBankAccountsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteAccountsAccountBankAccountsId.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteAccountsAccountBankAccountsIdResponse.DefaultJson(
          json = AccountsCodecs.deleteAccountsAccountBankAccountsIdResponseCodecAlternative1Registry.select(listOf("DeleteAccountsAccountBankAccountsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteAccountsAccountBankAccountsIdResponse = DeleteAccountsAccountBankAccountsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteAccountsAccountExternalAccountsId`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface DeleteAccountsAccountExternalAccountsIdResponse {
    public class SuccessJson(
      public val json: DeletedExternalAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountExternalAccountsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountExternalAccountsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountExternalAccountsIdResponse
  }

  private object DeleteAccountsAccountExternalAccountsIdResponseDecoder : SdkResponseAlternativeDecoder<DeleteAccountsAccountExternalAccountsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteAccountsAccountExternalAccountsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteAccountsAccountExternalAccountsIdResponse> = when {
      alternative.id == "DeleteAccountsAccountExternalAccountsId.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteAccountsAccountExternalAccountsIdResponse.SuccessJson(
          json = AccountsCodecs.deleteAccountsAccountExternalAccountsIdResponseCodecAlternative0Registry.select(listOf("DeleteAccountsAccountExternalAccountsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteAccountsAccountExternalAccountsId.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteAccountsAccountExternalAccountsIdResponse.DefaultJson(
          json = AccountsCodecs.deleteAccountsAccountExternalAccountsIdResponseCodecAlternative1Registry.select(listOf("DeleteAccountsAccountExternalAccountsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteAccountsAccountExternalAccountsIdResponse = DeleteAccountsAccountExternalAccountsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteAccountsAccountPeoplePerson`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface DeleteAccountsAccountPeoplePersonResponse {
    public class SuccessJson(
      public val json: DeletedPerson,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountPeoplePersonResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountPeoplePersonResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountPeoplePersonResponse
  }

  private object DeleteAccountsAccountPeoplePersonResponseDecoder : SdkResponseAlternativeDecoder<DeleteAccountsAccountPeoplePersonResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteAccountsAccountPeoplePersonResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteAccountsAccountPeoplePersonResponse> = when {
      alternative.id == "DeleteAccountsAccountPeoplePerson.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteAccountsAccountPeoplePersonResponse.SuccessJson(
          json = AccountsCodecs.deleteAccountsAccountPeoplePersonResponseCodecAlternative0Registry.select(listOf("DeleteAccountsAccountPeoplePerson.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteAccountsAccountPeoplePerson.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteAccountsAccountPeoplePersonResponse.DefaultJson(
          json = AccountsCodecs.deleteAccountsAccountPeoplePersonResponseCodecAlternative1Registry.select(listOf("DeleteAccountsAccountPeoplePerson.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteAccountsAccountPeoplePersonResponse = DeleteAccountsAccountPeoplePersonResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `DeleteAccountsAccountPersonsPerson`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface DeleteAccountsAccountPersonsPersonResponse {
    public class SuccessJson(
      public val json: DeletedPerson,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountPersonsPersonResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountPersonsPersonResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteAccountsAccountPersonsPersonResponse
  }

  private object DeleteAccountsAccountPersonsPersonResponseDecoder : SdkResponseAlternativeDecoder<DeleteAccountsAccountPersonsPersonResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteAccountsAccountPersonsPersonResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteAccountsAccountPersonsPersonResponse> = when {
      alternative.id == "DeleteAccountsAccountPersonsPerson.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteAccountsAccountPersonsPersonResponse.SuccessJson(
          json = AccountsCodecs.deleteAccountsAccountPersonsPersonResponseCodecAlternative0Registry.select(listOf("DeleteAccountsAccountPersonsPerson.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "DeleteAccountsAccountPersonsPerson.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteAccountsAccountPersonsPersonResponse.DefaultJson(
          json = AccountsCodecs.deleteAccountsAccountPersonsPersonResponseCodecAlternative1Registry.select(listOf("DeleteAccountsAccountPersonsPerson.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteAccountsAccountPersonsPersonResponse = DeleteAccountsAccountPersonsPersonResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAccounts`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetAccountsResponse {
    public class SuccessJson(
      public val json: InlineV1AccountsGetResponse200JsonX1b6b3724,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsResponse
  }

  private object GetAccountsResponseDecoder : SdkResponseAlternativeDecoder<GetAccountsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAccountsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAccountsResponse> = when {
      alternative.id == "GetAccounts.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAccountsResponse.SuccessJson(
          json = AccountsCodecs.getAccountsResponseCodecAlternative0Registry.select(listOf("GetAccounts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAccounts.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAccountsResponse.DefaultJson(
          json = AccountsCodecs.getAccountsResponseCodecAlternative1Registry.select(listOf("GetAccounts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAccountsResponse = GetAccountsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAccountsAccount`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetAccountsAccountResponse {
    public class SuccessJson(
      public val json: Account,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountResponse
  }

  private object GetAccountsAccountResponseDecoder : SdkResponseAlternativeDecoder<GetAccountsAccountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAccountsAccountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAccountsAccountResponse> = when {
      alternative.id == "GetAccountsAccount.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAccountsAccountResponse.SuccessJson(
          json = AccountsCodecs.getAccountsAccountResponseCodecAlternative0Registry.select(listOf("GetAccountsAccount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAccountsAccount.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAccountsAccountResponse.DefaultJson(
          json = AccountsCodecs.getAccountsAccountResponseCodecAlternative1Registry.select(listOf("GetAccountsAccount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAccountsAccountResponse = GetAccountsAccountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAccountsAccountBankAccountsId`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetAccountsAccountBankAccountsIdResponse {
    public class SuccessJson(
      public val json: ExternalAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountBankAccountsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountBankAccountsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountBankAccountsIdResponse
  }

  private object GetAccountsAccountBankAccountsIdResponseDecoder : SdkResponseAlternativeDecoder<GetAccountsAccountBankAccountsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAccountsAccountBankAccountsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAccountsAccountBankAccountsIdResponse> = when {
      alternative.id == "GetAccountsAccountBankAccountsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAccountsAccountBankAccountsIdResponse.SuccessJson(
          json = AccountsCodecs.getAccountsAccountBankAccountsIdResponseCodecAlternative0Registry.select(listOf("GetAccountsAccountBankAccountsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAccountsAccountBankAccountsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAccountsAccountBankAccountsIdResponse.DefaultJson(
          json = AccountsCodecs.getAccountsAccountBankAccountsIdResponseCodecAlternative1Registry.select(listOf("GetAccountsAccountBankAccountsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAccountsAccountBankAccountsIdResponse = GetAccountsAccountBankAccountsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAccountsAccountCapabilities`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetAccountsAccountCapabilitiesResponse {
    public class SuccessJson(
      public val json: InlineV1AccountsCapabilitiesGetResponse200JsonX87f9b592,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountCapabilitiesResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountCapabilitiesResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountCapabilitiesResponse
  }

  private object GetAccountsAccountCapabilitiesResponseDecoder : SdkResponseAlternativeDecoder<GetAccountsAccountCapabilitiesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAccountsAccountCapabilitiesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAccountsAccountCapabilitiesResponse> = when {
      alternative.id == "GetAccountsAccountCapabilities.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAccountsAccountCapabilitiesResponse.SuccessJson(
          json = AccountsCodecs.getAccountsAccountCapabilitiesResponseCodecAlternative0Registry.select(listOf("GetAccountsAccountCapabilities.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAccountsAccountCapabilities.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAccountsAccountCapabilitiesResponse.DefaultJson(
          json = AccountsCodecs.getAccountsAccountCapabilitiesResponseCodecAlternative1Registry.select(listOf("GetAccountsAccountCapabilities.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAccountsAccountCapabilitiesResponse = GetAccountsAccountCapabilitiesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAccountsAccountCapabilitiesCapability`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetAccountsAccountCapabilitiesCapabilityResponse {
    public class SuccessJson(
      public val json: Capability,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountCapabilitiesCapabilityResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountCapabilitiesCapabilityResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountCapabilitiesCapabilityResponse
  }

  private object GetAccountsAccountCapabilitiesCapabilityResponseDecoder : SdkResponseAlternativeDecoder<GetAccountsAccountCapabilitiesCapabilityResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAccountsAccountCapabilitiesCapabilityResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAccountsAccountCapabilitiesCapabilityResponse> = when {
      alternative.id == "GetAccountsAccountCapabilitiesCapability.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAccountsAccountCapabilitiesCapabilityResponse.SuccessJson(
          json = AccountsCodecs.getAccountsAccountCapabilitiesCapabilityResponseCodecAlternative0Registry.select(listOf("GetAccountsAccountCapabilitiesCapability.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAccountsAccountCapabilitiesCapability.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAccountsAccountCapabilitiesCapabilityResponse.DefaultJson(
          json = AccountsCodecs.getAccountsAccountCapabilitiesCapabilityResponseCodecAlternative1Registry.select(listOf("GetAccountsAccountCapabilitiesCapability.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAccountsAccountCapabilitiesCapabilityResponse = GetAccountsAccountCapabilitiesCapabilityResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAccountsAccountExternalAccounts`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetAccountsAccountExternalAccountsResponse {
    public class SuccessJson(
      public val json: InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountExternalAccountsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountExternalAccountsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountExternalAccountsResponse
  }

  private object GetAccountsAccountExternalAccountsResponseDecoder : SdkResponseAlternativeDecoder<GetAccountsAccountExternalAccountsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAccountsAccountExternalAccountsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAccountsAccountExternalAccountsResponse> = when {
      alternative.id == "GetAccountsAccountExternalAccounts.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAccountsAccountExternalAccountsResponse.SuccessJson(
          json = AccountsCodecs.getAccountsAccountExternalAccountsResponseCodecAlternative0Registry.select(listOf("GetAccountsAccountExternalAccounts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAccountsAccountExternalAccounts.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAccountsAccountExternalAccountsResponse.DefaultJson(
          json = AccountsCodecs.getAccountsAccountExternalAccountsResponseCodecAlternative1Registry.select(listOf("GetAccountsAccountExternalAccounts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAccountsAccountExternalAccountsResponse = GetAccountsAccountExternalAccountsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAccountsAccountExternalAccountsId`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface GetAccountsAccountExternalAccountsIdResponse {
    public class SuccessJson(
      public val json: ExternalAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountExternalAccountsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountExternalAccountsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountExternalAccountsIdResponse
  }

  private object GetAccountsAccountExternalAccountsIdResponseDecoder : SdkResponseAlternativeDecoder<GetAccountsAccountExternalAccountsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAccountsAccountExternalAccountsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAccountsAccountExternalAccountsIdResponse> = when {
      alternative.id == "GetAccountsAccountExternalAccountsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAccountsAccountExternalAccountsIdResponse.SuccessJson(
          json = AccountsCodecs.getAccountsAccountExternalAccountsIdResponseCodecAlternative0Registry.select(listOf("GetAccountsAccountExternalAccountsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAccountsAccountExternalAccountsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAccountsAccountExternalAccountsIdResponse.DefaultJson(
          json = AccountsCodecs.getAccountsAccountExternalAccountsIdResponseCodecAlternative1Registry.select(listOf("GetAccountsAccountExternalAccountsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAccountsAccountExternalAccountsIdResponse = GetAccountsAccountExternalAccountsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAccountsAccountPeople`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetAccountsAccountPeopleResponse {
    public class SuccessJson(
      public val json: InlineV1AccountsPeopleGetResponse200JsonX4b2e5b26,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPeopleResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPeopleResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPeopleResponse
  }

  private object GetAccountsAccountPeopleResponseDecoder : SdkResponseAlternativeDecoder<GetAccountsAccountPeopleResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAccountsAccountPeopleResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAccountsAccountPeopleResponse> = when {
      alternative.id == "GetAccountsAccountPeople.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAccountsAccountPeopleResponse.SuccessJson(
          json = AccountsCodecs.getAccountsAccountPeopleResponseCodecAlternative0Registry.select(listOf("GetAccountsAccountPeople.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAccountsAccountPeople.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAccountsAccountPeopleResponse.DefaultJson(
          json = AccountsCodecs.getAccountsAccountPeopleResponseCodecAlternative1Registry.select(listOf("GetAccountsAccountPeople.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAccountsAccountPeopleResponse = GetAccountsAccountPeopleResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAccountsAccountPeoplePerson`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetAccountsAccountPeoplePersonResponse {
    public class SuccessJson(
      public val json: Person,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPeoplePersonResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPeoplePersonResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPeoplePersonResponse
  }

  private object GetAccountsAccountPeoplePersonResponseDecoder : SdkResponseAlternativeDecoder<GetAccountsAccountPeoplePersonResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAccountsAccountPeoplePersonResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAccountsAccountPeoplePersonResponse> = when {
      alternative.id == "GetAccountsAccountPeoplePerson.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAccountsAccountPeoplePersonResponse.SuccessJson(
          json = AccountsCodecs.getAccountsAccountPeoplePersonResponseCodecAlternative0Registry.select(listOf("GetAccountsAccountPeoplePerson.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAccountsAccountPeoplePerson.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAccountsAccountPeoplePersonResponse.DefaultJson(
          json = AccountsCodecs.getAccountsAccountPeoplePersonResponseCodecAlternative1Registry.select(listOf("GetAccountsAccountPeoplePerson.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAccountsAccountPeoplePersonResponse = GetAccountsAccountPeoplePersonResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAccountsAccountPersons`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetAccountsAccountPersonsResponse {
    public class SuccessJson(
      public val json: InlineV1AccountsPersonsGetResponse200JsonXe630747d,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPersonsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPersonsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPersonsResponse
  }

  private object GetAccountsAccountPersonsResponseDecoder : SdkResponseAlternativeDecoder<GetAccountsAccountPersonsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAccountsAccountPersonsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAccountsAccountPersonsResponse> = when {
      alternative.id == "GetAccountsAccountPersons.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAccountsAccountPersonsResponse.SuccessJson(
          json = AccountsCodecs.getAccountsAccountPersonsResponseCodecAlternative0Registry.select(listOf("GetAccountsAccountPersons.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAccountsAccountPersons.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAccountsAccountPersonsResponse.DefaultJson(
          json = AccountsCodecs.getAccountsAccountPersonsResponseCodecAlternative1Registry.select(listOf("GetAccountsAccountPersons.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAccountsAccountPersonsResponse = GetAccountsAccountPersonsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetAccountsAccountPersonsPerson`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetAccountsAccountPersonsPersonResponse {
    public class SuccessJson(
      public val json: Person,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPersonsPersonResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPersonsPersonResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAccountsAccountPersonsPersonResponse
  }

  private object GetAccountsAccountPersonsPersonResponseDecoder : SdkResponseAlternativeDecoder<GetAccountsAccountPersonsPersonResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAccountsAccountPersonsPersonResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAccountsAccountPersonsPersonResponse> = when {
      alternative.id == "GetAccountsAccountPersonsPerson.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAccountsAccountPersonsPersonResponse.SuccessJson(
          json = AccountsCodecs.getAccountsAccountPersonsPersonResponseCodecAlternative0Registry.select(listOf("GetAccountsAccountPersonsPerson.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetAccountsAccountPersonsPerson.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAccountsAccountPersonsPersonResponse.DefaultJson(
          json = AccountsCodecs.getAccountsAccountPersonsPersonResponseCodecAlternative1Registry.select(listOf("GetAccountsAccountPersonsPerson.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAccountsAccountPersonsPersonResponse = GetAccountsAccountPersonsPersonResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostAccountsAccountBankAccounts`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostAccountsAccountBankAccountsResponse {
    public class SuccessJson(
      public val json: ExternalAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountBankAccountsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountBankAccountsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountBankAccountsResponse
  }

  private object PostAccountsAccountBankAccountsResponseDecoder : SdkResponseAlternativeDecoder<PostAccountsAccountBankAccountsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostAccountsAccountBankAccountsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostAccountsAccountBankAccountsResponse> = when {
      alternative.id == "PostAccountsAccountBankAccounts.response.alternative0" -> SdkResponseDecodeResult(
        value = PostAccountsAccountBankAccountsResponse.SuccessJson(
          json = AccountsCodecs.postAccountsAccountBankAccountsResponseCodecAlternative0Registry.select(listOf("PostAccountsAccountBankAccounts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostAccountsAccountBankAccounts.response.alternative1" -> SdkResponseDecodeResult(
        value = PostAccountsAccountBankAccountsResponse.DefaultJson(
          json = AccountsCodecs.postAccountsAccountBankAccountsResponseCodecAlternative1Registry.select(listOf("PostAccountsAccountBankAccounts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostAccountsAccountBankAccountsResponse = PostAccountsAccountBankAccountsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostAccountsAccountBankAccountsId`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostAccountsAccountBankAccountsIdResponse {
    public class SuccessJson(
      public val json: ExternalAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountBankAccountsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountBankAccountsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountBankAccountsIdResponse
  }

  private object PostAccountsAccountBankAccountsIdResponseDecoder : SdkResponseAlternativeDecoder<PostAccountsAccountBankAccountsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostAccountsAccountBankAccountsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostAccountsAccountBankAccountsIdResponse> = when {
      alternative.id == "PostAccountsAccountBankAccountsId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostAccountsAccountBankAccountsIdResponse.SuccessJson(
          json = AccountsCodecs.postAccountsAccountBankAccountsIdResponseCodecAlternative0Registry.select(listOf("PostAccountsAccountBankAccountsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostAccountsAccountBankAccountsId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostAccountsAccountBankAccountsIdResponse.DefaultJson(
          json = AccountsCodecs.postAccountsAccountBankAccountsIdResponseCodecAlternative1Registry.select(listOf("PostAccountsAccountBankAccountsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostAccountsAccountBankAccountsIdResponse = PostAccountsAccountBankAccountsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostAccountsAccountCapabilitiesCapability`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostAccountsAccountCapabilitiesCapabilityResponse {
    public class SuccessJson(
      public val json: Capability,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountCapabilitiesCapabilityResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountCapabilitiesCapabilityResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountCapabilitiesCapabilityResponse
  }

  private object PostAccountsAccountCapabilitiesCapabilityResponseDecoder : SdkResponseAlternativeDecoder<PostAccountsAccountCapabilitiesCapabilityResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostAccountsAccountCapabilitiesCapabilityResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostAccountsAccountCapabilitiesCapabilityResponse> = when {
      alternative.id == "PostAccountsAccountCapabilitiesCapability.response.alternative0" -> SdkResponseDecodeResult(
        value = PostAccountsAccountCapabilitiesCapabilityResponse.SuccessJson(
          json = AccountsCodecs.postAccountsAccountCapabilitiesCapabilityResponseCodecAlternative0Registry.select(listOf("PostAccountsAccountCapabilitiesCapability.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostAccountsAccountCapabilitiesCapability.response.alternative1" -> SdkResponseDecodeResult(
        value = PostAccountsAccountCapabilitiesCapabilityResponse.DefaultJson(
          json = AccountsCodecs.postAccountsAccountCapabilitiesCapabilityResponseCodecAlternative1Registry.select(listOf("PostAccountsAccountCapabilitiesCapability.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostAccountsAccountCapabilitiesCapabilityResponse = PostAccountsAccountCapabilitiesCapabilityResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostAccountsAccountExternalAccounts`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostAccountsAccountExternalAccountsResponse {
    public class SuccessJson(
      public val json: ExternalAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountExternalAccountsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountExternalAccountsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountExternalAccountsResponse
  }

  private object PostAccountsAccountExternalAccountsResponseDecoder : SdkResponseAlternativeDecoder<PostAccountsAccountExternalAccountsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostAccountsAccountExternalAccountsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostAccountsAccountExternalAccountsResponse> = when {
      alternative.id == "PostAccountsAccountExternalAccounts.response.alternative0" -> SdkResponseDecodeResult(
        value = PostAccountsAccountExternalAccountsResponse.SuccessJson(
          json = AccountsCodecs.postAccountsAccountExternalAccountsResponseCodecAlternative0Registry.select(listOf("PostAccountsAccountExternalAccounts.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostAccountsAccountExternalAccounts.response.alternative1" -> SdkResponseDecodeResult(
        value = PostAccountsAccountExternalAccountsResponse.DefaultJson(
          json = AccountsCodecs.postAccountsAccountExternalAccountsResponseCodecAlternative1Registry.select(listOf("PostAccountsAccountExternalAccounts.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostAccountsAccountExternalAccountsResponse = PostAccountsAccountExternalAccountsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostAccountsAccountExternalAccountsId`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostAccountsAccountExternalAccountsIdResponse {
    public class SuccessJson(
      public val json: ExternalAccount,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountExternalAccountsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountExternalAccountsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountExternalAccountsIdResponse
  }

  private object PostAccountsAccountExternalAccountsIdResponseDecoder : SdkResponseAlternativeDecoder<PostAccountsAccountExternalAccountsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostAccountsAccountExternalAccountsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostAccountsAccountExternalAccountsIdResponse> = when {
      alternative.id == "PostAccountsAccountExternalAccountsId.response.alternative0" -> SdkResponseDecodeResult(
        value = PostAccountsAccountExternalAccountsIdResponse.SuccessJson(
          json = AccountsCodecs.postAccountsAccountExternalAccountsIdResponseCodecAlternative0Registry.select(listOf("PostAccountsAccountExternalAccountsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostAccountsAccountExternalAccountsId.response.alternative1" -> SdkResponseDecodeResult(
        value = PostAccountsAccountExternalAccountsIdResponse.DefaultJson(
          json = AccountsCodecs.postAccountsAccountExternalAccountsIdResponseCodecAlternative1Registry.select(listOf("PostAccountsAccountExternalAccountsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostAccountsAccountExternalAccountsIdResponse = PostAccountsAccountExternalAccountsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostAccountsAccountLoginLinks`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostAccountsAccountLoginLinksResponse {
    public class SuccessJson(
      public val json: LoginLink,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountLoginLinksResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountLoginLinksResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountLoginLinksResponse
  }

  private object PostAccountsAccountLoginLinksResponseDecoder : SdkResponseAlternativeDecoder<PostAccountsAccountLoginLinksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostAccountsAccountLoginLinksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostAccountsAccountLoginLinksResponse> = when {
      alternative.id == "PostAccountsAccountLoginLinks.response.alternative0" -> SdkResponseDecodeResult(
        value = PostAccountsAccountLoginLinksResponse.SuccessJson(
          json = AccountsCodecs.postAccountsAccountLoginLinksResponseCodecAlternative0Registry.select(listOf("PostAccountsAccountLoginLinks.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostAccountsAccountLoginLinks.response.alternative1" -> SdkResponseDecodeResult(
        value = PostAccountsAccountLoginLinksResponse.DefaultJson(
          json = AccountsCodecs.postAccountsAccountLoginLinksResponseCodecAlternative1Registry.select(listOf("PostAccountsAccountLoginLinks.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostAccountsAccountLoginLinksResponse = PostAccountsAccountLoginLinksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostAccountsAccountReject`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface PostAccountsAccountRejectResponse {
    public class SuccessJson(
      public val json: Account,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountRejectResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountRejectResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostAccountsAccountRejectResponse
  }

  private object PostAccountsAccountRejectResponseDecoder : SdkResponseAlternativeDecoder<PostAccountsAccountRejectResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostAccountsAccountRejectResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostAccountsAccountRejectResponse> = when {
      alternative.id == "PostAccountsAccountReject.response.alternative0" -> SdkResponseDecodeResult(
        value = PostAccountsAccountRejectResponse.SuccessJson(
          json = AccountsCodecs.postAccountsAccountRejectResponseCodecAlternative0Registry.select(listOf("PostAccountsAccountReject.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostAccountsAccountReject.response.alternative1" -> SdkResponseDecodeResult(
        value = PostAccountsAccountRejectResponse.DefaultJson(
          json = AccountsCodecs.postAccountsAccountRejectResponseCodecAlternative1Registry.select(listOf("PostAccountsAccountReject.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostAccountsAccountRejectResponse = PostAccountsAccountRejectResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val deleteAccountsAccountMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteAccountsAccount",
          method = "DELETE",
          path = "/v1/accounts/{account}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteAccountsAccount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteAccountsAccount.response.alternative1",
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

    public val deleteAccountsAccountBankAccountsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteAccountsAccountBankAccountsId",
          method = "DELETE",
          path = "/v1/accounts/{account}/bank_accounts/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedExternalAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteAccountsAccountBankAccountsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteAccountsAccountBankAccountsId.response.alternative1",
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

    public val deleteAccountsAccountExternalAccountsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteAccountsAccountExternalAccountsId",
          method = "DELETE",
          path = "/v1/accounts/{account}/external_accounts/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedExternalAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteAccountsAccountExternalAccountsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteAccountsAccountExternalAccountsId.response.alternative1",
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

    public val deleteAccountsAccountPeoplePersonMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteAccountsAccountPeoplePerson",
          method = "DELETE",
          path = "/v1/accounts/{account}/people/{person}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedPerson",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteAccountsAccountPeoplePerson.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteAccountsAccountPeoplePerson.response.alternative1",
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

    public val deleteAccountsAccountPersonsPersonMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "DeleteAccountsAccountPersonsPerson",
          method = "DELETE",
          path = "/v1/accounts/{account}/persons/{person}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeletedPerson",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteAccountsAccountPersonsPerson.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "DeleteAccountsAccountPersonsPerson.response.alternative1",
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

    public val getAccountsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAccounts",
          method = "GET",
          path = "/v1/accounts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1AccountsGetResponse200JsonX1b6b3724",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccounts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccounts.response.alternative1",
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

    public val getAccountsAccountMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAccountsAccount",
          method = "GET",
          path = "/v1/accounts/{account}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Account",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccount.response.alternative1",
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

    public val getAccountsAccountBankAccountsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAccountsAccountBankAccountsId",
          method = "GET",
          path = "/v1/accounts/{account}/bank_accounts/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ExternalAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountBankAccountsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountBankAccountsId.response.alternative1",
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

    public val getAccountsAccountCapabilitiesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAccountsAccountCapabilities",
          method = "GET",
          path = "/v1/accounts/{account}/capabilities",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1AccountsCapabilitiesGetResponse200JsonX87f9b592",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountCapabilities.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountCapabilities.response.alternative1",
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

    public val getAccountsAccountCapabilitiesCapabilityMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAccountsAccountCapabilitiesCapability",
          method = "GET",
          path = "/v1/accounts/{account}/capabilities/{capability}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Capability",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountCapabilitiesCapability.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountCapabilitiesCapability.response.alternative1",
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

    public val getAccountsAccountExternalAccountsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAccountsAccountExternalAccounts",
          method = "GET",
          path = "/v1/accounts/{account}/external_accounts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1AccountsExternalAccountsGetResponse200JsonXfeb5979b",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountExternalAccounts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountExternalAccounts.response.alternative1",
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

    public val getAccountsAccountExternalAccountsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAccountsAccountExternalAccountsId",
          method = "GET",
          path = "/v1/accounts/{account}/external_accounts/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ExternalAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountExternalAccountsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountExternalAccountsId.response.alternative1",
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

    public val getAccountsAccountPeopleMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAccountsAccountPeople",
          method = "GET",
          path = "/v1/accounts/{account}/people",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1AccountsPeopleGetResponse200JsonX4b2e5b26",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountPeople.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountPeople.response.alternative1",
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

    public val getAccountsAccountPeoplePersonMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAccountsAccountPeoplePerson",
          method = "GET",
          path = "/v1/accounts/{account}/people/{person}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Person",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountPeoplePerson.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountPeoplePerson.response.alternative1",
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

    public val getAccountsAccountPersonsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAccountsAccountPersons",
          method = "GET",
          path = "/v1/accounts/{account}/persons",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1AccountsPersonsGetResponse200JsonXe630747d",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountPersons.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountPersons.response.alternative1",
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

    public val getAccountsAccountPersonsPersonMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetAccountsAccountPersonsPerson",
          method = "GET",
          path = "/v1/accounts/{account}/persons/{person}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Person",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountPersonsPerson.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetAccountsAccountPersonsPerson.response.alternative1",
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

    public val postAccountsAccountBankAccountsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostAccountsAccountBankAccounts",
          method = "POST",
          path = "/v1/accounts/{account}/bank_accounts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ExternalAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountBankAccounts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountBankAccounts.response.alternative1",
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

    public val postAccountsAccountBankAccountsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostAccountsAccountBankAccountsId",
          method = "POST",
          path = "/v1/accounts/{account}/bank_accounts/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ExternalAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountBankAccountsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountBankAccountsId.response.alternative1",
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

    public val postAccountsAccountCapabilitiesCapabilityMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostAccountsAccountCapabilitiesCapability",
          method = "POST",
          path = "/v1/accounts/{account}/capabilities/{capability}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Capability",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountCapabilitiesCapability.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountCapabilitiesCapability.response.alternative1",
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

    public val postAccountsAccountExternalAccountsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostAccountsAccountExternalAccounts",
          method = "POST",
          path = "/v1/accounts/{account}/external_accounts",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ExternalAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountExternalAccounts.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountExternalAccounts.response.alternative1",
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

    public val postAccountsAccountExternalAccountsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostAccountsAccountExternalAccountsId",
          method = "POST",
          path = "/v1/accounts/{account}/external_accounts/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ExternalAccount",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountExternalAccountsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountExternalAccountsId.response.alternative1",
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

    public val postAccountsAccountLoginLinksMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostAccountsAccountLoginLinks",
          method = "POST",
          path = "/v1/accounts/{account}/login_links",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "LoginLink",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountLoginLinks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountLoginLinks.response.alternative1",
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

    public val postAccountsAccountRejectMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostAccountsAccountReject",
          method = "POST",
          path = "/v1/accounts/{account}/reject",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Account",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountReject.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostAccountsAccountReject.response.alternative1",
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
