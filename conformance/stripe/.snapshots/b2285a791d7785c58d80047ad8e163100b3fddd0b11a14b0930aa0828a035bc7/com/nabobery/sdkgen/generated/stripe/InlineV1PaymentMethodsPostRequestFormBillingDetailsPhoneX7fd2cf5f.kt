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

public enum class InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fBranch {
  Branch1,
  InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279,
}

public sealed class InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fNoMatchException(
  message: String,
) : InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fDecodingException(message)

internal data class InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details/properties/phone.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods~1{payment_method}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/billing_details/properties/phone
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279:
      InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279) json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fBranch.Branch1)
      if (inspection.matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279) add(InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fBranch.InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f {
      val inspection = inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fNoMatchException("InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f) {
      encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5f(element: JsonElement): InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279 = element.isJsonDecodable<InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279>()
  return InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneX7fd2cf5fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279 = matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279) add("InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279: value does not match InlineV1PaymentMethodsPostRequestFormBillingDetailsPhoneAnyOf2Xaec68279")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
