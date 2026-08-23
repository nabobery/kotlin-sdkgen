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
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/12/schema/items.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/12/schema/items
 */
@Serializable(with = InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7.Serializer::class)
public class InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7(
  public val amountRefunded: Int? = null,
  public val paymentRecordRefund:
      InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41? = null,
  public val refund: String? = null,
  public val type: InlineV1CreditNotesPreviewGetParameterItemTypeX83dac0bb? = null,
) {
  public class Builder {
    public var amountRefunded: Int? = null

    public var paymentRecordRefund:
        InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41? = null

    public var refund: String? = null

    public var type: InlineV1CreditNotesPreviewGetParameterItemTypeX83dac0bb? = null

    public fun build(): InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7 = InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7(
      amountRefunded = amountRefunded,
      paymentRecordRefund = paymentRecordRefund,
      refund = refund,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7 must be a JSON object")
      return InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7(
        amountRefunded = rawObject["amount_refunded"]?.let { json.decodeFromJsonElement<Int>(it) },
        paymentRecordRefund = rawObject["payment_record_refund"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41>(it) },
        refund = rawObject["refund"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPreviewGetParameterItemTypeX83dac0bb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amountRefunded?.let { put("amount_refunded", json.encodeToJsonElement(it)) }
        value.paymentRecordRefund?.let { put("payment_record_refund", json.encodeToJsonElement(it)) }
        value.refund?.let { put("refund", it) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7(block: InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7.Builder.() -> Unit): InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7 = InlineV1CreditNotesPreviewGetParameterItemXf4c6dcc7.build(block)
