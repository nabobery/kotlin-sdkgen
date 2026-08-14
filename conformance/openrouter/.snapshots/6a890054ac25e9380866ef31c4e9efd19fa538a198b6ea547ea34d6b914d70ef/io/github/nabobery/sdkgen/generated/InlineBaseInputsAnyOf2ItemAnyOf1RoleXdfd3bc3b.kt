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

public enum class InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bBranch {
  InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c,
  InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239,
  InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877,
  InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c,
}

public sealed class InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bNoMatchException(
  message: String,
) : InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bDecodingException(message)

internal data class InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bInspection(
  public val matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c: Boolean,
  public val matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239: Boolean,
  public val matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877: Boolean,
  public val matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c, matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239, matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877, matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/role.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/role
 */
@Serializable(with = InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b.Serializer::class)
public class InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bInspection,
) {
  public val inlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c:
      InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c) json.decodeFromJsonElement<InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c>(raw) else null }

  public val inlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239:
      InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239) json.decodeFromJsonElement<InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239>(raw) else null }

  public val inlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877:
      InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877) json.decodeFromJsonElement<InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877>(raw) else null }

  public val inlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c:
      InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c) json.decodeFromJsonElement<InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c>(raw) else null }

  public val matchedBranches: Set<InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bBranch>
    get() = buildSet {
      if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c) add(InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bBranch.InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c)
      if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239) add(InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bBranch.InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239)
      if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877) add(InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bBranch.InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877)
      if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c) add(InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bBranch.InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b {
      val inspection = inspectInlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b(raw)
      if (inspection.matchCount == 0) {
        throw InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bNoMatchException("InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b) {
      encoder.requireJsonEncoder("InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3b(element: JsonElement): InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bInspection {
  val matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c = element.isJsonDecodable<InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c>()
  val matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239 = element.isJsonDecodable<InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239>()
  val matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877 = element.isJsonDecodable<InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877>()
  val matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c = element.isJsonDecodable<InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c>()
  return InlineBaseInputsAnyOf2ItemAnyOf1RoleXdfd3bc3bInspection(
    matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c = matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c,
    matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239 = matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239,
    matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877 = matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877,
    matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c = matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c,
    failures = buildList {
      if (!matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c) add("InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c: value does not match InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf1X1552ef9c")
      if (!matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239) add("InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239: value does not match InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf2Xb1180239")
      if (!matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877) add("InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877: value does not match InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf3X21f4b877")
      if (!matchesInlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c) add("InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c: value does not match InlineBaseInputsAnyOf2ItemAnyOf1RoleAnyOf4X17df7c2c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
