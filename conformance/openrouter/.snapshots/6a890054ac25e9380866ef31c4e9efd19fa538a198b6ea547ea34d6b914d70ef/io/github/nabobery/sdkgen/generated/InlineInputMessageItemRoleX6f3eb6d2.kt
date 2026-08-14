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

public enum class InlineInputMessageItemRoleX6f3eb6d2Branch {
  InlineInputMessageItemRoleAnyOf1X4ce025c6,
  InlineInputMessageItemRoleAnyOf2X91802460,
  InlineInputMessageItemRoleAnyOf3X339f9235,
}

public sealed class InlineInputMessageItemRoleX6f3eb6d2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInputMessageItemRoleX6f3eb6d2NoMatchException(
  message: String,
) : InlineInputMessageItemRoleX6f3eb6d2DecodingException(message)

internal data class InlineInputMessageItemRoleX6f3eb6d2Inspection(
  public val matchesInlineInputMessageItemRoleAnyOf1X4ce025c6: Boolean,
  public val matchesInlineInputMessageItemRoleAnyOf2X91802460: Boolean,
  public val matchesInlineInputMessageItemRoleAnyOf3X339f9235: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineInputMessageItemRoleAnyOf1X4ce025c6, matchesInlineInputMessageItemRoleAnyOf2X91802460, matchesInlineInputMessageItemRoleAnyOf3X339f9235).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/role
 */
@Serializable(with = InlineInputMessageItemRoleX6f3eb6d2.Serializer::class)
public class InlineInputMessageItemRoleX6f3eb6d2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInputMessageItemRoleX6f3eb6d2Inspection,
) {
  public val inlineInputMessageItemRoleAnyOf1X4ce025c6: InlineInputMessageItemRoleAnyOf1X4ce025c6?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineInputMessageItemRoleAnyOf1X4ce025c6) json.decodeFromJsonElement<InlineInputMessageItemRoleAnyOf1X4ce025c6>(raw) else null }

  public val inlineInputMessageItemRoleAnyOf2X91802460: InlineInputMessageItemRoleAnyOf2X91802460?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineInputMessageItemRoleAnyOf2X91802460) json.decodeFromJsonElement<InlineInputMessageItemRoleAnyOf2X91802460>(raw) else null }

  public val inlineInputMessageItemRoleAnyOf3X339f9235: InlineInputMessageItemRoleAnyOf3X339f9235?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineInputMessageItemRoleAnyOf3X339f9235) json.decodeFromJsonElement<InlineInputMessageItemRoleAnyOf3X339f9235>(raw) else null }

  public val matchedBranches: Set<InlineInputMessageItemRoleX6f3eb6d2Branch>
    get() = buildSet {
      if (inspection.matchesInlineInputMessageItemRoleAnyOf1X4ce025c6) add(InlineInputMessageItemRoleX6f3eb6d2Branch.InlineInputMessageItemRoleAnyOf1X4ce025c6)
      if (inspection.matchesInlineInputMessageItemRoleAnyOf2X91802460) add(InlineInputMessageItemRoleX6f3eb6d2Branch.InlineInputMessageItemRoleAnyOf2X91802460)
      if (inspection.matchesInlineInputMessageItemRoleAnyOf3X339f9235) add(InlineInputMessageItemRoleX6f3eb6d2Branch.InlineInputMessageItemRoleAnyOf3X339f9235)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInputMessageItemRoleX6f3eb6d2 {
      val inspection = inspectInlineInputMessageItemRoleX6f3eb6d2(raw)
      if (inspection.matchCount == 0) {
        throw InlineInputMessageItemRoleX6f3eb6d2NoMatchException("InlineInputMessageItemRoleX6f3eb6d2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInputMessageItemRoleX6f3eb6d2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInputMessageItemRoleX6f3eb6d2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInputMessageItemRoleX6f3eb6d2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInputMessageItemRoleX6f3eb6d2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInputMessageItemRoleX6f3eb6d2) {
      encoder.requireJsonEncoder("InlineInputMessageItemRoleX6f3eb6d2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInputMessageItemRoleX6f3eb6d2(element: JsonElement): InlineInputMessageItemRoleX6f3eb6d2Inspection {
  val matchesInlineInputMessageItemRoleAnyOf1X4ce025c6 = element.isJsonDecodable<InlineInputMessageItemRoleAnyOf1X4ce025c6>()
  val matchesInlineInputMessageItemRoleAnyOf2X91802460 = element.isJsonDecodable<InlineInputMessageItemRoleAnyOf2X91802460>()
  val matchesInlineInputMessageItemRoleAnyOf3X339f9235 = element.isJsonDecodable<InlineInputMessageItemRoleAnyOf3X339f9235>()
  return InlineInputMessageItemRoleX6f3eb6d2Inspection(
    matchesInlineInputMessageItemRoleAnyOf1X4ce025c6 = matchesInlineInputMessageItemRoleAnyOf1X4ce025c6,
    matchesInlineInputMessageItemRoleAnyOf2X91802460 = matchesInlineInputMessageItemRoleAnyOf2X91802460,
    matchesInlineInputMessageItemRoleAnyOf3X339f9235 = matchesInlineInputMessageItemRoleAnyOf3X339f9235,
    failures = buildList {
      if (!matchesInlineInputMessageItemRoleAnyOf1X4ce025c6) add("InlineInputMessageItemRoleAnyOf1X4ce025c6: value does not match InlineInputMessageItemRoleAnyOf1X4ce025c6")
      if (!matchesInlineInputMessageItemRoleAnyOf2X91802460) add("InlineInputMessageItemRoleAnyOf2X91802460: value does not match InlineInputMessageItemRoleAnyOf2X91802460")
      if (!matchesInlineInputMessageItemRoleAnyOf3X339f9235) add("InlineInputMessageItemRoleAnyOf3X339f9235: value does not match InlineInputMessageItemRoleAnyOf3X339f9235")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
