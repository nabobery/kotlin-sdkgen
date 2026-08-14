package io.github.nabobery.sdkgen.generated.stripe.tax

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
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxCalculationsLineItemsGetResponse200JsonX30edce5e
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsGetParameterX93759b9d
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsGetResponse200JsonX6a36c759
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormX98b4d7b7
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxSettingsPostRequestFormX6a746f8e
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492
import io.github.nabobery.sdkgen.generated.stripe.InlineV1TaxTransactionsLineItemsGetResponse200JsonXbcf85478
import io.github.nabobery.sdkgen.generated.stripe.SdkJson
import io.github.nabobery.sdkgen.generated.stripe.TaxAssociation
import io.github.nabobery.sdkgen.generated.stripe.TaxCalculation
import io.github.nabobery.sdkgen.generated.stripe.TaxRegistration
import io.github.nabobery.sdkgen.generated.stripe.TaxSettings
import io.github.nabobery.sdkgen.generated.stripe.TaxTransaction
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
import kotlinx.serialization.json.JsonObject

internal object TaxCodecs {
  internal const val GETTAXASSOCIATIONSFIND_REQUEST_CODEC_ID: String =
      "GetTaxAssociationsFind.request"

  private val getTaxAssociationsFindRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTaxAssociationsFindFormCodec

  private val getTaxAssociationsFindResponseCodecAlternative0Codec: MediaTypeCodec<TaxAssociation> =
      KotlinxSerializationCodec("GetTaxAssociationsFind.response.alternative0", TaxAssociation.Serializer, SdkJson)

  internal val getTaxAssociationsFindResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TaxAssociation> =
      MediaTypeCodecRegistry.of(getTaxAssociationsFindResponseCodecAlternative0Codec)

