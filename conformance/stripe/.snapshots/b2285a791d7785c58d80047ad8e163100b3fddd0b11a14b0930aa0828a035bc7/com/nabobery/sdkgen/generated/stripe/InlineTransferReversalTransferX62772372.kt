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

public enum class InlineTransferReversalTransferX62772372Branch {
  Branch1,
  Transfer,
}

public sealed class InlineTransferReversalTransferX62772372DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTransferReversalTransferX62772372NoMatchException(
  message: String,
) : InlineTransferReversalTransferX62772372DecodingException(message)

internal data class InlineTransferReversalTransferX62772372Inspection(
  public val matchesBranch1: Boolean,
  public val matchesTransfer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTransfer).count { it }
}

/**
 * ID of the transfer that was reversed.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer_reversal/properties/transfer
 */
@Serializable(with = InlineTransferReversalTransferX62772372.Serializer::class)
public class InlineTransferReversalTransferX62772372 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTransferReversalTransferX62772372Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val transfer: Transfer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTransfer) json.decodeFromJsonElement<Transfer>(raw) else null }

  public val matchedBranches: Set<InlineTransferReversalTransferX62772372Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTransferReversalTransferX62772372Branch.Branch1)
      if (inspection.matchesTransfer) add(InlineTransferReversalTransferX62772372Branch.Transfer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTransferReversalTransferX62772372 {
      val inspection = inspectInlineTransferReversalTransferX62772372(raw)
      if (inspection.matchCount == 0) {
        throw InlineTransferReversalTransferX62772372NoMatchException("InlineTransferReversalTransferX62772372 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTransferReversalTransferX62772372(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTransferReversalTransferX62772372> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTransferReversalTransferX62772372 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTransferReversalTransferX62772372")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTransferReversalTransferX62772372) {
      encoder.requireJsonEncoder("InlineTransferReversalTransferX62772372").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTransferReversalTransferX62772372(element: JsonElement): InlineTransferReversalTransferX62772372Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTransfer = element.isJsonDecodable<Transfer>()
  return InlineTransferReversalTransferX62772372Inspection(
    matchesBranch1 = matchesBranch1,
    matchesTransfer = matchesTransfer,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesTransfer) add("Transfer: value does not match Transfer")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
