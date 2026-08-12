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

public enum class InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e,
}

public sealed class InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sepa_debit/anyOf/0/properties/mandate_options/properti
 * es/reference_prefix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sepa_debit/anyOf/0/properties/mandate_options/properti
 * es/reference_prefix
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e) add(InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aNoMatchException("InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a(element: JsonElement): InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e>()
  return InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2X0834bd4e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
