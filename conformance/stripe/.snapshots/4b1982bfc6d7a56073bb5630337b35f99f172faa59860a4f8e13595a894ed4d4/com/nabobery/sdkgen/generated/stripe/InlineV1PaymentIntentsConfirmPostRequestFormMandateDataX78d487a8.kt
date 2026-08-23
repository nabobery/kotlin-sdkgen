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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8Branch {
  InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4,
  InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9,
  InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8NoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8Inspection(
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4, matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9, matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/mandate_data
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8Inspection,
) {
  public val inlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4:
      InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9:
      InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1:
      InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4) add(InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8Branch.InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9) add(InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8Branch.InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1) add(InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8Branch.InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8 {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8NoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8Inspection {
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1>()
  return InlineV1PaymentIntentsConfirmPostRequestFormMandateDataX78d487a8Inspection(
    matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4 = matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9 = matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1 = matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4) add("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4: value does not match InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf1X21ba1da4")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9) add("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9: value does not match InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf2Xcf1080e9")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1) add("InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1: value does not match InlineV1PaymentIntentsConfirmPostRequestFormMandateDataAnyOf3Xadf716f1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
