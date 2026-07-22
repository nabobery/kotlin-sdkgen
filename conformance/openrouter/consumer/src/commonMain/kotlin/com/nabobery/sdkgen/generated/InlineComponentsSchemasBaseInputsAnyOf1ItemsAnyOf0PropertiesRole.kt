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

public enum class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleBranch {
  InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0,
  InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1,
  InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2,
  InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3,
}

public sealed class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleNoMatchException(
  message: String,
) : InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleDecodingException(message)

internal data class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleInspection(
  public val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0: Boolean,
  public val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1: Boolean,
  public val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2: Boolean,
  public val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0,
      matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1,
        matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2,
          matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/role.
 */
@Serializable(with = InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole.Serializer::class)
public class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleInspection,
) {
  public val inlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0:
      InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0) json
          .decodeFromJsonElement<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0>(raw) else null }

  public val inlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1:
      InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1) json
          .decodeFromJsonElement<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1>(raw) else null }

  public val inlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2:
      InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2) json
          .decodeFromJsonElement<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2>(raw) else null }

  public val inlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3:
      InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3) json
          .decodeFromJsonElement<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleBranch>
    get() = buildSet {
      if (inspection
        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleBranch.InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0)
      if (inspection
        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleBranch.InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1)
      if (inspection
        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleBranch.InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2)
      if (inspection
        .matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3) add(InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleBranch.InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole {
      val inspection = inspectInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleNoMatchException("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole) {
      encoder.requireJsonEncoder("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRole(element: JsonElement): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleInspection {
  val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0 = element
    .isJsonDecodable<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0>()
  val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1>()
  val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2 = element
    .isJsonDecodable<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2>()
  val matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3 = element
    .isJsonDecodable<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3>()
  return InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleInspection(
    matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0 =
      matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0,
    matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1 =
      matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1,
    matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2 =
      matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2,
    matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3 =
      matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3,
    failures = buildList {
      if (!matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0) add("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0: " +
        "value does not match InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf0")
      if (!matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1) add("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1: " +
        "value does not match InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf1")
      if (!matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2) add("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2: " +
        "value does not match InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf2")
      if (!matchesInlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3) add("InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3: " +
        "value does not match InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesRoleAnyOf3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
