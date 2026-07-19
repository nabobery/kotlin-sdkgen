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

public enum class InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerBranch {
  Branch1,
  InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1,
}

public sealed class InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerNoMatchException(
  message: String,
) : InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerDecodingException(message)

internal data class InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1)
      .count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/container.
 */
@Serializable(with = InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer.Serializer::class)
public class InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val inlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1:
      InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection
        .matchesInlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1) json























































                                                                                                                        .decodeFromJsonElement<InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1>(raw) else null }

  public val matchedBranches:
      Set<InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerBranch
        .Branch1)
      if (inspection
























































                                                                                                                        .matchesInlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1) add(InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerBranch.InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json =
      SdkJson): InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer {
      val inspection = inspectInlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerNoMatchException("InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer) {
      encoder.requireJsonEncoder("InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer")
        .encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasCodeInterpreterServerToolPropertiesContainer(element: JsonElement): InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1 = element
    .isJsonDecodable<InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1>()
  return InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1 =
      matchesInlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1) add("InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1: " +
        "value does not match InlineComponentsSchemasCodeInterpreterServerToolPropertiesContainerAnyOf1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
