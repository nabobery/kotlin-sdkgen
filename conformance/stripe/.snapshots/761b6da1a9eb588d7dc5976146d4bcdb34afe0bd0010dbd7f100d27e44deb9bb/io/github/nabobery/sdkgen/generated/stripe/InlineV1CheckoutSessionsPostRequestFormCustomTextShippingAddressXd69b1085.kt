package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085Branch {
  InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113,
  InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085NoMatchException(
  message: String,
) : InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085DecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085Inspection(
  public val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113:
      Boolean,
  public val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113, matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/shipping_address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/shipping_address
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085Inspection,
) {
  public val inlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113:
      InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113>(raw) else null }

  public val inlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305:
      InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113) add(InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085Branch.InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113)
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305) add(InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085Branch.InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085 {
      val inspection = inspectInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085NoMatchException("InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085(element: JsonElement): InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085Inspection {
  val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113 = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113>()
  val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305 = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305>()
  return InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressXd69b1085Inspection(
    matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113 = matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113,
    matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305 = matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305,
    failures = buildList {
      if (!matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113) add("InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113: value does not match InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf1Xf1fc8113")
      if (!matchesInlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305) add("InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305: value does not match InlineV1CheckoutSessionsPostRequestFormCustomTextShippingAddressAnyOf2Xa8b28305")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
