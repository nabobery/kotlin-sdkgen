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

public enum class InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7Branch {
  Branch1,
  InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f,
}

public sealed class InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7NoMatchException(
  message: String,
) : InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7DecodingException(message)

internal data class InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details/properties/name
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f:
      InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f) json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7Branch.Branch1)
      if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f) add(InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7Branch.InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7 {
      val inspection = inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7NoMatchException("InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7) {
      encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7(element: JsonElement): InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f = element.isJsonDecodable<InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f>()
  return InlineV1PaymentMethodsPostRequestFormBillingDetailsNameX6027b2c7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f = matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f) add("InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f: value does not match InlineV1PaymentMethodsPostRequestFormBillingDetailsNameAnyOf2X416f394f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
