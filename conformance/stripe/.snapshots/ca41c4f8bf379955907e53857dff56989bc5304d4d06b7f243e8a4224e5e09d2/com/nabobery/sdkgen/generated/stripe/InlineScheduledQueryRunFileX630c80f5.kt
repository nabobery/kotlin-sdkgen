package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineScheduledQueryRunFileX630c80f5Branch {
  File,
}

public sealed class InlineScheduledQueryRunFileX630c80f5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineScheduledQueryRunFileX630c80f5NoMatchException(
  message: String,
) : InlineScheduledQueryRunFileX630c80f5DecodingException(message)

internal data class InlineScheduledQueryRunFileX630c80f5Inspection(
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesFile).count { it }
}

/**
 * The file object representing the results of the query.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/scheduled_query_run/properties/file
 */
@Serializable(with = InlineScheduledQueryRunFileX630c80f5.Serializer::class)
public class InlineScheduledQueryRunFileX630c80f5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineScheduledQueryRunFileX630c80f5Inspection,
) {
  public val `file`: FileView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<FileView>(raw) else null }

  public val matchedBranches: Set<InlineScheduledQueryRunFileX630c80f5Branch>
    get() = buildSet {
      if (inspection.matchesFile) add(InlineScheduledQueryRunFileX630c80f5Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineScheduledQueryRunFileX630c80f5 {
      val inspection = inspectInlineScheduledQueryRunFileX630c80f5(raw)
      if (inspection.matchCount == 0) {
        throw InlineScheduledQueryRunFileX630c80f5NoMatchException("InlineScheduledQueryRunFileX630c80f5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineScheduledQueryRunFileX630c80f5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineScheduledQueryRunFileX630c80f5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineScheduledQueryRunFileX630c80f5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineScheduledQueryRunFileX630c80f5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineScheduledQueryRunFileX630c80f5) {
      encoder.requireJsonEncoder("InlineScheduledQueryRunFileX630c80f5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineScheduledQueryRunFileX630c80f5(element: JsonElement): InlineScheduledQueryRunFileX630c80f5Inspection {
  val raw = element as? JsonObject ?: return InlineScheduledQueryRunFileX630c80f5Inspection(
    matchesFile = false,
    failures = listOf("File: expected JSON object"),
  )
  val matchesFile = raw["created"] != null && raw["id"].isString() && raw["object"] != null && raw["purpose"] != null && raw["size"] != null
  return InlineScheduledQueryRunFileX630c80f5Inspection(
    matchesFile = matchesFile,
    failures = buildList {
      if (!matchesFile) add("File: required properties 'created', 'id', 'object', 'purpose', 'size' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
