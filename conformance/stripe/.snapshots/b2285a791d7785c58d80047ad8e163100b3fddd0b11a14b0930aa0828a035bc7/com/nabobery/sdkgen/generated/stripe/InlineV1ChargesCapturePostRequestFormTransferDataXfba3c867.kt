package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * An optional dictionary including the account to automatically transfer to as part of a destination charge. [See the
 * Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1capture/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/transfer_data
 */
@Serializable(with = InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867.Serializer::class)
public class InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867(
  public val amount: Int? = null,
) {
  public class Builder {
    public var amount: Int? = null

    public fun build(): InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867 = InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867(
      amount = amount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867 must be a JSON object")
      return InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesCapturePostRequestFormTransferDataXfba3c867(block: InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867.Builder.() -> Unit): InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867 = InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867.build(block)
