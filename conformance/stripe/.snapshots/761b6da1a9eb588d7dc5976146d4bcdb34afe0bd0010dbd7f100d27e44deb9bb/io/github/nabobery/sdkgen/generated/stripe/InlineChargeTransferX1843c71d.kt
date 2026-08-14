package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineChargeTransferX1843c71dBranch {
  Branch1,
  Transfer,
}

public sealed class InlineChargeTransferX1843c71dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargeTransferX1843c71dNoMatchException(
  message: String,
) : InlineChargeTransferX1843c71dDecodingException(message)

internal data class InlineChargeTransferX1843c71dInspection(
  public val matchesBranch1: Boolean,
  public val matchesTransfer: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesTransfer).count { it }
}

/**
 * ID of the transfer to the `destination` account (only applicable if the charge was created using the `destination`
 * parameter).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/transfer
 */
@Serializable(with = InlineChargeTransferX1843c71d.Serializer::class)
public class InlineChargeTransferX1843c71d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargeTransferX1843c71dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val transfer: Transfer? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTransfer) json.decodeFromJsonElement<Transfer>(raw) else null }

  public val matchedBranches: Set<InlineChargeTransferX1843c71dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChargeTransferX1843c71dBranch.Branch1)
      if (inspection.matchesTransfer) add(InlineChargeTransferX1843c71dBranch.Transfer)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargeTransferX1843c71d {
      val inspection = inspectInlineChargeTransferX1843c71d(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargeTransferX1843c71dNoMatchException("InlineChargeTransferX1843c71d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargeTransferX1843c71d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChargeTransferX1843c71d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargeTransferX1843c71d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargeTransferX1843c71d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargeTransferX1843c71d) {
      encoder.requireJsonEncoder("InlineChargeTransferX1843c71d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargeTransferX1843c71d(element: JsonElement): InlineChargeTransferX1843c71dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesTransfer = element.isJsonDecodable<Transfer>()
  return InlineChargeTransferX1843c71dInspection(
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
