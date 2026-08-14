package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/refunds/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/refunds/items
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d.Serializer::class)
public class InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d(
  public val amountRefunded: Int? = null,
  public val paymentRecordRefund:
      InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b? = null,
  public val refund: String? = null,
  public val type: InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4? = null,
) {
  public class Builder {
    public var amountRefunded: Int? = null

    public var paymentRecordRefund:
        InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b? = null

    public var refund: String? = null

    public var type: InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4? = null

    public fun build(): InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d = InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d(
      amountRefunded = amountRefunded,
      paymentRecordRefund = paymentRecordRefund,
      refund = refund,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d must be a JSON object")
      return InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d(
        amountRefunded = rawObject["amount_refunded"]?.let { json.decodeFromJsonElement<Int>(it) },
        paymentRecordRefund = rawObject["payment_record_refund"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPostRequestFormRefundsItemPaymentRecordRefundXda8fb51b>(it) },
        refund = rawObject["refund"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1CreditNotesPostRequestFormRefundsItemTypeXdf1f77f4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d")
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

public fun inlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d(block: InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d.Builder.() -> Unit): InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d = InlineV1CreditNotesPostRequestFormRefundsItemX1217bf2d.build(block)
