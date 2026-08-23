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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_multi_use
 */
@Serializable(with = MandateMultiUse.Serializer::class)
public class MandateMultiUse(
  /**
   * The amount of the payment on a multi use mandate.
   */
  public val amount: Int? = null,
  /**
   * The currency of the payment on a multi use mandate.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
) {
  public class Builder {
    /**
     * The amount of the payment on a multi use mandate.
     */
    public var amount: Int? = null

    /**
     * The currency of the payment on a multi use mandate.
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    public fun build(): MandateMultiUse = MandateMultiUse(
      amount = amount,
      currency = currency,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MandateMultiUse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MandateMultiUse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MandateMultiUse {
      val jsonDecoder = decoder.requireJsonDecoder("MandateMultiUse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MandateMultiUse must be a JSON object")
      return MandateMultiUse(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MandateMultiUse) {
      val jsonEncoder = encoder.requireJsonEncoder("MandateMultiUse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.currency?.let { put("currency", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mandateMultiUse(block: MandateMultiUse.Builder.() -> Unit): MandateMultiUse = MandateMultiUse.build(block)
