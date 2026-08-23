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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/expires_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/expires_at
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663Branch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663NoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsExpiresAtXf2bd4663Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X2728b27e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
