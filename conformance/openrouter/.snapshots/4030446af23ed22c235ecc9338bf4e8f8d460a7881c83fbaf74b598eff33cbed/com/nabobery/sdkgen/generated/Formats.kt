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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class FormatsBranch {
  FormatTextConfig,
  FormatJsonObjectConfig,
  FormatJsonSchemaConfig,
}

public sealed class FormatsDecodingException(
  message: String,
) : SerializationException(message)

public class FormatsNoMatchException(
  message: String,
) : FormatsDecodingException(message)

internal data class FormatsInspection(
  public val matchesFormatTextConfig: Boolean,
  public val matchesFormatJsonObjectConfig: Boolean,
  public val matchesFormatJsonSchemaConfig: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesFormatTextConfig, matchesFormatJsonObjectConfig, matchesFormatJsonSchemaConfig).count { it }
}

/**
 * Text response format configuration
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Formats
 */
@Serializable(with = Formats.Serializer::class)
public class Formats internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: FormatsInspection,
) {
  public val formatTextConfig: FormatTextConfigView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFormatTextConfig) json.decodeFromJsonElement<FormatTextConfigView>(raw) else null }

  public val formatJsonObjectConfig: FormatJsonObjectConfigView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFormatJsonObjectConfig) json.decodeFromJsonElement<FormatJsonObjectConfigView>(raw) else null }

  public val formatJsonSchemaConfig: FormatJsonSchemaConfigView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFormatJsonSchemaConfig) json.decodeFromJsonElement<FormatJsonSchemaConfigView>(raw) else null }

  public val matchedBranches: Set<FormatsBranch>
    get() = buildSet {
      if (inspection.matchesFormatTextConfig) add(FormatsBranch.FormatTextConfig)
      if (inspection.matchesFormatJsonObjectConfig) add(FormatsBranch.FormatJsonObjectConfig)
      if (inspection.matchesFormatJsonSchemaConfig) add(FormatsBranch.FormatJsonSchemaConfig)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): Formats {
      val inspection = inspectFormats(raw)
      if (inspection.matchCount == 0) {
        throw FormatsNoMatchException("Formats matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return Formats(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<Formats> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Formats {
      val jsonDecoder = decoder.requireJsonDecoder("Formats")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: Formats) {
      encoder.requireJsonEncoder("Formats").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectFormats(element: JsonElement): FormatsInspection {
  val raw = element as? JsonObject ?: return FormatsInspection(
    matchesFormatTextConfig = false,
    matchesFormatJsonObjectConfig = false,
    matchesFormatJsonSchemaConfig = false,
    failures = listOf("FormatTextConfig: expected JSON object", "FormatJsonObjectConfig: expected JSON object", "FormatJsonSchemaConfig: expected JSON object"),
  )
  val matchesFormatTextConfig = raw["type"] != null
  val matchesFormatJsonObjectConfig = raw["type"] != null
  val matchesFormatJsonSchemaConfig = raw["name"].isString() && raw["schema"] != null && raw["type"] != null
  return FormatsInspection(
    matchesFormatTextConfig = matchesFormatTextConfig,
    matchesFormatJsonObjectConfig = matchesFormatJsonObjectConfig,
    matchesFormatJsonSchemaConfig = matchesFormatJsonSchemaConfig,
    failures = buildList {
      if (!matchesFormatTextConfig) add("FormatTextConfig: required properties 'type' do not match their declared types")
      if (!matchesFormatJsonObjectConfig) add("FormatJsonObjectConfig: required properties 'type' do not match their declared types")
      if (!matchesFormatJsonSchemaConfig) add("FormatJsonSchemaConfig: required properties 'name', 'schema', 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
