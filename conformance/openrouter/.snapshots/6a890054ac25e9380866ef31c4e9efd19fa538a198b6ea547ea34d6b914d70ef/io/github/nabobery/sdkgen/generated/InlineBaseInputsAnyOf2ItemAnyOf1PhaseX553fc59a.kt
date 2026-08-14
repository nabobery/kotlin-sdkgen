package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aBranch {
  InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612,
  InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd,
  Branch3,
}

public sealed class InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aNoMatchException(
  message: String,
) : InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aDecodingException(message)

internal data class InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aInspection(
  public val matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612: Boolean,
  public val matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612, matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/phase.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/phase
 */
@Serializable(with = InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a.Serializer::class)
public class InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aInspection,
) {
  public val inlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612:
      InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612) json.decodeFromJsonElement<InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612>(raw) else null }

  public val inlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd:
      InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd) json.decodeFromJsonElement<InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aBranch>
    get() = buildSet {
      if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612) add(InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aBranch.InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612)
      if (inspection.matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd) add(InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aBranch.InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd)
      if (inspection.matchesBranch3) add(InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aBranch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a {
      val inspection = inspectInlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a(raw)
      if (inspection.matchCount == 0) {
        throw InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aNoMatchException("InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a) {
      encoder.requireJsonEncoder("InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59a(element: JsonElement): InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aInspection {
  val matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612 = element.isJsonDecodable<InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612>()
  val matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd = element.isJsonDecodable<InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineBaseInputsAnyOf2ItemAnyOf1PhaseX553fc59aInspection(
    matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612 = matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612,
    matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd = matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612) add("InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612: value does not match InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf1X8fb63612")
      if (!matchesInlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd) add("InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd: value does not match InlineBaseInputsAnyOf2ItemAnyOf1PhaseAnyOf2Xfa8e24cd")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
