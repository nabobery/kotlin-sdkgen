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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8Branch {
  Branch1,
  InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8,
}

public sealed class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8NoMatchException(
  message: String,
) : InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8DecodingException(message)

internal data class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/carrier_text/properties/footer_title.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1personalization_designs/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/carrier_text/properties/footer_title
 */
@Serializable(with = InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8.Serializer::class)
public class InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8:
      InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8) json.decodeFromJsonElement<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8>(raw) else null }

  public val matchedBranches:
      Set<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8Branch.Branch1)
      if (inspection.matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8) add(InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8Branch.InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8 {
      val inspection = inspectInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8NoMatchException("InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8) {
      encoder.requireJsonEncoder("InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8(element: JsonElement): InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8 = element.isJsonDecodable<InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8>()
  return InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextFooterTitleXd3e389e8Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8 = matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8) add("InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8: value does not match InlineV1IssuingPersonaliza87d0PostRequestFormCarrierTextAnyOf2X9e6b0ed8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
