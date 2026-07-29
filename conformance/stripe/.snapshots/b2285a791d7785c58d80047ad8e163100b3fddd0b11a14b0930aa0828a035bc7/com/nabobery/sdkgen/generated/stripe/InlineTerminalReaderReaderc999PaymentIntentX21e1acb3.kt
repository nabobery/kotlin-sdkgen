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

public enum class InlineTerminalReaderReaderc999PaymentIntentX21e1acb3Branch {
  Branch1,
  PaymentIntent,
}

public sealed class InlineTerminalReaderReaderc999PaymentIntentX21e1acb3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTerminalReaderReaderc999PaymentIntentX21e1acb3NoMatchException(
  message: String,
) : InlineTerminalReaderReaderc999PaymentIntentX21e1acb3DecodingException(message)

internal data class InlineTerminalReaderReaderc999PaymentIntentX21e1acb3Inspection(
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
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_process_payment_intent_action/proper
 * ties/payment_intent
 */
@Serializable(with = InlineTerminalReaderReaderc999PaymentIntentX21e1acb3.Serializer::class)
public class InlineTerminalReaderReaderc999PaymentIntentX21e1acb3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTerminalReaderReaderc999PaymentIntentX21e1acb3Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentIntent: PaymentIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentIntent) json.decodeFromJsonElement<PaymentIntent>(raw) else null }

  public val matchedBranches: Set<InlineTerminalReaderReaderc999PaymentIntentX21e1acb3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTerminalReaderReaderc999PaymentIntentX21e1acb3Branch.Branch1)
      if (inspection.matchesPaymentIntent) add(InlineTerminalReaderReaderc999PaymentIntentX21e1acb3Branch.PaymentIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTerminalReaderReaderc999PaymentIntentX21e1acb3 {
      val inspection = inspectInlineTerminalReaderReaderc999PaymentIntentX21e1acb3(raw)
      if (inspection.matchCount == 0) {
        throw InlineTerminalReaderReaderc999PaymentIntentX21e1acb3NoMatchException("InlineTerminalReaderReaderc999PaymentIntentX21e1acb3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTerminalReaderReaderc999PaymentIntentX21e1acb3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTerminalReaderReaderc999PaymentIntentX21e1acb3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderc999PaymentIntentX21e1acb3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTerminalReaderReaderc999PaymentIntentX21e1acb3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderc999PaymentIntentX21e1acb3) {
      encoder.requireJsonEncoder("InlineTerminalReaderReaderc999PaymentIntentX21e1acb3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTerminalReaderReaderc999PaymentIntentX21e1acb3(element: JsonElement): InlineTerminalReaderReaderc999PaymentIntentX21e1acb3Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentIntent = element.isJsonDecodable<PaymentIntent>()
  return InlineTerminalReaderReaderc999PaymentIntentX21e1acb3Inspection(
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
