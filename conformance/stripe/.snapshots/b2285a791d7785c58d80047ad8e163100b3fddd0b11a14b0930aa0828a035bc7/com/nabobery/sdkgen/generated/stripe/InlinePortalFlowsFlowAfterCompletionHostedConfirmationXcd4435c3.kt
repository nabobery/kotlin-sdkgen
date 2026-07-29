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

public enum class InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3Branch {
  PortalFlowsAfterCompletionHostedConfirmation,
}

public sealed class InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3NoMatchException(
  message: String,
) : InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3DecodingException(message)

internal data class InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3Inspection(
  public val matchesPortalFlowsAfterCompletionHostedConfirmation: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPortalFlowsAfterCompletionHostedConfirmation).count { it }
}

/**
 * Configuration when `after_completion.type=hosted_confirmation`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/portal_flows_flow_after_completion/properties/hosted_confirmation
 */
@Serializable(with = InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3.Serializer::class)
public class InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3Inspection,
) {
  public val portalFlowsAfterCompletionHostedConfirmation:
      PortalFlowsAfterCompletionHostedConfirmationView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPortalFlowsAfterCompletionHostedConfirmation) json.decodeFromJsonElement<PortalFlowsAfterCompletionHostedConfirmationView>(raw) else null }

  public val matchedBranches:
      Set<InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3Branch>
    get() = buildSet {
      if (inspection.matchesPortalFlowsAfterCompletionHostedConfirmation) add(InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3Branch.PortalFlowsAfterCompletionHostedConfirmation)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3 {
      val inspection = inspectInlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3(raw)
      if (inspection.matchCount == 0) {
        throw InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3NoMatchException("InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3) {
      encoder.requireJsonEncoder("InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3(element: JsonElement): InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3Inspection {
  val raw = element as? JsonObject ?: return InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3Inspection(
    matchesPortalFlowsAfterCompletionHostedConfirmation = false,
    failures = listOf("PortalFlowsAfterCompletionHostedConfirmation: expected JSON object"),
  )
  val matchesPortalFlowsAfterCompletionHostedConfirmation = true
  return InlinePortalFlowsFlowAfterCompletionHostedConfirmationXcd4435c3Inspection(
    matchesPortalFlowsAfterCompletionHostedConfirmation = matchesPortalFlowsAfterCompletionHostedConfirmation,
    failures = buildList {
      if (!matchesPortalFlowsAfterCompletionHostedConfirmation) add("PortalFlowsAfterCompletionHostedConfirmation: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
