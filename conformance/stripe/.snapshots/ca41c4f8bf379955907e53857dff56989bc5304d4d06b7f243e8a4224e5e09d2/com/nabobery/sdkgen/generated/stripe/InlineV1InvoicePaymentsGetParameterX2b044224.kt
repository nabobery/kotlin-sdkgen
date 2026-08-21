package com.nabobery.sdkgen.generated.stripe

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
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1invoice_payments/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1invoice_payments/get/parameters/5/schema
 */
@Serializable(with = InlineV1InvoicePaymentsGetParameterX2b044224.Serializer::class)
public class InlineV1InvoicePaymentsGetParameterX2b044224(
  public val type: InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19,
  public val paymentIntent: String? = null,
  public val paymentRecord: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19? = null

    public var type: InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var paymentIntent: String? = null

    public var paymentRecord: String? = null

    public fun build(): InlineV1InvoicePaymentsGetParameterX2b044224 {
      check(typeValue != null) { "type is required" }
      return InlineV1InvoicePaymentsGetParameterX2b044224(
        type = type,
        paymentIntent = paymentIntent,
        paymentRecord = paymentRecord,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicePaymentsGetParameterX2b044224 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicePaymentsGetParameterX2b044224> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicePaymentsGetParameterX2b044224 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicePaymentsGetParameterX2b044224")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicePaymentsGetParameterX2b044224 must be a JSON object")
      val type = json.decodeRequired<InlineV1InvoicePaymentsGetParameterTypeX4ee4ad19>(rawObject, "type")
      return InlineV1InvoicePaymentsGetParameterX2b044224(
        type = type,
        paymentIntent = rawObject["payment_intent"]?.let { json.decodeFromJsonElement<String>(it) },
        paymentRecord = rawObject["payment_record"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicePaymentsGetParameterX2b044224) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicePaymentsGetParameterX2b044224")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.paymentIntent?.let { put("payment_intent", it) }
        value.paymentRecord?.let { put("payment_record", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicePaymentsGetParameterX2b044224(block: InlineV1InvoicePaymentsGetParameterX2b044224.Builder.() -> Unit): InlineV1InvoicePaymentsGetParameterX2b044224 = InlineV1InvoicePaymentsGetParameterX2b044224.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicePaymentsGetParameterX2b044224 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
