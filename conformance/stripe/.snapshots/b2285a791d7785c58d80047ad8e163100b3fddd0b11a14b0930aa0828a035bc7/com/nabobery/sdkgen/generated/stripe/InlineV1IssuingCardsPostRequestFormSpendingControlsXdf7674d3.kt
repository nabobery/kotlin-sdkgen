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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/spending_controls
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3(
  allowedCardPresences: List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d>? = null,
  allowedCategories: List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX817bb76f>? = null,
  allowedMerchantCountries: List<String>? = null,
  blockedCardPresences: List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415>? = null,
  blockedCategories: List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX89c08340>? = null,
  blockedMerchantCountries: List<String>? = null,
  spendingLimits: List<InlineV1IssuingCardsPostRequestFormSpendingControlsSpendingLimitsItemX26ac1024>? = null,
) {
  public val allowedCardPresences:
      List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d>? =
      allowedCardPresences?.let { collection0 -> collection0.toList() }

  public val allowedCategories:
      List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX817bb76f>? =
      allowedCategories?.let { collection0 -> collection0.toList() }

  public val allowedMerchantCountries: List<String>? =
      allowedMerchantCountries?.let { collection0 -> collection0.toList() }

  public val blockedCardPresences:
      List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415>? =
      blockedCardPresences?.let { collection0 -> collection0.toList() }

  public val blockedCategories:
      List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX89c08340>? =
      blockedCategories?.let { collection0 -> collection0.toList() }

  public val blockedMerchantCountries: List<String>? =
      blockedMerchantCountries?.let { collection0 -> collection0.toList() }

  public val spendingLimits:
      List<InlineV1IssuingCardsPostRequestFormSpendingControlsSpendingLimitsItemX26ac1024>? =
      spendingLimits?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var allowedCardPresencesValue:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d>? = null

    public var allowedCardPresences:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d>?
      get() = allowedCardPresencesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedCardPresencesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var allowedCategoriesValue:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX817bb76f>? = null

    public var allowedCategories:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX817bb76f>?
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
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415>? = null

    public var blockedCardPresences:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415>?
      get() = blockedCardPresencesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        blockedCardPresencesValue = value?.let { collection0 -> collection0.toList() }
      }

    private var blockedCategoriesValue:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX89c08340>? = null

    public var blockedCategories:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX89c08340>?
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
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsSpendingLimitsItemX26ac1024>? = null

    public var spendingLimits:
        List<InlineV1IssuingCardsPostRequestFormSpendingControlsSpendingLimitsItemX26ac1024>?
      get() = spendingLimitsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        spendingLimitsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3 = InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3(
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
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3 must be a JSON object")
      return InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3(
        allowedCardPresences = rawObject["allowed_card_presences"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX75e7ec3d>>(it) },
        allowedCategories = rawObject["allowed_categories"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX817bb76f>>(it) },
        allowedMerchantCountries = rawObject["allowed_merchant_countries"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        blockedCardPresences = rawObject["blocked_card_presences"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemXbdb82415>>(it) },
        blockedCategories = rawObject["blocked_categories"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardsPostRequestFormSpendingControlsItemX89c08340>>(it) },
        blockedMerchantCountries = rawObject["blocked_merchant_countries"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        spendingLimits = rawObject["spending_limits"]?.let { json.decodeFromJsonElement<List<InlineV1IssuingCardsPostRequestFormSpendingControlsSpendingLimitsItemX26ac1024>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3")
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

public fun inlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3(block: InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3.Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3 = InlineV1IssuingCardsPostRequestFormSpendingControlsXdf7674d3.build(block)
