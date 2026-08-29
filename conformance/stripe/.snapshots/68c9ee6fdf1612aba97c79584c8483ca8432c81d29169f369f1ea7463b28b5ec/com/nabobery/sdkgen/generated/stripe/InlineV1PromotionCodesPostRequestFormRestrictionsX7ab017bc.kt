package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Settings that restrict the redemption of the promotion code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/restrictions
 */
@Serializable(with = InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc.Serializer::class)
public class InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc(
  currencyOptions: Map<String, InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX5a327e06>? = null,
  public val firstTimeTransaction: Boolean? = null,
  public val minimumAmount: Int? = null,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val minimumAmountCurrency: String? = null,
) {
  public val currencyOptions:
      Map<String, InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX5a327e06>? =
      currencyOptions?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var currencyOptionsValue:
        Map<String, InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX5a327e06>? =
        null

    public var currencyOptions:
        Map<String, InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX5a327e06>?
      get() = currencyOptionsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        currencyOptionsValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var firstTimeTransaction: Boolean? = null

    public var minimumAmount: Int? = null

    /**
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var minimumAmountCurrency: String? = null

    public fun build(): InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc = InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc(
      currencyOptions = currencyOptions,
      firstTimeTransaction = firstTimeTransaction,
      minimumAmount = minimumAmount,
      minimumAmountCurrency = minimumAmountCurrency,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc must be a JSON object")
      return InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc(
        currencyOptions = rawObject["currency_options"]?.let { json.decodeFromJsonElement<Map<String, InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX5a327e06>>(it) },
        firstTimeTransaction = rawObject["first_time_transaction"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        minimumAmount = rawObject["minimum_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        minimumAmountCurrency = rawObject["minimum_amount_currency"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
        value.firstTimeTransaction?.let { put("first_time_transaction", json.encodeToJsonElement(it)) }
        value.minimumAmount?.let { put("minimum_amount", json.encodeToJsonElement(it)) }
        value.minimumAmountCurrency?.let { put("minimum_amount_currency", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc(block: InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc.Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc = InlineV1PromotionCodesPostRequestFormRestrictionsX7ab017bc.build(block)
