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

public enum class InlineV1TreasuryTransactionsGetParameterXc8ff31eaBranch {
  InlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418,
  Branch2,
}

public sealed class InlineV1TreasuryTransactionsGetParameterXc8ff31eaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TreasuryTransactionsGetParameterXc8ff31eaNoMatchException(
  message: String,
) : InlineV1TreasuryTransactionsGetParameterXc8ff31eaDecodingException(message)

internal data class InlineV1TreasuryTransactionsGetParameterXc8ff31eaInspection(
  public val matchesInlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transactions/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1transactions/get/parameters/0/schema
 */
@Serializable(with = InlineV1TreasuryTransactionsGetParameterXc8ff31ea.Serializer::class)
public class InlineV1TreasuryTransactionsGetParameterXc8ff31ea internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TreasuryTransactionsGetParameterXc8ff31eaInspection,
) {
  public val inlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418:
      InlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418) json.decodeFromJsonElement<InlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1TreasuryTransactionsGetParameterXc8ff31eaBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418) add(InlineV1TreasuryTransactionsGetParameterXc8ff31eaBranch.InlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418)
      if (inspection.matchesBranch2) add(InlineV1TreasuryTransactionsGetParameterXc8ff31eaBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TreasuryTransactionsGetParameterXc8ff31ea {
      val inspection = inspectInlineV1TreasuryTransactionsGetParameterXc8ff31ea(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TreasuryTransactionsGetParameterXc8ff31eaNoMatchException("InlineV1TreasuryTransactionsGetParameterXc8ff31ea matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TreasuryTransactionsGetParameterXc8ff31ea(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryTransactionsGetParameterXc8ff31ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryTransactionsGetParameterXc8ff31ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryTransactionsGetParameterXc8ff31ea")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryTransactionsGetParameterXc8ff31ea) {
      encoder.requireJsonEncoder("InlineV1TreasuryTransactionsGetParameterXc8ff31ea").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TreasuryTransactionsGetParameterXc8ff31ea(element: JsonElement): InlineV1TreasuryTransactionsGetParameterXc8ff31eaInspection {
  val matchesInlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418 = element.isJsonDecodable<InlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1TreasuryTransactionsGetParameterXc8ff31eaInspection(
    matchesInlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418 = matchesInlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418) add("InlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418: value does not match InlineV1TreasuryTransactionsGetParameterAnyOf1X4d368418")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
