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

public enum class InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47Branch {
  TerminalConfiguration,
  DeletedTerminalConfiguration,
}

public sealed class InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47NoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47DecodingException(message)

internal data class InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47Inspection(
  public val matchesTerminalConfiguration: Boolean,
  public val matchesDeletedTerminalConfiguration: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTerminalConfiguration, matchesDeletedTerminalConfiguration).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/get/responses/200/content/applica
 * tion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/get/responses/200/content/applica
 * tion~1json/schema
 */
@Serializable(with = InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47.Serializer::class)
public class InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47Inspection,
) {
  public val terminalConfiguration: TerminalConfigurationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTerminalConfiguration) json.decodeFromJsonElement<TerminalConfigurationView>(raw) else null }

  public val deletedTerminalConfiguration: DeletedTerminalConfigurationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedTerminalConfiguration) json.decodeFromJsonElement<DeletedTerminalConfigurationView>(raw) else null }

  public val matchedBranches: Set<InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47Branch>
    get() = buildSet {
      if (inspection.matchesTerminalConfiguration) add(InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47Branch.TerminalConfiguration)
      if (inspection.matchesDeletedTerminalConfiguration) add(InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47Branch.DeletedTerminalConfiguration)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47 {
      val inspection = inspectInlineV1TerminalConfigurationsGetResponse200JsonX54c87e47(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47NoMatchException("InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsGetResponse200JsonX54c87e47(element: JsonElement): InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47Inspection {
  val raw = element as? JsonObject ?: return InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47Inspection(
    matchesTerminalConfiguration = false,
    matchesDeletedTerminalConfiguration = false,
    failures = listOf("TerminalConfiguration: expected JSON object", "DeletedTerminalConfiguration: expected JSON object"),
  )
  val matchesTerminalConfiguration = raw["id"].isString() && raw["livemode"] != null && raw["object"] != null
  val matchesDeletedTerminalConfiguration = raw["deleted"] != null && raw["id"].isString() && raw["object"] != null
  return InlineV1TerminalConfigurationsGetResponse200JsonX54c87e47Inspection(
    matchesTerminalConfiguration = matchesTerminalConfiguration,
    matchesDeletedTerminalConfiguration = matchesDeletedTerminalConfiguration,
    failures = buildList {
      if (!matchesTerminalConfiguration) add("TerminalConfiguration: required properties 'id', 'livemode', 'object' do not match their declared types")
      if (!matchesDeletedTerminalConfiguration) add("DeletedTerminalConfiguration: required properties 'deleted', 'id', 'object' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
