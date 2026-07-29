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

public enum class InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892Branch {
  Branch1,
  InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23,
}

public sealed class InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892NoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data/properties/description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_intent_data/properties/description
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23:
      InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892Branch.Branch1)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23) add(InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892Branch.InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892 {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892NoMatchException("InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892(element: JsonElement): InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23 = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23>()
  return InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionXadb7d892Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23 = matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23) add("InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23: value does not match InlineV1PaymentLinksPostRequestFormPaymentIntentDataDescriptionAnyOf2Xdee3ab23")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
