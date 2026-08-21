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

public enum class InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7,
}

public sealed class InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/statement_descriptor_suffix_kanji.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card/anyOf/0/properties/statement_descriptor_suffix_kanji
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7) add(InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50NoMatchException("InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50(element: JsonElement): InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7>()
  return InlineV1PaymentIntentsPostRequestFormStatementDescriptorSb1afXff4e0e50Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardAnyOf2Xecb903f7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
