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

public enum class InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eBranch {
  Branch1,
  Refund,
}

public sealed class InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eNoMatchException(
  message: String,
) : InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eDecodingException(message)

internal data class InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eInspection(
  public val matchesBranch1: Boolean,
  public val matchesRefund: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesRefund).count { it }
}

/**
 * Unique identifier for the refund object.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_reader_reader_resource_refund_payment_action/properties/ref
 * und
 */
@Serializable(with = InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e.Serializer::class)
public class InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val refund: Refund? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesRefund) json.decodeFromJsonElement<Refund>(raw) else null }

  public val matchedBranches:
      Set<InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eBranch.Branch1)
      if (inspection.matchesRefund) add(InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eBranch.Refund)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e {
      val inspection = inspectInlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e(raw)
      if (inspection.matchCount == 0) {
        throw InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eNoMatchException("InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e) {
      encoder.requireJsonEncoder("InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899e(element: JsonElement): InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesRefund = element.isJsonDecodable<Refund>()
  return InlineTerminalReaderReaderResourceRefundPaymentActionRefundX0671899eInspection(
    matchesBranch1 = matchesBranch1,
    matchesRefund = matchesRefund,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesRefund) add("Refund: value does not match Refund")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
