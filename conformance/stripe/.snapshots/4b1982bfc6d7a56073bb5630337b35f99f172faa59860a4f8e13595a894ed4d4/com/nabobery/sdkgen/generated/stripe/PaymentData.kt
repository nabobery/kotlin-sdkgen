package com.nabobery.sdkgen.generated.stripe

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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_data
 */
@Serializable(with = PaymentData.Serializer::class)
public class PaymentData(
  /**
   * An arbitrary string attached to the destination payment. Often useful for displaying to users.
   */
  public val description: String? = null,
  metadata: Map<String, String>? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    /**
     * An arbitrary string attached to the destination payment. Often useful for displaying to users.
     */
    public var description: String? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): PaymentData = PaymentData(
      description = description,
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentData {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentData must be a JSON object")
      return PaymentData(
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentData) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.description?.let { put("description", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentData(block: PaymentData.Builder.() -> Unit): PaymentData = PaymentData.build(block)
