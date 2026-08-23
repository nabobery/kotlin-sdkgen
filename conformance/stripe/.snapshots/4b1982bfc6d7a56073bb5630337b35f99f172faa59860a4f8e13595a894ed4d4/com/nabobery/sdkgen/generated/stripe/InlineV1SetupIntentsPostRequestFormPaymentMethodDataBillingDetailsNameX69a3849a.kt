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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aBranch {
  Branch1,
  InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aNoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aDecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/billing_details/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/billing_details/properties/name
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aBranch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d) add(InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aBranch.InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aNoMatchException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d>()
  return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d) add("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X9d951d0d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
