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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineComponentsSchemasChatRequestPropertiesStopBranch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineComponentsSchemasChatRequestPropertiesStopDecodingException(
  message: String,
) : SerializationException(message)

public class InlineComponentsSchemasChatRequestPropertiesStopNoMatchException(
  message: String,
) : InlineComponentsSchemasChatRequestPropertiesStopDecodingException(message)

internal data class InlineComponentsSchemasChatRequestPropertiesStopInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Stop sequences (up to 4)
 */
@Serializable(with = InlineComponentsSchemasChatRequestPropertiesStop.Serializer::class)
public class InlineComponentsSchemasChatRequestPropertiesStop internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineComponentsSchemasChatRequestPropertiesStopInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json
        .decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json
        .decodeFromJsonElement<List<String>>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json
        .decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineComponentsSchemasChatRequestPropertiesStopBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineComponentsSchemasChatRequestPropertiesStopBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineComponentsSchemasChatRequestPropertiesStopBranch.Branch2)
      if (inspection.matchesBranch3) add(InlineComponentsSchemasChatRequestPropertiesStopBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineComponentsSchemasChatRequestPropertiesStop {
      val inspection = inspectInlineComponentsSchemasChatRequestPropertiesStop(raw)
      if (inspection.matchCount == 0) {
        throw InlineComponentsSchemasChatRequestPropertiesStopNoMatchException("InlineComponentsSchemasChatRequestPropertiesStop " +
          "matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineComponentsSchemasChatRequestPropertiesStop(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatRequestPropertiesStop> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatRequestPropertiesStop {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasChatRequestPropertiesStop")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatRequestPropertiesStop) {
      encoder.requireJsonEncoder("InlineComponentsSchemasChatRequestPropertiesStop").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineComponentsSchemasChatRequestPropertiesStop(element: JsonElement): InlineComponentsSchemasChatRequestPropertiesStopInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 4 } == true
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineComponentsSchemasChatRequestPropertiesStopInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
