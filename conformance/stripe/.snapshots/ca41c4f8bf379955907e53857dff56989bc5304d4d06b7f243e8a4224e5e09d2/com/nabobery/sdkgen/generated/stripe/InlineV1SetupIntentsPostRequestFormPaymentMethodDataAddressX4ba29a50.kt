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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50Branch {
  InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c,
  InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50NoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50Inspection(
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/billing_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/billing_details/properties/address
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50Inspection,
) {
  public val inlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c) add(InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f) add(InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50 {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50NoMatchException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50Inspection {
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c>()
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f>()
  return InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50Inspection(
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f,
    failures = buildList {
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c) add("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf1X6977456c")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f) add("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X6f55b57f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
