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

public enum class InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b,
}

public sealed class InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/bacs_debit/anyOf/0/properties/mandate_options/properti
 * es/reference_prefix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/bacs_debit/anyOf/0/properties/mandate_options/properti
 * es/reference_prefix
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b) add(InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2NoMatchException("InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2(element: JsonElement): InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b>()
  return InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xee2c9b8b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
