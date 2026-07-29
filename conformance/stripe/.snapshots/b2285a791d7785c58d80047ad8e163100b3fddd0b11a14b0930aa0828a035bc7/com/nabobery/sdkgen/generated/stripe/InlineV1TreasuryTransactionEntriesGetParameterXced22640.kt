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

public enum class InlineV1TreasuryTransactionEntriesGetParameterXced22640Branch {
  InlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2,
  Branch2,
}

public sealed class InlineV1TreasuryTransactionEntriesGetParameterXced22640DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TreasuryTransactionEntriesGetParameterXced22640NoMatchException(
  message: String,
) : InlineV1TreasuryTransactionEntriesGetParameterXced22640DecodingException(message)

internal data class InlineV1TreasuryTransactionEntriesGetParameterXced22640Inspection(
  public val matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transaction_entries/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transaction_entries/get/parameters/1/schema
 */
@Serializable(with = InlineV1TreasuryTransactionEntriesGetParameterXced22640.Serializer::class)
public class InlineV1TreasuryTransactionEntriesGetParameterXced22640 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TreasuryTransactionEntriesGetParameterXced22640Inspection,
) {
  public val inlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2:
      InlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2) json.decodeFromJsonElement<InlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1TreasuryTransactionEntriesGetParameterXced22640Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2) add(InlineV1TreasuryTransactionEntriesGetParameterXced22640Branch.InlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2)
      if (inspection.matchesBranch2) add(InlineV1TreasuryTransactionEntriesGetParameterXced22640Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TreasuryTransactionEntriesGetParameterXced22640 {
      val inspection = inspectInlineV1TreasuryTransactionEntriesGetParameterXced22640(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TreasuryTransactionEntriesGetParameterXced22640NoMatchException("InlineV1TreasuryTransactionEntriesGetParameterXced22640 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TreasuryTransactionEntriesGetParameterXced22640(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TreasuryTransactionEntriesGetParameterXced22640> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryTransactionEntriesGetParameterXced22640 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryTransactionEntriesGetParameterXced22640")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryTransactionEntriesGetParameterXced22640) {
      encoder.requireJsonEncoder("InlineV1TreasuryTransactionEntriesGetParameterXced22640").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TreasuryTransactionEntriesGetParameterXced22640(element: JsonElement): InlineV1TreasuryTransactionEntriesGetParameterXced22640Inspection {
  val matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2 = element.isJsonDecodable<InlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1TreasuryTransactionEntriesGetParameterXced22640Inspection(
    matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2 = matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2) add("InlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2: value does not match InlineV1TreasuryTransactionEntriesGetParameterAnyOf1Xa06f97c2")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
