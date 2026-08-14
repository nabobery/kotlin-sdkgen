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

public enum class InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4Branch {
  PortalFlowsAfterCompletionRedirect,
}

public sealed class InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4NoMatchException(
  message: String,
) : InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4DecodingException(message)

internal data class InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4Inspection(
  public val matchesPortalFlowsAfterCompletionRedirect: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPortalFlowsAfterCompletionRedirect).count { it }
}

/**
 * Configuration when `after_completion.type=redirect`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow_after_completion/properties/redirect
 */
@Serializable(with = InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4.Serializer::class)
public class InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4Inspection,
) {
  public val portalFlowsAfterCompletionRedirect: PortalFlowsAfterCompletionRedirectView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPortalFlowsAfterCompletionRedirect) json.decodeFromJsonElement<PortalFlowsAfterCompletionRedirectView>(raw) else null }

  public val matchedBranches: Set<InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4Branch>
    get() = buildSet {
      if (inspection.matchesPortalFlowsAfterCompletionRedirect) add(InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4Branch.PortalFlowsAfterCompletionRedirect)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4 {
      val inspection = inspectInlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4(raw)
      if (inspection.matchCount == 0) {
        throw InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4NoMatchException("InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4) {
      encoder.requireJsonEncoder("InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4(element: JsonElement): InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4Inspection {
  val raw = element as? JsonObject ?: return InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4Inspection(
    matchesPortalFlowsAfterCompletionRedirect = false,
    failures = listOf("PortalFlowsAfterCompletionRedirect: expected JSON object"),
  )
  val matchesPortalFlowsAfterCompletionRedirect = raw["return_url"].isString()
  return InlinePortalFlowsFlowAfterCompletionRedirectX0a4a54c4Inspection(
    matchesPortalFlowsAfterCompletionRedirect = matchesPortalFlowsAfterCompletionRedirect,
    failures = buildList {
      if (!matchesPortalFlowsAfterCompletionRedirect) add("PortalFlowsAfterCompletionRedirect: required properties 'return_url' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
