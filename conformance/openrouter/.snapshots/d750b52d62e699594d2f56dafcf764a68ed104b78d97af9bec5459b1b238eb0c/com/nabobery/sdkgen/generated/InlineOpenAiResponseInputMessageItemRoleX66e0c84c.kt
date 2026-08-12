package com.nabobery.sdkgen.generated

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

public enum class InlineOpenAiResponseInputMessageItemRoleX66e0c84cBranch {
  InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022,
  InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4,
  InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6,
}

public sealed class InlineOpenAiResponseInputMessageItemRoleX66e0c84cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineOpenAiResponseInputMessageItemRoleX66e0c84cNoMatchException(
  message: String,
) : InlineOpenAiResponseInputMessageItemRoleX66e0c84cDecodingException(message)

internal data class InlineOpenAiResponseInputMessageItemRoleX66e0c84cInspection(
  public val matchesInlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022: Boolean,
  public val matchesInlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4: Boolean,
  public val matchesInlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022, matchesInlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4, matchesInlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/role
 */
@Serializable(with = InlineOpenAiResponseInputMessageItemRoleX66e0c84c.Serializer::class)
public class InlineOpenAiResponseInputMessageItemRoleX66e0c84c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineOpenAiResponseInputMessageItemRoleX66e0c84cInspection,
) {
  public val inlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022:
      InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022) json.decodeFromJsonElement<InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022>(raw) else null }

  public val inlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4:
      InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4) json.decodeFromJsonElement<InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4>(raw) else null }

  public val inlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6:
      InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6) json.decodeFromJsonElement<InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6>(raw) else null }

  public val matchedBranches: Set<InlineOpenAiResponseInputMessageItemRoleX66e0c84cBranch>
    get() = buildSet {
      if (inspection.matchesInlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022) add(InlineOpenAiResponseInputMessageItemRoleX66e0c84cBranch.InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022)
      if (inspection.matchesInlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4) add(InlineOpenAiResponseInputMessageItemRoleX66e0c84cBranch.InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4)
      if (inspection.matchesInlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6) add(InlineOpenAiResponseInputMessageItemRoleX66e0c84cBranch.InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOpenAiResponseInputMessageItemRoleX66e0c84c {
      val inspection = inspectInlineOpenAiResponseInputMessageItemRoleX66e0c84c(raw)
      if (inspection.matchCount == 0) {
        throw InlineOpenAiResponseInputMessageItemRoleX66e0c84cNoMatchException("InlineOpenAiResponseInputMessageItemRoleX66e0c84c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOpenAiResponseInputMessageItemRoleX66e0c84c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponseInputMessageItemRoleX66e0c84c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenAiResponseInputMessageItemRoleX66e0c84c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenAiResponseInputMessageItemRoleX66e0c84c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponseInputMessageItemRoleX66e0c84c) {
      encoder.requireJsonEncoder("InlineOpenAiResponseInputMessageItemRoleX66e0c84c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOpenAiResponseInputMessageItemRoleX66e0c84c(element: JsonElement): InlineOpenAiResponseInputMessageItemRoleX66e0c84cInspection {
  val matchesInlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022 = element.isJsonDecodable<InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022>()
  val matchesInlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4 = element.isJsonDecodable<InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4>()
  val matchesInlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6 = element.isJsonDecodable<InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6>()
  return InlineOpenAiResponseInputMessageItemRoleX66e0c84cInspection(
    matchesInlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022 = matchesInlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022,
    matchesInlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4 = matchesInlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4,
    matchesInlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6 = matchesInlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6,
    failures = buildList {
      if (!matchesInlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022) add("InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022: value does not match InlineOpenAiResponseInputMessageItemRoleAnyOf1X5d544022")
      if (!matchesInlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4) add("InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4: value does not match InlineOpenAiResponseInputMessageItemRoleAnyOf2X3c18f9d4")
      if (!matchesInlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6) add("InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6: value does not match InlineOpenAiResponseInputMessageItemRoleAnyOf3Xda9d12b6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
