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
 * Params for disputes related to Treasury FinancialAccounts
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/treasury
 */
@Serializable(with = InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29.Serializer::class)
public class InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29(
  public val receivedDebit: String,
) {
  public class Builder {
    private var receivedDebitValue: String? = null

    public var receivedDebit: String
      get() = requireNotNull(receivedDebitValue) { "receivedDebit is required" }
      set(`value`) {
        receivedDebitValue = value
      }

    public fun build(): InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29 {
      check(receivedDebitValue != null) { "receivedDebit is required" }
      return InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29(
        receivedDebit = receivedDebit,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29 must be a JSON object")
      val receivedDebit = json.decodeRequired<String>(rawObject, "received_debit")
      return InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29(
        receivedDebit = receivedDebit,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("received_debit", value.receivedDebit)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29(block: InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29.Builder.() -> Unit): InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29 = InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IssuingDisputesPostRequestFormTreasuryX0bce0b29 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
