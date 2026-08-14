package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_amount
 */
@Serializable(with = BillingCreditGrantsResourceAmount.Serializer::class)
public class BillingCreditGrantsResourceAmount(
  /**
   * The type of this amount. We currently only support `monetary` billing credits.
   */
  public val type: InlineBillingCreditGrantsResourceAmountTypeX1624a5a5,
  /**
   * The monetary amount.
   */
  public val monetary: InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205? = null,
) {
  public class Builder {
    private var typeValue: InlineBillingCreditGrantsResourceAmountTypeX1624a5a5? = null

    public var type: InlineBillingCreditGrantsResourceAmountTypeX1624a5a5
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The monetary amount.
     */
    public var monetary: InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205? = null

    public fun build(): BillingCreditGrantsResourceAmount {
      check(typeValue != null) { "type is required" }
      return BillingCreditGrantsResourceAmount(
        type = type,
        monetary = monetary,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingCreditGrantsResourceAmount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingCreditGrantsResourceAmount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingCreditGrantsResourceAmount {
      val jsonDecoder = decoder.requireJsonDecoder("BillingCreditGrantsResourceAmount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingCreditGrantsResourceAmount must be a JSON object")
      val type = json.decodeRequired<InlineBillingCreditGrantsResourceAmountTypeX1624a5a5>(rawObject, "type")
      return BillingCreditGrantsResourceAmount(
        type = type,
        monetary = rawObject["monetary"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingCreditGrantsResourceAmountMonetaryXfbaca205?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingCreditGrantsResourceAmount) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingCreditGrantsResourceAmount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.monetary?.let { put("monetary", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingCreditGrantsResourceAmount(block: BillingCreditGrantsResourceAmount.Builder.() -> Unit): BillingCreditGrantsResourceAmount = BillingCreditGrantsResourceAmount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingCreditGrantsResourceAmount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
