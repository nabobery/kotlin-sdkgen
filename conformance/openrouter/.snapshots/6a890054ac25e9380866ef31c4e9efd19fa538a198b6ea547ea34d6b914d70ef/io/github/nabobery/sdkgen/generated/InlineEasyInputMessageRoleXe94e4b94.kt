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

public enum class InlineEasyInputMessageRoleXe94e4b94Branch {
  InlineEasyInputMessageRoleAnyOf1Xe1aab981,
  InlineEasyInputMessageRoleAnyOf2Xa05aa430,
  InlineEasyInputMessageRoleAnyOf3X2faf5b12,
  InlineEasyInputMessageRoleAnyOf4X2f9e0cf3,
}

public sealed class InlineEasyInputMessageRoleXe94e4b94DecodingException(
  message: String,
) : SerializationException(message)

public class InlineEasyInputMessageRoleXe94e4b94NoMatchException(
  message: String,
) : InlineEasyInputMessageRoleXe94e4b94DecodingException(message)

internal data class InlineEasyInputMessageRoleXe94e4b94Inspection(
  public val matchesInlineEasyInputMessageRoleAnyOf1Xe1aab981: Boolean,
  public val matchesInlineEasyInputMessageRoleAnyOf2Xa05aa430: Boolean,
  public val matchesInlineEasyInputMessageRoleAnyOf3X2faf5b12: Boolean,
  public val matchesInlineEasyInputMessageRoleAnyOf4X2f9e0cf3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineEasyInputMessageRoleAnyOf1Xe1aab981, matchesInlineEasyInputMessageRoleAnyOf2Xa05aa430, matchesInlineEasyInputMessageRoleAnyOf3X2faf5b12, matchesInlineEasyInputMessageRoleAnyOf4X2f9e0cf3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role
 */
@Serializable(with = InlineEasyInputMessageRoleXe94e4b94.Serializer::class)
public class InlineEasyInputMessageRoleXe94e4b94 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineEasyInputMessageRoleXe94e4b94Inspection,
) {
  public val inlineEasyInputMessageRoleAnyOf1Xe1aab981: InlineEasyInputMessageRoleAnyOf1Xe1aab981?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineEasyInputMessageRoleAnyOf1Xe1aab981) json.decodeFromJsonElement<InlineEasyInputMessageRoleAnyOf1Xe1aab981>(raw) else null }

  public val inlineEasyInputMessageRoleAnyOf2Xa05aa430: InlineEasyInputMessageRoleAnyOf2Xa05aa430?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineEasyInputMessageRoleAnyOf2Xa05aa430) json.decodeFromJsonElement<InlineEasyInputMessageRoleAnyOf2Xa05aa430>(raw) else null }

  public val inlineEasyInputMessageRoleAnyOf3X2faf5b12: InlineEasyInputMessageRoleAnyOf3X2faf5b12?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineEasyInputMessageRoleAnyOf3X2faf5b12) json.decodeFromJsonElement<InlineEasyInputMessageRoleAnyOf3X2faf5b12>(raw) else null }

  public val inlineEasyInputMessageRoleAnyOf4X2f9e0cf3: InlineEasyInputMessageRoleAnyOf4X2f9e0cf3?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineEasyInputMessageRoleAnyOf4X2f9e0cf3) json.decodeFromJsonElement<InlineEasyInputMessageRoleAnyOf4X2f9e0cf3>(raw) else null }

  public val matchedBranches: Set<InlineEasyInputMessageRoleXe94e4b94Branch>
    get() = buildSet {
      if (inspection.matchesInlineEasyInputMessageRoleAnyOf1Xe1aab981) add(InlineEasyInputMessageRoleXe94e4b94Branch.InlineEasyInputMessageRoleAnyOf1Xe1aab981)
      if (inspection.matchesInlineEasyInputMessageRoleAnyOf2Xa05aa430) add(InlineEasyInputMessageRoleXe94e4b94Branch.InlineEasyInputMessageRoleAnyOf2Xa05aa430)
      if (inspection.matchesInlineEasyInputMessageRoleAnyOf3X2faf5b12) add(InlineEasyInputMessageRoleXe94e4b94Branch.InlineEasyInputMessageRoleAnyOf3X2faf5b12)
      if (inspection.matchesInlineEasyInputMessageRoleAnyOf4X2f9e0cf3) add(InlineEasyInputMessageRoleXe94e4b94Branch.InlineEasyInputMessageRoleAnyOf4X2f9e0cf3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineEasyInputMessageRoleXe94e4b94 {
      val inspection = inspectInlineEasyInputMessageRoleXe94e4b94(raw)
      if (inspection.matchCount == 0) {
        throw InlineEasyInputMessageRoleXe94e4b94NoMatchException("InlineEasyInputMessageRoleXe94e4b94 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineEasyInputMessageRoleXe94e4b94(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineEasyInputMessageRoleXe94e4b94> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEasyInputMessageRoleXe94e4b94 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEasyInputMessageRoleXe94e4b94")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineEasyInputMessageRoleXe94e4b94) {
      encoder.requireJsonEncoder("InlineEasyInputMessageRoleXe94e4b94").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineEasyInputMessageRoleXe94e4b94(element: JsonElement): InlineEasyInputMessageRoleXe94e4b94Inspection {
  val matchesInlineEasyInputMessageRoleAnyOf1Xe1aab981 = element.isJsonDecodable<InlineEasyInputMessageRoleAnyOf1Xe1aab981>()
  val matchesInlineEasyInputMessageRoleAnyOf2Xa05aa430 = element.isJsonDecodable<InlineEasyInputMessageRoleAnyOf2Xa05aa430>()
  val matchesInlineEasyInputMessageRoleAnyOf3X2faf5b12 = element.isJsonDecodable<InlineEasyInputMessageRoleAnyOf3X2faf5b12>()
  val matchesInlineEasyInputMessageRoleAnyOf4X2f9e0cf3 = element.isJsonDecodable<InlineEasyInputMessageRoleAnyOf4X2f9e0cf3>()
  return InlineEasyInputMessageRoleXe94e4b94Inspection(
    matchesInlineEasyInputMessageRoleAnyOf1Xe1aab981 = matchesInlineEasyInputMessageRoleAnyOf1Xe1aab981,
    matchesInlineEasyInputMessageRoleAnyOf2Xa05aa430 = matchesInlineEasyInputMessageRoleAnyOf2Xa05aa430,
    matchesInlineEasyInputMessageRoleAnyOf3X2faf5b12 = matchesInlineEasyInputMessageRoleAnyOf3X2faf5b12,
    matchesInlineEasyInputMessageRoleAnyOf4X2f9e0cf3 = matchesInlineEasyInputMessageRoleAnyOf4X2f9e0cf3,
    failures = buildList {
      if (!matchesInlineEasyInputMessageRoleAnyOf1Xe1aab981) add("InlineEasyInputMessageRoleAnyOf1Xe1aab981: value does not match InlineEasyInputMessageRoleAnyOf1Xe1aab981")
      if (!matchesInlineEasyInputMessageRoleAnyOf2Xa05aa430) add("InlineEasyInputMessageRoleAnyOf2Xa05aa430: value does not match InlineEasyInputMessageRoleAnyOf2Xa05aa430")
      if (!matchesInlineEasyInputMessageRoleAnyOf3X2faf5b12) add("InlineEasyInputMessageRoleAnyOf3X2faf5b12: value does not match InlineEasyInputMessageRoleAnyOf3X2faf5b12")
      if (!matchesInlineEasyInputMessageRoleAnyOf4X2f9e0cf3) add("InlineEasyInputMessageRoleAnyOf4X2f9e0cf3: value does not match InlineEasyInputMessageRoleAnyOf4X2f9e0cf3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
