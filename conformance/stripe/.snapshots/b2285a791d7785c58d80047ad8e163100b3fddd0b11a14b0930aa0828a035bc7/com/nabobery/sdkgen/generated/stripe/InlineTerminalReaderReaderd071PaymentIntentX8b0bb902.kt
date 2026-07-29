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

public enum class InlineTerminalReaderReaderd071PaymentIntentX8b0bb902Branch {
  Branch1,
  PaymentIntent,
}

public sealed class InlineTerminalReaderReaderd071PaymentIntentX8b0bb902DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTerminalReaderReaderd071PaymentIntentX8b0bb902NoMatchException(
  message: String,
) : InlineTerminalReaderReaderd071PaymentIntentX8b0bb902DecodingException(message)

internal data class InlineTerminalReaderReaderd071PaymentIntentX8b0bb902Inspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentIntent).count { it }
}

/**
 * Most recent PaymentIntent processed by the reader.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_collect_payment_method_action/proper
 * ties/payment_intent
 */
@Serializable(with = InlineTerminalReaderReaderd071PaymentIntentX8b0bb902.Serializer::class)
public class InlineTerminalReaderReaderd071PaymentIntentX8b0bb902 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTerminalReaderReaderd071PaymentIntentX8b0bb902Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentIntent: PaymentIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null }

  public val matchedBranches: Set<InlineTerminalReaderReaderd071PaymentIntentX8b0bb902Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTerminalReaderReaderd071PaymentIntentX8b0bb902Branch.Branch1)
      if (inspection.matchesPaymentIntent) add(InlineTerminalReaderReaderd071PaymentIntentX8b0bb902Branch.PaymentIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTerminalReaderReaderd071PaymentIntentX8b0bb902 {
      val inspection = inspectInlineTerminalReaderReaderd071PaymentIntentX8b0bb902(raw)
      if (inspection.matchCount == 0) {
        throw InlineTerminalReaderReaderd071PaymentIntentX8b0bb902NoMatchException("InlineTerminalReaderReaderd071PaymentIntentX8b0bb902 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTerminalReaderReaderd071PaymentIntentX8b0bb902(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTerminalReaderReaderd071PaymentIntentX8b0bb902> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderd071PaymentIntentX8b0bb902 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTerminalReaderReaderd071PaymentIntentX8b0bb902")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderd071PaymentIntentX8b0bb902) {
      encoder.requireJsonEncoder("InlineTerminalReaderReaderd071PaymentIntentX8b0bb902").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTerminalReaderReaderd071PaymentIntentX8b0bb902(element: JsonElement): InlineTerminalReaderReaderd071PaymentIntentX8b0bb902Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
  return InlineTerminalReaderReaderd071PaymentIntentX8b0bb902Inspection(
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
