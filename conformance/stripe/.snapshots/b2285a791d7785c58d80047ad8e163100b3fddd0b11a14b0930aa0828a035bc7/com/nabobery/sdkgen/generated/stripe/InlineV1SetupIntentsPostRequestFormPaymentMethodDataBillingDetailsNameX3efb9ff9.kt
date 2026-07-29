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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9Branch {
  Branch1,
  InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9NoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/billing_details/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/billing_details/properties/name
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9Branch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031) add(InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9 {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9NoMatchException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031 = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031>()
  return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX3efb9ff9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031 = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031) add("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2Xd5129031")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
