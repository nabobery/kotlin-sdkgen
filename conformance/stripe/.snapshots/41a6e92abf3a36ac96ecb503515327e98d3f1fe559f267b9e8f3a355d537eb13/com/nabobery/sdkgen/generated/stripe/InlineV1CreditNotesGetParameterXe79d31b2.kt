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

public enum class InlineV1CreditNotesGetParameterXe79d31b2Branch {
  InlineV1CreditNotesGetParameterAnyOf1X9ef7df65,
  Branch2,
}

public sealed class InlineV1CreditNotesGetParameterXe79d31b2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CreditNotesGetParameterXe79d31b2NoMatchException(
  message: String,
) : InlineV1CreditNotesGetParameterXe79d31b2DecodingException(message)

internal data class InlineV1CreditNotesGetParameterXe79d31b2Inspection(
  public val matchesInlineV1CreditNotesGetParameterAnyOf1X9ef7df65: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CreditNotesGetParameterAnyOf1X9ef7df65, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/get/parameters/0/schema
 */
@Serializable(with = InlineV1CreditNotesGetParameterXe79d31b2.Serializer::class)
public class InlineV1CreditNotesGetParameterXe79d31b2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CreditNotesGetParameterXe79d31b2Inspection,
) {
  public val inlineV1CreditNotesGetParameterAnyOf1X9ef7df65:
      InlineV1CreditNotesGetParameterAnyOf1X9ef7df65? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CreditNotesGetParameterAnyOf1X9ef7df65) json.decodeFromJsonElement<InlineV1CreditNotesGetParameterAnyOf1X9ef7df65>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1CreditNotesGetParameterXe79d31b2Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CreditNotesGetParameterAnyOf1X9ef7df65) add(InlineV1CreditNotesGetParameterXe79d31b2Branch.InlineV1CreditNotesGetParameterAnyOf1X9ef7df65)
      if (inspection.matchesBranch2) add(InlineV1CreditNotesGetParameterXe79d31b2Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CreditNotesGetParameterXe79d31b2 {
      val inspection = inspectInlineV1CreditNotesGetParameterXe79d31b2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CreditNotesGetParameterXe79d31b2NoMatchException("InlineV1CreditNotesGetParameterXe79d31b2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CreditNotesGetParameterXe79d31b2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesGetParameterXe79d31b2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesGetParameterXe79d31b2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesGetParameterXe79d31b2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesGetParameterXe79d31b2) {
      encoder.requireJsonEncoder("InlineV1CreditNotesGetParameterXe79d31b2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CreditNotesGetParameterXe79d31b2(element: JsonElement): InlineV1CreditNotesGetParameterXe79d31b2Inspection {
  val matchesInlineV1CreditNotesGetParameterAnyOf1X9ef7df65 = element.isJsonDecodable<InlineV1CreditNotesGetParameterAnyOf1X9ef7df65>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1CreditNotesGetParameterXe79d31b2Inspection(
    matchesInlineV1CreditNotesGetParameterAnyOf1X9ef7df65 = matchesInlineV1CreditNotesGetParameterAnyOf1X9ef7df65,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CreditNotesGetParameterAnyOf1X9ef7df65) add("InlineV1CreditNotesGetParameterAnyOf1X9ef7df65: value does not match InlineV1CreditNotesGetParameterAnyOf1X9ef7df65")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
