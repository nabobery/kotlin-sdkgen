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

public enum class InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597Branch {
  InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44,
  InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4,
  InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b,
}

public sealed class InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597NoMatchException(
  message: String,
) : InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597DecodingException(message)

internal data class InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597Inspection(
  public val matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44: Boolean,
  public val matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4: Boolean,
  public val matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44, matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4, matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/mandate_data
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597Inspection,
) {
  public val inlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44:
      InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44) json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44>(raw) else null }

  public val inlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4:
      InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4) json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4>(raw) else null }

  public val inlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b:
      InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b) json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44) add(InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597Branch.InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44)
      if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4) add(InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597Branch.InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4)
      if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b) add(InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597Branch.InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597 {
      val inspection = inspectInlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597NoMatchException("InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597(element: JsonElement): InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597Inspection {
  val matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44 = element.isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44>()
  val matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4 = element.isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4>()
  val matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b = element.isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b>()
  return InlineV1SetupIntentsConfirmPostRequestFormMandateDataX56a54597Inspection(
    matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44 = matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44,
    matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4 = matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4,
    matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b = matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b,
    failures = buildList {
      if (!matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44) add("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44: value does not match InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf1X66a28f44")
      if (!matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4) add("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4: value does not match InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf2X94e0e8c4")
      if (!matchesInlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b) add("InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b: value does not match InlineV1SetupIntentsConfirmPostRequestFormMandateDataAnyOf3X38b3623b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
