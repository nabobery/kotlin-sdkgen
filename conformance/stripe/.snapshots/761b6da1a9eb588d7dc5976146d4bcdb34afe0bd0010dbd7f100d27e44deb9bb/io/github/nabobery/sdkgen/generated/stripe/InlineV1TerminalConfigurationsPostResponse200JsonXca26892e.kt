package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1TerminalConfigurationsPostResponse200JsonXca26892eBranch {
  TerminalConfiguration,
  DeletedTerminalConfiguration,
}

public sealed class InlineV1TerminalConfigurationsPostResponse200JsonXca26892eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostResponse200JsonXca26892eNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostResponse200JsonXca26892eDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostResponse200JsonXca26892eInspection(
  public val matchesTerminalConfiguration: Boolean,
  public val matchesDeletedTerminalConfiguration: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTerminalConfiguration, matchesDeletedTerminalConfiguration).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/responses/200/content/applic
 * ation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/responses/200/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineV1TerminalConfigurationsPostResponse200JsonXca26892e.Serializer::class)
public class InlineV1TerminalConfigurationsPostResponse200JsonXca26892e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalConfigurationsPostResponse200JsonXca26892eInspection,
) {
  public val terminalConfiguration: TerminalConfigurationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTerminalConfiguration) json.decodeFromJsonElement<TerminalConfigurationView>(raw) else null }

  public val deletedTerminalConfiguration: DeletedTerminalConfigurationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedTerminalConfiguration) json.decodeFromJsonElement<DeletedTerminalConfigurationView>(raw) else null }

  public val matchedBranches: Set<InlineV1TerminalConfigurationsPostResponse200JsonXca26892eBranch>
    get() = buildSet {
      if (inspection.matchesTerminalConfiguration) add(InlineV1TerminalConfigurationsPostResponse200JsonXca26892eBranch.TerminalConfiguration)
      if (inspection.matchesDeletedTerminalConfiguration) add(InlineV1TerminalConfigurationsPostResponse200JsonXca26892eBranch.DeletedTerminalConfiguration)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostResponse200JsonXca26892e {
      val inspection = inspectInlineV1TerminalConfigurationsPostResponse200JsonXca26892e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostResponse200JsonXca26892eNoMatchException("InlineV1TerminalConfigurationsPostResponse200JsonXca26892e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostResponse200JsonXca26892e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostResponse200JsonXca26892e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostResponse200JsonXca26892e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostResponse200JsonXca26892e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostResponse200JsonXca26892e) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostResponse200JsonXca26892e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostResponse200JsonXca26892e(element: JsonElement): InlineV1TerminalConfigurationsPostResponse200JsonXca26892eInspection {
  val raw = element as? JsonObject ?: return InlineV1TerminalConfigurationsPostResponse200JsonXca26892eInspection(
    matchesTerminalConfiguration = false,
    matchesDeletedTerminalConfiguration = false,
    failures = listOf("TerminalConfiguration: expected JSON object", "DeletedTerminalConfiguration: expected JSON object"),
  )
  val matchesTerminalConfiguration = raw["id"].isString() && raw["livemode"] != null && raw["object"] != null
  val matchesDeletedTerminalConfiguration = raw["deleted"] != null && raw["id"].isString() && raw["object"] != null
  return InlineV1TerminalConfigurationsPostResponse200JsonXca26892eInspection(
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
