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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/12/schema/items/properties/payment_rec
 * ord_refund.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/12/schema/items/properties/payment_rec
 * ord_refund
 */
@Serializable(with = InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41.Serializer::class)
public class InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41(
  public val paymentRecord: String,
  public val refundGroup: String,
) {
  public class Builder {
    private var paymentRecordValue: String? = null

    public var paymentRecord: String
      get() = requireNotNull(paymentRecordValue) { "paymentRecord is required" }
      set(`value`) {
        paymentRecordValue = value
      }

    private var refundGroupValue: String? = null

    public var refundGroup: String
      get() = requireNotNull(refundGroupValue) { "refundGroup is required" }
      set(`value`) {
        refundGroupValue = value
      }

    public fun build(): InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41 {
      check(paymentRecordValue != null) { "paymentRecord is required" }
      check(refundGroupValue != null) { "refundGroup is required" }
      return InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41(
        paymentRecord = paymentRecord,
        refundGroup = refundGroup,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41 must be a JSON object")
      val paymentRecord = json.decodeRequired<String>(rawObject, "payment_record")
      val refundGroup = json.decodeRequired<String>(rawObject, "refund_group")
      return InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41(
        paymentRecord = paymentRecord,
        refundGroup = refundGroup,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_record", value.paymentRecord)
        put("refund_group", value.refundGroup)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41(block: InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41.Builder.() -> Unit): InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41 = InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CreditNotesPreviewGetParameterItemPaymentRecordRefundX37e8cc41 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
