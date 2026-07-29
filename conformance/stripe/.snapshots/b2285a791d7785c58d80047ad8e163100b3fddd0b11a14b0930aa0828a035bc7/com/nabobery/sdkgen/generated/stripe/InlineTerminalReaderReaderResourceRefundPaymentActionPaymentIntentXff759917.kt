package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917Branch {
  Branch1,
  PaymentIntent,
}

public sealed class InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917NoMatchException(
  message: String,
) : InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917DecodingException(message)

internal data class InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917Inspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentIntent).count { it }
}

/**
 * Payment intent that is being refunded.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_refund_payment_action/properties/pay
 * ment_intent
 */
@Serializable(with = InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917.Serializer::class)
public class InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentIntent: PaymentIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null }

  public val matchedBranches:
      Set<InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917Branch.Branch1)
      if (inspection.matchesPaymentIntent) add(InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917Branch.PaymentIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917 {
      val inspection = inspectInlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917(raw)
      if (inspection.matchCount == 0) {
        throw InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917NoMatchException("InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917) {
      encoder.requireJsonEncoder("InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917(element: JsonElement): InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
  return InlineTerminalReaderReaderResourceRefundPaymentActionPaymentIntentXff759917Inspection(
    matchesBranch1 = matchesBranch1,
    matchesPaymentIntent = matchesPaymentIntent,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPaymentIntent) add("PaymentIntent: value does not match PaymentIntent")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
