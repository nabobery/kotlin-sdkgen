package io.github.nabobery.sdkgen.generated

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

public enum class InlineOutputMessageStatusXf8c6547bBranch {
  InlineOutputMessageStatusAnyOf1X07bfa0d6,
  InlineOutputMessageStatusAnyOf2X9196f0c9,
  InlineOutputMessageStatusAnyOf3X812c22f3,
}

public sealed class InlineOutputMessageStatusXf8c6547bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineOutputMessageStatusXf8c6547bNoMatchException(
  message: String,
) : InlineOutputMessageStatusXf8c6547bDecodingException(message)

internal data class InlineOutputMessageStatusXf8c6547bInspection(
  public val matchesInlineOutputMessageStatusAnyOf1X07bfa0d6: Boolean,
  public val matchesInlineOutputMessageStatusAnyOf2X9196f0c9: Boolean,
  public val matchesInlineOutputMessageStatusAnyOf3X812c22f3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineOutputMessageStatusAnyOf1X07bfa0d6, matchesInlineOutputMessageStatusAnyOf2X9196f0c9, matchesInlineOutputMessageStatusAnyOf3X812c22f3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/status
 */
@Serializable(with = InlineOutputMessageStatusXf8c6547b.Serializer::class)
public class InlineOutputMessageStatusXf8c6547b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineOutputMessageStatusXf8c6547bInspection,
) {
  public val inlineOutputMessageStatusAnyOf1X07bfa0d6: InlineOutputMessageStatusAnyOf1X07bfa0d6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOutputMessageStatusAnyOf1X07bfa0d6) json.decodeFromJsonElement<InlineOutputMessageStatusAnyOf1X07bfa0d6>(raw) else null }

  public val inlineOutputMessageStatusAnyOf2X9196f0c9: InlineOutputMessageStatusAnyOf2X9196f0c9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOutputMessageStatusAnyOf2X9196f0c9) json.decodeFromJsonElement<InlineOutputMessageStatusAnyOf2X9196f0c9>(raw) else null }

  public val inlineOutputMessageStatusAnyOf3X812c22f3: InlineOutputMessageStatusAnyOf3X812c22f3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOutputMessageStatusAnyOf3X812c22f3) json.decodeFromJsonElement<InlineOutputMessageStatusAnyOf3X812c22f3>(raw) else null }

  public val matchedBranches: Set<InlineOutputMessageStatusXf8c6547bBranch>
    get() = buildSet {
      if (inspection.matchesInlineOutputMessageStatusAnyOf1X07bfa0d6) add(InlineOutputMessageStatusXf8c6547bBranch.InlineOutputMessageStatusAnyOf1X07bfa0d6)
      if (inspection.matchesInlineOutputMessageStatusAnyOf2X9196f0c9) add(InlineOutputMessageStatusXf8c6547bBranch.InlineOutputMessageStatusAnyOf2X9196f0c9)
      if (inspection.matchesInlineOutputMessageStatusAnyOf3X812c22f3) add(InlineOutputMessageStatusXf8c6547bBranch.InlineOutputMessageStatusAnyOf3X812c22f3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOutputMessageStatusXf8c6547b {
      val inspection = inspectInlineOutputMessageStatusXf8c6547b(raw)
      if (inspection.matchCount == 0) {
        throw InlineOutputMessageStatusXf8c6547bNoMatchException("InlineOutputMessageStatusXf8c6547b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOutputMessageStatusXf8c6547b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMessageStatusXf8c6547b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputMessageStatusXf8c6547b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputMessageStatusXf8c6547b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputMessageStatusXf8c6547b) {
      encoder.requireJsonEncoder("InlineOutputMessageStatusXf8c6547b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOutputMessageStatusXf8c6547b(element: JsonElement): InlineOutputMessageStatusXf8c6547bInspection {
  val matchesInlineOutputMessageStatusAnyOf1X07bfa0d6 = element.isJsonDecodable<InlineOutputMessageStatusAnyOf1X07bfa0d6>()
  val matchesInlineOutputMessageStatusAnyOf2X9196f0c9 = element.isJsonDecodable<InlineOutputMessageStatusAnyOf2X9196f0c9>()
  val matchesInlineOutputMessageStatusAnyOf3X812c22f3 = element.isJsonDecodable<InlineOutputMessageStatusAnyOf3X812c22f3>()
  return InlineOutputMessageStatusXf8c6547bInspection(
    matchesInlineOutputMessageStatusAnyOf1X07bfa0d6 = matchesInlineOutputMessageStatusAnyOf1X07bfa0d6,
    matchesInlineOutputMessageStatusAnyOf2X9196f0c9 = matchesInlineOutputMessageStatusAnyOf2X9196f0c9,
    matchesInlineOutputMessageStatusAnyOf3X812c22f3 = matchesInlineOutputMessageStatusAnyOf3X812c22f3,
    failures = buildList {
      if (!matchesInlineOutputMessageStatusAnyOf1X07bfa0d6) add("InlineOutputMessageStatusAnyOf1X07bfa0d6: value does not match InlineOutputMessageStatusAnyOf1X07bfa0d6")
      if (!matchesInlineOutputMessageStatusAnyOf2X9196f0c9) add("InlineOutputMessageStatusAnyOf2X9196f0c9: value does not match InlineOutputMessageStatusAnyOf2X9196f0c9")
      if (!matchesInlineOutputMessageStatusAnyOf3X812c22f3) add("InlineOutputMessageStatusAnyOf3X812c22f3: value does not match InlineOutputMessageStatusAnyOf3X812c22f3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
