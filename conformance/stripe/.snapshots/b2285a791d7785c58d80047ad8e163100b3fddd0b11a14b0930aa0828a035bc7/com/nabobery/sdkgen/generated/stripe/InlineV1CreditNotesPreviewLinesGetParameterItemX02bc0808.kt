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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/14/schema/items.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview~1lines/get/parameters/14/schema/items
 */
@Serializable(with = InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808.Serializer::class)
public class InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808(
  public val amountRefunded: Int? = null,
  public val paymentRecordRefund:
      InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed? = null,
  public val refund: String? = null,
  public val type: InlineV1CreditNotesPreviewLinesGetParameterItemTypeX8230b043? = null,
) {
  public class Builder {
    public var amountRefunded: Int? = null

    public var paymentRecordRefund:
        InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed? = null

    public var refund: String? = null

    public var type: InlineV1CreditNotesPreviewLinesGetParameterItemTypeX8230b043? = null

    public fun build(): InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808 = InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808(
      amountRefunded = amountRefunded,
      paymentRecordRefund = paymentRecordRefund,
      refund = refund,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808 must be a JSON object")
      return InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808(
        amountRefunded = rawObject["amount_refunded"]?.let { json.decodeFromJsonElement<Int>(it) },
        paymentRecordRefund = rawObject["payment_record_refund"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPreviewLinesGetParameterItemPaymentRecordRefundXd721d2ed>(it) },
        refund = rawObject["refund"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPreviewLinesGetParameterItemTypeX8230b043>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808")
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

public fun inlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808(block: InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808.Builder.() -> Unit): InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808 = InlineV1CreditNotesPreviewLinesGetParameterItemX02bc0808.build(block)
