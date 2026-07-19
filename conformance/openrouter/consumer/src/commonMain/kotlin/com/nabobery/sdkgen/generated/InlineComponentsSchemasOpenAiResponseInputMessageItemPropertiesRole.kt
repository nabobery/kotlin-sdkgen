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

public enum class InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleBranch {
  InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0,
  InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1,
  InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2,
}

public sealed class InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleNoMatchException(
  message: String,
) : InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleDecodingException(message)

internal data class InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleInspection(
  public val matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0:
      Boolean,
  public val matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1:
      Boolean,
  public val matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0,
      matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1,
        matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/role.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole.Serializer::class)
public class InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleInspection,
) {
  public val inlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0:
      InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0) json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0>(raw) else null }

  public val inlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1:
      InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1) json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1>(raw) else null }

  public val inlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2:
      InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2) json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleBranch>
    get() = buildSet {
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0) add(InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleBranch.InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1) add(InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleBranch.InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2) add(InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleBranch.InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole {
      val inspection = inspectInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleNoMatchException("InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole) {
      encoder.requireJsonEncoder("InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRole(element: JsonElement): InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleInspection {
  val matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0>()
  val matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1>()
  val matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2 = element
    .isJsonDecodable<InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2>()
  return InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleInspection(
    matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0 =
      matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0,
    matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1 =
      matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1,
    matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2 =
      matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2,
    failures = buildList {
      if (!matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0) add("InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0: " +
        "value does not match InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf0")
      if (!matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1) add("InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1: " +
        "value does not match InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf1")
      if (!matchesInlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2) add("InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2: " +
        "value does not match InlineComponentsSchemasOpenAiResponseInputMessageItemPropertiesRoleAnyOf2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
