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

public enum class InlineIssuingCardLifecycleControlsX2974d4a1Branch {
  IssuingCardLifecycleControls,
}

public sealed class InlineIssuingCardLifecycleControlsX2974d4a1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardLifecycleControlsX2974d4a1NoMatchException(
  message: String,
) : InlineIssuingCardLifecycleControlsX2974d4a1DecodingException(message)

internal data class InlineIssuingCardLifecycleControlsX2974d4a1Inspection(
  public val matchesIssuingCardLifecycleControls: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingCardLifecycleControls).count { it }
}

/**
 * Rules that control the lifecycle of this card, such as automatic cancellation. Refer to our
 * [documentation](/issuing/controls/lifecycle-controls) for more details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card/properties/lifecycle_controls
 */
@Serializable(with = InlineIssuingCardLifecycleControlsX2974d4a1.Serializer::class)
public class InlineIssuingCardLifecycleControlsX2974d4a1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardLifecycleControlsX2974d4a1Inspection,
) {
  public val issuingCardLifecycleControls: IssuingCardLifecycleControlsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardLifecycleControls) json.decodeFromJsonElement<IssuingCardLifecycleControlsView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardLifecycleControlsX2974d4a1Branch>
    get() = buildSet {
      if (inspection.matchesIssuingCardLifecycleControls) add(InlineIssuingCardLifecycleControlsX2974d4a1Branch.IssuingCardLifecycleControls)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardLifecycleControlsX2974d4a1 {
      val inspection = inspectInlineIssuingCardLifecycleControlsX2974d4a1(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardLifecycleControlsX2974d4a1NoMatchException("InlineIssuingCardLifecycleControlsX2974d4a1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardLifecycleControlsX2974d4a1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardLifecycleControlsX2974d4a1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardLifecycleControlsX2974d4a1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardLifecycleControlsX2974d4a1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardLifecycleControlsX2974d4a1) {
      encoder.requireJsonEncoder("InlineIssuingCardLifecycleControlsX2974d4a1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardLifecycleControlsX2974d4a1(element: JsonElement): InlineIssuingCardLifecycleControlsX2974d4a1Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingCardLifecycleControlsX2974d4a1Inspection(
    matchesIssuingCardLifecycleControls = false,
    failures = listOf("IssuingCardLifecycleControls: expected JSON object"),
  )
  val matchesIssuingCardLifecycleControls = raw["cancel_after"] != null
  return InlineIssuingCardLifecycleControlsX2974d4a1Inspection(
    matchesIssuingCardLifecycleControls = matchesIssuingCardLifecycleControls,
    failures = buildList {
      if (!matchesIssuingCardLifecycleControls) add("IssuingCardLifecycleControls: required properties 'cancel_after' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