  private val getTaxAssociationsFindResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxAssociationsFind.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxAssociationsFindResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTaxAssociationsFindResponseCodecAlternative1Codec)

  internal val getTaxAssociationsFindRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxAssociationsFindRequestCodec)

  internal const val GETTAXCALCULATIONSCALCULATION_REQUEST_CODEC_ID: String =
      "GetTaxCalculationsCalculation.request"

  private val getTaxCalculationsCalculationRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTaxCalculationsCalculationFormCodec

  private val getTaxCalculationsCalculationResponseCodecAlternative0Codec:
      MediaTypeCodec<TaxCalculation> =
      KotlinxSerializationCodec("GetTaxCalculationsCalculation.response.alternative0", TaxCalculation.Serializer, SdkJson)

  internal val getTaxCalculationsCalculationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TaxCalculation> =
      MediaTypeCodecRegistry.of(getTaxCalculationsCalculationResponseCodecAlternative0Codec)

  private val getTaxCalculationsCalculationResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxCalculationsCalculation.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxCalculationsCalculationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTaxCalculationsCalculationResponseCodecAlternative1Codec)

  internal val getTaxCalculationsCalculationRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxCalculationsCalculationRequestCodec)

  internal const val GETTAXCALCULATIONSCALCULATIONLINEITEMS_REQUEST_CODEC_ID: String =
      "GetTaxCalculationsCalculationLineItems.request"

  private val getTaxCalculationsCalculationLineItemsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTaxCalculationsCalculationLineItemsFormCodec

  private val getTaxCalculationsCalculationLineItemsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TaxCalculationsLineItemsGetResponse200JsonX30edce5e> =
      KotlinxSerializationCodec("GetTaxCalculationsCalculationLineItems.response.alternative0", InlineV1TaxCalculationsLineItemsGetResponse200JsonX30edce5e.Serializer, SdkJson)

  internal val getTaxCalculationsCalculationLineItemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TaxCalculationsLineItemsGetResponse200JsonX30edce5e> =
      MediaTypeCodecRegistry.of(getTaxCalculationsCalculationLineItemsResponseCodecAlternative0Codec)

  private val getTaxCalculationsCalculationLineItemsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxCalculationsCalculationLineItems.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxCalculationsCalculationLineItemsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTaxCalculationsCalculationLineItemsResponseCodecAlternative1Codec)

  internal val getTaxCalculationsCalculationLineItemsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxCalculationsCalculationLineItemsRequestCodec)

  internal const val GETTAXREGISTRATIONS_REQUEST_CODEC_ID: String = "GetTaxRegistrations.request"

  private val getTaxRegistrationsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTaxRegistrationsFormCodec

  private val getTaxRegistrationsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TaxRegistrationsGetResponse200JsonX6a36c759> =
      KotlinxSerializationCodec("GetTaxRegistrations.response.alternative0", InlineV1TaxRegistrationsGetResponse200JsonX6a36c759.Serializer, SdkJson)

  internal val getTaxRegistrationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TaxRegistrationsGetResponse200JsonX6a36c759> =
      MediaTypeCodecRegistry.of(getTaxRegistrationsResponseCodecAlternative0Codec)

  private val getTaxRegistrationsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxRegistrations.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxRegistrationsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTaxRegistrationsResponseCodecAlternative1Codec)

  internal val getTaxRegistrationsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxRegistrationsRequestCodec)

  internal const val GETTAXREGISTRATIONSID_REQUEST_CODEC_ID: String =
      "GetTaxRegistrationsId.request"

  private val getTaxRegistrationsIdRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTaxRegistrationsIdFormCodec

  private val getTaxRegistrationsIdResponseCodecAlternative0Codec: MediaTypeCodec<TaxRegistration> =
      KotlinxSerializationCodec("GetTaxRegistrationsId.response.alternative0", TaxRegistration.Serializer, SdkJson)

  internal val getTaxRegistrationsIdResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TaxRegistration> =
      MediaTypeCodecRegistry.of(getTaxRegistrationsIdResponseCodecAlternative0Codec)

  private val getTaxRegistrationsIdResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxRegistrationsId.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxRegistrationsIdResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(getTaxRegistrationsIdResponseCodecAlternative1Codec)

  internal val getTaxRegistrationsIdRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxRegistrationsIdRequestCodec)

  internal const val GETTAXSETTINGS_REQUEST_CODEC_ID: String = "GetTaxSettings.request"

  private val getTaxSettingsRequestCodec: MediaTypeCodec<JsonObject?> = GetTaxSettingsFormCodec

  private val getTaxSettingsResponseCodecAlternative0Codec: MediaTypeCodec<TaxSettings> =
      KotlinxSerializationCodec("GetTaxSettings.response.alternative0", TaxSettings.Serializer, SdkJson)

  internal val getTaxSettingsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TaxSettings>
      = MediaTypeCodecRegistry.of(getTaxSettingsResponseCodecAlternative0Codec)

  private val getTaxSettingsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxSettings.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxSettingsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTaxSettingsResponseCodecAlternative1Codec)

  internal val getTaxSettingsRequestCodecRegistry: MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxSettingsRequestCodec)

  internal const val GETTAXTRANSACTIONSTRANSACTION_REQUEST_CODEC_ID: String =
      "GetTaxTransactionsTransaction.request"

  private val getTaxTransactionsTransactionRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTaxTransactionsTransactionFormCodec

  private val getTaxTransactionsTransactionResponseCodecAlternative0Codec:
      MediaTypeCodec<TaxTransaction> =
      KotlinxSerializationCodec("GetTaxTransactionsTransaction.response.alternative0", TaxTransaction.Serializer, SdkJson)

  internal val getTaxTransactionsTransactionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TaxTransaction> =
      MediaTypeCodecRegistry.of(getTaxTransactionsTransactionResponseCodecAlternative0Codec)

  private val getTaxTransactionsTransactionResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxTransactionsTransaction.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxTransactionsTransactionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTaxTransactionsTransactionResponseCodecAlternative1Codec)

  internal val getTaxTransactionsTransactionRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxTransactionsTransactionRequestCodec)

  internal const val GETTAXTRANSACTIONSTRANSACTIONLINEITEMS_REQUEST_CODEC_ID: String =
      "GetTaxTransactionsTransactionLineItems.request"

  private val getTaxTransactionsTransactionLineItemsRequestCodec: MediaTypeCodec<JsonObject?> =
      GetTaxTransactionsTransactionLineItemsFormCodec

  private val getTaxTransactionsTransactionLineItemsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineV1TaxTransactionsLineItemsGetResponse200JsonXbcf85478> =
      KotlinxSerializationCodec("GetTaxTransactionsTransactionLineItems.response.alternative0", InlineV1TaxTransactionsLineItemsGetResponse200JsonXbcf85478.Serializer, SdkJson)

  internal val getTaxTransactionsTransactionLineItemsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineV1TaxTransactionsLineItemsGetResponse200JsonXbcf85478> =
      MediaTypeCodecRegistry.of(getTaxTransactionsTransactionLineItemsResponseCodecAlternative0Codec)

  private val getTaxTransactionsTransactionLineItemsResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("GetTaxTransactionsTransactionLineItems.response.alternative1", Error.Serializer, SdkJson)

  internal val getTaxTransactionsTransactionLineItemsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(getTaxTransactionsTransactionLineItemsResponseCodecAlternative1Codec)

  internal val getTaxTransactionsTransactionLineItemsRequestCodecRegistry:
      MediaTypeCodecRegistry<JsonObject?> =
      MediaTypeCodecRegistry.of(getTaxTransactionsTransactionLineItemsRequestCodec)

  internal const val POSTTAXREGISTRATIONS_REQUEST_CODEC_ID: String = "PostTaxRegistrations.request"

  private val postTaxRegistrationsRequestCodec:
      MediaTypeCodec<InlineV1TaxRegistrationsPostRequestFormX98b4d7b7> =
      PostTaxRegistrationsFormCodec

  private val postTaxRegistrationsResponseCodecAlternative0Codec: MediaTypeCodec<TaxRegistration> =
      KotlinxSerializationCodec("PostTaxRegistrations.response.alternative0", TaxRegistration.Serializer, SdkJson)

  internal val postTaxRegistrationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TaxRegistration> =
      MediaTypeCodecRegistry.of(postTaxRegistrationsResponseCodecAlternative0Codec)

  private val postTaxRegistrationsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTaxRegistrations.response.alternative1", Error.Serializer, SdkJson)

  internal val postTaxRegistrationsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error>
      = MediaTypeCodecRegistry.of(postTaxRegistrationsResponseCodecAlternative1Codec)

  internal val postTaxRegistrationsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TaxRegistrationsPostRequestFormX98b4d7b7> =
      MediaTypeCodecRegistry.of(postTaxRegistrationsRequestCodec)

  internal const val POSTTAXSETTINGS_REQUEST_CODEC_ID: String = "PostTaxSettings.request"

  private val postTaxSettingsRequestCodec:
      MediaTypeCodec<InlineV1TaxSettingsPostRequestFormX6a746f8e?> = PostTaxSettingsFormCodec

  private val postTaxSettingsResponseCodecAlternative0Codec: MediaTypeCodec<TaxSettings> =
      KotlinxSerializationCodec("PostTaxSettings.response.alternative0", TaxSettings.Serializer, SdkJson)

  internal val postTaxSettingsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<TaxSettings>
      = MediaTypeCodecRegistry.of(postTaxSettingsResponseCodecAlternative0Codec)

  private val postTaxSettingsResponseCodecAlternative1Codec: MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTaxSettings.response.alternative1", Error.Serializer, SdkJson)

  internal val postTaxSettingsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTaxSettingsResponseCodecAlternative1Codec)

  internal val postTaxSettingsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TaxSettingsPostRequestFormX6a746f8e?> =
      MediaTypeCodecRegistry.of(postTaxSettingsRequestCodec)

  internal const val POSTTAXTRANSACTIONSCREATEFROMCALCULATION_REQUEST_CODEC_ID: String =
      "PostTaxTransactionsCreateFromCalculation.request"

  private val postTaxTransactionsCreateFromCalculationRequestCodec:
      MediaTypeCodec<InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1> =
      PostTaxTransactionsCreateFromCalculationFormCodec

  private val postTaxTransactionsCreateFromCalculationResponseCodecAlternative0Codec:
      MediaTypeCodec<TaxTransaction> =
      KotlinxSerializationCodec("PostTaxTransactionsCreateFromCalculation.response.alternative0", TaxTransaction.Serializer, SdkJson)

  internal val postTaxTransactionsCreateFromCalculationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TaxTransaction> =
      MediaTypeCodecRegistry.of(postTaxTransactionsCreateFromCalculationResponseCodecAlternative0Codec)

  private val postTaxTransactionsCreateFromCalculationResponseCodecAlternative1Codec:
      MediaTypeCodec<Error> =
      KotlinxSerializationCodec("PostTaxTransactionsCreateFromCalculation.response.alternative1", Error.Serializer, SdkJson)

  internal val postTaxTransactionsCreateFromCalculationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTaxTransactionsCreateFromCalculationResponseCodecAlternative1Codec)

  internal val postTaxTransactionsCreateFromCalculationRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1> =
      MediaTypeCodecRegistry.of(postTaxTransactionsCreateFromCalculationRequestCodec)

  internal const val POSTTAXTRANSACTIONSCREATEREVERSAL_REQUEST_CODEC_ID: String =
      "PostTaxTransactionsCreateReversal.request"

  private val postTaxTransactionsCreateReversalRequestCodec:
      MediaTypeCodec<InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492> =
      PostTaxTransactionsCreateReversalFormCodec

  private val postTaxTransactionsCreateReversalResponseCodecAlternative0Codec:
      MediaTypeCodec<TaxTransaction> =
      KotlinxSerializationCodec("PostTaxTransactionsCreateReversal.response.alternative0", TaxTransaction.Serializer, SdkJson)

  internal val postTaxTransactionsCreateReversalResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TaxTransaction> =
      MediaTypeCodecRegistry.of(postTaxTransactionsCreateReversalResponseCodecAlternative0Codec)

  private val postTaxTransactionsCreateReversalResponseCodecAlternative1Codec: MediaTypeCodec<Error>
      =
      KotlinxSerializationCodec("PostTaxTransactionsCreateReversal.response.alternative1", Error.Serializer, SdkJson)

  internal val postTaxTransactionsCreateReversalResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<Error> =
      MediaTypeCodecRegistry.of(postTaxTransactionsCreateReversalResponseCodecAlternative1Codec)

  internal val postTaxTransactionsCreateReversalRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492> =
      MediaTypeCodecRegistry.of(postTaxTransactionsCreateReversalRequestCodec)

  internal object GetTaxAssociationsFindFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxAssociationsFind.request"

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

  internal object GetTaxCalculationsCalculationFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxCalculationsCalculation.request"

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

  internal object GetTaxCalculationsCalculationLineItemsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxCalculationsCalculationLineItems.request"

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

  internal object GetTaxRegistrationsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxRegistrations.request"

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

  internal object GetTaxRegistrationsIdFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxRegistrationsId.request"

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

  internal object GetTaxSettingsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxSettings.request"

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

  internal object GetTaxTransactionsTransactionFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxTransactionsTransaction.request"

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

  internal object GetTaxTransactionsTransactionLineItemsFormCodec : MediaTypeCodec<JsonObject?> {
    override val id: String = "GetTaxTransactionsTransactionLineItems.request"

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

  internal object PostTaxRegistrationsFormCodec : MediaTypeCodec<InlineV1TaxRegistrationsPostRequestFormX98b4d7b7> {
    override val id: String = "PostTaxRegistrations.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TaxRegistrationsPostRequestFormX98b4d7b7, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      require(request.activeFrom.matchedBranches.size == 1) { "Form union value must match exactly one wire-kind branch" }
      when {
        request.activeFrom.inlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40 != null -> {
          form.add("active_from", requireNotNull(request.activeFrom.inlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40).value)
        }
        request.activeFrom.branch2 != null -> {
          form.add("active_from", requireNotNull(request.activeFrom.branch2).toString())
        }
        else -> {
          error("Form union value has no selected branch")
        }
      }
      form.add("country", request.country)
      request.countryOptions.ae?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[ae]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[ae]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.al?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[al]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[al]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.am?.let { formValue1 ->
        form.add("country_options" + "[am]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ao?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[ao]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[ao]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.at?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[at]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[at]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.au?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[au]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[au]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.aw?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[aw]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[aw]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.az?.let { formValue1 ->
        form.add("country_options" + "[az]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ba?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[ba]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[ba]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.bb?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[bb]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[bb]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.bd?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[bd]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[bd]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.be?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[be]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[be]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.bf?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[bf]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[bf]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.bg?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[bg]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[bg]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.bh?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[bh]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[bh]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.bj?.let { formValue1 ->
        form.add("country_options" + "[bj]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.bs?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[bs]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[bs]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.by?.let { formValue1 ->
        form.add("country_options" + "[by]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ca?.let { formValue1 ->
        formValue1.provinceStandard?.let { formValue3 ->
          form.add("country_options" + "[ca]" + "[province_standard]" + "[province]", formValue3.province)
        }
        form.add("country_options" + "[ca]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.cd?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[cd]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[cd]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ch?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[ch]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[ch]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.cl?.let { formValue1 ->
        form.add("country_options" + "[cl]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.cm?.let { formValue1 ->
        form.add("country_options" + "[cm]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.co?.let { formValue1 ->
        form.add("country_options" + "[co]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.cr?.let { formValue1 ->
        form.add("country_options" + "[cr]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.cv?.let { formValue1 ->
        form.add("country_options" + "[cv]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.cy?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[cy]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[cy]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.cz?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[cz]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[cz]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.de?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[de]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[de]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.dk?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[dk]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[dk]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ec?.let { formValue1 ->
        form.add("country_options" + "[ec]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ee?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[ee]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[ee]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.eg?.let { formValue1 ->
        form.add("country_options" + "[eg]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.es?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[es]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[es]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.et?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[et]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[et]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.fi?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[fi]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[fi]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.fr?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[fr]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[fr]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.gb?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[gb]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[gb]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ge?.let { formValue1 ->
        form.add("country_options" + "[ge]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.gn?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[gn]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[gn]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.gr?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[gr]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[gr]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.hr?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[hr]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[hr]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.hu?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[hu]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[hu]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.id?.let { formValue1 ->
        form.add("country_options" + "[id]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ie?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[ie]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[ie]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.inValue?.let { formValue1 ->
        form.add("country_options" + "[in]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.isValue?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[is]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[is]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.it?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[it]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[it]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.jp?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[jp]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[jp]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ke?.let { formValue1 ->
        form.add("country_options" + "[ke]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.kg?.let { formValue1 ->
        form.add("country_options" + "[kg]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.kh?.let { formValue1 ->
        form.add("country_options" + "[kh]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.kr?.let { formValue1 ->
        form.add("country_options" + "[kr]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.kz?.let { formValue1 ->
        form.add("country_options" + "[kz]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.la?.let { formValue1 ->
        form.add("country_options" + "[la]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.lk?.let { formValue1 ->
        form.add("country_options" + "[lk]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.lt?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[lt]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[lt]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.lu?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[lu]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[lu]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.lv?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[lv]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[lv]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ma?.let { formValue1 ->
        form.add("country_options" + "[ma]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.md?.let { formValue1 ->
        form.add("country_options" + "[md]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.me?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[me]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[me]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.mk?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[mk]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[mk]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.mr?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[mr]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[mr]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.mt?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[mt]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[mt]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.mx?.let { formValue1 ->
        form.add("country_options" + "[mx]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.my?.let { formValue1 ->
        form.add("country_options" + "[my]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ng?.let { formValue1 ->
        form.add("country_options" + "[ng]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.nl?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[nl]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[nl]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.no?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[no]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[no]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.np?.let { formValue1 ->
        form.add("country_options" + "[np]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.nz?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[nz]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[nz]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.om?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[om]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[om]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.pe?.let { formValue1 ->
        form.add("country_options" + "[pe]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ph?.let { formValue1 ->
        form.add("country_options" + "[ph]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.pl?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[pl]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[pl]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.pt?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[pt]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[pt]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ro?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[ro]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[ro]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.rs?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[rs]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[rs]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ru?.let { formValue1 ->
        form.add("country_options" + "[ru]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.sa?.let { formValue1 ->
        form.add("country_options" + "[sa]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.se?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[se]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[se]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.sg?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[sg]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[sg]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.si?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[si]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[si]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.sk?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          form.add("country_options" + "[sk]" + "[standard]" + "[place_of_supply_scheme]", formValue3.placeOfSupplyScheme.value)
        }
        form.add("country_options" + "[sk]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.sn?.let { formValue1 ->
        form.add("country_options" + "[sn]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.sr?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[sr]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[sr]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.th?.let { formValue1 ->
        form.add("country_options" + "[th]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.tj?.let { formValue1 ->
        form.add("country_options" + "[tj]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.tr?.let { formValue1 ->
        form.add("country_options" + "[tr]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.tw?.let { formValue1 ->
        form.add("country_options" + "[tw]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.tz?.let { formValue1 ->
        form.add("country_options" + "[tz]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ua?.let { formValue1 ->
        form.add("country_options" + "[ua]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.ug?.let { formValue1 ->
        form.add("country_options" + "[ug]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.us?.let { formValue1 ->
        formValue1.localAmusementTax?.let { formValue3 ->
          form.add("country_options" + "[us]" + "[local_amusement_tax]" + "[jurisdiction]", formValue3.jurisdiction)
        }
        formValue1.localLeaseTax?.let { formValue3 ->
          form.add("country_options" + "[us]" + "[local_lease_tax]" + "[jurisdiction]", formValue3.jurisdiction)
        }
        form.add("country_options" + "[us]" + "[state]", formValue1.state)
        formValue1.stateSalesTax?.let { formValue3 ->
          if (formValue3.elections.isEmpty()) {
            form.add("country_options" + "[us]" + "[state_sales_tax]" + "[elections]", "")
          } else {
            formValue3.elections.forEachIndexed { formIndex5, formElement5 ->
              formElement5.jurisdiction?.let { formValue7 ->
                form.add("country_options" + "[us]" + "[state_sales_tax]" + "[elections]" + "[" + formIndex5 + "]" + "[jurisdiction]", formValue7)
              }
              form.add("country_options" + "[us]" + "[state_sales_tax]" + "[elections]" + "[" + formIndex5 + "]" + "[type]", formElement5.type.value)
            }
          }
        }
        form.add("country_options" + "[us]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.uy?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[uy]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[uy]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.uz?.let { formValue1 ->
        form.add("country_options" + "[uz]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.vn?.let { formValue1 ->
        form.add("country_options" + "[vn]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.za?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[za]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[za]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.zm?.let { formValue1 ->
        form.add("country_options" + "[zm]" + "[type]", formValue1.type.value)
      }
      request.countryOptions.zw?.let { formValue1 ->
        formValue1.standard?.let { formValue3 ->
          formValue3.placeOfSupplyScheme?.let { formValue5 ->
            form.add("country_options" + "[zw]" + "[standard]" + "[place_of_supply_scheme]", formValue5.value)
          }
        }
        form.add("country_options" + "[zw]" + "[type]", formValue1.type.value)
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
      request.expiresAt?.let { formValue0 ->
        form.add("expires_at", formValue0.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TaxRegistrationsPostRequestFormX98b4d7b7 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTaxSettingsFormCodec : MediaTypeCodec<InlineV1TaxSettingsPostRequestFormX6a746f8e?> {
    override val id: String = "PostTaxSettings.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TaxSettingsPostRequestFormX6a746f8e?, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      request.defaults?.let { formValue0 ->
        formValue0.taxBehavior?.let { formValue2 ->
          form.add("defaults" + "[tax_behavior]", formValue2.value)
        }
        formValue0.taxCode?.let { formValue2 ->
          form.add("defaults" + "[tax_code]", formValue2)
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
      request.headOffice?.let { formValue0 ->
        formValue0.address.city?.let { formValue3 ->
          form.add("head_office" + "[address]" + "[city]", formValue3)
        }
        formValue0.address.country?.let { formValue3 ->
          form.add("head_office" + "[address]" + "[country]", formValue3)
        }
        formValue0.address.line1?.let { formValue3 ->
          form.add("head_office" + "[address]" + "[line1]", formValue3)
        }
        formValue0.address.line2?.let { formValue3 ->
          form.add("head_office" + "[address]" + "[line2]", formValue3)
        }
        formValue0.address.postalCode?.let { formValue3 ->
          form.add("head_office" + "[address]" + "[postal_code]", formValue3)
        }
        formValue0.address.state?.let { formValue3 ->
          form.add("head_office" + "[address]" + "[state]", formValue3)
        }
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TaxSettingsPostRequestFormX6a746f8e? {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTaxTransactionsCreateFromCalculationFormCodec : MediaTypeCodec<InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1> {
    override val id: String = "PostTaxTransactionsCreateFromCalculation.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val form = FormUrlEncodedBody()
      form.add("calculation", request.calculation)
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
      request.postedAt?.let { formValue0 ->
        form.add("posted_at", formValue0.toString())
      }
      form.add("reference", request.reference)
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1 {
      error("Form request codecs do not decode response bodies.")
    }
  }

  internal object PostTaxTransactionsCreateReversalFormCodec : MediaTypeCodec<InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492> {
    override val id: String = "PostTaxTransactionsCreateReversal.request"

    override val mediaTypes: Set<String> = setOf("application/x-www-form-urlencoded")

    override suspend fun encode(`value`: InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492, mediaType: String): SdkRequestBody {
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
      request.flatAmount?.let { formValue0 ->
        form.add("flat_amount", formValue0.toString())
      }
      request.lineItems?.let { formValue0 ->
        if (formValue0.isEmpty()) {
          form.add("line_items", "")
        } else {
          formValue0.forEachIndexed { formIndex1, formElement1 ->
            form.add("line_items" + "[" + formIndex1 + "]" + "[amount]", formElement1.amount.toString())
            form.add("line_items" + "[" + formIndex1 + "]" + "[amount_tax]", formElement1.amountTax.toString())
            formElement1.metadata?.let { formValue3 ->
              formValue3.forEach { (formKey4, formMapValue4) ->
                form.add("line_items" + "[" + formIndex1 + "]" + "[metadata]" + "[" + formKey4 + "]", formMapValue4)
              }
            }
            form.add("line_items" + "[" + formIndex1 + "]" + "[original_line_item]", formElement1.originalLineItem)
            formElement1.quantity?.let { formValue3 ->
              form.add("line_items" + "[" + formIndex1 + "]" + "[quantity]", formValue3.toString())
            }
            form.add("line_items" + "[" + formIndex1 + "]" + "[reference]", formElement1.reference)
          }
        }
      }
      request.metadata?.let { formValue0 ->
        formValue0.forEach { (formKey1, formMapValue1) ->
          form.add("metadata" + "[" + formKey1 + "]", formMapValue1)
        }
      }
      form.add("mode", request.mode.value)
      form.add("original_transaction", request.originalTransaction)
      form.add("reference", request.reference)
      request.shippingCost?.let { formValue0 ->
        form.add("shipping_cost" + "[amount]", formValue0.amount.toString())
        form.add("shipping_cost" + "[amount_tax]", formValue0.amountTax.toString())
      }
      return form.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492 {
      error("Form request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'tax' group of Stripe API.
 */
public class TaxClient(
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
      SdkExecutor(transport, authentication = this@TaxClient.authentication)

  /**
   * <p>Finds a tax association object by PaymentIntent id.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param expand Specifies which fields in the response should be expanded.
   * @param paymentIntent Valid [PaymentIntent](https://docs.stripe.com/api/payment_intents/object) id
   * @param options Execution options.
   */
  public suspend fun getTaxAssociationsFindWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    paymentIntent: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxAssociationsFindResponse> = executor.executeWithResponse<JsonObject?, GetTaxAssociationsFindResponse>(SdkExecutionRequest(getTaxAssociationsFindMetadata, baseUri, request, listOf(TaxCodecs.GETTAXASSOCIATIONSFIND_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "payment_intent", values = listOf(paymentIntent.toString())))
  }), TaxCodecs.getTaxAssociationsFindRequestCodecRegistry, GetTaxAssociationsFindResponseDecoder, options)

  /**
   * <p>Retrieves a Tax <code>Calculation</code> object, if the calculation hasn’t expired.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param calculation Wire parameter `calculation`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTaxCalculationsCalculationWithResponse(
    request: JsonObject? = null,
    calculation: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxCalculationsCalculationResponse> = executor.executeWithResponse<JsonObject?, GetTaxCalculationsCalculationResponse>(SdkExecutionRequest(getTaxCalculationsCalculationMetadata, baseUri, request, listOf(TaxCodecs.GETTAXCALCULATIONSCALCULATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "calculation", values = listOf(calculation.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TaxCodecs.getTaxCalculationsCalculationRequestCodecRegistry, GetTaxCalculationsCalculationResponseDecoder, options)

  /**
   * <p>Retrieves the line items of a tax calculation as a collection, if the calculation hasn’t expired.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param calculation Wire parameter `calculation`.
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
  public suspend fun getTaxCalculationsCalculationLineItemsWithResponse(
    request: JsonObject? = null,
    calculation: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxCalculationsCalculationLineItemsResponse> = executor.executeWithResponse<JsonObject?, GetTaxCalculationsCalculationLineItemsResponse>(SdkExecutionRequest(getTaxCalculationsCalculationLineItemsMetadata, baseUri, request, listOf(TaxCodecs.GETTAXCALCULATIONSCALCULATIONLINEITEMS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "calculation", values = listOf(calculation.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), TaxCodecs.getTaxCalculationsCalculationLineItemsRequestCodecRegistry, GetTaxCalculationsCalculationLineItemsResponseDecoder, options)

  /**
   * <p>Returns a list of Tax <code>Registration</code> objects.</p>
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
   * @param status The status of the Tax Registration.
   * @param options Execution options.
   */
  public suspend fun getTaxRegistrationsWithResponse(
    request: JsonObject? = null,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    status: InlineV1TaxRegistrationsGetParameterX93759b9d? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxRegistrationsResponse> = executor.executeWithResponse<JsonObject?, GetTaxRegistrationsResponse>(SdkExecutionRequest(getTaxRegistrationsMetadata, baseUri, request, listOf(TaxCodecs.GETTAXREGISTRATIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "status", values = status?.let { listOf(it.toString()) }.orEmpty()))
  }), TaxCodecs.getTaxRegistrationsRequestCodecRegistry, GetTaxRegistrationsResponseDecoder, options)

  /**
   * <p>Returns a Tax <code>Registration</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id Wire parameter `id`.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTaxRegistrationsIdWithResponse(
    request: JsonObject? = null,
    id: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxRegistrationsIdResponse> = executor.executeWithResponse<JsonObject?, GetTaxRegistrationsIdResponse>(SdkExecutionRequest(getTaxRegistrationsIdMetadata, baseUri, request, listOf(TaxCodecs.GETTAXREGISTRATIONSID_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TaxCodecs.getTaxRegistrationsIdRequestCodecRegistry, GetTaxRegistrationsIdResponseDecoder, options)

  /**
   * <p>Retrieves Tax <code>Settings</code> for a merchant.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param expand Specifies which fields in the response should be expanded.
   * @param options Execution options.
   */
  public suspend fun getTaxSettingsWithResponse(
    request: JsonObject? = null,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxSettingsResponse> = executor.executeWithResponse<JsonObject?, GetTaxSettingsResponse>(SdkExecutionRequest(getTaxSettingsMetadata, baseUri, request, listOf(TaxCodecs.GETTAXSETTINGS_REQUEST_CODEC_ID), buildList {
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TaxCodecs.getTaxSettingsRequestCodecRegistry, GetTaxSettingsResponseDecoder, options)

  /**
   * <p>Retrieves a Tax <code>Transaction</code> object.</p>
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
  public suspend fun getTaxTransactionsTransactionWithResponse(
    request: JsonObject? = null,
    transaction: String,
    expand: List<String>? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxTransactionsTransactionResponse> = executor.executeWithResponse<JsonObject?, GetTaxTransactionsTransactionResponse>(SdkExecutionRequest(getTaxTransactionsTransactionMetadata, baseUri, request, listOf(TaxCodecs.GETTAXTRANSACTIONSTRANSACTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transaction", values = listOf(transaction.toString())))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
  }), TaxCodecs.getTaxTransactionsTransactionRequestCodecRegistry, GetTaxTransactionsTransactionResponseDecoder, options)

  /**
   * <p>Retrieves the line items of a committed standalone transaction as a collection.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param transaction Wire parameter `transaction`.
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
  public suspend fun getTaxTransactionsTransactionLineItemsWithResponse(
    request: JsonObject? = null,
    transaction: String,
    endingBefore: String? = null,
    expand: List<String>? = null,
    limit: Int? = null,
    startingAfter: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaxTransactionsTransactionLineItemsResponse> = executor.executeWithResponse<JsonObject?, GetTaxTransactionsTransactionLineItemsResponse>(SdkExecutionRequest(getTaxTransactionsTransactionLineItemsMetadata, baseUri, request, listOf(TaxCodecs.GETTAXTRANSACTIONSTRANSACTIONLINEITEMS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "transaction", values = listOf(transaction.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "ending_before", values = endingBefore?.let { listOf(it.toString()) }.orEmpty()))
    expand?.forEachIndexed { index, value ->
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "expand" + "[" + index + "]", values = listOf(value.toString())))
    }
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "starting_after", values = startingAfter?.let { listOf(it.toString()) }.orEmpty()))
  }), TaxCodecs.getTaxTransactionsTransactionLineItemsRequestCodecRegistry, GetTaxTransactionsTransactionLineItemsResponseDecoder, options)

  /**
   * <p>Creates a new Tax <code>Registration</code> object.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTaxRegistrationsWithResponse(request: InlineV1TaxRegistrationsPostRequestFormX98b4d7b7, options: CallOptions = CallOptions()): SdkResponseResult<PostTaxRegistrationsResponse> = executor.executeWithResponse<InlineV1TaxRegistrationsPostRequestFormX98b4d7b7, PostTaxRegistrationsResponse>(SdkExecutionRequest(postTaxRegistrationsMetadata, baseUri, request, listOf(TaxCodecs.POSTTAXREGISTRATIONS_REQUEST_CODEC_ID), emptyList()), TaxCodecs.postTaxRegistrationsRequestCodecRegistry, PostTaxRegistrationsResponseDecoder, options)

  /**
   * <p>Updates Tax <code>Settings</code> parameters used in tax calculations. All parameters are editable but none can
   * be removed once set.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTaxSettingsWithResponse(request: InlineV1TaxSettingsPostRequestFormX6a746f8e? = null, options: CallOptions = CallOptions()): SdkResponseResult<PostTaxSettingsResponse> = executor.executeWithResponse<InlineV1TaxSettingsPostRequestFormX6a746f8e?, PostTaxSettingsResponse>(SdkExecutionRequest(postTaxSettingsMetadata, baseUri, request, listOf(TaxCodecs.POSTTAXSETTINGS_REQUEST_CODEC_ID), emptyList()), TaxCodecs.postTaxSettingsRequestCodecRegistry, PostTaxSettingsResponseDecoder, options)

  /**
   * <p>Creates a Tax Transaction from a calculation, if that calculation hasn’t expired. Calculations expire after 90
   * days.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTaxTransactionsCreateFromCalculationWithResponse(request: InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1, options: CallOptions = CallOptions()): SdkResponseResult<PostTaxTransactionsCreateFromCalculationResponse> = executor.executeWithResponse<InlineV1TaxTransactionsCreateFromCalculationPostRequestFormX8403f3d1, PostTaxTransactionsCreateFromCalculationResponse>(SdkExecutionRequest(postTaxTransactionsCreateFromCalculationMetadata, baseUri, request, listOf(TaxCodecs.POSTTAXTRANSACTIONSCREATEFROMCALCULATION_REQUEST_CODEC_ID), emptyList()), TaxCodecs.postTaxTransactionsCreateFromCalculationRequestCodecRegistry, PostTaxTransactionsCreateFromCalculationResponseDecoder, options)

  /**
   * <p>Partially or fully reverses a previously created <code>Transaction</code>.</p>
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun postTaxTransactionsCreateReversalWithResponse(request: InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492, options: CallOptions = CallOptions()): SdkResponseResult<PostTaxTransactionsCreateReversalResponse> = executor.executeWithResponse<InlineV1TaxTransactionsCreateReversalPostRequestFormX5e009492, PostTaxTransactionsCreateReversalResponse>(SdkExecutionRequest(postTaxTransactionsCreateReversalMetadata, baseUri, request, listOf(TaxCodecs.POSTTAXTRANSACTIONSCREATEREVERSAL_REQUEST_CODEC_ID), emptyList()), TaxCodecs.postTaxTransactionsCreateReversalRequestCodecRegistry, PostTaxTransactionsCreateReversalResponseDecoder, options)

  /**
   * Typed response alternatives for `GetTaxAssociationsFind`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetTaxAssociationsFindResponse {
    public class SuccessJson(
      public val json: TaxAssociation,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxAssociationsFindResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxAssociationsFindResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxAssociationsFindResponse
  }

  private object GetTaxAssociationsFindResponseDecoder : SdkResponseAlternativeDecoder<GetTaxAssociationsFindResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxAssociationsFindResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxAssociationsFindResponse> = when {
      alternative.id == "GetTaxAssociationsFind.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxAssociationsFindResponse.SuccessJson(
          json = TaxCodecs.getTaxAssociationsFindResponseCodecAlternative0Registry.select(listOf("GetTaxAssociationsFind.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxAssociationsFind.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxAssociationsFindResponse.DefaultJson(
          json = TaxCodecs.getTaxAssociationsFindResponseCodecAlternative1Registry.select(listOf("GetTaxAssociationsFind.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxAssociationsFindResponse = GetTaxAssociationsFindResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTaxCalculationsCalculation`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTaxCalculationsCalculationResponse {
    public class SuccessJson(
      public val json: TaxCalculation,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxCalculationsCalculationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxCalculationsCalculationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxCalculationsCalculationResponse
  }

  private object GetTaxCalculationsCalculationResponseDecoder : SdkResponseAlternativeDecoder<GetTaxCalculationsCalculationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxCalculationsCalculationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxCalculationsCalculationResponse> = when {
      alternative.id == "GetTaxCalculationsCalculation.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxCalculationsCalculationResponse.SuccessJson(
          json = TaxCodecs.getTaxCalculationsCalculationResponseCodecAlternative0Registry.select(listOf("GetTaxCalculationsCalculation.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxCalculationsCalculation.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxCalculationsCalculationResponse.DefaultJson(
          json = TaxCodecs.getTaxCalculationsCalculationResponseCodecAlternative1Registry.select(listOf("GetTaxCalculationsCalculation.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxCalculationsCalculationResponse = GetTaxCalculationsCalculationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTaxCalculationsCalculationLineItems`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetTaxCalculationsCalculationLineItemsResponse {
    public class SuccessJson(
      public val json: InlineV1TaxCalculationsLineItemsGetResponse200JsonX30edce5e,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxCalculationsCalculationLineItemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxCalculationsCalculationLineItemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxCalculationsCalculationLineItemsResponse
  }

  private object GetTaxCalculationsCalculationLineItemsResponseDecoder : SdkResponseAlternativeDecoder<GetTaxCalculationsCalculationLineItemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxCalculationsCalculationLineItemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxCalculationsCalculationLineItemsResponse> = when {
      alternative.id == "GetTaxCalculationsCalculationLineItems.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxCalculationsCalculationLineItemsResponse.SuccessJson(
          json = TaxCodecs.getTaxCalculationsCalculationLineItemsResponseCodecAlternative0Registry.select(listOf("GetTaxCalculationsCalculationLineItems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxCalculationsCalculationLineItems.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxCalculationsCalculationLineItemsResponse.DefaultJson(
          json = TaxCodecs.getTaxCalculationsCalculationLineItemsResponseCodecAlternative1Registry.select(listOf("GetTaxCalculationsCalculationLineItems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxCalculationsCalculationLineItemsResponse = GetTaxCalculationsCalculationLineItemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTaxRegistrations`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetTaxRegistrationsResponse {
    public class SuccessJson(
      public val json: InlineV1TaxRegistrationsGetResponse200JsonX6a36c759,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRegistrationsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRegistrationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRegistrationsResponse
  }

  private object GetTaxRegistrationsResponseDecoder : SdkResponseAlternativeDecoder<GetTaxRegistrationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxRegistrationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxRegistrationsResponse> = when {
      alternative.id == "GetTaxRegistrations.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxRegistrationsResponse.SuccessJson(
          json = TaxCodecs.getTaxRegistrationsResponseCodecAlternative0Registry.select(listOf("GetTaxRegistrations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxRegistrations.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxRegistrationsResponse.DefaultJson(
          json = TaxCodecs.getTaxRegistrationsResponseCodecAlternative1Registry.select(listOf("GetTaxRegistrations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxRegistrationsResponse = GetTaxRegistrationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTaxRegistrationsId`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetTaxRegistrationsIdResponse {
    public class SuccessJson(
      public val json: TaxRegistration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRegistrationsIdResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRegistrationsIdResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxRegistrationsIdResponse
  }

  private object GetTaxRegistrationsIdResponseDecoder : SdkResponseAlternativeDecoder<GetTaxRegistrationsIdResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxRegistrationsIdResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxRegistrationsIdResponse> = when {
      alternative.id == "GetTaxRegistrationsId.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxRegistrationsIdResponse.SuccessJson(
          json = TaxCodecs.getTaxRegistrationsIdResponseCodecAlternative0Registry.select(listOf("GetTaxRegistrationsId.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxRegistrationsId.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxRegistrationsIdResponse.DefaultJson(
          json = TaxCodecs.getTaxRegistrationsIdResponseCodecAlternative1Registry.select(listOf("GetTaxRegistrationsId.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxRegistrationsIdResponse = GetTaxRegistrationsIdResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTaxSettings`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetTaxSettingsResponse {
    public class SuccessJson(
      public val json: TaxSettings,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxSettingsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxSettingsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxSettingsResponse
  }

  private object GetTaxSettingsResponseDecoder : SdkResponseAlternativeDecoder<GetTaxSettingsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxSettingsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxSettingsResponse> = when {
      alternative.id == "GetTaxSettings.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxSettingsResponse.SuccessJson(
          json = TaxCodecs.getTaxSettingsResponseCodecAlternative0Registry.select(listOf("GetTaxSettings.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxSettings.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxSettingsResponse.DefaultJson(
          json = TaxCodecs.getTaxSettingsResponseCodecAlternative1Registry.select(listOf("GetTaxSettings.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxSettingsResponse = GetTaxSettingsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTaxTransactionsTransaction`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetTaxTransactionsTransactionResponse {
    public class SuccessJson(
      public val json: TaxTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxTransactionsTransactionResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxTransactionsTransactionResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxTransactionsTransactionResponse
  }

  private object GetTaxTransactionsTransactionResponseDecoder : SdkResponseAlternativeDecoder<GetTaxTransactionsTransactionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxTransactionsTransactionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxTransactionsTransactionResponse> = when {
      alternative.id == "GetTaxTransactionsTransaction.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxTransactionsTransactionResponse.SuccessJson(
          json = TaxCodecs.getTaxTransactionsTransactionResponseCodecAlternative0Registry.select(listOf("GetTaxTransactionsTransaction.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxTransactionsTransaction.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxTransactionsTransactionResponse.DefaultJson(
          json = TaxCodecs.getTaxTransactionsTransactionResponseCodecAlternative1Registry.select(listOf("GetTaxTransactionsTransaction.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxTransactionsTransactionResponse = GetTaxTransactionsTransactionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `GetTaxTransactionsTransactionLineItems`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface GetTaxTransactionsTransactionLineItemsResponse {
    public class SuccessJson(
      public val json: InlineV1TaxTransactionsLineItemsGetResponse200JsonXbcf85478,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxTransactionsTransactionLineItemsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxTransactionsTransactionLineItemsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaxTransactionsTransactionLineItemsResponse
  }

  private object GetTaxTransactionsTransactionLineItemsResponseDecoder : SdkResponseAlternativeDecoder<GetTaxTransactionsTransactionLineItemsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaxTransactionsTransactionLineItemsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaxTransactionsTransactionLineItemsResponse> = when {
      alternative.id == "GetTaxTransactionsTransactionLineItems.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaxTransactionsTransactionLineItemsResponse.SuccessJson(
          json = TaxCodecs.getTaxTransactionsTransactionLineItemsResponseCodecAlternative0Registry.select(listOf("GetTaxTransactionsTransactionLineItems.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "GetTaxTransactionsTransactionLineItems.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaxTransactionsTransactionLineItemsResponse.DefaultJson(
          json = TaxCodecs.getTaxTransactionsTransactionLineItemsResponseCodecAlternative1Registry.select(listOf("GetTaxTransactionsTransactionLineItems.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetTaxTransactionsTransactionLineItemsResponse = GetTaxTransactionsTransactionLineItemsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTaxRegistrations`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface PostTaxRegistrationsResponse {
    public class SuccessJson(
      public val json: TaxRegistration,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxRegistrationsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxRegistrationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxRegistrationsResponse
  }

  private object PostTaxRegistrationsResponseDecoder : SdkResponseAlternativeDecoder<PostTaxRegistrationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTaxRegistrationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTaxRegistrationsResponse> = when {
      alternative.id == "PostTaxRegistrations.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTaxRegistrationsResponse.SuccessJson(
          json = TaxCodecs.postTaxRegistrationsResponseCodecAlternative0Registry.select(listOf("PostTaxRegistrations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTaxRegistrations.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTaxRegistrationsResponse.DefaultJson(
          json = TaxCodecs.postTaxRegistrationsResponseCodecAlternative1Registry.select(listOf("PostTaxRegistrations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTaxRegistrationsResponse = PostTaxRegistrationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTaxSettings`. Non-success alternatives are not converted into success values.
   */
  public sealed interface PostTaxSettingsResponse {
    public class SuccessJson(
      public val json: TaxSettings,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxSettingsResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxSettingsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxSettingsResponse
  }

  private object PostTaxSettingsResponseDecoder : SdkResponseAlternativeDecoder<PostTaxSettingsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTaxSettingsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTaxSettingsResponse> = when {
      alternative.id == "PostTaxSettings.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTaxSettingsResponse.SuccessJson(
          json = TaxCodecs.postTaxSettingsResponseCodecAlternative0Registry.select(listOf("PostTaxSettings.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTaxSettings.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTaxSettingsResponse.DefaultJson(
          json = TaxCodecs.postTaxSettingsResponseCodecAlternative1Registry.select(listOf("PostTaxSettings.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTaxSettingsResponse = PostTaxSettingsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTaxTransactionsCreateFromCalculation`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface PostTaxTransactionsCreateFromCalculationResponse {
    public class SuccessJson(
      public val json: TaxTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxTransactionsCreateFromCalculationResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxTransactionsCreateFromCalculationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxTransactionsCreateFromCalculationResponse
  }

  private object PostTaxTransactionsCreateFromCalculationResponseDecoder : SdkResponseAlternativeDecoder<PostTaxTransactionsCreateFromCalculationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTaxTransactionsCreateFromCalculationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTaxTransactionsCreateFromCalculationResponse> = when {
      alternative.id == "PostTaxTransactionsCreateFromCalculation.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTaxTransactionsCreateFromCalculationResponse.SuccessJson(
          json = TaxCodecs.postTaxTransactionsCreateFromCalculationResponseCodecAlternative0Registry.select(listOf("PostTaxTransactionsCreateFromCalculation.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTaxTransactionsCreateFromCalculation.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTaxTransactionsCreateFromCalculationResponse.DefaultJson(
          json = TaxCodecs.postTaxTransactionsCreateFromCalculationResponseCodecAlternative1Registry.select(listOf("PostTaxTransactionsCreateFromCalculation.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTaxTransactionsCreateFromCalculationResponse = PostTaxTransactionsCreateFromCalculationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `PostTaxTransactionsCreateReversal`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface PostTaxTransactionsCreateReversalResponse {
    public class SuccessJson(
      public val json: TaxTransaction,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxTransactionsCreateReversalResponse

    public class DefaultJson(
      public val json: Error,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxTransactionsCreateReversalResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : PostTaxTransactionsCreateReversalResponse
  }

  private object PostTaxTransactionsCreateReversalResponseDecoder : SdkResponseAlternativeDecoder<PostTaxTransactionsCreateReversalResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): PostTaxTransactionsCreateReversalResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<PostTaxTransactionsCreateReversalResponse> = when {
      alternative.id == "PostTaxTransactionsCreateReversal.response.alternative0" -> SdkResponseDecodeResult(
        value = PostTaxTransactionsCreateReversalResponse.SuccessJson(
          json = TaxCodecs.postTaxTransactionsCreateReversalResponseCodecAlternative0Registry.select(listOf("PostTaxTransactionsCreateReversal.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "PostTaxTransactionsCreateReversal.response.alternative1" -> SdkResponseDecodeResult(
        value = PostTaxTransactionsCreateReversalResponse.DefaultJson(
          json = TaxCodecs.postTaxTransactionsCreateReversalResponseCodecAlternative1Registry.select(listOf("PostTaxTransactionsCreateReversal.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): PostTaxTransactionsCreateReversalResponse = PostTaxTransactionsCreateReversalResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getTaxAssociationsFindMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxAssociationsFind",
          method = "GET",
          path = "/v1/tax/associations/find",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxAssociation",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxAssociationsFind.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxAssociationsFind.response.alternative1",
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

    internal val getTaxCalculationsCalculationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxCalculationsCalculation",
          method = "GET",
          path = "/v1/tax/calculations/{calculation}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxCalculation",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxCalculationsCalculation.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxCalculationsCalculation.response.alternative1",
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

    internal val getTaxCalculationsCalculationLineItemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxCalculationsCalculationLineItems",
          method = "GET",
          path = "/v1/tax/calculations/{calculation}/line_items",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TaxCalculationsLineItemsGetResponse200JsonX30edce5e",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxCalculationsCalculationLineItems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxCalculationsCalculationLineItems.response.alternative1",
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

    internal val getTaxRegistrationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxRegistrations",
          method = "GET",
          path = "/v1/tax/registrations",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TaxRegistrationsGetResponse200JsonX6a36c759",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxRegistrations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxRegistrations.response.alternative1",
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

    internal val getTaxRegistrationsIdMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxRegistrationsId",
          method = "GET",
          path = "/v1/tax/registrations/{id}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxRegistration",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxRegistrationsId.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxRegistrationsId.response.alternative1",
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

    internal val getTaxSettingsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxSettings",
          method = "GET",
          path = "/v1/tax/settings",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxSettings",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxSettings.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxSettings.response.alternative1",
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

    internal val getTaxTransactionsTransactionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxTransactionsTransaction",
          method = "GET",
          path = "/v1/tax/transactions/{transaction}",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxTransactionsTransaction.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxTransactionsTransaction.response.alternative1",
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

    internal val getTaxTransactionsTransactionLineItemsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "GetTaxTransactionsTransactionLineItems",
          method = "GET",
          path = "/v1/tax/transactions/{transaction}/line_items",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineV1TaxTransactionsLineItemsGetResponse200JsonXbcf85478",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxTransactionsTransactionLineItems.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "GetTaxTransactionsTransactionLineItems.response.alternative1",
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

    internal val postTaxRegistrationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTaxRegistrations",
          method = "POST",
          path = "/v1/tax/registrations",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxRegistration",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxRegistrations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxRegistrations.response.alternative1",
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

    internal val postTaxSettingsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTaxSettings",
          method = "POST",
          path = "/v1/tax/settings",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxSettings",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxSettings.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxSettings.response.alternative1",
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

    internal val postTaxTransactionsCreateFromCalculationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTaxTransactionsCreateFromCalculation",
          method = "POST",
          path = "/v1/tax/transactions/create_from_calculation",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxTransactionsCreateFromCalculation.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxTransactionsCreateFromCalculation.response.alternative1",
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

    internal val postTaxTransactionsCreateReversalMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "PostTaxTransactionsCreateReversal",
          method = "POST",
          path = "/v1/tax/transactions/create_reversal",
          requestMediaTypes = listOf("application/x-www-form-urlencoded"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaxTransaction",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxTransactionsCreateReversal.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.Default,
              mediaTypes = listOf("application/json"),
              typeTag = "Error",
              mode = SdkResponseMode.BUFFERED,
              id = "PostTaxTransactionsCreateReversal.response.alternative1",
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
