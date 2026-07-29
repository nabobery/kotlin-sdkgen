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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineIssuingCardPersonalizationDesignX4b8db7b9Branch {
  Branch1,
  IssuingPersonalizationDesign,
}

public sealed class InlineIssuingCardPersonalizationDesignX4b8db7b9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardPersonalizationDesignX4b8db7b9NoMatchException(
  message: String,
) : InlineIssuingCardPersonalizationDesignX4b8db7b9DecodingException(message)

internal data class InlineIssuingCardPersonalizationDesignX4b8db7b9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesIssuingPersonalizationDesign: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesIssuingPersonalizationDesign).count { it }
}

/**
 * The personalization design object belonging to this card.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card/properties/personalization_design
 */
@Serializable(with = InlineIssuingCardPersonalizationDesignX4b8db7b9.Serializer::class)
public class InlineIssuingCardPersonalizationDesignX4b8db7b9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardPersonalizationDesignX4b8db7b9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val issuingPersonalizationDesign: IssuingPersonalizationDesign? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingPersonalizationDesign) json.decodeFromJsonElement<IssuingPersonalizationDesign>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardPersonalizationDesignX4b8db7b9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingCardPersonalizationDesignX4b8db7b9Branch.Branch1)
      if (inspection.matchesIssuingPersonalizationDesign) add(InlineIssuingCardPersonalizationDesignX4b8db7b9Branch.IssuingPersonalizationDesign)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardPersonalizationDesignX4b8db7b9 {
      val inspection = inspectInlineIssuingCardPersonalizationDesignX4b8db7b9(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardPersonalizationDesignX4b8db7b9NoMatchException("InlineIssuingCardPersonalizationDesignX4b8db7b9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardPersonalizationDesignX4b8db7b9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardPersonalizationDesignX4b8db7b9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardPersonalizationDesignX4b8db7b9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardPersonalizationDesignX4b8db7b9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardPersonalizationDesignX4b8db7b9) {
      encoder.requireJsonEncoder("InlineIssuingCardPersonalizationDesignX4b8db7b9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardPersonalizationDesignX4b8db7b9(element: JsonElement): InlineIssuingCardPersonalizationDesignX4b8db7b9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesIssuingPersonalizationDesign = element.isJsonDecodable<IssuingPersonalizationDesign>()
  return InlineIssuingCardPersonalizationDesignX4b8db7b9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesIssuingPersonalizationDesign = matchesIssuingPersonalizationDesign,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesIssuingPersonalizationDesign) add("IssuingPersonalizationDesign: value does not match IssuingPersonalizationDesign")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
