package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class PaypalSellerProtectionView internal constructor(
  @SerialName("dispute_categories")
  public val disputeCategories:
      List<InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29>? = null,
  public val status: InlinePaypalSellerProtectionStatusX8b3cff4a,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/paypal_seller_protection
 */
@Serializable(with = PaypalSellerProtection.Serializer::class)
public class PaypalSellerProtection(
  /**
   * Indicates whether the transaction is eligible for PayPal's seller protection.
   */
  public val status: InlinePaypalSellerProtectionStatusX8b3cff4a,
  disputeCategories: List<InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29>? = null,
) {
  /**
   * An array of conditions that are covered for the transaction, if applicable.
   */
  public val disputeCategories: List<InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29>? =
      disputeCategories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var statusValue: InlinePaypalSellerProtectionStatusX8b3cff4a? = null

    public var status: InlinePaypalSellerProtectionStatusX8b3cff4a
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var disputeCategoriesValue:
        List<InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29>? = null

    /**
     * An array of conditions that are covered for the transaction, if applicable.
     */
    public var disputeCategories: List<InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29>?
      get() = disputeCategoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        disputeCategoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): PaypalSellerProtection {
      check(statusValue != null) { "status is required" }
      return PaypalSellerProtection(
        status = status,
        disputeCategories = disputeCategories,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaypalSellerProtection = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaypalSellerProtection> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaypalSellerProtection {
      val jsonDecoder = decoder.requireJsonDecoder("PaypalSellerProtection")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaypalSellerProtection must be a JSON object")
      val status = json.decodeRequired<InlinePaypalSellerProtectionStatusX8b3cff4a>(rawObject, "status")
      return PaypalSellerProtection(
        status = status,
        disputeCategories = rawObject["dispute_categories"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlinePaypalSellerProtectionDisputeCategoriesItemX3c52ff29>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaypalSellerProtection) {
      val jsonEncoder = encoder.requireJsonEncoder("PaypalSellerProtection")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        value.disputeCategories?.let { put("dispute_categories", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paypalSellerProtection(block: PaypalSellerProtection.Builder.() -> Unit): PaypalSellerProtection = PaypalSellerProtection.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaypalSellerProtection is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
