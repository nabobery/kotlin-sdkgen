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

public enum class InlineComponentsSchemasEasyInputMessagePropertiesRoleBranch {
  InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0,
  InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1,
  InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2,
  InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3,
}

public sealed class InlineComponentsSchemasEasyInputMessagePropertiesRoleDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasEasyInputMessagePropertiesRoleNoMatchException(
  message: String,
) : InlineComponentsSchemasEasyInputMessagePropertiesRoleDecodingException(message)

internal data class InlineComponentsSchemasEasyInputMessagePropertiesRoleInspection(
  public val matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1: Boolean,
  public val matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2: Boolean,
  public val matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0,
      matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1,
        matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2,
          matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/role.
 */
@Serializable(with = InlineComponentsSchemasEasyInputMessagePropertiesRole.Serializer::class)
public class InlineComponentsSchemasEasyInputMessagePropertiesRole internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasEasyInputMessagePropertiesRoleInspection,
) {
  public val inlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0:
      InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0>(raw) else null }

  public val inlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1:
      InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1>(raw) else null }

  public val inlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2:
      InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2) json
          .decodeFromJsonElement<InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2>(raw) else null }

  public val inlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3:
      InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3) json
          .decodeFromJsonElement<InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasEasyInputMessagePropertiesRoleBranch>
    get() = buildSet {
      if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0) add(InlineComponentsSchemasEasyInputMessagePropertiesRoleBranch.InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0)
      if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1) add(InlineComponentsSchemasEasyInputMessagePropertiesRoleBranch.InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1)
      if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2) add(InlineComponentsSchemasEasyInputMessagePropertiesRoleBranch.InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2)
      if (inspection
        .matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3) add(InlineComponentsSchemasEasyInputMessagePropertiesRoleBranch.InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineComponentsSchemasEasyInputMessagePropertiesRole {
      val inspection = inspectInlineComponentsSchemasEasyInputMessagePropertiesRole(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasEasyInputMessagePropertiesRoleNoMatchException("InlineComponentsSchemasEasyInputMessagePropertiesRole " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasEasyInputMessagePropertiesRole(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasEasyInputMessagePropertiesRole> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasEasyInputMessagePropertiesRole {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasEasyInputMessagePropertiesRole")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasEasyInputMessagePropertiesRole) {
      encoder.requireJsonEncoder("InlineComponentsSchemasEasyInputMessagePropertiesRole").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasEasyInputMessagePropertiesRole(element: JsonElement): InlineComponentsSchemasEasyInputMessagePropertiesRoleInspection {
  val matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0>()
  val matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1>()
  val matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2 = element
    .isJsonDecodable<InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2>()
  val matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3 = element
    .isJsonDecodable<InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3>()
  return InlineComponentsSchemasEasyInputMessagePropertiesRoleInspection(
    matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0 =
      matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0,
    matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1 =
      matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1,
    matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2 =
      matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2,
    matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3 =
      matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3,
    failures = buildList {
      if (!matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0) add("InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0: " +
        "value does not match InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf0")
      if (!matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1) add("InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1: " +
        "value does not match InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf1")
      if (!matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2) add("InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2: " +
        "value does not match InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf2")
      if (!matchesInlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3) add("InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3: " +
        "value does not match InlineComponentsSchemasEasyInputMessagePropertiesRoleAnyOf3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
