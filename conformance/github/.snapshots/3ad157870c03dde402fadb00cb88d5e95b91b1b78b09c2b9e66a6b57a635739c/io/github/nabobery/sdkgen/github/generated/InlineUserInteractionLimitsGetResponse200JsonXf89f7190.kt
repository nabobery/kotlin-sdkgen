package io.github.nabobery.sdkgen.github.generated

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

@Serializable
public class InlineUserInteractionLimitsGetResponse200JsonXf89f7190Branch2View()

public enum class InlineUserInteractionLimitsGetResponse200JsonXf89f7190Branch {
  InteractionLimitResponse,
  Branch2,
}

public sealed class InlineUserInteractionLimitsGetResponse200JsonXf89f7190DecodingException(
  message: String,
) : SerializationException(message)

public class InlineUserInteractionLimitsGetResponse200JsonXf89f7190NoMatchException(
  message: String,
) : InlineUserInteractionLimitsGetResponse200JsonXf89f7190DecodingException(message)

internal data class InlineUserInteractionLimitsGetResponse200JsonXf89f7190Inspection(
  public val matchesInteractionLimitResponse: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInteractionLimitResponse, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1user~1interaction-limits/get/responses/200/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1interaction-limits/get/responses/200/content/application~1json/schema
 */
@Serializable(with = InlineUserInteractionLimitsGetResponse200JsonXf89f7190.Serializer::class)
public class InlineUserInteractionLimitsGetResponse200JsonXf89f7190 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineUserInteractionLimitsGetResponse200JsonXf89f7190Inspection,
) {
  public val interactionLimitResponse: InteractionLimitResponseView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInteractionLimitResponse) json.decodeFromJsonElement<InteractionLimitResponseView>(raw) else null }

  public val branch2: InlineUserInteractionLimitsGetResponse200JsonXf89f7190Branch2View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<InlineUserInteractionLimitsGetResponse200JsonXf89f7190Branch2View>(raw) else null }

  public val matchedBranches: Set<InlineUserInteractionLimitsGetResponse200JsonXf89f7190Branch>
    get() = buildSet {
      if (inspection.matchesInteractionLimitResponse) add(InlineUserInteractionLimitsGetResponse200JsonXf89f7190Branch.InteractionLimitResponse)
      if (inspection.matchesBranch2) add(InlineUserInteractionLimitsGetResponse200JsonXf89f7190Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineUserInteractionLimitsGetResponse200JsonXf89f7190 {
      val inspection = inspectInlineUserInteractionLimitsGetResponse200JsonXf89f7190(raw)
      if (inspection.matchCount == 0) {
        throw InlineUserInteractionLimitsGetResponse200JsonXf89f7190NoMatchException("InlineUserInteractionLimitsGetResponse200JsonXf89f7190 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineUserInteractionLimitsGetResponse200JsonXf89f7190(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineUserInteractionLimitsGetResponse200JsonXf89f7190> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserInteractionLimitsGetResponse200JsonXf89f7190 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserInteractionLimitsGetResponse200JsonXf89f7190")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserInteractionLimitsGetResponse200JsonXf89f7190) {
      encoder.requireJsonEncoder("InlineUserInteractionLimitsGetResponse200JsonXf89f7190").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineUserInteractionLimitsGetResponse200JsonXf89f7190(element: JsonElement): InlineUserInteractionLimitsGetResponse200JsonXf89f7190Inspection {
  val raw = element as? JsonObject ?: return InlineUserInteractionLimitsGetResponse200JsonXf89f7190Inspection(
    matchesInteractionLimitResponse = false,
    matchesBranch2 = false,
    failures = listOf("InteractionLimitResponse: expected JSON object", "Branch2: expected JSON object"),
  )
  val matchesInteractionLimitResponse = raw["expires_at"].isString() && raw["limit"] != null && raw["origin"].isString()
  val matchesBranch2 = true
  return InlineUserInteractionLimitsGetResponse200JsonXf89f7190Inspection(
    matchesInteractionLimitResponse = matchesInteractionLimitResponse,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInteractionLimitResponse) add("InteractionLimitResponse: required properties 'expires_at', 'limit', 'origin' do not match their declared types")
      if (!matchesBranch2) add("Branch2: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
