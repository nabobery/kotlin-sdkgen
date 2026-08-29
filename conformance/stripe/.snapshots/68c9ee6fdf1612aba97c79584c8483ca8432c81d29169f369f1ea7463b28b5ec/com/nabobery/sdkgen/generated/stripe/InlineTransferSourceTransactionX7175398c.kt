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

public enum class InlineTransferSourceTransactionX7175398cBranch {
  Branch1,
  Charge,
}

public sealed class InlineTransferSourceTransactionX7175398cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTransferSourceTransactionX7175398cNoMatchException(
  message: String,
) : InlineTransferSourceTransactionX7175398cDecodingException(message)

internal data class InlineTransferSourceTransactionX7175398cInspection(
  public val matchesBranch1: Boolean,
  public val matchesCharge: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * ID of the charge that was used to fund the transfer. If null, the transfer was funded from the available balance.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer/properties/source_transaction
 */
@Serializable(with = InlineTransferSourceTransactionX7175398c.Serializer::class)
public class InlineTransferSourceTransactionX7175398c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTransferSourceTransactionX7175398cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val charge: Charge? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

  public val matchedBranches: Set<InlineTransferSourceTransactionX7175398cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTransferSourceTransactionX7175398cBranch.Branch1)
      if (inspection.matchesCharge) add(InlineTransferSourceTransactionX7175398cBranch.Charge)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTransferSourceTransactionX7175398c {
      val inspection = inspectInlineTransferSourceTransactionX7175398c(raw)
      if (inspection.matchCount == 0) {
        throw InlineTransferSourceTransactionX7175398cNoMatchException("InlineTransferSourceTransactionX7175398c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTransferSourceTransactionX7175398c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTransferSourceTransactionX7175398c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTransferSourceTransactionX7175398c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTransferSourceTransactionX7175398c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTransferSourceTransactionX7175398c) {
      encoder.requireJsonEncoder("InlineTransferSourceTransactionX7175398c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTransferSourceTransactionX7175398c(element: JsonElement): InlineTransferSourceTransactionX7175398cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCharge = element.isJsonDecodable<Charge>()
  return InlineTransferSourceTransactionX7175398cInspection(
    matchesBranch1 = matchesBranch1,
    matchesCharge = matchesCharge,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCharge) add("Charge: value does not match Charge")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
