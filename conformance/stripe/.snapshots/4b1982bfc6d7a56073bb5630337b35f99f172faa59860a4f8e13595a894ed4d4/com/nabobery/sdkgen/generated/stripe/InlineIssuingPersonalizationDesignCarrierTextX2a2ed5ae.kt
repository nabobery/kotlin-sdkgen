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

public enum class InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeBranch {
  IssuingPersonalizationDesignCarrierText,
}

public sealed class InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeNoMatchException(
  message: String,
) : InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeDecodingException(message)

internal data class InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeInspection(
  public val matchesIssuingPersonalizationDesignCarrierText: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingPersonalizationDesignCarrierText).count { it }
}

/**
 * Hash containing carrier text, for use with physical bundles that support carrier text.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.personalization_design/properties/carrier_text
 */
@Serializable(with = InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae.Serializer::class)
public class InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeInspection,
) {
  public val issuingPersonalizationDesignCarrierText: IssuingPersonalizationDesignCarrierTextView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingPersonalizationDesignCarrierText) json.decodeFromJsonElement<IssuingPersonalizationDesignCarrierTextView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeBranch>
    get() = buildSet {
      if (inspection.matchesIssuingPersonalizationDesignCarrierText) add(InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeBranch.IssuingPersonalizationDesignCarrierText)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae {
      val inspection = inspectInlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeNoMatchException("InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae) {
      encoder.requireJsonEncoder("InlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingPersonalizationDesignCarrierTextX2a2ed5ae(element: JsonElement): InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeInspection {
  val raw = element as? JsonObject ?: return InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeInspection(
    matchesIssuingPersonalizationDesignCarrierText = false,
    failures = listOf("IssuingPersonalizationDesignCarrierText: expected JSON object"),
  )
  val matchesIssuingPersonalizationDesignCarrierText = true
  return InlineIssuingPersonalizationDesignCarrierTextX2a2ed5aeInspection(
    matchesIssuingPersonalizationDesignCarrierText = matchesIssuingPersonalizationDesignCarrierText,
    failures = buildList {
      if (!matchesIssuingPersonalizationDesignCarrierText) add("IssuingPersonalizationDesignCarrierText: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
