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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/refunds/items/properties/payment_record_refund.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/refunds/items/properties/payment_record_refund
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b.Serializer::class)
public class InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b(
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

    public fun build(): InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b {
      check(paymentRecordValue != null) { "paymentRecord is required" }
      check(refundGroupValue != null) { "refundGroup is required" }
      return InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b(
        paymentRecord = paymentRecord,
        refundGroup = refundGroup,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b must be a JSON object")
      val paymentRecord = json.decodeRequired<String>(rawObject, "payment_record")
      val refundGroup = json.decodeRequired<String>(rawObject, "refund_group")
      return InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b(
        paymentRecord = paymentRecord,
        refundGroup = refundGroup,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_record", value.paymentRecord)
        put("refund_group", value.refundGroup)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b(block: InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b.Builder.() -> Unit): InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b = InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
