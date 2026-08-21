package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Rules that control spending for this card. Refer to our
 * [documentation](https://docs.stripe.com/issuing/controls/spending-controls) for more details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/spending_controls
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836(
  allowedCardPresences: List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4>? = null,
  allowedCategories: List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX9cddf72d>? = null,
  allowedMerchantCountries: List<String>? = null,
  blockedCardPresences: List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXd64cc629>? = null,
  blockedCategories: List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX09d17ee7>? = null,
  blockedMerchantCountries: List<String>? = null,
  spendingLimits: List<InlineV1IssuingCardsPostRequestFormSpendingControlsSpendingLimitsItemX865c46af>? = null,
) {
  public val allowedCardPresences:
      List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4>? =
      allowedCardPresences?.let { collection0 -> collection0.toList() }

  public val allowedCategories:
      List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX9cddf72d>? =
      allowedCategories?.let { collection0 -> collection0.toList() }

  public val allowedMerchantCountries: List<String>? =
      allowedMerchantCountries?.let { collection0 -> collection0.toList() }

  public val blockedCardPresences:
      List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXd64cc629>? =
      blockedCardPresences?.let { collection0 -> collection0.toList() }

  public val blockedCategories:
      List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX09d17ee7>? =
      blockedCategories?.let { collection0 -> collection0.toList() }

  public val blockedMerchantCountries: List<String>? =
      blockedMerchantCountries?.let { collection0 -> collection0.toList() }

  public val spendingLimits:
      List<InlineV1IssuingCardsPostRequestFormSpendingControlsSpendingLimitsItemX865c46af>? =
      spendingLimits?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var allowedCardPresencesValue:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4>? = null

    public var allowedCardPresences:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4>?
      get() = allowedCardPresencesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedCardPresencesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var allowedCategoriesValue:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX9cddf72d>? = null

    public var allowedCategories:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX9cddf72d>?
      get() = allowedCategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedCategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var allowedMerchantCountriesValue: List<String>? = null

    public var allowedMerchantCountries: List<String>?
      get() = allowedMerchantCountriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedMerchantCountriesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var blockedCardPresencesValue:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXd64cc629>? = null

    public var blockedCardPresences:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXd64cc629>?
      get() = blockedCardPresencesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        blockedCardPresencesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var blockedCategoriesValue:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX09d17ee7>? = null

    public var blockedCategories:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX09d17ee7>?
      get() = blockedCategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        blockedCategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var blockedMerchantCountriesValue: List<String>? = null

    public var blockedMerchantCountries: List<String>?
      get() = blockedMerchantCountriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        blockedMerchantCountriesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var spendingLimitsValue:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsSpendingLimitsItemX865c46af>? = null

    public var spendingLimits:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsSpendingLimitsItemX865c46af>?
      get() = spendingLimitsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        spendingLimitsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836 = InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836(
      allowedCardPresences = allowedCardPresences,
      allowedCategories = allowedCategories,
      allowedMerchantCountries = allowedMerchantCountries,
      blockedCardPresences = blockedCardPresences,
      blockedCategories = blockedCategories,
      blockedMerchantCountries = blockedMerchantCountries,
      spendingLimits = spendingLimits,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836 must be a JSON object")
      return InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836(
        allowedCardPresences = rawObject["allowed_card_presences"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXb0114dc4>>(it) },
        allowedCategories = rawObject["allowed_categories"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX9cddf72d>>(it) },
        allowedMerchantCountries = rawObject["allowed_merchant_countries"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        blockedCardPresences = rawObject["blocked_card_presences"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXd64cc629>>(it) },
        blockedCategories = rawObject["blocked_categories"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX09d17ee7>>(it) },
        blockedMerchantCountries = rawObject["blocked_merchant_countries"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        spendingLimits = rawObject["spending_limits"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardsPostRequestFormSpendingControlsSpendingLimitsItemX865c46af>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowedCardPresences?.let { put("allowed_card_presences", json.encodeToJsonElement(it)) }
        value.allowedCategories?.let { put("allowed_categories", json.encodeToJsonElement(it)) }
        value.allowedMerchantCountries?.let { put("allowed_merchant_countries", json.encodeToJsonElement(it)) }
        value.blockedCardPresences?.let { put("blocked_card_presences", json.encodeToJsonElement(it)) }
        value.blockedCategories?.let { put("blocked_categories", json.encodeToJsonElement(it)) }
        value.blockedMerchantCountries?.let { put("blocked_merchant_countries", json.encodeToJsonElement(it)) }
        value.spendingLimits?.let { put("spending_limits", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836(block: InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836.Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836 = InlineV1IssuingCardsPostRequestFormSpendingControlsXfd59c836.build(block)
