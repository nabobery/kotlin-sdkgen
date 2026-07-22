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

public enum class InlineComponentsSchemasInputMessageItemPropertiesRoleBranch {
  InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0,
  InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1,
  InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2,
}

public sealed class InlineComponentsSchemasInputMessageItemPropertiesRoleDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasInputMessageItemPropertiesRoleNoMatchException(
  message: String,
) : InlineComponentsSchemasInputMessageItemPropertiesRoleDecodingException(message)

internal data class InlineComponentsSchemasInputMessageItemPropertiesRoleInspection(
  public val matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1: Boolean,
  public val matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0,
      matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1,
        matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/InputMessageItem/properties/role.
 */
@Serializable(with = InlineComponentsSchemasInputMessageItemPropertiesRole.Serializer::class)
public class InlineComponentsSchemasInputMessageItemPropertiesRole internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasInputMessageItemPropertiesRoleInspection,
) {
  public val inlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0:
      InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0>(raw) else null }

  public val inlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1:
      InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1>(raw) else null }

  public val inlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2:
      InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2) json
          .decodeFromJsonElement<InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasInputMessageItemPropertiesRoleBranch>
    get() = buildSet {
      if (inspection
        .matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0) add(InlineComponentsSchemasInputMessageItemPropertiesRoleBranch.InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0)
      if (inspection
        .matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1) add(InlineComponentsSchemasInputMessageItemPropertiesRoleBranch.InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1)
      if (inspection
        .matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2) add(InlineComponentsSchemasInputMessageItemPropertiesRoleBranch.InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineComponentsSchemasInputMessageItemPropertiesRole {
      val inspection = inspectInlineComponentsSchemasInputMessageItemPropertiesRole(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasInputMessageItemPropertiesRoleNoMatchException("InlineComponentsSchemasInputMessageItemPropertiesRole " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasInputMessageItemPropertiesRole(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputMessageItemPropertiesRole> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputMessageItemPropertiesRole {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasInputMessageItemPropertiesRole")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputMessageItemPropertiesRole) {
      encoder.requireJsonEncoder("InlineComponentsSchemasInputMessageItemPropertiesRole").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasInputMessageItemPropertiesRole(element: JsonElement): InlineComponentsSchemasInputMessageItemPropertiesRoleInspection {
  val matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0>()
  val matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1>()
  val matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2 = element
    .isJsonDecodable<InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2>()
  return InlineComponentsSchemasInputMessageItemPropertiesRoleInspection(
    matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0 =
      matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0,
    matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1 =
      matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1,
    matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2 =
      matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2,
    failures = buildList {
      if (!matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0) add("InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0: " +
        "value does not match InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf0")
      if (!matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1) add("InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1: " +
        "value does not match InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf1")
      if (!matchesInlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2) add("InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2: " +
        "value does not match InlineComponentsSchemasInputMessageItemPropertiesRoleAnyOf2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
