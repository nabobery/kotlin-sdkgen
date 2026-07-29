package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_lifecycle_conditions
 */
@Serializable(with = IssuingCardLifecycleConditions.Serializer::class)
public class IssuingCardLifecycleConditions(
  /**
   * The card is automatically cancelled when it makes this number of non-zero payment authorizations and transactions.
   * The count includes penny authorizations, but doesn't include non-payment actions, such as authorization advice.
   */
  public val paymentCount: Int,
) {
  public class Builder {
    private var paymentCountValue: Int? = null

    public var paymentCount: Int
      get() = requireNotNull(paymentCountValue) { "paymentCount is required" }
      set(`value`) {
        paymentCountValue = value
      }

    public fun build(): IssuingCardLifecycleConditions {
      check(paymentCountValue != null) { "paymentCount is required" }
      return IssuingCardLifecycleConditions(
        paymentCount = paymentCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardLifecycleConditions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingCardLifecycleConditions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardLifecycleConditions {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardLifecycleConditions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardLifecycleConditions must be a JSON object")
      val paymentCount = json.decodeRequired<Int>(rawObject, "payment_count")
      return IssuingCardLifecycleConditions(
        paymentCount = paymentCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardLifecycleConditions) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardLifecycleConditions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_count", json.encodeToJsonElement(value.paymentCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardLifecycleConditions(block: IssuingCardLifecycleConditions.Builder.() -> Unit): IssuingCardLifecycleConditions = IssuingCardLifecycleConditions.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingCardLifecycleConditions is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
